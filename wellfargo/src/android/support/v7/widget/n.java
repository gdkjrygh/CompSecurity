// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, o, j

class n
    implements j
{

    final ActionMenuView a;

    private n(ActionMenuView actionmenuview)
    {
        a = actionmenuview;
        super();
    }

    n(ActionMenuView actionmenuview, android.support.v7.widget.j j1)
    {
        this(actionmenuview);
    }

    public void a(i i)
    {
        if (ActionMenuView.b(a) != null)
        {
            ActionMenuView.b(a).a(i);
        }
    }

    public boolean a(i i, MenuItem menuitem)
    {
        return ActionMenuView.a(a) != null && ActionMenuView.a(a).a(menuitem);
    }
}
