// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            OfflineStreamQuality

final class q
{

    private static final Map a;
    private static final SparseArray b;

    static Map a()
    {
        return a;
    }

    static SparseArray b()
    {
        return b;
    }

    static 
    {
        a = new HashMap();
        b = new SparseArray();
        OfflineStreamQuality aofflinestreamquality[] = OfflineStreamQuality.values();
        int j = aofflinestreamquality.length;
        for (int i = 0; i < j; i++)
        {
            OfflineStreamQuality offlinestreamquality = aofflinestreamquality[i];
            a.put(OfflineStreamQuality.access$000(offlinestreamquality), offlinestreamquality);
            b.put(offlinestreamquality.getQualityValue(), offlinestreamquality);
        }

    }
}
