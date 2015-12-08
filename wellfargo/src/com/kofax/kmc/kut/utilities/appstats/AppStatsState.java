// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            a, b

public final class AppStatsState extends Enum
{

    public static final AppStatsState APP_STATS_BEGINNING_SESSION;
    public static final AppStatsState APP_STATS_ENDING_SESSION;
    public static final AppStatsState APP_STATS_EXPORTING;
    public static final AppStatsState APP_STATS_INITIALIZED;
    public static final AppStatsState APP_STATS_INITIALIZING;
    public static final AppStatsState APP_STATS_LOGGING_SESSION;
    public static final AppStatsState APP_STATS_PURGING;
    public static final AppStatsState APP_STATS_RECORDING;
    public static final AppStatsState APP_STATS_RECORDING_WRITING;
    public static final AppStatsState APP_STATS_UNINITIALIZED;
    public static final AppStatsState APP_STATS_UPGRADING;
    public static final AppStatsState APP_STATS_WRITING;
    private static final AppStatsState g[];
    a a;
    private final String b;
    private Set c;
    private Map d;
    private Map e;
    private Map f;

    private AppStatsState(String s, int i, a a1)
    {
        super(s, i);
        b = "task parameter '%s' does not represent a supported action for AppStatsState %s";
        d = new HashMap();
        e = new HashMap();
        f = new HashMap();
        a = a1;
        _cls1.a[a1.ordinal()];
        JVM INSTR tableswitch 1 12: default 120
    //                   1 137
    //                   2 150
    //                   3 375
    //                   4 435
    //                   5 622
    //                   6 746
    //                   7 1041
    //                   8 1205
    //                   9 1392
    //                   10 1579
    //                   11 1804
    //                   12 2029;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        f.put(a.m, ErrorInfo.KMC_UT_STATS_INVALID_STATE_TRANSITION);
        return;
_L2:
        c = EnumSet.of(b.a);
        continue; /* Loop/switch isn't completed */
_L3:
        c = EnumSet.of(b.b);
        d.put(b.b, new HashMap());
        e.put(b.b, new HashMap());
        ((Map)d.get(b.b)).put(a.a, a.c);
        ((Map)d.get(b.b)).put(a.c, a.c);
        ((Map)e.get(b.b)).put(a.a, a.a);
        ((Map)e.get(b.b)).put(a.c, a.a);
        f.put(a.e, ErrorInfo.KMC_UT_STATS_INIT_NOT_ALLOWED);
        f.put(a.h, ErrorInfo.KMC_UT_STATS_INIT_NOT_ALLOWED);
        f.put(a.f, ErrorInfo.KMC_UT_STATS_INIT_NOT_ALLOWED);
        f.put(a.g, ErrorInfo.KMC_UT_STATS_INIT_NOT_ALLOWED);
        continue; /* Loop/switch isn't completed */
_L4:
        c = EnumSet.of(b.e);
        d.put(b.e, new HashMap());
        ((Map)d.get(b.e)).put(a.e, a.c);
        continue; /* Loop/switch isn't completed */
_L5:
        c = EnumSet.of(b.c);
        d.put(b.c, new HashMap());
        e.put(b.c, new HashMap());
        ((Map)d.get(b.c)).put(a.c, a.a);
        ((Map)e.get(b.c)).put(a.c, a.a);
        f.put(a.e, ErrorInfo.KMC_UT_STATS_PURGE_NOT_ALLOWED);
        f.put(a.h, ErrorInfo.KMC_UT_STATS_PURGE_NOT_ALLOWED);
        f.put(a.f, ErrorInfo.KMC_UT_STATS_PURGE_NOT_ALLOWED);
        f.put(a.g, ErrorInfo.KMC_UT_STATS_PURGE_NOT_ALLOWED);
        f.put(a.a, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
        continue; /* Loop/switch isn't completed */
_L6:
        c = EnumSet.of(b.d);
        d.put(b.d, new HashMap());
        ((Map)d.get(b.d)).put(a.c, a.e);
        f.put(a.e, ErrorInfo.KMC_UT_STATS_ALREADY_RECORDING);
        f.put(a.g, ErrorInfo.KMC_UT_STATS_ALREADY_RECORDING);
        f.put(a.h, ErrorInfo.KMC_UT_STATS_RECORD_NOT_ALLOWED);
        f.put(a.a, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
        continue; /* Loop/switch isn't completed */
_L7:
        c = EnumSet.of(b.f, b.e);
        d.put(b.f, new HashMap());
        d.put(b.e, new HashMap());
        e.put(b.f, new HashMap());
        e.put(b.e, new HashMap());
        ((Map)d.get(b.f)).put(a.c, a.c);
        ((Map)d.get(b.e)).put(a.g, a.f);
        ((Map)d.get(b.f)).put(a.f, a.c);
        ((Map)e.get(b.f)).put(a.c, a.c);
        ((Map)e.get(b.f)).put(a.e, a.e);
        f.put(a.f, ErrorInfo.KMC_UT_STATS_ALREADY_WRITING);
        f.put(a.g, ErrorInfo.KMC_UT_STATS_ALREADY_WRITING);
        f.put(a.h, ErrorInfo.KMC_UT_STATS_WRITING_NOT_ALLOWED);
        f.put(a.a, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
        continue; /* Loop/switch isn't completed */
_L8:
        c = EnumSet.of(b.d, b.f);
        d.put(b.d, new HashMap());
        d.put(b.f, new HashMap());
        ((Map)d.get(b.d)).put(a.f, a.g);
        ((Map)d.get(b.f)).put(a.e, a.g);
        ((Map)d.get(b.f)).put(a.f, a.e);
        ((Map)d.get(b.f)).put(a.g, a.e);
        continue; /* Loop/switch isn't completed */
_L9:
        c = EnumSet.of(b.h);
        d.put(b.h, new HashMap());
        e.put(b.h, new HashMap());
        ((Map)d.get(b.h)).put(a.c, a.c);
        ((Map)e.get(b.h)).put(a.e, a.c);
        f.put(a.h, ErrorInfo.KMC_UT_STATS_ALREADY_EXPORTING);
        f.put(a.e, ErrorInfo.KMC_UT_STATS_EXPORT_NOT_ALLOWED);
        f.put(a.g, ErrorInfo.KMC_UT_STATS_EXPORT_NOT_ALLOWED);
        f.put(a.f, ErrorInfo.KMC_UT_STATS_EXPORT_NOT_ALLOWED);
        f.put(a.a, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
        continue; /* Loop/switch isn't completed */
_L10:
        c = EnumSet.of(b.l);
        d.put(b.l, new HashMap());
        e.put(b.l, new HashMap());
        ((Map)d.get(b.l)).put(a.a, a.a);
        ((Map)e.get(b.l)).put(a.a, a.a);
        f.put(a.c, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
        f.put(a.f, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
        f.put(a.e, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
        f.put(a.g, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
        f.put(a.h, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
        continue; /* Loop/switch isn't completed */
_L11:
        c = EnumSet.of(b.i);
        d.put(b.i, new HashMap());
        e.put(b.i, new HashMap());
        ((Map)d.get(b.i)).put(a.e, a.e);
        ((Map)d.get(b.i)).put(a.g, a.g);
        ((Map)e.get(b.i)).put(a.e, a.e);
        ((Map)e.get(b.i)).put(a.g, a.g);
        f.put(a.a, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
        f.put(a.f, ErrorInfo.KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED);
        f.put(a.c, ErrorInfo.KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED);
        f.put(a.h, ErrorInfo.KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED);
        continue; /* Loop/switch isn't completed */
_L12:
        c = EnumSet.of(b.j);
        d.put(b.j, new HashMap());
        e.put(b.j, new HashMap());
        ((Map)d.get(b.j)).put(a.e, a.e);
        ((Map)d.get(b.j)).put(a.g, a.g);
        ((Map)e.get(b.j)).put(a.e, a.e);
        ((Map)e.get(b.j)).put(a.g, a.g);
        f.put(a.a, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
        f.put(a.f, ErrorInfo.KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED);
        f.put(a.c, ErrorInfo.KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED);
        f.put(a.h, ErrorInfo.KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED);
        continue; /* Loop/switch isn't completed */
_L13:
        c = EnumSet.of(b.k);
        d.put(b.k, new HashMap());
        e.put(b.k, new HashMap());
        ((Map)d.get(b.k)).put(a.e, a.e);
        ((Map)d.get(b.k)).put(a.g, a.g);
        ((Map)e.get(b.k)).put(a.e, a.e);
        ((Map)e.get(b.k)).put(a.g, a.g);
        f.put(a.a, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
        f.put(a.f, ErrorInfo.KMC_UT_STATS_END_SESSION_NOT_ALLOWED);
        f.put(a.c, ErrorInfo.KMC_UT_STATS_END_SESSION_NOT_ALLOWED);
        f.put(a.h, ErrorInfo.KMC_UT_STATS_END_SESSION_NOT_ALLOWED);
        if (true) goto _L1; else goto _L14
_L14:
    }

    public static AppStatsState valueOf(String s)
    {
        return (AppStatsState)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/AppStatsState, s);
    }

    public static AppStatsState[] values()
    {
        return (AppStatsState[])g.clone();
    }

    ErrorInfo a(b b1, a a1)
    {
        boolean flag = c.contains(b1);
        boolean flag1 = ((Map)d.get(b1)).containsKey(a1);
        b1 = ErrorInfo.KMC_SUCCESS;
        if (!flag || !flag1)
        {
            b1 = (ErrorInfo)f.get(a1);
        }
        a1 = b1;
        if (b1 == null)
        {
            a1 = (ErrorInfo)f.get(a.m);
        }
        return a1;
    }

    AppStatsState b(b b1, a a1)
    {
        if (!c.contains(b1))
        {
            throw new IllegalArgumentException(String.format("task parameter '%s' does not represent a supported action for AppStatsState %s", new Object[] {
                b1, this
            }));
        }
        b1 = ((a)((Map)d.get(b1)).get(a1)).a();
        if (b1 == null)
        {
            throw new TypeNotPresentException(a1.name(), new Throwable((new StringBuilder()).append("Failed to map AppStatsState nextState from StateID=").append(a1).toString()));
        } else
        {
            return b1;
        }
    }

    AppStatsState c(b b1, a a1)
    {
        if (!c.contains(b1))
        {
            throw new IllegalArgumentException("task parameter '%s' does not represent a supported action for AppStatsState %s");
        }
        b1 = ((a)((Map)e.get(b1)).get(a1)).a();
        if (b1 == null)
        {
            throw new TypeNotPresentException(a1.name(), new Throwable((new StringBuilder()).append("Failed to map AppStatsState errorState from StateID=").append(a1).toString()));
        } else
        {
            return b1;
        }
    }

    static 
    {
        APP_STATS_UNINITIALIZED = new AppStatsState("APP_STATS_UNINITIALIZED", 0, a.a);
        APP_STATS_INITIALIZING = new AppStatsState("APP_STATS_INITIALIZING", 1, a.b);
        APP_STATS_INITIALIZED = new AppStatsState("APP_STATS_INITIALIZED", 2, a.c);
        APP_STATS_PURGING = new AppStatsState("APP_STATS_PURGING", 3, a.d);
        APP_STATS_RECORDING = new AppStatsState("APP_STATS_RECORDING", 4, a.e);
        APP_STATS_WRITING = new AppStatsState("APP_STATS_WRITING", 5, a.f);
        APP_STATS_RECORDING_WRITING = new AppStatsState("APP_STATS_RECORDING_WRITING", 6, a.g);
        APP_STATS_EXPORTING = new AppStatsState("APP_STATS_EXPORTING", 7, a.h);
        APP_STATS_BEGINNING_SESSION = new AppStatsState("APP_STATS_BEGINNING_SESSION", 8, a.i);
        APP_STATS_LOGGING_SESSION = new AppStatsState("APP_STATS_LOGGING_SESSION", 9, a.j);
        APP_STATS_ENDING_SESSION = new AppStatsState("APP_STATS_ENDING_SESSION", 10, a.k);
        APP_STATS_UPGRADING = new AppStatsState("APP_STATS_UPGRADING", 11, a.l);
        g = (new AppStatsState[] {
            APP_STATS_UNINITIALIZED, APP_STATS_INITIALIZING, APP_STATS_INITIALIZED, APP_STATS_PURGING, APP_STATS_RECORDING, APP_STATS_WRITING, APP_STATS_RECORDING_WRITING, APP_STATS_EXPORTING, APP_STATS_BEGINNING_SESSION, APP_STATS_LOGGING_SESSION, 
            APP_STATS_ENDING_SESSION, APP_STATS_UPGRADING
        });
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[com.kofax.kmc.kut.utilities.appstats.a.values().length];
            try
            {
                a[a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                a[a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                a[a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                a[a.d.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[a.e.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[a.f.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[a.g.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[a.h.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[a.l.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[a.i.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[a.j.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[a.k.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
