// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.app.offline.j;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            br, bk, as

final class bp
    implements j
{

    final YouTubeActivity a;
    final bk b;

    bp(bk bk1, YouTubeActivity youtubeactivity)
    {
        b = bk1;
        a = youtubeactivity;
        super();
    }

    public final void a(com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult offlineaddresult)
    {
        switch (br.a[offlineaddresult.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            bk.e(b).d();
            ah.a(a, p.l, 1);
            return;

        case 2: // '\002'
            ah.a(a, p.dO, 1);
            return;

        case 3: // '\003'
            ah.a(a, p.k, 1);
            break;
        }
    }
}
