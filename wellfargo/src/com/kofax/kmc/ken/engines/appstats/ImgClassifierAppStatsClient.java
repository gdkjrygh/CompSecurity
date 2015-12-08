// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.appstats;

import com.kofax.kmc.ken.engines.ImageClassificationResult;
import com.kofax.kmc.kut.utilities.appstats.AppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImgClassificationEventAltDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImgClassificationEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImgClassifierAppStatsClient extends AppStatsClient
{

    private static final String a = "ClassifierAppStatsClient";
    private ImgClassificationEventDao b;

    public ImgClassifierAppStatsClient(AppStatsInstanceType appstatsinstancetype)
    {
        super(appstatsinstancetype);
        b = null;
    }

    public ImgClassifierAppStatsClient(String s, AppStatsInstanceType appstatsinstancetype, boolean flag)
    {
        super(s, appstatsinstancetype, flag);
        b = null;
    }

    static void a(ImgClassifierAppStatsClient imgclassifierappstatsclient, AppStatsEventIDType appstatseventidtype)
    {
        imgclassifierappstatsclient.setEventId(appstatseventidtype);
    }

    static void a(ImgClassifierAppStatsClient imgclassifierappstatsclient, String s)
    {
        imgclassifierappstatsclient.a(s);
    }

    static void a(ImgClassifierAppStatsClient imgclassifierappstatsclient, List list, String s)
    {
        imgclassifierappstatsclient.a(list, s);
    }

    private void a(String s)
    {
        b = new ImgClassificationEventDao();
        b.setInstanceId(instanceId);
        b.setStartTime(asFriend.currentEventTime());
        b.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        b.setImageID(s);
        b.setSessionKey(b.getAppStatsSessionKey());
        logAppStats(new AppStatsDao[] {
            b
        });
    }

    private void a(List list, String s)
    {
        ArrayList arraylist = new ArrayList();
        if (b == null)
        {
            throw new NullPointerException("classificationEventDao property is null");
        }
        b = b.clone();
        b.setStopTime(asFriend.currentEventTime());
        b.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
        if (!list.isEmpty())
        {
            b.setClassificationResult(((ImageClassificationResult)list.get(0)).getClassId());
            b.setClassificationConfidence(((ImageClassificationResult)list.get(0)).getConfidence());
        }
        b.setImageID(s);
        arraylist.add(b);
        ImgClassificationEventAltDao imgclassificationeventaltdao;
        for (list = list.subList(1, list.size()).iterator(); list.hasNext(); arraylist.add(imgclassificationeventaltdao))
        {
            s = (ImageClassificationResult)list.next();
            imgclassificationeventaltdao = new ImgClassificationEventAltDao();
            imgclassificationeventaltdao.setClassificationEventID(b.getId());
            imgclassificationeventaltdao.setAltClassificationResult(s.getClassId());
            imgclassificationeventaltdao.setAltClassificationConfidence(s.getConfidence());
        }

        logAppStats((AppStatsDao[])arraylist.toArray(new AppStatsDao[arraylist.size()]));
        b = null;
    }

    static void b(ImgClassifierAppStatsClient imgclassifierappstatsclient, AppStatsEventIDType appstatseventidtype)
    {
        imgclassifierappstatsclient.setEventId(appstatseventidtype);
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, String s)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls1(s));
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, List list, String s)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls2(list, s));
    }

    private class _cls1
        implements AppStatsClientEventLogger
    {

        final String a;
        final ImgClassifierAppStatsClient b;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls3.a[appstatseventidtype.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                ImgClassifierAppStatsClient.a(b, appstatseventidtype);
                break;
            }
            ImgClassifierAppStatsClient.a(b, a);
        }

        _cls1(String s)
        {
            b = ImgClassifierAppStatsClient.this;
            a = s;
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
                    a[AppStatsEventIDType.APP_STATS_CLASSIFY_START_EVENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_CLASSIFY_STOP_EVENT.ordinal()] = 2;
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

        final List a;
        final String b;
        final ImgClassifierAppStatsClient c;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls3.a[appstatseventidtype.ordinal()])
            {
            default:
                return;

            case 2: // '\002'
                ImgClassifierAppStatsClient.b(c, appstatseventidtype);
                break;
            }
            ImgClassifierAppStatsClient.a(c, a, b);
        }

        _cls2(List list, String s)
        {
            c = ImgClassifierAppStatsClient.this;
            a = list;
            b = s;
            super();
        }
    }

}
