// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ImageProcessor

class b
{

    public ErrorInfo a;
    public boolean b;
    final ImageProcessor c;

    public (ImageProcessor imageprocessor, ErrorInfo errorinfo, boolean flag)
    {
        c = imageprocessor;
        super();
        a = ErrorInfo.KMC_SUCCESS;
        b = false;
        a = errorinfo;
        b = flag;
    }
}
