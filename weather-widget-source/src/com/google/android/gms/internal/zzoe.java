// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzob, zzoc, zzof, zzlm

public abstract class zzoe
{

    private final zzof zzaIa;
    protected final zzob zzaIb;
    private final List zzaIc = new ArrayList();

    protected zzoe(zzof zzof, zzlm zzlm)
    {
        zzx.zzv(zzof);
        zzaIa = zzof;
        zzof = new zzob(this, zzlm);
        zzof.zzxr();
        zzaIb = zzof;
    }

    protected void zza(zzob zzob1)
    {
    }

    protected void zzd(zzob zzob1)
    {
        for (Iterator iterator = zzaIc.iterator(); iterator.hasNext(); ((zzoc)iterator.next()).zza(this, zzob1)) { }
    }

    public zzob zzhq()
    {
        zzob zzob1 = zzaIb.zzxh();
        zzd(zzob1);
        return zzob1;
    }

    protected zzof zzxp()
    {
        return zzaIa;
    }

    public zzob zzxs()
    {
        return zzaIb;
    }

    public List zzxt()
    {
        return zzaIb.zzxj();
    }
}
