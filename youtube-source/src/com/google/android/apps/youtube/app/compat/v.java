// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.view.MenuItem;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            r, u

final class v
    implements android.view.MenuItem.OnActionExpandListener
{

    final r a;
    final u b;

    v(u u, r r1)
    {
        b = u;
        a = r1;
        super();
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        menuitem = a;
        u u = b;
        return menuitem.a();
    }

    public final boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        menuitem = a;
        u u = b;
        return menuitem.b();
    }
}
