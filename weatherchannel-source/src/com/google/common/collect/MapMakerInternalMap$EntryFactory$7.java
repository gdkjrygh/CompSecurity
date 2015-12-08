// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class nit> extends nit>
{

    nit> copyEntry(nit> nit>, nit> nit>1, nit> nit>2)
    {
        nit> = super.pyEntry(nit>, nit>1, nit>2);
        copyEvictableEntry(nit>1, nit>);
        return nit>;
    }

    copyEvictableEntry newEntry(copyEvictableEntry copyevictableentry, Object obj, int i, copyEvictableEntry copyevictableentry1)
    {
        return new try(copyevictableentry.renceQueue, obj, i, copyevictableentry1);
    }

    try(String s, int i)
    {
        super(s, i, null);
    }
}
