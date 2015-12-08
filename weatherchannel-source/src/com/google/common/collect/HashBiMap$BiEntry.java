// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableEntry, HashBiMap

private static final class valueHash extends ImmutableEntry
{

    final int keyHash;
    valueHash nextInKToVBucket;
    valueHash nextInVToKBucket;
    final int valueHash;

    (Object obj, int i, Object obj1, int j)
    {
        super(obj, obj1);
        keyHash = i;
        valueHash = j;
    }
}
