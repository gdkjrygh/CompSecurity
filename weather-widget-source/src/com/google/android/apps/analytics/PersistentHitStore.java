// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.google.android.apps.analytics:
//            HitStore, Utils, Referrer, Event, 
//            CustomVariableBuffer, CustomVariable, Hit, GoogleAnalyticsTracker, 
//            HitBuilder, Item, Transaction

class PersistentHitStore
    implements HitStore
{

    private static final String ACCOUNT_ID = "account_id";
    private static final String ACTION = "action";
    private static final String CATEGORY = "category";
    private static final String CREATE_CUSTOM_VARIABLES_TABLE = (new StringBuilder()).append("CREATE TABLE custom_variables (").append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
        "cv_id"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "event_id"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "cv_index"
    })).append(String.format(" '%s' CHAR(64) NOT NULL,", new Object[] {
        "cv_name"
    })).append(String.format(" '%s' CHAR(64) NOT NULL,", new Object[] {
        "cv_value"
    })).append(String.format(" '%s' INTEGER NOT NULL);", new Object[] {
        "cv_scope"
    })).toString();
    private static final String CREATE_CUSTOM_VAR_CACHE_TABLE = (new StringBuilder()).append("CREATE TABLE IF NOT EXISTS custom_var_cache (").append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
        "cv_id"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "event_id"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "cv_index"
    })).append(String.format(" '%s' CHAR(64) NOT NULL,", new Object[] {
        "cv_name"
    })).append(String.format(" '%s' CHAR(64) NOT NULL,", new Object[] {
        "cv_value"
    })).append(String.format(" '%s' INTEGER NOT NULL);", new Object[] {
        "cv_scope"
    })).toString();
    private static final String CREATE_EVENTS_TABLE = (new StringBuilder()).append("CREATE TABLE events (").append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
        "event_id"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "user_id"
    })).append(String.format(" '%s' CHAR(256) NOT NULL,", new Object[] {
        "account_id"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "random_val"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "timestamp_first"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "timestamp_previous"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "timestamp_current"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "visits"
    })).append(String.format(" '%s' CHAR(256) NOT NULL,", new Object[] {
        "category"
    })).append(String.format(" '%s' CHAR(256) NOT NULL,", new Object[] {
        "action"
    })).append(String.format(" '%s' CHAR(256), ", new Object[] {
        "label"
    })).append(String.format(" '%s' INTEGER,", new Object[] {
        "value"
    })).append(String.format(" '%s' INTEGER,", new Object[] {
        "screen_width"
    })).append(String.format(" '%s' INTEGER);", new Object[] {
        "screen_height"
    })).toString();
    private static final String CREATE_HITS_TABLE = (new StringBuilder()).append("CREATE TABLE IF NOT EXISTS hits (").append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
        "hit_id"
    })).append(String.format(" '%s' TEXT NOT NULL,", new Object[] {
        "hit_string"
    })).append(String.format(" '%s' INTEGER NOT NULL);", new Object[] {
        "hit_time"
    })).toString();
    private static final String CREATE_INSTALL_REFERRER_TABLE = "CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);";
    private static final String CREATE_ITEM_EVENTS_TABLE = (new StringBuilder()).append("CREATE TABLE item_events (").append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
        "item_id"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "event_id"
    })).append(String.format(" '%s' TEXT NOT NULL,", new Object[] {
        "order_id"
    })).append(String.format(" '%s' TEXT NOT NULL,", new Object[] {
        "item_sku"
    })).append(String.format(" '%s' TEXT,", new Object[] {
        "item_name"
    })).append(String.format(" '%s' TEXT,", new Object[] {
        "item_category"
    })).append(String.format(" '%s' TEXT NOT NULL,", new Object[] {
        "item_price"
    })).append(String.format(" '%s' TEXT NOT NULL);", new Object[] {
        "item_count"
    })).toString();
    private static final String CREATE_REFERRER_TABLE = "CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);";
    private static final String CREATE_SESSION_TABLE = (new StringBuilder()).append("CREATE TABLE IF NOT EXISTS session (").append(String.format(" '%s' INTEGER PRIMARY KEY,", new Object[] {
        "timestamp_first"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "timestamp_previous"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "timestamp_current"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "visits"
    })).append(String.format(" '%s' INTEGER NOT NULL);", new Object[] {
        "store_id"
    })).toString();
    private static final String CREATE_TRANSACTION_EVENTS_TABLE = (new StringBuilder()).append("CREATE TABLE transaction_events (").append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
        "tran_id"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "event_id"
    })).append(String.format(" '%s' TEXT NOT NULL,", new Object[] {
        "order_id"
    })).append(String.format(" '%s' TEXT,", new Object[] {
        "tran_storename"
    })).append(String.format(" '%s' TEXT NOT NULL,", new Object[] {
        "tran_totalcost"
    })).append(String.format(" '%s' TEXT,", new Object[] {
        "tran_totaltax"
    })).append(String.format(" '%s' TEXT);", new Object[] {
        "tran_shippingcost"
    })).toString();
    private static final String CUSTOMVAR_ID = "cv_id";
    private static final String CUSTOMVAR_INDEX = "cv_index";
    private static final String CUSTOMVAR_NAME = "cv_name";
    private static final String CUSTOMVAR_SCOPE = "cv_scope";
    private static final String CUSTOMVAR_VALUE = "cv_value";
    private static final String CUSTOM_VARIABLE_COLUMN_TYPE = "CHAR(64) NOT NULL";
    private static final String DATABASE_NAME = "google_analytics.db";
    private static final int DATABASE_VERSION = 5;
    private static final String EVENT_ID = "event_id";
    private static final String HIT_ID = "hit_id";
    private static final String HIT_STRING = "hit_string";
    private static final String HIT_TIMESTAMP = "hit_time";
    private static final String ITEM_CATEGORY = "item_category";
    private static final String ITEM_COUNT = "item_count";
    private static final String ITEM_ID = "item_id";
    private static final String ITEM_NAME = "item_name";
    private static final String ITEM_PRICE = "item_price";
    private static final String ITEM_SKU = "item_sku";
    private static final String LABEL = "label";
    private static final int MAX_HITS = 1000;
    private static final String ORDER_ID = "order_id";
    private static final String RANDOM_VAL = "random_val";
    static final String REFERRER = "referrer";
    static final String REFERRER_COLUMN = "referrer";
    static final String REFERRER_INDEX = "referrer_index";
    static final String REFERRER_VISIT = "referrer_visit";
    private static final String SCREEN_HEIGHT = "screen_height";
    private static final String SCREEN_WIDTH = "screen_width";
    private static final String SHIPPING_COST = "tran_shippingcost";
    private static final String STORE_ID = "store_id";
    private static final String STORE_NAME = "tran_storename";
    private static final String TIMESTAMP_CURRENT = "timestamp_current";
    private static final String TIMESTAMP_FIRST = "timestamp_first";
    private static final String TIMESTAMP_PREVIOUS = "timestamp_previous";
    static final String TIMESTAMP_REFERRER = "timestamp_referrer";
    private static final String TOTAL_COST = "tran_totalcost";
    private static final String TOTAL_TAX = "tran_totaltax";
    private static final String TRANSACTION_ID = "tran_id";
    private static final String USER_ID = "user_id";
    private static final String VALUE = "value";
    private static final String VISITS = "visits";
    private boolean anonymizeIp;
    private DataBaseHelper databaseHelper;
    private volatile int numStoredHits;
    private Random random;
    private int sampleRate;
    private boolean sessionStarted;
    private int storeId;
    private long timestampCurrent;
    private long timestampFirst;
    private long timestampPrevious;
    private boolean useStoredVisitorVars;
    private CustomVariableBuffer visitorCVCache;
    private int visits;

    PersistentHitStore(Context context)
    {
        this(context, "google_analytics.db", 5);
    }

    PersistentHitStore(Context context, String s)
    {
        this(context, s, 5);
    }

    PersistentHitStore(Context context, String s, int i)
    {
        sampleRate = 100;
        random = new Random();
        databaseHelper = new DataBaseHelper(context, s, i, this);
        loadExistingSession();
        visitorCVCache = getVisitorVarBuffer();
    }

    PersistentHitStore(DataBaseHelper databasehelper)
    {
        sampleRate = 100;
        random = new Random();
        databaseHelper = databasehelper;
        loadExistingSession();
        visitorCVCache = getVisitorVarBuffer();
    }

    private static boolean endTransaction(SQLiteDatabase sqlitedatabase)
    {
        try
        {
            sqlitedatabase.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            Log.e("GoogleAnalyticsTracker", (new StringBuilder()).append("exception ending transaction:").append(sqlitedatabase.toString()).toString());
            return false;
        }
        return true;
    }

    static String formatReferrer(String s)
    {
        if (s == null)
        {
            return null;
        }
        Object obj;
        boolean flag;
        int i;
        boolean flag1;
        boolean flag3;
        if (!s.contains("="))
        {
            if (s.contains("%3D"))
            {
                try
                {
                    s = URLDecoder.decode(s, "UTF-8");
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return null;
                }
            } else
            {
                return null;
            }
        }
        obj = Utils.parseURLParameters(s);
        if (((Map) (obj)).get("utm_campaign") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Map) (obj)).get("utm_medium") != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (((Map) (obj)).get("utm_source") != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (((Map) (obj)).get("gclid") != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag3 && (!flag || !i || !flag1))
        {
            Log.w("GoogleAnalyticsTracker", "Badly formatted referrer missing campaign, medium and source or click ID");
            return null;
        }
        s = new String[7][];
        s[0] = (new String[] {
            "utmcid", (String)((Map) (obj)).get("utm_id")
        });
        s[1] = (new String[] {
            "utmcsr", (String)((Map) (obj)).get("utm_source")
        });
        s[2] = (new String[] {
            "utmgclid", (String)((Map) (obj)).get("gclid")
        });
        s[3] = (new String[] {
            "utmccn", (String)((Map) (obj)).get("utm_campaign")
        });
        s[4] = (new String[] {
            "utmcmd", (String)((Map) (obj)).get("utm_medium")
        });
        s[5] = (new String[] {
            "utmctr", (String)((Map) (obj)).get("utm_term")
        });
        s[6] = (new String[] {
            "utmcct", (String)((Map) (obj)).get("utm_content")
        });
        obj = new StringBuilder();
        i = 0;
        flag = true;
        while (i < s.length) 
        {
            boolean flag2 = flag;
            if (s[i][1] != null)
            {
                String s1 = s[i][1].replace("+", "%20").replace(" ", "%20");
                if (flag)
                {
                    flag = false;
                } else
                {
                    ((StringBuilder) (obj)).append("|");
                }
                ((StringBuilder) (obj)).append(s[i][0]).append("=").append(s1);
                flag2 = flag;
            }
            i++;
            flag = flag2;
        }
        return ((StringBuilder) (obj)).toString();
    }

    private Referrer getAndUpdateReferrer(SQLiteDatabase sqlitedatabase)
    {
        Object obj = readCurrentReferrer(sqlitedatabase);
        if (obj != null)
        {
            if (((Referrer) (obj)).getTimeStamp() != 0L)
            {
                return ((Referrer) (obj));
            }
            int i = ((Referrer) (obj)).getIndex();
            obj = ((Referrer) (obj)).getReferrerString();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("referrer", ((String) (obj)));
            contentvalues.put("timestamp_referrer", Long.valueOf(timestampCurrent));
            contentvalues.put("referrer_visit", Integer.valueOf(visits));
            contentvalues.put("referrer_index", Integer.valueOf(i));
            if (setReferrerDatabase(sqlitedatabase, contentvalues))
            {
                return new Referrer(((String) (obj)), timestampCurrent, visits, i);
            }
        }
        return null;
    }

    private void putEvent(Event event, SQLiteDatabase sqlitedatabase, boolean flag)
    {
        if (!event.isSessionInitialized())
        {
            event.setRandomVal(random.nextInt(0x7fffffff));
            event.setTimestampFirst((int)timestampFirst);
            event.setTimestampPrevious((int)timestampPrevious);
            event.setTimestampCurrent((int)timestampCurrent);
            event.setVisits(visits);
        }
        event.setAnonymizeIp(anonymizeIp);
        if (event.getUserId() == -1)
        {
            event.setUserId(storeId);
        }
        putCustomVariables(event, sqlitedatabase);
        Referrer referrer = getAndUpdateReferrer(sqlitedatabase);
        String as[] = event.accountId.split(",");
        if (as.length == 1)
        {
            writeEventToDatabase(event, referrer, sqlitedatabase, flag);
        } else
        {
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                writeEventToDatabase(new Event(event, as[i]), referrer, sqlitedatabase, flag);
                i++;
            }
        }
    }

    private boolean setReferrerDatabase(SQLiteDatabase sqlitedatabase, ContentValues contentvalues)
    {
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("referrer", null, null);
        sqlitedatabase.insert("referrer", null, contentvalues);
        sqlitedatabase.setTransactionSuccessful();
        if (!sqlitedatabase.inTransaction() || endTransaction(sqlitedatabase)) goto _L2; else goto _L1
_L1:
        return false;
        contentvalues;
        Log.e("GoogleAnalyticsTracker", contentvalues.toString());
        if (sqlitedatabase.inTransaction() && !endTransaction(sqlitedatabase))
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
        contentvalues;
        if (!sqlitedatabase.inTransaction() || endTransaction(sqlitedatabase))
        {
            throw contentvalues;
        }
        if (true) goto _L1; else goto _L2
_L2:
        return true;
    }

    public void clearReferrer()
    {
        try
        {
            databaseHelper.getWritableDatabase().delete("referrer", null, null);
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        }
    }

    public void deleteHit(long l)
    {
        this;
        JVM INSTR monitorenter ;
        numStoredHits = numStoredHits - databaseHelper.getWritableDatabase().delete("hits", "hit_id = ?", new String[] {
            Long.toString(l)
        });
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    CustomVariableBuffer getCustomVariables(long l, SQLiteDatabase sqlitedatabase)
    {
        CustomVariableBuffer customvariablebuffer = new CustomVariableBuffer();
        Object obj = sqlitedatabase.query("custom_variables", null, "event_id= ?", new String[] {
            Long.toString(l)
        }, null, null, null);
_L4:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        customvariablebuffer.setCustomVariable(new CustomVariable(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_index")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_name")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_value")), ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_scope"))));
        if (true) goto _L4; else goto _L3
