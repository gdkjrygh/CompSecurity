// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            a, MenuItemImpl

public class b extends a
    implements SubMenu
{

    private a d;
    private MenuItemImpl e;

    public b(Context context, a a1, MenuItemImpl menuitemimpl)
    {
        super(context);
        d = a1;
        e = menuitemimpl;
    }

    public String a()
    {
        int i;
        if (e != null)
        {
            i = e.getItemId();
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(super.a()).append(":").append(i).toString();
        }
    }

    public void a(a.a a1)
    {
        d.a(a1);
    }

    public void a(boolean flag)
    {
        d.a(flag);
    }

    boolean a(a a1, MenuItem menuitem)
    {
        return super.a(a1, menuitem) || d.a(a1, menuitem);
    }

    public boolean c()
    {
        return d.c();
    }

    public boolean c(MenuItemImpl menuitemimpl)
    {
        return d.c(menuitemimpl);
    }

    public boolean d()
    {
        return d.d();
    }

    public boolean d(MenuItemImpl menuitemimpl)
    {
        return d.d(menuitemimpl);
    }

    public MenuItem getItem()
    {
        return e;
    }

    public a q()
    {
        return d;
    }

    public SubMenu setHeaderIcon(int i)
    {
        super.a(ContextCompat.getDrawable(f(), i));
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        super.a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        super.a(f().getResources().getString(i));
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        super.a(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        super.a(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean flag)
    {
        d.setQwertyMode(flag);
    }

    public Menu t()
    {
        return d;
    }
}
