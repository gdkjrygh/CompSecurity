// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_DeviceTokensBody

public abstract class DeviceTokensBody
{

    public DeviceTokensBody()
    {
    }

    public static DeviceTokensBody create()
    {
        return new Shape_DeviceTokensBody();
    }

    public abstract String getCertificate();

    public abstract String getDeviceToken();

    public abstract String getDeviceTokenType();

    public abstract DeviceTokensBody setCertificate(String s);

    public abstract DeviceTokensBody setDeviceToken(String s);

    public abstract DeviceTokensBody setDeviceTokenType(String s);
}
