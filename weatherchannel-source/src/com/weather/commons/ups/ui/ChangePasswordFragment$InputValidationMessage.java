// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;


// Referenced classes of package com.weather.commons.ups.ui:
//            ChangePasswordFragment

private static final class  extends Enum
{

    private static final UNKNOWN_ERROR $VALUES[];
    public static final UNKNOWN_ERROR CURRENT_PASSWORD_INCORRECT;
    public static final UNKNOWN_ERROR NEW_PASSWORD_INVALID;
    public static final UNKNOWN_ERROR SUCCESS;
    public static final UNKNOWN_ERROR UNKNOWN_ERROR;
    public static final UNKNOWN_ERROR VERIFY_PASSWORD_DIFFERENT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/ups/ui/ChangePasswordFragment$InputValidationMessage, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        CURRENT_PASSWORD_INCORRECT = new <init>("CURRENT_PASSWORD_INCORRECT", 1);
        NEW_PASSWORD_INVALID = new <init>("NEW_PASSWORD_INVALID", 2);
        VERIFY_PASSWORD_DIFFERENT = new <init>("VERIFY_PASSWORD_DIFFERENT", 3);
        UNKNOWN_ERROR = new <init>("UNKNOWN_ERROR", 4);
        $VALUES = (new .VALUES[] {
            SUCCESS, CURRENT_PASSWORD_INCORRECT, NEW_PASSWORD_INVALID, VERIFY_PASSWORD_DIFFERENT, UNKNOWN_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
