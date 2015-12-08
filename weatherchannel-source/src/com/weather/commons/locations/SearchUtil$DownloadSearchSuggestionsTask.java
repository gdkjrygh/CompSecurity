// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import android.database.MatrixCursor;
import android.os.AsyncTask;
import android.widget.SimpleCursorAdapter;
import com.weather.dal2.locations.Fetcher;
import com.weather.dal2.locations.LocationChoiceConnection;
import com.weather.util.ExceptionUtil;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.weather.commons.locations:
//            SearchUtil

private final class <init> extends AsyncTask
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
        java.util.List list = LocationChoiceConnection.getInstance().fetch(as[0], false);
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

    private ()
    {
        this$0 = SearchUtil.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
