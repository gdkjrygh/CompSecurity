// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzbv, zzkf, zzbs

public class zzbw
{

    private final Collection zztA = new ArrayList();
    private final Collection zzty = new ArrayList();
    private final Collection zztz = new ArrayList();

    public zzbw()
    {
    }

    public void zza(zzbs zzbs)
    {
        zzty.add(zzbs);
    }

    public void zza(zzbv zzbv1)
    {
        zztz.add(zzbv1);
    }

    public void zzb(zzbv zzbv1)
    {
        zztA.add(zzbv1);
    }

    public List zzda()
    {
        Object obj;
        long l;
        obj = new ArrayList();
        l = Binder.clearCallingIdentity();
        Iterator iterator = zztA.iterator();
_L2:
        String s;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_74;
            }
            s = (String)((zzbv)iterator.next()).zzcZ().get();
        } while (s == null);
        ((List) (obj)).add(s);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        Binder.restoreCallingIdentity(l);
        throw obj;
        Binder.restoreCallingIdentity(l);
        return ((List) (obj));
    }

    public List zzdb()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zztz.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)((zzbv)iterator.next()).get();
            if (s != null)
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }
}
