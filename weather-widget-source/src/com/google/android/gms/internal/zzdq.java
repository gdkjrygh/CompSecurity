// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzdp, zzdr, zzip

public class zzdq
    implements Iterable
{

    private final List zzxu = new LinkedList();

    public zzdq()
    {
    }

    private zzdp zzc(zzip zzip)
    {
        for (Iterator iterator1 = zzp.zzbK().iterator(); iterator1.hasNext();)
        {
            zzdp zzdp1 = (zzdp)iterator1.next();
            if (zzdp1.zzoL == zzip)
            {
                return zzdp1;
            }
        }

        return null;
    }

    public Iterator iterator()
    {
        return zzxu.iterator();
    }

    public void zza(zzdp zzdp1)
    {
        zzxu.add(zzdp1);
    }

    public boolean zza(zzip zzip)
    {
        zzip = zzc(zzip);
        if (zzip != null)
        {
            ((zzdp) (zzip)).zzxr.abort();
            return true;
        } else
        {
            return false;
        }
    }

    public void zzb(zzdp zzdp1)
    {
        zzxu.remove(zzdp1);
    }

    public boolean zzb(zzip zzip)
    {
        return zzc(zzip) != null;
    }
}
