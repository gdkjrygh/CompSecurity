// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import com.google.android.gms.internal.zzbr;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzgf;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzd, AdRequestInfoParcel, zzi

public static final class mContext extends zzd
{

    private final Context mContext;

    public void zzfv()
    {
    }

    public zzi zzfw()
    {
        zzbr zzbr1 = new zzbr((String)zzbz.zztD.get());
        return zzgf.zza(mContext, zzbr1, zzge.zzfC());
    }

    public tInfoParcel(Context context, AdRequestInfoParcel adrequestinfoparcel, tInfoParcel tinfoparcel)
    {
        super(adrequestinfoparcel, tinfoparcel);
        mContext = context;
    }
}
