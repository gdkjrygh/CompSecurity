// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.b;

import android.util.Pair;
import com.google.android.apps.youtube.core.client.a.d;
import com.google.android.apps.youtube.core.player.event.ac;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.b:
//            k, e

final class h
    implements d
{

    final e a;

    h(e e)
    {
        a = e;
        super();
    }

    public final List a(Object obj)
    {
        obj = (ac)obj;
        LinkedList linkedlist = new LinkedList();
        switch (k.a[((ac) (obj)).c().ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            linkedlist.add(new Pair("docid", ((ac) (obj)).d().getPlayerResponse().getVideoId()));
            return linkedlist;

        case 2: // '\002'
            linkedlist.add(new Pair("mod_ad", "1"));
            return linkedlist;

        case 3: // '\003'
            linkedlist.add(new Pair("mod_ad_pr", "1"));
            break;
        }
        linkedlist.add(new Pair("ad_at", ((ac) (obj)).e().getAdFormat()));
        return linkedlist;
    }
}
