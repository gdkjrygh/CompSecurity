// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import com.google.common.collect.ImmutableList;
import com.weather.commons.video2.VideoMessage;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            HurricaneVideoModule

static final class queriesMade
{

    private final VideoMessage messageToShow;
    private final List queriesMade;



    (VideoMessage videomessage, Collection collection)
    {
        messageToShow = videomessage;
        queriesMade = ImmutableList.copyOf(collection);
    }
}
