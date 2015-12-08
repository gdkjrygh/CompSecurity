// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuWrapperICS

class SubMenuWrapperICS extends MenuWrapperICS
    implements SubMenu
{

    SubMenuWrapperICS(Context context, SupportSubMenu supportsubmenu)
    {
        super(context, supportsubmenu);
    }

    public void clearHeader()
    {
        getWrappedObject().clearHeader();
    }

    public MenuItem getItem()
    {
        return getMenuItemWrapper(getWrappedObject().getItem());
    }

    public SupportSubMenu getWrappedObject()
    {
        return (SupportSubMenu)mWrappedObject;
    }

    public volatile Object getWrappedObject()
    {
        return getWrappedObject();
    }

    public SubMenu setHeaderIcon(int i)
    {
        getWrappedObject().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable)
    {
        getWrappedObject().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i)
    {
        getWrappedObject().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        getWrappedObject().setHeaderTitle(charsequence);
        return this;
    }

    public SubMenu setHeaderView(View view)
    {
        getWrappedObject().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i)
    {
        getWrappedObject().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable)
    {
        getWrappedObject().setIcon(drawable);
        return this;
    }
}
