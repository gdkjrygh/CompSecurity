// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;

import android.content.res.Resources;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.View;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.activity.root.RootActivitySearchManager;
import com.contextlogic.wish.ui.components.text.AutoResizeTextView;

// Referenced classes of package com.contextlogic.wish.ui.components.navigation:
//            ActionBarWrapper, WishNavigationBarWrapper, ActionMenuItem, NavigationBarLogoTitle, 
//            WishNavigationBar, NavigationBarButtonCallback

public class NavigationBarWrapper
{

    private ActionBarWrapper actionBarWrapper;
    private RootActivity activity;
    private boolean backButtonEnabled;
    private WishNavigationBar.NavigationBarColor barColor;
    private boolean hasSearchView;
    private android.support.v7.app.ActionBar.LayoutParams layoutParams;
    private RootActivitySearchManager searchManager;
    private String subtitle;
    private String title;
    private View titleView;
    private boolean useWishNavigationBar;
    private WishNavigationBarWrapper wishNavigationBarWrapper;

    public NavigationBarWrapper(RootActivity rootactivity, WishNavigationBar wishnavigationbar)
    {
        activity = rootactivity;
        actionBarWrapper = new ActionBarWrapper(rootactivity);
        wishNavigationBarWrapper = new WishNavigationBarWrapper(wishnavigationbar);
        useWishNavigationBar = false;
        backButtonEnabled = true;
        searchManager = new RootActivitySearchManager(rootactivity, true);
    }

    public void addMenuItem(String s, int i, NavigationBarButtonCallback navigationbarbuttoncallback, boolean flag)
    {
        s = new ActionMenuItem(s, i, navigationbarbuttoncallback, flag);
        if (useWishNavigationBar)
        {
            wishNavigationBarWrapper.addMenuItem(s, barColor);
            return;
        } else
        {
            actionBarWrapper.addMenuItem(s);
            return;
        }
    }

    public void apply()
    {
        while (useWishNavigationBar || !actionBarWrapper.isActiveBar()) 
        {
            return;
        }
        actionBarWrapper.setTitle(title, subtitle);
        if (barColor != null)
        {
            actionBarWrapper.setBarColor(barColor);
        }
        if (titleView != null)
        {
            actionBarWrapper.setTitleView(titleView, layoutParams);
        } else
        {
            actionBarWrapper.clearTitleView();
        }
        actionBarWrapper.setBackButtonEnabled(backButtonEnabled);
        actionBarWrapper.refreshMenu();
        actionBarWrapper.refreshLogo();
    }

    public void clearRightButtons()
    {
        if (useWishNavigationBar)
        {
            wishNavigationBarWrapper.clearRightButtons();
            return;
        } else
        {
            actionBarWrapper.clearRightButtons();
            return;
        }
    }

    public ActionBarWrapper getActionBarWrapper()
    {
        return actionBarWrapper;
    }

    public WishNavigationBar.NavigationBarColor getBarColor()
    {
        return barColor;
    }

    public String getTitle()
    {
        return title;
    }

    public WishNavigationBarWrapper getWishNavigationBarWrapper()
    {
        return wishNavigationBarWrapper;
    }

    public boolean hasSearchView()
    {
        return hasSearchView;
    }

    public boolean isBackButtonEnabled()
    {
        return backButtonEnabled;
    }

    public boolean isUseWishNavigationBar()
    {
        return useWishNavigationBar;
    }

    public boolean onMenuItemClicked(int i)
    {
        return actionBarWrapper.onMenuItemClicked(i);
    }

    public void setBackButtonEnabled(boolean flag)
    {
        backButtonEnabled = flag;
        actionBarWrapper.setBackButtonEnabled(flag);
    }

    public void setBarColor(WishNavigationBar.NavigationBarColor navigationbarcolor)
    {
        barColor = navigationbarcolor;
        if (useWishNavigationBar)
        {
            wishNavigationBarWrapper.setBarColor(navigationbarcolor);
            return;
        } else
        {
            actionBarWrapper.setBarColor(navigationbarcolor);
            return;
        }
    }

