// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.f;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.text.format.DateUtils;
import io.wecloud.message.d.k;
import io.wecloud.message.e.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package io.wecloud.message.f:
//            d, e, b

public class a
{

    private static long a = 30000L;
    private static long b = 15000L;
    private static a c;
    private static Object n = new Object();
    private Context d;
    private ActivityManager e;
    private long f;
    private boolean g;
    private long h;
    private long i;
    private String j;
    private long k;
    private HashMap l;
    private Object m;
    private d o;
    private b p;

    private a(Context context)
    {
        h = 15000L;
        m = new Object();
        o = null;
        d = context;
        e = (ActivityManager)d.getSystemService("activity");
        l = new HashMap();
        o = new d(d);
    }

    public static a a(Context context)
    {
        io/wecloud/message/f/a;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new a(context);
        }
        context = c;
        io/wecloud/message/f/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static void a(a a1, long l1)
    {
        a1.i = l1;
    }

    static void a(a a1, String s)
    {
        a1.j = s;
    }

    static void a(a a1, String s, long l1, boolean flag)
    {
        a1.a(s, l1, flag);
    }

    private void a(String s, long l1, boolean flag)
    {
        Object obj2 = n;
        obj2;
        JVM INSTR monitorenter ;
        io.wecloud.message.e.c.b("UsageMonitor", (new StringBuilder("save to db, pkg = ")).append(s).append(", duration =").append(l1).append(", toAdd =").append(flag).toString());
        if (TextUtils.isEmpty(s) || l1 <= 0L) goto _L2; else goto _L1
_L1:
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        StringBuffer stringbuffer;
        sqlitedatabase = o.getWritableDatabase();
        contentvalues = new ContentValues();
        contentvalues.put("pkg_name", s);
        stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder("pkg_name = '")).append(s).append("'").toString());
        Object obj = sqlitedatabase.query(true, "usage_monitor", null, stringbuffer.toString(), null, null, null, null, null);
        if (obj == null) goto _L4; else goto _L3
_L3:
        s = ((String) (obj));
        if (((Cursor) (obj)).getCount() != 1) goto _L4; else goto _L5
_L5:
        s = ((String) (obj));
        if (!((Cursor) (obj)).moveToFirst()) goto _L4; else goto _L6
_L6:
        s = ((String) (obj));
        e e1 = new e(((Cursor) (obj)));
        s = ((String) (obj));
        if (DateUtils.isToday(e1.c())) goto _L8; else goto _L7
_L7:
        s = ((String) (obj));
        contentvalues.put("usage_time", Long.valueOf(l1));
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        s = ((String) (obj));
        contentvalues.put("open_count", Integer.valueOf(i1));
        s = ((String) (obj));
        contentvalues.put("toInsert", Boolean.valueOf(false));
_L11:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        ((Cursor) (obj)).close();
_L13:
        contentvalues.put("last_modified", Long.valueOf(System.currentTimeMillis()));
        if (!contentvalues.getAsBoolean("toInsert").booleanValue()) goto _L10; else goto _L9
_L9:
        contentvalues.remove("toInsert");
        sqlitedatabase.insert("usage_monitor", "pkg_name", contentvalues);
_L2:
        obj2;
        JVM INSTR monitorexit ;
        return;
_L8:
        s = ((String) (obj));
        contentvalues.put("usage_time", Long.valueOf(e1.a() + l1));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        s = ((String) (obj));
        contentvalues.put("open_count", Integer.valueOf(e1.b() + 1));
        s = ((String) (obj));
        contentvalues.put("toInsert", Boolean.valueOf(false));
          goto _L11
        Object obj1;
        obj1;
_L17:
        s = ((String) (obj));
        contentvalues.put("usage_time", Long.valueOf(l1));
        int j1;
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        s = ((String) (obj));
        contentvalues.put("open_count", Integer.valueOf(j1));
        s = ((String) (obj));
        contentvalues.put("toInsert", Boolean.valueOf(true));
        s = ((String) (obj));
        sqlitedatabase.delete("usage_monitor", stringbuffer.toString(), null);
_L14:
        if (obj == null) goto _L13; else goto _L12
_L12:
        ((Cursor) (obj)).close();
          goto _L13
        s;
        s.printStackTrace();
          goto _L13
        s;
        obj2;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        s = ((String) (obj));
        contentvalues.put("usage_time", Long.valueOf(l1));
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        s = ((String) (obj));
        contentvalues.put("open_count", Integer.valueOf(j1));
        s = ((String) (obj));
        contentvalues.put("toInsert", Boolean.valueOf(true));
          goto _L11
        obj1;
        obj = s;
        s = ((String) (obj1));
_L16:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_557;
        }
        ((Cursor) (obj)).close();
_L15:
        throw s;
        s;
        s = ((String) (obj));
        ((Exception) (obj1)).printStackTrace();
          goto _L14
        obj;
        ((Exception) (obj)).printStackTrace();
          goto _L15
        s;
        s.printStackTrace();
          goto _L13
