// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.database.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.jiubang.commerce.database.DataBaseHelper;
import com.jiubang.commerce.utils.j;
import java.util.List;

public class e
{

    private static e a;
    private DataBaseHelper b;

    public e(Context context)
    {
        b = DataBaseHelper.getInstance(context);
    }

    public static e a(Context context)
    {
        com/jiubang/commerce/database/b/e;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new e(context);
        }
        context = a;
        com/jiubang/commerce/database/b/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
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
        com.jiubang.commerce.database.a.e e1 = (com.jiubang.commerce.database.a.e)list.get(i);
        obj = sqlitedatabase;
        if (TextUtils.isEmpty(e1.a()))
        {
            break MISSING_BLOCK_LABEL_273;
        }
        obj = sqlitedatabase;
        ContentValues contentvalues = new ContentValues();
        obj = sqlitedatabase;
        contentvalues.put("packageName", e1.a());
        obj = sqlitedatabase;
        if (e1.b() != null) goto _L4; else goto _L3
_L3:
        obj = sqlitedatabase;
        long l = System.currentTimeMillis();
_L5:
        obj = sqlitedatabase;
        contentvalues.put("installTime", Long.valueOf(l));
        obj = sqlitedatabase;
        sqlitedatabase.delete("WAIT_ACTIVATION_APP", " packageName = ?", new String[] {
            e1.a()
        });
        obj = sqlitedatabase;
        try
        {
            sqlitedatabase.insert("WAIT_ACTIVATION_APP", null, contentvalues);
            break MISSING_BLOCK_LABEL_273;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            list = sqlitedatabase;
        }
        finally { }
_L8:
        j.b("Ad_SDK", "insert wait activation app data Exception!", ((Throwable) (obj)));
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
_L4:
        obj = sqlitedatabase;
        l = e1.b().longValue();
          goto _L5
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
          goto _L8
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
