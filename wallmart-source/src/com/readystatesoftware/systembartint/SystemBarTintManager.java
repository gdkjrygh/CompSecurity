// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.readystatesoftware.systembartint;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Method;

public class SystemBarTintManager
{
    public static class SystemBarConfig
    {

        private static final String NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME = "navigation_bar_height_landscape";
        private static final String NAV_BAR_HEIGHT_RES_NAME = "navigation_bar_height";
        private static final String NAV_BAR_WIDTH_RES_NAME = "navigation_bar_width";
        private static final String SHOW_NAV_BAR_RES_NAME = "config_showNavigationBar";
        private static final String STATUS_BAR_HEIGHT_RES_NAME = "status_bar_height";
        private final int mActionBarHeight;
        private final boolean mHasNavigationBar;
        private final boolean mInPortrait;
        private final int mNavigationBarHeight;
        private final int mNavigationBarWidth;
        private final float mSmallestWidthDp;
        private final int mStatusBarHeight;
        private final boolean mTranslucentNavBar;
        private final boolean mTranslucentStatusBar;

        private int getActionBarHeight(Context context)
        {
            int i = 0;
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                TypedValue typedvalue = new TypedValue();
                context.getTheme().resolveAttribute(0x10102eb, typedvalue, true);
                i = TypedValue.complexToDimensionPixelSize(typedvalue.data, context.getResources().getDisplayMetrics());
            }
            return i;
        }

        private int getInternalDimensionSize(Resources resources, String s)
        {
            int i = 0;
            int j = resources.getIdentifier(s, "dimen", "android");
            if (j > 0)
            {
                i = resources.getDimensionPixelSize(j);
            }
            return i;
        }

