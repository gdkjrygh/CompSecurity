// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.io.Serializable;

// Referenced classes of package com.google.common.hash:
//            BloomFilter, Funnel

static interface .BitArray
    extends Serializable
{

    public abstract boolean mightContain(Object obj, Funnel funnel, int i, .BitArray bitarray);

    public abstract int ordinal();

    public abstract boolean put(Object obj, Funnel funnel, int i, .BitArray bitarray);
}
