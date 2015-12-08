// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbd, zzip

class zzrv
    implements Runnable
{

    final String zzru;
    final JSONObject zzrv;
    final zzbd zzrw;

    public void run()
    {
        zzbd.zza(zzrw).zza(zzru, zzrv);
    }

    (zzbd zzbd1, String s, JSONObject jsonobject)
    {
        zzrw = zzbd1;
        zzru = s;
        zzrv = jsonobject;
        super();
    }
}
