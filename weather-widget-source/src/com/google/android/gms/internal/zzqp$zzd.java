// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqp, zzae

public static class <init>
{

    private String zzWs;
    private final List zzaTT;
    private final Map zzaTU;
    private int zzaTV;

    public <init> zzBI()
    {
        return new <init>(zzaTT, zzaTU, zzWs, zzaTV, null);
    }

    public zzaTV zzb(zzaTV zzatv)
    {
        zzaTT.add(zzatv);
        return this;
    }

    public zzaTT zzc(zzaTT zzatt)
    {
        String s = zzdf.zzg((g)zzatt.zzBD().get(zzae.zzfu.toString()));
        List list = (List)zzaTU.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaTU.put(s, obj);
        }
        ((List) (obj)).add(zzatt);
        return this;
    }

    public zzaTU zzfk(String s)
    {
        zzWs = s;
        return this;
    }

    public zzWs zzjm(int i)
    {
        zzaTV = i;
        return this;
    }

    private ()
    {
        zzaTT = new ArrayList();
        zzaTU = new HashMap();
        zzWs = "";
        zzaTV = 0;
    }

    zzaTV(zzaTV zzatv)
    {
        this();
    }
}
