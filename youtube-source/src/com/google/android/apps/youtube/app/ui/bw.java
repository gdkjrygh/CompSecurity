// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.AlertDialog;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bv, bx

final class bw
    implements android.view.View.OnClickListener
{

    final bv a;

    bw(bv bv1)
    {
        a = bv1;
        super();
    }

    public final void onClick(View view)
    {
        view = bv.a(a);
        if (view == null)
        {
            ah.a(bv.b(a), p.dg, 1);
            return;
        }
        if (bv.c(a).isChecked())
        {
            bv.d(a).a(view);
        }
        bv.e(a).a(view);
        bv.f(a).dismiss();
    }
}
