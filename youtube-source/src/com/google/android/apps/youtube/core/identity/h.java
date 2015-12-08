// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.async.u;
import com.google.android.apps.youtube.core.converter.http.HttpMethod;
import com.google.android.apps.youtube.core.converter.http.ao;
import com.google.android.apps.youtube.core.converter.http.bv;
import com.google.android.apps.youtube.core.converter.http.dx;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.core.utils.ai;
import com.google.android.apps.youtube.datalib.a.p;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            b, k, f, i, 
//            j

public final class h
{

    private final af a;
    private final af b;
    private final GDataRequestFactory c;
    private final Executor d;
    private final com.google.android.apps.youtube.core.identity.b e;

    protected h()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
    }

    public h(GDataRequestFactory gdatarequestfactory, HttpClient httpclient, Executor executor, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, List list, com.google.android.apps.youtube.core.identity.b b1, ai ai, 
            n n)
    {
        c = (GDataRequestFactory)com.google.android.apps.youtube.common.fromguava.c.a(gdatarequestfactory);
        com.google.android.apps.youtube.common.fromguava.c.a(httpclient);
        d = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        com.google.android.apps.youtube.common.fromguava.c.a(deviceauthorizerforv2apis);
        com.google.android.apps.youtube.common.fromguava.c.a(list);
        e = (com.google.android.apps.youtube.core.identity.b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        com.google.android.apps.youtube.common.fromguava.c.a(ai);
        com.google.android.apps.youtube.common.fromguava.c.a(n);
        for (gdatarequestfactory = list.iterator(); gdatarequestfactory.hasNext();)
        {
            if ((p)gdatarequestfactory.next() instanceof k)
            {
                throw new IllegalArgumentException("IdentityClient must not have an authentication header decorator");
            }
        }

        gdatarequestfactory = ao.a(HttpMethod.GET, deviceauthorizerforv2apis, list, ai, com.google.android.apps.youtube.core.async.GDataRequest.Version.V_2_1);
        a = new u(httpclient, gdatarequestfactory, new bv(n));
        b = new u(httpclient, gdatarequestfactory, new dx(n));
    }

    static com.google.android.apps.youtube.core.identity.b a(h h1)
    {
        return h1.e;
    }

    static GDataRequestFactory b(h h1)
    {
        return h1.c;
    }

    static af c(h h1)
    {
        return h1.a;
    }

    static af d(h h1)
    {
        return h1.b;
    }

    final void a(f f1, b b1)
    {
        boolean flag;
        if (!f1.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag);
        d.execute(new i(this, f1, b1));
    }

    final void b(f f1, b b1)
    {
        d.execute(new j(this, f1, b1));
    }
}
