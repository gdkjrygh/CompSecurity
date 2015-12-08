// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.system;

import com.google.common.base.MoreObjects;
import com.weather.util.AbstractPostable;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class AppEvent extends AbstractPostable
{
    public static final class Cause extends Enum
    {

        private static final Cause $VALUES[];
        public static final Cause APP_CREATE;
        public static final Cause APP_START;
        public static final Cause APP_STOP;

        public static Cause valueOf(String s)
        {
            return (Cause)Enum.valueOf(com/weather/dal2/system/AppEvent$Cause, s);
        }

        public static Cause[] values()
        {
            return (Cause[])$VALUES.clone();
        }

        static 
        {
            APP_CREATE = new Cause("APP_CREATE", 0);
            APP_START = new Cause("APP_START", 1);
            APP_STOP = new Cause("APP_STOP", 2);
            $VALUES = (new Cause[] {
                APP_CREATE, APP_START, APP_STOP
            });
        }

        private Cause(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "AppEvent";
    private final Cause cause;

    public AppEvent(Cause cause1)
    {
        LogUtil.method("AppEvent", LoggingMetaTags.TWC_DAL, "AppEvent", new Object[] {
            cause1
        });
        cause = cause1;
    }

    public Cause getCause()
    {
        return cause;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("cause", cause).toString();
    }
}
