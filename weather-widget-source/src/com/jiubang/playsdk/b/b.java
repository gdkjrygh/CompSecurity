// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.b;

import android.util.Log;

// Referenced classes of package com.jiubang.playsdk.b:
//            a

class b
    implements Thread.UncaughtExceptionHandler
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Log.w("KittyPlayThread", (new StringBuilder()).append("ThreadName: ").append(thread.getName()).toString(), throwable);
    }
}
