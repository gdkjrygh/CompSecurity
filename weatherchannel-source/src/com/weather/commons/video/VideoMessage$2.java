// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;

import com.google.common.base.Function;

// Referenced classes of package com.weather.commons.video:
//            VideoMessage

static final class 
    implements Function
{

    public volatile Object apply(Object obj)
    {
        return apply((VideoMessage)obj);
    }

    public String apply(VideoMessage videomessage)
    {
        if (videomessage == null)
        {
            return "";
        }
        if (VideoMessage.access$100(videomessage) == null)
        {
            return "";
        } else
        {
            return VideoMessage.access$100(videomessage);
        }
    }

    ()
    {
    }
}
