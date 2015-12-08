// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
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

    public static <init> zzBJ()
    {
        return new <init>(null);
    }

    public String toString()
    {
        return (new StringBuilder()).append("Positive predicates: ").append(zzBK()).append("  Negative predicates: ").append(zzBL()).append("  Add tags: ").append(zzBM()).append("  Remove tags: ").append(zzBN()).append("  Add macros: ").append(zzBO()).append("  Remove macros: ").append(zzBT()).toString();
    }

    public List zzBK()
    {
        return zzaTW;
    }

    public List zzBL()
    {
        return zzaTX;
    }

    public List zzBM()
    {
        return zzaTY;
    }

    public List zzBN()
    {
        return zzaTZ;
    }

    public List zzBO()
    {
        return zzaUa;
    }

    public List zzBP()
    {
        return zzaUc;
    }

    public List zzBQ()
    {
        return zzaUd;
    }

    public List zzBR()
    {
        return zzaUe;
    }

    public List zzBS()
    {
        return zzaUf;
    }

    public List zzBT()
    {
        return zzaUb;
    }

    private (List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9)
    {
        zzaTW = Collections.unmodifiableList(list);
        zzaTX = Collections.unmodifiableList(list1);
        zzaTY = Collections.unmodifiableList(list2);
        zzaTZ = Collections.unmodifiableList(list3);
        zzaUa = Collections.unmodifiableList(list4);
        zzaUb = Collections.unmodifiableList(list5);
        zzaUc = Collections.unmodifiableList(list6);
        zzaUd = Collections.unmodifiableList(list7);
        zzaUe = Collections.unmodifiableList(list8);
        zzaUf = Collections.unmodifiableList(list9);
    }

    zzaUf(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, zzaUf zzauf)
    {
        this(list, list1, list2, list3, list4, list5, list6, list7, list8, list9);
    }
}
