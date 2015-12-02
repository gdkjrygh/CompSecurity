// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuBuilder, MenuPopupHelper, MenuItemImpl, ListMenuItemView

class findExpandedIndex extends BaseAdapter
{

    private MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    final MenuPopupHelper this$0;

    void findExpandedIndex()
    {
        MenuItemImpl menuitemimpl;
        int j;
        j = MenuBuilder.a;
        menuitemimpl = MenuPopupHelper.access$400(MenuPopupHelper.this).getExpandedItem();
        if (menuitemimpl == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int i;
        int k;
        arraylist = MenuPopupHelper.access$400(MenuPopupHelper.this).getNonActionItems();
        k = arraylist.size();
        i = 0;
_L6:
        if (i >= k) goto _L2; else goto _L3
_L3:
        if ((MenuItemImpl)arraylist.get(i) == menuitemimpl)
        {
            mExpandedIndex = i;
            return;
        }
        if (j == 0) goto _L4; else goto _L2
_L2:
        mExpandedIndex = -1;
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int getCount()
    {
        ArrayList arraylist;
        if (MenuPopupHelper.access$200(MenuPopupHelper.this))
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
        if (MenuPopupHelper.access$200(MenuPopupHelper.this))
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

    public Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = MenuPopupHelper.access$300(MenuPopupHelper.this).inflate(MenuPopupHelper.ITEM_LAYOUT, viewgroup, false);
        }
        viewgroup = (this._cls0)view;
        if (mForceShowIcon)
        {
            ((ListMenuItemView)view).setForceShowIcon(true);
        }
        viewgroup.(getItem(i), 0);
        return view;
    }


    public xObserver(MenuBuilder menubuilder)
    {
        this$0 = MenuPopupHelper.this;
        super();
        mExpandedIndex = -1;
        mAdapterMenu = menubuilder;
        registerDataSetObserver(new xObserver(MenuPopupHelper.this, null));
        findExpandedIndex();
    }
}
