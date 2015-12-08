// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.c;

import android.content.Context;
import android.text.ClipboardManager;
import android.text.TextUtils;
import com.gtp.a.a.c.c;
import com.gtp.go.weather.sharephoto.d.h;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class a
{

    public static final String a = (new StringBuilder()).append(com.gtp.a.a.c.c.a()).append("/download/coupons").toString();

    public static String a(Context context, String s, long l, String s1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("couponId", String.valueOf(l)));
        arraylist.add(new BasicNameValuePair("email", s1));
        return b(context, s, arraylist, 0, 0);
    }

    public static String a(Context context, String s, String s1, int i)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("phead", s1));
        arraylist.add(new BasicNameValuePair("pageNum", (new StringBuilder()).append(i).append("").toString()));
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
        if (!((com.jiubang.goweather.b.c) (obj)).a(f1, context))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        context = ((com.jiubang.goweather.b.c) (obj)).a(s, e1, f1);
        list = obj1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        list = com.jiubang.goweather.e.a.a(context, "UTF-8");
_L5:
        ((com.jiubang.goweather.b.c) (obj)).a();
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

    public static String a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            s = h.a(s);
            return (new StringBuilder(a)).append(File.separator).append(s).append(".png").toString();
        }
    }

    public static void a(Context context, String s)
    {
        ((ClipboardManager)context.getSystemService("clipboard")).setText(s.trim());
    }

    public static boolean a(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long l;
            long l1;
            try
            {
                l = simpledateformat.parse(s).getTime();
                l1 = simpledateformat.parse(s1).getTime();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return false;
            }
            if (l < l1)
            {
                return true;
            }
        }
        return false;
    }

    public static String b(Context context, String s, List list, int i, int j)
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
        e1.a(true);
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
        if (!((com.jiubang.goweather.b.c) (obj)).a(f1, context))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        context = ((com.jiubang.goweather.b.c) (obj)).a(s, e1, f1);
        list = obj1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        list = com.jiubang.goweather.e.a.a(context, "UTF-8");
_L5:
        ((com.jiubang.goweather.b.c) (obj)).a();
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

    public static boolean b(String s)
    {
        return !TextUtils.isEmpty(s) && s.matches("^[^(@|\\.|\\+|\\s)][\\S^@]*[^(\\.|\\+|\\s|@)]{1}@[^(\\.|\\s|@)]{1}[\\S^@]*$");
    }

    public static boolean c(String s)
    {
        if (s != null && !s.equals(""))
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            long l;
            long l1;
            try
            {
                l = simpledateformat.parse(s).getTime();
                l1 = System.currentTimeMillis();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return false;
            }
            if (l < l1)
            {
                return true;
            }
        }
        return false;
    }

}
