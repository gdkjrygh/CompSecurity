// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.adapter.ba;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            MyUploadsFragment, av

final class at
    implements b
{

    final av a;
    final MyUploadsFragment b;

    at(MyUploadsFragment myuploadsfragment, av av)
    {
        b = myuploadsfragment;
        a = av;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        if (exception.getMessage().equals("Not Found"))
        {
            ah.a(b.c, p.aP, 1);
            MyUploadsFragment.c(b).a(a);
            return;
        } else
        {
            MyUploadsFragment.d(b).c(exception);
            return;
        }
    }

    public final void a(Object obj, Object obj1)
    {
        MyUploadsFragment.c(b).a(a);
        ah.a(b.c, p.aP, 1);
    }
}
