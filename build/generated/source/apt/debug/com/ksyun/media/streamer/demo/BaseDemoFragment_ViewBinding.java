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

public class BaseDemoFragment_ViewBinding implements Unbinder {
  private BaseDemoFragment target;

  @UiThread
  public BaseDemoFragment_ViewBinding(BaseDemoFragment target, View source) {
    this.target = target;

    target.mFrameRateEditText = Utils.findRequiredViewAsType(source, R.id.frameRatePicker, "field 'mFrameRateEditText'", EditText.class);
    target.mVideoBitRateEditText = Utils.findRequiredViewAsType(source, R.id.videoBitratePicker, "field 'mVideoBitRateEditText'", EditText.class);
    target.mAudioBitRateEditText = Utils.findRequiredViewAsType(source, R.id.audioBitratePicker, "field 'mAudioBitRateEditText'", EditText.class);
    target.mFacingGroup = Utils.findRequiredViewAsType(source, R.id.camera_face_group, "field 'mFacingGroup'", RadioGroup.class);
    target.mTargetResGroup = Utils.findRequiredViewAsType(source, R.id.target_res_group, "field 'mTargetResGroup'", RadioGroup.class);
    target.mOrientationGroup = Utils.findRequiredViewAsType(source, R.id.orientation_group, "field 'mOrientationGroup'", RadioGroup.class);
    target.mEncodeMethodGroup = Utils.findRequiredViewAsType(source, R.id.encode_method, "field 'mEncodeMethodGroup'", RadioGroup.class);
    target.mAutoStartCheckBox = Utils.findRequiredViewAsType(source, R.id.autoStart, "field 'mAutoStartCheckBox'", CheckBox.class);
    target.mShowDebugInfoCheckBox = Utils.findRequiredViewAsType(source, R.id.print_debug_info, "field 'mShowDebugInfoCheckBox'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BaseDemoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFrameRateEditText = null;
    target.mVideoBitRateEditText = null;
    target.mAudioBitRateEditText = null;
    target.mFacingGroup = null;
    target.mTargetResGroup = null;
    target.mOrientationGroup = null;
    target.mEncodeMethodGroup = null;
    target.mAutoStartCheckBox = null;
    target.mShowDebugInfoCheckBox = null;
  }
}
