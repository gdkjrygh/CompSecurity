// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImageDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

// Referenced classes of package com.kofax.kmc.ken.engines.appstats:
//            AppStatsImageData

public class ImageAppStatsClient extends AppStatsClient
{

    private static final String a = "ImageAppStatsClient";
    private ImageDao b;

    public ImageAppStatsClient()
    {
    }

    private void a(AppStatsImageData appstatsimagedata)
    {
        b = new ImageDao();
        b.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
        b.setDocumentId(appstatsimagedata.getDocumentID());
        b.setId(appstatsimagedata.getImageID());
        b.setEventTime(appstatsimagedata.getCreation());
        b.setFileSize((int)appstatsimagedata.getFileSize());
        b.setSource(appstatsimagedata.getSource());
        b.setSessionKey(b.getAppStatsSessionKey());
        logAppStats(new AppStatsDao[] {
            b
        });
    }

    static void a(ImageAppStatsClient imageappstatsclient, AppStatsImageData appstatsimagedata)
    {
        imageappstatsclient.a(appstatsimagedata);
    }

    static void a(ImageAppStatsClient imageappstatsclient, AppStatsEventIDType appstatseventidtype)
    {
        imageappstatsclient.setEventId(appstatseventidtype);
    }

    static void b(ImageAppStatsClient imageappstatsclient, AppStatsEventIDType appstatseventidtype)
    {
        imageappstatsclient.setEventId(appstatseventidtype);
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, AppStatsImageData appstatsimagedata)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls1(appstatsimagedata));
    }

    protected void logAppStatsImageStartEvent(AppStatsImageData appstatsimagedata)
    {
        b = new ImageDao();
        b.setId(appstatsimagedata.getImageID());
        b.setEventTime(asFriend.currentEventTime());
        b.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        b.setFileSize((int)appstatsimagedata.getFileSize());
        b.setSource(appstatsimagedata.getSource());
        b.setSessionKey(b.getAppStatsSessionKey());
        logAppStats(new AppStatsDao[] {
            b
        });
    }

    private class _cls1
        implements AppStatsClientEventLogger
    {

        final AppStatsImageData a;
        final ImageAppStatsClient b;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls2.a[appstatseventidtype.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                ImageAppStatsClient.a(b, appstatseventidtype);
                b.logAppStatsImageStartEvent(a);
                return;

            case 2: // '\002'
                ImageAppStatsClient.b(b, appstatseventidtype);
                break;
            }
            ImageAppStatsClient.a(b, a);
        }

        _cls1(AppStatsImageData appstatsimagedata)
        {
            b = ImageAppStatsClient.this;
            a = appstatsimagedata;
            super();
        }

        private class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[AppStatsEventIDType.values().length];
                try
                {
                    a[AppStatsEventIDType.APP_STATS_IMAGE_CREATED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_IMAGE_ADD_TO_DOCUMENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }

}
