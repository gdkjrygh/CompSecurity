// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.u;
import com.google.android.apps.youtube.core.converter.http.a;
import com.google.android.apps.youtube.core.converter.http.ay;
import com.google.android.apps.youtube.core.converter.http.el;
import com.google.android.apps.youtube.core.converter.http.gs;
import com.google.android.apps.youtube.core.converter.n;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            m

public final class k extends m
{

    public k(Executor executor, HttpClient httpclient, n n, b b)
    {
        super(executor, httpclient, n, b);
    }

    public final u a(a a1, el el)
    {
        return a((com.google.android.apps.youtube.core.converter.c)c.a(a1), (ay)c.a(el));
    }

    public final u a(com.google.android.apps.youtube.core.converter.http.b b, gs gs)
    {
        return a((com.google.android.apps.youtube.core.converter.c)c.a(b), (ay)c.a(gs));
    }
}
