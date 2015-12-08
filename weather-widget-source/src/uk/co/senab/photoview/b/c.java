// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview.b;

import android.content.Context;
import android.widget.Scroller;

// Referenced classes of package uk.co.senab.photoview.b:
//            d

public class c extends d
{

    private Scroller a;

    public c(Context context)
    {
        a = new Scroller(context);
    }

    public void a(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2)
    {
        a.fling(i, j, k, l, i1, j1, k1, l1);
    }

    public void a(boolean flag)
    {
        a.forceFinished(flag);
    }

    public boolean a()
    {
        return a.computeScrollOffset();
    }

    public boolean b()
    {
        return a.isFinished();
    }

    public int c()
    {
        return a.getCurrX();
    }

    public int d()
    {
        return a.getCurrY();
    }
}
