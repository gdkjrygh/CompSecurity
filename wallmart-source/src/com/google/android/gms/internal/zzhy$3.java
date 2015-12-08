// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzhy, zza

class  extends zzab
{

    final zzhy zzIi;
    final Map zzIj;

    public Map getHeaders()
        throws zza
    {
        if (zzIj == null)
        {
            return super.getHeaders();
        } else
        {
            return zzIj;
        }
    }

    (zzhy zzhy1, String s,  ,  1, Map map)
    {
        zzIi = zzhy1;
        zzIj = map;
        super(s, , 1);
    }
}
