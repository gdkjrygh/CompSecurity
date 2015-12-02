// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;


public final class IsForceUpgradeEvent
{

    private final boolean mIsForceUpgrade;

    public IsForceUpgradeEvent(boolean flag)
    {
        mIsForceUpgrade = flag;
    }

    public final boolean getIsForceUpgrade()
    {
        return mIsForceUpgrade;
    }
}
