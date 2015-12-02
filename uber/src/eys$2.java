// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ProgressDialog;
import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    final eys a;

    public final void onClick(View view)
    {
        a.c.a(n.iR);
        if (a.g.b(eys.a(a)) == null)
        {
            eys.a(a, dtg.a(a.getActivity(), a.getString(0x7f070296)));
            eys.b(a).show();
            a.g.i();
            return;
        } else
        {
            eys.c(a);
            return;
        }
    }

    (eys eys1)
    {
        a = eys1;
        super();
    }
}
