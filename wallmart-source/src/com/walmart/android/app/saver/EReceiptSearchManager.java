// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import com.walmart.android.config.WalmartStoreConfigurator;
import com.walmart.android.search.RecentSearchProvider;
import com.walmart.android.search.SearchData;
import com.walmart.android.search.SearchResultAdapter;
import com.walmart.android.search.SuggestionProvider;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ereceipt.service.EReceiptManager;
import com.walmartlabs.storelocator.LayoutConfig;

// Referenced classes of package com.walmart.android.app.saver:
//            BasicFilterManager

public class EReceiptSearchManager extends BasicFilterManager
{
    private static class RecentHistoryAdapter extends BaseAdapter
        implements BasicFilterAdapter.DelegateAdapter
    {

        private final Activity mActivity;
        private final BaseAdapter mAdapter;

        private void populateFields(View view)
        {
            ViewGroup viewgroup = (ViewGroup)ViewUtil.findViewById(view, 0x7f100490);
            int l = viewgroup.getChildCount();
            int k = mAdapter.getCount();
            for (int i = k * 2 - 1; i < l; i++)
            {
                viewgroup.getChildAt(i).setVisibility(8);
            }

            int j = 0;
            while (j < k * 2 - 1) 
            {
                View view1 = viewgroup.getChildAt(j);
                if (j % 2 == 0)
                {
                    view = mAdapter.getView(j / 2, view1, viewgroup);
                    view.setClickable(true);
                } else
                if (view1 == null)
                {
                    view = new View(mActivity);
                    view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, 1));
                    view.setBackgroundColor(mActivity.getResources().getColor(0x7f0f003c));
                } else
                {
                    view = view1;
                }
                if (view1 == null)
                {
                    viewgroup.addView(view, j);
                } else
                {
                    view.setVisibility(0);
                }
                j++;
            }
        }

        public int getCount()
        {
            return Math.min(mAdapter.getCount(), 1);
        }

        public Object getItem(int i)
        {
            return null;
        }

        public long getItemId(int i)
        {
            return 0L;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = ViewUtil.inflate(viewgroup.getContext(), 0x7f04014f, viewgroup, false);
            }
            populateFields(view1);
            return view1;
        }

        public boolean isConvertView(View view)
        {
            return view != null && view.getId() == 0x7f10048f;
        }

        private RecentHistoryAdapter(Activity activity, BaseAdapter baseadapter)
        {
            mActivity = activity;
            mAdapter = baseadapter;
        }

    }

    private static class SearchResultObserver extends DataSetObserver
    {

        private final RecentHistoryAdapter mRecentHistoryAdapter;

        public void onChanged()
        {
            mRecentHistoryAdapter.notifyDataSetChanged();
        }

        public void onInvalidated()
        {
            mRecentHistoryAdapter.notifyDataSetInvalidated();
        }

        public SearchResultObserver(RecentHistoryAdapter recenthistoryadapter)
        {
            mRecentHistoryAdapter = recenthistoryadapter;
        }
    }


    private final Activity mActivity;
    private final View mEmptyView;
    private RecentHistoryAdapter mRecentHistoryAdapter;
    private boolean mSearchInFocus;
    private SearchResultAdapter mSearchResultAdapter;
    private SearchResultObserver mSearchResultObserver;

    public EReceiptSearchManager(Activity activity, ListView listview, View view)
    {
        super(listview);
        mActivity = activity;
        mEmptyView = view;
    }

    protected void close()
    {
        if (mSearchResultAdapter != null && mSearchResultObserver != null)
        {
            mSearchResultAdapter.unregisterDataSetObserver(mSearchResultObserver);
            mSearchResultObserver = null;
        }
        super.close();
    }

    protected void init()
    {
        LayoutConfig layoutconfig = WalmartStoreConfigurator.createLayoutConfig();
        com.walmartlabs.ereceipt.service.EReceiptRecentSearchProvider ereceiptrecentsearchprovider = EReceiptManager.get().getEReceiptRecentSearchProvider();
        mSearchResultAdapter = new SearchResultAdapter(null, ereceiptrecentsearchprovider, layoutconfig) {

            final EReceiptSearchManager this$0;
            final LayoutConfig val$layoutConfig;

            public View createView(int i, ViewGroup viewgroup)
            {
                return LayoutInflater.from(mActivity).inflate(layoutConfig.getIdForLayoutEnum(com.walmartlabs.storelocator.LayoutConfig.LayoutEnum.SEARCH_SUGGESTION_ITEM), null);
            }

            public Object getItem(int i)
            {
                return null;
            }

            public int getItemClickId(int i)
            {
                return layoutConfig.getIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_ITEM_ENTRY);
            }

            public int getItemEditId(int i)
            {
                return -1;
            }

            public long getItemId(int i)
            {
                return 0L;
            }

            public void populateView(View view, int i)
            {
                SearchData searchdata = getSearchData(i);
                ViewUtil.setText(layoutConfig.getIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_ITEM_TEXT), view, searchdata.getSearchText());
                ViewUtil.setTextHideIfEmpty(layoutConfig.getIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_ITEM_NOTE), view, "");
                ViewUtil.findViewById(view, layoutConfig.getIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_ITEM_ARROW)).setVisibility(8);
            }

            
            {
                this$0 = EReceiptSearchManager.this;
                layoutConfig = layoutconfig;
                super(final_context, suggestionprovider, recentsearchprovider);
            }
        };
        mSearchResultAdapter.setOnItemClickListener(new com.walmart.android.search.SearchResultAdapter.OnItemClickListener() {

            final EReceiptSearchManager this$0;

            public void onEditSelected(SearchData searchdata)
            {
                if (searchdata != null)
                {
                    searchdata = searchdata.getSearchText();
                    length.setText(searchdata);
                    length.setSelection(searchdata.length());
                    ViewUtil.showKeyboard(length);
                }
            }

            public void onItemSelected(SearchData searchdata)
            {
                if (searchdata != null)
                {
                    CharSequence charsequence = searchdata.getSearchText();
                    length.setText(charsequence);
                    length.setSelection(charsequence.length());
                    performSearch(searchdata);
                }
            }

            
            {
                this$0 = EReceiptSearchManager.this;
                super();
            }
        });
        mRecentHistoryAdapter = new RecentHistoryAdapter(mActivity, mSearchResultAdapter);
        mSearchResultObserver = new SearchResultObserver(mRecentHistoryAdapter);
        mSearchResultAdapter.registerDataSetObserver(mSearchResultObserver);
        setRecentAdapter(mRecentHistoryAdapter, null);
        setOnSearchRequestedListener(new com.walmart.android.search.BasicSearchManager.OnSearchRequestedListener() {

            final EReceiptSearchManager this$0;

            public SearchData onSearchRequested(String s)
            {
                return new SearchData(s);
            }

            public volatile Object onSearchRequested(String s)
            {
                return onSearchRequested(s);
            }

            
            {
                this$0 = EReceiptSearchManager.this;
                super();
            }
        });
        setSearchField(layoutconfig.getIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.SEARCH_FIELD));
        setClearTextButton(layoutconfig.getIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.CLEAR_TEXT_BUTTON));
        setVoiceSearchButton(layoutconfig.getIdForViewEnum(com.walmartlabs.storelocator.LayoutConfig.ViewEnum.VOICE_SEARCH_BUTTON));
        enableVoiceSearchButton(false);
        setHintImageSpan(new ImageSpan(mActivity, layoutconfig.getIdForDrawableEnum(com.walmartlabs.storelocator.LayoutConfig.DrawableEnum.SEARCH_HINT_ICON), 0));
        setSuggestionText(mActivity.getString(0x7f090502));
        setRecentSearchProvider(ereceiptrecentsearchprovider);
        getListView().setEmptyView(mEmptyView);
        super.init();
    }

    protected void onSearchFieldFocusChange(boolean flag)
    {
        super.onSearchFieldFocusChange(flag);
        if (flag)
        {
            mSearchResultAdapter.setSearchText(getSearchText());
        }
    }

    protected void onSearchFieldTextChanged(CharSequence charsequence)
    {
        super.onSearchFieldTextChanged(charsequence);
        mSearchResultAdapter.setSearchText(charsequence.toString());
    }

    public void requestSearch()
    {
        super.requestSearch();
    }

    public void restoreFocusState()
    {
        if (mSearchInFocus)
        {
            mSearchField.requestFocus();
        }
        mSearchInFocus = false;
    }

    public void saveFocusState()
    {
        mSearchInFocus = mSearchField.hasFocus();
    }

    protected void switchState()
    {
        if (isFilterMode())
        {
            getListView().setEmptyView(null);
            mEmptyView.setVisibility(8);
        } else
        {
            getListView().setEmptyView(mEmptyView);
        }
        super.switchState();
    }






}
