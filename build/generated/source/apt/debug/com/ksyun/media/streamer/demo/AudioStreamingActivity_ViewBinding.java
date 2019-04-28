// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AudioStreamingActivity_ViewBinding implements Unbinder {
  private AudioStreamingActivity target;

  private View view2131165391;

  private View view2131165390;

  @UiThread
  public AudioStreamingActivity_ViewBinding(AudioStreamingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AudioStreamingActivity_ViewBinding(final AudioStreamingActivity target, View source) {
    this.target = target;

    View view;
    target.mChronometer = Utils.findRequiredViewAsType(source, R.id.chronometer, "field 'mChronometer'", Chronometer.class);
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
    view = Utils.findRequiredView(source, R.id.start_record_tv, "field 'mRecordingText' and method 'onStartRecordClick'");
    target.mRecordingText = Utils.castView(view, R.id.start_record_tv, "field 'mRecordingText'", TextView.class);
    view2131165390 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStartRecordClick();
      }
    });
    target.mDebugInfoTextView = Utils.findRequiredViewAsType(source, R.id.debug_info, "field 'mDebugInfoTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AudioStreamingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mChronometer = null;
    target.mUrlTextView = null;
    target.mStreamingText = null;
    target.mRecordingText = null;
    target.mDebugInfoTextView = null;

    view2131165391.setOnClickListener(null);
    view2131165391 = null;
    view2131165390.setOnClickListener(null);
    view2131165390 = null;
  }
}
