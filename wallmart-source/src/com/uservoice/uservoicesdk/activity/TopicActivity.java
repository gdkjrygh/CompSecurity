// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.Topic;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.ui.LoadAllAdapter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            BaseListActivity, SearchActivity, ArticleActivity

public class TopicActivity extends BaseListActivity
    implements SearchActivity
{

    public TopicActivity()
    {
    }

    public void hideSearch()
    {
        super.hideSearch();
        getSupportActionBar().setNavigationMode(1);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (hasActionBar())
        {
            bundle = getSupportActionBar();
            bundle.setNavigationMode(1);
            bundle.setListNavigationCallbacks(new ArrayAdapter(this, 0x1090009, Session.getInstance().getTopics()) {

                final TopicActivity this$0;

                public View getDropDownView(int i, View view, ViewGroup viewgroup)
                {
                    view = super.getDropDownView(i, view, viewgroup);
                    ((TextView)view).setTextColor(-1);
                    return view;
                }

                public View getView(int i, View view, ViewGroup viewgroup)
                {
                    view = super.getView(i, view, viewgroup);
                    ((TextView)view).setTextColor(-1);
                    return view;
                }

            
            {
                this$0 = TopicActivity.this;
                super(context, i, list);
            }
            }, new android.support.v7.app.ActionBar.OnNavigationListener() {

                final TopicActivity this$0;

                public boolean onNavigationItemSelected(int i, long l)
                {
                    Topic topic = (Topic)Session.getInstance().getTopics().get(i);
                    Session.getInstance().setTopic(topic);
                    ((LoadAllAdapter)getListAdapter()).reload();
                    return true;
                }

            
            {
                this$0 = TopicActivity.this;
                super();
            }
            });
            bundle.setSelectedNavigationItem(Session.getInstance().getTopics().indexOf(Session.getInstance().getTopic()));
        }
        setTitle(null);
        getListView().setDivider(null);
        setListAdapter(new LoadAllAdapter(this, com.uservoice.uservoicesdk.R.layout.uv_text_item, new ArrayList()) {

            final TopicActivity this$0;

            protected void customizeLayout(View view, Article article)
            {
                TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text);
                view = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2);
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

            
            {
                this$0 = TopicActivity.this;
                super(context, i, list);
            }
        });
        getListView().setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final TopicActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (Article)getListAdapter().getItem(i);
                Session.getInstance().setArticle(adapterview);
                startActivity(new Intent(TopicActivity.this, com/uservoice/uservoicesdk/activity/ArticleActivity));
            }

            
            {
                this$0 = TopicActivity.this;
                super();
            }
        });
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_TOPIC, Session.getInstance().getTopic().getId());
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(com.uservoice.uservoicesdk.R.menu.uv_portal, menu);
        setupScopedSearch(menu);
        return true;
    }
}
