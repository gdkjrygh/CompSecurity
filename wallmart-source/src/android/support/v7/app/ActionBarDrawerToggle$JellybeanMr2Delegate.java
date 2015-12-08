// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.app:
//            ActionBarDrawerToggle

private static class <init>
    implements <init>
{

    final Activity mActivity;

    public Context getActionBarThemedContext()
    {
        ActionBar actionbar = mActivity.getActionBar();
        if (actionbar != null)
        {
            return actionbar.getThemedContext();
        } else
        {
            return mActivity;
        }
    }

    public Drawable getThemeUpIndicator()
    {
        TypedArray typedarray = getActionBarThemedContext().obtainStyledAttributes(null, new int[] {
            0x101030b
        }, 0x10102ce, 0);
        Drawable drawable = typedarray.getDrawable(0);
        typedarray.recycle();
        return drawable;
    }

    public boolean isNavigationVisible()
    {
        ActionBar actionbar = mActivity.getActionBar();
        return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
    }

    public void setActionBarDescription(int i)
    {
        ActionBar actionbar = mActivity.getActionBar();
        if (actionbar != null)
        {
            actionbar.setHomeActionContentDescription(i);
        }
    }

    public void setActionBarUpIndicator(Drawable drawable, int i)
    {
        ActionBar actionbar = mActivity.getActionBar();
        if (actionbar != null)
        {
            actionbar.setHomeAsUpIndicator(drawable);
            actionbar.setHomeActionContentDescription(i);
        }
    }

    private (Activity activity)
    {
        mActivity = activity;
    }

    mActivity(Activity activity, mActivity mactivity)
    {
        this(activity);
    }
}
