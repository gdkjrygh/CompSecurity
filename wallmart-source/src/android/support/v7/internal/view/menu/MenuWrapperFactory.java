// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuWrapperICS, MenuItemWrapperJB, MenuItemWrapperICS, SubMenuWrapperICS

public final class MenuWrapperFactory
{

    private MenuWrapperFactory()
    {
    }

    public static Menu wrapSupportMenu(Context context, SupportMenu supportmenu)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new MenuWrapperICS(context, supportmenu);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static MenuItem wrapSupportMenuItem(Context context, SupportMenuItem supportmenuitem)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new MenuItemWrapperJB(context, supportmenuitem);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new MenuItemWrapperICS(context, supportmenuitem);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }

    public static SubMenu wrapSupportSubMenu(Context context, SupportSubMenu supportsubmenu)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new SubMenuWrapperICS(context, supportsubmenu);
        } else
        {
            throw new UnsupportedOperationException();
        }
    }
}
