// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import com.ubercab.client.core.model.FareInfo;

public final class FareInfoEvent
{

    private final FareInfo mFareInfo;

    public FareInfoEvent(FareInfo fareinfo)
    {
        mFareInfo = fareinfo;
    }

    public final FareInfo getFareInfo()
    {
        return mFareInfo;
    }
}
