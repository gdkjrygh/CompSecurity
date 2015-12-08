// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.database.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.jiubang.commerce.database.DataBaseHelper;
import com.jiubang.commerce.utils.AdTimer;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.List;

public class a
{

    private static a a;
    private DataBaseHelper b;

    private a(Context context)
    {
        b = DataBaseHelper.getInstance(context);
    }

    public static a a(Context context)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/jiubang/commerce/database/b/a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new a(context);
        }
        com/jiubang/commerce/database/b/a;
        JVM INSTR monitorexit ;
_L2:
        return a;
        context;
        com/jiubang/commerce/database/b/a;
        JVM INSTR monitorexit ;
        throw context;
    }

    public List a(int i)
    {
        ArrayList arraylist = new ArrayList();
        Cursor cursor1;
        long l = AdTimer.b();
        cursor1 = b.query("AdShowClick", null, "vmid = ? AND updateTime >= ? AND updateTime < ?", new String[] {
            String.valueOf(i), String.valueOf(l - 0x48190800L), String.valueOf(l)
        }, null, null, "updateTime ASC");
        if (cursor1 == null) goto _L2; else goto _L1
_L1:
        Cursor cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L3
_L3:
        cursor = cursor1;
        com.jiubang.commerce.database.a.a a1 = new com.jiubang.commerce.database.a.a();
        cursor = cursor1;
        a1.a(cursor1.getInt(cursor1.getColumnIndex("vmid")));
        cursor = cursor1;
        a1.a(cursor1.getString(cursor1.getColumnIndex("opt")));
        cursor = cursor1;
        a1.a(cursor1.getLong(cursor1.getColumnIndex("updateTime")));
        cursor = cursor1;
        arraylist.add(a1);
        cursor = cursor1;
        boolean flag = cursor1.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        if (cursor1 != null)
        {
            cursor1.close();
        }
_L5:
        return arraylist;
        Exception exception1;
        exception1;
        cursor1 = null;
_L8:
        cursor = cursor1;
        j.b("Ad_SDK", "AdShowClickTable--getValidData Exception!", exception1);
        if (cursor1 == null) goto _L5; else goto _L4
_L4:
        cursor1.close();
        return arraylist;
        Exception exception;
        exception;
        cursor = null;
_L7:
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
        exception;
        if (true) goto _L7; else goto _L6
_L6:
        exception1;
          goto _L8
    }

    public boolean a()
    {
        long l = AdTimer.b();
        return b.delete("AdShowClick", " updateTime < ? ", new String[] {
            String.valueOf(l - 0x48190800L)
        }) > 0;
    }

    public boolean a(com.jiubang.commerce.database.a.a a1)
    {
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        boolean flag;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        flag = false;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return flag;
_L2:
        SQLiteDatabase sqlitedatabase2 = b.getWritableDatabase();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.beginTransaction();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("vmid", Integer.valueOf(a1.a()));
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("opt", a1.b());
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("updateTime", Long.valueOf(a1.c()));
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.replace("AdShowClick", null, contentvalues);
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.setTransactionSuccessful();
        flag = true;
        if (sqlitedatabase2 != null)
        {
            sqlitedatabase2.endTransaction();
            return true;
        }
          goto _L1
        a1;
        sqlitedatabase1 = sqlitedatabase;
        j.b("Ad_SDK", "AdShowClickTable--insertData Exception!", a1);
        if (sqlitedatabase == null) goto _L1; else goto _L3
_L3:
        sqlitedatabase.endTransaction();
        return false;
        a1;
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.endTransaction();
        }
        throw a1;
    }
}
