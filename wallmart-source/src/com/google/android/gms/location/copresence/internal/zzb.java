// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.copresence.internal;

import android.content.Context;
import com.google.android.gms.location.internal.zzn;

// Referenced classes of package com.google.android.gms.location.copresence.internal:
//            CopresenceApiOptions, zzc

public class zzb
{

    private final Context mContext;
    private final String zzQE;
    private final String zzQl;
    private final zzn zzaCs;
    private final CopresenceApiOptions zzaCt;
    private zzc zzaCu;

    private zzb(Context context, String s, String s1, zzn zzn, CopresenceApiOptions copresenceapioptions)
    {
        mContext = context;
        zzQE = s;
        zzaCs = zzn;
        zzaCu = null;
        zzQl = s1;
        zzaCt = copresenceapioptions;
    }

    public static zzb zza(Context context, String s, String s1, zzn zzn, CopresenceApiOptions copresenceapioptions)
    {
        return new zzb(context, s, s1, zzn, copresenceapioptions);
    }
}
