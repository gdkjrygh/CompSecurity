// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.e;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;

public class h
{

    public static String a(Context context, int i)
    {
        context = context.getContentResolver();
        Object obj;
        obj = (new StringBuilder()).append("widget_id=").append(i).toString();
        obj = context.query(WeatherContentProvider.i, null, ((String) (obj)), null, null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        context = ((Context) (obj));
        if (((Cursor) (obj)).getCount() != 0) goto _L3; else goto _L2
_L2:
        Object obj1;
        obj1 = "";
        context = ((Context) (obj1));
        if (obj == null) goto _L5; else goto _L4
_L4:
        context = ((Context) (obj1));
_L9:
        ((Cursor) (obj)).close();
_L5:
        return context;
_L3:
        context = ((Context) (obj));
        ((Cursor) (obj)).moveToFirst();
        context = ((Context) (obj));
        obj1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("widget_theme"));
        context = ((Context) (obj));
        if (!TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L7; else goto _L6
_L6:
        obj1 = "";
        context = ((Context) (obj1));
        if (obj == null) goto _L5; else goto _L8
_L8:
        context = ((Context) (obj1));
          goto _L9
        obj1;
        obj = null;
_L13:
        context = ((Context) (obj));
        ((Exception) (obj1)).printStackTrace();
        obj1 = "";
        context = ((Context) (obj1));
        if (obj == null) goto _L5; else goto _L10
_L10:
        context = ((Context) (obj1));
          goto _L9
        obj;
        context = null;
_L12:
        if (context != null)
        {
            context.close();
        }
        throw obj;
_L7:
        context = ((Context) (obj1));
        if (obj == null) goto _L5; else goto _L11
_L11:
        context = ((Context) (obj1));
          goto _L9
        obj;
          goto _L12
        obj1;
          goto _L13
    }

    public static boolean a(Context context, int i, String s)
    {
        ContentResolver contentresolver;
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        contentresolver = context.getContentResolver();
        Cursor cursor;
        Object obj;
        obj = (new StringBuilder()).append("widget_id=").append(i).toString();
        cursor = contentresolver.query(WeatherContentProvider.i, null, ((String) (obj)), null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        context = cursor;
        if (cursor.getCount() != 0)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        context = cursor;
        obj = new ContentValues();
        context = cursor;
        ((ContentValues) (obj)).put("widget_id", Integer.valueOf(i));
        context = cursor;
        ((ContentValues) (obj)).put("widget_theme", s);
        context = cursor;
        s = contentresolver.insert(WeatherContentProvider.i, ((ContentValues) (obj)));
        if (s != null)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            return true;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return false;
        context = cursor;
        ContentValues contentvalues = new ContentValues();
        context = cursor;
        contentvalues.put("widget_theme", s);
        context = cursor;
        i = contentresolver.update(WeatherContentProvider.i, contentvalues, ((String) (obj)), null);
        if (i > 0)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            return true;
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return false;
        s;
        cursor = null;
_L4:
        context = cursor;
        s.printStackTrace();
        if (cursor != null)
        {
            cursor.close();
        }
        return false;
        s;
        context = null;
_L2:
        if (context != null)
        {
            context.close();
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean b(Context context, int i)
    {
        ContentResolver contentresolver;
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        contentresolver = context.getContentResolver();
        context = (new StringBuilder()).append("widget_id=").append(i).toString();
        i = contentresolver.delete(WeatherContentProvider.i, context, null);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        flag = true;
        flag1 = true;
        if (true) goto _L4; else goto _L3
_L3:
        flag = flag1;
_L8:
        throw new NullPointerException();
_L4:
        return flag;
        context;
        context.printStackTrace();
        if (true) goto _L4; else goto _L5
_L5:
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        context;
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            throw context;
        }
_L2:
        if (true) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
