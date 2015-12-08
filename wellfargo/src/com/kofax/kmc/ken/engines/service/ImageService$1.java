// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.service;


class e
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[eableImageMemoryLimit.values().length];
        try
        {
            b[eableImageMemoryLimit.LARGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[eableImageMemoryLimit.MAXIMUM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            b[eableImageMemoryLimit.NORMAL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        a = new int[com.kofax.kmc.ken.engines.data.Type.values().length];
        try
        {
            a[com.kofax.kmc.ken.engines.data.Type.MIMETYPE_JPEG.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.kofax.kmc.ken.engines.data.Type.MIMETYPE_TIFF.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.kofax.kmc.ken.engines.data.Type.MIMETYPE_PNG.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
