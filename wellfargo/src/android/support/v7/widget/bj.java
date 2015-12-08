// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.c.c;
import android.support.v7.internal.view.menu.ad;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.x;
import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//            Toolbar, bk, bg

class bj
    implements x
{

    i a;
    m b;
    final Toolbar c;

    private bj(Toolbar toolbar)
    {
        c = toolbar;
        super();
    }

    bj(Toolbar toolbar, bg bg)
    {
        this(toolbar);
    }

    public void a(Context context, i j)
    {
        if (a != null && b != null)
        {
            a.d(b);
        }
        a = j;
    }

    public void a(i j, boolean flag)
    {
    }

    public void a(boolean flag)
    {
        boolean flag2 = false;
        if (b == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (a == null) goto _L4; else goto _L3
_L3:
        int j;
        int k;
        k = a.size();
        j = 0;
_L9:
        flag1 = flag2;
        if (j >= k) goto _L4; else goto _L5
_L5:
        if (a.getItem(j) != b) goto _L7; else goto _L6
_L6:
        flag1 = true;
_L4:
        if (!flag1)
        {
            b(a, b);
        }
_L2:
        return;
_L7:
        j++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean a(ad ad)
    {
        return false;
    }

    public boolean a(i j, m m1)
    {
        Toolbar.b(c);
        if (android.support.v7.widget.Toolbar.c(c).getParent() != c)
        {
            c.addView(android.support.v7.widget.Toolbar.c(c));
        }
        c.a = m1.getActionView();
        b = m1;
        if (c.a.getParent() != c)
        {
            j = c.i();
            j.a = 0x800003 | Toolbar.d(c) & 0x70;
            j.b = 2;
            c.a.setLayoutParams(j);
            c.addView(c.a);
        }
        Toolbar.a(c, true);
        c.requestLayout();
        m1.e(true);
        if (c.a instanceof c)
        {
            ((c)c.a).a();
        }
        return true;
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(i j, m m1)
    {
        if (c.a instanceof c)
        {
            ((c)c.a).b();
        }
        c.removeView(c.a);
        c.removeView(android.support.v7.widget.Toolbar.c(c));
        c.a = null;
        Toolbar.a(c, false);
        b = null;
        c.requestLayout();
        m1.e(false);
        return true;
    }
}
