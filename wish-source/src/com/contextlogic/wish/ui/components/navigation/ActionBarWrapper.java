// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

// Referenced classes of package com.contextlogic.wish.ui.components.navigation:
//            ActionMenuItem, NavigationBarWrapper, NavigationBarButtonCallback

public class ActionBarWrapper
{

    private ActionBar actionBar;
    private RootActivity activity;
    private HashMap callbackDict;
    private String subtitle;
    private View titleView;

    public ActionBarWrapper(RootActivity rootactivity)
    {
        actionBar = rootactivity.getSupportActionBar();
        activity = rootactivity;
    }

    public void addMenuItem(ActionMenuItem actionmenuitem)
    {
        if (callbackDict == null)
        {
            callbackDict = new LinkedHashMap();
        }
        callbackDict.put(actionmenuitem.getId(), actionmenuitem);
        refreshMenu();
    }

    public void clearRightButtons()
    {
        callbackDict = null;
        refreshMenu();
    }

    public void clearTitle()
    {
        if (!isActiveBar())
        {
            return;
        } else
        {
            setTitle(null);
            return;
        }
    }

    public void clearTitleView()
    {
        if (!isActiveBar())
        {
            return;
        } else
        {
            android.support.v7.app.ActionBar.LayoutParams layoutparams = new android.support.v7.app.ActionBar.LayoutParams(0, 0);
            activity.getSupportActionBar().setCustomView(new View(activity), layoutparams);
            return;
        }
    }

    public boolean isActiveBar()
    {
        NavigationBarWrapper navigationbarwrapper = activity.getActiveBar();
        return navigationbarwrapper != null && navigationbarwrapper.getActionBarWrapper() == this;
    }

    public boolean onMenuItemClicked(int i)
    {
        if (callbackDict != null)
        {
            ActionMenuItem actionmenuitem = (ActionMenuItem)callbackDict.get(Integer.valueOf(i));
            if (actionmenuitem != null)
            {
                actionmenuitem.getCallback().onMenuItemClicked();
                return true;
            }
        }
        return false;
    }

    public void refreshLogo()
    {
        activity.refreshBadgeCount();
    }

    public void refreshMenu()
    {
        if (!isActiveBar())
        {
            return;
        }
        boolean flag;
        if (titleView != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateActionBarDisplayOptions(flag);
        activity.supportInvalidateOptionsMenu();
    }

    public void setBackButtonEnabled(boolean flag)
    {
        if (!isActiveBar())
        {
            return;
        } else
        {
            activity.getSupportActionBar().setDisplayHomeAsUpEnabled(flag);
            return;
        }
    }

    public void setBarColor(WishNavigationBar.NavigationBarColor navigationbarcolor)
    {
        if (!isActiveBar())
        {
            return;
        }
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor = new int[WishNavigationBar.NavigationBarColor.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor[WishNavigationBar.NavigationBarColor.Main.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        _cls1..SwitchMap.com.contextlogic.wish.ui.components.navigation.WishNavigationBar.NavigationBarColor[navigationbarcolor.ordinal()];
        JVM INSTR tableswitch 1 1: default 36
    //                   1 65;
           goto _L1 _L2
_L1:
        navigationbarcolor = new ColorDrawable(activity.getResources().getColor(0x7f0c00c0));
_L4:
        actionBar.setBackgroundDrawable(navigationbarcolor);
        return;
_L2:
        navigationbarcolor = new ColorDrawable(activity.getResources().getColor(0x7f0c00bf));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setTitle(String s)
    {
        if (!isActiveBar())
        {
            return;
        } else
        {
            actionBar.setTitle(s);
            return;
        }
    }

    public void setTitle(String s, String s1)
    {
        if (!isActiveBar())
        {
            return;
        } else
        {
            setTitle(s);
            subtitle = s1;
            return;
        }
    }

    public void setTitleView(View view, android.support.v7.app.ActionBar.LayoutParams layoutparams)
    {
        if (!isActiveBar())
        {
            return;
        }
        android.support.v7.app.ActionBar.LayoutParams layoutparams1 = layoutparams;
        if (layoutparams == null)
        {
            layoutparams1 = new android.support.v7.app.ActionBar.LayoutParams(-2, -1, 1);
        }
        titleView = view;
        if (view != null)
        {
            activity.getSupportActionBar().setCustomView(view, layoutparams1);
        }
        refreshMenu();
    }

    public void setUpMenu(Menu menu)
    {
        while (!isActiveBar() || callbackDict == null) 
        {
            return;
        }
        Iterator iterator = callbackDict.values().iterator();
        while (iterator.hasNext()) 
        {
            ActionMenuItem actionmenuitem = (ActionMenuItem)iterator.next();
            MenuItem menuitem = menu.add(0, actionmenuitem.getId().intValue(), 0, actionmenuitem.getTitle()).setIcon(actionmenuitem.getResourceId());
            int i;
            if (actionmenuitem.isOverflow())
            {
                i = 0;
            } else
            {
                i = 2;
            }
            MenuItemCompat.setShowAsAction(menuitem, i);
        }
        actionBar.setSubtitle(subtitle);
    }

    public void updateActionBarDisplayOptions(boolean flag)
    {
        if (!isActiveBar())
        {
            return;
        } else
        {
            activity.getSupportActionBar().setDisplayShowCustomEnabled(flag);
            return;
        }
    }
}
