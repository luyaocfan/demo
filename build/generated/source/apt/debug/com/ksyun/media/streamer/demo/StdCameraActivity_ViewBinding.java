// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.support.annotation.UiThread;
import android.view.TextureView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.lht.paintview.PaintView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StdCameraActivity_ViewBinding extends BaseCameraActivity_ViewBinding {
  private StdCameraActivity target;

  private View view2131165390;

  private View view2131165289;

  private View view2131165366;

  @UiThread
  public StdCameraActivity_ViewBinding(StdCameraActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StdCameraActivity_ViewBinding(final StdCameraActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.mTextureView = Utils.findRequiredViewAsType(source, R.id.texture_view, "field 'mTextureView'", TextureView.class);
    target.mCameraHintView = Utils.findRequiredViewAsType(source, R.id.camera_hint, "field 'mCameraHintView'", CameraHintView.class);
    target.mPaintView = Utils.findRequiredViewAsType(source, R.id.view_paint, "field 'mPaintView'", PaintView.class);
    target.mCameraExposeBar = Utils.findRequiredView(source, R.id.camera_expose_bar, "field 'mCameraExposeBar'");
    target.mCameraExposeSeekBar = Utils.findRequiredViewAsType(source, R.id.camera_expose_sb, "field 'mCameraExposeSeekBar'", SeekBar.class);
    target.mFunctionTypeSpinner = Utils.findRequiredViewAsType(source, R.id.function_type, "field 'mFunctionTypeSpinner'", Spinner.class);
    target.mFunctionDetailLayout = Utils.findRequiredViewAsType(source, R.id.function_detail, "field 'mFunctionDetailLayout'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.start_record_tv, "field 'mRecordingText' and method 'onStartRecordClick'");
    target.mRecordingText = Utils.castView(view, R.id.start_record_tv, "field 'mRecordingText'", TextView.class);
    view2131165390 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStartRecordClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.exposure, "method 'onExposureClick'");
    view2131165289 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onExposureClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.screen_cap, "method 'onScreenCaptureShotClick'");
    view2131165366 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onScreenCaptureShotClick();
      }
    });
  }

  @Override
  public void unbind() {
    StdCameraActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mTextureView = null;
    target.mCameraHintView = null;
    target.mPaintView = null;
    target.mCameraExposeBar = null;
    target.mCameraExposeSeekBar = null;
    target.mFunctionTypeSpinner = null;
    target.mFunctionDetailLayout = null;
    target.mRecordingText = null;

    view2131165390.setOnClickListener(null);
    view2131165390 = null;
    view2131165289.setOnClickListener(null);
    view2131165289 = null;
    view2131165366.setOnClickListener(null);
    view2131165366 = null;

    super.unbind();
  }
}
