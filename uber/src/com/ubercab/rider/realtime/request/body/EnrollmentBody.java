// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_EnrollmentBody

public abstract class EnrollmentBody
{

    public EnrollmentBody()
    {
    }

    public static EnrollmentBody create()
    {
        return new Shape_EnrollmentBody();
    }

    public abstract String getDeviceId();

    public abstract String getHardwareSerialNumber();

    public abstract String getIccid();

    public abstract String getPushToken();

    public abstract String getPushTokenType();

    public abstract EnrollmentBody setDeviceId(String s);

    public abstract EnrollmentBody setHardwareSerialNumber(String s);

    public abstract EnrollmentBody setIccid(String s);

    public abstract EnrollmentBody setPushToken(String s);

    public abstract EnrollmentBody setPushTokenType(String s);
}
