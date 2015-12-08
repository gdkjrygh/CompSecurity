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

    final ImgCaptureAppStatsClient a;

    public void logEvent(AppStatsEventIDType appstatseventidtype)
    {
        ImgCaptureAppStatsClient.a(a, null);
        a[appstatseventidtype.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 49
    //                   2 108
    //                   3 167
    //                   4 257;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        ImgCaptureAppStatsClient.a(a, appstatseventidtype);
        if (ImgCaptureAppStatsClient.a(a) != appstatseventidtype && a.c != ImgCaptureAppStatsClient.b(a))
        {
            ImgCaptureAppStatsClient.c(a);
            a.c = ImgCaptureAppStatsClient.b(a);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        ImgCaptureAppStatsClient.a(a, appstatseventidtype);
        if (ImgCaptureAppStatsClient.a(a) != appstatseventidtype && a.e != ImgCaptureAppStatsClient.b(a))
        {
            ImgCaptureAppStatsClient.c(a);
            a.e = ImgCaptureAppStatsClient.b(a);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        ImgCaptureAppStatsClient.a(a, appstatseventidtype);
        if (ImgCaptureAppStatsClient.a(a) != appstatseventidtype && a.a != ImgCaptureAppStatsClient.b(a))
        {
            Log.i("ImageCaptureViewAppStatsClient", (new StringBuilder()).append("------ImgCaptureAppStatsClient :: APP_STATS_IMG_CAPTURE_LEVELNESS event = ").append(ImgCaptureAppStatsClient.b(a)).toString());
            ImgCaptureAppStatsClient.c(a);
            a.a = ImgCaptureAppStatsClient.b(a);
            return;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        ImgCaptureAppStatsClient.a(a, appstatseventidtype);
        if (ImgCaptureAppStatsClient.a(a) != appstatseventidtype && a.b != ImgCaptureAppStatsClient.b(a))
        {
            ImgCaptureAppStatsClient.c(a);
            a.b = ImgCaptureAppStatsClient.b(a);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    (ImgCaptureAppStatsClient imgcaptureappstatsclient)
    {
        a = imgcaptureappstatsclient;
        super();
    }
}
