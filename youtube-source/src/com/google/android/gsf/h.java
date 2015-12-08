// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.HashMap;

// Referenced classes of package com.google.android.gsf:
//            f, g

final class h extends ContentObserver
{

    final g a;

    h(g g1, Handler handler)
    {
        a = g1;
        super(handler);
    }

    public final void onChange(boolean flag)
    {
        com/google/android/gsf/f;
        JVM INSTR monitorenter ;
        f.a().clear();
        f.a(new Object());
        if (f.b().length > 0)
        {
            f.b(a.a, f.b());
        }
        com/google/android/gsf/f;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/google/android/gsf/f;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
