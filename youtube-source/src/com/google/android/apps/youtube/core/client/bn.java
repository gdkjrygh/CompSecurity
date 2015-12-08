// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import java.util.Comparator;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            bm

final class bn
    implements Comparator
{

    final bm a;

    bn(bm bm1)
    {
        a = bm1;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)obj;
        obj1 = (com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing)obj1;
        return ((com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing) (obj)).getTimeOffsetMilliseconds(bm.a(a).getDuration()) - ((com.google.android.apps.youtube.datalib.legacy.model.VastAd.ProgressPing) (obj1)).getTimeOffsetMilliseconds(bm.a(a).getDuration());
    }
}
