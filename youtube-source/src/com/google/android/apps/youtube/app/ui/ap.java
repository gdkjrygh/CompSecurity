// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.innertube.model.Offlineability;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hp

final class ap
    implements hp
{

    private final YouTubeActivity a;
    private final r b;
    private String c;
    private Offlineability d;

    private ap(YouTubeActivity youtubeactivity, r r1)
    {
        a = (YouTubeActivity)com.google.android.apps.youtube.common.fromguava.c.a(youtubeactivity);
        b = (r)com.google.android.apps.youtube.common.fromguava.c.a(r1);
    }

    ap(YouTubeActivity youtubeactivity, r r1, byte byte0)
    {
        this(youtubeactivity, r1);
    }

    static void a(ap ap1, String s, Offlineability offlineability)
    {
        ap1.c = com.google.android.apps.youtube.common.fromguava.c.a(s);
        ap1.d = offlineability;
    }

    public final void a(String s)
    {
        while (!p.a(a) || !s.equals(c)) 
        {
            return;
        }
        b.a(s, d, null);
    }
}
