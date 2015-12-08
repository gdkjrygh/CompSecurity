// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzqf

public static class <init>
{

    private final List zzaPC;
    private final List zzaPD;
    private final List zzaPE;
    private final List zzaPF;
    private final List zzaPG;
    private final List zzaPH;
    private final List zzaPI;
    private final List zzaPJ;
    private final List zzaPK;
    private final List zzaPL;

    public static <init> zzAt()
    {
        return new <init>(null);
    }

    public String toString()
    {
        return (new StringBuilder()).append("Positive predicates: ").append(zzAu()).append("  Negative predicates: ").append(zzAv()).append("  Add tags: ").append(zzAw()).append("  Remove tags: ").append(zzAx()).append("  Add macros: ").append(zzAy()).append("  Remove macros: ").append(zzAD()).toString();
    }

    public List zzAA()
    {
        return zzaPJ;
    }

    public List zzAB()
    {
        return zzaPK;
    }

    public List zzAC()
    {
        return zzaPL;
    }

    public List zzAD()
    {
        return zzaPH;
    }

    public List zzAu()
    {
        return zzaPC;
    }

    public List zzAv()
    {
        return zzaPD;
    }

    public List zzAw()
    {
        return zzaPE;
    }

    public List zzAx()
    {
        return zzaPF;
    }

    public List zzAy()
    {
        return zzaPG;
    }

    public List zzAz()
    {
        return zzaPI;
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        zzaPC = Collections.unmodifiableList(list);
        zzaPD = Collections.unmodifiableList(list1);
        zzaPE = Collections.unmodifiableList(list2);
        zzaPF = Collections.unmodifiableList(list3);
        zzaPG = Collections.unmodifiableList(list4);
        zzaPH = Collections.unmodifiableList(list5);
        zzaPI = Collections.unmodifiableList(list6);
        zzaPJ = Collections.unmodifiableList(list7);
        zzaPK = Collections.unmodifiableList(list8);
        zzaPL = Collections.unmodifiableList(list9);
    }

    zzaPL(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, zzaPL zzapl)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
