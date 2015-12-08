// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import android.util.Log;
import com.kofax.kmc.kut.utilities.appstats.AppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImageDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImageProcessEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsImageSourceType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.kofax.kmc.ken.engines.appstats:
//            AppStatsImageProcessorData

public class ImageProcessorAppStatsClient extends AppStatsClient
{

    private static final String b = "ImageProcessorAppStatsClient";
    ImageProcessEventDao a;
    private String c;

    public ImageProcessorAppStatsClient(AppStatsInstanceType appstatsinstancetype)
    {
        super(appstatsinstancetype);
    }

    public ImageProcessorAppStatsClient(String s, AppStatsInstanceType appstatsinstancetype, boolean flag)
    {
        super(s, appstatsinstancetype, flag);
    }

    private void a(AppStatsImageProcessorData appstatsimageprocessordata)
    {
        ArrayList arraylist = new ArrayList();
        if (a == null)
        {
            Log.i("ImageProcessorAppStatsClient", "imageprocessor dao property is null, start event was never fired (app issue)");
            return;
        }
        a = (ImageProcessEventDao)a.clone();
        a.setEndTime(System.currentTimeMillis());
        Log.i("ImageProcessorAppStatsClient", (new StringBuilder()).append("endTme = ").append(System.currentTimeMillis()).append((new Date(System.currentTimeMillis())).toString()).toString());
        a.setResultCode(appstatsimageprocessordata.getResultCode());
        a.setProcessingProfile(appstatsimageprocessordata.getPerfectionProfile());
        a.setProcessedImage(appstatsimageprocessordata.getProcesedID());
        a.setSourceImage(appstatsimageprocessordata.getSourceImageID());
        a.setSessionKey(a.getAppStatsSessionKey());
        a.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
        if (appstatsimageprocessordata.getProcesedID() != null)
        {
            Log.i("ImageProcessorAppStatsClient", (new StringBuilder()).append("ImageProcessing failed or cancelled : ").append(appstatsimageprocessordata.getProcesedID()).toString());
            ImageDao imagedao = new ImageDao();
            imagedao.setId(appstatsimageprocessordata.getProcesedID());
            imagedao.setEventTime(asFriend.currentEventTime());
            imagedao.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
            imagedao.setFileSize(appstatsimageprocessordata.getImageSize());
            imagedao.setSource(AppStatsImageSourceType.INST_TYPE_IMAGE_PROCESSOR.ordinal());
            imagedao.setDocumentId(appstatsimageprocessordata.getDocumentID());
            arraylist.add(imagedao);
        }
        arraylist.add(a);
        logAppStats((AppStatsDao[])arraylist.toArray(new AppStatsDao[arraylist.size()]));
        a = null;
    }

    static void a(ImageProcessorAppStatsClient imageprocessorappstatsclient, AppStatsImageProcessorData appstatsimageprocessordata)
    {
        imageprocessorappstatsclient.a(appstatsimageprocessordata);
    }

    static void a(ImageProcessorAppStatsClient imageprocessorappstatsclient, AppStatsEventIDType appstatseventidtype)
    {
        imageprocessorappstatsclient.setEventId(appstatseventidtype);
    }

    static void b(ImageProcessorAppStatsClient imageprocessorappstatsclient, AppStatsEventIDType appstatseventidtype)
    {
        imageprocessorappstatsclient.setEventId(appstatseventidtype);
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, AppStatsImageProcessorData appstatsimageprocessordata)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls1(appstatsimageprocessordata));
    }

    protected void logAppStatsImgProcessingStartEvent(AppStatsImageProcessorData appstatsimageprocessordata)
    {
        a = new ImageProcessEventDao();
        a.setInstanceId(instanceId);
        a.setSourceImage(appstatsimageprocessordata.getSourceImageID());
        a.setStartTime(asFriend.currentEventTime());
        a.setSessionKey(a.getAppStatsSessionKey());
        a.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        logAppStats(new AppStatsDao[] {
            a
        });
    }

    private class _cls1
        implements AppStatsClientEventLogger
    {

        final AppStatsImageProcessorData a;
        final ImageProcessorAppStatsClient b;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls2.a[appstatseventidtype.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                ImageProcessorAppStatsClient.a(b, appstatseventidtype);
                b.logAppStatsImgProcessingStartEvent(a);
                return;

            case 2: // '\002'
                ImageProcessorAppStatsClient.b(b, appstatseventidtype);
                break;
            }
            ImageProcessorAppStatsClient.a(b, a);
        }

        _cls1(AppStatsImageProcessorData appstatsimageprocessordata)
        {
            b = ImageProcessorAppStatsClient.this;
            a = appstatsimageprocessordata;
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
                    a[AppStatsEventIDType.APP_STATS_IMG_PROCESSING_START_EVENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_IMG_PROCESSING_STOP_EVENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }

}
