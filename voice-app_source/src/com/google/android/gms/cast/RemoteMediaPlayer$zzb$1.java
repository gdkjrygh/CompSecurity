// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class zzTb
    implements zzo
{

    final n zzTb;

    public void zza(long l, int i, Object obj)
    {
        if (obj instanceof JSONObject)
        {
            obj = (JSONObject)obj;
        } else
        {
            obj = null;
        }
        zzTb.tResult(new nit>(new Status(i), ((JSONObject) (obj))));
    }

    public void zzy(long l)
    {
        zzTb.tResult(zzTb.n(new Status(2103)));
    }

    _cls9(_cls9 _pcls9)
    {
        zzTb = _pcls9;
        super();
    }
}
