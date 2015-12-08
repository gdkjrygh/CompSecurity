// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishTopSearchSpec;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity, RootActivitySearchSuggestionsAdapter

public class RootActivitySearchManager
{

    private boolean isStandaloneVersion;
    private RootActivity rootActivity;
    private SearchView searchView;
    private HashMap topSearchMapping;

    public RootActivitySearchManager(RootActivity rootactivity)
    {
        this(rootactivity, false);
    }

    public RootActivitySearchManager(RootActivity rootactivity, boolean flag)
    {
        rootActivity = rootactivity;
        isStandaloneVersion = flag;
    }

    private String getSearchQueryText()
    {
        while (searchView == null || searchView.getQuery() == null || searchView.getQuery().length() == 0) 
        {
            return null;
        }
        return searchView.getQuery().toString();
    }

    private void handleItemClick(Cursor cursor)
    {
        String s;
        String s1;
        s = cursor.getString(cursor.getColumnIndex("suggest_intent_action"));
        s1 = cursor.getString(cursor.getColumnIndex("suggest_text_1"));
        cursor = cursor.getString(cursor.getColumnIndex("suggest_intent_extra_data"));
        if (!s.equals("history")) goto _L2; else goto _L1
_L1:
        if (s1 == null) goto _L4; else goto _L3
_L3:
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_SEARCH_FRIEND.getValue()), null, null, null);
        if (topSearchMapping == null || !topSearchMapping.containsKey(s1.toUpperCase())) goto _L6; else goto _L5
_L5:
        handleTopSearchClick(s1, (WishTopSearchSpec)topSearchMapping.get(s1.toUpperCase()));
_L4:
        return;
_L6:
        handleSearchClick(s1);
        return;
