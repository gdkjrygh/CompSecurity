// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.database.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.jiubang.commerce.database.DataBaseHelper;
import com.jiubang.commerce.utils.j;
import java.util.HashMap;
import java.util.Map;

public class c
{

    private static c b;
    private Map a;
    private DataBaseHelper c;

    public c(Context context)
    {
        a = null;
        c = DataBaseHelper.getInstance(context);
    }

    public static c a(Context context)
    {
        com/jiubang/commerce/database/b/c;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new c(context);
        }
        context = b;
        com/jiubang/commerce/database/b/c;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public com.jiubang.commerce.database.a.c a(String s, String s1)
    {
        if (s != null && s1 != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        s1 = c.getWritableDatabase().query("AdvertFilter", null, " packageName =? and moduleId =? ", new String[] {
            s, s1
        }, null, null, null);
        if (s1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s1;
        if (s1.getCount() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s1;
        if (!s1.moveToFirst())
        {
            break; /* Loop/switch isn't completed */
        }
        s = s1;
        com.jiubang.commerce.database.a.c c1 = new com.jiubang.commerce.database.a.c();
        s = s1;
        c1.a(s1.getString(s1.getColumnIndex("packageName")));
        s = s1;
        c1.b(s1.getString(s1.getColumnIndex("moduleId")));
        s = s1;
        c1.c(s1.getString(s1.getColumnIndex("advertPos")));
        s = s1;
        c1.a(s1.getInt(s1.getColumnIndex("showCount")));
        s = s1;
        c1.a(s1.getLong(s1.getColumnIndex("saveTime")));
        s = c1;
        if (s1 != null)
        {
            s1.close();
            return c1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s1 != null)
        {
            s1.close();
        }
        return null;
        Exception exception;
        exception;
        s1 = null;
_L8:
        s = s1;
        j.b("Ad_SDK", "AdvertFilterTable.isDataExist Exception!", exception);
        if (s1 != null)
        {
            s1.close();
        }
        return null;
        s1;
        s = null;
_L6:
        if (s != null)
        {
            s.close();
        }
        throw s1;
        s1;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public String a(String s, int i)
    {
        a(s);
        s = c.getWritableDatabase().query("AdvertFilter", null, " moduleId =? ", new String[] {
            s
        }, null, null, " showCount DESC");
        if (s == null) goto _L2; else goto _L1
_L1:
        String s1 = s;
        if (s.getCount() <= 0) goto _L2; else goto _L3
_L3:
        s1 = s;
        if (!s.moveToFirst()) goto _L2; else goto _L4
_L4:
        String s3;
        int l;
        s3 = "";
        l = 0;
_L8:
        s1 = s;
        String s2 = (new StringBuilder()).append(s.getString(s.getColumnIndex("packageName"))).append("|").append(String.valueOf(s.getInt(s.getColumnIndex("showCount")))).append(",").toString();
        s1 = s;
        s2 = (new StringBuilder()).append(s3).append(s2).toString();
        int k = l;
        if (i <= 0) goto _L6; else goto _L5
_L5:
        l++;
        k = l;
        if (l < i) goto _L6; else goto _L7
_L7:
        s1 = s2;
        if (s != null)
        {
            s.close();
            s1 = s2;
        }
_L10:
        return s1;
_L6:
        s3 = s2;
        l = k;
        s1 = s;
        if (s.moveToNext()) goto _L8; else goto _L7
_L2:
        s1 = "";
        if (s == null) goto _L10; else goto _L9
_L9:
        s.close();
        return "";
        Exception exception;
        exception;
        s = null;
_L14:
        s1 = s;
        j.b("Ad_SDK", "AdvertFilterTable.getFilterList Exception!", exception);
        s1 = "";
        if (s == null) goto _L10; else goto _L11
_L11:
        s.close();
        return "";
        s;
        s1 = null;
_L13:
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        s;
        if (true) goto _L13; else goto _L12
_L12:
        exception;
          goto _L14
    }

    public void a()
    {
        try
        {
            c.getWritableDatabase().delete("AdvertFilter", null, null);
            return;
        }
        catch (Exception exception)
        {
            j.b("Ad_SDK", "AdvertFilterTable.deleteAllData Exception!", exception);
        }
    }

    public void a(String s)
    {
        long l = System.currentTimeMillis();
        if (a != null && a.containsKey(s) && l - ((Long)a.get(s)).longValue() < 0xdbba00L)
        {
            return;
        }
        try
        {
            c.getWritableDatabase().delete("AdvertFilter", " moduleId =? and saveTime <=?", new String[] {
                s, String.valueOf(System.currentTimeMillis() - 0x14997000L)
            });
            if (a == null)
            {
                a = new HashMap();
            }
            a.put(s, Long.valueOf(l));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            j.b("Ad_SDK", "AdvertFilterTable.deleteInvaildData Exception!", s);
        }
    }

    public boolean a(com.jiubang.commerce.database.a.c c1)
    {
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        boolean flag;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        flag = false;
        if (c1 != null) goto _L2; else goto _L1
_L1:
        return flag;
_L2:
        SQLiteDatabase sqlitedatabase2 = c.getWritableDatabase();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.beginTransaction();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        boolean flag1 = TextUtils.isEmpty(c1.a());
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (sqlitedatabase2 != null)
        {
            try
            {
                sqlitedatabase2.endTransaction();
            }
            // Misplaced declaration of an exception variable
            catch (com.jiubang.commerce.database.a.c c1)
            {
                c1.printStackTrace();
                return false;
            }
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("packageName", c1.a());
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("moduleId", c1.b());
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("advertPos", c1.c());
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("showCount", Integer.valueOf(c1.d()));
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("saveTime", Long.valueOf(c1.e()));
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.insert("AdvertFilter", null, contentvalues);
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.setTransactionSuccessful();
        flag = true;
        if (sqlitedatabase2 != null)
        {
            try
            {
                sqlitedatabase2.endTransaction();
            }
            // Misplaced declaration of an exception variable
            catch (com.jiubang.commerce.database.a.c c1)
            {
                c1.printStackTrace();
                return true;
            }
            return true;
        }
          goto _L1
        c1;
        sqlitedatabase1 = sqlitedatabase;
        j.b("Ad_SDK", "AdvertFilterTable.insert Exception!", c1);
        if (sqlitedatabase == null) goto _L1; else goto _L4
_L4:
        try
        {
            sqlitedatabase.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch (com.jiubang.commerce.database.a.c c1)
        {
            c1.printStackTrace();
            return false;
        }
        return false;
        c1;
        if (sqlitedatabase1 != null)
        {
            try
            {
                sqlitedatabase1.endTransaction();
            }
            catch (Throwable throwable)
            {
                throwable.printStackTrace();
            }
        }
        throw c1;
    }

    public boolean b(com.jiubang.commerce.database.a.c c1)
    {
        if (c1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase2 = c.getWritableDatabase();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.beginTransaction();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        boolean flag = TextUtils.isEmpty(c1.a());
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (sqlitedatabase2 != null)
        {
            try
            {
                sqlitedatabase2.endTransaction();
            }
            // Misplaced declaration of an exception variable
            catch (com.jiubang.commerce.database.a.c c1)
            {
                c1.printStackTrace();
                return false;
            }
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("packageName", c1.a());
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("moduleId", c1.b());
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("advertPos", c1.c());
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("showCount", Integer.valueOf(c1.d()));
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("saveTime", Long.valueOf(c1.e()));
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.update("AdvertFilter", contentvalues, " packageName =? and moduleId =? ", new String[] {
            c1.a(), c1.b()
        });
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.setTransactionSuccessful();
        if (sqlitedatabase2 != null)
        {
            try
            {
                sqlitedatabase2.endTransaction();
            }
            // Misplaced declaration of an exception variable
            catch (com.jiubang.commerce.database.a.c c1)
            {
                c1.printStackTrace();
            }
        }
        return true;
        c1;
        sqlitedatabase1 = sqlitedatabase;
        j.b("Ad_SDK", "AdvertFilterTable.update Exception!", c1);
        if (sqlitedatabase == null) goto _L1; else goto _L4
_L4:
        try
        {
            sqlitedatabase.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch (com.jiubang.commerce.database.a.c c1)
        {
            c1.printStackTrace();
            return false;
        }
        return false;
        c1;
        if (sqlitedatabase1 != null)
        {
            try
            {
                sqlitedatabase1.endTransaction();
            }
            catch (Throwable throwable)
            {
                throwable.printStackTrace();
            }
        }
        throw c1;
    }
}
