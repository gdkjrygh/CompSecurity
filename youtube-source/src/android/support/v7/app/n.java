// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            ActionBar, a

class n extends android.support.v7.app.ActionBar
{

    final Activity a;
    final a b;
    final ActionBar c;
    private ArrayList d;

    public n(Activity activity, a a1)
    {
        this(activity, a1, true);
    }

    n(Activity activity, a a1, boolean flag)
    {
        d = new ArrayList();
        a = activity;
        b = a1;
        c = activity.getActionBar();
        if (flag && (a() & 4) != 0)
        {
            b(true);
        }
    }

    public int a()
    {
        return c.getDisplayOptions();
    }

    public void a(boolean flag)
    {
        c.setDisplayHomeAsUpEnabled(flag);
    }

    public Context b()
    {
        return c.getThemedContext();
    }

    public void b(boolean flag)
    {
        c.setHomeButtonEnabled(flag);
    }
}
