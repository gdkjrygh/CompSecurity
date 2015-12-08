// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            ModelAdapter, DefaultCallback

public abstract class LoadAllAdapter extends ModelAdapter
{

    public LoadAllAdapter(Context context, int i, List list)
    {
        super(context, i, list);
        loadAll();
    }

    private void loadAll()
    {
        loading = true;
        notifyDataSetChanged();
        loadPage(1, new DefaultCallback(context) {

            final LoadAllAdapter this$0;

            public volatile void onModel(Object obj)
            {
                onModel((List)obj);
            }

            public void onModel(List list)
            {
                objects.addAll(list);
                loading = false;
                notifyDataSetChanged();
            }

            
            {
                this$0 = LoadAllAdapter.this;
                super(context);
            }
        });
    }

    public void reload()
    {
        if (loading)
        {
            return;
        } else
        {
            objects = new ArrayList();
            loadAll();
            return;
        }
    }
}
