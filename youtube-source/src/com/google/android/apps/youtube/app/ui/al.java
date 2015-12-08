// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.utils.m;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab, ba

final class al
    implements ab
{

    final Analytics a;
    final YouTubeActivity b;
    final ba c;

    al(Analytics analytics, YouTubeActivity youtubeactivity, ba ba1)
    {
        a = analytics;
        b = youtubeactivity;
        c = ba1;
        super();
    }

    public final void a(Object obj)
    {
        a.b("Share");
        m.a(b, c.b(obj), p.e(c.c(obj)));
    }
}
