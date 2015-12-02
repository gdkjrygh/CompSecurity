// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.metrics.analytics.model;

import gjy;
import idm;

class <init>
    implements idm
{

    gjy mCity;
    gjy mClient;
    gjy mClientStatus;
    gjy mEyeball;
    gjy mTrip;

    public <init> call(gjy gjy1, gjy gjy2, gjy gjy3, gjy gjy4, gjy gjy5)
    {
        mCity = gjy1;
        mClient = gjy2;
        mClientStatus = gjy3;
        mEyeball = gjy4;
        mTrip = gjy5;
        return this;
    }

    public volatile Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return call((gjy)obj, (gjy)obj1, (gjy)obj2, (gjy)obj3, (gjy)obj4);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
