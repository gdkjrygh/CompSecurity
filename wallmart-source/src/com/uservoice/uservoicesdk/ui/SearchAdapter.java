// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import android.widget.BaseAdapter;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTask;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            DefaultCallback

public abstract class SearchAdapter extends BaseAdapter
{
    private class SearchTask extends TimerTask
    {

        private final String query;
        private boolean stop;
        private RestTask task;
        final SearchAdapter this$0;

        public boolean cancel()
        {
            stop = true;
            task.cancel(true);
            return true;
        }

        public void run()
        {
            currentQuery = query;
            task = search(query, new DefaultCallback(context) {

                final SearchTask this$1;

                public volatile void onModel(Object obj)
                {
                    onModel((List)obj);
                }

                public void onModel(List list)
                {
                    if (!stop)
                    {
                        searchResults = list;
                        loading = false;
                        notifyDataSetChanged();
                        searchResultsUpdated();
                    }
                }

            
            {
                this$1 = SearchTask.this;
                super(context1);
            }
            });
        }


        public SearchTask(String s)
        {
            this$0 = SearchAdapter.this;
            super();
            query = s;
        }
    }


    protected Context context;
    protected String currentQuery;
    protected SearchTask currentSearch;
    protected boolean loading;
    protected String pendingQuery;
    protected int scope;
    protected boolean searchActive;
    protected List searchResults;

    public SearchAdapter()
    {
        searchResults = new ArrayList();
        searchActive = false;
    }

    public void performSearch(String s)
    {
        pendingQuery = s;
        if (s.length() == 0)
        {
            searchResults = new ArrayList();
            loading = false;
            notifyDataSetChanged();
            return;
        }
        loading = true;
        notifyDataSetChanged();
        if (currentSearch != null)
        {
            currentSearch.cancel();
        }
        currentSearch = new SearchTask(s);
        currentSearch.run();
    }

    protected RestTask search(String s, Callback callback)
    {
        return null;
    }

    protected void searchResultsUpdated()
    {
    }

    public void setScope(int i)
    {
        scope = i;
        notifyDataSetChanged();
    }

    public void setSearchActive(boolean flag)
    {
        searchActive = flag;
        loading = false;
        notifyDataSetChanged();
    }

    protected boolean shouldShowSearchResults()
    {
        return searchActive && pendingQuery != null && pendingQuery.length() > 0;
    }
}
