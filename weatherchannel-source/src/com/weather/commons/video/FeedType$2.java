// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

// Referenced classes of package com.weather.commons.video:
//            FeedType

static final class nit> extends FeedType
{

    Collection getVideoTypes()
    {
        return ImmutableList.of(e.VideoType.ONTV);
    }

    st(String s, int i)
    {
        super(s, i, null);
    }
}
