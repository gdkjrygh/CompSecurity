// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.b;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.e.t;
import java.util.Map;

// Referenced classes of package com.jiubang.commerce.b:
//            a, h, g

public class f extends a
{

    public static int c = -1;

    protected static int a(String s)
    {
        com/jiubang/commerce/b/f;
        JVM INSTR monitorenter ;
        int i = c;
        com/jiubang/commerce/b/f;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s;
    }

    public static void a(Context context, int i, String s, String s1, int j, String s2, String s3, String s4, 
            String s5, String s6, String s7)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        } else
        {
            (new Thread(new h(t.i(), i, s1, s, j, s2, s3, s4, s5, s6, s7, context))).start();
            return;
        }
    }

    public static void a(Context context, String s, String s1, int i, String s2, String s3, String s4, String s5, 
            String s6, String s7)
    {
        a(context, a(s1), s, s1, i, s2, s3, s4, s5, s6, s7);
    }

    public static boolean c(Context context, String s)
    {
        boolean flag1 = true;
        boolean flag;
        if (TextUtils.isEmpty(s))
        {
            flag = false;
        } else
        if (b(context, s, String.valueOf(105)) && a != null && !TextUtils.isEmpty((CharSequence)a.get(Integer.valueOf(1))))
        {
            flag = flag1;
            if (!TextUtils.isEmpty((CharSequence)a.get(Integer.valueOf(10))))
            {
                long l;
                try
                {
                    l = Long.parseLong((String)a.get(Integer.valueOf(10)));
                }
                catch (Exception exception)
                {
                    l = -1L;
                }
                flag = flag1;
                if (System.currentTimeMillis() - l <= 0x1b7740L)
                {
                    String s1 = (String)a.get(Integer.valueOf(1));
                    String s2 = (String)a.get(Integer.valueOf(3));
                    String s3 = (String)a.get(Integer.valueOf(4));
                    String s4 = (String)a.get(Integer.valueOf(5));
                    String s5 = (String)a.get(Integer.valueOf(6));
                    if (!TextUtils.isEmpty((CharSequence)a.get(Integer.valueOf(7))))
                    {
                        s = (String)a.get(Integer.valueOf(7));
                    }
                    a(context, s1, s2, 1, s3, s4, s5, s, (String)a.get(Integer.valueOf(8)), (String)a.get(Integer.valueOf(9)));
                    flag = flag1;
                    if (!TextUtils.isEmpty((String)a.get(Integer.valueOf(11))))
                    {
                        d(context, (String)a.get(Integer.valueOf(11)));
                        return true;
                    }
                }
            }
        } else
        {
            return false;
        }
        return flag;
    }

    public static void d(Context context, String s)
    {
        if (context == null || TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            (new g("upload_request_url", s, context)).start();
            return;
        }
    }

}
