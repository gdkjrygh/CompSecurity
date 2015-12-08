// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzr

public class zzm
{
    public static interface zza
    {

        public abstract void zze(zzr zzr);
    }

    public static interface zzb
    {

        public abstract void zzb(Object obj);
    }


    public final Object result;
    public final zzb.zza zzag;
    public final zzr zzah;
    public boolean zzai;

    private zzm(zzr zzr)
    {
        zzai = false;
        result = null;
        zzag = null;
        zzah = zzr;
    }

    private zzm(Object obj, zzb.zza zza1)
    {
        zzai = false;
        result = obj;
        zzag = zza1;
        zzah = null;
    }

    public static zzm zza(Object obj, zzb.zza zza1)
    {
        return new zzm(obj, zza1);
    }

    public static zzm zzd(zzr zzr)
    {
        return new zzm(zzr);
    }

    public boolean isSuccess()
    {
        return zzah == null;
    }
}
