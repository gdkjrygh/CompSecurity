// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzqp

public static class <init>
{

    private final List zzaTW;
    private final List zzaTX;
    private final List zzaTY;
    private final List zzaTZ;
    private final List zzaUa;
    private final List zzaUb;
    private final List zzaUc;
    private final List zzaUd;
    private final List zzaUe;
    private final List zzaUf;

    public <init> zzBU()
    {
        return new <init>(zzaTW, zzaTX, zzaTY, zzaTZ, zzaUa, zzaUb, zzaUc, zzaUd, zzaUe, zzaUf, null);
    }

    public zzaUf zzd(zzaUf zzauf)
    {
        zzaTW.add(zzauf);
        return this;
    }

    public zzaTW zze(zzaTW zzatw)
    {
        zzaTX.add(zzatw);
        return this;
    }

    public zzaTX zzf(zzaTX zzatx)
    {
        zzaTY.add(zzatx);
        return this;
    }

    public zzaTY zzfl(String s)
    {
        zzaUe.add(s);
        return this;
    }

    public zzaUe zzfm(String s)
    {
        zzaUf.add(s);
        return this;
    }

    public zzaUf zzfn(String s)
    {
        zzaUc.add(s);
        return this;
    }

    public zzaUc zzfo(String s)
    {
        zzaUd.add(s);
        return this;
    }

    public zzaUd zzg(zzaUd zzaud)
    {
        zzaTZ.add(zzaud);
        return this;
    }

    public zzaTZ zzh(zzaTZ zzatz)
    {
        zzaUa.add(zzatz);
        return this;
    }

    public zzaUa zzi(zzaUa zzaua)
    {
        zzaUb.add(zzaua);
        return this;
    }

    private ()
    {
        zzaTW = new ArrayList();
        zzaTX = new ArrayList();
        zzaTY = new ArrayList();
        zzaTZ = new ArrayList();
        zzaUa = new ArrayList();
        zzaUb = new ArrayList();
        zzaUc = new ArrayList();
        zzaUd = new ArrayList();
        zzaUe = new ArrayList();
        zzaUf = new ArrayList();
    }

    zzaUf(zzaUf zzauf)
    {
        this();
    }
}
