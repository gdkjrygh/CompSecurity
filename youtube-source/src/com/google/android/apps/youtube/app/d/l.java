// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.view.View;
import com.google.android.apps.youtube.datalib.distiller.c;
import com.google.android.apps.youtube.datalib.distiller.model.a;
import com.google.android.apps.youtube.uilib.a.h;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            f, m

final class l
    implements android.view.View.OnClickListener
{

    final f a;

    private l(f f1)
    {
        a = f1;
        super();
    }

    l(f f1, byte byte0)
    {
        this(f1);
    }

    public final void onClick(View view)
    {
        if (f.g(a).c())
        {
            com.google.android.apps.youtube.app.d.f.h(a).a(com.google.android.apps.youtube.app.ui.presenter.CommentFooterPresenter.Model.State.LOADING);
            f.b(a).notifyDataSetChanged();
            f.i(a);
            view = com.google.android.apps.youtube.datalib.distiller.a.a();
            view.b(f.g(a).d());
            view.a(2);
            view.a(f.g(a).e());
            String s = f.g(a).e();
            f.i(a).a(view, new m(this, s));
        }
    }
}
