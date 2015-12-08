// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public static class <init>
{

    private final String zzabk[];
    private final ArrayList zzabt;
    private final String zzabu;
    private final HashMap zzabv;
    private boolean zzabw;
    private String zzabx;

    static String[] zza(<init> <init>1)
    {
        return <init>1.zzabk;
    }

    static ArrayList zzb(zzabk zzabk1)
    {
        return zzabk1.zzabt;
    }

    private (String as[], String s)
    {
        zzabk = (String[])zzx.zzv(as);
        zzabt = new ArrayList();
        zzabu = s;
        zzabv = new HashMap();
        zzabw = false;
        zzabx = null;
    }

    zzabx(String as[], String s, zzabx zzabx1)
    {
        this(as, s);
    }
}
