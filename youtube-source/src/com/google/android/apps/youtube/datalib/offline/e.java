// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.offline;

import com.google.android.apps.youtube.a.a.c;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.database.d;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.youtube.datalib.offline:
//            a

final class e
    implements Runnable
{

    final c a;
    final a b;

    e(a a1, c c1)
    {
        b = a1;
        a = c1;
        super();
    }

    public final void run()
    {
        com.google.android.apps.youtube.datalib.offline.a.b(b).a();
        L.e(String.format(Locale.US, "Requeue request with %d errors to %s", new Object[] {
            Integer.valueOf(a.m()), a.d()
        }));
        com.google.android.apps.youtube.datalib.offline.a.b(b).a(a.a(), a);
        com.google.android.apps.youtube.datalib.offline.a.b(b).c();
        com.google.android.apps.youtube.datalib.offline.a.b(b).b();
        return;
        Exception exception;
        exception;
        com.google.android.apps.youtube.datalib.offline.a.b(b).b();
        throw exception;
    }
}
