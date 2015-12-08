// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import com.google.android.apps.youtube.api.j;
import com.google.android.apps.youtube.api.jar.a.ce;
import com.google.android.apps.youtube.api.jar.a.ch;
import com.google.android.apps.youtube.api.jar.a.ck;
import com.google.android.apps.youtube.api.jar.a.cn;
import com.google.android.apps.youtube.api.jar.a.cq;
import com.google.android.apps.youtube.api.jar.a.ct;
import com.google.android.apps.youtube.api.jar.a.cw;
import com.google.android.apps.youtube.api.jar.a.cz;
import com.google.android.apps.youtube.api.jar.a.dc;
import com.google.android.apps.youtube.api.jar.a.df;
import com.google.android.apps.youtube.api.jar.a.di;
import com.google.android.apps.youtube.api.jar.a.dl;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            am, c, ao

public final class b extends am
{

    private final Context a;
    private final Handler b;
    private final com.google.android.youtube.api.service.c c;
    private final j d;

    public b(Context context, Handler handler, com.google.android.youtube.api.service.c c1, j j1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler);
        c = (com.google.android.youtube.api.service.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
        d = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
    }

    static Context a(b b1)
    {
        return b1.a;
    }

    static Handler b(b b1)
    {
        return b1.b;
    }

    static com.google.android.youtube.api.service.c c(b b1)
    {
        return b1.c;
    }

    static j d(b b1)
    {
        return b1.d;
    }

    public final ao a(ck ck, cw cw, dc dc, df df, ct ct, ce ce, di di, 
            ch ch, cn cn, cq cq, cz cz, dl dl, boolean flag)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(ck);
        com.google.android.apps.youtube.common.fromguava.c.a(cw);
        ConditionVariable conditionvariable;
        AtomicReference atomicreference;
        if (!flag)
        {
            com.google.android.apps.youtube.common.fromguava.c.a(dc);
        } else
        {
            com.google.android.apps.youtube.common.fromguava.c.a(df);
        }
        com.google.android.apps.youtube.common.fromguava.c.a(ct);
        com.google.android.apps.youtube.common.fromguava.c.a(ce);
        com.google.android.apps.youtube.common.fromguava.c.a(di);
        com.google.android.apps.youtube.common.fromguava.c.a(ch);
        com.google.android.apps.youtube.common.fromguava.c.a(cn);
        com.google.android.apps.youtube.common.fromguava.c.a(cq);
        com.google.android.apps.youtube.common.fromguava.c.a(cz);
        com.google.android.apps.youtube.common.fromguava.c.a(dl);
        conditionvariable = new ConditionVariable();
        atomicreference = new AtomicReference();
        b.post(new com.google.android.apps.youtube.api.b.a.c(this, ck, cw, dc, df, ct, ce, di, ch, cn, cq, cz, dl, flag, atomicreference, conditionvariable));
        conditionvariable.block();
        return (ao)atomicreference.get();
    }
}
