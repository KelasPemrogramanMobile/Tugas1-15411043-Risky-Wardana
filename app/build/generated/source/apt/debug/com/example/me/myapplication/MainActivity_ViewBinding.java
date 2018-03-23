// Generated code from Butter Knife. Do not modify!
package com.example.me.myapplication;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131165219;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.edName = Utils.findRequiredViewAsType(source, R.id.edName, "field 'edName'", EditText.class);
    target.edNpm = Utils.findRequiredViewAsType(source, R.id.edNpm, "field 'edNpm'", EditText.class);
    target.edTtl = Utils.findRequiredViewAsType(source, R.id.edTtl, "field 'edTtl'", EditText.class);
    target.txtNama = Utils.findRequiredViewAsType(source, R.id.txtNama, "field 'txtNama'", TextView.class);
    target.txtNpm = Utils.findRequiredViewAsType(source, R.id.txtNpm, "field 'txtNpm'", TextView.class);
    target.txtTTL = Utils.findRequiredViewAsType(source, R.id.txtTTL, "field 'txtTTL'", TextView.class);
    view = Utils.findRequiredView(source, R.id.button, "method 'tampil'");
    view2131165219 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.tampil();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.edName = null;
    target.edNpm = null;
    target.edTtl = null;
    target.txtNama = null;
    target.txtNpm = null;
    target.txtTTL = null;

    view2131165219.setOnClickListener(null);
    view2131165219 = null;
  }
}
