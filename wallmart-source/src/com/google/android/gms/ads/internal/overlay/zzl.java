// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import com.google.android.gms.internal.zzcc;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzip;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzj, zzc, zzp, zzi

public class zzl
    implements zzj
{

    public zzl()
    {
    }

    public zzi zza(Context context, zzip zzip1, int i, zzcd zzcd, zzcc zzcc)
    {
        return new zzc(context, new zzp(context, zzip1.zzgV(), zzip1.getRequestId(), zzcd, zzcc));
    }
}
