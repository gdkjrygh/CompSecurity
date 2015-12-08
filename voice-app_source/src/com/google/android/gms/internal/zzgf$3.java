// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzgf, zzgh

static final class zzDz
    implements Runnable
{

    final zzgh zzDz;

    public void run()
    {
        zzDz.zzfF();
        if (zzDz.zzfD() != null)
        {
            zzDz.zzfD().release();
        }
    }

    d(zzgh zzgh1)
    {
        zzDz = zzgh1;
        super();
    }
}
