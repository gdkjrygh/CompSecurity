// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzc, zzf

public abstract class zzd extends zzc
{

    private boolean zzLA;
    private boolean zzLz;

    protected zzd(zzf zzf)
    {
        super(zzf);
    }

    public boolean isInitialized()
    {
        return zzLz && !zzLA;
    }

    public void zza()
    {
        zzhB();
        zzLz = true;
    }

    protected abstract void zzhB();

    protected void zzio()
    {
        if (!isInitialized())
        {
            throw new IllegalStateException("Not initialized");
        } else
        {
            return;
        }
    }
}
