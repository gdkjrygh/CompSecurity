// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf, zzp

private class <init>
    implements zzbf
{

    final zzp zzaPt;

    public void zzB(Object obj)
    {
        zza((com.google.android.gms.internal.)obj);
    }

    public void zza(com.google.android.gms.internal. )
    {
        com.google.android.gms.internal. 1;
        if (.zzaTu != null)
        {
            1 = .zzaTu;
        } else
        {
            com.google.android.gms.internal. 2 = .zziR;
            1 = new com.google.android.gms.internal.();
            1.zziR = 2;
            1.zziQ = null;
            1.zziS = 2.version;
        }
        zzp.zza(zzaPt, 1, .zzaTt, true);
    }

    public void zza( )
    {
        if (!zzp.zzh(zzaPt))
        {
            zzp.zza(zzaPt, 0L);
        }
    }

    public void zzzL()
    {
    }

    private (zzp zzp1)
    {
        zzaPt = zzp1;
        super();
    }

    zzaPt(zzp zzp1, zzaPt zzapt)
    {
        this(zzp1);
    }
}
