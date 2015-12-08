// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            ModelAdapter, DefaultCallback

public abstract class PaginatedAdapter extends ModelAdapter
{

    private int page;

    public PaginatedAdapter(Context context, int i, List list)
    {
        super(context, i, list);
        page = 1;
    }

    protected List getObjects()
    {
        if (shouldShowSearchResults())
        {
            return searchResults;
        } else
        {
            return objects;
        }
    }

    protected abstract int getTotalNumberOfObjects();

    public void loadMore()
    {
        if (loading || searchActive || objects.size() == getTotalNumberOfObjects())
        {
            return;
        } else
        {
            loading = true;
            notifyDataSetChanged();
            loadPage(page, new DefaultCallback(context) {

                final PaginatedAdapter this$0;

                public volatile void onModel(Object obj)
                {
                    onModel((List)obj);
                }

                public void onModel(List list)
                {
                    objects.addAll(list);
                    page = page + 1;
                    loading = false;
                    notifyDataSetChanged();
                }

            
            {
                this$0 = PaginatedAdapter.this;
                super(context);
            }
            });
            return;
        }
    }

    public void reload()
    {
        if (loading)
        {
            return;
        } else
        {
            page = 1;
            objects = new ArrayList();
            loadMore();
            return;
        }
    }



/*
    static int access$002(PaginatedAdapter paginatedadapter, int i)
    {
        paginatedadapter.page = i;
        return i;
    }

*/
}
