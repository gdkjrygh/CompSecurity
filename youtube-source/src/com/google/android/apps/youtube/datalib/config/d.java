// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.config;

import android.content.ContentResolver;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.gsf.f;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.datalib.config:
//            c

public final class d
    implements com.google.android.apps.youtube.datalib.config.c
{

    private final ContentResolver a;

    public d(ContentResolver contentresolver)
    {
        a = (ContentResolver)com.google.android.apps.youtube.common.fromguava.c.a(contentresolver);
    }

    private final int a(String s, int i)
    {
        return com.google.android.gsf.f.a(a, (new StringBuilder("youtube:")).append(s).toString(), i);
    }

    public final int a()
    {
        return a("offline_http_max_queue_size", 1000);
    }

    public final long b()
    {
        long l = TimeUnit.DAYS.toHours(30L);
        return com.google.android.gsf.f.a(a, (new StringBuilder("youtube:")).append("offline_http_max_age_days").toString(), l);
    }

    public final int c()
    {
        return a("offline_http_batch_size", 100);
    }

    public final int d()
    {
        return a("offline_http_report_cap_hours", 24);
    }

    public final int e()
    {
        return a("ping_request_timeout_seconds", 60);
    }

    public final int f()
    {
        return a("offline_dispatch_maximum_errors", 5);
    }

    public final int g()
    {
        return a("offline_retry_backoff_factor", 8);
    }
}
