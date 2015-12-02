// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.model.AnonymousPhoneNumberResponse;

final class dkk
{

    private AnonymousPhoneNumberResponse a;
    private String b;
    private String c;
    private String d;
    private String e;

    private dkk()
    {
    }

    dkk(byte byte0)
    {
        this();
    }

    final AnonymousPhoneNumberResponse a()
    {
        return a;
    }

    final void a(String s, String s1, String s2, String s3, AnonymousPhoneNumberResponse anonymousphonenumberresponse)
    {
        a = anonymousphonenumberresponse;
        d = s;
        e = s1;
        b = s2;
        c = s3;
    }

    final boolean a(String s, String s1, String s2, String s3)
    {
        return TextUtils.equals(d, s) && TextUtils.equals(e, s1) && TextUtils.equals(b, s2) && TextUtils.equals(c, s3);
    }
}
