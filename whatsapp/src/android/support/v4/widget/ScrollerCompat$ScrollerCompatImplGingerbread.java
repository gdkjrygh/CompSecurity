// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompatGingerbread

class 
    implements 
{

    public void abortAnimation(Object obj)
    {
        ScrollerCompatGingerbread.abortAnimation(obj);
    }

    public boolean computeScrollOffset(Object obj)
    {
        return ScrollerCompatGingerbread.computeScrollOffset(obj);
    }

    public Object createScroller(Context context, Interpolator interpolator)
    {
        return ScrollerCompatGingerbread.createScroller(context, interpolator);
    }

    public int getCurrX(Object obj)
    {
        return ScrollerCompatGingerbread.getCurrX(obj);
    }

    public int getCurrY(Object obj)
    {
        return ScrollerCompatGingerbread.getCurrY(obj);
    }

    public int getFinalX(Object obj)
    {
        return ScrollerCompatGingerbread.getFinalX(obj);
    }

    public int getFinalY(Object obj)
    {
        return ScrollerCompatGingerbread.getFinalY(obj);
    }

    public void startScroll(Object obj, int i, int j, int k, int l, int i1)
    {
        ScrollerCompatGingerbread.startScroll(obj, i, j, k, l, i1);
    }

    ()
    {
    }
}
