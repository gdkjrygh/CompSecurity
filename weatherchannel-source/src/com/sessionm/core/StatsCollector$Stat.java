// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            StatsCollector

public static final class eO extends Enum
{

    public static final eG eA;
    public static final eG eB;
    public static final eG eC;
    public static final eG eD;
    public static final eG eE;
    public static final eG eF;
    public static final eG eG;
    private static final eG eP[];
    public static final eG et;
    public static final eG eu;
    public static final eG ev;
    public static final eG ew;
    public static final eG ex;
    public static final eG ey;
    public static final eG ez;
    private ype eH;
    private long eI;
    private long eJ;
    private long eK;
    private long eL;
    private String eM;
    private String eN;
    private String eO;

    static void a(eO eo)
    {
        eo.reset();
    }

    private String aB()
    {
        return eM;
    }

    private void az()
    {
        eJ = eJ + 1L;
    }

    static String b(eJ ej)
    {
        return ej.aB();
    }

    static void b(aB ab, long l)
    {
        ab.c(l);
    }

    private void c(long l)
    {
        if (eH == ype.eR)
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

    static void c(eK ek)
    {
        ek.az();
    }

    private void reset()
    {
        eJ = 0L;
        eI = 0L;
        eK = -1L;
        eL = -1L;
    }

    public static eL valueOf(String s)
    {
        return (eL)Enum.valueOf(com/sessionm/core/StatsCollector$Stat, s);
    }

    public static eL[] values()
    {
        return (eL[])eP.clone();
    }

    public float aA()
    {
        if (eH == ype.eR)
        {
            return (float)eI;
        }
        if (eH.equals(ype.eQ))
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

    public ype ax()
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
        et = new <init>("SESSION_START_STAT", 0, ype.eQ, com.sessionm.net.Type.eQ, "sst", "Session Start Request Time");
        eu = new <init>("PORTAL_PRESENTATION_TIME", 1, ype.eQ, "portal presentation time", "ppt", "Portal Presentation Time");
        ev = new <init>("ACTION_STAT", 2, ype.eQ, com.sessionm.net.Type.eQ, "lart", "Log Action Time");
        ew = new <init>("SESSION_END_STAT", 3, ype.eQ, com.sessionm.net.Type.eQ, "sert", "Session End Request Time");
        ex = new <init>("CONTENT_STAT", 4, ype.eQ, com.sessionm.net.Type.eQ, "crt", "Content Request Time");
        ey = new <init>("WEB_VIEW_LOAD_TIME", 5, ype.eQ, "webview load time", "wlt", "Web View Load Time");
        ez = new <init>("ACHIEVEMENT_PRESENTATION_TIME", 6, ype.eQ, "achievement presentation time", "apt", "Achievement Presentation Time");
        eA = new <init>("ACHIEVEMENT_PRELOAD_TIME", 7, ype.eR, "preload", "alt", "Achievement Preload Time");
        eB = new <init>("WEB_VIEW_ERROR_COUNT", 8, ype.eS, "webview error count", "wec", "Web View Error Count");
        eC = new <init>("SESSION_DURATION", 9, ype.eR, "session duration", "sd", "Session Duration");
        eD = new <init>("REQUEST_SEND_COUNT_STAT", 10, ype.eS, "request count", "rsc", "Request Send Count");
        eE = new <init>("REQUEST_SEND_FAILURE_COUNT", 11, ype.eS, "request failure count", "rsfc", "Request Send Failure Count");
        eF = new <init>("REQUEST_ERROR_REPLY_COUNT", 12, ype.eS, "request error reply count", "rerc", "Request Error Reply Count");
        eG = new <init>("DB_FAILURE_COUNT", 13, ype.eS, "database failure count", "psf", "Persistent Store Failure");
        eP = (new eP[] {
            et, eu, ev, ew, ex, ey, ez, eA, eB, eC, 
            eD, eE, eF, eG
        });
    }

    private ype(String s, int i, ype ype, com.sessionm.net.Type type, String s1, String s2)
    {
        this(s, i, ype, type.g(), s1, s2);
    }

    private ype(String s, int i, ype ype, String s1, String s2, String s3)
    {
        super(s, i);
        eK = -1L;
        eL = -1L;
        eH = ype;
        eM = s1;
        eN = s2;
        eO = s3;
    }
}
