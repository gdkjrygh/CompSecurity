// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.PropertyChangeEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsPropertyType;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsClient

public class PropChangeAppStatsClient extends AppStatsClient
{

    private static final String a = "PropChangeAppStatsClient";
    private PropertyChangeEventDao b;
    private AppStatsPropertyType c;
    private String d;

    public PropChangeAppStatsClient(AppStatsInstanceType appstatsinstancetype)
    {
        super(appstatsinstancetype);
        b = null;
        c = AppStatsPropertyType.PROP_TYPE_UNUSED;
        d = null;
    }

    public PropChangeAppStatsClient(String s, AppStatsInstanceType appstatsinstancetype, boolean flag)
    {
        super(s, appstatsinstancetype, flag);
        b = null;
        c = AppStatsPropertyType.PROP_TYPE_UNUSED;
        d = null;
    }

    private void a()
    {
        b = new PropertyChangeEventDao();
        b.setInstanceId(instanceId);
        b.setEventTime(asFriend.currentEventTime());
        b.setPropertyType(c);
        b.setPropertyValue(d);
        b.setSessionKey(b.getAppStatsSessionKey());
        b.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        logAppStats(new AppStatsDao[] {
            b
        });
    }

    static void a(PropChangeAppStatsClient propchangeappstatsclient)
    {
        propchangeappstatsclient.a();
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, AppStatsPropertyType appstatspropertytype, String s, String s1)
    {
        c = appstatspropertytype;
        d = s1;
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls1(s, s1));
    }

    private class _cls1
        implements AppStatsClientEventLogger
    {

        final String a;
        final String b;
        final PropChangeAppStatsClient c;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            _cls2.a[appstatseventidtype.ordinal()];
            JVM INSTR tableswitch 1 1: default 28
        //                       1 29;
               goto _L1 _L2
_L1:
            return;
_L2:
            if (!a.equals(b))
            {
                c.setEventId(appstatseventidtype);
                PropChangeAppStatsClient.a(c);
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        _cls1(String s, String s1)
        {
            c = PropChangeAppStatsClient.this;
            a = s;
            b = s1;
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
                    a[AppStatsEventIDType.APP_STATS_PROPERTY_CHANGE_EVENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

    }

}
