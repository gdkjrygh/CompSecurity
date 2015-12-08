// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


public final class stability
{

    public final int stability;
    public final boolean stable;

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(".  Stability: ").append(stability).append(", Stable: ").append(stable).toString();
    }

    public (boolean flag, int i)
    {
        stable = flag;
        stability = i;
    }
}
