// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.search:
//            RecentSearchProvider, SearchData

public class RecentSearchDataProvider extends SQLiteOpenHelper
    implements RecentSearchProvider
{

    private static final int DATABASE_VERSION = 1;
    private static final String MODIFIED_DATE = "search_modified_date";
    private static final String TABLE_NAME = "recent_searches";
    private static final String TAG = com/walmart/android/search/RecentSearchDataProvider.getSimpleName();

    public RecentSearchDataProvider(Context context, String s)
    {
        super(context, s, null, 1);
    }

    public void addSearch(SearchData searchdata)
    {
        if (searchdata.getSearchText() != null)
        {
            searchdata = searchdata.getSearchText().toString();
        } else
        {
            searchdata = null;
        }
        insertRecentSearch(searchdata);
    }

    public void clearSearchHistory()
    {
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        try
        {
            sqlitedatabase.delete("recent_searches", null, null);
            return;
        }
        catch (SQLException sqlexception)
        {
            sqlexception.printStackTrace();
        }
    }

    public List getRecentSearches()
    {
        ArrayList arraylist = new ArrayList();
        Cursor cursor = query();
        if (cursor != null)
        {
            if (cursor.moveToFirst())
            {
                int i = cursor.getColumnIndex("suggest_text_1");
                do
                {
                    arraylist.add(new SearchData(cursor.getString(i), SearchData.SearchType.SEARCH_TYPE_RECENT));
                } while (cursor.moveToNext());
            }
            cursor.close();
        }
        return arraylist;
    }

    public void insertRecentSearch(String s)
    {
        ContentValues contentvalues = new ContentValues();
        long l = System.currentTimeMillis();
        contentvalues.put("suggest_text_1", s);
        contentvalues.put("search_modified_date", Long.valueOf(l));
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        try
        {
            sqlitedatabase.delete("recent_searches", (new StringBuilder()).append("suggest_text_1='").append(s).append("'").toString(), null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        sqlitedatabase.insert("recent_searches", null, contentvalues);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE recent_searches (_id INTEGER PRIMARY KEY,suggest_text_1 TEXT,search_modified_date INTEGER);");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    public Cursor query()
    {
        return getReadableDatabase().query("recent_searches", null, null, null, null, null, "search_modified_date DESC", "20");
    }

}
