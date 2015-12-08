// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public static class <init>
{

    private final ArrayList zzYF;
    private final String zzYG;
    private final HashMap zzYH;
    private boolean zzYI;
    private String zzYJ;
    private final String zzYw[];

    static String[] zza(<init> <init>1)
    {
        return <init>1.zzYw;
    }

    static ArrayList zzb(zzYw zzyw)
    {
        return zzyw.zzYF;
    }

    private (String as[], String s)
    {
        zzYw = (String[])zzu.zzu(as);
        zzYF = new ArrayList();
        zzYG = s;
        zzYH = new HashMap();
        zzYI = false;
        zzYJ = null;
    }

    zzYJ(String as[], String s, zzYJ zzyj)
    {
        this(as, s);
    }
}
