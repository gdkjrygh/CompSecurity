// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.ba;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            fl

final class er
    implements fl
{

    er()
    {
    }

    public final void a(l l1, List list)
    {
        l1 = (ba)l1.a(com/google/android/apps/youtube/datalib/legacy/model/ba);
        if (list.size() > 0)
        {
            l1.b((VastAd)list.get(0));
        }
    }
}
