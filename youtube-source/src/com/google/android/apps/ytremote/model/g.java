// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.net.Uri;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            YouTubeDevice, AppStatus, SsdpId

public final class g
{

    private AppStatus a;
    private Uri b;
    private String c;
    private boolean d;
    private String e;
    private String f;
    private SsdpId g;

    public g()
    {
    }

    public g(YouTubeDevice youtubedevice)
    {
        c = YouTubeDevice.access$000(youtubedevice);
        e = YouTubeDevice.access$100(youtubedevice);
        f = YouTubeDevice.access$200(youtubedevice);
        g = YouTubeDevice.access$300(youtubedevice);
        b = YouTubeDevice.access$400(youtubedevice);
        d = YouTubeDevice.access$500(youtubedevice);
        a = YouTubeDevice.access$600(youtubedevice);
    }

    static String a(g g1)
    {
        return g1.c;
    }

    static String b(g g1)
    {
        return g1.e;
    }

    static String c(g g1)
    {
        return g1.f;
    }

    static SsdpId d(g g1)
    {
        return g1.g;
    }

    static Uri e(g g1)
    {
        return g1.b;
    }

    static boolean f(g g1)
    {
        return g1.d;
    }

    static AppStatus g(g g1)
    {
        return g1.a;
    }

    public final YouTubeDevice a()
    {
        return new YouTubeDevice(this);
    }

    public final g a(Uri uri)
    {
        b = uri;
        return this;
    }

    public final g a(AppStatus appstatus)
    {
        a = appstatus;
        return this;
    }

    public final g a(SsdpId ssdpid)
    {
        g = ssdpid;
        return this;
    }

    public final g a(String s)
    {
        c = s;
        return this;
    }

    public final g a(boolean flag)
    {
        d = flag;
        return this;
    }

    public final g b(String s)
    {
        e = s;
        return this;
    }

    public final g c(String s)
    {
        f = s;
        return this;
    }
}
