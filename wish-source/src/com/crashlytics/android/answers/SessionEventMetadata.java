// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;


final class SessionEventMetadata
{

    public final String advertisingId;
    public final String androidId;
    public final String appBundleId;
    public final String appVersionCode;
    public final String appVersionName;
    public final String betaDeviceToken;
    public final String buildId;
    public final String deviceModel;
    public final String executionId;
    public final String installationId;
    public final Boolean limitAdTrackingEnabled;
    public final String osVersion;
    private String stringRepresentation;

    public SessionEventMetadata(String s, String s1, String s2, String s3, String s4, Boolean boolean1, String s5, 
            String s6, String s7, String s8, String s9, String s10)
    {
        appBundleId = s;
        executionId = s1;
        installationId = s2;
        androidId = s3;
        advertisingId = s4;
        limitAdTrackingEnabled = boolean1;
        betaDeviceToken = s5;
        buildId = s6;
        osVersion = s7;
        deviceModel = s8;
        appVersionCode = s9;
        appVersionName = s10;
    }

    public String toString()
    {
        if (stringRepresentation == null)
        {
            stringRepresentation = (new StringBuilder()).append("appBundleId=").append(appBundleId).append(", executionId=").append(executionId).append(", installationId=").append(installationId).append(", androidId=").append(androidId).append(", advertisingId=").append(advertisingId).append(", limitAdTrackingEnabled=").append(limitAdTrackingEnabled).append(", betaDeviceToken=").append(betaDeviceToken).append(", buildId=").append(buildId).append(", osVersion=").append(osVersion).append(", deviceModel=").append(deviceModel).append(", appVersionCode=").append(appVersionCode).append(", appVersionName=").append(appVersionName).toString();
        }
        return stringRepresentation;
    }
}
