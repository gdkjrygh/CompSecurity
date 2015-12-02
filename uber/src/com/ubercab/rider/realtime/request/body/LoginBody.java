// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.request.param.DeviceData;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_LoginBody

public abstract class LoginBody
{

    public LoginBody()
    {
    }

    public static LoginBody create()
    {
        return new Shape_LoginBody();
    }

    public abstract DeviceData getDeviceData();

    public abstract String getPassword();

    public abstract String getUsername();

    public abstract LoginBody setDeviceData(DeviceData devicedata);

    public abstract LoginBody setPassword(String s);

    public abstract LoginBody setUsername(String s);
}
