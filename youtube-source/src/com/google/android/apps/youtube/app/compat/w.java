// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            q, x, y, s, 
//            r

public class w
    implements q
{

    protected final MenuItem a;
    private final Context b;
    private int c;
    private y d;
    private View e;
    private s f;

    public w(Context context, MenuItem menuitem)
    {
        b = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        a = (MenuItem)com.google.android.apps.youtube.common.fromguava.c.a(menuitem);
        c = 0;
    }

    public final MenuItem a()
    {
        return a;
    }

    public final q a(int j)
    {
        e = LayoutInflater.from(b).inflate(j, new LinearLayout(b), false);
        return this;
    }

    public q a(r r)
    {
        return this;
    }

    public final q a(s s)
    {
        f = s;
        if (s == null)
        {
            a.setOnMenuItemClickListener(null);
            return this;
        } else
        {
            a.setOnMenuItemClickListener(new x(this, s));
            return this;
        }
    }

    public final q a(boolean flag)
    {
        a.setEnabled(flag);
        return this;
    }

    public final q b(boolean flag)
    {
        boolean flag1 = a.isVisible();
        a.setVisible(flag);
        y y;
        if (flag1 != flag && d != null)
        {
            y = d;
        }
        return this;
    }

    public void b(int j)
    {
        c = j;
    }

    public boolean b()
    {
        return false;
    }

    public final q c(int j)
    {
        a.setTitle(j);
        return this;
    }

    public boolean c()
    {
        return false;
    }

    public View d()
    {
        return e;
    }

    public final int e()
    {
        return a.getItemId();
    }

    public final CharSequence f()
    {
        return a.getTitle();
    }

    public boolean g()
    {
        return false;
    }

    public final boolean h()
    {
        return a.isVisible();
    }

    public final int i()
    {
        return c;
    }
}
