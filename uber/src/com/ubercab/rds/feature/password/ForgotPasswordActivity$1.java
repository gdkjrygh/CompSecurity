// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.password;

import android.view.View;
import chp;
import com.ubercab.ui.AutoCompleteFloatingLabelEditText;
import hch;
import hjg;
import i;
import ica;
import ico;

// Referenced classes of package com.ubercab.rds.feature.password:
//            ForgotPasswordActivity

final class a
    implements android.view.tPasswordActivity._cls1
{

    final ForgotPasswordActivity a;

    public final void onClick(View view)
    {
        a.c.a(i.m);
        if (!ForgotPasswordActivity.a(a))
        {
            return;
        } else
        {
            view = a.f.i().toString();
            a.d.a(view);
    /* block-local class not found */
    class _cls1 {}

            a.e.a(view).a(ico.a()).b(new _cls1());
            return;
        }
    }

    _cls1(ForgotPasswordActivity forgotpasswordactivity)
    {
        a = forgotpasswordactivity;
        super();
    }
}
