// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.log;

import com.google.common.collect.Maps;
import java.util.Map;

// Referenced classes of package com.weather.util.log:
//            LoggabilityProvider

public class DebugLoggabilityProvider
    implements LoggabilityProvider
{

    private final Map levels = Maps.newHashMap();

    public DebugLoggabilityProvider()
    {
    }

    public int getLevel(String s)
    {
        s = (Integer)levels.get(s);
        if (s == null)
        {
            return 4;
        } else
        {
            return s.intValue();
        }
    }

    public boolean isLoggable(String s, int i)
    {
        return getLevel(s) <= i;
    }

    public int putLevel(String s, int i)
    {
        s = (Integer)levels.put(s, Integer.valueOf(i));
        if (s == null)
        {
            return 4;
        } else
        {
            return s.intValue();
        }
    }
}
