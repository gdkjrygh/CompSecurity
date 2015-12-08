// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.common.csi.lib:
//            a, d, c

public final class f
{

    private static d a;

    public static c a()
    {
        com/google/android/apps/common/csi/lib/f;
        JVM INSTR monitorenter ;
        d d1;
        if (a == null)
        {
            b(new a());
        }
        d1 = a;
        com/google/android/apps/common/csi/lib/f;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("configuration can't be null");
        } else
        {
            b(a1);
            return;
        }
    }

    private static void b(a a1)
    {
        com/google/android/apps/common/csi/lib/f;
        JVM INSTR monitorenter ;
        d d1 = new d(a1.c(), a1.b(), String.valueOf(a1.a()), a1.i(), a1.d(), a1.e(), a1.f());
        a = d1;
        d1.a(a1.g());
        java.util.Map.Entry entry;
        for (a1 = a1.h().entrySet().iterator(); a1.hasNext(); a.a((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)a1.next();
        }

        break MISSING_BLOCK_LABEL_121;
        a1;
        throw a1;
        com/google/android/apps/common/csi/lib/f;
        JVM INSTR monitorexit ;
    }
}
