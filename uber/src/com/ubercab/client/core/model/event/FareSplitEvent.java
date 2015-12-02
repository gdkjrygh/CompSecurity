// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import com.ubercab.client.core.model.FareSplit;

public final class FareSplitEvent
{

    private final FareSplit mFareSplit;

    public FareSplitEvent(FareSplit faresplit)
    {
        mFareSplit = faresplit;
    }

    public final FareSplit getFareSplit()
    {
        return mFareSplit;
    }
}
