// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.app.remote;

import android.support.v7.media.MediaRouteProviderService;
import android.support.v7.media.f;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.remote.ad;
import com.google.android.apps.youtube.app.remote.bk;

public class YouTubeTvRouteProviderService extends MediaRouteProviderService
{

    private f a;
    private ax b;

    public YouTubeTvRouteProviderService()
    {
    }

    public final f a()
    {
        if (a == null)
        {
            Object obj = bk.a(b.aP(), "exported_remote_id");
            obj = new bk(getApplicationContext(), b.aX(), b.aP(), b.aV(), b.aT(), b.aR(), b.aJ(), b.f(), b.b().h(), b.b().i(), b.b().j(), b.b().k(), b.Y(), false, ((String) (obj)));
            a = new ad(getApplicationContext(), b.Q(), ((bk) (obj)), b.aJ());
        }
        return a;
    }

    public void onCreate()
    {
        super.onCreate();
        b = ((YouTubeApplication)getApplication()).d();
    }
}
