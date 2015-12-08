// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

class 
{

    static final int a[];

    static 
    {
        a = new int[ErrorInfo.values().length];
        try
        {
            a[ErrorInfo.KMC_GN_FILE_NOT_FOUND.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            a[ErrorInfo.KMC_ED_NONEXISTENT_FILE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[ErrorInfo.KMC_GN_OUT_OF_MEMORY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[ErrorInfo.KMC_ED_FILE_STILL_REMAINS.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ErrorInfo.KMC_ED_FILE_EXISTS.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ErrorInfo.KMC_EV_PROCESS_PAGE_BUSY.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
