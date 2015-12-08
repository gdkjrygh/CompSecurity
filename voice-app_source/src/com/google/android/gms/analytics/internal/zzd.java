// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzc, zzf

public abstract class zzd extends zzc
{

    private boolean zzJA;
    private boolean zzJz;

    protected zzd(zzf zzf)
    {
        super(zzf);
    }

    public boolean isInitialized()
    {
        return zzJz && !zzJA;
    }

    public void zza()
    {
        zzhn();
        zzJz = true;
    }

    protected abstract void zzhn();

    protected void zzia()
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