        private int getNavigationBarHeight(Context context)
        {
            Resources resources = context.getResources();
            boolean flag = false;
            int i = ((flag) ? 1 : 0);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                i = ((flag) ? 1 : 0);
                if (hasNavBar(context))
                {
                    if (mInPortrait)
                    {
                        context = "navigation_bar_height";
                    } else
                    {
                        context = "navigation_bar_height_landscape";
                    }
                    i = getInternalDimensionSize(resources, context);
                }
            }
            return i;
        }

        private int getNavigationBarWidth(Context context)
        {
            Resources resources = context.getResources();
            boolean flag = false;
            int i = ((flag) ? 1 : 0);
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                i = ((flag) ? 1 : 0);
                if (hasNavBar(context))
                {
                    i = getInternalDimensionSize(resources, "navigation_bar_width");
                }
            }
            return i;
        }

        private float getSmallestWidthDp(Activity activity)
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displaymetrics);
            } else
            {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            }
            return Math.min((float)displaymetrics.widthPixels / displaymetrics.density, (float)displaymetrics.heightPixels / displaymetrics.density);
        }

        private boolean hasNavBar(Context context)
        {
            boolean flag;
            Resources resources = context.getResources();
            int i = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            flag = resources.getBoolean(i);
            if (!"1".equals(SystemBarTintManager.sNavBarOverride)) goto _L2; else goto _L1
_L1:
            flag = false;
_L4:
            return flag;
_L2:
            if (!"0".equals(SystemBarTintManager.sNavBarOverride)) goto _L4; else goto _L3
_L3:
            return true;
            boolean flag1;
            if (!ViewConfiguration.get(context).hasPermanentMenuKey())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            return flag1;
        }

        public int getActionBarHeight()
        {
            return mActionBarHeight;
        }

        public int getNavigationBarHeight()
        {
            return mNavigationBarHeight;
        }

        public int getNavigationBarWidth()
        {
            return mNavigationBarWidth;
        }

        public int getPixelInsetBottom()
        {
            if (mTranslucentNavBar && isNavigationAtBottom())
            {
                return mNavigationBarHeight;
            } else
            {
                return 0;
            }
        }

        public int getPixelInsetRight()
        {
            if (mTranslucentNavBar && !isNavigationAtBottom())
            {
                return mNavigationBarWidth;
            } else
            {
                return 0;
            }
        }

        public int getPixelInsetTop(boolean flag)
        {
            int j = 0;
            int i;
            if (mTranslucentStatusBar)
            {
                i = mStatusBarHeight;
            } else
            {
                i = 0;
            }
            if (flag)
            {
                j = mActionBarHeight;
            }
            return j + i;
        }

        public int getStatusBarHeight()
        {
            return mStatusBarHeight;
        }

        public boolean hasNavigtionBar()
        {
            return mHasNavigationBar;
        }

        public boolean isNavigationAtBottom()
        {
            return mSmallestWidthDp >= 600F || mInPortrait;
        }

        private SystemBarConfig(Activity activity, boolean flag, boolean flag1)
        {
            boolean flag3 = true;
            super();
            Resources resources = activity.getResources();
            boolean flag2;
            if (resources.getConfiguration().orientation == 1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            mInPortrait = flag2;
            mSmallestWidthDp = getSmallestWidthDp(activity);
            mStatusBarHeight = getInternalDimensionSize(resources, "status_bar_height");
            mActionBarHeight = getActionBarHeight(activity);
            mNavigationBarHeight = getNavigationBarHeight(activity);
            mNavigationBarWidth = getNavigationBarWidth(activity);
            if (mNavigationBarHeight > 0)
            {
                flag2 = flag3;
            } else
            {
                flag2 = false;
            }
            mHasNavigationBar = flag2;
            mTranslucentStatusBar = flag;
            mTranslucentNavBar = flag1;
        }

    }


    public static final int DEFAULT_TINT_COLOR = 0x99000000;
    private static String sNavBarOverride;
    private final SystemBarConfig mConfig;
    private boolean mNavBarAvailable;
    private boolean mNavBarTintEnabled;
    private View mNavBarTintView;
    private boolean mStatusBarAvailable;
    private boolean mStatusBarTintEnabled;
    private View mStatusBarTintView;

    public SystemBarTintManager(Activity activity)
    {
        ViewGroup viewgroup;
        Object obj;
        Window window;
        window = activity.getWindow();
        viewgroup = (ViewGroup)window.getDecorView();
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = activity.obtainStyledAttributes(new int[] {
            0x10103ef, 0x10103f0
        });
        mStatusBarAvailable = ((TypedArray) (obj)).getBoolean(0, false);
        mNavBarAvailable = ((TypedArray) (obj)).getBoolean(1, false);
        ((TypedArray) (obj)).recycle();
        obj = window.getAttributes();
        if ((((android.view.WindowManager.LayoutParams) (obj)).flags & 0x4000000) != 0)
        {
            mStatusBarAvailable = true;
        }
        if ((((android.view.WindowManager.LayoutParams) (obj)).flags & 0x8000000) != 0)
        {
            mNavBarAvailable = true;
        }
        mConfig = new SystemBarConfig(activity, mStatusBarAvailable, mNavBarAvailable);
        if (!mConfig.hasNavigtionBar())
        {
            mNavBarAvailable = false;
        }
        if (mStatusBarAvailable)
        {
            setupStatusBarView(activity, viewgroup);
        }
        if (mNavBarAvailable)
        {
            setupNavBarView(activity, viewgroup);
        }
        return;
        activity;
        ((TypedArray) (obj)).recycle();
        throw activity;
    }

    private void setupNavBarView(Context context, ViewGroup viewgroup)
    {
        mNavBarTintView = new View(context);
        if (mConfig.isNavigationAtBottom())
        {
            context = new android.widget.FrameLayout.LayoutParams(-1, mConfig.getNavigationBarHeight());
            context.gravity = 80;
        } else
        {
            context = new android.widget.FrameLayout.LayoutParams(mConfig.getNavigationBarWidth(), -1);
            context.gravity = 5;
        }
        mNavBarTintView.setLayoutParams(context);
        mNavBarTintView.setBackgroundColor(0x99000000);
        mNavBarTintView.setVisibility(8);
        viewgroup.addView(mNavBarTintView);
    }

    private void setupStatusBarView(Context context, ViewGroup viewgroup)
    {
        mStatusBarTintView = new View(context);
        context = new android.widget.FrameLayout.LayoutParams(-1, mConfig.getStatusBarHeight());
        context.gravity = 48;
        if (mNavBarAvailable && !mConfig.isNavigationAtBottom())
        {
            context.rightMargin = mConfig.getNavigationBarWidth();
        }
        mStatusBarTintView.setLayoutParams(context);
        mStatusBarTintView.setBackgroundColor(0x99000000);
        mStatusBarTintView.setVisibility(8);
        viewgroup.addView(mStatusBarTintView);
    }

    public SystemBarConfig getConfig()
    {
        return mConfig;
    }

    public boolean isNavBarTintEnabled()
    {
        return mNavBarTintEnabled;
    }

    public boolean isStatusBarTintEnabled()
    {
        return mStatusBarTintEnabled;
    }

    public void setNavigationBarAlpha(float f)
    {
        if (mNavBarAvailable && android.os.Build.VERSION.SDK_INT >= 11)
        {
            mNavBarTintView.setAlpha(f);
        }
    }

    public void setNavigationBarTintColor(int i)
    {
        if (mNavBarAvailable)
        {
            mNavBarTintView.setBackgroundColor(i);
        }
    }

    public void setNavigationBarTintDrawable(Drawable drawable)
    {
        if (mNavBarAvailable)
        {
            mNavBarTintView.setBackgroundDrawable(drawable);
        }
    }

    public void setNavigationBarTintEnabled(boolean flag)
    {
        mNavBarTintEnabled = flag;
        if (mNavBarAvailable)
        {
            View view = mNavBarTintView;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setNavigationBarTintResource(int i)
    {
        if (mNavBarAvailable)
        {
            mNavBarTintView.setBackgroundResource(i);
        }
    }

    public void setStatusBarAlpha(float f)
    {
        if (mStatusBarAvailable && android.os.Build.VERSION.SDK_INT >= 11)
        {
            mStatusBarTintView.setAlpha(f);
        }
    }

    public void setStatusBarTintColor(int i)
    {
        if (mStatusBarAvailable)
        {
            mStatusBarTintView.setBackgroundColor(i);
        }
    }

    public void setStatusBarTintDrawable(Drawable drawable)
    {
        if (mStatusBarAvailable)
        {
            mStatusBarTintView.setBackgroundDrawable(drawable);
        }
    }

    public void setStatusBarTintEnabled(boolean flag)
    {
        mStatusBarTintEnabled = flag;
        if (mStatusBarAvailable)
        {
            View view = mStatusBarTintView;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setStatusBarTintResource(int i)
    {
        if (mStatusBarAvailable)
        {
            mStatusBarTintView.setBackgroundResource(i);
        }
    }

    public void setTintAlpha(float f)
    {
        setStatusBarAlpha(f);
        setNavigationBarAlpha(f);
    }

    public void setTintColor(int i)
    {
        setStatusBarTintColor(i);
        setNavigationBarTintColor(i);
    }

    public void setTintDrawable(Drawable drawable)
    {
        setStatusBarTintDrawable(drawable);
        setNavigationBarTintDrawable(drawable);
    }

    public void setTintResource(int i)
    {
        setStatusBarTintResource(i);
        setNavigationBarTintResource(i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Method method = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] {
            java/lang/String
        });
        method.setAccessible(true);
        sNavBarOverride = (String)method.invoke(null, new Object[] {
            "qemu.hw.mainkeys"
        });
        return;
        Throwable throwable;
        throwable;
        sNavBarOverride = null;
    }

}
