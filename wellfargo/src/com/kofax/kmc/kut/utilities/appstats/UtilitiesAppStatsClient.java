// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentEventDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ErrorLogEventDao;
import com.kofax.kmc.kut.utilities.appstats.dao.SessEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatsClient, AppStatsEnvSettings, AppStatsSessionEvent

public class UtilitiesAppStatsClient extends AppStatsClient
{

    private static final String a = "UtilitiesAppStatsClient";
    private final String b = "BeginSession";
    private final String c = "SessionCompleteSuccess";
    private final String d = "SessionCompleteFailed";
    private ErrorLogEventDao e;
    private EnvironmentEventDao f;
    private SessEventDao g;

    public UtilitiesAppStatsClient()
    {
        e = null;
        f = null;
        g = null;
    }

    private void a(AppStatsEnvSettings appstatsenvsettings)
    {
        f = new EnvironmentEventDao();
        f.setEnvTime(asFriend.currentEventTime());
        f.setDeviceID(appstatsenvsettings.getEnvDeviceID(false));
        f.setManufacturer(appstatsenvsettings.getEnvManufacturer(false));
        f.setModel(appstatsenvsettings.getEnvModel(false));
        f.setMemory(appstatsenvsettings.getEnvMemorySize(false));
        f.setOsVersion(appstatsenvsettings.getEnvOsVersion(false));
        f.setLanguage(appstatsenvsettings.getEnvLanguage(false));
        f.setSdkVersion(appstatsenvsettings.getEnvSdkVersion(false));
        f.setTimeZone(appstatsenvsettings.getEnvTimeZone(false));
        f.setCarrier(appstatsenvsettings.getEnvCarrier(false));
        f.setOsName(appstatsenvsettings.getEnvOsName(false));
        logAppStats(new AppStatsDao[] {
            f
        });
    }

    private void a(AppStatsSessionEvent appstatssessionevent)
    {
        g = new SessEventDao();
        g.setSessionKey(g.getAppStatsSessionKey());
        g.setCategory(g.getAppStatsCategory());
        g.setType(appstatssessionevent.getType());
        g.setEventTime(Long.valueOf(asFriend.currentEventTime()));
        g.setResponse(appstatssessionevent.getResponse());
        g.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        logAppStats(new AppStatsDao[] {
            g
        });
    }

    static void a(UtilitiesAppStatsClient utilitiesappstatsclient, AppStatsEnvSettings appstatsenvsettings)
    {
        utilitiesappstatsclient.a(appstatsenvsettings);
    }

    static void a(UtilitiesAppStatsClient utilitiesappstatsclient, AppStatsSessionEvent appstatssessionevent)
    {
        utilitiesappstatsclient.a(appstatssessionevent);
    }

    static void a(UtilitiesAppStatsClient utilitiesappstatsclient, ErrorInfo errorinfo)
    {
        utilitiesappstatsclient.a(errorinfo);
    }

    static void a(UtilitiesAppStatsClient utilitiesappstatsclient, String s, String s1)
    {
        utilitiesappstatsclient.a(s, s1);
    }

    static void a(UtilitiesAppStatsClient utilitiesappstatsclient, boolean flag, String s)
    {
        utilitiesappstatsclient.a(flag, s);
    }

    private void a(ErrorInfo errorinfo)
    {
        String s = errorinfo.getErrMsg();
        if (!errorinfo.getErrCause().isEmpty())
        {
            s = (new StringBuilder()).append(s).append(" (Cause: ").append(errorinfo.getErrCause()).append(")").toString();
        }
        e = new ErrorLogEventDao();
        e.setErrorTime(asFriend.currentEventTime());
        e.setErrorCode(errorinfo.getErr());
        e.setErrorDescription(s);
        e.setErrorRecommendation(errorinfo.getErrDesc());
        e.setSessionKey(e.getAppStatsSessionKey());
        e.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        logAppStats(new AppStatsDao[] {
            e
        });
    }

    private void a(String s, String s1)
    {
        g = new SessEventDao();
        g.setSessionKey(s);
        g.setCategory(s1);
        g.setType("BeginSession");
        g.setEventTime(Long.valueOf(asFriend.currentEventTime()));
        g.setResponse("");
        g.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        logAppStats(new AppStatsDao[] {
            g
        });
    }

