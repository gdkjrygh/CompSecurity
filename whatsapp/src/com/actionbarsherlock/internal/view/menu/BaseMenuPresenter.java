// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.actionbarsherlock.ActionBarSherlock;
import java.util.ArrayList;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuPresenter, MenuBuilder, MenuView, MenuItemImpl, 
//            SubMenuBuilder

public abstract class BaseMenuPresenter
    implements MenuPresenter
{

    private static final boolean IS_HONEYCOMB;
    private MenuPresenter.Callback mCallback;
    protected Context mContext;
    private int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    protected MenuBuilder mMenu;
    private int mMenuLayoutRes;
    protected MenuView mMenuView;
    protected Context mSystemContext;
    protected LayoutInflater mSystemInflater;

    public BaseMenuPresenter(Context context, int i, int j)
    {
        mSystemContext = context;
        mSystemInflater = LayoutInflater.from(context);
        mMenuLayoutRes = i;
        mItemLayoutRes = j;
    }

    protected void addItemView(View view, int i)
    {
        ViewGroup viewgroup = (ViewGroup)view.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(view);
        }
        ((ViewGroup)mMenuView).addView(view, i);
    }

    public abstract void bindItemView(MenuItemImpl menuitemimpl, MenuView.ItemView itemview);

    public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public MenuView.ItemView createItemView(ViewGroup viewgroup)
    {
        return (MenuView.ItemView)mSystemInflater.inflate(mItemLayoutRes, viewgroup, false);
    }

    public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
    {
        return false;
    }

    protected boolean filterLeftoverView(ViewGroup viewgroup, int i)
    {
        viewgroup.removeViewAt(i);
        return true;
    }

    public boolean flagActionItems()
    {
        return false;
    }

    public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
    {
label0:
        {
            if (view instanceof MenuView.ItemView)
            {
                view = (MenuView.ItemView)view;
                if (MenuBuilder.a == 0)
                {
                    break label0;
                }
            }
            view = createItemView(viewgroup);
        }
        bindItemView(menuitemimpl, view);
        return (View)view;
    }

    public MenuView getMenuView(ViewGroup viewgroup)
    {
        if (mMenuView == null)
        {
            mMenuView = (MenuView)mSystemInflater.inflate(mMenuLayoutRes, viewgroup, false);
            mMenuView.initialize(mMenu);
            updateMenuView(true);
        }
        return mMenuView;
    }

    public void initForMenu(Context context, MenuBuilder menubuilder)
    {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mMenu = menubuilder;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mCallback != null)
        {
            mCallback.onCloseMenu(menubuilder, flag);
        }
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        if (mCallback != null)
        {
            return mCallback.onOpenSubMenu(submenubuilder);
        } else
        {
            return false;
        }
    }

    public void setCallback(MenuPresenter.Callback callback)
    {
        mCallback = callback;
    }

    public void setId(int i)
    {
        mId = i;
    }

    public boolean shouldIncludeItem(int i, MenuItemImpl menuitemimpl)
    {
        return true;
    }

    public void updateMenuView(boolean flag)
    {
        ViewGroup viewgroup;
        int l;
        l = MenuBuilder.a;
        viewgroup = (ViewGroup)mMenuView;
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist;
        int i;
        int k;
        int i1;
        if (mMenu == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        mMenu.flagActionItems();
        arraylist = mMenu.getVisibleItems();
        i1 = arraylist.size();
        k = 0;
        i = 0;
_L6:
        int j = i;
        if (k >= i1) goto _L4; else goto _L3
_L3:
        MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(k);
        j = i;
        if (shouldIncludeItem(i, menuitemimpl1))
        {
            MenuItemImpl menuitemimpl;
            View view;
            View view1;
            if (ActionBarSherlock.isRtl)
            {
                j = viewgroup.getChildCount() - i - 1;
            } else
            {
                j = i;
            }
            view = viewgroup.getChildAt(j);
            if (view instanceof MenuView.ItemView)
            {
                menuitemimpl = ((MenuView.ItemView)view).getItemData();
            } else
            {
                menuitemimpl = null;
            }
            view1 = getItemView(menuitemimpl1, view, viewgroup);
            if (menuitemimpl1 != menuitemimpl)
            {
                view1.setPressed(false);
                if (IS_HONEYCOMB)
                {
                    view1.jumpDrawablesToCurrentState();
                }
            }
            if (view1 != view)
            {
                if (ActionBarSherlock.isRtl)
                {
                    j = 0;
                } else
                {
                    j = i;
                }
                addItemView(view1, j);
            }
            j = i + 1;
        }
        if (l == 0) goto _L5; else goto _L4
_L4:
        while (j < viewgroup.getChildCount()) 
        {
            if (ActionBarSherlock.isRtl)
            {
                i = 0;
            } else
            {
                i = j;
            }
            if (!filterLeftoverView(viewgroup, i))
            {
                j++;
                if (l != 0)
                {
                    return;
                }
            }
        }
          goto _L1
_L5:
        k++;
        i = j;
          goto _L6
        j = 0;
          goto _L4
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_HONEYCOMB = flag;
    }
}
