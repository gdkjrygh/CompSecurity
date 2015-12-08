// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

// Referenced classes of package android.support.v4.widget:
//            s

class u
    implements s
{

    u()
    {
    }

    public final Object a(Context context, Interpolator interpolator)
    {
        if (interpolator != null)
        {
            return new OverScroller(context, interpolator);
        } else
        {
            return new OverScroller(context);
        }
    }

    public final void a(Object obj, int i, int j, int k, int l, int i1)
    {
        ((OverScroller)obj).startScroll(i, j, k, l, i1);
    }

    public final boolean a(Object obj)
    {
        return ((OverScroller)obj).isFinished();
    }

    public final int b(Object obj)
    {
        return ((OverScroller)obj).getCurrX();
    }

    public final int c(Object obj)
    {
        return ((OverScroller)obj).getCurrY();
    }

    public final boolean d(Object obj)
    {
        return ((OverScroller)obj).computeScrollOffset();
    }

    public final void e(Object obj)
    {
        ((OverScroller)obj).abortAnimation();
    }

    public final int f(Object obj)
    {
        return ((OverScroller)obj).getFinalX();
    }

    public final int g(Object obj)
    {
        return ((OverScroller)obj).getFinalY();
    }
}
