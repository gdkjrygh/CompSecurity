// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signin;

import android.app.AlertDialog;
import android.view.View;
import chp;
import com.ubercab.analytics.model.AnalyticsEvent;
import n;

// Referenced classes of package com.ubercab.client.feature.signin:
//            SignInFragment

final class a
    implements android.view.ner
{

    final AlertDialog a;
    final SignInFragment b;

    public final void onClick(View view)
    {
        view = AnalyticsEvent.create("tap").setName(n.bQ).setValue("email");
        b.c.a(view);
        SignInFragment.b(b);
        a.dismiss();
    }

    (SignInFragment signinfragment, AlertDialog alertdialog)
    {
        b = signinfragment;
        a = alertdialog;
        super();
    }
}
