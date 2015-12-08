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
import java.util.ArrayList;
import java.util.List;

public class b
{

    private static b a;
    private DataBaseHelper b;

    public b(Context context)
    {
        b = DataBaseHelper.getInstance(context);
    }

    public static b a(Context context)
    {
        com/jiubang/commerce/database/b/b;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new b(context);
        }
        context = a;
        com/jiubang/commerce/database/b/b;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static List a(String s, String s1, String s2, long l)
    {
        ArrayList arraylist = new ArrayList();
        com.jiubang.commerce.database.a.b b1 = new com.jiubang.commerce.database.a.b();
        b1.a(s);
        b1.b(s1);
        b1.c(s2);
        b1.a(l);
        arraylist.add(b1);
        return arraylist;
    }

    public List a(com.jiubang.commerce.database.a.b b1)
    {
        com.jiubang.commerce.database.a.b b2;
        ArrayList arraylist;
        b2 = null;
        arraylist = new ArrayList();
        Object obj;
        Object obj2;
        obj2 = new StringBuffer(" 1=1");
        obj = new ArrayList();
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (!TextUtils.isEmpty(b1.b()))
        {
            ((StringBuffer) (obj2)).append(" AND redirectUrl = ?");
            ((List) (obj)).add(b1.b());
        }
        b1 = b;
        obj2 = ((StringBuffer) (obj2)).toString();
        String as[] = b(((List) (obj)));
        b1 = b1.query("AD_URL", new String[] {
            "packageName", "redirectUrl", "adUrl", "updateTime"
        }, ((String) (obj2)), as, null, null, null);
        b2 = b1;
        if (b2 == null) goto _L2; else goto _L1
_L1:
        b1 = b2;
        if (!b2.moveToFirst()) goto _L2; else goto _L3
_L3:
        b1 = b2;
        as = new com.jiubang.commerce.database.a.b();
        b1 = b2;
        as.a(b2.getString(b2.getColumnIndex("packageName")));
        b1 = b2;
        as.b(b2.getString(b2.getColumnIndex("redirectUrl")));
        b1 = b2;
        as.c(b2.getString(b2.getColumnIndex("adUrl")));
        b1 = b2;
        as.a(b2.getLong(b2.getColumnIndex("updateTime")));
        b1 = b2;
        arraylist.add(as);
        b1 = b2;
        boolean flag = b2.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        if (b2 != null)
        {
            b2.close();
        }
_L5:
        return arraylist;
        Object obj1;
        obj1;
        b2 = null;
_L8:
        b1 = b2;
        ((Exception) (obj1)).printStackTrace();
        if (b2 == null) goto _L5; else goto _L4
_L4:
        b2.close();
        return arraylist;
        b1;
_L7:
        if (b2 != null)
        {
            b2.close();
        }
        throw b1;
        obj1;
        b2 = b1;
        b1 = ((com.jiubang.commerce.database.a.b) (obj1));
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
          goto _L8
    }

    public boolean a(long l)
    {
        boolean flag = true;
        if (l <= 0L)
        {
            return false;
        }
        if (b.delete("AD_URL", " updateTime <= ? OR redirectUrl IS NULL OR adUrl IS NULL", new String[] {
    String.valueOf(System.currentTimeMillis() - l)
}) <= 0)
        {
            flag = false;
        }
        return flag;
    }

    public boolean a(List list)
    {
        Object obj;
        obj = null;
        if (list == null || list.isEmpty())
        {
            return false;
        }
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        obj = sqlitedatabase;
        sqlitedatabase.beginTransaction();
        int i = 0;
_L10:
        obj = sqlitedatabase;
        if (i >= list.size()) goto _L2; else goto _L1
_L1:
        obj = sqlitedatabase;
        com.jiubang.commerce.database.a.b b1 = (com.jiubang.commerce.database.a.b)list.get(i);
        obj = sqlitedatabase;
        if (TextUtils.isEmpty(b1.c())) goto _L4; else goto _L3
_L3:
        obj = sqlitedatabase;
        if (!TextUtils.isEmpty(b1.b())) goto _L5; else goto _L4
_L5:
        obj = sqlitedatabase;
        ContentValues contentvalues = new ContentValues();
        obj = sqlitedatabase;
        contentvalues.put("packageName", b1.a());
        obj = sqlitedatabase;
        contentvalues.put("redirectUrl", b1.b());
        obj = sqlitedatabase;
        contentvalues.put("adUrl", b1.c());
        obj = sqlitedatabase;
        contentvalues.put("updateTime", Long.valueOf(b1.d()));
        obj = sqlitedatabase;
        sqlitedatabase.delete("AD_URL", " redirectUrl = ?", new String[] {
            b1.b()
        });
        obj = sqlitedatabase;
        sqlitedatabase.insert("AD_URL", null, contentvalues);
          goto _L4
        obj;
        list = sqlitedatabase;
_L8:
        j.b("Ad_SDK", "insert ad url data Exception!", ((Throwable) (obj)));
        if (list != null)
        {
            try
            {
                list.endTransaction();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        return false;
_L2:
        obj = sqlitedatabase;
        sqlitedatabase.setTransactionSuccessful();
        if (sqlitedatabase != null)
        {
            try
            {
                sqlitedatabase.endTransaction();
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                list.printStackTrace();
            }
        }
        return true;
        list;
_L7:
        if (obj != null)
        {
            try
            {
                ((SQLiteDatabase) (obj)).endTransaction();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Throwable) (obj)).printStackTrace();
            }
        }
        throw list;
        Exception exception;
        exception;
        obj = list;
        list = exception;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
        list = null;
        if (true) goto _L8; else goto _L4
_L4:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public String[] b(List list)
    {
        if (list == null || list.size() < 0)
        {
            return null;
        }
        String as[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
        {
            as[i] = (String)list.get(i);
        }

        return as;
    }
}
