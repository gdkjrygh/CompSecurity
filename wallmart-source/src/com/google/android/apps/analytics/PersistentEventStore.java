// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.analytics:
//            EventStore, CustomVariableBuffer, CustomVariable, Event, 
//            Item, Transaction

class PersistentEventStore
    implements EventStore
{
    static class DataBaseHelper extends SQLiteOpenHelper
    {

        private final int databaseVersion;

        private void createECommerceTables(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS transaction_events;");
            sqlitedatabase.execSQL(PersistentEventStore.CREATE_TRANSACTION_EVENTS_TABLE);
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS item_events;");
            sqlitedatabase.execSQL(PersistentEventStore.CREATE_ITEM_EVENTS_TABLE);
        }

        void createCustomVariableTables(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_variables;");
            sqlitedatabase.execSQL(PersistentEventStore.CREATE_CUSTOM_VARIABLES_TABLE);
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS custom_var_cache;");
            sqlitedatabase.execSQL(PersistentEventStore.CREATE_CUSTOM_VAR_CACHE_TABLE);
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
            sqlitedatabase.execSQL(PersistentEventStore.CREATE_EVENTS_TABLE);
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS session;");
            sqlitedatabase.execSQL(PersistentEventStore.CREATE_SESSION_TABLE);
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS install_referrer;");
            sqlitedatabase.execSQL("CREATE TABLE install_referrer (referrer TEXT PRIMARY KEY NOT NULL);");
            if (databaseVersion > 1)
            {
                createCustomVariableTables(sqlitedatabase);
            }
            if (databaseVersion > 2)
            {
                createECommerceTables(sqlitedatabase);
            }
        }

        public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("Downgrading database version from ").append(i).append(" to ").append(j).append(" not recommended.").toString());
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            if (i < 2 && j > 1)
            {
                createCustomVariableTables(sqlitedatabase);
            }
            if (i < 3 && j > 2)
            {
                createECommerceTables(sqlitedatabase);
            }
        }

        public DataBaseHelper(Context context)
        {
            this(context, "google_analytics.db", 3);
        }

        public DataBaseHelper(Context context, String s)
        {
            this(context, s, 3);
        }

        DataBaseHelper(Context context, String s, int i)
        {
            super(context, s, null, i);
            databaseVersion = i;
        }
    }


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
    private static final String CREATE_CUSTOM_VAR_CACHE_TABLE = (new StringBuilder()).append("CREATE TABLE custom_var_cache (").append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
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
    private static final String CREATE_SESSION_TABLE = (new StringBuilder()).append("CREATE TABLE session (").append(String.format(" '%s' INTEGER PRIMARY KEY,", new Object[] {
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
    private static final int DATABASE_VERSION = 3;
    private static final String EVENT_ID = "event_id";
    private static final String ITEM_CATEGORY = "item_category";
    private static final String ITEM_COUNT = "item_count";
    private static final String ITEM_ID = "item_id";
    private static final String ITEM_NAME = "item_name";
    private static final String ITEM_PRICE = "item_price";
    private static final String ITEM_SKU = "item_sku";
    private static final String LABEL = "label";
    private static final int MAX_EVENTS = 1000;
    private static final String ORDER_ID = "order_id";
    private static final String RANDOM_VAL = "random_val";
    private static final String REFERRER = "referrer";
    private static final String SCREEN_HEIGHT = "screen_height";
    private static final String SCREEN_WIDTH = "screen_width";
    private static final String SHIPPING_COST = "tran_shippingcost";
    private static final String STORE_ID = "store_id";
    private static final String STORE_NAME = "tran_storename";
    private static final String TIMESTAMP_CURRENT = "timestamp_current";
    private static final String TIMESTAMP_FIRST = "timestamp_first";
    private static final String TIMESTAMP_PREVIOUS = "timestamp_previous";
    private static final String TOTAL_COST = "tran_totalcost";
    private static final String TOTAL_TAX = "tran_totaltax";
    private static final String TRANSACTION_ID = "tran_id";
    private static final String USER_ID = "user_id";
    private static final String VALUE = "value";
    private static final String VISITS = "visits";
    private SQLiteStatement compiledCountStatement;
    private DataBaseHelper databaseHelper;
    private int numStoredEvents;
    private boolean sessionUpdated;
    private int storeId;
    private long timestampCurrent;
    private long timestampFirst;
    private long timestampPrevious;
    private boolean useStoredVisitorVars;
    private int visits;

    PersistentEventStore(DataBaseHelper databasehelper)
    {
        compiledCountStatement = null;
        databaseHelper = databasehelper;
        try
        {
            databasehelper.getWritableDatabase().close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DataBaseHelper databasehelper)
        {
            Log.e("GoogleAnalyticsTracker", databasehelper.toString());
        }
    }

    public void deleteEvent(long l)
    {
        String s = (new StringBuilder()).append("event_id=").append(l).toString();
        try
        {
            SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
            if (sqlitedatabase.delete("events", s, null) != 0)
            {
                numStoredEvents = numStoredEvents - 1;
                sqlitedatabase.delete("custom_variables", s, null);
                sqlitedatabase.delete("transaction_events", s, null);
                sqlitedatabase.delete("item_events", s, null);
            }
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        }
    }

    CustomVariableBuffer getCustomVariables(long l)
    {
        CustomVariableBuffer customvariablebuffer = new CustomVariableBuffer();
        Object obj1 = databaseHelper.getReadableDatabase().query("custom_variables", null, (new StringBuilder()).append("event_id=").append(l).toString(), null, null, null, null);
_L4:
        Object obj = obj1;
        if (!((Cursor) (obj1)).moveToNext()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        customvariablebuffer.setCustomVariable(new CustomVariable(((Cursor) (obj1)).getInt(((Cursor) (obj1)).getColumnIndex("cv_index")), ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("cv_name")), ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("cv_value")), ((Cursor) (obj1)).getInt(((Cursor) (obj1)).getColumnIndex("cv_scope"))));
        if (true) goto _L4; else goto _L3
_L3:
        SQLiteException sqliteexception;
        sqliteexception;
_L10:
        obj = obj1;
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
_L6:
        return customvariablebuffer;
_L2:
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj1)).close();
        return customvariablebuffer;
        obj1;
        obj = null;
_L8:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
        obj1;
        if (true) goto _L8; else goto _L7
_L7:
        sqliteexception;
        obj1 = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    Item getItem(long l)
    {
        Cursor cursor = databaseHelper.getReadableDatabase().query("item_events", null, (new StringBuilder()).append("event_id=").append(l).toString(), null, null, null, null);
        Item item;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_162;
        }
        item = (new Item.Builder(cursor.getString(cursor.getColumnIndex("order_id")), cursor.getString(cursor.getColumnIndex("item_sku")), cursor.getDouble(cursor.getColumnIndex("item_price")), cursor.getLong(cursor.getColumnIndex("item_count")))).setItemName(cursor.getString(cursor.getColumnIndex("item_name"))).setItemCategory(cursor.getString(cursor.getColumnIndex("item_category"))).build();
        if (cursor != null)
        {
            cursor.close();
        }
        return item;
        if (cursor != null)
        {
            cursor.close();
        }
_L1:
        return null;
        Object obj;
        obj;
        cursor = null;
_L4:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
        if (cursor != null)
        {
            cursor.close();
        }
          goto _L1
        obj;
        cursor = null;
_L3:
        if (cursor != null)
        {
            cursor.close();
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

    public int getNumStoredEvents()
    {
        long l;
        try
        {
            if (compiledCountStatement == null)
            {
                compiledCountStatement = databaseHelper.getReadableDatabase().compileStatement("SELECT COUNT(*) from events");
            }
            l = compiledCountStatement.simpleQueryForLong();
        }
        catch (SQLiteException sqliteexception)
        {
            Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
            return 0;
        }
        return (int)l;
    }

    public String getReferrer()
    {
        Object obj = null;
        Cursor cursor = databaseHelper.getReadableDatabase().query("install_referrer", new String[] {
            "referrer"
        }, null, null, null, null, null);
        obj = cursor;
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = cursor;
        String s = cursor.getString(0);
        obj = s;
_L7:
        if (cursor != null)
        {
            cursor.close();
        }
        return ((String) (obj));
        SQLiteException sqliteexception;
        sqliteexception;
        cursor = null;
_L5:
        obj = cursor;
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        Exception exception;
        exception;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        sqliteexception;
        if (true) goto _L5; else goto _L2
_L2:
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int getStoreId()
    {
        return storeId;
    }

    Transaction getTransaction(long l)
    {
        Cursor cursor1 = databaseHelper.getReadableDatabase().query("transaction_events", null, (new StringBuilder()).append("event_id=").append(l).toString(), null, null, null, null);
        Cursor cursor = cursor1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_171;
        }
        cursor = cursor1;
        Transaction transaction = (new Transaction.Builder(cursor1.getString(cursor1.getColumnIndex("order_id")), cursor1.getDouble(cursor1.getColumnIndex("tran_totalcost")))).setStoreName(cursor1.getString(cursor1.getColumnIndex("tran_storename"))).setTotalTax(cursor1.getDouble(cursor1.getColumnIndex("tran_totaltax"))).setShippingCost(cursor1.getDouble(cursor1.getColumnIndex("tran_shippingcost"))).build();
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return transaction;
        if (cursor1 != null)
        {
            cursor1.close();
        }
_L1:
        return null;
        SQLiteException sqliteexception;
        sqliteexception;
        cursor1 = null;
_L4:
        cursor = cursor1;
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (cursor1 != null)
        {
            cursor1.close();
        }
          goto _L1
        Exception exception;
        exception;
        cursor = null;
_L3:
        if (cursor != null)
        {
            cursor.close();
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
        Object obj1 = null;
        Object obj;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = databaseHelper.getReadableDatabase();
        obj = sqlitedatabase.query("custom_var_cache", null, (new StringBuilder()).append("cv_scope = 1 AND cv_index = ").append(i).toString(), null, null, null, null);
        if (((Cursor) (obj)).getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        ((Cursor) (obj)).moveToFirst();
        obj1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_value"));
_L1:
        sqlitedatabase.close();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return ((String) (obj1));
        obj1 = null;
          goto _L1
        obj1;
        obj = null;
_L5:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj1)).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return null;
        obj;
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    CustomVariableBuffer getVisitorVarBuffer()
    {
        CustomVariableBuffer customvariablebuffer;
        Object obj;
        customvariablebuffer = new CustomVariableBuffer();
        try
        {
            for (obj = databaseHelper.getReadableDatabase().query("custom_var_cache", null, "cv_scope=1", null, null, null, null); ((Cursor) (obj)).moveToNext(); customvariablebuffer.setCustomVariable(new CustomVariable(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_index")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_name")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_value")), ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_scope"))))) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
            return customvariablebuffer;
        }
        ((Cursor) (obj)).close();
        return customvariablebuffer;
    }

    public Event[] peekEvents()
    {
        return peekEvents(1000);
    }

    public Event[] peekEvents(int i)
    {
        Object obj1 = new ArrayList();
        Object obj = databaseHelper.getReadableDatabase().query("events", null, null, null, null, null, "event_id", Integer.toString(i));
_L5:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj2;
        long l;
        obj2 = new Event(((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getInt(1), ((Cursor) (obj)).getString(2), ((Cursor) (obj)).getInt(3), ((Cursor) (obj)).getInt(4), ((Cursor) (obj)).getInt(5), ((Cursor) (obj)).getInt(6), ((Cursor) (obj)).getInt(7), ((Cursor) (obj)).getString(8), ((Cursor) (obj)).getString(9), ((Cursor) (obj)).getString(10), ((Cursor) (obj)).getInt(11), ((Cursor) (obj)).getInt(12), ((Cursor) (obj)).getInt(13));
        l = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("event_id"));
        if (!"__##GOOGLETRANSACTION##__".equals(((Event) (obj2)).category)) goto _L4; else goto _L3
_L3:
        Object obj3 = getTransaction(l);
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("missing expected transaction for event ").append(l).toString());
        ((Event) (obj2)).setTransaction(((Transaction) (obj3)));
_L8:
        ((List) (obj1)).add(obj2);
          goto _L5
        obj1;
_L10:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj1)).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return new Event[0];
_L4:
        if (!"__##GOOGLEITEM##__".equals(((Event) (obj2)).category)) goto _L7; else goto _L6
