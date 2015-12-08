// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.targeting;

import com.weather.ads2.util.AdUtils;
import com.weather.ads2.util.AndroidIdUtils;
import com.weather.util.TwcPreconditions;
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
        TwcPreconditions.checkNotOnMainThread();
        String s = AndroidIdUtils.getHashedAndroidId();
        TwcPrefs.getInstance().putString(com.weather.util.prefs.dId, s);
        return s;
    }

    public String getId()
    {
        TwcPreconditions.checkNotOnMainThread();
        return AdUtils.getSha1AndroidId();
    }

    public String getObfuscatedId()
    {
        TwcPreconditions.checkNotOnMainThread();
        return AndroidIdUtils.getObfuscatedAndroidId();
    }

    public String getSha1Id()
    {
        TwcPreconditions.checkNotOnMainThread();
        return getId();
    }

    public String getShortSha1Id()
    {
        TwcPreconditions.checkNotOnMainThread();
        return getId();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
