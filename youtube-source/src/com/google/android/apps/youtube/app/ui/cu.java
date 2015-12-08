// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cr, LikeAction, cl

final class cu
    implements android.view.View.OnClickListener
{

    final cr a;

    cu(cr cr1)
    {
        a = cr1;
        super();
    }

    public final void onClick(View view)
    {
        if (cr.d(a) != null && cr.d(a).isPrivate)
        {
            ah.a(cr.c(a), p.eN, 1);
            return;
        }
        cl cl1 = cr.g(a);
        if (cr.e(a))
        {
            view = LikeAction.REMOVE_LIKE;
        } else
        {
            view = LikeAction.LIKE;
        }
        cl1.a(view, cr.f(a));
    }
}
