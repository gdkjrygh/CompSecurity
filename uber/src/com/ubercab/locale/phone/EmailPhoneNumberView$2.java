// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.phone;

import android.view.KeyEvent;
import android.widget.TextView;
import gpi;

// Referenced classes of package com.ubercab.locale.phone:
//            EmailPhoneNumberView

final class a
    implements android.widget.Listener
{

    final EmailPhoneNumberView a;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        return EmailPhoneNumberView.c(a) != null && EmailPhoneNumberView.c(a).a();
    }

    (EmailPhoneNumberView emailphonenumberview)
    {
        a = emailphonenumberview;
        super();
    }
}
