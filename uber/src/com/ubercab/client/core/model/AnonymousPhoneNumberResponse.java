// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_AnonymousPhoneNumberResponse

public abstract class AnonymousPhoneNumberResponse
    implements Parcelable
{

    public AnonymousPhoneNumberResponse()
    {
    }

    public static AnonymousPhoneNumberResponse create()
    {
        return new Shape_AnonymousPhoneNumberResponse();
    }

    public static AnonymousPhoneNumberResponse create(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return (new Shape_AnonymousPhoneNumberResponse()).setAnonymousNumber(s).setAnonymousNumberFormatted(s1).setAnonymousSmsNumber(s4).setAnonymousSmsNumberFormatted(s5).setAnonymousVoiceNumber(s2).setAnonymousVoiceNumberFormatted(s3);
    }

    public abstract String getAnonymousNumber();

    public abstract String getAnonymousNumberFormatted();

    public abstract String getAnonymousSmsNumber();

    public abstract String getAnonymousSmsNumberFormatted();

    public abstract String getAnonymousVoiceNumber();

    public abstract String getAnonymousVoiceNumberFormatted();

    abstract AnonymousPhoneNumberResponse setAnonymousNumber(String s);

    abstract AnonymousPhoneNumberResponse setAnonymousNumberFormatted(String s);

    abstract AnonymousPhoneNumberResponse setAnonymousSmsNumber(String s);

    abstract AnonymousPhoneNumberResponse setAnonymousSmsNumberFormatted(String s);

    abstract AnonymousPhoneNumberResponse setAnonymousVoiceNumber(String s);

    abstract AnonymousPhoneNumberResponse setAnonymousVoiceNumberFormatted(String s);
}
