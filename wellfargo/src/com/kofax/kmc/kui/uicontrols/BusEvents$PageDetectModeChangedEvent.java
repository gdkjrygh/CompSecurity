// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.kofax.kmc.kui.uicontrols.data.PageDetectMode;

public final class mode
{

    public final PageDetectMode mode;

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(". Mode: ").append(mode).toString();
    }

    public (PageDetectMode pagedetectmode)
    {
        mode = pagedetectmode;
    }
}
