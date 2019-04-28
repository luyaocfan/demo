// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DemoActivity_ViewBinding implements Unbinder {
  private DemoActivity target;

  private View view2131165263;

  @UiThread
  public DemoActivity_ViewBinding(DemoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DemoActivity_ViewBinding(final DemoActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.connectBT, "field 'mConnectButton' and method 'onClick'");
    target.mConnectButton = Utils.castView(view, R.id.connectBT, "field 'mConnectButton'", Button.class);
    view2131165263 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick();
      }
    });
    target.mUrlEditText = Utils.findRequiredViewAsType(source, R.id.rtmpUrl, "field 'mUrlEditText'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DemoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mConnectButton = null;
    target.mUrlEditText = null;

    view2131165263.setOnClickListener(null);
    view2131165263 = null;
  }
}
