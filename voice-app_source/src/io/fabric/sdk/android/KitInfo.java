// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;


public class KitInfo
{

    private final String buildType;
    private final String identifier;
    private final String version;

    public KitInfo(String s, String s1, String s2)
    {
        identifier = s;
        version = s1;
        buildType = s2;
    }

    public String getBuildType()
    {
        return buildType;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public String getVersion()
    {
        return version;
    }
}