_L10:
        contentvalues.remove("pkg_name");
        contentvalues.remove("toInsert");
        sqlitedatabase.update("usage_monitor", contentvalues, stringbuffer.toString(), null);
          goto _L2
        s;
        obj = null;
          goto _L16
        obj1;
        obj = null;
          goto _L17
    }

    static boolean a(a a1)
    {
        return a1.g;
    }

    static String b(a a1)
    {
        return a1.h();
    }

    static void b(a a1, long l1)
    {
        a1.k = l1;
    }

    static long c(a a1)
    {
        return a1.f;
    }

    static void c(a a1, long l1)
    {
        a1.f = l1;
    }

    static long d(a a1)
    {
        return a1.h;
    }

    static long e(a a1)
    {
        return a1.i;
    }

    static long f()
    {
        return a;
    }

    static String f(a a1)
    {
        return a1.j;
    }

    static long g()
    {
        return b;
    }

    static long g(a a1)
    {
        return a1.k;
    }

    private String h()
    {
        return ((android.app.ActivityManager.RunningTaskInfo)e.getRunningTasks(1).get(0)).topActivity.getPackageName();
    }

    static HashMap h(a a1)
    {
        return a1.l;
    }

    static Object i(a a1)
    {
        return a1.m;
    }

    public void a()
    {
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            io.wecloud.message.e.c.b("UsageMonitor", "Android5.0 not startMonitoring...");
        } else
        if (d.getPackageName().equals(io.wecloud.message.h.a.b(d)))
        {
            g = false;
            if (p == null)
            {
                p = new b(this, null);
            }
            io.wecloud.message.d.k.a("UsageMonitor").b(p);
            io.wecloud.message.d.k.a("UsageMonitor").b();
            io.wecloud.message.d.k.a("UsageMonitor").a(p);
            io.wecloud.message.e.c.b("UsageMonitor", "startMonitoring...");
            return;
        }
    }

    public void b()
    {
        if (!d.getPackageName().equals(io.wecloud.message.h.a.b(d)))
        {
            return;
        } else
        {
            g = true;
            io.wecloud.message.d.k.a("UsageMonitor").b(p);
            io.wecloud.message.d.k.a("UsageMonitor").b();
            io.wecloud.message.e.c.b("UsageMonitor", "stopMonitoring...");
            return;
        }
    }

    public void c()
    {
        if (!d.getPackageName().equals(io.wecloud.message.h.a.b(d)))
        {
            return;
        } else
        {
            b();
            return;
        }
    }

    public ArrayList d()
    {
        Object obj1 = n;
        obj1;
        JVM INSTR monitorenter ;
        ArrayList arraylist = new ArrayList();
        Object obj;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = o.getWritableDatabase();
        obj = sqlitedatabase.query("usage_monitor", null, null, null, null, null, "usage_time asc");
        ArrayList arraylist1 = io.wecloud.message.h.a.a(d);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj)).getCount() <= 0 || !((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L3
_L3:
        String s;
        JSONObject jsonobject;
        int j1;
        long l1;
        s = io.wecloud.message.h.c.b(((Cursor) (obj)), "pkg_name");
        l1 = io.wecloud.message.h.c.c(((Cursor) (obj)), "usage_time");
        j1 = io.wecloud.message.h.c.a(((Cursor) (obj)), "open_count");
        jsonobject = new JSONObject();
        jsonobject.put("pkg", s);
        jsonobject.put("usage", l1);
        int i1;
        i1 = j1;
        if (l1 > 0L)
        {
            i1 = j1;
            if (j1 == 0)
            {
                i1 = 1;
            }
        }
        jsonobject.put("count", i1);
        if (!d.getPackageName().equals(s)) goto _L5; else goto _L4
_L4:
        jsonobject.put("ak", io.wecloud.message.h.a.f(d, "APPKEY"));
_L8:
        arraylist.add(io.wecloud.message.e.a.d(jsonobject.toString()));
        if (((Cursor) (obj)).moveToNext()) goto _L3; else goto _L6
_L6:
        sqlitedatabase.delete("usage_monitor", null, null);
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        ((Cursor) (obj)).close();
_L10:
        obj1;
        JVM INSTR monitorexit ;
        return arraylist;
_L5:
        if (!arraylist1.contains(s)) goto _L8; else goto _L7
_L7:
        jsonobject.put("ak", io.wecloud.message.h.a.c(d, s));
          goto _L8
        Exception exception2;
        exception2;
_L13:
        if (obj == null) goto _L10; else goto _L9
_L9:
        ((Cursor) (obj)).close();
          goto _L10
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception1;
        exception1;
        obj = null;
_L12:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        ((Cursor) (obj)).close();
        throw exception1;
        exception1;
        if (true) goto _L12; else goto _L11
_L11:
        Exception exception;
        exception;
        exception = null;
          goto _L13
    }

    public void e()
    {
        synchronized (n)
        {
            try
            {
                o.getWritableDatabase().delete("usage_monitor", null, null);
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception1) { }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        Exception exception1;
        throw exception;
    }

}
