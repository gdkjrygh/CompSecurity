// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;

public class ActionBarDrawerToggle
    implements android.support.v4.widget.DrawerLayout.DrawerListener
{

    private static final int ID_HOME = 0x102002c;
    private static final ActionBarDrawerToggleImpl IMPL;
    private static final float TOGGLE_DRAWABLE_OFFSET = 0.3333333F;
    private final Activity mActivity;
    private final Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    private Drawable mDrawerImage;
    private final int mDrawerImageResource;
    private boolean mDrawerIndicatorEnabled;
    private final DrawerLayout mDrawerLayout;
    private boolean mHasCustomUpIndicator;
    private Drawable mHomeAsUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private Object mSetIndicatorInfo;
    private SlideDrawable mSlider;

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, int i, int j, int k)
    {
        boolean flag;
        if (!assumeMaterial(activity))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this(activity, drawerlayout, flag, i, j, k);
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerlayout, boolean flag, int i, int j, int k)
    {
        mDrawerIndicatorEnabled = true;
        mActivity = activity;
    /* block-local class not found */
    class DelegateProvider {}

    /* block-local class not found */
    class SlideDrawable {}

        float f;
        if (activity instanceof DelegateProvider)
        {
            mActivityImpl = ((DelegateProvider)activity).getDrawerToggleDelegate();
        } else
        {
            mActivityImpl = null;
        }
        mDrawerLayout = drawerlayout;
        mDrawerImageResource = i;
        mOpenDrawerContentDescRes = j;
        mCloseDrawerContentDescRes = k;
        mHomeAsUpIndicator = getThemeUpIndicator();
        mDrawerImage = ContextCompat.getDrawable(activity, i);
        mSlider = new SlideDrawable(mDrawerImage, null);
        activity = mSlider;
        if (flag)
        {
            f = 0.3333333F;
        } else
        {
            f = 0.0F;
        }
        activity.setOffset(f);
    }

    private static boolean assumeMaterial(Context context)
    {
        return context.getApplicationInfo().targetSdkVersion >= 21 && android.os.Build.VERSION.SDK_INT >= 21;
    }

    Drawable getThemeUpIndicator()
    {
    /* block-local class not found */
    class ActionBarDrawerToggleImpl {}

    /* block-local class not found */
    class Delegate {}

        if (mActivityImpl != null)
        {
            return mActivityImpl.getThemeUpIndicator();
        } else
        {
            return IMPL.getThemeUpIndicator(mActivity);
        }
    }

    public boolean isDrawerIndicatorEnabled()
    {
        return mDrawerIndicatorEnabled;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (!mHasCustomUpIndicator)
        {
            mHomeAsUpIndicator = getThemeUpIndicator();
        }
        mDrawerImage = ContextCompat.getDrawable(mActivity, mDrawerImageResource);
        syncState();
    }

    public void onDrawerClosed(View view)
    {
        mSlider.setPosition(0.0F);
        if (mDrawerIndicatorEnabled)
        {
            setActionBarDescription(mOpenDrawerContentDescRes);
        }
    }

    public void onDrawerOpened(View view)
    {
        mSlider.setPosition(1.0F);
        if (mDrawerIndicatorEnabled)
        {
            setActionBarDescription(mCloseDrawerContentDescRes);
        }
    }

    public void onDrawerSlide(View view, float f)
    {
        float f1 = mSlider.getPosition();
        if (f > 0.5F)
        {
            f = Math.max(f1, Math.max(0.0F, f - 0.5F) * 2.0F);
        } else
        {
            f = Math.min(f1, f * 2.0F);
        }
        mSlider.setPosition(f);
    }

    public void onDrawerStateChanged(int i)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem != null && menuitem.getItemId() == 0x102002c && mDrawerIndicatorEnabled)
        {
            if (mDrawerLayout.isDrawerVisible(0x800003))
            {
                mDrawerLayout.closeDrawer(0x800003);
            } else
            {
                mDrawerLayout.openDrawer(0x800003);
            }
            return true;
        } else
        {
            return false;
        }
    }

    void setActionBarDescription(int i)
    {
        if (mActivityImpl != null)
        {
            mActivityImpl.setActionBarDescription(i);
            return;
        } else
        {
            mSetIndicatorInfo = IMPL.setActionBarDescription(mSetIndicatorInfo, mActivity, i);
            return;
        }
    }

    void setActionBarUpIndicator(Drawable drawable, int i)
    {
        if (mActivityImpl != null)
        {
            mActivityImpl.setActionBarUpIndicator(drawable, i);
            return;
        } else
        {
            mSetIndicatorInfo = IMPL.setActionBarUpIndicator(mSetIndicatorInfo, mActivity, drawable, i);
            return;
        }
    }

    public void setDrawerIndicatorEnabled(boolean flag)
    {
        if (flag != mDrawerIndicatorEnabled)
        {
            if (flag)
            {
                SlideDrawable slidedrawable = mSlider;
                int i;
                if (mDrawerLayout.isDrawerOpen(0x800003))
                {
                    i = mCloseDrawerContentDescRes;
                } else
                {
                    i = mOpenDrawerContentDescRes;
                }
                setActionBarUpIndicator(slidedrawable, i);
            } else
            {
                setActionBarUpIndicator(mHomeAsUpIndicator, 0);
            }
            mDrawerIndicatorEnabled = flag;
        }
    }

    public void setHomeAsUpIndicator(int i)
    {
        Drawable drawable = null;
        if (i != 0)
        {
            drawable = ContextCompat.getDrawable(mActivity, i);
        }
        setHomeAsUpIndicator(drawable);
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        if (drawable == null)
        {
            mHomeAsUpIndicator = getThemeUpIndicator();
            mHasCustomUpIndicator = false;
        } else
        {
            mHomeAsUpIndicator = drawable;
            mHasCustomUpIndicator = true;
        }
        if (!mDrawerIndicatorEnabled)
        {
            setActionBarUpIndicator(mHomeAsUpIndicator, 0);
        }
    }

    public void syncState()
    {
        if (mDrawerLayout.isDrawerOpen(0x800003))
        {
            mSlider.setPosition(1.0F);
        } else
        {
            mSlider.setPosition(0.0F);
        }
        if (mDrawerIndicatorEnabled)
        {
            SlideDrawable slidedrawable = mSlider;
            int i;
            if (mDrawerLayout.isDrawerOpen(0x800003))
            {
                i = mCloseDrawerContentDescRes;
            } else
            {
                i = mOpenDrawerContentDescRes;
            }
            setActionBarUpIndicator(slidedrawable, i);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
    /* block-local class not found */
    class ActionBarDrawerToggleImplBase {}

    /* block-local class not found */
    class ActionBarDrawerToggleImplHC {}

    /* block-local class not found */
    class ActionBarDrawerToggleImplJellybeanMR2 {}

        if (i >= 18)
        {
            IMPL = new ActionBarDrawerToggleImplJellybeanMR2(null);
        } else
        if (i >= 11)
        {
            IMPL = new ActionBarDrawerToggleImplHC(null);
        } else
        {
            IMPL = new ActionBarDrawerToggleImplBase(null);
        }
    }

}
