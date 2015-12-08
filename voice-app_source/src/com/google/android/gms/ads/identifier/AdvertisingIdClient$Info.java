// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//            AdvertisingIdClient

public static final class zzoi
{

    private final String zzoh;
    private final boolean zzoi;

    public String getId()
    {
        return zzoh;
    }

    public boolean isLimitAdTrackingEnabled()
    {
        return zzoi;
    }

    public String toString()
    {
        return (new StringBuilder()).append("{").append(zzoh).append("}").append(zzoi).toString();
    }

    public (String s, boolean flag)
    {
        zzoh = s;
        zzoi = flag;
    }
}
