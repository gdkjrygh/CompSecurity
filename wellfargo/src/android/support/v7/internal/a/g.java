// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;

// Referenced classes of package android.support.v7.internal.a:
//            b, c

final class g
    implements y
{

    final b a;

    private g(b b1)
    {
        a = b1;
        super();
    }

    g(b b1, c c)
    {
        this(b1);
    }

    public void a(i i, boolean flag)
    {
        if (b.a(a) != null)
        {
            b.a(a).onPanelClosed(0, i);
        }
    }

    public boolean a(i i)
    {
        if (i == null && b.a(a) != null)
        {
            b.a(a).onMenuOpened(0, i);
        }
        return true;
    }
}
