// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.distiller.model.a;
import com.google.android.apps.youtube.uilib.a.h;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            l, f

final class m
    implements l
{

    final String a;
    final com.google.android.apps.youtube.app.d.l b;

    m(com.google.android.apps.youtube.app.d.l l1, String s)
    {
        b = l1;
        a = s;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        if (f.g(b.a) != null && f.g(b.a).e().equals(a))
        {
            com.google.android.apps.youtube.app.d.f.h(b.a).a(com.google.android.apps.youtube.app.ui.presenter.CommentFooterPresenter.Model.State.NO_MORE_COMMENTS);
            f.b(b.a).notifyDataSetChanged();
        }
    }

    public final void a(Object obj)
    {
        obj = (a)obj;
        if (f.g(b.a) != null && f.g(b.a).e().equals(((a) (obj)).e()))
        {
            f.g(b.a).a(((a) (obj)));
            f.j(b.a);
        }
    }
}
