// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

class ActivityOptionsCompat21
{

    private final ActivityOptions mActivityOptions;

    private ActivityOptionsCompat21(ActivityOptions activityoptions)
    {
        mActivityOptions = activityoptions;
    }

    public static ActivityOptionsCompat21 makeSceneTransitionAnimation(Activity activity, View view, String s)
    {
        return new ActivityOptionsCompat21(ActivityOptions.makeSceneTransitionAnimation(activity, view, s));
    }

    public static ActivityOptionsCompat21 makeSceneTransitionAnimation(Activity activity, View aview[], String as[])
    {
        Pair apair[] = null;
        if (aview != null)
        {
            Pair apair1[] = new Pair[aview.length];
            int i = 0;
            do
            {
                apair = apair1;
                if (i >= apair1.length)
                {
                    break;
                }
                apair1[i] = Pair.create(aview[i], as[i]);
                i++;
            } while (true);
        }
        return new ActivityOptionsCompat21(ActivityOptions.makeSceneTransitionAnimation(activity, apair));
    }

    public Bundle toBundle()
    {
        return mActivityOptions.toBundle();
    }

    public void update(ActivityOptionsCompat21 activityoptionscompat21)
    {
        mActivityOptions.update(activityoptionscompat21.mActivityOptions);
    }
}
