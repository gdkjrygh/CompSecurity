// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzdp, zzdr, zzid

public class zzdq
    implements Iterable
{

    private final List zzwE = new LinkedList();

    public zzdq()
    {
    }

    private zzdp zzc(zzid zzid)
    {
        for (Iterator iterator1 = zzo.zzbH().iterator(); iterator1.hasNext();)
        {
            zzdp zzdp1 = (zzdp)iterator1.next();
            if (zzdp1.zzoA == zzid)
            {
                return zzdp1;
            }
        }

        return null;
    }

    public Iterator iterator()
    {
        return zzwE.iterator();
    }

    public void zza(zzdp zzdp1)
    {
        zzwE.add(zzdp1);
    }

    public boolean zza(zzid zzid)
    {
        zzid = zzc(zzid);
        if (zzid != null)
        {
            ((zzdp) (zzid)).zzwB.abort();
            return true;
        } else
        {
            return false;
        }
    }

    public void zzb(zzdp zzdp1)
    {
        zzwE.remove(zzdp1);
    }

    public boolean zzb(zzid zzid)
    {
        return zzc(zzid) != null;
    }
}
