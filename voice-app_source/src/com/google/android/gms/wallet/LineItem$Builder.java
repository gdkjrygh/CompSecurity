// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            LineItem

public final class <init>
{

    final LineItem zzaQL;

    public LineItem build()
    {
        return zzaQL;
    }

    public zzaQL setCurrencyCode(String s)
    {
        zzaQL.zzaQg = s;
        return this;
    }

    public zzaQL setDescription(String s)
    {
        zzaQL.description = s;
        return this;
    }

    public ion setQuantity(String s)
    {
        zzaQL.zzaQI = s;
        return this;
    }

    public zzaQL setRole(int i)
    {
        zzaQL.zzaQK = i;
        return this;
    }

    public zzaQL setTotalPrice(String s)
    {
        zzaQL.zzaQf = s;
        return this;
    }

    public zzaQL setUnitPrice(String s)
    {
        zzaQL.zzaQJ = s;
        return this;
    }

    private (LineItem lineitem)
    {
        zzaQL = lineitem;
        super();
    }

    zzaQL(LineItem lineitem, zzaQL zzaql)
    {
        this(lineitem);
    }
}
