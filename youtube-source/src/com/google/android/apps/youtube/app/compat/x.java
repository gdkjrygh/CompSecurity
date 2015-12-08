// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.compat;

import android.view.MenuItem;

// Referenced classes of package com.google.android.apps.youtube.app.compat:
//            s, w

final class x
    implements android.view.MenuItem.OnMenuItemClickListener
{

    final s a;
    final w b;

    x(w w, s s1)
    {
        b = w;
        a = s1;
        super();
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        a.a(b);
        return false;
    }
}
