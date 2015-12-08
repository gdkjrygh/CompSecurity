// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.exception;


// Referenced classes of package com.stripe.exception:
//            StripeException

public class CardException extends StripeException
{

    private static final long serialVersionUID = 1L;
    private String code;
    private String param;

    public CardException(String s, String s1, String s2, Throwable throwable)
    {
        super(s, throwable);
        code = s1;
        param = s2;
    }

    public String getCode()
    {
        return code;
    }

    public String getParam()
    {
        return param;
    }
}
