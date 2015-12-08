// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.exception;


// Referenced classes of package com.stripe.exception:
//            StripeException

public class InvalidRequestException extends StripeException
{

    private static final long serialVersionUID = 1L;
    private final String param;

    public InvalidRequestException(String s, String s1, Throwable throwable)
    {
        super(s, throwable);
        param = s1;
    }

    public String getParam()
    {
        return param;
    }
}
