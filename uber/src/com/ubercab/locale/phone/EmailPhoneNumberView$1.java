// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.phone;

import android.view.View;
import com.ubercab.locale.country.FloatingLabelCountryElement;
import gpf;

// Referenced classes of package com.ubercab.locale.phone:
//            EmailPhoneNumberView

final class a
    implements android.view.ner
{

    final EmailPhoneNumberView a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (EmailPhoneNumberView.a(a) == gpf.a)
        {
            EmailPhoneNumberView.b(a).setActivated(flag);
        }
    }

    lement(EmailPhoneNumberView emailphonenumberview)
    {
        a = emailphonenumberview;
        super();
    }
}
