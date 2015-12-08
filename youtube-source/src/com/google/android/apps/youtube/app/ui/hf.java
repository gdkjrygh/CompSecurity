// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hd

final class hf
    implements b
{

    final hd a;
    private final Transfer b;

    private hf(hd hd1, Transfer transfer)
    {
        a = hd1;
        super();
        b = transfer;
    }

    hf(hd hd1, Transfer transfer, byte byte0)
    {
        this(hd1, transfer);
    }

    public final void a(Object obj, Exception exception)
    {
        L.a((new StringBuilder("Failed to fetch video for the transfer of ")).append(b.a).append(" to ").append(b.b).toString(), exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Video)obj1;
        obj = hd.a(a, ((Video) (obj)), b);
        hd.a(a, b, ((Video) (obj)));
    }
}
