// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.adobe.mobile:
//            MediaSettings, StaticMethods, MediaAnalytics

public final class Media
{
    public static interface MediaCallback
    {

        public abstract void call(Object obj);
    }


    private static final String NO_ANALYTICS_MESSAGE = "Analytics - ADBMobile is not configured correctly to use Analytics.";

    public Media()
    {
    }

    public static MediaSettings adSettingsWith(String s, double d, String s1, String s2, String s3, double d1, 
            String s4)
    {
        return MediaSettings.adSettingsWith(s, d, s1, s2, s3, d1, s4);
    }

    public static void click(String s, double d)
    {
        StaticMethods.getMediaExecutor().execute(new Runnable(s, d) {

            final String val$name;
            final double val$offset;

            public void run()
            {
                MediaAnalytics.sharedInstance().click(name, offset);
            }

            
            {
                name = s;
                offset = d;
                super();
            }
        });
    }

    public static void close(String s)
    {
        StaticMethods.getMediaExecutor().execute(new Runnable(s) {

            final String val$name;

            public void run()
            {
                MediaAnalytics.sharedInstance().close(name);
            }

            
            {
                name = s;
                super();
            }
        });
    }

    public static void complete(String s, double d)
    {
        StaticMethods.getMediaExecutor().execute(new Runnable(s, d) {

            final String val$name;
            final double val$offset;

            public void run()
            {
                MediaAnalytics.sharedInstance().complete(name, offset);
            }

            
            {
                name = s;
                offset = d;
                super();
            }
        });
    }

    public static void open(MediaSettings mediasettings, MediaCallback mediacallback)
    {
        StaticMethods.getMediaExecutor().execute(new Runnable(mediasettings, mediacallback) {

            final MediaCallback val$callback;
            final MediaSettings val$settings;

            public void run()
            {
                MediaAnalytics.sharedInstance().open(settings, callback);
            }

            
            {
                settings = mediasettings;
                callback = mediacallback;
                super();
            }
        });
    }

    public static void play(String s, double d)
    {
        StaticMethods.getMediaExecutor().execute(new Runnable(s, d) {

            final String val$name;
            final double val$offset;

            public void run()
            {
                MediaAnalytics.sharedInstance().play(name, offset);
            }

            
            {
                name = s;
                offset = d;
                super();
            }
        });
    }

    public static MediaSettings settingsWith(String s, double d, String s1, String s2)
    {
        return MediaSettings.settingsWith(s, d, s1, s2);
    }

    public static void stop(String s, double d)
    {
        StaticMethods.getMediaExecutor().execute(new Runnable(s, d) {

            final String val$name;
            final double val$offset;

            public void run()
            {
                MediaAnalytics.sharedInstance().stop(name, offset);
            }

            
            {
                name = s;
                offset = d;
                super();
            }
        });
    }

    public static void track(String s, Map map)
    {
        MediaAnalytics.sharedInstance().setTrackCalledOnItem(s);
        if (map != null)
        {
            map = new HashMap(map);
        } else
        {
            map = null;
        }
        StaticMethods.getMediaExecutor().execute(new Runnable(s, map) {

            final Map val$fdata;
            final String val$name;

            public void run()
            {
                MediaAnalytics.sharedInstance().track(name, fdata);
            }

            
            {
                name = s;
                fdata = map;
                super();
            }
        });
    }
}
