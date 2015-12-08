// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.async.i;
import com.google.android.apps.youtube.core.async.w;
import com.google.android.apps.youtube.core.converter.http.HttpMethod;
import com.google.android.apps.youtube.core.converter.http.bw;
import com.google.android.apps.youtube.core.converter.http.by;
import com.google.android.apps.youtube.core.identity.k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            m, bz

public final class al extends m
    implements bz
{

    private static final Uri a = Uri.parse("https://www.googleapis.com/plus/v1whitelisted/people");
    private final af h;
    private final String i;
    private final k j;

    public al(Executor executor, String s, b b, HttpClient httpclient, String s1, k k)
    {
        super(executor, httpclient, s, b);
        i = s1;
        j = k;
        executor = a(500);
        s = new by();
        b = new ArrayList();
        b.add(j);
        h = a(executor, new i(a(a(new bw(HttpMethod.GET, b), s))), 0x6ddd00L);
    }

    public final void a(com.google.android.apps.youtube.common.a.b b)
    {
        w w1 = new w(a.buildUpon().appendPath("me").appendQueryParameter("fields", "displayName,id,image,url").build(), null, null);
        h.a(w1, b);
    }

}
