// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            x, b, a, f, 
//            g

public final class e
{

    private static final String a = com/paypal/android/sdk/onetouch/core/e.getSimpleName();
    private static x b;

    public e()
    {
    }

    static x a()
    {
        return b;
    }

    public static final String a(ExecutorService executorservice, Context context, b b1, String s)
    {
        com/paypal/android/sdk/onetouch/core/e;
        JVM INSTR monitorenter ;
        x x1 = b;
        if (x1 != null) goto _L2; else goto _L1
_L1:
        x x2 = x.a();
        b = x2;
        context = x2.a(context, b1.d(), a.b, s, null, false, null, null);
        executorservice.submit(new f());
        (new StringBuilder("Init risk component: ")).append(x.c()).append(" returning new clientMetadataId:").append(context);
        executorservice = context;
_L4:
        com/paypal/android/sdk/onetouch/core/e;
        JVM INSTR monitorexit ;
        return executorservice;
        executorservice;
        Log.e("paypal.sdk", (new StringBuilder("An internal component failed to initialize: ")).append(executorservice.getMessage()).toString());
        executorservice = null;
        continue; /* Loop/switch isn't completed */
_L2:
        executorservice = b.f();
        (new StringBuilder("risk component already initialized, returning new clientMetadataId:")).append(executorservice);
        if (true) goto _L4; else goto _L3
_L3:
        executorservice;
        throw executorservice;
    }

    public static final String a(ExecutorService executorservice, Context context, b b1, String s, String s1)
    {
        com/paypal/android/sdk/onetouch/core/e;
        JVM INSTR monitorenter ;
        x x1 = b;
        if (x1 != null) goto _L2; else goto _L1
_L1:
        x x2 = x.a();
        b = x2;
        context = x2.a(context, b1.d(), a.b, s, null, false, s1, null);
        executorservice.submit(new g());
        (new StringBuilder("Init risk component: ")).append(x.c()).append(" returning new clientMetadataId: ").append(context);
        executorservice = context;
_L3:
        com/paypal/android/sdk/onetouch/core/e;
        JVM INSTR monitorexit ;
        return executorservice;
        executorservice;
        Log.e("paypal.sdk", (new StringBuilder("An internal component failed to initialize: ")).append(executorservice.getMessage()).toString());
        executorservice = null;
          goto _L3
_L2:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        executorservice = b.a(s1);
_L4:
        (new StringBuilder("risk component already initialized, returning new clientMetadataId: ")).append(executorservice);
          goto _L3
        executorservice;
        throw executorservice;
        executorservice = b.f();
          goto _L4
    }

}
