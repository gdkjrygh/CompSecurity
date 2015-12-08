// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.otto.Bus;
import com.walmart.android.search.RecentSearchProvider;
import com.walmart.android.search.SearchData;
import com.walmart.android.search.SearchManager;
import com.walmart.android.search.SearchResultAdapter;
import com.walmart.android.search.SimpleLocationSuggestionProvider;
import com.walmart.android.search.SuggestionProvider;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.analytics.AnalyticsEvent;
import com.walmartlabs.ui.SearchBarLayout;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreSearchInterface, LayoutConfig, BasicRecentSearchProvider

public class StoreSearchManager extends SearchManager
    implements StoreSearchInterface
{

    private static final String API_KEY = "AIzaSyAMY5NFtMaQD0Mf4RKLBLakwo1Z6jMCxTw";
    public static final int REQUEST_CODE_VOICE_SEARCH = 1000;
    protected static final String TAG = com/walmartlabs/storelocator/StoreSearchManager.getSimpleName();
    private final Activity mActivity;
    private boolean mAnimateOnFocus;
    private LayoutConfig mLayoutConfig;
    private SimpleLocationSuggestionProvider mLocationSuggestionProvider;
    private final ViewGroup mRootLayout;
    private SearchBarLayout mSearchBarLayout;

    public StoreSearchManager(Activity activity, ViewGroup viewgroup, LayoutConfig layoutconfig)
    {
        super(viewgroup);
        mActivity = activity;
        mRootLayout = viewgroup;
        mLayoutConfig = layoutconfig;
    }

    private ViewGroup createSuggestionsListLayout()
    {
        ViewGroup viewgroup = (ViewGroup)LayoutInflater.from(mActivity).inflate(mLayoutConfig.getIdForLayoutEnum(LayoutConfig.LayoutEnum.SEARCH_LIST_LAYOUT), null);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(3, mSearchBarLayout.getId());
        viewgroup.setLayoutParams(layoutparams);
        return viewgroup;
    }

    private void trackSearchData(SearchData searchdata)
    {
        Object obj = searchdata.getSearchType();
        if (com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_SUGGESTION == obj)
        {
            obj = "Type Ahead";
        } else
        if (com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_RECENT == obj)
        {
            obj = "History";
        } else
        if (com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_VOICE == obj)
        {
            obj = "Voice";
        } else
        {
            obj = "Exact";
        }
        MessageBus.getBus().post(new AnalyticsEvent("Store Search", ((String) (obj)), searchdata.getSearchText().toString()));
    }

    public void enableAnimateOnFocus()
    {
        mAnimateOnFocus = true;
    }

    public View getSearchBarView()
    {
        return mSearchBarLayout;
    }

    public void init(int i, String s, String s1)
    {
        mSearchBarLayout = (SearchBarLayout)ViewUtil.findViewById(mRootLayout, i);
        BasicRecentSearchProvider basicrecentsearchprovider = BasicRecentSearchProvider.getInstance(mActivity);
        mLocationSuggestionProvider = new SimpleLocationSuggestionProvider(mActivity, "AIzaSyAMY5NFtMaQD0Mf4RKLBLakwo1Z6jMCxTw");
        mLocationSuggestionProvider.setCountryRestriction(s);
        mLocationSuggestionProvider.setReferrer(s1);
        s = new SearchResultAdapter(mActivity, mLocationSuggestionProvider, basicrecentsearchprovider) {

            final StoreSearchManager this$0;

            public View createView(int j, ViewGroup viewgroup)
            {
                return LayoutInflater.from(mActivity).inflate(mLayoutConfig.getIdForLayoutEnum(LayoutConfig.LayoutEnum.SEARCH_SUGGESTION_ITEM), null);
            }

            public Object getItem(int j)
            {
                return null;
            }

            public int getItemClickId(int j)
            {
                return mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_ITEM_ENTRY);
            }

            public int getItemEditId(int j)
            {
                return mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_ITEM_ARROW);
            }

            public long getItemId(int j)
            {
                return 0L;
            }

            public void populateView(View view, int j)
            {
                SearchData searchdata = getSearchData(j);
                ViewUtil.setText(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_ITEM_TEXT), view, searchdata.getSearchText());
                ViewUtil.setTextHideIfEmpty(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_ITEM_NOTE), view, "");
            }

            
            {
                this$0 = StoreSearchManager.this;
                super(context, suggestionprovider, recentsearchprovider);
            }
        };
        setOnSearchRequestedListener(new com.walmart.android.search.SearchManager.OnSearchRequestedListener() {

            final StoreSearchManager this$0;

            public SearchData onSearchRequested(String s2)
            {
                return new SearchData(s2);
            }

            public volatile Object onSearchRequested(String s2)
            {
                return onSearchRequested(s2);
            }

            
            {
                this$0 = StoreSearchManager.this;
                super();
            }
        });
        setOnSearchFieldFocusedListener(new com.walmart.android.search.SearchManager.OnSearchFieldFocusedListener() {

            final StoreSearchManager this$0;

            public void onFocused(boolean flag)
            {
                if (mAnimateOnFocus)
                {
                    Handler handler = new Handler();
                    Runnable runnable = new Runnable() {

                        final _cls3 this$1;

                        public void run()
                        {
                            mSearchBarLayout.toggle();
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    };
                    long l;
                    if (flag)
                    {
                        l = 50L;
                    } else
                    {
                        l = 0L;
                    }
                    handler.postDelayed(runnable, l);
                }
                if (!flag)
                {
                    clearSearchText();
                    mActivity.getWindow().setSoftInputMode(0);
                    return;
                } else
                {
                    mActivity.getWindow().setSoftInputMode(32);
                    return;
                }
            }

            
            {
                this$0 = StoreSearchManager.this;
                super();
            }
        });
        i = mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_BUTTON);
        if (i != -1)
        {
            setSearchButton(i);
        }
        setSearchField(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_FIELD));
        setClearTextButton(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.CLEAR_TEXT_BUTTON));
        setVoiceSearchButton(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.VOICE_SEARCH_BUTTON));
        setOnVoiceSearchRequestedListener(new com.walmart.android.search.SearchManager.OnVoiceSearchRequestedListener() {

            final StoreSearchManager this$0;

            private boolean startVoiceRecognitionActivity()
            {
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                intent.putExtra("calling_package", getClass().getPackage().getName());
                intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
                intent.putExtra("android.speech.extra.MAX_RESULTS", 5);
                try
                {
                    mActivity.startActivityForResult(intent, 1000);
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    enableVoiceSearchButton(false);
                    return false;
                }
                return true;
            }

            public void onVoiceSearchRequested()
            {
                startVoiceRecognitionActivity();
            }

            
            {
                this$0 = StoreSearchManager.this;
                super();
            }
        });
        setSuggestionsListLayout(createSuggestionsListLayout(), mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_RESULT_LIST));
        setRecentSearchProvider(basicrecentsearchprovider);
        setSuggestionsAdapter(s);
        setHintImageSpan(new ImageSpan(mActivity, mLayoutConfig.getIdForDrawableEnum(LayoutConfig.DrawableEnum.SEARCH_HINT_ICON), 0));
        setSuggestionText(mActivity.getString(com.walmart.lib.R.string.search_hint_store));
        super.init();
    }

    public boolean onSearchRequested()
    {
        View view = mRootLayout.findViewById(mLayoutConfig.getIdForViewEnum(LayoutConfig.ViewEnum.SEARCH_FIELD));
        if (view != null)
        {
            return view.requestFocus();
        } else
        {
            return false;
        }
    }

    public void onVoiceSearchResult(int i, Intent intent)
    {
        if (i == -1)
        {
            intent = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (intent != null && intent.size() > 0)
            {
                intent = (String)intent.get(0);
                if (intent != null)
                {
                    performSearchByVoice(new SearchData(intent.toLowerCase(Locale.US), com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_VOICE));
                }
            }
        }
    }

    public void performSearch(SearchData searchdata)
    {
        super.performSearch(searchdata);
        clearSearchText();
        trackSearchData(searchdata);
    }

    public void performSearchByVoice(SearchData searchdata)
    {
        performSearch(searchdata);
        setSuggestionText(searchdata.getSearchText().toString());
    }

    public void setLocation(LatLng latlng)
    {
        if (mLocationSuggestionProvider != null)
        {
            mLocationSuggestionProvider.setLocationBias((new StringBuilder()).append(latlng.latitude).append(",").append(latlng.longitude).toString(), "50000");
        }
    }






}
