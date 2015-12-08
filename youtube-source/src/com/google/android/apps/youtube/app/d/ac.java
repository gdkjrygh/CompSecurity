// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import com.google.android.apps.youtube.app.ui.presenter.cu;
import com.google.android.apps.youtube.datalib.distiller.a;
import com.google.android.apps.youtube.datalib.distiller.d;
import com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment;
import com.google.android.apps.youtube.uilib.a.h;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            f, ad

final class ac
    implements cu
{

    final f a;

    private ac(f f1)
    {
        a = f1;
        super();
    }

    ac(f f1, byte byte0)
    {
        this(f1);
    }

    public final void a(TopLevelComment toplevelcomment)
    {
        if (toplevelcomment.m())
        {
            return;
        } else
        {
            toplevelcomment.a(true);
            f.i(a);
            d d1 = com.google.android.apps.youtube.datalib.distiller.a.b();
            d1.a(toplevelcomment.k());
            d1.a(5);
            d1.b(toplevelcomment.b());
            f.i(a).a(d1, new ad(this, toplevelcomment));
            f.b(a).notifyDataSetChanged();
            return;
        }
    }
}
