// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzbu

public class zzbv
{

    private final Collection zztR = new ArrayList();
    private final Collection zztS = new ArrayList();
    private final Collection zztT = new ArrayList();

    public zzbv()
    {
    }

    public void zza(zzbu zzbu1)
    {
        zztR.add(zzbu1);
    }

    public void zzb(zzbu zzbu1)
    {
        zztS.add(zzbu1);
    }

    public void zzc(zzbu zzbu1)
    {
        zztT.add(zzbu1);
    }

    public List zzde()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zztS.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)((zzbu)iterator.next()).get();
            if (s != null)
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }
}
