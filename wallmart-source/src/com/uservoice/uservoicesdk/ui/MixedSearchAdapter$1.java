// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            MixedSearchAdapter

class val.callback extends Callback
{

    final MixedSearchAdapter this$0;
    final Callback val$callback;
    final String val$query;

    public void onError(RestResult restresult)
    {
        val$callback.onError(restresult);
    }

    public volatile void onModel(Object obj)
    {
        onModel((List)obj);
    }

    public void onModel(List list)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BaseModel basemodel = (BaseModel)iterator.next();
            if (basemodel instanceof Article)
            {
                arraylist.add((Article)basemodel);
            } else
            if (basemodel instanceof Suggestion)
            {
                arraylist1.add((Suggestion)basemodel);
            }
        } while (true);
        Babayaga.track(com.uservoice.uservoicesdk.babayaga._ARTICLES, val$query, arraylist);
        Babayaga.track(com.uservoice.uservoicesdk.babayaga._IDEAS, val$query, arraylist1);
        val$callback.onModel(list);
    }

    ()
    {
        this$0 = final_mixedsearchadapter;
        val$query = s;
        val$callback = Callback.this;
        super();
    }
}
