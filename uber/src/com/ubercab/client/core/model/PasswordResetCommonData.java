// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_PasswordResetCommonData

public abstract class PasswordResetCommonData
{

    public PasswordResetCommonData()
    {
    }

    public static PasswordResetCommonData newInstance(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            long l, String s8, String s9, Double double1, Double double2)
    {
        Shape_PasswordResetCommonData shape_passwordresetcommondata = new Shape_PasswordResetCommonData();
        shape_passwordresetcommondata.setAppName(s);
        shape_passwordresetcommondata.setDeviceId(s1);
        shape_passwordresetcommondata.setDeviceIMEI(s2);
        shape_passwordresetcommondata.setDeviceMobileDigits(s3);
        shape_passwordresetcommondata.setDeviceMobileCountryCode(s4);
        shape_passwordresetcommondata.setDeviceModel(s5);
        shape_passwordresetcommondata.setDeviceOS(s6);
        shape_passwordresetcommondata.setDeviceSerialNumber(s7);
        shape_passwordresetcommondata.setEpoch(l);
        shape_passwordresetcommondata.setLanguage(s8);
        shape_passwordresetcommondata.setVersion(s9);
        shape_passwordresetcommondata.setLatitude(double1);
        shape_passwordresetcommondata.setLongitude(double2);
        return shape_passwordresetcommondata;
    }

    public abstract String getAppName();

    public abstract String getDeviceIMEI();

    public abstract String getDeviceId();

    public abstract String getDeviceMobileCountryCode();

    public abstract String getDeviceMobileDigits();

    public abstract String getDeviceModel();

    public abstract String getDeviceOS();

    public abstract String getDeviceSerialNumber();

    public abstract long getEpoch();

    public abstract String getLanguage();

    public abstract Double getLatitude();

    public abstract Double getLongitude();

    public abstract String getVersion();

    public abstract PasswordResetCommonData setAppName(String s);

    public abstract PasswordResetCommonData setDeviceIMEI(String s);

    public abstract PasswordResetCommonData setDeviceId(String s);

    public abstract PasswordResetCommonData setDeviceMobileCountryCode(String s);

    public abstract PasswordResetCommonData setDeviceMobileDigits(String s);

    public abstract PasswordResetCommonData setDeviceModel(String s);

    public abstract PasswordResetCommonData setDeviceOS(String s);

    public abstract PasswordResetCommonData setDeviceSerialNumber(String s);

    public abstract PasswordResetCommonData setEpoch(long l);

    public abstract PasswordResetCommonData setLanguage(String s);

    public abstract PasswordResetCommonData setLatitude(Double double1);

    public abstract PasswordResetCommonData setLongitude(Double double1);

    public abstract PasswordResetCommonData setVersion(String s);
}
