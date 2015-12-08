// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.sessionm.api.Activity;
import com.sessionm.b.a;
import com.sessionm.net.Request;
import org.json.JSONObject;

public class StatsCollector
{
    public static final class Stat extends Enum
    {

        public static final Stat eA;
        public static final Stat eB;
        public static final Stat eC;
        public static final Stat eD;
        public static final Stat eE;
        public static final Stat eF;
        public static final Stat eG;
        private static final Stat eP[];
        public static final Stat et;
        public static final Stat eu;
        public static final Stat ev;
        public static final Stat ew;
        public static final Stat ex;
        public static final Stat ey;
        public static final Stat ez;
        private StatType eH;
        private long eI;
        private long eJ;
        private long eK;
        private long eL;
        private String eM;
        private String eN;
        private String eO;

        static void a(Stat stat)
        {
            stat.reset();
        }

        private String aB()
        {
            return eM;
        }

        private void az()
        {
            eJ = eJ + 1L;
        }

        static String b(Stat stat)
        {
            return stat.aB();
        }

        static void b(Stat stat, long l)
        {
            stat.c(l);
        }

        private void c(long l)
        {
            if (eH == StatType.eR)
            {
                eI = l;
            } else
            {
                eJ = eJ + 1L;
                eI = eI + l;
                if (l > eL || eL == -1L)
                {
                    eL = l;
                }
                if (l < eK || eK == -1L)
                {
                    eK = l;
                    return;
                }
            }
        }

        static void c(Stat stat)
        {
            stat.az();
        }

        private void reset()
        {
            eJ = 0L;
            eI = 0L;
            eK = -1L;
            eL = -1L;
        }

        public static Stat valueOf(String s)
        {
            return (Stat)Enum.valueOf(com/sessionm/core/StatsCollector$Stat, s);
        }

        public static Stat[] values()
        {
            return (Stat[])eP.clone();
        }

        public float aA()
        {
            if (eH == StatType.eR)
            {
                return (float)eI;
            }
            if (eH.equals(StatType.eQ))
            {
                if (eJ == 0L)
                {
                    return 0.0F;
                } else
                {
                    return (float)eI / (float)eJ;
                }
            } else
            {
                return (float)eI;
            }
        }

        public StatType ax()
        {
            return eH;
        }

        public String ay()
        {
            return eN;
        }

        public long getCount()
        {
            return eJ;
        }

        public String getDisplayName()
        {
            return eO;
        }

        static 
        {
            et = new Stat("SESSION_START_STAT", 0, StatType.eQ, com.sessionm.net.Request.Type.gL, "sst", "Session Start Request Time");
            eu = new Stat("PORTAL_PRESENTATION_TIME", 1, StatType.eQ, "portal presentation time", "ppt", "Portal Presentation Time");
            ev = new Stat("ACTION_STAT", 2, StatType.eQ, com.sessionm.net.Request.Type.gM, "lart", "Log Action Time");
            ew = new Stat("SESSION_END_STAT", 3, StatType.eQ, com.sessionm.net.Request.Type.gN, "sert", "Session End Request Time");
            ex = new Stat("CONTENT_STAT", 4, StatType.eQ, com.sessionm.net.Request.Type.gP, "crt", "Content Request Time");
            ey = new Stat("WEB_VIEW_LOAD_TIME", 5, StatType.eQ, "webview load time", "wlt", "Web View Load Time");
            ez = new Stat("ACHIEVEMENT_PRESENTATION_TIME", 6, StatType.eQ, "achievement presentation time", "apt", "Achievement Presentation Time");
            eA = new Stat("ACHIEVEMENT_PRELOAD_TIME", 7, StatType.eR, "preload", "alt", "Achievement Preload Time");
            eB = new Stat("WEB_VIEW_ERROR_COUNT", 8, StatType.eS, "webview error count", "wec", "Web View Error Count");
            eC = new Stat("SESSION_DURATION", 9, StatType.eR, "session duration", "sd", "Session Duration");
            eD = new Stat("REQUEST_SEND_COUNT_STAT", 10, StatType.eS, "request count", "rsc", "Request Send Count");
            eE = new Stat("REQUEST_SEND_FAILURE_COUNT", 11, StatType.eS, "request failure count", "rsfc", "Request Send Failure Count");
            eF = new Stat("REQUEST_ERROR_REPLY_COUNT", 12, StatType.eS, "request error reply count", "rerc", "Request Error Reply Count");
            eG = new Stat("DB_FAILURE_COUNT", 13, StatType.eS, "database failure count", "psf", "Persistent Store Failure");
            eP = (new Stat[] {
                et, eu, ev, ew, ex, ey, ez, eA, eB, eC, 
                eD, eE, eF, eG
            });
        }

