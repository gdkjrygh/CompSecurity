// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.apps.youtube.datalib.model.transfer.a;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ha

final class hg
    implements d
{

    private final Transfer a;

    hg(Transfer transfer)
    {
        a = transfer;
    }

    public final boolean a(Object obj)
    {
        obj = (ha)obj;
        String s = a.h.b("video_id");
        return ((ha) (obj)).a() && s != null && ((ha) (obj)).a.id.equals(s);
    }
}
