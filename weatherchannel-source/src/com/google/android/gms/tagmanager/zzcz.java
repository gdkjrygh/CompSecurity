// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzca, zzdf

abstract class zzcz extends zzca
{

    public zzcz(String s)
    {
        super(s);
    }

    protected boolean zza(com.google.android.gms.internal.zzag.zza zza1, com.google.android.gms.internal.zzag.zza zza2, Map map)
    {
        zza1 = zzdf.zzg(zza1);
        zza2 = zzdf.zzg(zza2);
        if (zza1 == zzdf.zzzP() || zza2 == zzdf.zzzP())
        {
            return false;
        } else
        {
            return zza(((String) (zza1)), ((String) (zza2)), map);
        }
    }

    protected abstract boolean zza(String s, String s1, Map map);
}
