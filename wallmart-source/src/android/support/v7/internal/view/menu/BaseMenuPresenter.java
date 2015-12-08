// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuPresenter, MenuView, a, MenuItemImpl, 
//            b

public abstract class BaseMenuPresenter
    implements MenuPresenter
{

    private MenuPresenter.Callback mCallback;
    protected Context mContext;
    private int mId;
    protected LayoutInflater mInflater;
    private int mItemLayoutRes;
    protected a mMenu;
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

    public boolean collapseItemActionView(a a1, MenuItemImpl menuitemimpl)
    {
        return false;
    }

    public MenuView.ItemView createItemView(ViewGroup viewgroup)
    {
        return (MenuView.ItemView)mSystemInflater.inflate(mItemLayoutRes, viewgroup, false);
    }

    public boolean expandItemActionView(a a1, MenuItemImpl menuitemimpl)
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

    public MenuPresenter.Callback getCallback()
    {
        return mCallback;
    }

    public int getId()
    {
        return mId;
    }

    public View getItemView(MenuItemImpl menuitemimpl, View view, ViewGroup viewgroup)
    {
        if (view instanceof MenuView.ItemView)
        {
            view = (MenuView.ItemView)view;
        } else
        {
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

    public void initForMenu(Context context, a a1)
    {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mMenu = a1;
    }

    public void onCloseMenu(a a1, boolean flag)
    {
        if (mCallback != null)
        {
            mCallback.onCloseMenu(a1, flag);
        }
    }

    public boolean onSubMenuSelected(b b)
    {
        if (mCallback != null)
        {
            return mCallback.onOpenSubMenu(b);
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
        ViewGroup viewgroup = (ViewGroup)mMenuView;
        if (viewgroup != null)
        {
            int j = 0;
            int i = 0;
            if (mMenu != null)
            {
                mMenu.k();
                ArrayList arraylist = mMenu.j();
                int l = arraylist.size();
                int k = 0;
                do
                {
                    j = i;
                    if (k >= l)
                    {
                        break;
                    }
                    MenuItemImpl menuitemimpl1 = (MenuItemImpl)arraylist.get(k);
                    j = i;
                    if (shouldIncludeItem(i, menuitemimpl1))
                    {
                        View view = viewgroup.getChildAt(i);
                        MenuItemImpl menuitemimpl;
                        View view1;
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
                            ViewCompat.jumpDrawablesToCurrentState(view1);
                        }
                        if (view1 != view)
                        {
                            addItemView(view1, i);
                        }
                        j = i + 1;
                    }
                    k++;
                    i = j;
                } while (true);
            }
            while (j < viewgroup.getChildCount()) 
            {
                if (!filterLeftoverView(viewgroup, j))
                {
                    j++;
                }
            }
        }
    }
}
