// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

class ActionBarDrawerToggleHoneycomb
{
    static class SetIndicatorInfo
    {

        public Method setHomeActionContentDescription;
        public Method setHomeAsUpIndicator;
        public ImageView upIndicatorView;

        SetIndicatorInfo(Activity activity)
        {
            setHomeAsUpIndicator = android/app/ActionBar.getDeclaredMethod("setHomeAsUpIndicator", new Class[] {
                android/graphics/drawable/Drawable
            });
            setHomeActionContentDescription = android/app/ActionBar.getDeclaredMethod("setHomeActionContentDescription", new Class[] {
                Integer.TYPE
            });
_L1:
            return;
            NoSuchMethodException nosuchmethodexception;
            nosuchmethodexception;
            activity = activity.findViewById(0x102002c);
            if (activity != null)
            {
                Object obj = (ViewGroup)activity.getParent();
                if (((ViewGroup) (obj)).getChildCount() == 2)
                {
                    activity = ((ViewGroup) (obj)).getChildAt(0);
                    obj = ((ViewGroup) (obj)).getChildAt(1);
                    if (activity.getId() == 0x102002c)
                    {
                        activity = ((Activity) (obj));
                    }
                    if (activity instanceof ImageView)
                    {
                        upIndicatorView = (ImageView)activity;
                        return;
                    }
                }
            }
              goto _L1
        }
    }


    private static final String TAG = "ActionBarDrawerToggleHoneycomb";
    private static final int THEME_ATTRS[] = {
        0x101030b
    };

    ActionBarDrawerToggleHoneycomb()
    {
    }

    public static Drawable getThemeUpIndicator(Activity activity)
    {
        activity = activity.obtainStyledAttributes(THEME_ATTRS);
        Drawable drawable = activity.getDrawable(0);
        activity.recycle();
        return drawable;
    }

    public static SetIndicatorInfo setActionBarDescription(SetIndicatorInfo setindicatorinfo, Activity activity, int i)
    {
        SetIndicatorInfo setindicatorinfo1 = setindicatorinfo;
        if (setindicatorinfo == null)
        {
            setindicatorinfo1 = new SetIndicatorInfo(activity);
        }
        if (setindicatorinfo1.setHomeAsUpIndicator != null)
        {
            try
            {
                setindicatorinfo = activity.getActionBar();
                setindicatorinfo1.setHomeActionContentDescription.invoke(setindicatorinfo, new Object[] {
                    Integer.valueOf(i)
                });
                if (android.os.Build.VERSION.SDK_INT <= 19)
                {
                    setindicatorinfo.setSubtitle(setindicatorinfo.getSubtitle());
                }
            }
            // Misplaced declaration of an exception variable
            catch (SetIndicatorInfo setindicatorinfo)
            {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", setindicatorinfo);
                return setindicatorinfo1;
            }
        }
        return setindicatorinfo1;
    }

    public static SetIndicatorInfo setActionBarUpIndicator(SetIndicatorInfo setindicatorinfo, Activity activity, Drawable drawable, int i)
    {
        setindicatorinfo = new SetIndicatorInfo(activity);
        if (setindicatorinfo.setHomeAsUpIndicator != null)
        {
            try
            {
                activity = activity.getActionBar();
                setindicatorinfo.setHomeAsUpIndicator.invoke(activity, new Object[] {
                    drawable
                });
                setindicatorinfo.setHomeActionContentDescription.invoke(activity, new Object[] {
                    Integer.valueOf(i)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", activity);
                return setindicatorinfo;
            }
            return setindicatorinfo;
        }
        if (setindicatorinfo.upIndicatorView != null)
        {
            setindicatorinfo.upIndicatorView.setImageDrawable(drawable);
            return setindicatorinfo;
        } else
        {
            Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
            return setindicatorinfo;
        }
    }

}
