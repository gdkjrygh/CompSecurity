// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.b;

import android.content.Context;
import android.os.Process;
import com.gau.go.a.e;
import com.jiubang.commerce.utils.j;

final class g extends Thread
{

    final String a;
    final Context b;

    g(String s, String s1, Context context)
    {
        a = s1;
        b = context;
        super(s);
    }

    public void run()
    {
        Process.setThreadPriority(10);
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("Statistic.uploadRequestUrl(").append(a).append(")").toString());
        }
        e.a(b).b(a);
    }
}
