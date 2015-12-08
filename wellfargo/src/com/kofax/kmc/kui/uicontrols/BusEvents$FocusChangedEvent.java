// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;


public final class focused
{

    public final boolean focused;

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(".  Focused: ").append(focused).toString();
    }

    public (boolean flag)
    {
        focused = flag;
    }
}
