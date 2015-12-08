// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.Topic;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            DefaultCallback, PortalAdapter

class <init> extends DefaultCallback
{

    final PortalAdapter this$0;
    final DefaultCallback val$articlesCallback;

    public volatile void onModel(Object obj)
    {
        onModel((List)obj);
    }

    public void onModel(List list)
    {
        if (list.isEmpty())
        {
            Session.getInstance().setTopics(list);
            Article.loadAll(val$articlesCallback);
            return;
        } else
        {
            list = new ArrayList(list);
            list.add(Topic.ALL_ARTICLES);
            Session.getInstance().setTopics(list);
            notifyDataSetChanged();
            return;
        }
    }

    (DefaultCallback defaultcallback)
    {
        this$0 = final_portaladapter;
        val$articlesCallback = defaultcallback;
        super(Context.this);
    }
}
