// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import java.io.Serializable;

public class LbsState
    implements Serializable
{

    private static final long serialVersionUID = 0xf89907981755e6f1L;
    private int activatorWidgetId;
    private boolean isAwaitingActivation;

    LbsState()
    {
        isAwaitingActivation = false;
    }

    public LbsState(LbsState lbsstate)
    {
        activatorWidgetId = lbsstate.activatorWidgetId;
        isAwaitingActivation = lbsstate.isAwaitingActivation;
    }

    public int getActivatorWidgetId()
    {
        return activatorWidgetId;
    }

    public boolean isAwaitingActivation()
    {
        return isAwaitingActivation;
    }

    public void setActivatorWidgetId(int i)
    {
        activatorWidgetId = i;
    }

    public void setWaitingActivation(boolean flag)
    {
        isAwaitingActivation = flag;
    }
}
