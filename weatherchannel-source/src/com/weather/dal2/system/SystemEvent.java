// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.system;

import com.google.common.base.MoreObjects;
import com.weather.util.AbstractPostable;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

public class SystemEvent extends AbstractPostable
{
    public static final class Cause extends Enum
    {

        private static final Cause $VALUES[];
        public static final Cause BOOT;
        public static final Cause LBS_PROVIDER_CHANGED;
        public static final Cause LOCALE_CHANGED;
        public static final Cause NETWORK_DOWN;
        public static final Cause NETWORK_UP;
        public static final Cause POWER_CONNECTED;
        public static final Cause POWER_DISCONNECTED;
        public static final Cause USER_PRESENT;

        public static Cause valueOf(String s)
        {
            return (Cause)Enum.valueOf(com/weather/dal2/system/SystemEvent$Cause, s);
        }

        public static Cause[] values()
        {
            return (Cause[])$VALUES.clone();
        }

        static 
        {
            BOOT = new Cause("BOOT", 0);
            LOCALE_CHANGED = new Cause("LOCALE_CHANGED", 1);
            USER_PRESENT = new Cause("USER_PRESENT", 2);
            POWER_CONNECTED = new Cause("POWER_CONNECTED", 3);
            POWER_DISCONNECTED = new Cause("POWER_DISCONNECTED", 4);
            LBS_PROVIDER_CHANGED = new Cause("LBS_PROVIDER_CHANGED", 5);
            NETWORK_DOWN = new Cause("NETWORK_DOWN", 6);
            NETWORK_UP = new Cause("NETWORK_UP", 7);
            $VALUES = (new Cause[] {
                BOOT, LOCALE_CHANGED, USER_PRESENT, POWER_CONNECTED, POWER_DISCONNECTED, LBS_PROVIDER_CHANGED, NETWORK_DOWN, NETWORK_UP
            });
        }

        private Cause(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "SystemEvent";
    private final Cause cause;

    public SystemEvent(Cause cause1)
    {
        LogUtil.method("SystemEvent", LoggingMetaTags.TWC_DAL, "SystemEvent", new Object[] {
            cause1
        });
        cause = cause1;
    }

    public boolean equals(Object obj)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                boolean flag = flag1;
                if (obj != null)
                {
                    flag = flag1;
                    if (getClass() == obj.getClass())
                    {
                        obj = (SystemEvent)obj;
                        if (eventOrigin == null)
                        {
                            break label0;
                        }
                        if (((SystemEvent) (obj)).getCause() != cause || !eventOrigin.equals(((SystemEvent) (obj)).getOriginTag()))
                        {
                            break label1;
                        }
                        flag = true;
                    }
                }
                return flag;
            }
            return false;
        }
        return ((SystemEvent) (obj)).getCause() == cause && ((SystemEvent) (obj)).getOriginTag() == null;
    }

    public Cause getCause()
    {
        return cause;
    }

    public int hashCode()
    {
        int j = cause.hashCode();
        int i;
        if (eventOrigin != null)
        {
            i = eventOrigin.hashCode();
        } else
        {
            i = 0;
        }
        return (j + 0) * 31 + i;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("cause", cause).toString();
    }
}
