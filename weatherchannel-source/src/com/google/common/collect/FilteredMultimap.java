// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.common.collect:
//            Multimap

interface FilteredMultimap
    extends Multimap
{

    public abstract Predicate entryPredicate();

    public abstract Multimap unfiltered();
}
