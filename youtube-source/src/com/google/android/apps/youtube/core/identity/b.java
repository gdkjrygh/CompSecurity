// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.content.Context;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.gms.auth.a;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            as, f, a, c, 
//            l

public final class b
{

    private final Context a;
    private final as b;
    private final Executor c;
    private final String d;
    private volatile String e;

    protected b()
    {
        a = null;
        b = null;
        c = null;
        d = null;
    }

    public b(Context context, as as1, Executor executor, String s)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (as)com.google.android.apps.youtube.common.fromguava.c.a(as1);
        c = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        d = com.google.android.apps.youtube.common.fromguava.c.a(s);
    }

    static Context a(b b1)
    {
        return b1.a;
    }

    static String a(b b1, String s)
    {
        b1.e = s;
        return s;
    }

    static String b(b b1)
    {
        return b1.d;
    }

    final Future a(f f1)
    {
        f1 = f1.b();
        com.google.android.apps.youtube.common.a.c c1 = com.google.android.apps.youtube.common.a.c.a();
        boolean flag;
        if (b.a(f1) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            c1.a(null, com.google.android.apps.youtube.core.identity.a.b(new IllegalStateException("Account removed from device.")));
            return c1;
        } else
        {
            c.execute(new com.google.android.apps.youtube.core.identity.c(this, f1, c1));
            return c1;
        }
    }

    public final Future a(l l1)
    {
        return a(l1.g());
    }

    public final void a()
    {
        String s = e;
        com.google.android.gms.auth.a.a(a, s);
    }
}
