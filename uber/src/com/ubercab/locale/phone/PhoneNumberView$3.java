// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.phone;

import android.view.View;
import com.ubercab.locale.country.FloatingLabelCountryElement;
import gpm;

// Referenced classes of package com.ubercab.locale.phone:
//            PhoneNumberView

final class a
    implements android.view.Listener
{

    final PhoneNumberView a;

    public final void onFocusChange(View view, boolean flag)
    {
        PhoneNumberView.b(a).setActivated(flag);
        if (PhoneNumberView.a(a) != null)
        {
            PhoneNumberView.a(a).a(flag);
        }
    }

    ntryElement(PhoneNumberView phonenumberview)
    {
        a = phonenumberview;
        super();
    }
}
