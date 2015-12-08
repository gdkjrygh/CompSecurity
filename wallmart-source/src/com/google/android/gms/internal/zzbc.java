// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzbd, zzbb, zzie, zzhu, 
//            zzan

public class zzbc
{

    public zzbc()
    {
    }

    private zzbb zza(Context context, VersionInfoParcel versioninfoparcel, zzie zzie1, zzan zzan)
    {
        context = new zzbd(context, versioninfoparcel, zzan);
        context.zza(new zzbb.zza(zzie1, context) {

            final zzie zzrp;
            final zzbc zzrs;
            final zzbb zzrt;

            public void zzcj()
            {
                zzrp.zzf(zzrt);
            }

            
            {
                zzrs = zzbc.this;
                zzrp = zzie1;
                zzrt = zzbb1;
                super();
            }
        });
        return context;
    }

    static zzbb zza(zzbc zzbc1, Context context, VersionInfoParcel versioninfoparcel, zzie zzie1, zzan zzan)
    {
        return zzbc1.zza(context, versioninfoparcel, zzie1, zzan);
    }

    public Future zza(Context context, VersionInfoParcel versioninfoparcel, String s, zzan zzan)
    {
        zzie zzie1 = new zzie();
        zzhu.zzHK.post(new Runnable(context, versioninfoparcel, zzie1, zzan, s) {

            final Context zzrn;
            final VersionInfoParcel zzro;
            final zzie zzrp;
            final zzan zzrq;
            final String zzrr;
            final zzbc zzrs;

            public void run()
            {
                zzbc.zza(zzrs, zzrn, zzro, zzrp, zzrq).zzt(zzrr);
            }

            
            {
                zzrs = zzbc.this;
                zzrn = context;
                zzro = versioninfoparcel;
                zzrp = zzie1;
                zzrq = zzan;
                zzrr = s;
                super();
            }
        });
        return zzie1;
    }
}
