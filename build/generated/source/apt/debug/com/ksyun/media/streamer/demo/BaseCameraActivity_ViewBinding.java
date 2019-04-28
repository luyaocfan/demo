// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.opengl.GLSurfaceView;
import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class BaseCameraActivity_ViewBinding implements Unbinder {
  private BaseCameraActivity target;

  private View view2131165298;

  private View view2131165391;

  private View view2131165395;

  @UiThread
  public BaseCameraActivity_ViewBinding(BaseCameraActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public BaseCameraActivity_ViewBinding(final BaseCameraActivity target, View source) {
    this.target = target;

    View view;
    target.mGLSurfaceView = Utils.findRequiredViewAsType(source, R.id.gl_surface_view, "field 'mGLSurfaceView'", GLSurfaceView.class);
    target.mChronometer = Utils.findRequiredViewAsType(source, R.id.chronometer, "field 'mChronometer'", Chronometer.class);
    view = Utils.findRequiredView(source, R.id.flash, "field 'mFlashView' and method 'onFlashClick'");
    target.mFlashView = Utils.castView(view, R.id.flash, "field 'mFlashView'", ImageView.class);
    view2131165298 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onFlashClick();
      }
    });
    target.mUrlTextView = Utils.findRequiredViewAsType(source, R.id.url, "field 'mUrlTextView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.start_stream_tv, "field 'mStreamingText' and method 'onStartStreamClick'");
    target.mStreamingText = Utils.castView(view, R.id.start_stream_tv, "field 'mStreamingText'", TextView.class);
    view2131165391 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStartStreamClick();
      }
    });
    target.mDebugInfoTextView = Utils.findRequiredViewAsType(source, R.id.debug_info, "field 'mDebugInfoTextView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.switch_cam, "method 'onSwitchCamera'");
    view2131165395 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSwitchCamera();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseCameraActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mGLSurfaceView = null;
    target.mChronometer = null;
    target.mFlashView = null;
    target.mUrlTextView = null;
    target.mStreamingText = null;
    target.mDebugInfoTextView = null;

    view2131165298.setOnClickListener(null);
    view2131165298 = null;
    view2131165391.setOnClickListener(null);
    view2131165391 = null;
    view2131165395.setOnClickListener(null);
    view2131165395 = null;
  }
}
