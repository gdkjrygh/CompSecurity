// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.search:
//            SearchResultAdapter, RecentSearchProvider, SuggestionProvider

private class <init> extends AsyncTask
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
            return SearchResultAdapter.access$200(SearchResultAdapter.this).getRecentSearches();
        }
        if (SearchResultAdapter.access$300(SearchResultAdapter.this) != null)
        {
            return SearchResultAdapter.access$300(SearchResultAdapter.this).getSuggestions(as[0]);
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
        SearchResultAdapter.access$402(SearchResultAdapter.this, null);
        SearchResultAdapter.access$502(SearchResultAdapter.this, list);
        notifyDataSetChanged();
    }

    private ()
    {
        this$0 = SearchResultAdapter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
