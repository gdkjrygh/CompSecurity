// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.weather.commons.video2:
//            VideoMessage

public class VideoListMerger
{

    private final Set idSet = Sets.newHashSet();
    private final com.google.common.collect.ImmutableList.Builder mergedResultBuilder = ImmutableList.builder();

    public VideoListMerger()
    {
    }

    public VideoListMerger add(VideoMessage videomessage)
    {
        Preconditions.checkNotNull(videomessage);
        if (idSet.add(videomessage.getId()))
        {
            mergedResultBuilder.add(videomessage);
        }
        return this;
    }

    public VideoListMerger add(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        for (iterable = iterable.iterator(); iterable.hasNext(); add((VideoMessage)iterable.next())) { }
        return this;
    }

    public Set getIds()
    {
        return ImmutableSet.copyOf(idSet);
    }

    public List getMergedResult()
    {
        return mergedResultBuilder.build();
    }
}
