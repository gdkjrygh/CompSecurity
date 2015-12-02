// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signin;

import android.view.KeyEvent;
import android.widget.TextView;
import chp;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.locale.phone.EmailPhoneNumberView;
import dbf;
import gmg;
import gph;
import n;

// Referenced classes of package com.ubercab.client.feature.signin:
//            SignInFragment

public final class a
    implements android.widget.ActionListener
{

    final SignInFragment a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            if (a.i.a(dbf.at))
            {
                if (a.mEditEmailPhoneNumber.d() == gph.a)
                {
                    textview = "email";
                } else
                {
                    textview = "phone";
                }
                textview = textview.concat(",keyboard");
                textview = AnalyticsEvent.create("tap").setName(n.fG).setValue(textview);
                a.c.a(textview);
            }
            SignInFragment.a(a);
            return true;
        } else
        {
            return false;
        }
    }

    (SignInFragment signinfragment)
    {
        a = signinfragment;
        super();
    }
}
