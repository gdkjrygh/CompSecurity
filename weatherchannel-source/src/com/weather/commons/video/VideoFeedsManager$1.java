// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;


// Referenced classes of package com.weather.commons.video:
//            VideoFeedsManager, FeedType

static class pe
{

    static final int $SwitchMap$com$weather$commons$video$FeedType[];
    static final int $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[];

    static 
    {
        $SwitchMap$com$weather$commons$video$VideoMessage$VideoType = new int[pe.values().length];
        try
        {
            $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[pe.MUST_SEE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[pe.MUST_SEE_INTL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[pe.ONTV.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[pe.LOCAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[pe.REGIONAL.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$weather$commons$video$VideoMessage$VideoType[pe.NATIONAL.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        $SwitchMap$com$weather$commons$video$FeedType = new int[FeedType.values().length];
        try
        {
            $SwitchMap$com$weather$commons$video$FeedType[FeedType.LOCAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
