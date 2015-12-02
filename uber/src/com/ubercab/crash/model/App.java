// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash.model;


// Referenced classes of package com.ubercab.crash.model:
//            Shape_App

public abstract class App
{

    public App()
    {
    }

    public static App create(String s, String s1, String s2, String s3, String s4)
    {
        return (new Shape_App()).setType(s).setId(s1).setCrashedVersion(s2).setReportingVersion(s3).setBuildSku(s4);
    }

    public abstract String getBuildSku();

    public abstract String getCrashedVersion();

    public abstract String getId();

    public abstract String getReportingVersion();

    public abstract String getType();

    public abstract App setBuildSku(String s);

    public abstract App setCrashedVersion(String s);

    public abstract App setId(String s);

    public abstract App setReportingVersion(String s);

    public abstract App setType(String s);
}
