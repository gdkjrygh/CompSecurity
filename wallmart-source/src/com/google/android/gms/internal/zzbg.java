// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbf, zzbe, zzdg

public class zzbg
    implements zzbf
{

    private final zzbe zzrA;
    private final HashSet zzrB = new HashSet();

    public zzbg(zzbe zzbe1)
    {
        zzrA = zzbe1;
    }

    public void zza(String s, zzdg zzdg1)
    {
        zzrA.zza(s, zzdg1);
        zzrB.add(new java.util.AbstractMap.SimpleEntry(s, zzdg1));
    }

    public void zza(String s, String s1)
    {
        zzrA.zza(s, s1);
    }

    public void zza(String s, JSONObject jsonobject)
    {
        zzrA.zza(s, jsonobject);
    }

    public void zzb(String s, zzdg zzdg1)
    {
        zzrA.zzb(s, zzdg1);
        zzrB.remove(new java.util.AbstractMap.SimpleEntry(s, zzdg1));
    }

    public void zzb(String s, JSONObject jsonobject)
    {
        zzrA.zzb(s, jsonobject);
    }

    public void zzck()
    {
        java.util.AbstractMap.SimpleEntry simpleentry;
        for (Iterator iterator = zzrB.iterator(); iterator.hasNext(); zzrA.zzb((String)simpleentry.getKey(), (zzdg)simpleentry.getValue()))
        {
            simpleentry = (java.util.AbstractMap.SimpleEntry)iterator.next();
            com.google.android.gms.ads.internal.util.client.zzb.v((new StringBuilder()).append("Unregistering eventhandler: ").append(((zzdg)simpleentry.getValue()).toString()).toString());
        }

        zzrB.clear();
    }
}
