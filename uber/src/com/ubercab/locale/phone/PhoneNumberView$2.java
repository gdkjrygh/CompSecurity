// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.phone;

import gpm;
import hpb;

// Referenced classes of package com.ubercab.locale.phone:
//            PhoneNumberView

final class a extends hpb
{

    final PhoneNumberView a;

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (PhoneNumberView.a(a) != null)
        {
            PhoneNumberView.a(a).a(charsequence.subSequence(i, i + k).toString());
        }
    }

    (PhoneNumberView phonenumberview)
    {
        a = phonenumberview;
        super();
    }
}
