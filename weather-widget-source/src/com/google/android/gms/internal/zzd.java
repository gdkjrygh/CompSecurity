// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzo, zzr

public class zzd
    implements zzo
{

    private int zzo;
    private int zzp;
    private final int zzq;
    private final float zzr;

    public zzd()
    {
        this(2500, 1, 1.0F);
    }

    public zzd(int i, int j, float f)
    {
        zzo = i;
        zzq = j;
        zzr = f;
    }

    public void zza(zzr zzr1)
        throws zzr
    {
        zzp = zzp + 1;
        zzo = (int)((float)zzo + (float)zzo * zzr);
        if (!zzf())
        {
            throw zzr1;
        } else
        {
            return;
        }
    }

    public int zzd()
    {
        return zzo;
    }

    public int zze()
    {
        return zzp;
    }

    protected boolean zzf()
    {
        return zzp <= zzq;
    }
}
