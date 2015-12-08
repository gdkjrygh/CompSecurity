// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.dialog.SuggestionDialogFragment;
import com.uservoice.uservoicesdk.flow.InitManager;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;
import com.uservoice.uservoicesdk.rest.RestTask;
import com.uservoice.uservoicesdk.ui.DefaultCallback;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import com.uservoice.uservoicesdk.ui.SearchAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            BaseListActivity, SearchActivity, PostIdeaActivity

public class ForumActivity extends BaseListActivity
    implements SearchActivity
{

    private static final int ITEM_TYPE_POST_IDEA_BUTTON = 2;
    private static final int ITEM_TYPE_SUGGESTIONS_LIST_HEADER = 3;
    private Forum forum;

    public ForumActivity()
    {
    }

    private void loadForum()
    {
        if (Session.getInstance().getForum() != null)
        {
            forum = Session.getInstance().getForum();
            Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.VIEW_FORUM, forum.getId());
            setTitle(forum.getName());
            getModelAdapter().loadMore();
            return;
        } else
        {
            Forum.loadForum(Session.getInstance().getConfig().getForumId(), new DefaultCallback(this) {

                final ForumActivity this$0;

                public void onModel(Forum forum1)
                {
                    Session.getInstance().setForum(forum1);
                    forum = forum1;
                    setTitle(forum.getName());
                    getModelAdapter().loadMore();
                }

                public volatile void onModel(Object obj)
                {
                    onModel((Forum)obj);
                }

            
            {
                this$0 = ForumActivity.this;
                super(context);
            }
            });
            return;
        }
    }

    public PaginatedAdapter getModelAdapter()
    {
        return (PaginatedAdapter)getListAdapter();
    }

    public SearchAdapter getSearchAdapter()
    {
        return getModelAdapter();
    }

    public void hideSearch()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(com.uservoice.uservoicesdk.R.string.uv_feedback_forum);
        bundle = new ArrayList();
        getListView().setDivider(null);
        setListAdapter(new PaginatedAdapter(this, com.uservoice.uservoicesdk.R.layout.uv_suggestion_item, bundle) {

            boolean initializing;
            final ForumActivity this$0;

            protected void customizeLayout(View view, Suggestion suggestion)
            {
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_suggestion_title)).setText(suggestion.getTitle());
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_subscriber_count)).setText(String.valueOf(suggestion.getNumberOfSubscribers()));
                TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_suggestion_status);
                view = view.findViewById(com.uservoice.uservoicesdk.R.id.uv_suggestion_status_color);
                if (suggestion.getStatus() == null)
                {
                    textview.setVisibility(8);
                    view.setVisibility(8);
                    return;
                } else
                {
                    int i = Color.parseColor(suggestion.getStatusColor());
                    textview.setVisibility(0);
                    textview.setTextColor(i);
                    textview.setText(suggestion.getStatus().toUpperCase(Locale.getDefault()));
                    view.setVisibility(0);
                    view.setBackgroundColor(i);
                    return;
                }
            }

            protected volatile void customizeLayout(View view, Object obj)
            {
                customizeLayout(view, (Suggestion)obj);
            }

            public int getCount()
            {
                int j = super.getCount();
                int i;
                if (initializing)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                return i + (j + 2);
            }

            public Object getItem(int i)
            {
                return super.getItem(i - 2);
            }

            public int getItemViewType(int i)
            {
                if (i == 0)
                {
                    return 2;
                }
                if (i == 1)
                {
                    return 3;
                }
                if (i == 2 && initializing)
                {
                    return 1;
                } else
                {
                    return super.getItemViewType(i - 2);
                }
            }

            public int getTotalNumberOfObjects()
            {
                return forum.getNumberOfOpenSuggestions();
            }

            public View getView(int i, View view, ViewGroup viewgroup)
            {
                int j;
                j = getItemViewType(i);
                if (j != 2 && j != 3)
                {
                    break MISSING_BLOCK_LABEL_129;
                }
                viewgroup = view;
                if (view != null) goto _L2; else goto _L1
_L1:
                if (j != 2) goto _L4; else goto _L3
_L3:
                viewgroup = getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_text_item, null);
                ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text)).setText(com.uservoice.uservoicesdk.R.string.uv_post_an_idea);
                viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_divider).setVisibility(8);
                viewgroup.findViewById(com.uservoice.uservoicesdk.R.id.uv_text2).setVisibility(8);
_L2:
                return viewgroup;
_L4:
                viewgroup = view;
                if (j != 3) goto _L2; else goto _L5
_L5:
                view = getLayoutInflater().inflate(com.uservoice.uservoicesdk.R.layout.uv_header_item_light, null);
                ((TextView)view.findViewById(com.uservoice.uservoicesdk.R.id.uv_header_text)).setText(com.uservoice.uservoicesdk.R.string.uv_idea_text_heading);
                return view;
                return super.getView(i, view, viewgroup);
            }

            public int getViewTypeCount()
            {
                return super.getViewTypeCount() + 2;
            }

            public boolean isEnabled(int i)
            {
                return getItemViewType(i) == 2 || super.isEnabled(i);
            }

            public void loadMore()
            {
                if (initializing)
                {
                    notifyDataSetChanged();
                }
                initializing = false;
                super.loadMore();
            }

            public void loadPage(int i, Callback callback)
            {
                Suggestion.loadSuggestions(forum, i, callback);
            }

            public RestTask search(final String query, Callback callback)
            {
                return Suggestion.searchSuggestions(forum, query, callback. new Callback() {

                    final _cls1 this$1;
                    final Callback val$callback;
                    final String val$query;

                    public void onError(RestResult restresult)
                    {
                        callback.onError(restresult);
                    }

                    public volatile void onModel(Object obj)
                    {
                        onModel((List)obj);
                    }

                    public void onModel(List list)
                    {
                        Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.SEARCH_IDEAS, query, list);
                        callback.onModel(list);
                    }

            
            {
                this$1 = final__pcls1;
                query = s;
                callback = Callback.this;
                super();
            }
                });
            }

            
            {
                this$0 = ForumActivity.this;
                super(context, i, list);
                initializing = true;
            }
        });
        getListView().setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final ForumActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (i == 0)
                {
                    startActivity(new Intent(ForumActivity.this, com/uservoice/uservoicesdk/activity/PostIdeaActivity));
                } else
                if (i != 1)
                {
                    adapterview = (Suggestion)getModelAdapter().getItem(i);
                    if (adapterview != null)
                    {
                        Session.getInstance().setSuggestion(adapterview);
                        (new SuggestionDialogFragment(adapterview)).show(getSupportFragmentManager(), "SuggestionDialogFragment");
                        return;
                    }
                }
            }

            
            {
                this$0 = ForumActivity.this;
                super();
            }
        });
        (new InitManager(this, new Runnable() {

            final ForumActivity this$0;

            public void run()
            {
                loadForum();
                Session.getInstance().setSignInListener(new Runnable() {

                    final _cls3 this$1;

                    public void run()
                    {
                        if (forum != null)
                        {
                            getModelAdapter().reload();
                        }
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
            }

            
            {
                this$0 = ForumActivity.this;
                super();
            }
        })).init();
    }

    protected void onStop()
    {
        Session.getInstance().setSignInListener(null);
        super.onStop();
    }

    public void showSearch()
    {
    }

    public void suggestionUpdated(Suggestion suggestion)
    {
        getModelAdapter().notifyDataSetChanged();
    }



/*
    static Forum access$002(ForumActivity forumactivity, Forum forum1)
    {
        forumactivity.forum = forum1;
        return forum1;
    }

*/

}
