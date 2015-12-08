// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;


public class MetricBuildInfo
{

    private final String appCommitHash;
    private final String appVersionName;
    private final String buildType;
    private final String jenkinsJobNumber;

    public MetricBuildInfo(String s, String s1, String s2, String s3)
    {
        appVersionName = s;
        appCommitHash = s1;
        jenkinsJobNumber = s2;
        buildType = s3;
    }

    public String getAppCommitHash()
    {
        return appCommitHash;
    }

    public String getAppVersionName()
    {
        return appVersionName;
    }

    public String getBuildType()
    {
        return buildType;
    }

    public String getJenkinsJobNumber()
    {
        return jenkinsJobNumber;
    }
}
