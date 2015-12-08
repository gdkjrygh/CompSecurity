// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import java.util.Date;

public final class i
{

    public static final Integer a = Integer.valueOf(1);
    public static final Integer b = Integer.valueOf(0);

    public static long a(SQLiteDatabase sqlitedatabase, String s, String s1, String as[])
    {
        if (!TextUtils.isEmpty(s1))
        {
            s1 = (new StringBuilder(" where ")).append(s1).toString();
        } else
        {
            s1 = "";
        }
        return DatabaseUtils.longForQuery(sqlitedatabase, (new StringBuilder("select count(*) from ")).append(s).append(s1).toString(), as);
    }

    public static Integer a(boolean flag)
    {
        if (flag)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public static Long a(Date date)
    {
        if (date != null)
        {
            return Long.valueOf(date.getTime());
        } else
        {
            return null;
        }
    }

    public static String a(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (s != null)
        {
            stringbuilder.append(s).append("__");
        }
        stringbuilder.append(s1);
        return stringbuilder.toString();
    }

    public static transient String a(String s, String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String s1 = as[j];
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(',');
            }
            if (s != null)
            {
                stringbuilder.append(s).append('.');
            }
            stringbuilder.append(s1);
        }

        return stringbuilder.toString();
    }

    public static Date a(Cursor cursor, int j)
    {
        if (!cursor.isNull(j))
        {
            return new Date(cursor.getLong(j));
        } else
        {
            return null;
        }
    }

    public static void a(SQLiteDatabase sqlitedatabase)
    {
        Cursor cursor = sqlitedatabase.query("sqlite_master", new String[] {
            "type", "name"
        }, null, null, null, null, null);
_L1:
        String s;
        String s1;
        do
        {
            if (!cursor.moveToNext())
            {
                break MISSING_BLOCK_LABEL_127;
            }
            s = cursor.getString(0);
            s1 = cursor.getString(1);
        } while ("sqlite_sequence".equals(s1));
        s = (new StringBuilder("DROP ")).append(s).append(" IF EXISTS ").append(s1).toString();
        sqlitedatabase.execSQL(s);
          goto _L1
        SQLException sqlexception;
        sqlexception;
        L.a((new StringBuilder("Error executing ")).append(s).toString(), sqlexception);
          goto _L1
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
        cursor.close();
        return;
    }

    public static boolean a(Cursor cursor, int j, boolean flag)
    {
        if (!cursor.isNull(j))
        {
            return cursor.getInt(j) == 1;
        } else
        {
            return false;
        }
    }

    public static Uri b(Cursor cursor, int j)
    {
        if (!cursor.isNull(j))
        {
            return Uri.parse(cursor.getString(j));
        } else
        {
            return null;
        }
    }

    public static transient String b(String s, String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int k = as.length;
        for (int j = 0; j < k; j++)
        {
            String s1 = as[j];
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(',');
            }
            if (s != null)
            {
                stringbuilder.append(s).append('.');
            }
            stringbuilder.append(s1);
            if (s != null)
            {
                stringbuilder.append(" as ").append(a(s, s1));
            }
        }

        return stringbuilder.toString();
    }

}
