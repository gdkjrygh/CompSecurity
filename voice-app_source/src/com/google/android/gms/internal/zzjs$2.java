// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.cast.internal.zzo;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzjs, zzjv

class a extends a
{

    final zzjs zzTB;
    final int zzTD;
    final String zzTE;
    final JSONObject zzTF;

    public void execute()
    {
        int i = zzjv.zzaJ(zzTD);
        if (i == 0)
        {
            zzlA().zza(-1L, 2001, null);
            zzjs.zzlz().zzf("sendPlayerRequest for unsupported playerState: %d", new Object[] {
                Integer.valueOf(zzTD)
            });
            return;
        } else
        {
            zzjs.zza(zzTB, zzTE, i, zzTF, zzlA());
            return;
        }
    }

    l(zzjs zzjs1, int i, String s, JSONObject jsonobject)
    {
        zzTB = zzjs1;
        zzTD = i;
        zzTE = s;
        zzTF = jsonobject;
        super(zzjs1);
    }
}
