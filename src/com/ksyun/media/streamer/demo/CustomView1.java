package com.ksyun.media.streamer.demo;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TODO: document your custom view class.
 */
public class CustomView1 extends View {

    private TextPaint mFocusPaint;
    //private ArrayList<PointF> graphics = new ArrayList<PointF>();
    //PointF point;
    private int width;
    private int width2;
    private int index;
    private String txtLeft;
    private String txtRight;
    private Context mContext;
    private String mTxtTmp;
    RequestQueue mRequestQueue;
    private String mTitle="";
    private String mPrize="";
    private String mBarrage="";
    //private String mTxtStr = "FB推流测试：逐行替换文字测试。1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20";
    public CustomView1(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public CustomView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    private void init() {

        index = 0;

        mFocusPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        mRequestQueue = Volley.newRequestQueue(mContext);

        timer.schedule(task,2,2000);
        timer.schedule(webTask,1,500);
    }


    public static int px2dp(Context context, float pxValue) {
        return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, pxValue, context.getResources().getDisplayMetrics());
    }
    public static int px2sp(Context context, float pxValue) {
        return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, pxValue, context.getResources().getDisplayMetrics());
    }

    public static int dp2px(Context context, float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int sp2px(Context context, float spValue) {
        float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    // 缩放图片
    public static void zoomImg(Bitmap bm, Rect zoomRect, Rect imgRect){
    // 获得图片的宽高
    int width = bm.getWidth();
    int height = bm.getHeight();
    // 计算缩放比例
    float scaleWidth = ((float) zoomRect.width()) / width;
    float scaleHeight = ((float) zoomRect.height()) / height;

    // 根据比例确定按照长度还是宽度缩放

    }

    Timer timer = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            ProcText("FB推流测试：逐行替换文字测试。1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20", sp2px(mContext,20), dp2px(mContext,2.5f), dp2px(mContext,140));
            postInvalidate();
        }
    };
    TimerTask webTask= new TimerTask() {
        @Override
        public void run() {

            getParaFromWeb();
        }
    };

    void ProcText(String txtStr,float textSize, float StrokeWidth, float Width)
    {
        mFocusPaint.setTextSize(textSize);
        mFocusPaint.setStrokeWidth (StrokeWidth);
        mFocusPaint.setStyle(Paint.Style.STROKE);

        Typeface typeface;
        typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD_ITALIC);
        mFocusPaint.setTypeface(typeface);
        //设置是否为粗体文字
        mFocusPaint.setFakeBoldText(true);

        if (index >= txtStr.length())
        {
            index = 0;
        }
        int tmp_index = 0;
        tmp_index = mFocusPaint.breakText(txtStr, index, txtStr.length(), true, Width, null);

        mTxtTmp = txtStr.substring(index, index+tmp_index);

        index = index + tmp_index;
    }

    void getParaFromWeb()
    {
        String url = "http://fbonestop.com:2580/FBoneshop/service/index.php/api/GoodsInterface/ClientFields";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url,null,new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                Log.d("weblog",jsonObject.toString());
                try {
                    mTitle = jsonObject.getString("Title");
                    mPrize = jsonObject.getString("Prize");
                    mBarrage = jsonObject.getString("Barrage");
                } catch (JSONException e) {
                    Log.d("weblog","error json msg");
                }
                postInvalidate();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Log.d("weblog",volleyError.toString());
            }
        });
        mRequestQueue.add(jsonObjectRequest);
    }

    /*

        Rect GetStringRect(String strText, Paint paint) {
            Rect rect = new Rect();
            paint.getTextBounds(strText, 0, strText.length(), rect);
            return rect;
        }

    void marquee(String txtStr) {

        int len = txtStr.length();
        Paint paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        paint.setTextSize(60.0f);
        Rect rect = GetStringRect(txtStr, paint);
        while((width + rect.width() > 320) && (len > 0))
        {
            rect = GetStringRect(txtStr.substring(0, len),paint);
            len -= 1;
        }

        txtLeft = txtStr.substring(len, txtStr.length());
        txtRight = txtStr.substring(0, len);

        if(width>20){
            width-=1;
        }else{
            width=320;
        }
    }

    void drawMarquee(Canvas canvas) {
        Paint paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);

        paint.setTextSize(60.0f);
        paint.setColor(Color.BLACK);

        if ((txtLeft != null) && (!txtLeft.equals("")))
        {
            canvas.drawText(txtLeft,  20.0f, 300.0f, paint);
        }

        if ((txtRight != null) && (!txtRight.equals(""))) {
            canvas.drawText(txtRight, width2, 300.0f, paint);
        }

    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (event.getAction()==MotionEvent.ACTION_UP) {

            invalidate(); //重新绘制区域
        }

        marquee("FB推流测试：跑马灯文字测试，1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20.");
        invalidate();
        return true;
    }

    void baseTest(Canvas canvas, int mod, float x, float y){
        Paint paint = new Paint();

        switch(mod) {
            case 0:
                canvas.drawCircle(x, y, 150, paint);
                break;
            case 1:
            {
                //绘制弧线区域
                RectF rect = new RectF(x, y, x+300, y+300);
                canvas.drawArc(rect, //弧线所使用的矩形区域大小
                        0,  //开始角度
                        90, //扫过的角度
                        false, //是否使用中心
                        paint);
            }
            break;

            case 2:
            {
                //绘制弧线区域
                RectF rect = new RectF(x, y, x+300, y+300);
                canvas.drawArc(rect, //弧线所使用的矩形区域大小
                        0,  //开始角度
                        90, //扫过的角度
                        true, //是否使用中心
                        paint);
            }
            break;

            case 3:
                canvas.drawColor(Color.BLUE);
                break;

            case 4:
                //画一条线
                canvas.drawLine(x, y, x+400, y+400, paint);
                break;
            case 5:
            {
                //定义一个矩形区域
                RectF oval = new RectF(x, y,x+200,y+300);
                //矩形区域内切椭圆
                canvas.drawOval(oval, paint);
            }
            break;

            case 6:
                //按照既定点 绘制文本内容
                paint.setTextSize(80);
                canvas.drawPosText("FB推流测试", new float[]{
                        x, y, //第一个字母在坐标10,10
                        x-50,y+50, //第二个字母在坐标20,20
                        x-100,y+100, //....
                        x-150,y+150,
                        x-200,y+200,
                        x-250,y+250,
                        x-300,y+300,
                        x-350,y+350,
                        x-400,y+400,
                        x-450,y+450
                }, paint);
                break;

            case 7:
            {
                RectF rect = new RectF(x, y, x+150, y+150);
                canvas.drawRect(rect, paint);
            }
            break;

            case 8:
            {
                RectF rect = new RectF(x, y, x+150, y+150);

                canvas.drawRoundRect(rect,
                        30, //x轴的半径
                        30, //y轴的半径
                        paint);

            }
            break;

            case 9:
            {
                Path path = new Path(); //定义一条路径
                path.moveTo(x, y); //移动到 坐标10,10
                path.lineTo(x+50, y+60);
                path.lineTo(x+200,y+80);
                path.lineTo(x, y);

                canvas.drawPath(path, paint);
            }
            break;

            case 10:
            {
                paint.setTextSize(40);
                Path path = new Path(); //定义一条路径
                path.moveTo(x, y); //移动到 坐标10,10
                path.lineTo(x+100, y+110);
                path.lineTo(x+400,y+160);
                path.lineTo(x, y);

                canvas.drawTextOnPath("FB推流测试，路径文字。", path, 10, 10, paint);
            }
            break;
            default:
                break;
        }

    }
*/

    void drawPng(Canvas canvas)
    {
        Paint paint = new Paint();

        Bitmap bitmap=null;
        try {
            InputStream is = mContext.getAssets().open("bingo02.png");
            bitmap = BitmapFactory.decodeStream(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        canvas.drawBitmap(bitmap,dp2px(mContext,200),dp2px(mContext,150),paint);
    }

    void drawText(Canvas canvas,String txtStr,float x, float y, float textSize, float width)
    {
        Paint paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setTextSize(textSize);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth (width);
        paint.setStyle(Paint.Style.STROKE);

        Typeface typeface;
        typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD_ITALIC);
        paint.setTypeface(typeface);
        //mFocusPaint.setTextSkewX(-0.10f);
        //设置是否为粗体文字
        paint.setFakeBoldText(true);
        canvas.drawText(txtStr, x, y, paint);

        paint.setColor(getResources().getColor(R.color.font_color_15));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText(txtStr, x, y, paint);
    }

    void drawText2(Canvas canvas,String txtStr,float x, float y)
    {

        Paint paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);

        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setTextSize(sp2px(mContext,30));
        paint.setColor(getResources().getColor(R.color.font_color_27));
        paint.setStrokeWidth (dp2px(mContext,10));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);//typeface = Typeface.create(Typeface.DEFAULT, Typeface.ITALIC);
        paint.setTypeface(Typeface.DEFAULT);

        //设置是否为粗体文字
        paint.setFakeBoldText(true);
        canvas.drawText(txtStr, x, y, paint);
        paint.setColor(Color.WHITE);
        paint.setStrokeWidth (dp2px(mContext,5));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawText(txtStr, x, y, paint);

        paint.setColor(getResources().getColor(R.color.font_color_27));
        paint.setStrokeWidth (dp2px(mContext,0.01f));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText(txtStr, x, y, paint);
    }

    void drawText3(Canvas canvas,String txtStr,float x, float y)
    {
        mFocusPaint.setColor(Color.BLACK);
        mFocusPaint.setStyle(Paint.Style.STROKE);
        canvas.drawText(txtStr, x, y, mFocusPaint);

        mFocusPaint.setColor(getResources().getColor(R.color.font_color_15));
        mFocusPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(txtStr, x, y, mFocusPaint);
    }

    @Override
    public void onDraw(Canvas canvas) {
        //int mod = index%11;
        //baseTest(canvas, mod, mX, mY);
        drawPng(canvas);

        drawText(canvas,mTitle, dp2px(mContext,65), dp2px(mContext,200), sp2px(mContext,25), dp2px(mContext,2.5f));
        drawText(canvas,mPrize, dp2px(mContext,85), dp2px(mContext,222.5f), sp2px(mContext,13), dp2px(mContext,1.5f));
        //drawText(canvas,"璀璨珍珠項鏈一條", dp2px(mContext,25), dp2px(mContext,250), sp2px(mContext,25), dp2px(mContext,2.5f));

        drawText2(canvas,mBarrage, dp2px(mContext,65), dp2px(mContext,400));

        drawText3(canvas,mTxtTmp,dp2px(mContext,15), dp2px(mContext,50));

        //drawMarquee(canvas);
    }

}
