// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;


// Referenced classes of package com.ubercab.crash.model:
//            Shape_Device

public abstract class Device
{

    public Device()
    {
    }

    public static Device create(String s, String s1, String s2, String s3, String s4, String s5, Boolean boolean1)
    {
        return (new Shape_Device()).setLocale(s).setManufacturer(s1).setModel(s2).setOsType(s3).setOsVersion(s4).setUuid(s5).setIsRooted(boolean1);
    }

    public abstract Boolean getIsRooted();

    public abstract String getLocale();

    public abstract String getManufacturer();

    public abstract String getModel();

    public abstract String getOsType();

    public abstract String getOsVersion();

    public abstract String getUuid();

    public abstract Device setIsRooted(Boolean boolean1);

    public abstract Device setLocale(String s);

    public abstract Device setManufacturer(String s);

    public abstract Device setModel(String s);

    public abstract Device setOsType(String s);

    public abstract Device setOsVersion(String s);

    public abstract Device setUuid(String s);
}
