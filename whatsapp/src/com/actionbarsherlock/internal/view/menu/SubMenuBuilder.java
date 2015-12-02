// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuBuilder, MenuItemImpl

public class SubMenuBuilder extends MenuBuilder
    implements SubMenu
{

    private MenuItemImpl mItem;
    private MenuBuilder mParentMenu;

    public SubMenuBuilder(Context context, MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        super(context);
        mParentMenu = menubuilder;
        mItem = menuitemimpl;
    }

    public boolean collapseItemActionView(MenuItemImpl menuitemimpl)
    {
        return mParentMenu.collapseItemActionView(menuitemimpl);
    }

    boolean dispatchMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return super.dispatchMenuItemSelected(menubuilder, menuitem) || mParentMenu.dispatchMenuItemSelected(menubuilder, menuitem);
    }

    public boolean expandItemActionView(MenuItemImpl menuitemimpl)
    {
        return mParentMenu.expandItemActionView(menuitemimpl);
    }

    public String getActionViewStatesKey()
    {
        int i;
        if (mItem != null)
        {
            i = mItem.getItemId();
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(super.getActionViewStatesKey()).append(":").append(i).toString();
        }
    }

    public MenuItem getItem()
    {
        return mItem;
    }

    public Menu getParentMenu()
    {
        return mParentMenu;
    }

    public MenuBuilder getRootMenu()
    {
        return mParentMenu;
    }

    public boolean isQwertyMode()
    {
        return mParentMenu.isQwertyMode();
    }

    public boolean isShortcutsVisible()
    {
        return mParentMenu.isShortcutsVisible();
    }

    public void setCallback(MenuBuilder.Callback callback)
    {
        mParentMenu.setCallback(callback);
    }

    public SubMenu setHeaderTitle(CharSequence charsequence)
    {
        return (SubMenu)super.setHeaderTitleInt(charsequence);
    }

    public void setQwertyMode(boolean flag)
    {
        mParentMenu.setQwertyMode(flag);
    }
}
