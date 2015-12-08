// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            TreeMultiset

static final class nit> extends nit>
{

    int nodeAggregate(nit> nit>)
    {
        return 1;
    }

    long treeAggregate(nit> nit>)
    {
        if (nit> == null)
        {
            return 0L;
        } else
        {
            return (long)ss._mth400(nit>);
        }
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
