// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.appstats;

import android.util.Log;
import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.appstats:
//            ImgCaptureAppStatsClient

class a
    implements AppStatsClientEventLogger
{

    final String a;
    final ImgCaptureAppStatsClient b;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        switch (a[appstatseventidtype.ordinal()])
        {
        default:
            return;

        case 5: // '\005'
            ImgCaptureAppStatsClient.a(b, appstatseventidtype);
            break;
        }
        ImgCaptureAppStatsClient.a(b, a);
        ImgCaptureAppStatsClient.c(b);
        Log.i("ImageCaptureViewAppStatsClient", (new StringBuilder()).append("ImgCaptureAppStatsClient :: APP_STATS_IMG_CAPTURE ").append(ImgCaptureAppStatsClient.b(b)).toString());
    }

    (ImgCaptureAppStatsClient imgcaptureappstatsclient, String s)
    {
        b = imgcaptureappstatsclient;
        a = s;
        super();
    }
}
