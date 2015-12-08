// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzho, zza

class  extends zzab
{

    final zzho zzGx;
    final Map zzGy;

    public Map getHeaders()
        throws zza
    {
        if (zzGy == null)
        {
            return super.getHeaders();
        } else
        {
            return zzGy;
        }
    }

    (zzho zzho1, String s,  ,  1, Map map)
    {
        zzGx = zzho1;
        zzGy = map;
        super(s, , 1);
    }
}
