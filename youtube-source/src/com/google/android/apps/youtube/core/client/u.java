// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.converter.http.HttpMethod;
import com.google.android.apps.youtube.core.converter.http.ad;
import com.google.android.apps.youtube.core.converter.http.dp;
import com.google.android.apps.youtube.core.utils.ai;
import com.google.android.apps.youtube.datalib.config.b;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            m, as

public final class u extends m
    implements as
{

    private final af a;
    private final ai h;
    private final String i;
    private final String j;

    public u(Executor executor, HttpClient httpclient, ai ai1, b b1, String s)
    {
        super(executor, httpclient);
        try
        {
            i = c.a(new String(b1.a(), "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (Executor executor)
        {
            throw new RuntimeException(executor);
        }
        j = c.a(s, "serial cannot be null or empty");
        h = ai1;
        executor = b1.b();
        a = a(new dp(HttpMethod.POST), new ad(executor));
    }

    public final void a(com.google.android.apps.youtube.common.a.b b1)
    {
        Object obj;
        if (h == null)
        {
            obj = "https://www.google.com/youtube/accounts/registerDevice";
        } else
        {
            obj = h.a("https://www.google.com/youtube/accounts/registerDevice");
        }
        obj = Uri.parse(String.format((new StringBuilder()).append(((String) (obj))).append("?developer=%s&serialNumber=%s").toString(), new Object[] {
            i, j
        }));
        a.a(obj, b1);
    }
}
