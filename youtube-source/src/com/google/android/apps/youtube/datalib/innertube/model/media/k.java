// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;

import java.util.Comparator;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.media:
//            FormatStream, VideoStreamingData

final class k
    implements Comparator
{

    final VideoStreamingData a;

    k(VideoStreamingData videostreamingdata)
    {
        a = videostreamingdata;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (FormatStream)obj;
        obj1 = (FormatStream)obj1;
        if (((FormatStream) (obj)).getHeight() == ((FormatStream) (obj1)).getHeight())
        {
            return 0;
        }
        return ((FormatStream) (obj)).getHeight() >= ((FormatStream) (obj1)).getHeight() ? -1 : 1;
    }
}
