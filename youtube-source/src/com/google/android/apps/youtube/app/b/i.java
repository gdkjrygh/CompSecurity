// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.b;

import android.util.Pair;
import com.google.android.apps.youtube.core.client.a.d;
import com.google.android.apps.youtube.datalib.innertube.model.media.FormatStream;
import com.google.android.apps.youtube.medialib.player.l;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.b:
//            e

final class i
    implements d
{

    final e a;

    i(e e)
    {
        a = e;
        super();
    }

    public final List a(Object obj)
    {
        obj = (l)obj;
        LinkedList linkedlist = new LinkedList();
        linkedlist.add(new Pair("fmt", String.valueOf(((l) (obj)).a().getItag())));
        linkedlist.add(new Pair("mod_local", String.valueOf(((l) (obj)).a().isLocal())));
        return linkedlist;
    }
}
