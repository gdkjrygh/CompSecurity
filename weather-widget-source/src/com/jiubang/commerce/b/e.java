// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.b;

import android.content.Context;
import android.os.Process;

// Referenced classes of package com.jiubang.commerce.b:
//            a

final class e
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
    final Context k;

    e(boolean flag, int l, String s, String s1, int i1, String s2, String s3, 
            String s4, String s5, String s6, Context context)
    {
        a = flag;
        b = l;
        c = s;
        d = s1;
        e = i1;
        f = s2;
        g = s3;
        h = s4;
        i = s5;
        j = s6;
        k = context;
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
        stringbuffer.append(b);
        stringbuffer.append("||");
        stringbuffer.append(c);
        stringbuffer.append("||");
        stringbuffer.append(d);
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
        com.jiubang.commerce.b.a.a(k, 101, b, stringbuffer, new Object[0]);
    }
}
