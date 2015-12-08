// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, u

final class y extends l
    implements android.view.MenuItem.OnMenuItemClickListener
{

    final u b;

    y(u u1, android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        b = u1;
        super(onmenuitemclicklistener);
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnMenuItemClickListener)a).onMenuItemClick(b.a(menuitem));
    }
}
