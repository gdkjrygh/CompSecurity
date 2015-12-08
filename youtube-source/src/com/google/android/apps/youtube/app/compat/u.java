// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            t, v, r, q

public final class u extends t
{

    public u(Context context, MenuItem menuitem)
    {
        super(context, menuitem);
    }

    public final q a(r r)
    {
        if (r == null)
        {
            a.setOnActionExpandListener(null);
            return this;
        } else
        {
            a.setOnActionExpandListener(new v(this, r));
            return this;
        }
    }

    public final boolean b()
    {
        return a.collapseActionView();
    }

    public final boolean c()
    {
        return a.expandActionView();
    }

    public final View d()
    {
        return a.getActionView();
    }

    public final boolean g()
    {
        return a.isActionViewExpanded();
    }
}
