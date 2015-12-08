// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;


// Referenced classes of package com.weather.commons.ups.ui:
//            PasswordRetrievalActivity

static final class  extends Enum
{

    private static final FAILURE $VALUES[];
    public static final FAILURE FAILURE;
    public static final FAILURE SUCCESS;
    public static final FAILURE UNKNOWN_PASSWORD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/ups/ui/PasswordRetrievalActivity$SendRecoveryEmail$Result, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        UNKNOWN_PASSWORD = new <init>("UNKNOWN_PASSWORD", 1);
        FAILURE = new <init>("FAILURE", 2);
        $VALUES = (new .VALUES[] {
            SUCCESS, UNKNOWN_PASSWORD, FAILURE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
