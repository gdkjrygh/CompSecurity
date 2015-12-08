// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ListView;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.search:
//            BasicSearchManager, SearchResultAdapter, SizeChangeFrameLayout, SearchData

public class SearchManager extends BasicSearchManager
{
    public static interface OnBarcodeSearchRequestedListener
        extends BasicSearchManager.OnBarcodeSearchRequestedListener
    {
    }

    public static interface OnSearchExecutedListener
        extends BasicSearchManager.OnSearchExecutedListener
    {
    }

    public static interface OnSearchFieldFocusedListener
        extends BasicSearchManager.OnSearchFieldFocusedListener
    {
    }

    public static interface OnSearchRequestedListener
        extends BasicSearchManager.OnSearchRequestedListener
    {
    }

    public static interface OnVoiceSearchRequestedListener
        extends BasicSearchManager.OnVoiceSearchRequestedListener
    {
    }


    private static final String TAG_SEARCH_RESULT_VIEW = "search_results";
    private boolean mHideOnScrollSuggestions;
    private boolean mIgnoreNextSuggestionLayoutChange;
    private SearchResultAdapter mSearchSuggestionsAdapter;
    private ViewGroup mSuggestionsListLayout;
    private ListView mSuggestionsListView;

    public SearchManager(ViewGroup viewgroup)
    {
        super(viewgroup);
        mHideOnScrollSuggestions = true;
    }

    private boolean hideSuggestions()
    {
        if (mSuggestionsListLayout.getVisibility() == 0)
        {
            mSuggestionsListLayout.setVisibility(8);
            return true;
        } else
        {
            return false;
        }
    }

    private void initSuggestions(String s)
    {
        if (mSuggestionsListLayout.getVisibility() == 8)
        {
            setupListView();
            mSuggestionsListLayout.setVisibility(0);
        }
        if (mSearchSuggestionsAdapter != null)
        {
            mSearchSuggestionsAdapter.setSearchText(s);
        }
    }

    private void setupKeyboardHideDetection()
    {
        if (mSuggestionsListLayout instanceof SizeChangeFrameLayout)
        {
            SizeChangeFrameLayout.OnHeightChangedListener onheightchangedlistener = new SizeChangeFrameLayout.OnHeightChangedListener() {

                final SearchManager this$0;

                public void onHeightDecreased()
                {
                }

                public void onHeightIncreased()
                {
                    if (!mIgnoreNextSuggestionLayoutChange)
                    {
                        finishSearch();
                        return;
                    } else
                    {
                        mIgnoreNextSuggestionLayoutChange = false;
                        return;
                    }
                }

            
            {
                this$0 = SearchManager.this;
                super();
            }
            };
            ((SizeChangeFrameLayout)mSuggestionsListLayout).setOnHeightChangedListener(onheightchangedlistener);
        }
    }

    private void setupListView()
    {
        mSuggestionsListView.setAdapter(mSearchSuggestionsAdapter);
        mSuggestionsListView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final SearchManager this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
                if (i == 1 && mHideOnScrollSuggestions)
                {
                    mIgnoreNextSuggestionLayoutChange = true;
                    ViewUtil.hideKeyboard(mRootLayout);
                }
            }

            
            {
                this$0 = SearchManager.this;
                super();
            }
        });
    }

    public void destroy()
    {
        mSearchSuggestionsAdapter = null;
        super.destroy();
    }

    public void finishSearch()
    {
        hideSuggestions();
        super.finishSearch();
        mRootLayout.requestFocus();
    }

    protected void init()
    {
        super.init();
        if (mSearchSuggestionsAdapter == null)
        {
            throw new RuntimeException("Must call setAdapter() before calling init()");
        }
        if (mSuggestionsListLayout == null)
        {
            throw new RuntimeException("Must call setSearchListLayout() before calling init()");
        } else
        {
            mSearchSuggestionsAdapter.setOnItemClickListener(new SearchResultAdapter.OnItemClickListener() {

                final SearchManager this$0;

                public void onEditSelected(SearchData searchdata)
                {
                    if (searchdata != null)
                    {
                        searchdata = searchdata.getSearchText();
                        mSearchField.setText(searchdata);
                        mSearchField.setSelection(searchdata.length());
                        ViewUtil.showKeyboard(mSearchField);
                    }
                }

                public void onItemSelected(SearchData searchdata)
                {
                    if (searchdata != null)
                    {
                        performSearch(searchdata);
                    }
                }

            
            {
                this$0 = SearchManager.this;
                super();
            }
            });
            return;
        }
    }

    public boolean onBackPressed()
    {
        if (hideSuggestions())
        {
            mRootLayout.requestFocus();
            return true;
        } else
        {
            return super.onBackPressed();
        }
    }

    protected void onSearchFieldFocusChange(boolean flag)
    {
        if (flag)
        {
            initSuggestions(mSearchField.getText().toString());
        }
    }

    protected void onSearchFieldTextChanged(CharSequence charsequence)
    {
        super.onSearchFieldTextChanged(charsequence);
        if (mSearchSuggestionsAdapter == null)
        {
            return;
        } else
        {
            mSearchSuggestionsAdapter.setSearchText(charsequence.toString());
            return;
        }
    }

    public void performSearch(SearchData searchdata)
    {
        mIgnoreNextSuggestionLayoutChange = true;
        super.performSearch(searchdata);
        if (mSearchSuggestionsAdapter != null)
        {
            mSearchSuggestionsAdapter.setSearchText("");
        }
    }

    public void setHideOnScrollSuggestions(boolean flag)
    {
        mHideOnScrollSuggestions = flag;
    }

    public void setOnBarcodeSearchRequestedListener(OnBarcodeSearchRequestedListener onbarcodesearchrequestedlistener)
    {
        super.setOnBarcodeSearchRequestedListener(onbarcodesearchrequestedlistener);
    }

    public void setOnSearchFieldFocusedListener(OnSearchFieldFocusedListener onsearchfieldfocusedlistener)
    {
        super.setOnSearchFieldFocusedListener(onsearchfieldfocusedlistener);
    }

    public void setOnSearchRequestedListener(OnSearchRequestedListener onsearchrequestedlistener)
    {
        super.setOnSearchRequestedListener(onsearchrequestedlistener);
    }

    public void setOnSuggestionSelectedListener(OnSearchExecutedListener onsearchexecutedlistener)
    {
        super.setOnSearchExecutedListener(onsearchexecutedlistener);
    }

    public void setOnVoiceSearchRequestedListener(OnVoiceSearchRequestedListener onvoicesearchrequestedlistener)
    {
        super.setOnVoiceSearchRequestedListener(onvoicesearchrequestedlistener);
    }

    public void setSuggestionsAdapter(SearchResultAdapter searchresultadapter)
    {
        mSearchSuggestionsAdapter = searchresultadapter;
    }

    public void setSuggestionsListLayout(ViewGroup viewgroup, int i)
    {
        mSuggestionsListLayout = viewgroup;
        mSuggestionsListLayout.setTag("search_results");
        mSuggestionsListView = (ListView)viewgroup.findViewById(i);
        mSuggestionsListLayout.setVisibility(8);
        mRootLayout.addView(mSuggestionsListLayout);
        setupKeyboardHideDetection();
    }



/*
    static boolean access$002(SearchManager searchmanager, boolean flag)
    {
        searchmanager.mIgnoreNextSuggestionLayoutChange = flag;
        return flag;
    }

*/

}
