// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import com.uservoice.uservoicesdk.rest.RestTask;
import java.util.List;
import java.util.TimerTask;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            SearchAdapter, DefaultCallback

private class query extends TimerTask
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

            final SearchAdapter.SearchTask this$1;

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
                this$1 = SearchAdapter.SearchTask.this;
                super(context);
            }
        });
    }


    public _cls1.this._cls1(String s)
    {
        this$0 = SearchAdapter.this;
        super();
        query = s;
    }
}
