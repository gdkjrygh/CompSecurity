// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signin;

import bmp;
import bmr;
import com.ubercab.locale.phone.EmailPhoneNumberView;
import hrs;
import hrt;

// Referenced classes of package com.ubercab.client.feature.signin:
//            SignInFragment

final class a
    implements hrt
{

    final SignInFragment a;

    private static hrs a(EmailPhoneNumberView emailphonenumberview)
    {
        bmr bmr1 = bmr.a();
        if (bmr1.a(bmr1.a(emailphonenumberview.e(), emailphonenumberview.c().toString())))
        {
            return null;
        }
        try
        {
            emailphonenumberview = new hrs(0x7f070288);
        }
        // Misplaced declaration of an exception variable
        catch (EmailPhoneNumberView emailphonenumberview)
        {
            return new hrs(0x7f070288);
        }
        return emailphonenumberview;
    }

    public final volatile Object a(Object obj)
    {
        return a((EmailPhoneNumberView)obj);
    }

    (SignInFragment signinfragment)
    {
        a = signinfragment;
        super();
    }
}
