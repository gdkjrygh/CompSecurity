// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.password;

import android.content.Intent;
import android.view.View;
import chp;
import com.ubercab.ui.FloatingLabelEditText;
import hjg;
import i;
import ica;
import ico;

// Referenced classes of package com.ubercab.rds.feature.password:
//            ResetPasswordActivity

final class a
    implements android.view.tPasswordActivity._cls1
{

    final ResetPasswordActivity a;

    public final void onClick(View view)
    {
        a.c.a(i.n);
        if (!ResetPasswordActivity.a(a))
        {
            return;
        } else
        {
            view = a.h.i().toString();
    /* block-local class not found */
    class _cls1 {}

            a.f.a(a.getIntent().getStringExtra("com.ubercab.rds.EMAIL_TOKEN"), view).a(ico.a()).b(new _cls1(view));
            return;
        }
    }

    _cls1(ResetPasswordActivity resetpasswordactivity)
    {
        a = resetpasswordactivity;
        super();
    }
}
