// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AudioDemoFragment_ViewBinding implements Unbinder {
  private AudioDemoFragment target;

  @UiThread
  public AudioDemoFragment_ViewBinding(AudioDemoFragment target, View source) {
    this.target = target;

    target.mAudioBitRateEditText = Utils.findRequiredViewAsType(source, R.id.audioBitratePicker, "field 'mAudioBitRateEditText'", EditText.class);
    target.mAACProfileGroup = Utils.findRequiredViewAsType(source, R.id.aac_profile, "field 'mAACProfileGroup'", RadioGroup.class);
    target.mStereoStream = Utils.findRequiredViewAsType(source, R.id.stereo_stream, "field 'mStereoStream'", CheckBox.class);
    target.mAutoStartCheckBox = Utils.findRequiredViewAsType(source, R.id.autoStart, "field 'mAutoStartCheckBox'", CheckBox.class);
    target.mShowDebugInfoCheckBox = Utils.findRequiredViewAsType(source, R.id.print_debug_info, "field 'mShowDebugInfoCheckBox'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AudioDemoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAudioBitRateEditText = null;
    target.mAACProfileGroup = null;
    target.mStereoStream = null;
    target.mAutoStartCheckBox = null;
    target.mShowDebugInfoCheckBox = null;
  }
}
