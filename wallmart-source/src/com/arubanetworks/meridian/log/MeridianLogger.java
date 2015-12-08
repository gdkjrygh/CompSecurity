// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.log;

import android.util.Log;
import com.arubanetworks.meridian.internal.util.Strings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.arubanetworks.meridian.log:
//            AndroidStandardLogAdapter, AnalyticsCrashReporingLogAdapter, MeridianLogAdapter

public class MeridianLogger
{
    public static final class Feature extends Enum
    {

        public static final Feature CAMPAIGNS;
        public static final Feature DEBUG_REPORTS;
        public static final Feature DIRECTIONS;
        public static final Feature LOCATION;
        public static final Feature MAPS;
        public static final Feature OPENGL;
        public static final Feature REQUESTS;
        public static final Feature SEARCH;
        private static final Feature b[];
        private boolean a;

        public static Feature valueOf(String s)
        {
            return (Feature)Enum.valueOf(com/arubanetworks/meridian/log/MeridianLogger$Feature, s);
        }

        public static Feature[] values()
        {
            return (Feature[])b.clone();
        }

        public boolean isEnabled()
        {
            return a;
        }

        static 
        {
            DIRECTIONS = new Feature("DIRECTIONS", 0, true);
            CAMPAIGNS = new Feature("CAMPAIGNS", 1, true);
            MAPS = new Feature("MAPS", 2, true);
            REQUESTS = new Feature("REQUESTS", 3, true);
            LOCATION = new Feature("LOCATION", 4, true);
            OPENGL = new Feature("OPENGL", 5, true);
            SEARCH = new Feature("SEARCH", 6, true);
            DEBUG_REPORTS = new Feature("DEBUG_REPORTS", 7, true);
            b = (new Feature[] {
                DIRECTIONS, CAMPAIGNS, MAPS, REQUESTS, LOCATION, OPENGL, SEARCH, DEBUG_REPORTS
            });
        }

        private Feature(String s, int j, boolean flag)
        {
            super(s, j);
            a = flag;
        }
    }


    public static final int DEBUG = 1;
    public static final int ERROR = 4;
    public static final int INFO = 2;
    public static final String LOG_TAG_BASE = "MeridianSDK";
    public static final int VERBOSE = 0;
    public static final int WARN = 3;
    public static final int WTF = 10;
    private static final List a;
    private String b;
    private List c;

    private MeridianLogger()
    {
        c = new ArrayList();
    }

    private String a()
    {
        if (c.isEmpty())
        {
            return (new StringBuilder()).append("MeridianSDK.").append(b).toString();
        }
        StringBuilder stringbuilder = new StringBuilder("MeridianSDK");
        Feature feature;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); stringbuilder.append(".").append(feature))
        {
            feature = (Feature)iterator.next();
        }

        stringbuilder.append(".").append(b);
        return stringbuilder.toString();
    }

    private void a(int j, String s, Throwable throwable)
    {
        String s1 = s;
        if (throwable != null)
        {
            s1 = (new StringBuilder()).append(s).append("\n").append(Log.getStackTraceString(throwable)).toString();
        }
        if (a(j) && b())
        {
            s = a.iterator();
            do
            {
                if (!s.hasNext())
                {
                    break;
                }
                MeridianLogAdapter meridianlogadapter = (MeridianLogAdapter)s.next();
                switch (j)
                {
                case 0: // '\0'
                    meridianlogadapter.v(a(), s1, throwable);
                    break;

                case 1: // '\001'
                    meridianlogadapter.d(a(), s1, throwable);
                    break;

                case 2: // '\002'
                    meridianlogadapter.i(a(), s1, throwable);
                    break;

                case 3: // '\003'
                    meridianlogadapter.w(a(), s1, throwable);
                    break;

                case 4: // '\004'
                    meridianlogadapter.e(a(), s1, throwable);
                    break;

                case 10: // '\n'
                    meridianlogadapter.wtf(a(), s1, throwable);
                    break;
                }
            } while (true);
        }
    }

    private boolean a(int j)
    {
        return j >= 0;
    }

    private boolean b()
    {
        if (c.isEmpty())
        {
            return true;
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            if (((Feature)iterator.next()).isEnabled())
            {
                return true;
            }
        }

        return false;
    }

    public static MeridianLogger forTag(String s)
    {
        MeridianLogger meridianlogger = new MeridianLogger();
        meridianlogger.b = s;
        return meridianlogger;
    }

    public MeridianLogger andFeature(Feature feature)
    {
        if (Strings.isNullOrEmpty(b))
        {
            throw new IllegalStateException("You need to specify a tag first");
        } else
        {
            c.add(feature);
            return this;
        }
    }

    public transient MeridianLogger andFeatures(Feature afeature[])
    {
        if (Strings.isNullOrEmpty(b))
        {
            throw new IllegalStateException("You need to specify a tag first");
        }
        if (afeature != null)
        {
            int k = afeature.length;
            for (int j = 0; j < k; j++)
            {
                Feature feature = afeature[j];
                c.add(feature);
            }

        }
        return this;
    }

    public void d(String s)
    {
        a(1, s, null);
    }

    public void d(String s, Throwable throwable)
    {
        a(1, s, throwable);
    }

    public transient void d(String s, Object aobj[])
    {
        d(String.format(s, aobj));
    }

    public void e(String s)
    {
        a(4, s, null);
    }

    public void e(String s, Throwable throwable)
    {
        a(4, s, throwable);
    }

    public transient void e(String s, Object aobj[])
    {
        e(String.format(s, aobj));
    }

    public void i(String s)
    {
        a(2, s, null);
    }

    public void i(String s, Throwable throwable)
    {
        a(2, s, throwable);
    }

    public transient void i(String s, Object aobj[])
    {
        i(String.format(s, aobj));
    }

    public void v(String s)
    {
        a(0, s, null);
    }

    public void v(String s, Throwable throwable)
    {
        a(0, s, throwable);
    }

    public transient void v(String s, Object aobj[])
    {
        v(String.format(s, aobj));
    }

    public void w(String s)
    {
        a(3, s, null);
    }

    public void w(String s, Throwable throwable)
    {
        a(3, s, throwable);
    }

    public transient void w(String s, Object aobj[])
    {
        w(String.format(s, aobj));
    }

    public void wtf(String s)
    {
        a(10, s, null);
    }

    public void wtf(String s, Throwable throwable)
    {
        a(10, s, throwable);
    }

    static 
    {
        a = new ArrayList();
        a.add(new AndroidStandardLogAdapter());
        a.add(new AnalyticsCrashReporingLogAdapter());
    }
}
