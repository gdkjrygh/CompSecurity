// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.view.View;

// Referenced classes of package android.support.v7.app:
//            f, g

public class e
    implements android.support.v4.widget.DrawerLayout.DrawerListener
{

    private final f a;
    private g b;
    private boolean c;
    private final int d;
    private final int e;

    void a(int i)
    {
        a.a(i);
    }

    public void onDrawerClosed(View view)
    {
        b.a(0.0F);
        if (c)
        {
            a(d);
        }
    }

    public void onDrawerOpened(View view)
    {
        b.a(1.0F);
        if (c)
        {
            a(e);
        }
    }

    public void onDrawerSlide(View view, float f1)
    {
        b.a(Math.min(1.0F, Math.max(0.0F, f1)));
    }

    public void onDrawerStateChanged(int i)
    {
    }
}
