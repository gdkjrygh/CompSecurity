// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.weather.ads2.util.AdUtils;
import com.weather.util.device.RmidUtils;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

// Referenced classes of package com.weather.ads2.targeting:
//            UserIdQuerier, UserIdQueriers

private static final class <init>
    implements UserIdQuerier
{

    public String getDid()
    {
        return getId();
    }

    public String getFilteredId()
    {
        String s = AdUtils.getAdvertisingId();
        TwcPrefs.getInstance().putString(com.weather.util.prefs.ier, s);
        if (s == null)
        {
            s = null;
        } else
        {
            s = RmidUtils.getSHA1((new StringBuilder()).append(s).append("TWC").toString());
        }
        TwcPrefs.getInstance().putString(com.weather.util.prefs.ier, s);
        return s;
    }

    public String getId()
    {
        return AdUtils.getAdvertisingId();
    }

    public String getObfuscatedId()
    {
        return AdUtils.getObfuscatedAdvertisingId();
    }

    public String getSha1Id()
    {
        String s = AdUtils.getAdvertisingId();
        if (s == null)
        {
            return null;
        } else
        {
            return RmidUtils.getSHA1(s);
        }
    }

    public String getShortSha1Id()
    {
        String s = AdUtils.getAdvertisingIdWithoutDashes();
        if (s == null)
        {
            return null;
        } else
        {
            return RmidUtils.getSHA1(s);
        }
    }

    private A()
    {
    }

    A(A a)
    {
        this();
    }
}
