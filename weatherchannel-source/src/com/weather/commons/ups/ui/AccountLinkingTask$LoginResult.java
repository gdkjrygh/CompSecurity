// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;


// Referenced classes of package com.weather.commons.ups.ui:
//            AccountLinkingTask

static final class isTerminatingError extends Enum
{

    private static final FAILURE $VALUES[];
    public static final FAILURE AUTHENTICATION_ERROR;
    public static final FAILURE CLEANUP_FAILURE;
    public static final FAILURE CONFLICT;
    public static final FAILURE DUPLICATE_EMAIL_ADDRESS;
    public static final FAILURE FAILURE;
    public static final FAILURE NETWORK_ERROR;
    public static final FAILURE SUCCESS;
    private final Integer errorMessageResourceId;
    private final boolean isTerminatingError;

    public static isTerminatingError valueOf(String s)
    {
        return (isTerminatingError)Enum.valueOf(com/weather/commons/ups/ui/AccountLinkingTask$LoginResult, s);
    }

    public static isTerminatingError[] values()
    {
        return (isTerminatingError[])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0, null, false);
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 1, Integer.valueOf(com.weather.commons.or_msg), false);
        CONFLICT = new <init>("CONFLICT", 2, Integer.valueOf(com.weather.commons._signing_in_instead_msg), true);
        AUTHENTICATION_ERROR = new <init>("AUTHENTICATION_ERROR", 3, Integer.valueOf(com.weather.commons.sting_account_msg), false);
        DUPLICATE_EMAIL_ADDRESS = new <init>("DUPLICATE_EMAIL_ADDRESS", 4, Integer.valueOf(com.weather.commons.), false);
        CLEANUP_FAILURE = new <init>("CLEANUP_FAILURE", 5, Integer.valueOf(com.weather.commons._failure_msg), true);
        FAILURE = new <init>("FAILURE", 6, Integer.valueOf(com.weather.commons.Result), false);
        $VALUES = (new .VALUES[] {
            SUCCESS, NETWORK_ERROR, CONFLICT, AUTHENTICATION_ERROR, DUPLICATE_EMAIL_ADDRESS, CLEANUP_FAILURE, FAILURE
        });
    }



    private (String s, int i, Integer integer, boolean flag)
    {
        super(s, i);
        errorMessageResourceId = integer;
        isTerminatingError = flag;
    }
}
