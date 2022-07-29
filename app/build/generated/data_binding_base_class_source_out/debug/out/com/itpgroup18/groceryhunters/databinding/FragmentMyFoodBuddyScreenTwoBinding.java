// Generated by data binding compiler. Do not edit!
package com.itpgroup18.groceryhunters.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.itpgroup18.groceryhunters.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentMyFoodBuddyScreenTwoBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnScanQRCode;

  @NonNull
  public final ImageView ivMascots;

  @NonNull
  public final TextView tvHeaderFB1;

  @NonNull
  public final TextView tvSubHeaderFB2;

  @NonNull
  public final TextView tvSubHeaderTwoFB2;

  protected FragmentMyFoodBuddyScreenTwoBinding(Object _bindingComponent, View _root,
      int _localFieldCount, MaterialButton btnScanQRCode, ImageView ivMascots, TextView tvHeaderFB1,
      TextView tvSubHeaderFB2, TextView tvSubHeaderTwoFB2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnScanQRCode = btnScanQRCode;
    this.ivMascots = ivMascots;
    this.tvHeaderFB1 = tvHeaderFB1;
    this.tvSubHeaderFB2 = tvSubHeaderFB2;
    this.tvSubHeaderTwoFB2 = tvSubHeaderTwoFB2;
  }

  @NonNull
  public static FragmentMyFoodBuddyScreenTwoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_my_food_buddy_screen_two, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMyFoodBuddyScreenTwoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentMyFoodBuddyScreenTwoBinding>inflateInternal(inflater, R.layout.fragment_my_food_buddy_screen_two, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentMyFoodBuddyScreenTwoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_my_food_buddy_screen_two, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentMyFoodBuddyScreenTwoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentMyFoodBuddyScreenTwoBinding>inflateInternal(inflater, R.layout.fragment_my_food_buddy_screen_two, null, false, component);
  }

  public static FragmentMyFoodBuddyScreenTwoBinding bind(@NonNull View view) {
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
  public static FragmentMyFoodBuddyScreenTwoBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentMyFoodBuddyScreenTwoBinding)bind(component, view, R.layout.fragment_my_food_buddy_screen_two);
  }
}
