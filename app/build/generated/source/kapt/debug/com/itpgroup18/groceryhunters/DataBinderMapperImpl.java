package com.itpgroup18.groceryhunters;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.itpgroup18.groceryhunters.databinding.ActivityMainBindingImpl;
import com.itpgroup18.groceryhunters.databinding.ActivityMyFoodBuddyScreenFiveBindingImpl;
import com.itpgroup18.groceryhunters.databinding.ActivityMyFoodBuddyScreenFourBindingImpl;
import com.itpgroup18.groceryhunters.databinding.ActivityMyFoodBuddyScreenSixBindingImpl;
import com.itpgroup18.groceryhunters.databinding.ActivityMyFoodBuddyScreenThreeBindingImpl;
import com.itpgroup18.groceryhunters.databinding.FragmentHomeBindingImpl;
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyBindingImpl;
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyScreenThreeBindingImpl;
import com.itpgroup18.groceryhunters.databinding.FragmentMyFoodBuddyScreenTwoBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYMYFOODBUDDYSCREENFIVE = 2;

  private static final int LAYOUT_ACTIVITYMYFOODBUDDYSCREENFOUR = 3;

  private static final int LAYOUT_ACTIVITYMYFOODBUDDYSCREENSIX = 4;

  private static final int LAYOUT_ACTIVITYMYFOODBUDDYSCREENTHREE = 5;

  private static final int LAYOUT_FRAGMENTHOME = 6;

  private static final int LAYOUT_FRAGMENTMYFOODBUDDY = 7;

  private static final int LAYOUT_FRAGMENTMYFOODBUDDYSCREENTHREE = 8;

  private static final int LAYOUT_FRAGMENTMYFOODBUDDYSCREENTWO = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itpgroup18.groceryhunters.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itpgroup18.groceryhunters.R.layout.activity_my_food_buddy_screen_five, LAYOUT_ACTIVITYMYFOODBUDDYSCREENFIVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itpgroup18.groceryhunters.R.layout.activity_my_food_buddy_screen_four, LAYOUT_ACTIVITYMYFOODBUDDYSCREENFOUR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itpgroup18.groceryhunters.R.layout.activity_my_food_buddy_screen_six, LAYOUT_ACTIVITYMYFOODBUDDYSCREENSIX);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itpgroup18.groceryhunters.R.layout.activity_my_food_buddy_screen_three, LAYOUT_ACTIVITYMYFOODBUDDYSCREENTHREE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itpgroup18.groceryhunters.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itpgroup18.groceryhunters.R.layout.fragment_my_food_buddy, LAYOUT_FRAGMENTMYFOODBUDDY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itpgroup18.groceryhunters.R.layout.fragment_my_food_buddy_screen_three, LAYOUT_FRAGMENTMYFOODBUDDYSCREENTHREE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.itpgroup18.groceryhunters.R.layout.fragment_my_food_buddy_screen_two, LAYOUT_FRAGMENTMYFOODBUDDYSCREENTWO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMYFOODBUDDYSCREENFIVE: {
          if ("layout/activity_my_food_buddy_screen_five_0".equals(tag)) {
            return new ActivityMyFoodBuddyScreenFiveBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_my_food_buddy_screen_five is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMYFOODBUDDYSCREENFOUR: {
          if ("layout/activity_my_food_buddy_screen_four_0".equals(tag)) {
            return new ActivityMyFoodBuddyScreenFourBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_my_food_buddy_screen_four is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMYFOODBUDDYSCREENSIX: {
          if ("layout/activity_my_food_buddy_screen_six_0".equals(tag)) {
            return new ActivityMyFoodBuddyScreenSixBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_my_food_buddy_screen_six is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMYFOODBUDDYSCREENTHREE: {
          if ("layout/activity_my_food_buddy_screen_three_0".equals(tag)) {
            return new ActivityMyFoodBuddyScreenThreeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_my_food_buddy_screen_three is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMYFOODBUDDY: {
          if ("layout/fragment_my_food_buddy_0".equals(tag)) {
            return new FragmentMyFoodBuddyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my_food_buddy is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMYFOODBUDDYSCREENTHREE: {
          if ("layout/fragment_my_food_buddy_screen_three_0".equals(tag)) {
            return new FragmentMyFoodBuddyScreenThreeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my_food_buddy_screen_three is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMYFOODBUDDYSCREENTWO: {
          if ("layout/fragment_my_food_buddy_screen_two_0".equals(tag)) {
            return new FragmentMyFoodBuddyScreenTwoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_my_food_buddy_screen_two is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_main_0", com.itpgroup18.groceryhunters.R.layout.activity_main);
      sKeys.put("layout/activity_my_food_buddy_screen_five_0", com.itpgroup18.groceryhunters.R.layout.activity_my_food_buddy_screen_five);
      sKeys.put("layout/activity_my_food_buddy_screen_four_0", com.itpgroup18.groceryhunters.R.layout.activity_my_food_buddy_screen_four);
      sKeys.put("layout/activity_my_food_buddy_screen_six_0", com.itpgroup18.groceryhunters.R.layout.activity_my_food_buddy_screen_six);
      sKeys.put("layout/activity_my_food_buddy_screen_three_0", com.itpgroup18.groceryhunters.R.layout.activity_my_food_buddy_screen_three);
      sKeys.put("layout/fragment_home_0", com.itpgroup18.groceryhunters.R.layout.fragment_home);
      sKeys.put("layout/fragment_my_food_buddy_0", com.itpgroup18.groceryhunters.R.layout.fragment_my_food_buddy);
      sKeys.put("layout/fragment_my_food_buddy_screen_three_0", com.itpgroup18.groceryhunters.R.layout.fragment_my_food_buddy_screen_three);
      sKeys.put("layout/fragment_my_food_buddy_screen_two_0", com.itpgroup18.groceryhunters.R.layout.fragment_my_food_buddy_screen_two);
    }
  }
}
