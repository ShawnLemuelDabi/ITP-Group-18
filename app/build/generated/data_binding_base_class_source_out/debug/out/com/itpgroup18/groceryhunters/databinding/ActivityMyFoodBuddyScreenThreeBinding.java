// Generated by data binding compiler. Do not edit!
package com.itpgroup18.groceryhunters.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.itpgroup18.groceryhunters.GraphicOverlay;
import com.itpgroup18.groceryhunters.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMyFoodBuddyScreenThreeBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnCancel;

  @NonNull
  public final MaterialButton btnCancelTwo;

  @NonNull
  public final MaterialButton btnOk;

  @NonNull
  public final GraphicOverlay graphicOverlay;

  @NonNull
  public final PreviewView previewView;

  @NonNull
  public final TextView tvSuccessMessage;

  @NonNull
  public final TextView tvSuccessMessageTwo;

  protected ActivityMyFoodBuddyScreenThreeBinding(Object _bindingComponent, View _root,
      int _localFieldCount, MaterialButton btnCancel, MaterialButton btnCancelTwo,
      MaterialButton btnOk, GraphicOverlay graphicOverlay, PreviewView previewView,
      TextView tvSuccessMessage, TextView tvSuccessMessageTwo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCancel = btnCancel;
    this.btnCancelTwo = btnCancelTwo;
    this.btnOk = btnOk;
    this.graphicOverlay = graphicOverlay;
    this.previewView = previewView;
    this.tvSuccessMessage = tvSuccessMessage;
    this.tvSuccessMessageTwo = tvSuccessMessageTwo;
  }

  @NonNull
  public static ActivityMyFoodBuddyScreenThreeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_my_food_buddy_screen_three, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMyFoodBuddyScreenThreeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMyFoodBuddyScreenThreeBinding>inflateInternal(inflater, R.layout.activity_my_food_buddy_screen_three, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMyFoodBuddyScreenThreeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_my_food_buddy_screen_three, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMyFoodBuddyScreenThreeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMyFoodBuddyScreenThreeBinding>inflateInternal(inflater, R.layout.activity_my_food_buddy_screen_three, null, false, component);
  }

  public static ActivityMyFoodBuddyScreenThreeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMyFoodBuddyScreenThreeBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityMyFoodBuddyScreenThreeBinding)bind(component, view, R.layout.activity_my_food_buddy_screen_three);
  }
}
