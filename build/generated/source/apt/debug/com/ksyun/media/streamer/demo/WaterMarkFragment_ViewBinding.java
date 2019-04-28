// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WaterMarkFragment_ViewBinding implements Unbinder {
  private WaterMarkFragment target;

  private View view2131165424;

  private View view2131165219;

  private View view2131165327;

  @UiThread
  public WaterMarkFragment_ViewBinding(final WaterMarkFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.watermark, "field 'mWatermarkCB' and method 'onWatermarkChecked'");
    target.mWatermarkCB = Utils.castView(view, R.id.watermark, "field 'mWatermarkCB'", CheckBox.class);
    view2131165424 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onWatermarkChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.animated_watermark, "field 'mAnimatedWatermarkCB' and method 'onAnimatedWatermarkChecked'");
    target.mAnimatedWatermarkCB = Utils.castView(view, R.id.animated_watermark, "field 'mAnimatedWatermarkCB'", CheckBox.class);
    view2131165219 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onAnimatedWatermarkChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.multi_watermark, "field 'mMultiWatermarkCB' and method 'onMultiWatermarkChecked'");
    target.mMultiWatermarkCB = Utils.castView(view, R.id.multi_watermark, "field 'mMultiWatermarkCB'", CheckBox.class);
    view2131165327 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onMultiWatermarkChecked(p1);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    WaterMarkFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mWatermarkCB = null;
    target.mAnimatedWatermarkCB = null;
    target.mMultiWatermarkCB = null;

    ((CompoundButton) view2131165424).setOnCheckedChangeListener(null);
    view2131165424 = null;
    ((CompoundButton) view2131165219).setOnCheckedChangeListener(null);
    view2131165219 = null;
    ((CompoundButton) view2131165327).setOnCheckedChangeListener(null);
    view2131165327 = null;
  }
}
