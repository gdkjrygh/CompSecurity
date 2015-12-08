// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.internal.widget.ToolbarWidgetWrapper;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.WindowCallbackWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.app:
//            WindowCallback, NavItemSelectedListener

public class ToolbarActionBar extends ActionBar
{
    private final class ActionMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        private boolean mClosingActionMenu;
        final ToolbarActionBar this$0;

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (mClosingActionMenu)
            {
                return;
            }
            mClosingActionMenu = true;
            mToolbar.dismissPopupMenus();
            if (mWindowCallback != null)
            {
                mWindowCallback.onPanelClosed(8, menubuilder);
            }
            mClosingActionMenu = false;
        }

        public boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (mWindowCallback != null)
            {
                mWindowCallback.onMenuOpened(8, menubuilder);
                return true;
            } else
            {
                return false;
            }
        }

        private ActionMenuPresenterCallback()
        {
            this$0 = ToolbarActionBar.this;
            super();
        }

    }

    private final class MenuBuilderCallback
        implements android.support.v7.internal.view.menu.MenuBuilder.Callback
    {

        final ToolbarActionBar this$0;

        public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
        {
            return false;
        }

        public void onMenuModeChange(MenuBuilder menubuilder)
        {
            if (mWindowCallback != null)
            {
                if (mToolbar.isOverflowMenuShowing())
                {
                    mWindowCallback.onPanelClosed(8, menubuilder);
                } else
                if (mWindowCallback.onPreparePanel(0, null, menubuilder))
                {
                    mWindowCallback.onMenuOpened(8, menubuilder);
                    return;
                }
            }
        }

        private MenuBuilderCallback()
        {
            this$0 = ToolbarActionBar.this;
            super();
        }

    }

    private final class PanelMenuPresenterCallback
        implements android.support.v7.internal.view.menu.MenuPresenter.Callback
    {

        final ToolbarActionBar this$0;

        public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
        {
            if (mWindowCallback != null)
            {
                mWindowCallback.onPanelClosed(0, menubuilder);
            }
            mWindow.closePanel(0);
        }

        public boolean onOpenSubMenu(MenuBuilder menubuilder)
        {
            if (menubuilder == null && mWindowCallback != null)
            {
                mWindowCallback.onMenuOpened(0, menubuilder);
            }
            return true;
        }

        private PanelMenuPresenterCallback()
        {
            this$0 = ToolbarActionBar.this;
            super();
        }

    }

    private class ToolbarCallbackWrapper extends WindowCallbackWrapper
    {

        final ToolbarActionBar this$0;

        public View onCreatePanelView(int i)
        {
            i;
            JVM INSTR tableswitch 0 0: default 20
        //                       0 26;
               goto _L1 _L2
_L1:
            return super.onCreatePanelView(i);
_L2:
            if (!mToolbarMenuPrepared)
            {
                populateOptionsMenu();
                mToolbar.removeCallbacks(mMenuInvalidator);
            }
            if (mToolbarMenuPrepared && mWindowCallback != null)
            {
                Menu menu = getMenu();
                if (mWindowCallback.onPreparePanel(i, null, menu) && mWindowCallback.onMenuOpened(i, menu))
                {
                    return getListMenuView(menu);
                }
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public boolean onPreparePanel(int i, View view, Menu menu)
        {
            boolean flag = super.onPreparePanel(i, view, menu);
            if (flag && !mToolbarMenuPrepared)
            {
                mDecorToolbar.setMenuPrepared();
                mToolbarMenuPrepared = true;
            }
            return flag;
        }

        public ToolbarCallbackWrapper(WindowCallback windowcallback)
        {
            this$0 = ToolbarActionBar.this;
            super(windowcallback);
        }
    }


    private DecorToolbar mDecorToolbar;
    private boolean mLastMenuVisibility;
    private ListMenuPresenter mListMenuPresenter;
    private boolean mMenuCallbackSet;
    private final android.support.v7.widget.Toolbar.OnMenuItemClickListener mMenuClicker = new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {

        final ToolbarActionBar this$0;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            return mWindowCallback.onMenuItemSelected(0, menuitem);
        }

            
            {
                this$0 = ToolbarActionBar.this;
                super();
            }
    };
    private final Runnable mMenuInvalidator = new Runnable() {

        final ToolbarActionBar this$0;

        public void run()
        {
            populateOptionsMenu();
        }

            
            {
                this$0 = ToolbarActionBar.this;
                super();
            }
    };
    private ArrayList mMenuVisibilityListeners;
    private Toolbar mToolbar;
    private boolean mToolbarMenuPrepared;
    private Window mWindow;
    private WindowCallback mWindowCallback;

    public ToolbarActionBar(Toolbar toolbar, CharSequence charsequence, Window window, WindowCallback windowcallback)
    {
        mMenuVisibilityListeners = new ArrayList();
        mToolbar = toolbar;
        mDecorToolbar = new ToolbarWidgetWrapper(toolbar, false);
        mWindowCallback = new ToolbarCallbackWrapper(windowcallback);
        mDecorToolbar.setWindowCallback(mWindowCallback);
        toolbar.setOnMenuItemClickListener(mMenuClicker);
        mDecorToolbar.setWindowTitle(charsequence);
        mWindow = window;
    }

    private View getListMenuView(Menu menu)
    {
        while (menu == null || mListMenuPresenter == null || mListMenuPresenter.getAdapter().getCount() <= 0) 
        {
            return null;
        }
        return (View)mListMenuPresenter.getMenuView(mToolbar);
    }

    private Menu getMenu()
    {
        if (!mMenuCallbackSet)
        {
            mToolbar.setMenuCallbacks(new ActionMenuPresenterCallback(), new MenuBuilderCallback());
            mMenuCallbackSet = true;
        }
        return mToolbar.getMenu();
    }

    public void addOnMenuVisibilityListener(android.support.v7.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.add(onmenuvisibilitylistener);
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab, int i)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab, int i, boolean flag)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void addTab(android.support.v7.app.ActionBar.Tab tab, boolean flag)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public boolean collapseActionView()
    {
        if (mToolbar.hasExpandedActionView())
        {
            mToolbar.collapseActionView();
            return true;
        } else
        {
            return false;
        }
    }

    public void dispatchMenuVisibilityChanged(boolean flag)
    {
        if (flag != mLastMenuVisibility)
        {
            mLastMenuVisibility = flag;
            int j = mMenuVisibilityListeners.size();
            int i = 0;
            while (i < j) 
            {
                ((android.support.v7.app.ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
                i++;
            }
        }
    }

    public View getCustomView()
    {
        return mDecorToolbar.getCustomView();
    }

    public int getDisplayOptions()
    {
        return mDecorToolbar.getDisplayOptions();
    }

    public float getElevation()
    {
        return ViewCompat.getElevation(mToolbar);
    }

    public int getHeight()
    {
        return mToolbar.getHeight();
    }

    public int getNavigationItemCount()
    {
        return 0;
    }

    public int getNavigationMode()
    {
        return 0;
    }

    public int getSelectedNavigationIndex()
    {
        return -1;
    }

    public android.support.v7.app.ActionBar.Tab getSelectedTab()
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public CharSequence getSubtitle()
    {
        return mToolbar.getSubtitle();
    }

    public android.support.v7.app.ActionBar.Tab getTabAt(int i)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public int getTabCount()
    {
        return 0;
    }

    public Context getThemedContext()
    {
        return mToolbar.getContext();
    }

    public CharSequence getTitle()
    {
        return mToolbar.getTitle();
    }

    public WindowCallback getWrappedWindowCallback()
    {
        return mWindowCallback;
    }

    public void hide()
    {
        mToolbar.setVisibility(8);
    }

    public boolean invalidateOptionsMenu()
    {
        mToolbar.removeCallbacks(mMenuInvalidator);
        ViewCompat.postOnAnimation(mToolbar, mMenuInvalidator);
        return true;
    }

    public boolean isShowing()
    {
        return mToolbar.getVisibility() == 0;
    }

    public boolean isTitleTruncated()
    {
        return super.isTitleTruncated();
    }

    public android.support.v7.app.ActionBar.Tab newTab()
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public boolean onMenuKeyEvent(KeyEvent keyevent)
    {
        if (keyevent.getAction() == 1)
        {
            openOptionsMenu();
        }
        return true;
    }

    public boolean openOptionsMenu()
    {
        return mToolbar.showOverflowMenu();
    }

    void populateOptionsMenu()
    {
        MenuBuilder menubuilder;
        Menu menu;
        menubuilder = null;
        menu = getMenu();
        if (menu instanceof MenuBuilder)
        {
            menubuilder = (MenuBuilder)menu;
        }
        if (menubuilder != null)
        {
            menubuilder.stopDispatchingItemsChanged();
        }
        menu.clear();
        if (!mWindowCallback.onCreatePanelMenu(0, menu) || !mWindowCallback.onPreparePanel(0, null, menu))
        {
            menu.clear();
        }
        if (menubuilder != null)
        {
            menubuilder.startDispatchingItemsChanged();
        }
        return;
        Exception exception;
        exception;
        if (menubuilder != null)
        {
            menubuilder.startDispatchingItemsChanged();
        }
        throw exception;
    }

    public void removeAllTabs()
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void removeOnMenuVisibilityListener(android.support.v7.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.remove(onmenuvisibilitylistener);
    }

    public void removeTab(android.support.v7.app.ActionBar.Tab tab)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void removeTabAt(int i)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void selectTab(android.support.v7.app.ActionBar.Tab tab)
    {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mToolbar.setBackgroundDrawable(drawable);
    }

    public void setCustomView(int i)
    {
        setCustomView(LayoutInflater.from(mToolbar.getContext()).inflate(i, mToolbar, false));
    }

    public void setCustomView(View view)
    {
        setCustomView(view, new android.support.v7.app.ActionBar.LayoutParams(-2, -2));
    }

    public void setCustomView(View view, android.support.v7.app.ActionBar.LayoutParams layoutparams)
    {
        view.setLayoutParams(layoutparams);
        mDecorToolbar.setCustomView(view);
    }

    public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
    {
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 4);
    }

    public void setDisplayOptions(int i)
    {
        setDisplayOptions(i, -1);
    }

    public void setDisplayOptions(int i, int j)
    {
        int k = mDecorToolbar.getDisplayOptions();
        mDecorToolbar.setDisplayOptions(i & j | ~j & k);
    }

    public void setDisplayShowCustomEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 16);
    }

    public void setDisplayShowHomeEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 2);
    }

    public void setDisplayShowTitleEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 8);
    }

    public void setDisplayUseLogoEnabled(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        setDisplayOptions(i, 1);
    }

    public void setElevation(float f)
    {
        ViewCompat.setElevation(mToolbar, f);
    }

    public void setHomeActionContentDescription(int i)
    {
        mDecorToolbar.setNavigationContentDescription(i);
    }

    public void setHomeActionContentDescription(CharSequence charsequence)
    {
        mDecorToolbar.setNavigationContentDescription(charsequence);
    }

    public void setHomeAsUpIndicator(int i)
    {
        mToolbar.setNavigationIcon(i);
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        mToolbar.setNavigationIcon(drawable);
    }

    public void setHomeButtonEnabled(boolean flag)
    {
    }

    public void setIcon(int i)
    {
        mDecorToolbar.setIcon(i);
    }

    public void setIcon(Drawable drawable)
    {
        mDecorToolbar.setIcon(drawable);
    }

    public void setListMenuPresenter(ListMenuPresenter listmenupresenter)
    {
        Object obj = getMenu();
        if (obj instanceof MenuBuilder)
        {
            obj = (MenuBuilder)obj;
            if (mListMenuPresenter != null)
            {
                mListMenuPresenter.setCallback(null);
                ((MenuBuilder) (obj)).removeMenuPresenter(mListMenuPresenter);
            }
            mListMenuPresenter = listmenupresenter;
            if (listmenupresenter != null)
            {
                listmenupresenter.setCallback(new PanelMenuPresenterCallback());
                ((MenuBuilder) (obj)).addMenuPresenter(listmenupresenter);
            }
        }
    }

    public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, android.support.v7.app.ActionBar.OnNavigationListener onnavigationlistener)
    {
        mDecorToolbar.setDropdownParams(spinneradapter, new NavItemSelectedListener(onnavigationlistener));
    }

    public void setLogo(int i)
    {
        mDecorToolbar.setLogo(i);
    }

    public void setLogo(Drawable drawable)
    {
        mDecorToolbar.setLogo(drawable);
    }

    public void setNavigationMode(int i)
    {
        if (i == 2)
        {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        } else
        {
            mDecorToolbar.setNavigationMode(i);
            return;
        }
    }

    public void setSelectedNavigationItem(int i)
    {
        switch (mDecorToolbar.getNavigationMode())
        {
        default:
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");

        case 1: // '\001'
            mDecorToolbar.setDropdownSelectedPosition(i);
            break;
        }
    }

    public void setShowHideAnimationEnabled(boolean flag)
    {
    }

    public void setSplitBackgroundDrawable(Drawable drawable)
    {
    }

    public void setStackedBackgroundDrawable(Drawable drawable)
    {
    }

    public void setSubtitle(int i)
    {
        DecorToolbar decortoolbar = mDecorToolbar;
        CharSequence charsequence;
        if (i != 0)
        {
            charsequence = mDecorToolbar.getContext().getText(i);
        } else
        {
            charsequence = null;
        }
        decortoolbar.setSubtitle(charsequence);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mDecorToolbar.setSubtitle(charsequence);
    }

    public void setTitle(int i)
    {
        DecorToolbar decortoolbar = mDecorToolbar;
        CharSequence charsequence;
        if (i != 0)
        {
            charsequence = mDecorToolbar.getContext().getText(i);
        } else
        {
            charsequence = null;
        }
        decortoolbar.setTitle(charsequence);
    }

    public void setTitle(CharSequence charsequence)
    {
        mDecorToolbar.setTitle(charsequence);
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        mDecorToolbar.setWindowTitle(charsequence);
    }

    public void show()
    {
        mToolbar.setVisibility(0);
    }

    public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return mWindowCallback.startActionMode(callback);
    }





/*
    static boolean access$102(ToolbarActionBar toolbaractionbar, boolean flag)
    {
        toolbaractionbar.mToolbarMenuPrepared = flag;
        return flag;
    }

*/





}
