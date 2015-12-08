// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.log;

import android.util.Log;

// Referenced classes of package com.weather.util.log:
//            LoggabilityProvider

public class SystemLoggabilityProvider
    implements LoggabilityProvider
{

    public SystemLoggabilityProvider()
    {
    }

    public boolean isLoggable(String s, int i)
    {
        return Log.isLoggable(s, i);
    }
}
