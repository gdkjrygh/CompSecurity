// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.res.Resources;
import android.database.MatrixCursor;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;
import com.weather.dal2.locations.Fetcher;
import com.weather.dal2.locations.LocationChoiceConnection;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchUtil
{
    private final class DownloadSearchSuggestionsTask extends AsyncTask
    {

        private static final String TAG = "DownloadSearchSuggestionsTask";
        final SearchUtil this$0;

        private MatrixCursor loadLocationSuggestions(Iterable iterable)
        {
            MatrixCursor matrixcursor = new MatrixCursor(SearchUtil.CURSOR_COLUMN_NAMES);
            String as[] = new String[2];
            int i = 0;
            for (iterable = iterable.iterator(); iterable.hasNext();)
            {
                Fetcher fetcher = (Fetcher)iterable.next();
                as[0] = Integer.toString(i);
                as[1] = fetcher.toString();
                matrixcursor.addRow(as);
                i++;
            }

            return matrixcursor;
        }

        protected transient MatrixCursor doInBackground(String as[])
        {
            List list = LocationChoiceConnection.getInstance().fetch(as[0], false);
            as = list;
_L1:
            Exception exception;
            if (isCancelled())
            {
                return null;
            } else
            {
                locationChoiceSuggestions = as;
                return loadLocationSuggestions(as);
            }
            exception;
            ExceptionUtil.logExceptionError("DownloadSearchSuggestionsTask", (new StringBuilder()).append("LocationChoiceConnection.get().fetch(").append(as[0]).append("): ").toString(), exception);
            as = new ArrayList();
              goto _L1
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(MatrixCursor matrixcursor)
        {
            suggestionsAdapter.changeCursor(matrixcursor);
            suggestionsAdapter.notifyDataSetChanged();
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((MatrixCursor)obj);
        }

        private DownloadSearchSuggestionsTask()
        {
            this$0 = SearchUtil.this;
            super();
        }

    }

    private final class SVOnQueryTextListener
        implements android.widget.SearchView.OnQueryTextListener
    {

        final SearchUtil this$0;

        public boolean onQueryTextChange(String s)
        {
            suggestionsAdapter.changeCursor(null);
            suggestionsAdapter.notifyDataSetChanged();
            if (searchTask != null && searchTask.getStatus() != android.os.AsyncTask.Status.FINISHED)
            {
                searchTask.cancel(true);
            }
            if (s != null && s.length() >= 2)
            {
                searchTask = new DownloadSearchSuggestionsTask();
                searchTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                    s
                });
            }
            return true;
        }

        public boolean onQueryTextSubmit(String s)
        {
            return false;
        }

        private SVOnQueryTextListener()
        {
            this$0 = SearchUtil.this;
            super();
        }

    }

    private final class SVOnSuggestionListener
        implements android.widget.SearchView.OnSuggestionListener
    {

        Activity activity;
        final Receiver receiver;
        final SearchUtil this$0;

        public boolean onSuggestionClick(int i)
        {
            Log.d("SearchUtil", (new StringBuilder()).append("onSuggestionClick position=").append(i).toString());
            setUpSearchViewAfterSuggestionIsClicked(i);
            return true;
        }

        public boolean onSuggestionSelect(int i)
        {
            return false;
        }

        SVOnSuggestionListener(Activity activity1, Receiver receiver1)
        {
            this$0 = SearchUtil.this;
            super();
            receiver = receiver1;
            activity = activity1;
        }
    }


    protected static final String CURSOR_COLUMN_NAMES[] = {
        "_id", "text"
    };
    protected static final int MIN_SEARCH_STRING_LENGTH = 2;
    private static final String TAG = "SearchUtil";
    protected static final int TEXT_COL_IDX = 1;
    protected List locationChoiceSuggestions;
    protected final Receiver receiver;
    protected final MenuItem searchItem;
    private EditText searchPlate;
    private DownloadSearchSuggestionsTask searchTask;
    protected final SearchView searchView;
    protected SimpleCursorAdapter suggestionsAdapter;

    public SearchUtil(Menu menu, int i, Receiver receiver1)
    {
        searchItem = menu.findItem(i);
        receiver = receiver1;
        if (searchItem != null)
        {
            menu = searchItem.getActionView();
            if (menu instanceof SearchView)
            {
                menu = (SearchView)menu;
            } else
            {
                menu = null;
            }
            searchView = menu;
            return;
        } else
        {
            searchView = null;
            return;
        }
    }

    public SearchUtil(SearchView searchview, Receiver receiver1)
    {
        searchItem = null;
        receiver = receiver1;
        searchView = searchview;
    }

    private static SimpleCursorAdapter getCustomSimpleCursorAdapter(Activity activity)
    {
        MatrixCursor matrixcursor = new MatrixCursor(CURSOR_COLUMN_NAMES);
        return new SimpleCursorAdapter(activity, com.weather.commons.R.layout.simple_list_item, matrixcursor, new String[] {
            "text"
        }, new int[] {
            0x1020014
        }, 1);
    }

    public void moveCursorToStart()
    {
        searchPlate.setSelection(0);
    }

    protected void setSearchViewListenerAndAdapter(Activity activity)
    {
        SearchManager searchmanager = (SearchManager)activity.getSystemService("search");
        searchView.setSearchableInfo(searchmanager.getSearchableInfo(activity.getComponentName()));
        searchView.setIconifiedByDefault(true);
        searchView.setOnQueryTextListener(new SVOnQueryTextListener());
        suggestionsAdapter = getCustomSimpleCursorAdapter(activity);
        searchView.setSuggestionsAdapter(suggestionsAdapter);
    }

    protected void setTextColor(int i, Resources resources)
    {
        int j = resources.getIdentifier("android:id/search_src_text", null, null);
        searchPlate = (EditText)searchView.findViewById(j);
        searchPlate.setTextColor(i);
    }

    protected boolean setUpSearchViewAfterSuggestionIsClicked(int i)
    {
label0:
        {
            String s = ((MatrixCursor)suggestionsAdapter.getItem(i)).getString(1);
            ((Fetcher)locationChoiceSuggestions.get(i)).fetch(receiver, s);
            if (searchItem != null)
            {
                searchItem.collapseActionView();
                break label0;
            }
            try
            {
                if (searchView != null)
                {
                    searchView.setIconified(true);
                }
            }
            catch (Exception exception)
            {
                LogUtil.e("SearchUtil", LoggingMetaTags.TWC_UI, (new StringBuilder()).append("Invalid search suggestion. ").append(exception.getMessage()).toString(), new Object[0]);
                return false;
            }
        }
        return true;
    }

    public void setupSearchView(Activity activity, int i)
    {
        if (searchView == null)
        {
            return;
        } else
        {
            setTextColor(i, searchView.getContext().getResources());
            setSearchViewListenerAndAdapter(activity);
            searchView.setOnSuggestionListener(new SVOnSuggestionListener(activity, receiver));
            return;
        }
    }




/*
    static DownloadSearchSuggestionsTask access$102(SearchUtil searchutil, DownloadSearchSuggestionsTask downloadsearchsuggestionstask)
    {
        searchutil.searchTask = downloadsearchsuggestionstask;
        return downloadsearchsuggestionstask;
    }

*/
}