_L3:
        SQLiteException sqliteexception;
        sqliteexception;
_L10:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
_L6:
        return customvariablebuffer;
_L2:
        if (obj == null) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj)).close();
        return customvariablebuffer;
        obj;
        sqlitedatabase = null;
_L8:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw obj;
        obj;
        if (true) goto _L8; else goto _L7
_L7:
        sqliteexception;
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    DataBaseHelper getDatabaseHelper()
    {
        return databaseHelper;
    }

    Item getItem(long l, SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.query("item_events", null, "event_id= ?", new String[] {
            Long.toString(l)
        }, null, null, null);
        Item item;
        if (!sqlitedatabase.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        item = (new Item.Builder(sqlitedatabase.getString(sqlitedatabase.getColumnIndex("order_id")), sqlitedatabase.getString(sqlitedatabase.getColumnIndex("item_sku")), sqlitedatabase.getDouble(sqlitedatabase.getColumnIndex("item_price")), sqlitedatabase.getLong(sqlitedatabase.getColumnIndex("item_count")))).setItemName(sqlitedatabase.getString(sqlitedatabase.getColumnIndex("item_name"))).setItemCategory(sqlitedatabase.getString(sqlitedatabase.getColumnIndex("item_category"))).build();
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return item;
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
_L1:
        return null;
        Object obj;
        obj;
        sqlitedatabase = null;
_L4:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
          goto _L1
        obj;
        sqlitedatabase = null;
_L3:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L3; else goto _L2
_L2:
        obj;
          goto _L4
    }

    public int getNumStoredHits()
    {
        return numStoredHits;
    }

    public int getNumStoredHitsFromDb()
    {
        Cursor cursor;
        Cursor cursor1;
        int i;
        int j;
        cursor1 = null;
        cursor = null;
        j = 0;
        i = 0;
        Cursor cursor2 = databaseHelper.getReadableDatabase().rawQuery("SELECT COUNT(*) from hits", null);
        cursor = cursor2;
        cursor1 = cursor2;
        if (!cursor2.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        cursor = cursor2;
        cursor1 = cursor2;
        long l = cursor2.getLong(0);
        i = (int)l;
        j = i;
        if (cursor2 != null)
        {
            cursor2.close();
            j = i;
        }
_L2:
        return j;
        SQLiteException sqliteexception;
        sqliteexception;
        cursor1 = cursor;
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.close();
        return 0;
        Exception exception;
        exception;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw exception;
    }

    public Referrer getReferrer()
    {
        Referrer referrer;
        try
        {
            referrer = readCurrentReferrer(databaseHelper.getReadableDatabase());
        }
        catch (SQLiteException sqliteexception)
        {
            Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
            return null;
        }
        return referrer;
    }

    public String getSessionId()
    {
        if (!sessionStarted)
        {
            return null;
        } else
        {
            return Integer.toString((int)timestampCurrent);
        }
    }

    public int getStoreId()
    {
        return storeId;
    }

    long getTimestampCurrent()
    {
        return timestampCurrent;
    }

    long getTimestampFirst()
    {
        return timestampFirst;
    }

    long getTimestampPrevious()
    {
        return timestampPrevious;
    }

    Transaction getTransaction(long l, SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("transaction_events", null, "event_id= ?", new String[] {
            Long.toString(l)
        }, null, null, null);
        sqlitedatabase = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_159;
        }
        sqlitedatabase = cursor;
        Transaction transaction = (new Transaction.Builder(cursor.getString(cursor.getColumnIndex("order_id")), cursor.getDouble(cursor.getColumnIndex("tran_totalcost")))).setStoreName(cursor.getString(cursor.getColumnIndex("tran_storename"))).setTotalTax(cursor.getDouble(cursor.getColumnIndex("tran_totaltax"))).setShippingCost(cursor.getDouble(cursor.getColumnIndex("tran_shippingcost"))).build();
        if (cursor != null)
        {
            cursor.close();
        }
        return transaction;
        if (cursor != null)
        {
            cursor.close();
        }
_L1:
        return null;
        SQLiteException sqliteexception;
        sqliteexception;
        cursor = null;
_L4:
        sqlitedatabase = cursor;
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (cursor != null)
        {
            cursor.close();
        }
          goto _L1
        Exception exception;
        exception;
        sqlitedatabase = null;
_L3:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw exception;
        exception;
        if (true) goto _L3; else goto _L2
_L2:
        sqliteexception;
          goto _L4
    }

    public String getVisitorCustomVar(int i)
    {
        CustomVariable customvariable = visitorCVCache.getCustomVariableAt(i);
        if (customvariable == null || customvariable.getScope() != 1)
        {
            return null;
        } else
        {
            return customvariable.getValue();
        }
    }

    public String getVisitorId()
    {
        if (!sessionStarted)
        {
            return null;
        } else
        {
            return String.format("%d.%d", new Object[] {
                Integer.valueOf(storeId), Long.valueOf(timestampFirst)
            });
        }
    }

    CustomVariableBuffer getVisitorVarBuffer()
    {
        CustomVariableBuffer customvariablebuffer;
        try
        {
            customvariablebuffer = getVisitorVarBuffer(databaseHelper.getReadableDatabase());
        }
        catch (SQLiteException sqliteexception)
        {
            Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
            return new CustomVariableBuffer();
        }
        return customvariablebuffer;
    }

    CustomVariableBuffer getVisitorVarBuffer(SQLiteDatabase sqlitedatabase)
    {
        CustomVariableBuffer customvariablebuffer = new CustomVariableBuffer();
        Object obj = sqlitedatabase.query("custom_var_cache", null, "cv_scope= ?", new String[] {
            Integer.toString(1)
        }, null, null, null);
_L4:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        customvariablebuffer.setCustomVariable(new CustomVariable(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_index")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_name")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_value")), ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_scope"))));
        if (true) goto _L4; else goto _L3
