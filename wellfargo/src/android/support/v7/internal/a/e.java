// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.support.v7.internal.widget.ag;

// Referenced classes of package android.support.v7.internal.a:
//            b, c

final class e
    implements y
{

    final b a;
    private boolean b;

    private e(b b1)
    {
        a = b1;
        super();
    }

    e(b b1, c c)
    {
        this(b1);
    }

    public void a(i i, boolean flag)
    {
        if (b)
        {
            return;
        }
        b = true;
        android.support.v7.internal.a.b.c(a).o();
        if (android.support.v7.internal.a.b.a(a) != null)
        {
            android.support.v7.internal.a.b.a(a).onPanelClosed(8, i);
        }
        b = false;
    }

    public boolean a(i i)
    {
        if (android.support.v7.internal.a.b.a(a) != null)
        {
            android.support.v7.internal.a.b.a(a).onMenuOpened(8, i);
            return true;
        } else
        {
            return false;
        }
    }
}
