// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            o, s, p

public final class aj extends o
    implements SubMenu
{

    private o d;
    private s e;

    public aj(Context context, o o1, s s1)
    {
        super(context);
        d = o1;
        e = s1;
    }

    public final void a(p p)
    {
        d.a(p);
    }

    public final boolean a()
    {
        return d.a();
    }

    public final boolean a(o o1, MenuItem menuitem)
    {
        return super.a(o1, menuitem) || d.a(o1, menuitem);
    }

    public final boolean a(s s1)
    {
        return d.a(s1);
    }

    public final boolean b()
    {
        return d.b();
    }

    public final boolean b(s s1)
    {
        return d.b(s1);
    }

    public final void clearHeader()
    {
    }

    public final MenuItem getItem()
    {
        return e;
    }

    public final o q()
    {
        return d;
    }

    public final SubMenu setHeaderIcon(int i)
    {
        super.a(d().getResources().getDrawable(i));
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable)
    {
        super.a(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i)
    {
        super.a(d().getResources().getString(i));
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charsequence)
    {
        super.a(charsequence);
        return this;
    }

    public final SubMenu setHeaderView(View view)
    {
        super.a(view);
        return this;
    }

    public final SubMenu setIcon(int i)
    {
        e.setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable)
    {
        e.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean flag)
    {
        d.setQwertyMode(flag);
    }

    public final Menu t()
    {
        return d;
    }
}
