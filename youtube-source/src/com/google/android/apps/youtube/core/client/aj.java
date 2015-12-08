// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.cache.l;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.async.i;
import com.google.android.apps.youtube.core.converter.http.bt;
import com.google.android.apps.youtube.core.converter.http.bu;
import com.google.android.apps.youtube.core.converter.http.d;
import com.google.android.apps.youtube.core.converter.http.e;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            m, bq, ak

public final class aj extends m
    implements bq
{

    private final af a;
    private final af h;

    public aj(Executor executor, String s, b b, HttpClient httpclient, String s1, String s2)
    {
        super(executor, httpclient, s, b);
        executor = a(500);
        s = e();
        a = a(new l(a(20), executor, new ak((byte)0)), new i(a(a(s, a(new d(s1, s2), new e()), 0x5265c00L))), 0x6ddd00L);
        h = a(executor, new i(a(a(new bt(s1, s2), new bu()))), 0x6ddd00L);
    }

    public final void a(String s, com.google.android.apps.youtube.common.a.b b)
    {
        a.a(s, b);
    }
}
