// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import com.google.android.apps.youtube.app.offline.r;
import com.google.android.apps.youtube.app.ui.ab;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            ba

final class bc
    implements ab
{

    final ba a;

    bc(ba ba1)
    {
        a = ba1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Video)obj;
        ba.b(a).a(ba.c(a), ((Video) (obj)).id, null);
    }
}
