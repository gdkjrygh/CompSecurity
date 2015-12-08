// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.kofax.kmc.kui.uicontrols.data.Flash;

class .Flash
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[eraSource.FocusMode.values().length];
        try
        {
            b[eraSource.FocusMode.CONTINUOUS_PICTURE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[eraSource.FocusMode.CONTINUOUS_VIDEO.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[eraSource.FocusMode.INFINITY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[eraSource.FocusMode.AUTO.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[Flash.values().length];
        try
        {
            a[Flash.OFF.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[Flash.ON.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[Flash.TORCH.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[Flash.AUTO.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