_L3:
        SQLiteException sqliteexception;
        sqliteexception;
_L10:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
_L6:
        return customvariablebuffer;
_L2:
        if (obj == null) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj)).close();
        return customvariablebuffer;
        obj;
        sqlitedatabase = null;
_L8:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw obj;
        obj;
        if (true) goto _L8; else goto _L7
_L7:
        sqliteexception;
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    int getVisits()
    {
        return visits;
    }

    public void loadExistingSession()
    {
        try
        {
            loadExistingSession(databaseHelper.getWritableDatabase());
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        }
    }

    public void loadExistingSession(SQLiteDatabase sqlitedatabase)
    {
        Object obj = sqlitedatabase.query("session", null, null, null, null, null, null);
        Object obj1 = obj;
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        timestampFirst = ((Cursor) (obj)).getLong(0);
        obj1 = obj;
        timestampPrevious = ((Cursor) (obj)).getLong(1);
        obj1 = obj;
        timestampCurrent = ((Cursor) (obj)).getLong(2);
        obj1 = obj;
        visits = ((Cursor) (obj)).getInt(3);
        obj1 = obj;
        storeId = ((Cursor) (obj)).getInt(4);
        obj1 = obj;
        sqlitedatabase = readCurrentReferrer(sqlitedatabase);
        obj1 = obj;
        if (timestampFirst == 0L) goto _L4; else goto _L3
_L3:
        if (sqlitedatabase == null) goto _L6; else goto _L5
_L5:
        obj1 = obj;
        if (sqlitedatabase.getTimeStamp() == 0L) goto _L4; else goto _L6
_L14:
        obj1 = obj;
        boolean flag;
        sessionStarted = flag;
_L7:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
_L9:
        return;
_L4:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        obj1 = obj;
        sessionStarted = false;
        obj1 = obj;
        useStoredVisitorVars = true;
        obj1 = obj;
        storeId = (new SecureRandom()).nextInt() & 0x7fffffff;
        obj1 = obj;
        ((Cursor) (obj)).close();
        obj = new ContentValues();
        ((ContentValues) (obj)).put("timestamp_first", Long.valueOf(0L));
        ((ContentValues) (obj)).put("timestamp_previous", Long.valueOf(0L));
        ((ContentValues) (obj)).put("timestamp_current", Long.valueOf(0L));
        ((ContentValues) (obj)).put("visits", Integer.valueOf(0));
        ((ContentValues) (obj)).put("store_id", Integer.valueOf(storeId));
        sqlitedatabase.insert("session", null, ((ContentValues) (obj)));
        obj = null;
          goto _L7
        sqlitedatabase;
        obj = null;
_L12:
        obj1 = obj;
        Log.e("GoogleAnalyticsTracker", sqlitedatabase.toString());
        if (obj == null) goto _L9; else goto _L8
_L8:
        ((Cursor) (obj)).close();
        return;
        sqlitedatabase;
        obj1 = null;
_L11:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw sqlitedatabase;
        sqlitedatabase;
        if (true) goto _L11; else goto _L10
_L10:
        sqlitedatabase;
          goto _L12
_L6:
        flag = true;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public Event[] peekEvents(int i, SQLiteDatabase sqlitedatabase, int j)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = sqlitedatabase.query("events", null, null, null, null, null, "event_id", Integer.toString(i));
_L5:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        Event event;
        long l;
        event = new Event(((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getString(2), ((Cursor) (obj)).getInt(3), ((Cursor) (obj)).getInt(4), ((Cursor) (obj)).getInt(5), ((Cursor) (obj)).getInt(6), ((Cursor) (obj)).getInt(7), ((Cursor) (obj)).getString(8), ((Cursor) (obj)).getString(9), ((Cursor) (obj)).getString(10), ((Cursor) (obj)).getInt(11), ((Cursor) (obj)).getInt(12), ((Cursor) (obj)).getInt(13));
        event.setUserId(((Cursor) (obj)).getInt(1));
        l = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("event_id"));
        if (!"__##GOOGLETRANSACTION##__".equals(event.category)) goto _L4; else goto _L3
_L3:
        Object obj1 = getTransaction(l, sqlitedatabase);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("missing expected transaction for event ").append(l).toString());
        event.setTransaction(((Transaction) (obj1)));
_L8:
        arraylist.add(event);
          goto _L5
        Object obj2;
        obj2;
        sqlitedatabase = ((SQLiteDatabase) (obj));
        obj = obj2;
_L11:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return new Event[0];
_L4:
        if (!"__##GOOGLEITEM##__".equals(event.category)) goto _L7; else goto _L6
_L6:
        obj2 = getItem(l, sqlitedatabase);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_359;
        }
        Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("missing expected item for event ").append(l).toString());
        event.setItem(((Item) (obj2)));
          goto _L8
        sqlitedatabase;