_L6:
        obj3 = getItem(l);
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("missing expected item for event ").append(l).toString());
        ((Event) (obj2)).setItem(((Item) (obj3)));
          goto _L8
        obj2;
        obj1 = obj;
        obj = obj2;
_L9:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
_L7:
        ((Event) (obj2)).setCustomVariableBuffer(getCustomVariables(l));
          goto _L8
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return (Event[])((List) (obj1)).toArray(new Event[((List) (obj1)).size()]);
        obj;
        obj1 = null;
          goto _L9
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
          goto _L9
        obj1;
        obj = null;
          goto _L10
    }

    void putCustomVariables(Event event, long l)
    {
        boolean flag = true;
        Object obj;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = databaseHelper.getWritableDatabase();
        obj = event.getCustomVariableBuffer();
        CustomVariableBuffer customvariablebuffer = ((CustomVariableBuffer) (obj));
        if (!useStoredVisitorVars) goto _L2; else goto _L1
_L1:
        customvariablebuffer = ((CustomVariableBuffer) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        customvariablebuffer = new CustomVariableBuffer();
        event.setCustomVariableBuffer(customvariablebuffer);
        event = getVisitorVarBuffer();
        int i = 1;
_L8:
        if (i > 5) goto _L4; else goto _L3
_L3:
        CustomVariable customvariable;
        obj = event.getCustomVariableAt(i);
        customvariable = customvariablebuffer.getCustomVariableAt(i);
        if (obj == null || customvariable != null) goto _L6; else goto _L5
_L5:
        customvariablebuffer.setCustomVariable(((CustomVariable) (obj)));
          goto _L6
_L4:
        useStoredVisitorVars = false;
          goto _L2
_L7:
        if (i > 5)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        if (!customvariablebuffer.isIndexAvailable(i))
        {
            event = customvariablebuffer.getCustomVariableAt(i);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("event_id", Long.valueOf(l));
            contentvalues.put("cv_index", Integer.valueOf(event.getIndex()));
            contentvalues.put("cv_name", event.getName());
            contentvalues.put("cv_scope", Integer.valueOf(event.getScope()));
            contentvalues.put("cv_value", event.getValue());
            sqlitedatabase.insert("custom_variables", "event_id", contentvalues);
            sqlitedatabase.update("custom_var_cache", contentvalues, (new StringBuilder()).append("cv_index=").append(event.getIndex()).toString(), null);
        }
        i++;
          goto _L7
        event;
        Log.e("GoogleAnalyticsTracker", event.toString());
_L10:
        return;
_L6:
        i++;
          goto _L8
_L2:
        if (customvariablebuffer == null) goto _L10; else goto _L9
_L9:
        i = ((flag) ? 1 : 0);
          goto _L7
    }

    public void putEvent(Event event)
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = null;
        if (numStoredEvents < 1000) goto _L2; else goto _L1
_L1:
        Log.w("GoogleAnalyticsTracker", "Store full. Not storing last event.");
_L8:
        return;
_L2:
        if (!sessionUpdated)
        {
            storeUpdatedSession();
        }
        Object obj1 = databaseHelper.getWritableDatabase();
        ((SQLiteDatabase) (obj1)).beginTransaction();
        obj = new ContentValues();
        ((ContentValues) (obj)).put("user_id", Integer.valueOf(event.userId));
        ((ContentValues) (obj)).put("account_id", event.accountId);
        ((ContentValues) (obj)).put("random_val", Integer.valueOf((int)(Math.random() * 2147483647D)));
        ((ContentValues) (obj)).put("timestamp_first", Long.valueOf(timestampFirst));
        ((ContentValues) (obj)).put("timestamp_previous", Long.valueOf(timestampPrevious));
        ((ContentValues) (obj)).put("timestamp_current", Long.valueOf(timestampCurrent));
        ((ContentValues) (obj)).put("visits", Integer.valueOf(visits));
        ((ContentValues) (obj)).put("category", event.category);
        ((ContentValues) (obj)).put("action", event.action);
        ((ContentValues) (obj)).put("label", event.label);
        ((ContentValues) (obj)).put("value", Integer.valueOf(event.value));
        ((ContentValues) (obj)).put("screen_width", Integer.valueOf(event.screenWidth));
        ((ContentValues) (obj)).put("screen_height", Integer.valueOf(event.screenHeight));
        if (((SQLiteDatabase) (obj1)).insert("events", "event_id", ((ContentValues) (obj))) == -1L) goto _L4; else goto _L3
_L3:
        long l;
        numStoredEvents = numStoredEvents + 1;
        obj = ((SQLiteDatabase) (obj1)).query("events", new String[] {
            "event_id"
        }, null, null, null, null, "event_id DESC", null);
        ((Cursor) (obj)).moveToPosition(0);
        l = ((Cursor) (obj)).getLong(0);
        ((Cursor) (obj)).close();
        if (!event.category.equals("__##GOOGLETRANSACTION##__")) goto _L6; else goto _L5
_L5:
        putTransaction(event, l);
_L11:
        ((SQLiteDatabase) (obj1)).setTransactionSuccessful();
_L13:
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        ((SQLiteDatabase) (obj1)).endTransaction();
        return;
_L6:
        if (!event.category.equals("__##GOOGLEITEM##__")) goto _L10; else goto _L9
_L9:
        putItem(event, l);
          goto _L11
        obj;
        event = ((Event) (obj1));
        obj1 = obj;
_L15:
        obj = event;
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj1)).toString());
        if (event == null) goto _L8; else goto _L12
