// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.search;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.editor.Placemark;
import com.arubanetworks.meridian.log.MeridianLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.arubanetworks.meridian.search:
//            LocalSearch, LocalSearchResponse, LocalSearchResult

public class SearchFragment extends Fragment
    implements LocalSearch.LocalSearchListener
{
    public static interface OnSearchResultSelectedListener
    {

        public abstract void onSearchCanceled();

        public abstract void onSearchResultSelected(LocalSearchResult localsearchresult);
    }


    private static final MeridianLogger a;
    private EditorKey b;
    private List c;
    private LocalSearch d;
    private ProgressBar e;
    private List f;
    private ArrayAdapter g;

    public SearchFragment()
    {
        f = new ArrayList();
    }

    static List a(SearchFragment searchfragment)
    {
        return searchfragment.f;
    }

    static void a(SearchFragment searchfragment, String s)
    {
        searchfragment.a(s);
    }

    private void a(String s)
    {
        if (d != null)
        {
            d.cancel();
        }
        e.setVisibility(0);
        d = (new LocalSearch.Builder()).setQuery(s).setApp(b).setListener(this).build();
        d.start();
    }

    public static SearchFragment newInstance(EditorKey editorkey, List list)
    {
        if (editorkey == null)
        {
            throw new IllegalArgumentException("AppKey must not be null");
        }
        SearchFragment searchfragment = new SearchFragment();
        Bundle bundle1 = searchfragment.getArguments();
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
            searchfragment.setArguments(bundle);
        }
        bundle.putSerializable("meridian.AppKey", editorkey);
        if (list != null && list.size() > 0)
        {
            bundle.putSerializable("meridian.SearchExclusionList", new ArrayList(list));
        }
        return searchfragment;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (!(activity instanceof OnSearchResultSelectedListener))
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement OnSearchResultSelectedListener").toString());
        } else
        {
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b = (EditorKey)getArguments().getSerializable("meridian.AppKey");
        c = (ArrayList)getArguments().getSerializable("meridian.SearchExclusionList");
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(com.arubanetworks.meridian.R.menu.mr_search_menu, menu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.arubanetworks.meridian.R.layout.mr_search_fragment, viewgroup, false);
    /* block-local class not found */
    class a {}

        ((EditText)layoutinflater.findViewById(com.arubanetworks.meridian.R.id.mr_search_view)).addTextChangedListener(new a(null));
        e = (ProgressBar)layoutinflater.findViewById(com.arubanetworks.meridian.R.id.mr_progress_bar);
        e.setVisibility(4);
        viewgroup = (ListView)layoutinflater.findViewById(com.arubanetworks.meridian.R.id.mr_list_view);
        g = new _cls1(getActivity(), 0x1090003, 0x1020014, f);
        viewgroup.setAdapter(g);
        viewgroup.setOnItemClickListener(new _cls2());
        return layoutinflater;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.arubanetworks.meridian.R.id.mr_action_cancel)
        {
            ((OnSearchResultSelectedListener)getActivity()).onSearchCanceled();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onSearchComplete(LocalSearchResponse localsearchresponse)
    {
        e.setVisibility(4);
        f.clear();
        if (c != null)
        {
            localsearchresponse = localsearchresponse.getResults().iterator();
            do
            {
                if (!localsearchresponse.hasNext())
                {
                    break;
                }
                LocalSearchResult localsearchresult = (LocalSearchResult)localsearchresponse.next();
                Placemark placemark = localsearchresult.getPlacemark();
                if (placemark == null || !c.contains(placemark.getKey()))
                {
                    f.add(localsearchresult);
                }
            } while (true);
        } else
        {
            f.addAll(localsearchresponse.getResults());
        }
        g.notifyDataSetChanged();
    }

    public void onSearchError(Throwable throwable)
    {
        e.setVisibility(4);
        a.e("search error: ", throwable);
    }

    static 
    {
        a = MeridianLogger.forTag("SearchFragment").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.SEARCH);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
