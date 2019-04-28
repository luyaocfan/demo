// Generated code from Butter Knife. Do not modify!
package com.ksyun.media.streamer.demo;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FloatCameraActivity_ViewBinding extends BaseCameraActivity_ViewBinding {
  private FloatCameraActivity target;

  private View view2131165422;

  @UiThread
  public FloatCameraActivity_ViewBinding(FloatCameraActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FloatCameraActivity_ViewBinding(final FloatCameraActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.view_add, "method 'onViewAddClick'");
    view2131165422 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewAddClick();
      }
    });
  }

  @Override
  public void unbind() {
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    target = null;


    view2131165422.setOnClickListener(null);
    view2131165422 = null;

    super.unbind();
  }
}
