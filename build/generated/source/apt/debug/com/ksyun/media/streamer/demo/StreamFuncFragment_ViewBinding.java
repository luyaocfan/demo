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

public class StreamFuncFragment_ViewBinding implements Unbinder {
  private StreamFuncFragment target;

  private View view2131165305;

  private View view2131165341;

  @UiThread
  public StreamFuncFragment_ViewBinding(final StreamFuncFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.front_camera_mirror, "field 'mFrontMirrorCB' and method 'onFrontMirrorChecked'");
    target.mFrontMirrorCB = Utils.castView(view, R.id.front_camera_mirror, "field 'mFrontMirrorCB'", CheckBox.class);
    view2131165305 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onFrontMirrorChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.paint_streaming, "field 'mPaintStreamingCB' and method 'onPaintStreamingChecked'");
    target.mPaintStreamingCB = Utils.castView(view, R.id.paint_streaming, "field 'mPaintStreamingCB'", CheckBox.class);
    view2131165341 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onPaintStreamingChecked(p1);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    StreamFuncFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFrontMirrorCB = null;
    target.mPaintStreamingCB = null;

    ((CompoundButton) view2131165305).setOnCheckedChangeListener(null);
    view2131165305 = null;
    ((CompoundButton) view2131165341).setOnCheckedChangeListener(null);
    view2131165341 = null;
  }
}
