// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import java.util.EventObject;

public class StabilityDelayEvent extends EventObject
{

    private static final long serialVersionUID = 1L;
    private int a;

    public StabilityDelayEvent(Object obj, int i)
    {
        super(obj);
        a = i;
    }

    public final int getStability()
    {
        return a;
    }
}
