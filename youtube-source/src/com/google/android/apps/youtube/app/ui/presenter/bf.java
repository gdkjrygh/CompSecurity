// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import com.google.android.apps.youtube.app.ui.ac;
import com.google.android.apps.youtube.app.ui.v;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            ba

final class bf
    implements ac
{

    final ba a;

    bf(ba ba1)
    {
        a = ba1;
        super();
    }

    public final void a(v v, Object obj)
    {
        boolean flag3 = false;
        boolean flag4 = true;
        v = (Video)obj;
        v = ba.a(a).a(((Video) (v)).id);
        if (v != null)
        {
            boolean flag = v.u();
            boolean flag1;
            boolean flag2;
            if (v.m())
            {
                flag1 = true;
                flag2 = flag;
                flag = flag4;
            } else
            if (v.k())
            {
                flag2 = flag;
                flag1 = true;
                flag = false;
                flag3 = true;
            } else
            {
                flag2 = flag;
                flag1 = true;
                flag = false;
            }
        } else
        {
            flag1 = false;
            flag2 = true;
            flag = false;
        }
        ba.a(a, ba.d(a), flag3);
        ba.a(a, ba.e(a), flag);
        ba.a(a, ba.f(a), flag2);
        ba.a(a, ba.g(a), flag1);
    }
}
