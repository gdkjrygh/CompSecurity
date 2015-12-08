// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.internal.analytics;

import android.content.Context;
import android.util.Log;
import com.arubanetworks.meridian.internal.util.Strings;
import com.arubanetworks.meridian.log.MeridianLogger;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MeridianAnalytics
{

    private static final MeridianLogger a;
    private static MeridianAnalytics b;
    private static boolean c = false;
    private String d;
    private List e;

    public MeridianAnalytics()
    {
        e = new ArrayList();
    }

    private static Tracker a(Context context, String s)
    {
        if (!c)
        {
            return null;
        } else
        {
            context = GoogleAnalytics.getInstance(context).newTracker(s);
            context.setAppId("com.arubanetworks.meridian");
            return context;
        }
    }

    private static void a(AnalyticsEvent analyticsevent)
    {
        if (!c)
        {
            return;
        } else
        {
            a.d("Posting analytics event: %s", new Object[] {
                analyticsevent.toString()
            });
    /* block-local class not found */
    class a {}

            a.a().post(analyticsevent);
            return;
        }
    }

    public static void crash(String s, Throwable throwable)
    {
        if (!c)
        {
            return;
        } else
        {
    /* block-local class not found */
    class Crash {}

            Crash crash1 = new Crash(null);
            crash1.b = throwable;
            crash1.a = s;
            a(crash1);
            return;
        }
    }

    public static void event(String s)
    {
        event(s, null, null);
    }

    public static void event(String s, String s1)
    {
        event(s, s1, null);
    }

    public static void event(String s, String s1, String s2)
    {
        event(s, s1, s2, null);
    }

    public static void event(String s, String s1, String s2, Long long1)
    {
        if (!c)
        {
            return;
        } else
        {
    /* block-local class not found */
    class Event {}

            Event event1 = new Event(null);
            event1.a = s;
            event1.b = s1;
            event1.c = s2;
            event1.d = long1;
            a(event1);
            return;
        }
    }

    public static void init(Context context)
    {
        init(context, null);
    }

    public static void init(Context context, String as[])
    {
        if (!c)
        {
            return;
        }
        b.e.add(a(context, "UA-56747301-1"));
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                b.e.add(a(context, s));
            }

        }
        a.a().register(b);
    }

    public static void screen(String s)
    {
        if (!c)
        {
            return;
        } else
        {
    /* block-local class not found */
    class Screen {}

            Screen screen1 = new Screen(null);
            screen1.a = s;
            a(screen1);
            return;
        }
    }

    public static void setAppId(String s)
    {
        if (!c)
        {
            return;
        } else
        {
            b.d = s;
            return;
        }
    }

    public void on(Crash crash1)
    {
        if (c)
        {
            Iterator iterator = b.e.iterator();
            while (iterator.hasNext()) 
            {
                Tracker tracker = (Tracker)iterator.next();
                com.google.android.gms.analytics.HitBuilders.ExceptionBuilder exceptionbuilder = new com.google.android.gms.analytics.HitBuilders.ExceptionBuilder();
                if (!Strings.isNullOrEmpty(d))
                {
                    exceptionbuilder.setCustomDimension(1, d);
                }
                exceptionbuilder.setDescription((new StringBuilder()).append(crash1.a).append(" - ").append(Log.getStackTraceString(crash1.b)).toString());
                tracker.send(exceptionbuilder.build());
            }
        }
    }

    public void on(Event event1)
    {
        if (c)
        {
            Iterator iterator = b.e.iterator();
            while (iterator.hasNext()) 
            {
                Tracker tracker = (Tracker)iterator.next();
                com.google.android.gms.analytics.HitBuilders.EventBuilder eventbuilder = (new com.google.android.gms.analytics.HitBuilders.EventBuilder()).setCategory(event1.a);
                if (!Strings.isNullOrEmpty(event1.b))
                {
                    eventbuilder.setAction(event1.b);
                }
                if (!Strings.isNullOrEmpty(event1.c))
                {
                    eventbuilder.setLabel(event1.c);
                }
                if (event1.d != null)
                {
                    eventbuilder.setValue(event1.d.longValue());
                }
                if (!Strings.isNullOrEmpty(d))
                {
                    eventbuilder.setCustomDimension(1, d);
                }
                tracker.send(eventbuilder.build());
            }
        }
    }

    public void on(Screen screen1)
    {
        if (c)
        {
            Iterator iterator = b.e.iterator();
            while (iterator.hasNext()) 
            {
                Tracker tracker = (Tracker)iterator.next();
                tracker.setScreenName(screen1.a);
                com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder screenviewbuilder = new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder();
                if (!Strings.isNullOrEmpty(d))
                {
                    screenviewbuilder.setCustomDimension(1, d);
                }
                tracker.send(screenviewbuilder.build());
            }
        }
    }

    static 
    {
        a = MeridianLogger.forTag("MeridianAnalytics");
        try
        {
            Class.forName("com.google.android.gms.analytics.GoogleAnalytics");
            c = true;
            b = new MeridianAnalytics();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            a.d("com.google.android.gms.analytics.GoogleAnalytics not found, events will not be reported.");
        }
    }

    // Unreferenced inner class com/arubanetworks/meridian/internal/analytics/MeridianAnalytics$AnalyticsEvent
    /* block-local class not found */
    class AnalyticsEvent {}

}
