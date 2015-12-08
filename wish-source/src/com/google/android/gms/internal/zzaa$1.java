// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzaa, zzgd

class zzoO
    implements Runnable
{

    final String zzoN;
    final JSONObject zzoO;
    final zzaa zzoP;

    public void run()
    {
        zzaa.zza(zzoP).zza(zzoN, zzoO);
    }

    (zzaa zzaa1, String s, JSONObject jsonobject)
    {
        zzoP = zzaa1;
        zzoN = s;
        zzoO = jsonobject;
        super();
    }
}
