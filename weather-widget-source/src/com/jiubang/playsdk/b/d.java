// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.b;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.jiubang.playsdk.b:
//            c, e

public class d
{

    private static HandlerThread a;
    private static Handler b;
    private static ExecutorService c = Executors.newCachedThreadPool(new c());

    public static void a(Runnable runnable)
    {
        b.post(runnable);
    }

    static 
    {
        a = new HandlerThread("sdk-handler");
        a.start();
        b = new e(a.getLooper());
    }
}
