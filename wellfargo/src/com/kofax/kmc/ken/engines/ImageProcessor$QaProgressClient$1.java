// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.iplib.ProcessPageOutRep;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

// Referenced classes of package com.kofax.kmc.ken.engines:
//            ImageProcessor

class b
    implements Runnable
{

    final ProcessPageOutRep a;
    final int b;
    final b c;

    public void run()
    {
        c.c.b(ErrorInfo.KMC_SUCCESS, a.imageID, b);
    }

    A(A a1, ProcessPageOutRep processpageoutrep, int i)
    {
        c = a1;
        a = processpageoutrep;
        b = i;
        super();
    }
}
