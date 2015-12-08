// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.os.Handler;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.walmart.android.utils.ViewUtil;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.walmart.android.app.main:
//            SearchActionController

public static class mExpanded
    implements android.support.v4.view., android.support.v7.widget.er
{

    private boolean mExpanded;
    private String mInitialQuery;
    private Menu mMenu;
    private int mSearchId;
    private List mSearchItems;
    private SparseBooleanArray mVisibility;

    public boolean onClose()
    {
        (new Handler()).post(new Runnable() {

            final SearchActionController.ExpandHandler this$0;

            public void run()
            {
                MenuItem menuitem = mMenu.findItem(mSearchId);
                if (menuitem != null)
                {
                    MenuItemCompat.collapseActionView(menuitem);
                }
            }

            
            {
                this$0 = SearchActionController.ExpandHandler.this;
                super();
            }
        });
        return false;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        if (mExpanded)
        {
            mExpanded = false;
            for (int i = 0; i < mMenu.size(); i++)
            {
                menuitem = mMenu.getItem(i);
                menuitem.setVisible(mVisibility.get(menuitem.getItemId(), menuitem.isVisible()));
            }

            ((SearchView)MenuItemCompat.getActionView(mMenu.findItem(mSearchId))).onActionViewCollapsed();
        }
        return true;
    }

    public boolean onMenuItemActionExpand(final MenuItem searchView)
    {
        if (!mExpanded)
        {
            mExpanded = true;
            int i = 0;
            while (i < mMenu.size()) 
            {
                searchView = mMenu.getItem(i);
                int j = searchView.getItemId();
                mVisibility.put(j, searchView.isVisible());
                if (mSearchItems.contains(Integer.valueOf(j)))
                {
                    searchView.setVisible(true);
                } else
                if (j != mSearchId)
                {
                    searchView.setVisible(false);
                }
                i++;
            }
            searchView = (SearchView)MenuItemCompat.getActionView(mMenu.findItem(mSearchId));
            searchView.onActionViewExpanded();
            if (!TextUtils.isEmpty(mInitialQuery))
            {
                searchView.setQuery(mInitialQuery, false);
                mInitialQuery = null;
            }
            searchView.setOnQueryTextFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                final SearchActionController.ExpandHandler this$0;
                final SearchView val$searchView;

                public void onFocusChange(View view, boolean flag)
                {
                    if (!flag)
                    {
                        ViewUtil.hideKeyboard(searchView);
                    }
                }

            
            {
                this$0 = SearchActionController.ExpandHandler.this;
                searchView = searchview;
                super();
            }
            });
        }
        return true;
    }



    public transient _cls2.val.searchView(Menu menu, String s, int i, Integer ainteger[])
    {
        mMenu = menu;
        mInitialQuery = s;
        mSearchId = i;
        mSearchItems = Arrays.asList(ainteger);
        mVisibility = new SparseBooleanArray(mMenu.size());
        mExpanded = false;
    }
}
