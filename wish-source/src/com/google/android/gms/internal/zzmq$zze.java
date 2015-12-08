// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzmq

public static class <init>
{

    private final List zzaHo;
    private final List zzaHp;
    private final List zzaHq;
    private final List zzaHr;
    private final List zzaHs;
    private final List zzaHt;
    private final List zzaHu;
    private final List zzaHv;
    private final List zzaHw;
    private final List zzaHx;

    public static <init> zzyx()
    {
        return new <init>(null);
    }

    public String toString()
    {
        return (new StringBuilder()).append("Positive predicates: ").append(zzyy()).append("  Negative predicates: ").append(zzyz()).append("  Add tags: ").append(zzyA()).append("  Remove tags: ").append(zzyB()).append("  Add macros: ").append(zzyC()).append("  Remove macros: ").append(zzyH()).toString();
    }

    public List zzyA()
    {
        return zzaHq;
    }

    public List zzyB()
    {
        return zzaHr;
    }

    public List zzyC()
    {
        return zzaHs;
    }

    public List zzyD()
    {
        return zzaHu;
    }

    public List zzyE()
    {
        return zzaHv;
    }

    public List zzyF()
    {
        return zzaHw;
    }

    public List zzyG()
    {
        return zzaHx;
    }

    public List zzyH()
    {
        return zzaHt;
    }

    public List zzyy()
    {
        return zzaHo;
    }

    public List zzyz()
    {
        return zzaHp;
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        zzaHo = Collections.unmodifiableList(list);
        zzaHp = Collections.unmodifiableList(list1);
        zzaHq = Collections.unmodifiableList(list2);
        zzaHr = Collections.unmodifiableList(list3);
        zzaHs = Collections.unmodifiableList(list4);
        zzaHt = Collections.unmodifiableList(list5);
        zzaHu = Collections.unmodifiableList(list6);
        zzaHv = Collections.unmodifiableList(list7);
        zzaHw = Collections.unmodifiableList(list8);
        zzaHx = Collections.unmodifiableList(list9);
    }

    zzaHx(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, zzaHx zzahx)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
