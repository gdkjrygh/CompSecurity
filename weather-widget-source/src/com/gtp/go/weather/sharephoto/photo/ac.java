// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.goweather.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import com.jiubang.goweather.e.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class ac
{

    public static String a(Context context, String s, String s1, String s2, long l)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("phead", s1));
        arraylist.add(new BasicNameValuePair("userId", s2));
        arraylist.add(new BasicNameValuePair("imageId", String.valueOf(l)));
        return a(context, s, ((List) (arraylist)), 10000, 10000);
    }

    public static String a(Context context, String s, String s1, String s2, String s3, int i)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("handle", String.valueOf(0)));
        arraylist.add(new BasicNameValuePair("phead", s1));
        arraylist.add(new BasicNameValuePair("userId", s2));
        arraylist.add(new BasicNameValuePair("pageNum", String.valueOf(i)));
        if (!TextUtils.isEmpty(s3))
        {
            arraylist.add(new BasicNameValuePair("cityId", s3));
        }
        arraylist.add(new BasicNameValuePair("shandle", String.valueOf(0)));
        return a(context, s, ((List) (arraylist)));
    }

    public static String a(Context context, String s, List list)
    {
        return a(context, s, list, 0, 0);
    }

    public static String a(Context context, String s, List list, int i, int j)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = obj2;
        if (list == null) goto _L2; else goto _L1
_L1:
        obj = obj2;
        if (list.isEmpty()) goto _L2; else goto _L3
_L3:
        e e1 = new e(s, "POST");
        e1.a(list);
        f f1 = new f();
        if (i != 0)
        {
            e1.a(i);
        }
        if (j != 0)
        {
            e1.b(j);
        }
        obj = d.a();
        list = obj1;
        if (!((c) (obj)).a(f1, context))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        context = ((c) (obj)).a(s, e1, f1);
        list = obj1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        list = com.jiubang.goweather.e.a.a(context, "UTF-8");
_L5:
        ((c) (obj)).a();
        obj = list;
_L2:
        return ((String) (obj));
        context;
        list = obj1;
        if (com.gtp.a.a.b.c.a())
        {
            context.printStackTrace();
            list = obj1;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
