// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


class Hit
{

    private final long hitId;
    private String hitString;
    private final long hitTime;
    private String hitUrl;

    Hit(String s, long l, long l1)
    {
        hitString = s;
        hitId = l;
        hitTime = l1;
    }

    long getHitId()
    {
        return hitId;
    }

    String getHitParams()
    {
        return hitString;
    }

    long getHitTime()
    {
        return hitTime;
    }

    public String getHitUrl()
    {
        return hitUrl;
    }

    void setHitString(String s)
    {
        hitString = s;
    }

    public void setHitUrl(String s)
    {
        hitUrl = s;
    }
}
