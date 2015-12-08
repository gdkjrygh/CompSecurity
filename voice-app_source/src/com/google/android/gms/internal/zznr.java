// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzno, zznp, zzns, zzlb

public abstract class zznr
{

    private final zzns zzaEe;
    protected final zzno zzaEf;
    private final List zzaEg = new ArrayList();

    protected zznr(zzns zzns, zzlb zzlb)
    {
        zzu.zzu(zzns);
        zzaEe = zzns;
        zzns = new zzno(this, zzlb);
        zzns.zzvZ();
        zzaEf = zzns;
    }

    protected void zza(zzno zzno1)
    {
    }

    protected void zzd(zzno zzno1)
    {
        for (Iterator iterator = zzaEg.iterator(); iterator.hasNext(); ((zznp)iterator.next()).zza(this, zzno1)) { }
    }

    public zzno zzhc()
    {
        zzno zzno1 = zzaEf.zzvP();
        zzd(zzno1);
        return zzno1;
    }

    protected zzns zzvX()
    {
        return zzaEe;
    }

    public zzno zzwa()
    {
        return zzaEf;
    }

    public List zzwb()
    {
        return zzaEf.zzvR();
    }
}
