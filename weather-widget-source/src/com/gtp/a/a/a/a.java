// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.a.a.a;

import android.text.format.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gtp.a.a.a:
//            b

public class a
{

    private static a c = new a();
    private final ExecutorService a = Executors.newFixedThreadPool(1);
    private final Time b = new Time();

    private a()
    {
    }

    static Time a(a a1)
    {
        return a1.b;
    }

    public static a a()
    {
        return c;
    }

    public void a(String s)
    {
        a.execute(new b(this, s, "runtime_log.txt"));
    }

    public void a(String s, String s1)
    {
        a.execute(new b(this, s, s1));
    }

}
