// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.view.SubMenu;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import java.util.WeakHashMap;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuItemWrapper, SubMenuWrapper

public class MenuWrapper
    implements Menu
{

    private final WeakHashMap mNativeMap = new WeakHashMap();
    private final android.view.Menu mNativeMenu;

    public MenuWrapper(android.view.Menu menu)
    {
        mNativeMenu = menu;
    }

    private MenuItem addInternal(android.view.MenuItem menuitem)
    {
        MenuItemWrapper menuitemwrapper = new MenuItemWrapper(menuitem);
        mNativeMap.put(menuitem, menuitemwrapper);
        return menuitemwrapper;
    }

    private com.actionbarsherlock.view.SubMenu addInternal(SubMenu submenu)
    {
        SubMenuWrapper submenuwrapper = new SubMenuWrapper(submenu);
        submenu = submenu.getItem();
        MenuItem menuitem = submenuwrapper.getItem();
        mNativeMap.put(submenu, menuitem);
        return submenuwrapper;
    }

    public MenuItem add(int i, int j, int k, int l)
    {
        return addInternal(mNativeMenu.add(i, j, k, l));
    }

    public MenuItem add(int i, int j, int k, CharSequence charsequence)
    {
        return addInternal(mNativeMenu.add(i, j, k, charsequence));
    }

    public MenuItem add(CharSequence charsequence)
    {
        return addInternal(mNativeMenu.add(charsequence));
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i, int j, int k, int l)
    {
        return addInternal(mNativeMenu.addSubMenu(i, j, k, l));
    }

    public com.actionbarsherlock.view.SubMenu addSubMenu(int i, int j, int k, CharSequence charsequence)
    {
        return addInternal(mNativeMenu.addSubMenu(i, j, k, charsequence));
    }

    public void clear()
    {
        mNativeMap.clear();
        mNativeMenu.clear();
    }

    public MenuItem findItem(int i)
    {
        return findItem(mNativeMenu.findItem(i));
    }

    public MenuItem findItem(android.view.MenuItem menuitem)
    {
        MenuItem menuitem1;
        if (menuitem == null)
        {
            menuitem1 = null;
        } else
        {
            MenuItem menuitem2 = (MenuItem)mNativeMap.get(menuitem);
            menuitem1 = menuitem2;
            if (menuitem2 == null)
            {
                return addInternal(menuitem);
            }
        }
        return menuitem1;
    }

    public boolean hasVisibleItems()
    {
        return mNativeMenu.hasVisibleItems();
    }

    public void setGroupCheckable(int i, boolean flag, boolean flag1)
    {
        mNativeMenu.setGroupCheckable(i, flag, flag1);
    }

    public void setGroupVisible(int i, boolean flag)
    {
        mNativeMenu.setGroupVisible(i, flag);
    }

    public int size()
    {
        return mNativeMenu.size();
    }

    public android.view.Menu unwrap()
    {
        return mNativeMenu;
    }
}
