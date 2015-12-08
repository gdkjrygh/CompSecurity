// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbd, zzid

class zzrc
    implements Runnable
{

    final String zzrb;
    final JSONObject zzrc;
    final zzbd zzrd;

    public void run()
    {
        zzbd.zza(zzrd).zza(zzrb, zzrc);
    }

    (zzbd zzbd1, String s, JSONObject jsonobject)
    {
        zzrd = zzbd1;
        zzrb = s;
        zzrc = jsonobject;
        super();
    }
}
