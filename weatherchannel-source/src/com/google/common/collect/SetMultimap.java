// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multimap

public interface SetMultimap
    extends Multimap
{

    public abstract Map asMap();

    public abstract Set entries();

    public abstract boolean equals(Object obj);

    public abstract Set get(Object obj);

    public abstract Set removeAll(Object obj);

    public abstract Set replaceValues(Object obj, Iterable iterable);
}
