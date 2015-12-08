// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.database.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.jiubang.commerce.database.DataBaseHelper;
import com.jiubang.commerce.utils.b;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d
{

    private static d a;
    private DataBaseHelper b;

    private d(Context context)
    {
        b = DataBaseHelper.getInstance(context);
        try
        {
            a(b(context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            j.b("Ad_SDK", "InstalledPkgTable--constructor Exception!", context);
        }
    }

    public static d a(Context context)
    {
        com/jiubang/commerce/database/b/d;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new d(context);
        }
        context = a;
        com/jiubang/commerce/database/b/d;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private boolean a(String s, List list)
    {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(s))
        {
            return false;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            com.jiubang.commerce.database.a.d d1 = (com.jiubang.commerce.database.a.d)list.next();
            if (d1 != null && s.equals(d1.b()))
            {
                return true;
            }
        }

        return false;
    }

    private List b(Context context)
    {
        List list = c();
        Object obj = com.jiubang.commerce.utils.b.b(context);
        if (obj != null && !((List) (obj)).isEmpty())
        {
            context = new ArrayList();
            long l = System.currentTimeMillis();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                PackageInfo packageinfo = (PackageInfo)((Iterator) (obj)).next();
                if (!a(packageinfo.packageName, list))
                {
                    context.add(new com.jiubang.commerce.database.a.d(packageinfo.packageName, l));
                }
            } while (true);
            return context;
        } else
        {
            return null;
        }
    }

    public boolean a()
    {
        return a(0x134fd9000L);
    }

    public boolean a(long l)
    {
        boolean flag = true;
        if (l <= 0L)
        {
            return false;
        }
        if (b.delete("InstalledPkg", " updateTime <= ? ", new String[] {
    String.valueOf(System.currentTimeMillis() - l)
}) <= 0)
        {
            flag = false;
        }
        return flag;
    }

    public boolean a(List list)
    {
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L6:
        return flag;
_L2:
        SQLiteDatabase sqlitedatabase2 = b.getWritableDatabase();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.beginTransaction();
        int i = 0;
_L4:
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        if (i >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        com.jiubang.commerce.database.a.d d1 = (com.jiubang.commerce.database.a.d)list.get(i);
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        ContentValues contentvalues = new ContentValues();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("packageName", d1.b());
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        contentvalues.put("updateTime", Long.valueOf(d1.a()));
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.replace("InstalledPkg", null, contentvalues);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.setTransactionSuccessful();
        boolean flag1 = true;
        flag = flag1;
        if (sqlitedatabase2 != null)
        {
            flag = flag1;
            if (sqlitedatabase2.inTransaction())
            {
                sqlitedatabase2.endTransaction();
                return true;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        list;
        sqlitedatabase1 = sqlitedatabase;
        j.b("Ad_SDK", "InstalledPkgTable--insertData Exception!", list);
        if (sqlitedatabase != null && sqlitedatabase.inTransaction())
        {
            sqlitedatabase.endTransaction();
        }
        return false;
        list;
        if (sqlitedatabase1 != null && sqlitedatabase1.inTransaction())
        {
            sqlitedatabase1.endTransaction();
        }
        throw list;
    }

    public List b()
    {
        return b(0x134fd9000L);
    }

    public List b(long l)
    {
        ArrayList arraylist = new ArrayList();
        Cursor cursor1;
        long l1 = System.currentTimeMillis();
        cursor1 = b.query("InstalledPkg", null, "updateTime > ?", new String[] {
            String.valueOf(l1 - l)
        }, null, null, null);
        if (cursor1 == null) goto _L2; else goto _L1
_L1:
        Cursor cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L3
_L3:
        cursor = cursor1;
        com.jiubang.commerce.database.a.d d1 = new com.jiubang.commerce.database.a.d();
        cursor = cursor1;
        d1.a(cursor1.getString(cursor1.getColumnIndex("packageName")));
        cursor = cursor1;
        d1.a(cursor1.getLong(cursor1.getColumnIndex("updateTime")));
        cursor = cursor1;
        arraylist.add(d1);
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
        exception1.printStackTrace();
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

    public List c()
    {
        ArrayList arraylist = new ArrayList();
        Cursor cursor1 = b.query("InstalledPkg", null, null, null, null, null, null);
        if (cursor1 == null) goto _L2; else goto _L1
_L1:
        Cursor cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L3
_L3:
        cursor = cursor1;
        com.jiubang.commerce.database.a.d d1 = new com.jiubang.commerce.database.a.d();
        cursor = cursor1;
        d1.a(cursor1.getString(cursor1.getColumnIndex("packageName")));
        cursor = cursor1;
        d1.a(cursor1.getLong(cursor1.getColumnIndex("updateTime")));
        cursor = cursor1;
        arraylist.add(d1);
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
        exception1.printStackTrace();
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
}
