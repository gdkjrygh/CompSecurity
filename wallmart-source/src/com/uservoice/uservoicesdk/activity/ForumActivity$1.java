// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.activity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;
import com.uservoice.uservoicesdk.rest.RestTask;
import com.uservoice.uservoicesdk.ui.PaginatedAdapter;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.uservoice.uservoicesdk.activity:
//            ForumActivity

class initializing extends PaginatedAdapter
{

    boolean initializing;
    final ForumActivity this$0;

    protected void customizeLayout(View view, Suggestion suggestion)
    {
        ((TextView)view.findViewById(com.uservoice.uservoicesdk.on_title)).setText(suggestion.getTitle());
        ((TextView)view.findViewById(com.uservoice.uservoicesdk.er_count)).setText(String.valueOf(suggestion.getNumberOfSubscribers()));
        TextView textview = (TextView)view.findViewById(com.uservoice.uservoicesdk.on_status);
        view = view.findViewById(com.uservoice.uservoicesdk.on_status_color);
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
        return ForumActivity.access$000(ForumActivity.this).getNumberOfOpenSuggestions();
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
        viewgroup = getLayoutInflater().inflate(com.uservoice.uservoicesdk._item, null);
        ((TextView)viewgroup.findViewById(com.uservoice.uservoicesdk._item)).setText(com.uservoice.uservoicesdk._an_idea);
        viewgroup.findViewById(com.uservoice.uservoicesdk._an_idea).setVisibility(8);
        viewgroup.findViewById(com.uservoice.uservoicesdk._an_idea).setVisibility(8);
_L2:
        return viewgroup;
_L4:
        viewgroup = view;
        if (j != 3) goto _L2; else goto _L5
_L5:
        view = getLayoutInflater().inflate(com.uservoice.uservoicesdk.er_item_light, null);
        ((TextView)view.findViewById(com.uservoice.uservoicesdk.ext)).setText(com.uservoice.uservoicesdk._text_heading);
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
        Suggestion.loadSuggestions(ForumActivity.access$000(ForumActivity.this), i, callback);
    }

    public RestTask search(final String query, final Callback callback)
    {
        return Suggestion.searchSuggestions(ForumActivity.access$000(ForumActivity.this), query, new Callback() {

            final ForumActivity._cls1 this$1;
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
                this$1 = ForumActivity._cls1.this;
                query = s;
                callback = callback1;
                super();
            }
        });
    }

    _cls1.val.callback(Context context, int i, List list)
    {
        this$0 = ForumActivity.this;
        super(context, i, list);
        initializing = true;
    }
}
