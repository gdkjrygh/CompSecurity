// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.text.Html;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import com.walmart.android.app.shop.search.ShopSearchCursorAdapter;
import com.walmart.android.utils.ViewUtil;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.walmart.android.app.main:
//            HomeActivity, SearchContentProvider

public class SearchActionController extends ActionProvider
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.support.v7.widget.SearchView.OnQueryTextListener, android.support.v7.widget.SearchView.OnSuggestionListener
{
    public static class ExpandHandler
        implements android.support.v4.view.MenuItemCompat.OnActionExpandListener, android.support.v7.widget.SearchView.OnCloseListener
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

                final ExpandHandler this$0;

                public void run()
                {
                    MenuItem menuitem = mMenu.findItem(mSearchId);
                    if (menuitem != null)
                    {
                        MenuItemCompat.collapseActionView(menuitem);
                    }
                }

            
            {
                this$0 = ExpandHandler.this;
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

        public boolean onMenuItemActionExpand(MenuItem menuitem)
        {
            if (!mExpanded)
            {
                mExpanded = true;
                int i = 0;
                while (i < mMenu.size()) 
                {
                    menuitem = mMenu.getItem(i);
                    int j = menuitem.getItemId();
                    mVisibility.put(j, menuitem.isVisible());
                    if (mSearchItems.contains(Integer.valueOf(j)))
                    {
                        menuitem.setVisible(true);
                    } else
                    if (j != mSearchId)
                    {
                        menuitem.setVisible(false);
                    }
                    i++;
                }
                menuitem = (SearchView)MenuItemCompat.getActionView(mMenu.findItem(mSearchId));
                menuitem.onActionViewExpanded();
                if (!TextUtils.isEmpty(mInitialQuery))
                {
                    menuitem.setQuery(mInitialQuery, false);
                    mInitialQuery = null;
                }
                menuitem.setOnQueryTextFocusChangeListener(menuitem. new android.view.View.OnFocusChangeListener() {

                    final ExpandHandler this$0;
                    final SearchView val$searchView;

                    public void onFocusChange(View view, boolean flag)
                    {
                        if (!flag)
                        {
                            ViewUtil.hideKeyboard(searchView);
                        }
                    }

            
            {
                this$0 = final_expandhandler;
                searchView = SearchView.this;
                super();
            }
                });
            }
            return true;
        }



        public transient ExpandHandler(Menu menu, String s, int i, Integer ainteger[])
        {
            mMenu = menu;
            mInitialQuery = s;
            mSearchId = i;
            mSearchItems = Arrays.asList(ainteger);
            mVisibility = new SparseBooleanArray(mMenu.size());
            mExpanded = false;
        }
    }


    private SearchView mActionView;
    private ShopSearchCursorAdapter mAdapter;
    private LoaderManager mLoaderManager;
    private String mQuery;

    public SearchActionController(Context context)
    {
        super(context);
    }

    private void disableActionModeForSearchView(SearchView searchview)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            searchview = (EditText)ViewUtil.findViewById(searchview, 0x7f10006c);
            if (searchview != null)
            {
                searchview.setCustomSelectionActionModeCallback(new android.view.ActionMode.Callback() {

                    final SearchActionController this$0;

                    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
                    {
                        return false;
                    }

                    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
                    {
                        return false;
                    }

                    public void onDestroyActionMode(ActionMode actionmode)
                    {
                    }

                    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
                    {
                        return false;
                    }

            
            {
                this$0 = SearchActionController.this;
                super();
            }
                });
            }
        }
    }

    private void resetQuery()
    {
        if (!TextUtils.isEmpty(mActionView.getQuery()))
        {
            mActionView.setQuery(null, false);
        }
    }

    private void restartLoader()
    {
        if (mLoaderManager != null)
        {
            mLoaderManager.restartLoader(0, null, this);
        }
    }

    public ShopSearchCursorAdapter getAdapter()
    {
        return mAdapter;
    }

    public View onCreateActionView()
    {
        Object obj = (SearchManager)getContext().getSystemService("search");
        mActionView = new SearchView(new ContextThemeWrapper(getContext(), 0x7f0b01da));
        obj = ((SearchManager) (obj)).getSearchableInfo(new ComponentName(getContext(), com/walmart/android/app/main/HomeActivity));
        mActionView.setSearchableInfo(((android.app.SearchableInfo) (obj)));
        mActionView.setOnQueryTextListener(this);
        mActionView.setOnSuggestionListener(this);
        obj = getContext().getString(0x7f09053e);
        mActionView.setQueryHint(Html.fromHtml(((String) (obj))));
        disableActionModeForSearchView(mActionView);
        mAdapter = new ShopSearchCursorAdapter(getContext(), new com.walmart.android.app.shop.search.ShopSearchCursorAdapter.OnRefinementListener() {

            final SearchActionController this$0;

            public void refinement(String s)
            {
                if (mActionView != null)
                {
                    mActionView.setQuery(s, false);
                }
            }

            
            {
                this$0 = SearchActionController.this;
                super();
            }
        });
        mActionView.setSuggestionsAdapter(mAdapter);
        restartLoader();
        return mActionView;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        android.net.Uri uri = SearchContentProvider.CONTENT_URI;
        bundle = null;
        String as[] = null;
        if (!TextUtils.isEmpty(mQuery))
        {
            bundle = " ?";
            as = new String[1];
            as[0] = mQuery;
        }
        return new CursorLoader(getContext(), uri, null, bundle, as, null);
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        if (mAdapter != null)
        {
            mAdapter.swapCursor(cursor);
        }
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        if (mAdapter != null)
        {
            mAdapter.swapCursor(null);
        }
    }

    public boolean onQueryTextChange(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = null;
        }
        while (mQuery == null && s == null || mQuery != null && mQuery.equals(s)) 
        {
            return true;
        }
        mQuery = s;
        restartLoader();
        return false;
    }

    public boolean onQueryTextSubmit(String s)
    {
        resetQuery();
        return false;
    }

    public boolean onSuggestionClick(int i)
    {
        resetQuery();
        return false;
    }

    public boolean onSuggestionSelect(int i)
    {
        return false;
    }

    public void setLoaderManager(LoaderManager loadermanager)
    {
        mLoaderManager = loadermanager;
        if (mAdapter != null)
        {
            restartLoader();
        }
    }

}
