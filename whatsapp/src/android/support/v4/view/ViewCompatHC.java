// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ViewCompatHC
{

    static long getFrameTime()
    {
        return ValueAnimator.getFrameDelay();
    }

    public static int getLayerType(View view)
    {
        return view.getLayerType();
    }

    public static float getScaleX(View view)
    {
        return view.getScaleX();
    }

    public static void setLayerType(View view, int i, Paint paint)
    {
        view.setLayerType(i, paint);
    }

    public static void setScaleX(View view, float f)
    {
        view.setScaleX(f);
    }

    public static void setScaleY(View view, float f)
    {
        view.setScaleY(f);
    }
}
