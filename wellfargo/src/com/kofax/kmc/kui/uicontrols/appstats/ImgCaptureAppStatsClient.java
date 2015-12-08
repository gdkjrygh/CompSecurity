// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImgCaptureEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;

public class ImgCaptureAppStatsClient extends AppStatsClient
{

    private static final String f = "ImageCaptureViewAppStatsClient";
    int a;
    int b;
    int c;
    int d;
    int e;
    private ImgCaptureEventDao g;
    private AppStatsEventIDType h;
    private String i;
    private int j;
    private AppStatsEventIDType k;

    public ImgCaptureAppStatsClient(AppStatsInstanceType appstatsinstancetype)
    {
        super(appstatsinstancetype);
        g = null;
        h = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
        i = null;
        j = 0;
        a = -1;
        b = -1;
        c = -1;
        d = -1;
        e = -1;
        k = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
    }

    public ImgCaptureAppStatsClient(String s, AppStatsInstanceType appstatsinstancetype, boolean flag)
    {
        super(s, appstatsinstancetype, flag);
        g = null;
        h = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
        i = null;
        j = 0;
        a = -1;
        b = -1;
        c = -1;
        d = -1;
        e = -1;
        k = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
    }

    static AppStatsEventIDType a(ImgCaptureAppStatsClient imgcaptureappstatsclient)
    {
        return imgcaptureappstatsclient.k;
    }

    static AppStatsEventIDType a(ImgCaptureAppStatsClient imgcaptureappstatsclient, AppStatsEventIDType appstatseventidtype)
    {
        imgcaptureappstatsclient.h = appstatseventidtype;
        return appstatseventidtype;
    }

    static String a(ImgCaptureAppStatsClient imgcaptureappstatsclient, String s)
    {
        imgcaptureappstatsclient.i = s;
        return s;
    }

    private void a()
    {
        g = new ImgCaptureEventDao();
        g.setInstanceId(instanceId);
        g.setEventType(h);
        g.setEventTime(asFriend.currentEventTime());
        g.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        g.setValue(j);
        g.setImageID(i);
        g.setSessionKey(g.getAppStatsSessionKey());
        logAppStats(new AppStatsDao[] {
            g
        });
    }

    static int b(ImgCaptureAppStatsClient imgcaptureappstatsclient)
    {
        return imgcaptureappstatsclient.j;
    }

    private void b()
    {
        mapEventThrottleTime(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_FOCUS, 500);
        mapEventThrottleTime(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_PAGEDETECT, 500);
        mapEventThrottleTime(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_LEVELNESS, 500);
        mapEventThrottleTime(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_STABILITY, 500);
    }

    static void c(ImgCaptureAppStatsClient imgcaptureappstatsclient)
    {
        imgcaptureappstatsclient.a();
    }

    protected AppStatsEventIDType getEventId()
    {
        return h;
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls1());
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, String s)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls2(s));
    }

    public void setEventValue(int l)
    {
        j = l;
    }

    private class _cls1
        implements AppStatsClientEventLogger
    {

        final ImgCaptureAppStatsClient a;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            ImgCaptureAppStatsClient.a(a, null);
            _cls3.a[appstatseventidtype.ordinal()];
            JVM INSTR tableswitch 1 4: default 48
        //                       1 49
        //                       2 108
        //                       3 167
        //                       4 257;
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

        _cls1()
        {
            a = ImgCaptureAppStatsClient.this;
            super();
        }

        private class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[AppStatsEventIDType.values().length];
                try
                {
                    a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_FOCUS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_PAGEDETECT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_LEVELNESS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_STABILITY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_IMG_CAPTURE_EVENT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls2
        implements AppStatsClientEventLogger
    {

        final String a;
        final ImgCaptureAppStatsClient b;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls3.a[appstatseventidtype.ordinal()])
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

        _cls2(String s)
        {
            b = ImgCaptureAppStatsClient.this;
            a = s;
            super();
        }
    }

}
