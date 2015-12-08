// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            zzek, zzbe

class zzyH
    implements a
{

    final zzek zzyD;
    final String zzyE;
    final Integer zzyF;
    final Integer zzyG;
    final int zzyH;

    public zzbe zza(Drawable drawable)
    {
        Integer integer = null;
        if (drawable == null || TextUtils.isEmpty(zzyE))
        {
            return null;
        }
        String s = zzyE;
        Integer integer1 = zzyF;
        Integer integer2 = zzyG;
        if (zzyH > 0)
        {
            integer = Integer.valueOf(zzyH);
        }
        return new zzbe(s, drawable, integer1, integer2, integer);
    }

    public Object zzb(Object obj)
    {
        return zza((Drawable)obj);
    }

    a(zzek zzek1, String s, Integer integer, Integer integer1, int i)
    {
        zzyD = zzek1;
        zzyE = s;
        zzyF = integer;
        zzyG = integer1;
        zzyH = i;
        super();
    }
}
