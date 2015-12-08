// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuPopupHelper, MenuBuilder, MenuItemImpl, ListMenuItemView

private class findExpandedIndex extends BaseAdapter
{

    private MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    final MenuPopupHelper this$0;

    void findExpandedIndex()
    {
        MenuItemImpl menuitemimpl = MenuPopupHelper.access$300(MenuPopupHelper.this).getExpandedItem();
        if (menuitemimpl != null)
        {
            ArrayList arraylist = MenuPopupHelper.access$300(MenuPopupHelper.this).getNonActionItems();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((MenuItemImpl)arraylist.get(i) == menuitemimpl)
                {
                    mExpandedIndex = i;
                    return;
                }
            }

        }
        mExpandedIndex = -1;
    }

    public int getCount()
    {
        ArrayList arraylist;
        if (MenuPopupHelper.access$100(MenuPopupHelper.this))
        {
            arraylist = mAdapterMenu.getNonActionItems();
        } else
        {
            arraylist = mAdapterMenu.getVisibleItems();
        }
        if (mExpandedIndex < 0)
        {
            return arraylist.size();
        } else
        {
            return arraylist.size() - 1;
        }
    }

    public MenuItemImpl getItem(int i)
    {
        ArrayList arraylist;
        int j;
        if (MenuPopupHelper.access$100(MenuPopupHelper.this))
        {
            arraylist = mAdapterMenu.getNonActionItems();
        } else
        {
            arraylist = mAdapterMenu.getVisibleItems();
        }
        j = i;
        if (mExpandedIndex >= 0)
        {
            j = i;
            if (i >= mExpandedIndex)
            {
                j = i + 1;
            }
        }
        return (MenuItemImpl)arraylist.get(j);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = MenuPopupHelper.access$200(MenuPopupHelper.this).inflate(MenuPopupHelper.ITEM_LAYOUT, viewgroup, false);
        }
        view = (this._cls0)view1;
        if (mForceShowIcon)
        {
            ((ListMenuItemView)view1).setForceShowIcon(true);
        }
        view.(getItem(i), 0);
        return view1;
    }

    public void notifyDataSetChanged()
    {
        findExpandedIndex();
        super.notifyDataSetChanged();
    }


    public (MenuBuilder menubuilder)
    {
        this$0 = MenuPopupHelper.this;
        super();
        mExpandedIndex = -1;
        mAdapterMenu = menubuilder;
        findExpandedIndex();
    }
}