    private void a(boolean flag, String s)
    {
        g = new SessEventDao();
        g.setSessionKey(g.getAppStatsSessionKey());
        g.setCategory(g.getAppStatsCategory());
        SessEventDao sesseventdao = g;
        String s1;
        if (flag)
        {
            s1 = "SessionCompleteSuccess";
        } else
        {
            s1 = "SessionCompleteFailed";
        }
        sesseventdao.setType(s1);
        g.setEventTime(Long.valueOf(asFriend.currentEventTime()));
        g.setResponse(s);
        g.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        logAppStats(new AppStatsDao[] {
            g
        });
    }

    public static UtilitiesAppStatsClient getInstance()
    {
        return a.a;
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, AppStatsEnvSettings appstatsenvsettings)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls2(appstatsenvsettings));
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, AppStatsSessionEvent appstatssessionevent)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls4(appstatssessionevent));
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, ErrorInfo errorinfo)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls1(errorinfo));
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, String s, String s1)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls3(s, s1));
    }

    public void logAppStats(AppStatsEventIDType appstatseventidtype, boolean flag, String s)
    {
        logEventIfAppsStatsRecordingOn(appstatseventidtype, new _cls5(flag, s));
    }

    private class a
    {

        public static final UtilitiesAppStatsClient a = new UtilitiesAppStatsClient();


        private a()
        {
        }
    }


    private class _cls2
        implements AppStatsClientEventLogger
    {

        final AppStatsEnvSettings a;
        final UtilitiesAppStatsClient b;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls6.a[appstatseventidtype.ordinal()])
            {
            default:
                return;

            case 2: // '\002'
                b.setEventId(appstatseventidtype);
                break;
            }
            UtilitiesAppStatsClient.a(b, a);
        }

        _cls2(AppStatsEnvSettings appstatsenvsettings)
        {
            b = UtilitiesAppStatsClient.this;
            a = appstatsenvsettings;
            super();
        }

        private class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[AppStatsEventIDType.values().length];
                try
                {
                    a[AppStatsEventIDType.APP_STATS_ERROR_LOG_EVENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_ENVIRONMENT_CHANGED_EVENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_BEGIN_SESSION_EVENT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_LOG_SESSION_EVENT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AppStatsEventIDType.APP_STATS_END_SESSION_EVENT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls4
        implements AppStatsClientEventLogger
    {

        final AppStatsSessionEvent a;
        final UtilitiesAppStatsClient b;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls6.a[appstatseventidtype.ordinal()])
            {
            default:
                return;

            case 4: // '\004'
                b.setEventId(appstatseventidtype);
                break;
            }
            UtilitiesAppStatsClient.a(b, a);
        }

        _cls4(AppStatsSessionEvent appstatssessionevent)
        {
            b = UtilitiesAppStatsClient.this;
            a = appstatssessionevent;
            super();
        }
    }


    private class _cls1
        implements AppStatsClientEventLogger
    {

        final ErrorInfo a;
        final UtilitiesAppStatsClient b;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls6.a[appstatseventidtype.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                b.setEventId(appstatseventidtype);
                break;
            }
            UtilitiesAppStatsClient.a(b, a);
        }

        _cls1(ErrorInfo errorinfo)
        {
            b = UtilitiesAppStatsClient.this;
            a = errorinfo;
            super();
        }
    }


    private class _cls3
        implements AppStatsClientEventLogger
    {

        final String a;
        final String b;
        final UtilitiesAppStatsClient c;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls6.a[appstatseventidtype.ordinal()])
            {
            default:
                return;

            case 3: // '\003'
                c.setEventId(appstatseventidtype);
                break;
            }
            UtilitiesAppStatsClient.a(c, a, b);
        }

        _cls3(String s, String s1)
        {
            c = UtilitiesAppStatsClient.this;
            a = s;
            b = s1;
            super();
        }
    }


    private class _cls5
        implements AppStatsClientEventLogger
    {

        final boolean a;
        final String b;
        final UtilitiesAppStatsClient c;

        public void logEvent(AppStatsEventIDType appstatseventidtype)
        {
            switch (_cls6.a[appstatseventidtype.ordinal()])
            {
            default:
                return;

            case 5: // '\005'
                c.setEventId(appstatseventidtype);
                break;
            }
            UtilitiesAppStatsClient.a(c, a, b);
        }

        _cls5(boolean flag, String s)
        {
            c = UtilitiesAppStatsClient.this;
            a = flag;
            b = s;
            super();
        }
    }

}
