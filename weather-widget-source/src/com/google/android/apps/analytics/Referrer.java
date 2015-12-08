// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


class Referrer
{

    private final int index;
    private final String referrer;
    private final long timeStamp;
    private final int visit;

    Referrer(String s, long l, int i, int j)
    {
        referrer = s;
        timeStamp = l;
        visit = i;
        index = j;
    }

    int getIndex()
    {
        return index;
    }

    String getReferrerString()
    {
        return referrer;
    }

    long getTimeStamp()
    {
        return timeStamp;
    }

    int getVisit()
    {
        return visit;
    }
}
