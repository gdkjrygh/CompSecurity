// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class ScrollerCompatGingerbread
{

    public static void abortAnimation(Object obj)
    {
        ((OverScroller)obj).abortAnimation();
    }

    public static boolean computeScrollOffset(Object obj)
    {
        return ((OverScroller)obj).computeScrollOffset();
    }

    public static Object createScroller(Context context, Interpolator interpolator)
    {
        if (interpolator != null)
        {
            return new OverScroller(context, interpolator);
        } else
        {
            return new OverScroller(context);
        }
    }

    public static int getCurrX(Object obj)
    {
        return ((OverScroller)obj).getCurrX();
    }

    public static int getCurrY(Object obj)
    {
        return ((OverScroller)obj).getCurrY();
    }

    public static int getFinalX(Object obj)
    {
        return ((OverScroller)obj).getFinalX();
    }

    public static int getFinalY(Object obj)
    {
        return ((OverScroller)obj).getFinalY();
    }

    public static void startScroll(Object obj, int i, int j, int k, int l, int i1)
    {
        ((OverScroller)obj).startScroll(i, j, k, l, i1);
    }
}
