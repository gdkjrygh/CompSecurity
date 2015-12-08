// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.b;

import android.content.Context;
import android.os.Process;

// Referenced classes of package com.jiubang.commerce.b:
//            a, f

final class h
    implements Runnable
{

    final boolean a;
    final int b;
    final String c;
    final String d;
    final int e;
    final String f;
    final String g;
    final String h;
    final String i;
    final String j;
    final String k;
    final Context l;

    h(boolean flag, int i1, String s, String s1, int j1, String s2, String s3, 
            String s4, String s5, String s6, String s7, Context context)
    {
        a = flag;
        b = i1;
        c = s;
        d = s1;
        e = j1;
        f = s2;
        g = s3;
        h = s4;
        i = s5;
        j = s6;
        k = s7;
        l = context;
        super();
    }

    public void run()
    {
        Process.setThreadPriority(10);
        StringBuffer stringbuffer = new StringBuffer();
        if (a)
        {
            stringbuffer.append(System.currentTimeMillis());
            stringbuffer.append("||");
        }
        int i1;
        if (b > 0)
        {
            i1 = b;
        } else
        {
            i1 = com.jiubang.commerce.b.f.a(c);
        }
        stringbuffer.append(i1);
        stringbuffer.append("||");
        stringbuffer.append(d);
        stringbuffer.append("||");
        stringbuffer.append(c);
        stringbuffer.append("||");
        stringbuffer.append(e);
        stringbuffer.append("||");
        stringbuffer.append(f);
        stringbuffer.append("||");
        stringbuffer.append(g);
        stringbuffer.append("||");
        stringbuffer.append(h);
        stringbuffer.append("||");
        stringbuffer.append(i);
        stringbuffer.append("||");
        stringbuffer.append(j);
        stringbuffer.append("||");
        stringbuffer.append(k);
        com.jiubang.commerce.b.a.a(l, 105, i1, stringbuffer, new Object[0]);
    }
}
