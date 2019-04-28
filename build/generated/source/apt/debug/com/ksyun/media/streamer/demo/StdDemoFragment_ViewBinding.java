// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StdDemoFragment_ViewBinding extends BaseDemoFragment_ViewBinding {
  private StdDemoFragment target;

  @UiThread
  public StdDemoFragment_ViewBinding(StdDemoFragment target, View source) {
    super(target, source);

    this.target = target;

    target.mCaptureResGroup = Utils.findRequiredViewAsType(source, R.id.capture_res_group, "field 'mCaptureResGroup'", RadioGroup.class);
    target.mPreviewResGroup = Utils.findRequiredViewAsType(source, R.id.preview_res_group, "field 'mPreviewResGroup'", RadioGroup.class);
    target.mPreviewViewGroup = Utils.findRequiredViewAsType(source, R.id.preview_view_group, "field 'mPreviewViewGroup'", RadioGroup.class);
    target.mBgSwitchGroup = Utils.findRequiredViewAsType(source, R.id.background_switch_group, "field 'mBgSwitchGroup'", RadioGroup.class);
    target.mVideoCodecIdGroup = Utils.findRequiredViewAsType(source, R.id.video_codec_id, "field 'mVideoCodecIdGroup'", RadioGroup.class);
    target.mEncodeSceneGroup = Utils.findRequiredViewAsType(source, R.id.encode_scene, "field 'mEncodeSceneGroup'", RadioGroup.class);
    target.mEncodeProfileGroup = Utils.findRequiredViewAsType(source, R.id.encode_profile, "field 'mEncodeProfileGroup'", RadioGroup.class);
    target.mAACProfileGroup = Utils.findRequiredViewAsType(source, R.id.aac_profile, "field 'mAACProfileGroup'", RadioGroup.class);
    target.mZoomFocus = Utils.findRequiredViewAsType(source, R.id.zoom_touch_focus, "field 'mZoomFocus'", CheckBox.class);
    target.mStereoStream = Utils.findRequiredViewAsType(source, R.id.stereo_stream, "field 'mStereoStream'", CheckBox.class);
    target.mBluetoothMicCheckBox = Utils.findRequiredViewAsType(source, R.id.bluetooth_mic, "field 'mBluetoothMicCheckBox'", CheckBox.class);
  }

  @Override
  public void unbind() {
    StdDemoFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mCaptureResGroup = null;
    target.mPreviewResGroup = null;
    target.mPreviewViewGroup = null;
    target.mBgSwitchGroup = null;
    target.mVideoCodecIdGroup = null;
    target.mEncodeSceneGroup = null;
    target.mEncodeProfileGroup = null;
    target.mAACProfileGroup = null;
    target.mZoomFocus = null;
    target.mStereoStream = null;
    target.mBluetoothMicCheckBox = null;

    super.unbind();
  }
}
