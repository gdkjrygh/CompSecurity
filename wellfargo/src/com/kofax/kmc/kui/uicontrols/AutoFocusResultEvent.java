// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import java.util.EventObject;

public class AutoFocusResultEvent extends EventObject
{

    private static final long serialVersionUID = 1L;
    private boolean a;

    public AutoFocusResultEvent(Object obj, boolean flag)
    {
        super(obj);
        a = flag;
    }

    public final boolean getSuccess()
    {
        return a;
    }
}
