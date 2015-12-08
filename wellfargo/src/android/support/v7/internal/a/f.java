// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ag;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.a:
//            b, c

final class f
    implements j
{

    final b a;

    private f(b b1)
    {
        a = b1;
        super();
    }

    f(b b1, c c)
    {
        this(b1);
    }

    public void a(i i)
    {
        if (b.a(a) != null)
        {
            if (b.c(a).j())
            {
                b.a(a).onPanelClosed(8, i);
            } else
            if (b.a(a).onPreparePanel(0, null, i))
            {
                b.a(a).onMenuOpened(8, i);
                return;
            }
        }
    }

    public boolean a(i i, MenuItem menuitem)
    {
        return false;
    }
}
