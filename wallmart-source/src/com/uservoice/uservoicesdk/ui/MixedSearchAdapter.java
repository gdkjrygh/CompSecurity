// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.uservoice.uservoicesdk.activity.SearchActivity;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.Article;
import com.uservoice.uservoicesdk.model.BaseModel;
import com.uservoice.uservoicesdk.model.Suggestion;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;
import com.uservoice.uservoicesdk.rest.RestTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            SearchAdapter, Utils

public class MixedSearchAdapter extends SearchAdapter
    implements android.widget.AdapterView.OnItemClickListener
{

    protected static int LOADING = 1;
    public static int SCOPE_ALL = 0;
    public static int SCOPE_ARTICLES = 1;
    public static int SCOPE_IDEAS = 2;
    protected static int SEARCH_RESULT = 0;
    protected final FragmentActivity context;
    protected LayoutInflater inflater;

    public MixedSearchAdapter(FragmentActivity fragmentactivity)
    {
        context = fragmentactivity;
        inflater = (LayoutInflater)fragmentactivity.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        if (loading)
        {
            return 1;
        } else
        {
            return getScopedSearchResults().size();
        }
    }

    public Object getItem(int i)
    {
        if (loading)
        {
            return null;
        } else
        {
            return (BaseModel)getScopedSearchResults().get(i);
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        if (loading)
        {
            return LOADING;
        } else
        {
            return SEARCH_RESULT;
        }
    }

    public List getScopedSearchResults()
    {
        if (scope != SCOPE_ALL) goto _L2; else goto _L1
_L1:
        Object obj = searchResults;
_L4:
        return ((List) (obj));
_L2:
label0:
        {
            if (scope != SCOPE_ARTICLES)
            {
                break label0;
            }
            ArrayList arraylist1 = new ArrayList();
            Iterator iterator1 = searchResults.iterator();
            do
            {
                obj = arraylist1;
                if (!iterator1.hasNext())
                {
                    break;
                }
                obj = (BaseModel)iterator1.next();
                if (obj instanceof Article)
                {
                    arraylist1.add(obj);
                }
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (scope == SCOPE_IDEAS)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = searchResults.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                BaseModel basemodel = (BaseModel)iterator.next();
                if (basemodel instanceof Suggestion)
                {
                    arraylist.add(basemodel);
                }
            } while (true);
            return arraylist;
        } else
        {
            return null;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j;
        viewgroup = view;
        j = getItemViewType(i);
        view = viewgroup;
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        if (j != SEARCH_RESULT) goto _L4; else goto _L3
_L3:
        view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_instant_answer_item, null);
_L2:
        if (j == SEARCH_RESULT)
        {
            Utils.displayInstantAnswer(view, (BaseModel)getItem(i));
        }
        return view;
_L4:
        view = viewgroup;
        if (j == LOADING)
        {
            view = inflater.inflate(com.uservoice.uservoicesdk.R.layout.uv_loading_item, null);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEnabled(int i)
    {
        return !loading;
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (getItemViewType(i) == SEARCH_RESULT)
        {
            Utils.showModel(context, (BaseModel)getItem(i));
        }
    }

    protected RestTask search(final String query, final Callback callback)
    {
        currentQuery = query;
        return Article.loadInstantAnswers(query, new Callback() {

            final MixedSearchAdapter this$0;
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
                Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.SEARCH_ARTICLES, query, arraylist);
                Babayaga.track(com.uservoice.uservoicesdk.babayaga.Babayaga.Event.SEARCH_IDEAS, query, arraylist1);
                callback.onModel(list);
            }

            
            {
                this$0 = MixedSearchAdapter.this;
                query = s;
                callback = callback1;
                super();
            }
        });
    }

    protected void searchResultsUpdated()
    {
        int j = 0;
        int i = 0;
        for (Iterator iterator = searchResults.iterator(); iterator.hasNext();)
        {
            if ((BaseModel)iterator.next() instanceof Article)
            {
                j++;
            } else
            {
                i++;
            }
        }

        ((SearchActivity)context).updateScopedSearch(searchResults.size(), j, i);
    }

}
