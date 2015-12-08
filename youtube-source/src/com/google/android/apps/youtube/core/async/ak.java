// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.cache.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.http.ac;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, al, u, b, 
//            an, am

public final class ak
    implements af
{

    private final af a;
    private final af b;
    private volatile boolean c;

    private ak(af af1, af af2)
    {
        a = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        b = (af)com.google.android.apps.youtube.common.fromguava.c.a(af2);
    }

    static af a(ak ak1)
    {
        return ak1.b;
    }

    public static af a(HttpClient httpclient, Executor executor, com.google.android.apps.youtube.common.e.b b1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(httpclient);
        com.google.android.apps.youtube.common.fromguava.c.a(executor);
        ac ac1 = new ac();
        al al1 = new al((byte)0);
        httpclient = com.google.android.apps.youtube.core.async.b.a(executor, new ak(new u(httpclient, ac1, ac1), new u(httpclient, al1, al1)));
        return an.a(new b(100), httpclient, b1, 0x1b7740L);
    }

    static boolean a(ak ak1, boolean flag)
    {
        ak1.c = true;
        return true;
    }

    public final void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        obj = (Uri)obj;
        if (!c)
        {
            a.a(obj, new am(this, b1, true));
            return;
        } else
        {
            b.a(obj, new am(this, b1, false));
            return;
        }
    }
}