_L12:
        event.endTransaction();
        return;
_L10:
        putCustomVariables(event, l);
          goto _L11
        event;
        obj = obj1;
_L14:
        if (obj != null)
        {
            ((SQLiteDatabase) (obj)).endTransaction();
        }
        throw event;
_L4:
        Log.e("GoogleAnalyticsTracker", "Error when attempting to add event to database.");
          goto _L13
        event;
          goto _L14
        obj1;
        event = obj2;
          goto _L15
    }

    void putItem(Event event, long l)
    {
        event = event.getItem();
        if (event == null)
        {
            Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("missing item details for event ").append(l).toString());
            return;
        }
        try
        {
            SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("event_id", Long.valueOf(l));
            contentvalues.put("order_id", event.getOrderId());
            contentvalues.put("item_sku", event.getItemSKU());
            contentvalues.put("item_name", event.getItemName());
            contentvalues.put("item_category", event.getItemCategory());
            contentvalues.put("item_price", (new StringBuilder()).append(event.getItemPrice()).append("").toString());
            contentvalues.put("item_count", (new StringBuilder()).append(event.getItemCount()).append("").toString());
            sqlitedatabase.insert("item_events", "event_id", contentvalues);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Event event)
        {
            Log.e("GoogleAnalyticsTracker", event.toString());
        }
    }

    void putTransaction(Event event, long l)
    {
        event = event.getTransaction();
        if (event == null)
        {
            Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("missing transaction details for event ").append(l).toString());
            return;
        }
        try
        {
            SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("event_id", Long.valueOf(l));
            contentvalues.put("order_id", event.getOrderId());
            contentvalues.put("tran_storename", event.getStoreName());
            contentvalues.put("tran_totalcost", (new StringBuilder()).append(event.getTotalCost()).append("").toString());
            contentvalues.put("tran_totaltax", (new StringBuilder()).append(event.getTotalTax()).append("").toString());
            contentvalues.put("tran_shippingcost", (new StringBuilder()).append(event.getShippingCost()).append("").toString());
            sqlitedatabase.insert("transaction_events", "event_id", contentvalues);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Event event)
        {
            Log.e("GoogleAnalyticsTracker", event.toString());
        }
    }

    public void setReferrer(String s)
    {
        try
        {
            SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("referrer", s);
            sqlitedatabase.insert("install_referrer", null, contentvalues);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("GoogleAnalyticsTracker", s.toString());
        }
    }

    public void startNewVisit()
    {
        sessionUpdated = false;
        useStoredVisitorVars = true;
        numStoredEvents = getNumStoredEvents();
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = databaseHelper.getWritableDatabase();
        obj1 = sqlitedatabase.query("session", null, null, null, null, null, null);
        Object obj = obj1;
        if (((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        long l = System.currentTimeMillis() / 1000L;
        obj = obj1;
        timestampFirst = l;
        obj = obj1;
        timestampPrevious = l;
        obj = obj1;
        timestampCurrent = l;
        obj = obj1;
        visits = 1;
        obj = obj1;
        storeId = (new SecureRandom()).nextInt() & 0x7fffffff;
        obj = obj1;
        ContentValues contentvalues = new ContentValues();
        obj = obj1;
        contentvalues.put("timestamp_first", Long.valueOf(timestampFirst));
        obj = obj1;
        contentvalues.put("timestamp_previous", Long.valueOf(timestampPrevious));
        obj = obj1;
        contentvalues.put("timestamp_current", Long.valueOf(timestampCurrent));
        obj = obj1;
        contentvalues.put("visits", Integer.valueOf(visits));
        obj = obj1;
        contentvalues.put("store_id", Integer.valueOf(storeId));
        obj = obj1;
        sqlitedatabase.insert("session", "timestamp_first", contentvalues);
_L3:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
_L5:
        return;
_L2:
        obj = obj1;
        timestampFirst = ((Cursor) (obj1)).getLong(0);
        obj = obj1;
        timestampPrevious = ((Cursor) (obj1)).getLong(2);
        obj = obj1;
        timestampCurrent = System.currentTimeMillis() / 1000L;
        obj = obj1;
        visits = ((Cursor) (obj1)).getInt(3) + 1;
        obj = obj1;
        storeId = ((Cursor) (obj1)).getInt(4);
          goto _L3
        SQLiteException sqliteexception;
        sqliteexception;
_L8:
        obj = obj1;
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        ((Cursor) (obj1)).close();
        return;
        obj1;
        obj = null;
_L7:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw obj1;
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
        sqliteexception;
        obj1 = null;
          goto _L8
    }

    void storeUpdatedSession()
    {
        try
        {
            SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("timestamp_previous", Long.valueOf(timestampPrevious));
            contentvalues.put("timestamp_current", Long.valueOf(timestampCurrent));
            contentvalues.put("visits", Integer.valueOf(visits));
            sqlitedatabase.update("session", contentvalues, "timestamp_first=?", new String[] {
                Long.toString(timestampFirst)
            });
            sessionUpdated = true;
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        }
    }







}
