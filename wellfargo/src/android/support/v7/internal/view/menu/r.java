// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, o

class r extends f
    implements android.support.v4.view.MenuItemCompat.OnActionExpandListener
{

    final o a;

    r(o o1, android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        a = o1;
        super(onactionexpandlistener);
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnActionExpandListener)b).onMenuItemActionCollapse(a.a(menuitem));
    }

    public boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnActionExpandListener)b).onMenuItemActionExpand(a.a(menuitem));
    }
}