_L2:
        if (s.equals("product"))
        {
            handleProductClick(new WishProduct(cursor));
            return;
        }
        if (s.equals("moreproduct"))
        {
            handleSearchClick();
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    private void handleProductClick(WishProduct wishproduct)
    {
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_SEARCH_PRODUCT.getValue()), null, null, null);
        RootActivity rootactivity = rootActivity;
        wishproduct = RootActivity.getProductDetailFragment(wishproduct, null, null, null);
        rootActivity.setContentFragment(wishproduct, false);
        if (!isStandaloneVersion)
        {
            rootActivity.endSearch();
            return;
        } else
        {
            rootActivity.hideKeyboard();
            return;
        }
    }

    private void handleSearchClick()
    {
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_SEARCH.getValue()), null, null, null);
        String s = getSearchQueryText();
        if (s != null)
        {
            handleSearchClick(s);
        }
    }

    private void handleSearchClick(String s)
    {
        updateSearchHistory(s);
        ProductFeedFragment productfeedfragment = new ProductFeedFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Search.ordinal());
        bundle.putString("ArgDataValue", s);
        bundle.putString("ArgDataTitle", s);
        productfeedfragment.setArguments(bundle);
        rootActivity.setContentFragment(productfeedfragment, false);
        if (!isStandaloneVersion)
        {
            rootActivity.endSearch();
            return;
        } else
        {
            rootActivity.hideKeyboard();
            return;
        }
    }

    private void handleTopSearchClick(String s, WishTopSearchSpec wishtopsearchspec)
    {
        updateSearchHistory(s);
        s = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(wishtopsearchspec.getAction()));
        if (s != null)
        {
            rootActivity.processDeepLink(s, false);
        }
        if (!isStandaloneVersion)
        {
            rootActivity.endSearch();
            return;
        } else
        {
            rootActivity.hideKeyboard();
            return;
        }
    }

    private void initializeTopSearches()
    {
        topSearchMapping = new HashMap();
        WishTopSearchSpec wishtopsearchspec;
        for (Iterator iterator = UserStatusManager.getInstance().getTopSearchSpecs().iterator(); iterator.hasNext(); topSearchMapping.put(wishtopsearchspec.getQuery().toUpperCase(), wishtopsearchspec))
        {
            wishtopsearchspec = (WishTopSearchSpec)iterator.next();
        }

    }

    private void updateSearchHistory(String s)
    {
        ArrayList arraylist = UserPreferences.getSearchHistory();
        byte byte0 = -1;
        int i = 0;
        do
        {
label0:
            {
                int j = byte0;
                if (i < arraylist.size())
                {
                    if (!((String)arraylist.get(i)).equalsIgnoreCase(s))
                    {
                        break label0;
                    }
                    j = i;
                }
                if (j != -1)
                {
                    arraylist.add(0, (String)arraylist.remove(j));
                } else
                {
                    arraylist.add(0, s);
                    if (arraylist.size() > 10)
                    {
                        while (arraylist.size() > 10) 
                        {
                            arraylist.remove(arraylist.size() - 1);
                        }
                    }
                }
                UserPreferences.setSearchHistory(arraylist);
                return;
            }
            i++;
        } while (true);
    }

    public void destroySearchView()
    {
        searchView = null;
    }

    public SearchView getSearchView()
    {
        return searchView;
    }

    public SearchView initializeSearchView()
    {
        return initializeSearchView(true);
    }

    public SearchView initializeSearchView(boolean flag)
    {
        initializeTopSearches();
        searchView = new SearchView(rootActivity);
        searchView.setIconifiedByDefault(false);
        searchView.setIconified(false);
        if (!flag)
        {
            searchView.clearFocus();
            searchView.setFocusable(false);
            searchView.setFocusableInTouchMode(false);
        }
        searchView.setOnQueryTextListener(new android.support.v7.widget.SearchView.OnQueryTextListener() {

            final RootActivitySearchManager this$0;

            public boolean onQueryTextChange(String s)
            {
                return false;
            }

            public boolean onQueryTextSubmit(String s)
            {
                handleSearchClick();
                return true;
            }

            
            {
                this$0 = RootActivitySearchManager.this;
                super();
            }
        });
        final RootActivitySearchSuggestionsAdapter adapter = RootActivitySearchSuggestionsAdapter.getHistoryCursor();
        adapter = new RootActivitySearchSuggestionsAdapter(rootActivity, adapter);
        searchView.setSuggestionsAdapter(adapter);
        searchView.setOnSuggestionListener(new android.support.v7.widget.SearchView.OnSuggestionListener() {

            final RootActivitySearchManager this$0;
            final RootActivitySearchSuggestionsAdapter val$adapter;

            public boolean onSuggestionClick(int i)
            {
                Cursor cursor = adapter.getCursor();
                if (cursor != null && cursor.moveToPosition(i))
                {
                    handleItemClick(cursor);
                }
                return true;
            }

            public boolean onSuggestionSelect(int i)
            {
                return false;
            }

            
            {
                this$0 = RootActivitySearchManager.this;
                adapter = rootactivitysearchsuggestionsadapter;
                super();
            }
        });
        final android.support.v7.widget.SearchView.SearchAutoComplete searchAutoCompleteView = (android.support.v7.widget.SearchView.SearchAutoComplete)searchView.findViewById(0x7f0d005c);
        if (searchAutoCompleteView != null)
        {
            searchAutoCompleteView.setThreshold(0);
            searchAutoCompleteView.setHintTextColor(rootActivity.getResources().getColor(0x7f0c00e8));
            searchAutoCompleteView.setTextColor(rootActivity.getResources().getColor(0x7f0c00e8));
            searchAutoCompleteView.setTextSize(1, 14F);
            if (flag)
            {
                searchAutoCompleteView.post(new Runnable() {

                    final RootActivitySearchManager this$0;
                    final android.support.v7.widget.SearchView.SearchAutoComplete val$searchAutoCompleteView;

                    public void run()
                    {
                        searchAutoCompleteView.showDropDown();
                    }

            
            {
                this$0 = RootActivitySearchManager.this;
                searchAutoCompleteView = searchautocomplete;
                super();
            }
                });
            } else
            {
                searchAutoCompleteView.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

                    final RootActivitySearchManager this$0;
                    final android.support.v7.widget.SearchView.SearchAutoComplete val$searchAutoCompleteView;

                    public void onFocusChange(View view, boolean flag1)
                    {
                        if (view == searchAutoCompleteView && flag1)
                        {
                            searchAutoCompleteView.post(new Runnable() {

                                final _cls4 this$1;

                                public void run()
                                {
                                    searchAutoCompleteView.showDropDown();
                                }

            
            {
                this$1 = _cls4.this;
                super();
            }
                            });
                            searchAutoCompleteView.setOnFocusChangeListener(null);
                        }
                    }

            
            {
                this$0 = RootActivitySearchManager.this;
                searchAutoCompleteView = searchautocomplete;
                super();
            }
                });
            }
        }
        return searchView;
    }


}
