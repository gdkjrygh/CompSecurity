// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            MapDifference

public interface SortedMapDifference
    extends MapDifference
{

    public abstract SortedMap entriesDiffering();

    public abstract SortedMap entriesInCommon();

    public abstract SortedMap entriesOnlyOnLeft();

    public abstract SortedMap entriesOnlyOnRight();
}
