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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.google.android.apps.analytics:
//            p, y, ac, ad, 
//            e, d, i, ab, 
//            o, q, r, n, 
//            j

final class x
    implements p
{

    private static final String n = (new StringBuilder("CREATE TABLE events (")).append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
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
    private static final String o = (new StringBuilder("CREATE TABLE IF NOT EXISTS session (")).append(String.format(" '%s' INTEGER PRIMARY KEY,", new Object[] {
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
    private static final String p = (new StringBuilder("CREATE TABLE custom_variables (")).append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
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
    private static final String q = (new StringBuilder("CREATE TABLE IF NOT EXISTS custom_var_cache (")).append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
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
    private static final String r = (new StringBuilder("CREATE TABLE IF NOT EXISTS custom_var_visitor_cache (")).append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
        "cv_id"
    })).append(String.format(" '%s' INTEGER NOT NULL,", new Object[] {
        "cv_index"
    })).append(String.format(" '%s' %s,", new Object[] {
        "cv_name", "CHAR(64) NOT NULL"
    })).append(String.format(" '%s' %s);", new Object[] {
        "cv_value", "CHAR(64) NOT NULL"
    })).toString();
    private static final String s = (new StringBuilder("CREATE TABLE transaction_events (")).append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
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
    private static final String t = (new StringBuilder("CREATE TABLE item_events (")).append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
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
    private static final String u = (new StringBuilder("CREATE TABLE IF NOT EXISTS hits (")).append(String.format(" '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,", new Object[] {
        "hit_id"
    })).append(String.format(" '%s' TEXT NOT NULL,", new Object[] {
        "hit_string"
    })).append(String.format(" '%s' INTEGER NOT NULL);", new Object[] {
        "hit_time"
    })).toString();
    private y a;
    private int b;
    private long c;
    private long d;
    private long e;
    private int f;
    private volatile int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private Random l;
    private e m;

    x(Context context)
    {
        this(context, "google_analytics.db", 6);
    }

    private x(Context context, String s1, int i1)
    {
        k = 100;
        l = new Random();
        a = new y(context, s1, 6, this);
        try
        {
            b(a.getWritableDatabase());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("GoogleAnalyticsTracker", context.toString());
        }
        m = l();
    }

    private static ac a(long l1, SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("transaction_events", null, "event_id= ?", new String[] {
            Long.toString(l1)
        }, null, null, null);
        sqlitedatabase = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_146;
        }
        sqlitedatabase = cursor;
        ac ac1 = new ac((new ad(cursor.getString(cursor.getColumnIndex("order_id")), cursor.getDouble(cursor.getColumnIndex("tran_totalcost")))).a(cursor.getString(cursor.getColumnIndex("tran_storename"))).a(cursor.getDouble(cursor.getColumnIndex("tran_totaltax"))).b(cursor.getDouble(cursor.getColumnIndex("tran_shippingcost"))), (byte)0);
        if (cursor != null)
        {
            cursor.close();
        }
        return ac1;
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

    static e a(SQLiteDatabase sqlitedatabase)
    {
        e e1 = new e();
        Object obj = sqlitedatabase.query("custom_var_visitor_cache", null, null, null, null, null, null);
_L4:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        if (((Cursor) (obj)).getColumnIndex("cv_index") <= 0) goto _L4; else goto _L3
_L3:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        if (((Cursor) (obj)).getColumnIndex("cv_index") > 50) goto _L4; else goto _L5
_L5:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        e1.a(new d(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_index")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_name")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_value")), 1));
          goto _L4
        SQLiteException sqliteexception;
        sqliteexception;
_L11:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
_L7:
        return e1;
_L2:
        if (obj == null) goto _L7; else goto _L6
_L6:
        ((Cursor) (obj)).close();
        return e1;
        obj;
        sqlitedatabase = null;
_L9:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        throw obj;
        obj;
        if (true) goto _L9; else goto _L8
_L8:
        sqliteexception;
        obj = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static e a(x x1, e e1)
    {
        x1.m = e1;
        return e1;
    }

    private void a(i i1, SQLiteDatabase sqlitedatabase, boolean flag)
    {
label0:
        {
            if (!i1.l())
            {
                i1.a(l.nextInt(0x7fffffff));
                i1.c((int)c);
                i1.d((int)d);
                i1.e((int)e);
                i1.f(f);
            }
            i1.a(j);
            if (i1.g() == -1)
            {
                i1.g(b);
            }
            Object obj;
            Object obj1;
            if (!"__##GOOGLEITEM##__".equals(i1.d) && !"__##GOOGLETRANSACTION##__".equals(i1.d))
            {
                obj1 = i1.j;
                int l1;
                int i2;
                if (i)
                {
                    obj = obj1;
                    if (obj1 == null)
                    {
                        obj = new e();
                        i1.j = ((e) (obj));
                    }
                    for (int j1 = 1; j1 <= 50; j1++)
                    {
                        obj1 = m.b(j1);
                        d d1 = ((e) (obj)).b(j1);
                        if (obj1 != null && d1 == null)
                        {
                            ((e) (obj)).a(((d) (obj1)));
                        }
                    }

                    i = false;
                } else
                {
                    obj = obj1;
                }
                if (obj != null)
                {
                    int k1 = 1;
                    while (k1 <= 50) 
                    {
                        if (!((e) (obj)).a(k1))
                        {
                            obj1 = ((e) (obj)).b(k1);
                            sqlitedatabase.delete("custom_var_visitor_cache", "cv_index = ?", new String[] {
                                Integer.toString(((d) (obj1)).d())
                            });
                            if (((d) (obj1)).a() == 1)
                            {
                                ContentValues contentvalues = new ContentValues();
                                contentvalues.put("cv_index", Integer.valueOf(((d) (obj1)).d()));
                                contentvalues.put("cv_name", ((d) (obj1)).b());
                                contentvalues.put("cv_value", ((d) (obj1)).c());
                                sqlitedatabase.insert("custom_var_visitor_cache", null, contentvalues);
                                m.a(((d) (obj1)));
                            } else
                            {
                                m.c(((d) (obj1)).d());
                            }
                        }
                        k1++;
                    }
                }
            }
            obj = e(sqlitedatabase);
            if (obj == null)
            {
                break label0;
            }
            if (((ab) (obj)).b() == 0L)
            {
                l1 = ((ab) (obj)).d();
                obj = ((ab) (obj)).a();
                obj1 = new ContentValues();
                ((ContentValues) (obj1)).put("referrer", ((String) (obj)));
                ((ContentValues) (obj1)).put("timestamp_referrer", Long.valueOf(e));
                ((ContentValues) (obj1)).put("referrer_visit", Integer.valueOf(f));
                ((ContentValues) (obj1)).put("referrer_index", Integer.valueOf(l1));
                if (!a(sqlitedatabase, ((ContentValues) (obj1))))
                {
                    break label0;
                }
                obj = new ab(((String) (obj)), e, f, l1);
            }
        }
        obj1 = i1.b.split(",");
        if (obj1.length == 1)
        {
            a(i1, ((ab) (obj)), sqlitedatabase, flag);
        } else
        {
            i2 = obj1.length;
            l1 = 0;
            while (l1 < i2) 
            {
                a(new i(i1, obj1[l1]), ((ab) (obj)), sqlitedatabase, flag);
                l1++;
            }
        }
        return;
        obj = null;
        break MISSING_BLOCK_LABEL_127;
    }

    private void a(i i1, ab ab1, SQLiteDatabase sqlitedatabase, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("hit_string", com.google.android.apps.analytics.o.a(i1, ab1));
        long l1;
        if (flag)
        {
            l1 = System.currentTimeMillis();
        } else
        {
            l1 = 0L;
        }
        contentvalues.put("hit_time", Long.valueOf(l1));
        sqlitedatabase.insert("hits", null, contentvalues);
        g = g + 1;
    }

    static void a(x x1, i i1, SQLiteDatabase sqlitedatabase, boolean flag)
    {
        x1.a(i1, sqlitedatabase, false);
    }

    private static boolean a(SQLiteDatabase sqlitedatabase, ContentValues contentvalues)
    {
        sqlitedatabase.beginTransaction();
        sqlitedatabase.delete("referrer", null, null);
        sqlitedatabase.insert("referrer", null, contentvalues);
        sqlitedatabase.setTransactionSuccessful();
        if (!sqlitedatabase.inTransaction() || d(sqlitedatabase)) goto _L2; else goto _L1
_L1:
        return false;
        contentvalues;
        Log.e("GoogleAnalyticsTracker", contentvalues.toString());
        if (sqlitedatabase.inTransaction() && !d(sqlitedatabase))
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
        contentvalues;
        if (!sqlitedatabase.inTransaction() || d(sqlitedatabase))
        {
            throw contentvalues;
        }
        if (true) goto _L1; else goto _L2
_L2:
        return true;
    }

    private static q b(long l1, SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.query("item_events", null, "event_id= ?", new String[] {
            Long.toString(l1)
        }, null, null, null);
        q q1;
        if (!sqlitedatabase.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_152;
        }
        q1 = new q((new r(sqlitedatabase.getString(sqlitedatabase.getColumnIndex("order_id")), sqlitedatabase.getString(sqlitedatabase.getColumnIndex("item_sku")), sqlitedatabase.getDouble(sqlitedatabase.getColumnIndex("item_price")), sqlitedatabase.getLong(sqlitedatabase.getColumnIndex("item_count")))).a(sqlitedatabase.getString(sqlitedatabase.getColumnIndex("item_name"))).b(sqlitedatabase.getString(sqlitedatabase.getColumnIndex("item_category"))), (byte)0);
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return q1;
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

    private static String b(String s1)
    {
label0:
        {
label1:
            {
                if (s1 == null)
                {
                    return null;
                }
                String s2 = s1;
                if (!s1.contains("="))
                {
                    if (!s1.contains("%3D"))
                    {
                        break label1;
                    }
                    String as[];
                    int i1;
                    int j1;
                    try
                    {
                        s2 = URLDecoder.decode(s1, "UTF-8");
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s1)
                    {
                        return null;
                    }
                }
                s1 = new HashMap();
                as = s2.split("&");
                j1 = as.length;
                i1 = 0;
                do
                {
                    if (i1 >= j1)
                    {
                        break;
                    }
                    String as2[] = as[i1].split("=");
                    if (as2.length > 1)
                    {
                        s1.put(as2[0], as2[1]);
                    } else
                    if (as2.length == 1)
                    {
                        s1.put(as2[0], null);
                    }
                    i1++;
                } while (true);
                break label0;
            }
            return null;
        }
        boolean flag;
        int k1;
        boolean flag1;
        boolean flag3;
        if (s1.get("utm_campaign") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s1.get("utm_medium") != null)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (s1.get("utm_source") != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (s1.get("gclid") != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag3 && (!flag || !k1 || !flag1))
        {
            Log.w("GoogleAnalyticsTracker", "Badly formatted referrer missing campaign, medium and source or click ID");
            return null;
        }
        String as1[][] = new String[7][];
        as1[0] = (new String[] {
            "utmcid", (String)s1.get("utm_id")
        });
        as1[1] = (new String[] {
            "utmcsr", (String)s1.get("utm_source")
        });
        as1[2] = (new String[] {
            "utmgclid", (String)s1.get("gclid")
        });
        as1[3] = (new String[] {
            "utmccn", (String)s1.get("utm_campaign")
        });
        as1[4] = (new String[] {
            "utmcmd", (String)s1.get("utm_medium")
        });
        as1[5] = (new String[] {
            "utmctr", (String)s1.get("utm_term")
        });
        as1[6] = (new String[] {
            "utmcct", (String)s1.get("utm_content")
        });
        s1 = new StringBuilder();
        k1 = 0;
        flag = true;
        while (k1 < as1.length) 
        {
            boolean flag2 = flag;
            if (as1[k1][1] != null)
            {
                String s3 = as1[k1][1].replace("+", "%20").replace(" ", "%20");
                if (flag)
                {
                    flag = false;
                } else
                {
                    s1.append("|");
                }
                s1.append(as1[k1][0]).append("=").append(s3);
                flag2 = flag;
            }
            k1++;
            flag = flag2;
        }
        return s1.toString();
    }

    private n[] b(int i1)
    {
        Object obj2 = new ArrayList();
        Object obj1 = a.getReadableDatabase().query("hits", null, null, null, null, null, "hit_id", Integer.toString(1000));
_L2:
        Object obj = obj1;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((List) (obj2)).add(new n(((Cursor) (obj1)).getString(1), ((Cursor) (obj1)).getLong(0)));
        if (true) goto _L2; else goto _L1
        obj2;
_L6:
        obj = obj1;
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj2)).toString());
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return new n[0];
_L1:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return (n[])((List) (obj2)).toArray(new n[((List) (obj2)).size()]);
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

    private static e c(long l1, SQLiteDatabase sqlitedatabase)
    {
        e e1 = new e();
        Object obj = sqlitedatabase.query("custom_variables", null, "event_id= ?", new String[] {
            Long.toString(l1)
        }, null, null, null);
_L4:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        sqlitedatabase = ((SQLiteDatabase) (obj));
        e1.a(new d(((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_index")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_name")), ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("cv_value")), ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("cv_scope"))));
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
        return e1;
_L2:
        if (obj == null) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj)).close();
        return e1;
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

    static boolean c(SQLiteDatabase sqlitedatabase)
    {
        return d(sqlitedatabase);
    }

    static String d()
    {
        return n;
    }

    private static boolean d(SQLiteDatabase sqlitedatabase)
    {
        try
        {
            sqlitedatabase.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            Log.e("GoogleAnalyticsTracker", (new StringBuilder("exception ending transaction:")).append(sqlitedatabase.toString()).toString());
            return false;
        }
        return true;
    }

    private static ab e(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.query("referrer", new String[] {
            "referrer", "timestamp_referrer", "referrer_visit", "referrer_index"
        }, null, null, null, null, null);
        if (!sqlitedatabase.moveToFirst()) goto _L2; else goto _L1
_L1:
        Object obj;
        long l1 = sqlitedatabase.getLong(sqlitedatabase.getColumnIndex("timestamp_referrer"));
        int i1 = sqlitedatabase.getInt(sqlitedatabase.getColumnIndex("referrer_visit"));
        int j1 = sqlitedatabase.getInt(sqlitedatabase.getColumnIndex("referrer_index"));
        obj = new ab(sqlitedatabase.getString(sqlitedatabase.getColumnIndex("referrer")), l1, i1, j1);
_L7:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return ((ab) (obj));
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

    static String e()
    {
        return o;
    }

    static String f()
    {
        return r;
    }

    static String g()
    {
        return p;
    }

    static String h()
    {
        return q;
    }

    static String i()
    {
        return s;
    }

    static String j()
    {
        return t;
    }

    static String k()
    {
        return u;
    }

    private e l()
    {
        e e1;
        try
        {
            e1 = a(a.getReadableDatabase());
        }
        catch (SQLiteException sqliteexception)
        {
            Log.e("GoogleAnalyticsTracker", sqliteexception.toString());
            return new e();
        }
        return e1;
    }

    private int m()
    {
        Cursor cursor;
        Cursor cursor1;
        int i1;
        int j1;
        cursor1 = null;
        cursor = null;
        j1 = 0;
        i1 = 0;
        Cursor cursor2 = a.getReadableDatabase().rawQuery("SELECT COUNT(*) from hits", null);
        cursor = cursor2;
        cursor1 = cursor2;
        if (!cursor2.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        cursor = cursor2;
        cursor1 = cursor2;
        long l1 = cursor2.getLong(0);
        i1 = (int)l1;
        j1 = i1;
        if (cursor2 != null)
        {
            cursor2.close();
            j1 = i1;
        }
_L2:
        return j1;
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

    public final void a(int i1)
    {
        k = i1;
    }

    public final void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        g = g - a.getWritableDatabase().delete("hits", "hit_id = ?", new String[] {
            Long.toString(l1)
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

    public final void a(i i1)
    {
        if (g < 1000) goto _L2; else goto _L1
_L1:
        Log.w("GoogleAnalyticsTracker", "Store full. Not storing last event.");
_L4:
        return;
_L2:
        if (k == 100)
        {
            break; /* Loop/switch isn't completed */
        }
        int j1;
        if (i1.g() == -1)
        {
            j1 = b;
        } else
        {
            j1 = i1.g();
        }
        if (j1 % 10000 < k * 100)
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.google.android.apps.analytics.j.a().d())
        {
            Log.v("GoogleAnalyticsTracker", "User has been sampled out. Aborting hit.");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = a.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        if (h) goto _L6; else goto _L5
_L5:
        SQLiteDatabase sqlitedatabase1;
        sqlitedatabase1 = a.getWritableDatabase();
        sqlitedatabase1.delete("session", null, null);
        if (c != 0L) goto _L8; else goto _L7
_L7:
        long l1 = System.currentTimeMillis() / 1000L;
        c = l1;
        d = l1;
        e = l1;
        f = 1;
_L9:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("timestamp_first", Long.valueOf(c));
        contentvalues.put("timestamp_previous", Long.valueOf(d));
        contentvalues.put("timestamp_current", Long.valueOf(e));
        contentvalues.put("visits", Integer.valueOf(f));
        contentvalues.put("store_id", Integer.valueOf(b));
        sqlitedatabase1.insert("session", null, contentvalues);
        h = true;
_L6:
        a(i1, sqlitedatabase, true);
        sqlitedatabase.setTransactionSuccessful();
        if (sqlitedatabase.inTransaction())
        {
            d(sqlitedatabase);
        }
_L11:
        this;
        JVM INSTR monitorexit ;
        return;
        i1;
        this;
        JVM INSTR monitorexit ;
        throw i1;
        i1;
        Log.e("GoogleAnalyticsTracker", (new StringBuilder("Can't get db: ")).append(i1.toString()).toString());
        this;
        JVM INSTR monitorexit ;
        return;
_L8:
        d = e;
        e = System.currentTimeMillis() / 1000L;
        if (e == d)
        {
            e = e + 1L;
        }
        f = f + 1;
          goto _L9
        i1;
        Log.e("GoogleAnalyticsTracker", (new StringBuilder("putEventOuter:")).append(i1.toString()).toString());
        if (!sqlitedatabase.inTransaction()) goto _L11; else goto _L10
_L10:
        d(sqlitedatabase);
          goto _L11
        i1;
        if (sqlitedatabase.inTransaction())
        {
            d(sqlitedatabase);
        }
        throw i1;
          goto _L9
    }

    public final void a(boolean flag)
    {
        j = flag;
    }

    public final boolean a(String s1)
    {
        s1 = b(s1);
        if (s1 == null)
        {
            return false;
        }
        SQLiteDatabase sqlitedatabase;
        ab ab1;
        ContentValues contentvalues;
        long l1;
        try
        {
            sqlitedatabase = a.getWritableDatabase();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e("GoogleAnalyticsTracker", s1.toString());
            return false;
        }
        ab1 = e(sqlitedatabase);
        contentvalues = new ContentValues();
        contentvalues.put("referrer", s1);
        contentvalues.put("timestamp_referrer", Long.valueOf(0L));
        contentvalues.put("referrer_visit", Integer.valueOf(0));
        if (ab1 != null)
        {
            long l2 = ab1.d();
            l1 = l2;
            if (ab1.b() > 0L)
            {
                l1 = l2 + 1L;
            }
        } else
        {
            l1 = 1L;
        }
        contentvalues.put("referrer_index", Long.valueOf(l1));
        if (a(sqlitedatabase, contentvalues))
        {
            c();
            return true;
        } else
        {
            return false;
        }
    }

    public final i[] a(int i1, SQLiteDatabase sqlitedatabase, int j1)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = sqlitedatabase.query("events", null, null, null, null, null, "event_id", Integer.toString(1000));
_L5:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        Object obj1;
        String s1;
        s1 = ((Cursor) (obj)).getString(8);
        obj1 = ((Cursor) (obj)).getString(9);
        Object obj2;
        long l1;
        if ("__##GOOGLEPAGEVIEW##__".equals(s1))
        {
            obj2 = null;
        } else
        {
            obj2 = obj1;
            obj1 = null;
        }
        obj2 = new i(((Cursor) (obj)).getLong(0), ((Cursor) (obj)).getString(2), ((Cursor) (obj)).getInt(3), ((Cursor) (obj)).getInt(4), ((Cursor) (obj)).getInt(5), ((Cursor) (obj)).getInt(6), ((Cursor) (obj)).getInt(7), ((String) (obj1)), s1, ((String) (obj2)), ((Cursor) (obj)).getString(10), ((Cursor) (obj)).getInt(11), ((Cursor) (obj)).getInt(12), ((Cursor) (obj)).getInt(13));
        ((i) (obj2)).g(((Cursor) (obj)).getInt(1));
        l1 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("event_id"));
        if (!"__##GOOGLETRANSACTION##__".equals(((i) (obj2)).d)) goto _L4; else goto _L3
_L3:
        obj1 = a(l1, sqlitedatabase);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        Log.w("GoogleAnalyticsTracker", (new StringBuilder("missing expected transaction for event ")).append(l1).toString());
        ((i) (obj2)).a(((ac) (obj1)));
_L8:
        arraylist.add(obj2);
          goto _L5
        obj1;
        sqlitedatabase = ((SQLiteDatabase) (obj));
        obj = obj1;
_L11:
        Log.e("GoogleAnalyticsTracker", ((SQLiteException) (obj)).toString());
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return new i[0];
_L4:
        if (!"__##GOOGLEITEM##__".equals(((i) (obj2)).d)) goto _L7; else goto _L6
_L6:
        obj1 = b(l1, sqlitedatabase);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        Log.w("GoogleAnalyticsTracker", (new StringBuilder("missing expected item for event ")).append(l1).toString());
        ((i) (obj2)).a(((q) (obj1)));
          goto _L8
        sqlitedatabase;
_L10:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw sqlitedatabase;
_L7:
        if (j1 <= 1)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        obj1 = c(l1, sqlitedatabase);
_L9:
        obj2.j = ((e) (obj1));
          goto _L8
        obj1 = new e();
          goto _L9
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return (i[])arraylist.toArray(new i[arraylist.size()]);
          goto _L8
        sqlitedatabase;
        obj = null;
          goto _L10
        obj1;
        obj = sqlitedatabase;
        sqlitedatabase = ((SQLiteDatabase) (obj1));
          goto _L10
        obj;
        sqlitedatabase = null;
          goto _L11
    }

    public final n[] a()
    {
        return b(1000);
    }

    public final int b()
    {
        return g;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
        Object obj = sqlitedatabase.query("session", null, null, null, null, null, null);
        Object obj1 = obj;
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        c = ((Cursor) (obj)).getLong(0);
        obj1 = obj;
        d = ((Cursor) (obj)).getLong(1);
        obj1 = obj;
        e = ((Cursor) (obj)).getLong(2);
        obj1 = obj;
        f = ((Cursor) (obj)).getInt(3);
        obj1 = obj;
        b = ((Cursor) (obj)).getInt(4);
        obj1 = obj;
        sqlitedatabase = e(sqlitedatabase);
        obj1 = obj;
        if (c == 0L) goto _L4; else goto _L3
_L3:
        if (sqlitedatabase == null) goto _L6; else goto _L5
_L5:
        obj1 = obj;
        if (sqlitedatabase.b() == 0L) goto _L4; else goto _L6
_L14:
        obj1 = obj;
        boolean flag;
        h = flag;
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
        h = false;
        obj1 = obj;
        i = true;
        obj1 = obj;
        b = (new SecureRandom()).nextInt() & 0x7fffffff;
        obj1 = obj;
        ((Cursor) (obj)).close();
        obj = new ContentValues();
        ((ContentValues) (obj)).put("timestamp_first", Long.valueOf(0L));
        ((ContentValues) (obj)).put("timestamp_previous", Long.valueOf(0L));
        ((ContentValues) (obj)).put("timestamp_current", Long.valueOf(0L));
        ((ContentValues) (obj)).put("visits", Integer.valueOf(0));
        ((ContentValues) (obj)).put("store_id", Integer.valueOf(b));
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

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        h = false;
        i = true;
        g = m();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