    public void setLeftButton(View view)
    {
        if (useWishNavigationBar)
        {
            wishNavigationBarWrapper.setLeftButton(view);
        }
    }

    public void setMenuItem(String s, int i, NavigationBarButtonCallback navigationbarbuttoncallback)
    {
        clearRightButtons();
        addMenuItem(s, i, navigationbarbuttoncallback, false);
    }

    public void setResizedTitle(String s)
    {
        AutoResizeTextView autoresizetextview = new AutoResizeTextView(activity);
        autoresizetextview.setSingleLine(true);
        autoresizetextview.setGravity(16);
        autoresizetextview.setTextColor(activity.getResources().getColor(0x7f0c00e8));
        autoresizetextview.setTextSize(activity.getResources().getDimension(0x7f080005));
        autoresizetextview.setText(s);
        setTitleView(autoresizetextview, new android.support.v7.app.ActionBar.LayoutParams(3));
    }

    public void setTitle(String s)
    {
        title = s;
        titleView = null;
        hasSearchView = false;
        searchManager.destroySearchView();
        if (useWishNavigationBar)
        {
            wishNavigationBarWrapper.setTitle(s);
            return;
        } else
        {
            actionBarWrapper.clearTitleView();
            actionBarWrapper.setTitle(s);
            return;
        }
    }

    public void setTitle(String s, String s1)
    {
        subtitle = s1;
        title = s;
        titleView = null;
        hasSearchView = false;
        searchManager.destroySearchView();
        if (useWishNavigationBar)
        {
            wishNavigationBarWrapper.setTitle(s, s1);
            return;
        } else
        {
            actionBarWrapper.clearTitleView();
            actionBarWrapper.setTitle(s, s1);
            return;
        }
    }

    public void setTitleLogo()
    {
        if (WishApplication.getAppInstance().isWishApp())
        {
            android.support.v7.app.ActionBar.LayoutParams layoutparams = new android.support.v7.app.ActionBar.LayoutParams(3);
            setTitleView(new NavigationBarLogoTitle(activity), layoutparams);
            return;
        } else
        {
            setTitle(WishApplication.getAppInstance().getAppName());
            return;
        }
    }

    public void setTitleSearchView(boolean flag)
    {
        searchManager.destroySearchView();
        SearchView searchview = searchManager.initializeSearchView(flag);
        searchview.setFocusable(false);
        searchview.setFocusableInTouchMode(false);
        searchview.setQueryHint(activity.getString(0x7f06039b));
        android.support.v7.app.ActionBar.LayoutParams layoutparams = new android.support.v7.app.ActionBar.LayoutParams(-1, -1, 3);
        hasSearchView = true;
        setTitleView(searchview, layoutparams);
    }

    public void setTitleView(View view)
    {
        setTitleView(view, null);
    }

    public void setTitleView(View view, android.support.v7.app.ActionBar.LayoutParams layoutparams)
    {
        if (!(view instanceof SearchView))
        {
            hasSearchView = false;
            searchManager.destroySearchView();
        }
        titleView = view;
        layoutParams = layoutparams;
        title = null;
        subtitle = null;
        if (useWishNavigationBar)
        {
            wishNavigationBarWrapper.setTitleView(view);
            return;
        } else
        {
            actionBarWrapper.clearTitle();
            actionBarWrapper.setTitleView(view, layoutparams);
            return;
        }
    }

    public void setUseWishNavigationController(boolean flag)
    {
        useWishNavigationBar = flag;
    }

    public void setVisibility(int i)
    {
        if (useWishNavigationBar)
        {
            wishNavigationBarWrapper.setVisibility(i);
        }
    }

    public void setupMenu(Menu menu)
    {
        if (useWishNavigationBar)
        {
            return;
        } else
        {
            actionBarWrapper.setUpMenu(menu);
            return;
        }
    }
}
