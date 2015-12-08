// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ei

final class em
    implements android.view.View.OnClickListener
{

    final ei a;

    em(ei ei1)
    {
        a = ei1;
        super();
    }

    public final void onClick(View view)
    {
        if (ei.j(a) == null)
        {
            return;
        }
        view = ei.j(a).getVideoId();
        if (ei.f(a).u().contains(view))
        {
            ei.f(a).d(view);
            ei.k(a).b("RemoteQueueRemoveVideoWatchPage");
            return;
        } else
        {
            ei.f(a).c(view);
            ei.k(a).b("RemoteQueueAddVideo");
            return;
        }
    }
}
