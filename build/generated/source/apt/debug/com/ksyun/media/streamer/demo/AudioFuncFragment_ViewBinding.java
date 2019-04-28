// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AudioFuncFragment_ViewBinding implements Unbinder {
  private AudioFuncFragment target;

  private View view2131165224;

  private View view2131165236;

  private View view2131165225;

  private View view2131165329;

  private View view2131165336;

  private View view2131165237;

  private View view2131165223;

  @UiThread
  public AudioFuncFragment_ViewBinding(final AudioFuncFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.audio_ld, "field 'mAudioLDCB' and method 'onAudioLDChecked'");
    target.mAudioLDCB = Utils.castView(view, R.id.audio_ld, "field 'mAudioLDCB'", CheckBox.class);
    view2131165224 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onAudioLDChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.bgm, "method 'onBgmChecked'");
    view2131165236 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onBgmChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.audio_preview, "method 'onAudioPreviewChecked'");
    view2131165225 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onAudioPreviewChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.mute, "method 'onMuteChecked'");
    view2131165329 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.onMuteChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.ns, "method 'OnNSChecked'");
    view2131165336 = view;
    ((CompoundButton) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton p0, boolean p1) {
        target.OnNSChecked(p1);
      }
    });
    view = Utils.findRequiredView(source, R.id.bgm_filter, "method 'onChooseBGMFilter'");
    view2131165237 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onChooseBGMFilter();
      }
    });
    view = Utils.findRequiredView(source, R.id.audio_filter, "method 'showChooseAudioFilter'");
    view2131165223 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showChooseAudioFilter();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AudioFuncFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAudioLDCB = null;

    ((CompoundButton) view2131165224).setOnCheckedChangeListener(null);
    view2131165224 = null;
    ((CompoundButton) view2131165236).setOnCheckedChangeListener(null);
    view2131165236 = null;
    ((CompoundButton) view2131165225).setOnCheckedChangeListener(null);
    view2131165225 = null;
    ((CompoundButton) view2131165329).setOnCheckedChangeListener(null);
    view2131165329 = null;
    ((CompoundButton) view2131165336).setOnCheckedChangeListener(null);
    view2131165336 = null;
    view2131165237.setOnClickListener(null);
    view2131165237 = null;
    view2131165223.setOnClickListener(null);
    view2131165223 = null;
  }
}
