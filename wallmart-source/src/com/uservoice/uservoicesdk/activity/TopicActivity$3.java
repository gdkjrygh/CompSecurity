// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.Topic;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.ui.LoadAllAdapter;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            TopicActivity

class this._cls0 extends LoadAllAdapter
{

    final TopicActivity this$0;

    protected void customizeLayout(View view, Article article)
    {
        TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.tivity._fld3);
        view = (TextView)view.findViewById(com.uservoice.uservoicesdk.tivity._fld3);
        textview.setText(article.getTitle());
        if (Session.getInstance().getTopic() == Topic.ALL_ARTICLES && article.getTopicName() != null)
        {
            view.setVisibility(0);
            view.setText(article.getTopicName());
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    protected volatile void customizeLayout(View view, Object obj)
    {
        customizeLayout(view, (Article)obj);
    }

    protected void loadPage(int i, Callback callback)
    {
        Topic topic = Session.getInstance().getTopic();
        if (topic == Topic.ALL_ARTICLES)
        {
            Article.loadAll(callback);
            return;
        } else
        {
            Article.loadForTopic(topic.getId(), callback);
            return;
        }
    }

    _cls9(Context context, int i, List list)
    {
        this$0 = TopicActivity.this;
        super(context, i, list);
    }
}
