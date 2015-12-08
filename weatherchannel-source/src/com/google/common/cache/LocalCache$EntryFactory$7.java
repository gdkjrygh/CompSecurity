// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class nit> extends nit>
{

    nit> copyEntry(nit> nit>, nit> nit>1, nit> nit>2)
    {
        nit> = super.pyEntry(nit>, nit>1, nit>2);
        copyWriteEntry(nit>1, nit>);
        return nit>;
    }

    copyWriteEntry newEntry(copyWriteEntry copywriteentry, Object obj, int i, copyWriteEntry copywriteentry1)
    {
        return new <init>(copywriteentry.renceQueue, obj, i, copywriteentry1);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