        private Stat(String s, int j, StatType stattype, com.sessionm.net.Request.Type type, String s1, String s2)
        {
            this(s, j, stattype, type.toString(), s1, s2);
        }

        private Stat(String s, int j, StatType stattype, String s1, String s2, String s3)
        {
            super(s, j);
            eK = -1L;
            eL = -1L;
            eH = stattype;
            eM = s1;
            eN = s2;
            eO = s3;
        }
    }

    public static final class StatType extends Enum
    {

        public static final StatType eQ;
        public static final StatType eR;
        public static final StatType eS;
        private static final StatType eT[];

        public static StatType valueOf(String s)
        {
            return (StatType)Enum.valueOf(com/sessionm/core/StatsCollector$StatType, s);
        }

        public static StatType[] values()
        {
            return (StatType[])eT.clone();
        }

        static 
        {
            eQ = new StatType("AVERAGE", 0);
            eR = new StatType("VALUE", 1);
            eS = new StatType("COUNT", 2);
            eT = (new StatType[] {
                eQ, eR, eS
            });
        }

        private StatType(String s, int j)
        {
            super(s, j);
        }
    }


    private static final String es = "SessionMStatsPrefsFile";

    public StatsCollector()
    {
    }

    public static void a(Activity activity, long l)
    {
        if (activity.getActivityType() == com.sessionm.api.SessionM.ActivityType.ACHIEVEMENT)
        {
            Stat.b(Stat.ez, l);
            return;
        } else
        {
            Stat.b(Stat.eu, l);
            return;
        }
    }

    public static void a(Stat stat, long l)
    {
        if (stat.ax().equals(StatType.eS))
        {
            Stat.c(stat);
            return;
        } else
        {
            Stat.b(stat, l);
            return;
        }
    }

    public static void c(Request request)
    {
        Stat astat[] = Stat.values();
        int k = astat.length;
        for (int j = 0; j < k; j++)
        {
            Stat stat = astat[j];
            if (request.aS().toString().equals(Stat.b(stat)))
            {
                a(stat, request.aX());
            }
            if (request.aT() != null && request.getStatusCode() == 0)
            {
                a(Stat.eE, 1L);
            }
            if (request.getStatusCode() >= 400)
            {
                a(Stat.eF, 0L);
            }
        }

    }

    public static void h(Context context)
    {
        int j = 0;
        context = context.getSharedPreferences("SessionMStatsPrefsFile", 0).edit();
        a a1 = com.sessionm.b.a.aJ();
        Stat astat[] = Stat.values();
        for (int k = astat.length; j < k; j++)
        {
            Stat stat = astat[j];
            a1.put(stat.ay(), stat.aA());
        }

        context.putString("SessionMStatsKey", a1.aL().toString());
        context.commit();
    }

    static a i(Context context)
    {
        context = context.getSharedPreferences("SessionMStatsPrefsFile", 0);
        String s = context.getString("SessionMStatsKey", "{}");
        context.edit().clear().commit();
        return com.sessionm.b.a.A(s);
    }

    public static void reset()
    {
        Stat astat[] = Stat.values();
        int k = astat.length;
        for (int j = 0; j < k; j++)
        {
            com.sessionm.core.Stat.a(astat[j]);
        }

    }
}
