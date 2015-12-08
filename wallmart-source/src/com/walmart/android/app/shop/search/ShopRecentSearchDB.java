// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.search;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.walmart.android.search.SearchData;
import com.walmartlabs.utils.WLog;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.search:
//            WalmartRecentSearchProvider, ShopSearchData

public class ShopRecentSearchDB extends SQLiteOpenHelper
    implements WalmartRecentSearchProvider
{

    private static final String DATABASE_NAME = "recent_store_seraches.db";
    private static final int DATABASE_VERSION = 1;
    public static final String MODIFIED_DATE = "search_modified_date";
    private static final String TABLE_NAME = "recent_searches";
    private static final String TAG = com/walmart/android/app/shop/search/ShopRecentSearchDB.getSimpleName();

    public ShopRecentSearchDB(Context context)
    {
        super(context, "recent_store_seraches.db", null, 1);
    }

    public void addSearch(ContentValues contentvalues)
    {
        long l = System.currentTimeMillis();
        String s = contentvalues.getAsString("suggest_text_1");
        if (contentvalues.getAsString("suggest_text_2") == null)
        {
            contentvalues.put("suggest_text_2", "");
        }
        if (TextUtils.isEmpty(contentvalues.getAsString("suggest_intent_data")))
        {
            contentvalues.put("suggest_intent_data", s);
        }
        contentvalues.put("search_modified_date", Long.valueOf(l));
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        try
        {
            s = (new StringBuilder()).append("suggest_text_1='").append(s).append("'").toString();
            int i = sqlitedatabase.delete("recent_searches", (new StringBuilder()).append(s).append(" AND suggest_text_2=''").toString(), null);
            WLog.i(TAG, (new StringBuilder()).append("insertRecentSearch() removed: ").append(i).append(" rows").toString());
        }
        catch (SQLException sqlexception)
        {
            sqlexception.printStackTrace();
        }
        sqlitedatabase.insert("recent_searches", null, contentvalues);
    }

    public void addSearch(ShopSearchData shopsearchdata)
    {
        if (!shopsearchdata.isFromBarcode())
        {
            String s;
            String s1;
            if (shopsearchdata.getSearchText() != null)
            {
                s = shopsearchdata.getSearchText().toString();
            } else
            {
                s = null;
            }
            if (shopsearchdata.getDepartment() != null)
            {
                s1 = shopsearchdata.getDepartment().toString();
            } else
            {
                s1 = null;
            }
            if (shopsearchdata.getDisplayDepartment() != null)
            {
                shopsearchdata = shopsearchdata.getDisplayDepartment().toString();
            } else
            {
                shopsearchdata = null;
            }
            insertRecentSearch(s, shopsearchdata, s, s1);
        }
    }

    public volatile void addSearch(SearchData searchdata)
    {
        addSearch((ShopSearchData)searchdata);
    }

    public void clearSearchHistory()
    {
        delete(null, null);
    }

    public int delete(String s, String as[])
    {
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        int i;
        try
        {
            i = sqlitedatabase.delete("recent_searches", s, as);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return 0;
        }
        return i;
    }

    public List getRecentSearches()
    {
        ArrayList arraylist = new ArrayList();
        Cursor cursor = query(null);
        if (cursor != null)
        {
            if (cursor.moveToFirst())
            {
                int i = cursor.getColumnIndex("suggest_intent_data");
                int j = cursor.getColumnIndex("suggest_intent_extra_data");
                do
                {
                    arraylist.add(new ShopSearchData(cursor.getString(i), cursor.getString(j), com.walmart.android.search.SearchData.SearchType.SEARCH_TYPE_RECENT));
                } while (cursor.moveToNext());
            }
            cursor.close();
        }
        return arraylist;
    }

    public void insertRecentSearch(String s, String s1, String s2, String s3)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("suggest_text_1", s);
        contentvalues.put("suggest_text_2", s1);
        contentvalues.put("suggest_intent_data", s2);
        contentvalues.put("suggest_intent_extra_data", s3);
        addSearch(contentvalues);
    }

    public boolean isEmpty()
    {
        Cursor cursor;
        Cursor cursor1;
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = getReadableDatabase();
        cursor1 = null;
        cursor = null;
        obj = ((SQLiteDatabase) (obj)).rawQuery("SELECT COUNT(*) FROM recent_searches", null);
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        ((Cursor) (obj)).moveToFirst();
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        ((Cursor) (obj)).getInt(0);
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        int i = ((Cursor) (obj)).getInt(0);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            flag1 = flag;
        }
_L2:
        return flag1;
        SQLException sqlexception;
        sqlexception;
        cursor1 = cursor;
        sqlexception.printStackTrace();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.close();
        return true;
        Exception exception;
        exception;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw exception;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        WLog.i(TAG, "onCreate");
        sqlitedatabase.execSQL("CREATE TABLE recent_searches (_id INTEGER PRIMARY KEY,suggest_text_1 TEXT,suggest_text_2 TEXT,suggest_intent_data TEXT,suggest_intent_extra_data TEXT,search_modified_date INTEGER);");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

    public Cursor query(String s)
    {
        String s1 = null;
        String as[] = null;
        if (!TextUtils.isEmpty(s))
        {
            s1 = "suggest_text_1 LIKE ?";
            as = new String[1];
            as[0] = (new StringBuilder()).append(s).append("%").toString();
        }
        return getReadableDatabase().query("recent_searches", null, s1, as, null, null, "search_modified_date DESC", "20");
    }

}
