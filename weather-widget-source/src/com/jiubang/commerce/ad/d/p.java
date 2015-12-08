// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.b.a.a;
import com.jiubang.commerce.ad.b.a.e;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.ah;
import com.jiubang.commerce.utils.j;
import java.util.Calendar;

public class p
{

    public static int a(Context context, b b1)
    {
        context = context.getSharedPreferences("intelligent_business", 0);
        long l = context.getLong("time", 0L);
        int i = context.getInt("num", -1);
        if (l <= 0L)
        {
            i = a(b1);
        } else
        if (a(l))
        {
            return a(b1);
        }
        return i;
    }

    private static int a(b b1)
    {
        if (b1 != null) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        int i;
        if (ah.a().b())
        {
            i = b1.i().b();
            break; /* Loop/switch isn't completed */
        }
        try
        {
            i = b1.g().e().a();
            break; /* Loop/switch isn't completed */
        }
        catch (Exception exception)
        {
            if (b1 != null)
            {
                i = b1.a();
            } else
            {
                i = -1;
            }
            if (j.a)
            {
                j.a("IntelligentPreloadService", (new StringBuilder()).append("[vmId:").append(i).append("]getNumFromBean Exception:").toString(), exception);
                return -1;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        return i;
    }

    public static boolean a(long l)
    {
        boolean flag = false;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long l1 = calendar.getTimeInMillis();
        calendar.setTimeInMillis(l);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (Math.abs(l1 - calendar.getTimeInMillis()) >= 0x5265c00L)
        {
            flag = true;
        }
        return flag;
    }

    public static int b(Context context, b b1)
    {
        context = context.getSharedPreferences("new_intelligent_business", 0);
        long l = context.getLong("time", 0L);
        int i = context.getInt("num", -1);
        if (l <= 0L)
        {
            i = a(b1);
        } else
        if (a(l))
        {
            return a(b1);
        }
        return i;
    }
}
