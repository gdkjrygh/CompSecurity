// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.search:
//            SearchData, RecentSearchProvider, SuggestionProvider

public abstract class SearchResultAdapter extends BaseAdapter
{
    private class GetSuggestionsAsyncTask extends AsyncTask
    {

        final SearchResultAdapter this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient List doInBackground(String as[])
        {
            if (TextUtils.isEmpty(as[0]))
            {
                return mRecentSearchesProvider.getRecentSearches();
            }
            if (mSuggestionProvider != null)
            {
                return mSuggestionProvider.getSuggestions(as[0]);
            } else
            {
                return Collections.emptyList();
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((List)obj);
        }

        protected void onPostExecute(List list)
        {
            super.onPostExecute(list);
            mCurrentSuggestionRequest = null;
            mSearchData = list;
            notifyDataSetChanged();
        }

        private GetSuggestionsAsyncTask()
        {
            this$0 = SearchResultAdapter.this;
            super();
        }

    }

    public static interface OnItemClickListener
    {

        public abstract void onEditSelected(SearchData searchdata);

        public abstract void onItemSelected(SearchData searchdata);
    }


    public static final int NO_ID = -1;
    private AsyncTask mCurrentSuggestionRequest;
    private OnItemClickListener mOnItemClickListener;
    private String mPrevSearchString;
    private RecentSearchProvider mRecentSearchesProvider;
    private List mSearchData;
    private SuggestionProvider mSuggestionProvider;

    public SearchResultAdapter(Context context, SuggestionProvider suggestionprovider, RecentSearchProvider recentsearchprovider)
    {
        mSearchData = Collections.emptyList();
        mSuggestionProvider = suggestionprovider;
        mRecentSearchesProvider = recentsearchprovider;
    }

    private void wireListeners(View view, final int position)
    {
        int i = getItemClickId(position);
        if (i != -1)
        {
            view.findViewById(i).setOnClickListener(new android.view.View.OnClickListener() {

                final SearchResultAdapter this$0;
                final int val$position;

                public void onClick(View view1)
                {
                    mOnItemClickListener.onItemSelected(getSearchData(position));
                }

            
            {
                this$0 = SearchResultAdapter.this;
                position = i;
                super();
            }
            });
        }
        i = getItemEditId(position);
        if (i != -1)
        {
            view.findViewById(i).setOnClickListener(new android.view.View.OnClickListener() {

                final SearchResultAdapter this$0;
                final int val$position;

                public void onClick(View view1)
                {
                    mOnItemClickListener.onEditSelected(getSearchData(position));
                }

            
            {
                this$0 = SearchResultAdapter.this;
                position = i;
                super();
            }
            });
        }
    }

    public abstract View createView(int i, ViewGroup viewgroup);

    public int getCount()
    {
        return mSearchData.size();
    }

    public int getItemClickId(int i)
    {
        return -1;
    }

    public int getItemEditId(int i)
    {
        return -1;
    }

    public SearchData getSearchData(int i)
    {
        if (i < mSearchData.size())
        {
            return (SearchData)mSearchData.get(i);
        } else
        {
            return null;
        }
    }

    public void getSuggestionsAsync(String s)
    {
        if (TextUtils.isEmpty(s) || !s.equals(mPrevSearchString))
        {
            mPrevSearchString = s;
            if (mCurrentSuggestionRequest != null)
            {
                mCurrentSuggestionRequest.cancel(false);
            }
            mCurrentSuggestionRequest = new GetSuggestionsAsyncTask();
            mCurrentSuggestionRequest.execute(new String[] {
                s
            });
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = createView(i, viewgroup);
        }
        populateView(view, i);
        if (mOnItemClickListener != null)
        {
            wireListeners(view, i);
        }
        return view;
    }

    public abstract void populateView(View view, int i);

    public void reset()
    {
        mPrevSearchString = null;
    }

    public void setOnItemClickListener(OnItemClickListener onitemclicklistener)
    {
        mOnItemClickListener = onitemclicklistener;
    }

    public void setSearchText(String s)
    {
        getSuggestionsAsync(s.trim());
    }





/*
    static AsyncTask access$402(SearchResultAdapter searchresultadapter, AsyncTask asynctask)
    {
        searchresultadapter.mCurrentSuggestionRequest = asynctask;
        return asynctask;
    }

*/


/*
    static List access$502(SearchResultAdapter searchresultadapter, List list)
    {
        searchresultadapter.mSearchData = list;
        return list;
    }

*/
}
