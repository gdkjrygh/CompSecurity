// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EventObject;

public class c extends EventObject
{

    private static final long serialVersionUID = 0x7cff5eb92390c22aL;
    private ErrorInfo a;
    private String b;
    private int c;

    public String getImageID()
    {
        return b;
    }

    public int getProgressPct()
    {
        return c;
    }

    public ErrorInfo getStatus()
    {
        return a;
    }

    public (Object obj, ErrorInfo errorinfo, String s, int i)
    {
        super(obj);
        a = errorinfo;
        b = s;
        c = i;
    }
}