_L10:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw sqlitedatabase;
_L7:
        if (j <= 1)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        obj2 = getCustomVariables(l, sqlitedatabase);
_L9:
        event.setCustomVariableBuffer(((CustomVariableBuffer) (obj2)));
          goto _L8
        obj2 = new CustomVariableBuffer();
          goto _L9
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return (Event[])arraylist.toArray(new Event[arraylist.size()]);
          goto _L8
        sqlitedatabase;
        obj = null;
          goto _L10
        obj2;
        obj = sqlitedatabase;
        sqlitedatabase = ((SQLiteDatabase) (obj2));
          goto _L10
        obj;
        sqlitedatabase = null;
          goto _L11
    }

    public Hit[] peekHits()
    {
        return peekHits(1000);
    }

    public Hit[] peekHits(int i)
    {
        Object obj2 = new ArrayList();
        Object obj1 = databaseHelper.getReadableDatabase().query("hits", null, null, null, null, null, "hit_id", Integer.toString(i));
_L2:
        Object obj = obj1;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((List) (obj2)).add(new Hit(((Cursor) (obj1)).getString(1), ((Cursor) (obj1)).getLong(0)));
        if (true) goto _L2; else goto _L1
        obj2;
_L6:
        obj = obj1;
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj2)).toString());
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return new Hit[0];
_L1:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return (Hit[])((List) (obj2)).toArray(new Hit[((List) (obj2)).size()]);
        obj1;
        obj = null;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void putCustomVariables(Event event, SQLiteDatabase sqlitedatabase)
    {
        if (!"__##GOOGLEITEM##__".equals(event.category) && !"__##GOOGLETRANSACTION##__".equals(event.category)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        obj1 = event.getCustomVariableBuffer();
        break MISSING_BLOCK_LABEL_33;
_L8:
        int i;
        if (i > 5) goto _L4; else goto _L3
_L3:
        event = visitorCVCache.getCustomVariableAt(i);
        obj1 = ((CustomVariableBuffer) (obj)).getCustomVariableAt(i);
        if (event == null || obj1 != null) goto _L6; else goto _L5
_L5:
        ((CustomVariableBuffer) (obj)).setCustomVariable(event);
          goto _L6
_L4:
        useStoredVisitorVars = false;
        event = ((Event) (obj));
        continue; /* Loop/switch isn't completed */
_L10:
        if (i > 5) goto _L1; else goto _L7
_L7:
        if (event.isIndexAvailable(i))
        {
            break MISSING_BLOCK_LABEL_311;
        }
        obj = event.getCustomVariableAt(i);
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("event_id", Integer.valueOf(0));
        ((ContentValues) (obj1)).put("cv_index", Integer.valueOf(((CustomVariable) (obj)).getIndex()));
        ((ContentValues) (obj1)).put("cv_name", ((CustomVariable) (obj)).getName());
        ((ContentValues) (obj1)).put("cv_scope", Integer.valueOf(((CustomVariable) (obj)).getScope()));
        ((ContentValues) (obj1)).put("cv_value", ((CustomVariable) (obj)).getValue());
        sqlitedatabase.update("custom_var_cache", ((ContentValues) (obj1)), "cv_index = ?", new String[] {
            Integer.toString(((CustomVariable) (obj)).getIndex())
        });
        if (((CustomVariable) (obj)).getScope() == 1)
        {
            visitorCVCache.setCustomVariable(((CustomVariable) (obj)));
            break MISSING_BLOCK_LABEL_311;
        }
        visitorCVCache.clearCustomVariableAt(((CustomVariable) (obj)).getIndex());
        break MISSING_BLOCK_LABEL_311;
        if (useStoredVisitorVars)
        {
            Object obj = obj1;
            if (obj1 == null)
            {
                try
                {
                    obj = new CustomVariableBuffer();
                    event.setCustomVariableBuffer(((CustomVariableBuffer) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (Event event)
                {
                    Log.e("GoogleAnalyticsTracker", event.toString());
                    return;
                }
            }
        } else
        {
            event = ((Event) (obj1));
            continue; /* Loop/switch isn't completed */
        }
        i = 1;
          goto _L8
_L6:
        i++;
          goto _L8
        if (event == null) goto _L1; else goto _L9
_L9:
        i = 1;
          goto _L10
        i++;
          goto _L10
    }

    public void putEvent(Event event)
    {
        if (numStoredHits < 1000) goto _L2; else goto _L1
_L1:
        Log.w("GoogleAnalyticsTracker", "Store full. Not storing last event.");
_L4:
        return;
_L2:
        if (sampleRate == 100)
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        if (event.getUserId() == -1)
        {
            i = storeId;
        } else
        {
            i = event.getUserId();
        }
        if (i % 10000 < sampleRate * 100)
        {
            break; /* Loop/switch isn't completed */
        }
        if (GoogleAnalyticsTracker.getInstance().getDebug())
        {
            Log.v("GoogleAnalyticsTracker", "User has been sampled out. Aborting hit.");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        if (!sessionStarted)
        {
            storeUpdatedSession(sqlitedatabase);
        }
        putEvent(event, sqlitedatabase, true);
        sqlitedatabase.setTransactionSuccessful();
        if (sqlitedatabase.inTransaction())
        {
            endTransaction(sqlitedatabase);
        }
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
        event;
        this;
        JVM INSTR monitorexit ;
        throw event;
        event;
        Log.e("GoogleAnalyticsTracker", (new StringBuilder()).append("Can't get db: ").append(event.toString()).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        event;
        Log.e("GoogleAnalyticsTracker", (new StringBuilder()).append("putEventOuter:").append(event.toString()).toString());
        if (!sqlitedatabase.inTransaction()) goto _L6; else goto _L5
_L5:
        endTransaction(sqlitedatabase);
          goto _L6
        event;
        if (sqlitedatabase.inTransaction())
        {
            endTransaction(sqlitedatabase);
        }
        throw event;
    }

    Referrer readCurrentReferrer(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.query("referrer", new String[] {
            "referrer", "timestamp_referrer", "referrer_visit", "referrer_index"
        }, null, null, null, null, null);
        if (!sqlitedatabase.moveToFirst()) goto _L2; else goto _L1
_L1:
        Object obj;
        long l = sqlitedatabase.getLong(sqlitedatabase.getColumnIndex("timestamp_referrer"));
        int i = sqlitedatabase.getInt(sqlitedatabase.getColumnIndex("referrer_visit"));
        int j = sqlitedatabase.getInt(sqlitedatabase.getColumnIndex("referrer_index"));
        obj = new Referrer(sqlitedatabase.getString(sqlitedatabase.getColumnIndex("referrer")), l, i, j);
_L7:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return ((Referrer) (obj));
        obj;
        sqlitedatabase = null;
_L5:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return null;
        obj;
        sqlitedatabase = null;
_L4:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L5; else goto _L2
_L2:
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void setAnonymizeIp(boolean flag)
    {
        anonymizeIp = flag;
    }

    public boolean setReferrer(String s)
    {
        s = formatReferrer(s);
        if (s == null)
        {
            return false;
        }
        SQLiteDatabase sqlitedatabase;
        Referrer referrer;
        ContentValues contentvalues;
        long l;
        try
        {
            sqlitedatabase = databaseHelper.getWritableDatabase();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("GoogleAnalyticsTracker", s.toString());
            return false;
        }
        referrer = readCurrentReferrer(sqlitedatabase);
        contentvalues = new ContentValues();
        contentvalues.put("referrer", s);
        contentvalues.put("timestamp_referrer", Long.valueOf(0L));
        contentvalues.put("referrer_visit", Integer.valueOf(0));
        if (referrer != null)
        {
            long l1 = referrer.getIndex();
            l = l1;
            if (referrer.getTimeStamp() > 0L)
            {
                l = l1 + 1L;
            }
        } else
        {
            l = 1L;
        }
        contentvalues.put("referrer_index", Long.valueOf(l));
        if (setReferrerDatabase(sqlitedatabase, contentvalues))
        {
            startNewVisit();
            return true;
        } else
        {
            return false;
        }
    }

    public void setSampleRate(int i)
    {
        sampleRate = i;
    }

    public void startNewVisit()
    {
        this;
        JVM INSTR monitorenter ;
        sessionStarted = false;
        useStoredVisitorVars = true;
        numStoredHits = getNumStoredHitsFromDb();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void storeUpdatedSession(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = databaseHelper.getWritableDatabase();
        sqlitedatabase.delete("session", null, null);
        ContentValues contentvalues;
        if (timestampFirst == 0L)
        {
            long l = System.currentTimeMillis() / 1000L;
            timestampFirst = l;
            timestampPrevious = l;
            timestampCurrent = l;
            visits = 1;
        } else
        {
            timestampPrevious = timestampCurrent;
            timestampCurrent = System.currentTimeMillis() / 1000L;
            if (timestampCurrent == timestampPrevious)
            {
                timestampCurrent = timestampCurrent + 1L;
            }
            visits = visits + 1;
        }
        contentvalues = new ContentValues();
        contentvalues.put("timestamp_first", Long.valueOf(timestampFirst));
        contentvalues.put("timestamp_previous", Long.valueOf(timestampPrevious));
        contentvalues.put("timestamp_current", Long.valueOf(timestampCurrent));
        contentvalues.put("visits", Integer.valueOf(visits));
        contentvalues.put("store_id", Integer.valueOf(storeId));
        sqlitedatabase.insert("session", null, contentvalues);
        sessionStarted = true;
    }

    void writeEventToDatabase(Event event, Referrer referrer, SQLiteDatabase sqlitedatabase, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", HitBuilder.constructHitRequestPath(event, referrer));
        long l;
        if (flag)
        {
            l = System.currentTimeMillis();
        } else
        {
            l = 0L;
        }
        contentvalues.put("hit_time", Long.valueOf(l));
        sqlitedatabase.insert("hits", null, contentvalues);
        numStoredHits = numStoredHits + 1;
    }










/*
    static CustomVariableBuffer access$702(PersistentHitStore persistenthitstore, CustomVariableBuffer customvariablebuffer)
    {
        persistenthitstore.visitorCVCache = customvariablebuffer;
        return customvariablebuffer;
    }

*/



    private class DataBaseHelper extends SQLiteOpenHelper
    {

        private final int databaseVersion;
        private final PersistentHitStore store;

        private void createECommerceTables(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS transaction_events;");
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_TRANSACTION_EVENTS_TABLE);
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS item_events;");
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_ITEM_EVENTS_TABLE);
        }

        private void createHitTable(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS hits;");
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_HITS_TABLE);
        }

        private void createReferrerTable(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS referrer;");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);");
        }

        private void fixReferrerTable(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor = sqlitedatabase.query("referrer", null, null, null, null, null, null);
            String as[] = cursor.getColumnNames();
            int i;
            int j;
            boolean flag;
            i = 0;
            flag = false;
            j = 0;
_L18:
            if (i >= as.length) goto _L2; else goto _L1
_L1:
            if (!as[i].equals("referrer_index")) goto _L4; else goto _L3
_L3:
            int k = 1;
              goto _L5
_L4:
            k = j;
            if (as[i].equals("referrer_visit"))
            {
                flag = true;
                k = j;
            }
              goto _L5
_L19:
            if (!cursor.moveToFirst()) goto _L7; else goto _L6
_L6:
            Object obj;
            long l;
            i = cursor.getColumnIndex("referrer_visit");
            j = cursor.getColumnIndex("referrer_index");
            obj = cursor.getString(cursor.getColumnIndex("referrer"));
            l = cursor.getLong(cursor.getColumnIndex("timestamp_referrer"));
            if (i != -1) goto _L9; else goto _L8
_L8:
            i = 1;
              goto _L10
_L11:
            obj = new Referrer(((String) (obj)), l, i, j);
_L17:
            sqlitedatabase.beginTransaction();
            createReferrerTable(sqlitedatabase);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_252;
            }
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("referrer", ((Referrer) (obj)).getReferrerString());
            contentvalues.put("timestamp_referrer", Long.valueOf(((Referrer) (obj)).getTimeStamp()));
            contentvalues.put("referrer_visit", Integer.valueOf(((Referrer) (obj)).getVisit()));
            contentvalues.put("referrer_index", Integer.valueOf(((Referrer) (obj)).getIndex()));
            sqlitedatabase.insert("referrer", null, contentvalues);
            sqlitedatabase.setTransactionSuccessful();
_L20:
            if (cursor != null)
            {
                cursor.close();
            }
            if (sqlitedatabase.inTransaction())
            {
                PersistentHitStore.endTransaction(sqlitedatabase);
            }
_L13:
            return;
_L9:
            i = cursor.getInt(i);
              goto _L10
_L22:
            j = cursor.getInt(j);
              goto _L11
            obj;
            cursor = null;
_L16:
            Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
            if (cursor != null)
            {
                cursor.close();
            }
            if (!sqlitedatabase.inTransaction()) goto _L13; else goto _L12
_L12:
            PersistentHitStore.endTransaction(sqlitedatabase);
            return;
            obj;
            cursor = null;
_L15:
            if (cursor != null)
            {
                cursor.close();
            }
            if (sqlitedatabase.inTransaction())
            {
                PersistentHitStore.endTransaction(sqlitedatabase);
            }
            throw obj;
            obj;
            continue; /* Loop/switch isn't completed */
            obj;
            if (true) goto _L15; else goto _L14
_L14:
            obj;
              goto _L16
_L7:
            obj = null;
              goto _L17
_L5:
            i++;
            j = k;
              goto _L18
_L2:
            if (j != 0 && flag) goto _L20; else goto _L19
_L10:
            if (j != -1) goto _L22; else goto _L21
_L21:
            j = 1;
              goto _L11
        }

        private void migrateEventsToHits(SQLiteDatabase sqlitedatabase, int i)
        {
            store.loadExistingSession(sqlitedatabase);
            store.visitorCVCache = store.getVisitorVarBuffer(sqlitedatabase);
            Event aevent[] = store.peekEvents(1000, sqlitedatabase, i);
            for (i = 0; i < aevent.length; i++)
            {
                store.putEvent(aevent[i], sqlitedatabase, false);
            }

            sqlitedatabase.execSQL("DELETE from events;");
            sqlitedatabase.execSQL("DELETE from item_events;");
            sqlitedatabase.execSQL("DELETE from transaction_events;");
            sqlitedatabase.execSQL("DELETE from custom_variables;");
        }

        private void migratePreV4Referrer(SQLiteDatabase sqlitedatabase)
        {
            Object obj = null;
            Cursor cursor = sqlitedatabase.query("install_referrer", new String[] {
                "referrer"
            }, null, null, null, null, null);
            obj = cursor;
            String s;
            if (!((Cursor) (obj)).moveToFirst())
            {
                break MISSING_BLOCK_LABEL_272;
            }
            s = ((Cursor) (obj)).getString(0);
            cursor = sqlitedatabase.query("session", null, null, null, null, null, null);
            if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
            long l = cursor.getLong(0);
_L8:
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("referrer", s);
            contentvalues.put("timestamp_referrer", Long.valueOf(l));
            contentvalues.put("referrer_visit", Integer.valueOf(1));
            contentvalues.put("referrer_index", Integer.valueOf(1));
            sqlitedatabase.insert("referrer", null, contentvalues);
_L9:
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            if (cursor != null)
            {
                cursor.close();
            }
_L4:
            return;
            Object obj1;
            obj1;
            cursor = null;
            sqlitedatabase = ((SQLiteDatabase) (obj));
            obj = obj1;
_L7:
            Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            if (cursor == null) goto _L4; else goto _L3
_L3:
            cursor.close();
            return;
            sqlitedatabase;
            cursor = null;
            obj = null;
_L6:
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            if (cursor != null)
            {
                cursor.close();
            }
            throw sqlitedatabase;
            sqlitedatabase;
            cursor = null;
            continue; /* Loop/switch isn't completed */
            sqlitedatabase;
            continue; /* Loop/switch isn't completed */
            obj1;
            obj = sqlitedatabase;
            sqlitedatabase = ((SQLiteDatabase) (obj1));
            if (true) goto _L6; else goto _L5
_L5:
            obj1;
            cursor = null;
            sqlitedatabase = ((SQLiteDatabase) (obj));
            obj = obj1;
              goto _L7
            obj1;
            sqlitedatabase = ((SQLiteDatabase) (obj));
            obj = obj1;
              goto _L7
_L2:
            l = 0L;
              goto _L8
            cursor = null;
              goto _L9
        }

        void createCustomVariableTables(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_variables;");
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_CUSTOM_VARIABLES_TABLE);
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_var_cache;");
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_CUSTOM_VAR_CACHE_TABLE);
            for (int i = 1; i <= 5; i++)
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("event_id", Integer.valueOf(0));
                contentvalues.put("cv_index", Integer.valueOf(i));
                contentvalues.put("cv_name", "");
                contentvalues.put("cv_scope", Integer.valueOf(3));
                contentvalues.put("cv_value", "");
                sqlitedatabase.insert("custom_var_cache", "event_id", contentvalues);
            }

        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS events;");
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_EVENTS_TABLE);
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS install_referrer;");
            sqlitedatabase.execSQL("CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS session;");
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_SESSION_TABLE);
            if (databaseVersion > 1)
            {
                createCustomVariableTables(sqlitedatabase);
            }
            if (databaseVersion > 2)
            {
                createECommerceTables(sqlitedatabase);
            }
            if (databaseVersion > 3)
            {
                createHitTable(sqlitedatabase);
                createReferrerTable(sqlitedatabase);
            }
        }

        public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            HashSet hashset;
            Object obj;
            Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("Downgrading database version from ").append(i).append(" to ").append(j).append(" not recommended.").toString());
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS referrer (referrer TEXT PRIMARY KEY NOT NULL,timestamp_referrer INTEGER NOT NULL,referrer_visit INTEGER NOT NULL DEFAULT 1,referrer_index INTEGER NOT NULL DEFAULT 1);");
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_HITS_TABLE);
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_CUSTOM_VAR_CACHE_TABLE);
            sqlitedatabase.execSQL(PersistentHitStore.CREATE_SESSION_TABLE);
            hashset = new HashSet();
            obj = sqlitedatabase.query("custom_var_cache", null, null, null, null, null, null, null);
            while (((Cursor) (obj)).moveToNext()) 
            {
                hashset.add(Integer.valueOf(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_index"))));
            }
            break MISSING_BLOCK_LABEL_271;
            SQLiteException sqliteexception1;
            sqliteexception1;
            Log.e("GoogleAnalyticsTracker", (new StringBuilder()).append("Error on downgrade: ").append(sqliteexception1.toString()).toString());
            ((Cursor) (obj)).close();
_L1:
            i = 1;
            while (i <= 5) 
            {
                try
                {
                    if (!hashset.contains(Integer.valueOf(i)))
                    {
                        obj = new ContentValues();
                        ((ContentValues) (obj)).put("event_id", Integer.valueOf(0));
                        ((ContentValues) (obj)).put("cv_index", Integer.valueOf(i));
                        ((ContentValues) (obj)).put("cv_name", "");
                        ((ContentValues) (obj)).put("cv_scope", Integer.valueOf(3));
                        ((ContentValues) (obj)).put("cv_value", "");
                        sqlitedatabase.insert("custom_var_cache", "event_id", ((ContentValues) (obj)));
                    }
                }
                catch (SQLiteException sqliteexception)
                {
                    Log.e("GoogleAnalyticsTracker", (new StringBuilder()).append("Error inserting custom variable on downgrade: ").append(sqliteexception.toString()).toString());
                }
                i++;
            }
            break MISSING_BLOCK_LABEL_326;
            ((Cursor) (obj)).close();
              goto _L1
            sqlitedatabase;
            ((Cursor) (obj)).close();
            throw sqlitedatabase;
        }

        public void onOpen(SQLiteDatabase sqlitedatabase)
        {
            if (sqlitedatabase.isReadOnly())
            {
                Log.w("GoogleAnalyticsTracker", "Warning: Need to update database, but it's read only.");
                return;
            } else
            {
                fixReferrerTable(sqlitedatabase);
                return;
            }
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            if (i > j)
            {
                onDowngrade(sqlitedatabase, i, j);
            } else
            {
                if (i < 2 && j > 1)
                {
                    createCustomVariableTables(sqlitedatabase);
                }
                if (i < 3 && j > 2)
                {
                    createECommerceTables(sqlitedatabase);
                }
                if (i < 4 && j > 3)
                {
                    createHitTable(sqlitedatabase);
                    createReferrerTable(sqlitedatabase);
                    migrateEventsToHits(sqlitedatabase, i);
                    migratePreV4Referrer(sqlitedatabase);
                    return;
                }
            }
        }

        public DataBaseHelper(Context context, PersistentHitStore persistenthitstore)
        {
            this(context, "google_analytics.db", 5, persistenthitstore);
        }

        DataBaseHelper(Context context, String s, int i, PersistentHitStore persistenthitstore)
        {
            super(context, s, null, i);
            databaseVersion = i;
            store = persistenthitstore;
        }

        public DataBaseHelper(Context context, String s, PersistentHitStore persistenthitstore)
        {
            this(context, s, 5, persistenthitstore);
        }
    }

}
