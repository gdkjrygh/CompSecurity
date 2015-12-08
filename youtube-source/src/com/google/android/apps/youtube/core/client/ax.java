// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.identity.ai;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.b;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.utils.am;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            ay

public final class ax
{

    private final String a;
    private final String b;
    private final am c = new am();
    private final HttpClient d;
    private final Executor e;
    private final l f;
    private final b g;
    private boolean h;

    public ax(HttpClient httpclient, Executor executor, l l1, b b1, au au1)
    {
        d = (HttpClient)com.google.android.apps.youtube.common.fromguava.c.a(httpclient);
        e = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        f = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        g = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        h = false;
        httpclient = au1.H();
        if (httpclient != null)
        {
            a = (String)((Pair) (httpclient)).first;
            b = (String)((Pair) (httpclient)).second;
            return;
        } else
        {
            a = null;
            b = null;
            return;
        }
    }

    static l a(ax ax1)
    {
        return ax1.f;
    }

    static b b(ax ax1)
    {
        return ax1.g;
    }

    static HttpClient c(ax ax1)
    {
        return ax1.d;
    }

    private void c()
    {
        e.execute(new ay(this));
    }

    public final am a()
    {
        return c;
    }

    public final String b()
    {
        if (h && c.d(a, b))
        {
            c();
        }
        if (h)
        {
            return c.c(a, b);
        } else
        {
            return null;
        }
    }

    public final void onSignIn(ai ai)
    {
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b))
        {
            return;
        } else
        {
            h = true;
            c.a(a, b);
            c();
            return;
        }
    }

    public final void onSignOut(aj aj)
    {
        h = false;
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b))
        {
            return;
        } else
        {
            c.b(a, b);
            return;
        }
    }
}
