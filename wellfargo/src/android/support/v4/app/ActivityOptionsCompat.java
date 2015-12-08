// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.e.m;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            ActivityOptionsCompatJB, ActivityOptionsCompat21

public class ActivityOptionsCompat
{

    protected ActivityOptionsCompat()
    {
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int j)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new ActivityOptionsImplJB(ActivityOptionsCompatJB.makeCustomAnimation(context, i, j));
        } else
        {
            return new ActivityOptionsCompat();
        }
    }

    public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int j, int k, int l)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new ActivityOptionsImplJB(ActivityOptionsCompatJB.makeScaleUpAnimation(view, i, j, k, l));
        } else
        {
            return new ActivityOptionsCompat();
        }
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return new ActivityOptionsImpl21(ActivityOptionsCompat21.makeSceneTransitionAnimation(activity, view, s));
        } else
        {
            return new ActivityOptionsCompat();
        }
    }

    public static transient ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, m am[])
    {
        View aview[] = null;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            if (am != null)
            {
                aview = new View[am.length];
                String as[] = new String[am.length];
                for (int i = 0; i < am.length; i++)
                {
                    aview[i] = (View)am[i].a;
                    as[i] = (String)am[i].b;
                }

                am = as;
            } else
            {
                Object obj = null;
                am = aview;
                aview = obj;
            }
            return new ActivityOptionsImpl21(ActivityOptionsCompat21.makeSceneTransitionAnimation(activity, aview, am));
        } else
        {
            return new ActivityOptionsCompat();
        }
    }

    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int j)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new ActivityOptionsImplJB(ActivityOptionsCompatJB.makeThumbnailScaleUpAnimation(view, bitmap, i, j));
        } else
        {
            return new ActivityOptionsCompat();
        }
    }

    public Bundle toBundle()
    {
        return null;
    }

    public void update(ActivityOptionsCompat activityoptionscompat)
    {
    }

    private class ActivityOptionsImplJB extends ActivityOptionsCompat
    {

        private final ActivityOptionsCompatJB mImpl;

        public Bundle toBundle()
        {
            return mImpl.toBundle();
        }

        public void update(ActivityOptionsCompat activityoptionscompat)
        {
            if (activityoptionscompat instanceof ActivityOptionsImplJB)
            {
                activityoptionscompat = (ActivityOptionsImplJB)activityoptionscompat;
                mImpl.update(((ActivityOptionsImplJB) (activityoptionscompat)).mImpl);
            }
        }

        ActivityOptionsImplJB(ActivityOptionsCompatJB activityoptionscompatjb)
        {
            mImpl = activityoptionscompatjb;
        }
    }


    private class ActivityOptionsImpl21 extends ActivityOptionsCompat
    {

        private final ActivityOptionsCompat21 mImpl;

        public Bundle toBundle()
        {
            return mImpl.toBundle();
        }

        public void update(ActivityOptionsCompat activityoptionscompat)
        {
            if (activityoptionscompat instanceof ActivityOptionsImpl21)
            {
                activityoptionscompat = (ActivityOptionsImpl21)activityoptionscompat;
                mImpl.update(((ActivityOptionsImpl21) (activityoptionscompat)).mImpl);
            }
        }

        ActivityOptionsImpl21(ActivityOptionsCompat21 activityoptionscompat21)
        {
            mImpl = activityoptionscompat21;
        }
    }

}
