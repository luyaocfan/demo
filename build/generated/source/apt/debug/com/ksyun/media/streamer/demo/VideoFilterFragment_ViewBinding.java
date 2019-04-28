// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VideoFilterFragment_ViewBinding implements Unbinder {
  private VideoFilterFragment target;

  @UiThread
  public VideoFilterFragment_ViewBinding(VideoFilterFragment target, View source) {
    this.target = target;

    target.mFilterIdxSpinner = Utils.findRequiredViewAsType(source, R.id.filter_idx_spin, "field 'mFilterIdxSpinner'", Spinner.class);
    target.mFilterSpinner = Utils.findRequiredViewAsType(source, R.id.filter_spin, "field 'mFilterSpinner'", Spinner.class);
    target.mBeautyGrindLayout = Utils.findRequiredViewAsType(source, R.id.beauty_grind, "field 'mBeautyGrindLayout'", LinearLayout.class);
    target.mBeautyWhitenLayout = Utils.findRequiredViewAsType(source, R.id.beauty_whiten, "field 'mBeautyWhitenLayout'", LinearLayout.class);
    target.mBeautyRuddyLayout = Utils.findRequiredViewAsType(source, R.id.beauty_ruddy, "field 'mBeautyRuddyLayout'", LinearLayout.class);
    target.mGrindSeekBar = Utils.findRequiredViewAsType(source, R.id.grind_seek_bar, "field 'mGrindSeekBar'", SeekBar.class);
    target.mWhitenSeekBar = Utils.findRequiredViewAsType(source, R.id.whiten_seek_bar, "field 'mWhitenSeekBar'", SeekBar.class);
    target.mRuddySeekBar = Utils.findRequiredViewAsType(source, R.id.ruddy_seek_bar, "field 'mRuddySeekBar'", SeekBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VideoFilterFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFilterIdxSpinner = null;
    target.mFilterSpinner = null;
    target.mBeautyGrindLayout = null;
    target.mBeautyWhitenLayout = null;
    target.mBeautyRuddyLayout = null;
    target.mGrindSeekBar = null;
    target.mWhitenSeekBar = null;
    target.mRuddySeekBar = null;
  }
}
