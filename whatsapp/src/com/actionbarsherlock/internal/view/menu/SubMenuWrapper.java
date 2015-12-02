// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuWrapper, MenuItemWrapper

public class SubMenuWrapper extends MenuWrapper
    implements SubMenu
{

    private MenuItem mItem;
    private final android.view.SubMenu mNativeSubMenu;

    public SubMenuWrapper(android.view.SubMenu submenu)
    {
        super(submenu);
        mItem = null;
        mNativeSubMenu = submenu;
    }

    public void clearHeader()
    {
        mNativeSubMenu.clearHeader();
    }

    public MenuItem getItem()
    {
        if (mItem == null)
        {
            mItem = new MenuItemWrapper(mNativeSubMenu.getItem());
        }
        return mItem;
    }
}
