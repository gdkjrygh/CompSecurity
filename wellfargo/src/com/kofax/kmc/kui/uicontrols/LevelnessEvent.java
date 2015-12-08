// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import java.util.EventObject;

public class LevelnessEvent extends EventObject
{

    private static final long serialVersionUID = 1L;
    private int a;
    private int b;

    public LevelnessEvent(Object obj, int i, int j)
    {
        super(obj);
        a = i;
        b = j;
    }

    public final int getPitch()
    {
        return a;
    }

    public final int getRoll()
    {
        return b;
    }
}
