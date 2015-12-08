// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            zzg, zzi

private class zzZW extends zzZW
{

    final zzg zzZK;
    private final ArrayList zzZW;

    public void zznn()
    {
        Set set = zzg.zzd(zzZK).zzaah;
        if (set.isEmpty())
        {
            set = zzg.zzh(zzZK);
        }
        for (Iterator iterator = zzZW.iterator(); iterator.hasNext(); ((zzZW)iterator.next()).zza(zzg.zzg(zzZK), set)) { }
    }

    public (zzg zzg1, ArrayList arraylist)
    {
        zzZK = zzg1;
        super(zzg1, null);
        zzZW = arraylist;
    }
}
