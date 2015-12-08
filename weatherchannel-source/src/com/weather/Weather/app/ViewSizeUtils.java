// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.common.base.Preconditions;

final class ViewSizeUtils
{
    static interface OnDimensionsFoundListener
    {

        public abstract void onDimensionsFound(int i, int j);
    }


    private static final String TAG = "ViewSizeUtils";

    private ViewSizeUtils()
    {
    }

    static void registerToCalculateViewDimensions(Activity activity, int i, OnDimensionsFoundListener ondimensionsfoundlistener)
    {
        activity = (View)Preconditions.checkNotNull(activity.findViewById(i));
        activity.getViewTreeObserver().addOnGlobalLayoutListener(new _cls1(activity, ondimensionsfoundlistener));
    }

    /* member class not found */
    class _cls1 {}

}
