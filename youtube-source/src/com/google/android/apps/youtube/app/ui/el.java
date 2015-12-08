// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ei, RemoteControlView

final class el
    implements b
{

    final ei a;

    el(ei ei1)
    {
        a = ei1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("error retrieving subtitle tracks", exception);
        ah.a(ei.i(a), p.cT, 0);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        if (((List) (obj)).size() == 0)
        {
            ah.a(ei.i(a), p.cT, 0);
            return;
        } else
        {
            obj1 = new ArrayList();
            ((List) (obj1)).add(SubtitleTrack.createDisableSubtitleOption(ei.i(a).getString(p.gk)));
            ((List) (obj1)).addAll(((java.util.Collection) (obj)));
            ei.h(a).a(((List) (obj1)));
            return;
        }
    }
}
