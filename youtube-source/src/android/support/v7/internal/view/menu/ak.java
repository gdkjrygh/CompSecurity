// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.graphics.drawable.Drawable;
import android.support.v4.c.a.c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ai

final class ak extends ai
    implements c
{

    ak(SubMenu submenu)
    {
        super(submenu);
    }

    public final void clearHeader()
    {
        ((SubMenu)a).clearHeader();
    }

    public final MenuItem getItem()
    {
        return a(((SubMenu)a).getItem());
    }

    public final SubMenu setHeaderIcon(int i)
    {
        ((SubMenu)a).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        ((SubMenu)a).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i)
    {
        ((SubMenu)a).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        ((SubMenu)a).setHeaderTitle(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        ((SubMenu)a).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i)
    {
        ((SubMenu)a).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        ((SubMenu)a).setIcon(drawable);
        return this;
    }
}
