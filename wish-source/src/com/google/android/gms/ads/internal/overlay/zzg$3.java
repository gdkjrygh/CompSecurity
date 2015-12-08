// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

class zzwX extends HashMap
{

    final zzg zzwU;
    final float zzwV;
    final int zzwW;
    final int zzwX;

    (zzg zzg1, float f, int i, int j)
    {
        zzwU = zzg1;
        zzwV = f;
        zzwW = i;
        zzwX = j;
        super();
        put("duration", String.valueOf(zzwV));
        put("videoWidth", String.valueOf(zzwW));
        put("videoHeight", String.valueOf(zzwX));
    }
}
