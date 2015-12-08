// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import com.jiubang.commerce.a.a;
import java.io.File;
import java.util.Random;

// Referenced classes of package com.jiubang.commerce.utils:
//            l, f

class r
{

    private final String a = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append("/air/as/statistics/deviceId").append(".txt").toString();

    r()
    {
    }

    private String a()
    {
        return a(a);
    }

    private String a(String s)
    {
        if (!com.jiubang.commerce.utils.l.a())
        {
            break MISSING_BLOCK_LABEL_25;
        }
        s = new String(com.jiubang.commerce.utils.f.a(s));
        return s;
        s;
        s.printStackTrace();
        return null;
    }

    private void a(Context context, String s)
    {
        context = new a(context, "commerce_ad_phead_share", 0);
        context.b("random_device_id", s);
        context.a();
    }

    private void a(String s, String s1)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        if (com.jiubang.commerce.utils.l.a())
        {
            com.jiubang.commerce.utils.f.a(s.getBytes(), s1);
        }
        return;
        s;
        s.printStackTrace();
        return;
    }

    private String b(Context context)
    {
        return (new a(context, "commerce_ad_phead_share", 0)).a("random_device_id", "0000000000000000");
    }

    private void b(String s)
    {
        a(s, a);
    }

    public String a(Context context)
    {
        String s1 = b(context);
        if (s1 == null || !s1.equals("0000000000000000")) goto _L2; else goto _L1
_L1:
        String s;
        s1 = a();
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        s = s1;
        long l2 = SystemClock.elapsedRealtime();
        s = s1;
        Random random = new Random();
        s = s1;
        long l1 = random.nextLong();
_L4:
        if (l1 != 0x8000000000000000L)
        {
            break; /* Loop/switch isn't completed */
        }
        s = s1;
        l1 = random.nextLong();
        if (true) goto _L4; else goto _L3
_L3:
        s = s1;
        s1 = String.valueOf(Math.abs(l1) + l2);
        s = s1;
        b(s1);
        s = s1;
        a(context, s);
_L6:
        return s;
        context;
_L7:
        context.printStackTrace();
        return s;
_L2:
        s = s1;
        if (a() != null) goto _L6; else goto _L5
_L5:
        b(s1);
        return s1;
        context;
          goto _L7
    }
}
