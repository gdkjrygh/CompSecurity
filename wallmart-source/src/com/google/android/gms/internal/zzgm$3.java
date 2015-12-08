// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzgm, zzgo

static final class zzEP
    implements Runnable
{

    final zzgo zzEP;

    public void run()
    {
        zzEP.zzfJ();
        if (zzEP.zzfH() != null)
        {
            zzEP.zzfH().release();
        }
    }

    d(zzgo zzgo1)
    {
        zzEP = zzgo1;
        super();
    }
}
