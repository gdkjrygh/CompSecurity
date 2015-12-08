// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import android.content.Context;
import com.jiubang.playsdk.a.y;
import java.util.Random;

// Referenced classes of package com.jiubang.playsdk.f:
//            b, e

public class m
{

    public static final Random a = new Random(System.currentTimeMillis());

    public static String a(Context context)
    {
        return (new StringBuilder()).append(e(context)).append("/recommendedapp/common.do?funid=23&rd=").append(a.nextLong()).toString();
    }

    public static String b(Context context)
    {
        return (new StringBuilder()).append(e(context)).append("/recommendedapp/getconfig.do?&rd=").append(a.nextLong()).toString();
    }

    public static String c(Context context)
    {
        return (new StringBuilder()).append(e(context)).append("/recommendedapp/common.do?funid=2&rd=").append(a.nextLong()).toString();
    }

    public static String d(Context context)
    {
        return (new StringBuilder()).append(e(context)).append("/recommendedapp/manage/managegood.action?rd=").append(a.nextLong()).append("&cid=").append(y.a().e()).toString();
    }

    private static String e(Context context)
    {
        String s = b.a;
        if (!com.jiubang.playsdk.f.e.a(context))
        {
            s = b.c;
        }
        return s;
    }

}
