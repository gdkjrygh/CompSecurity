// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zze;

// Referenced classes of package com.google.android.gms.internal:
//            zzbe, zzdd, zzdi, zzdk, 
//            zzfc, zzbf

public interface zzbb
    extends zzbe
{
    public static interface zza
    {

        public abstract void zzcj();
    }


    public abstract void destroy();

    public abstract void zza(com.google.android.gms.ads.internal.client.zza zza1, zzg zzg, zzdd zzdd, zzn zzn, boolean flag, zzdi zzdi, zzdk zzdk, 
            zze zze, zzfc zzfc);

    public abstract void zza(zza zza1);

    public abstract zzbf zzci();

    public abstract void zzs(String s);

    public abstract void zzt(String s);

    public abstract void zzu(String s);
}
