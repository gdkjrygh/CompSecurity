// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.view.View;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            m, PostPairingActivity

final class n
    implements android.view.View.OnClickListener
{

    final m a;
    private final Page b;

    private n(m m1, Page page)
    {
        a = m1;
        super();
        b = page;
    }

    n(m m1, Page page, byte byte0)
    {
        this(m1, page);
    }

    public final void onClick(View view)
    {
        view = new ArrayList();
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.add(m.a(a).feature))
        {
            view.add(((Video)iterator.next()).id);
        }

        PostPairingActivity.a(a.a).b(view);
        view = (String)view.get(0);
        PostPairingActivity.a(a.a).a(view, null, 0);
        a.a.N().a(PostPairingActivity.a(a.a).r(), view, 0, false, m.a(a).feature, false);
    }
}
