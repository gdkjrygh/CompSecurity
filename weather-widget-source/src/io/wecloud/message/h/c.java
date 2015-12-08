// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.h;

import android.database.Cursor;
import android.database.SQLException;

public class c
{

    public static int a(Cursor cursor, String s)
    {
        if (cursor == null || s == null || s.length() <= 0)
        {
            throw new SQLException("params err");
        }
        int i = cursor.getColumnIndex(s);
        if (i < 0)
        {
            throw new SQLException("key not exist");
        } else
        {
            return cursor.getInt(i);
        }
    }

    public static String b(Cursor cursor, String s)
    {
        if (cursor == null || s == null || s.length() <= 0)
        {
            throw new SQLException("params err");
        }
        int i = cursor.getColumnIndex(s);
        if (i < 0)
        {
            throw new SQLException("key not exist");
        } else
        {
            return cursor.getString(i);
        }
    }

    public static long c(Cursor cursor, String s)
    {
        if (cursor == null || s == null || s.length() <= 0)
        {
            throw new SQLException("params err");
        }
        int i = cursor.getColumnIndex(s);
        if (i < 0)
        {
            throw new SQLException("key not exist");
        } else
        {
            return cursor.getLong(i);
        }
    }
}
