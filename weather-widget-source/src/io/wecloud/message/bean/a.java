// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.bean;


public class a
{

    public String a;
    public String b;
    public int c;
    public int d;
    public String e;
    public String f;

    public a()
    {
        a = "";
        b = "";
        e = "";
        f = "";
    }

    public String toString()
    {
        return (new StringBuilder("AppInfo [mPackageName=")).append(a).append(", mAppName=").append(b).append(", mPushSdkVersion=").append(c).append(", mVersionCode=").append(d).append(", mVersionName=").append(e).append(", mAppKey=").append(f).append("]").toString();
    }
}
