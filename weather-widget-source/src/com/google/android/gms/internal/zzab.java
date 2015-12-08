// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            zzk, zzi, zzx, zzm

public class zzab extends zzk
{

    private final zzm.zzb zzaG;

    public zzab(int i, String s, zzm.zzb zzb, zzm.zza zza1)
    {
        super(i, s, zza1);
        zzaG = zzb;
    }

    public zzab(String s, zzm.zzb zzb, zzm.zza zza1)
    {
        this(0, s, zzb, zza1);
    }

    protected zzm zza(zzi zzi1)
    {
        String s;
        try
        {
            s = new String(zzi1.data, zzx.zza(zzi1.zzA));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(zzi1.data);
        }
        return zzm.zza(s, zzx.zzb(zzi1));
    }

    protected void zza(Object obj)
    {
        zzi((String)obj);
    }

    protected void zzi(String s)
    {
        zzaG.zzb(s);
    }
}
