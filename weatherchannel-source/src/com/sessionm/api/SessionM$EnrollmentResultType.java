// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;


// Referenced classes of package com.sessionm.api:
//            SessionM

public static final class  extends Enum
{

    private static final UNAVAILABLE $VALUES[];
    public static final UNAVAILABLE FAILURE;
    public static final UNAVAILABLE SUCCESS;
    public static final UNAVAILABLE UNAVAILABLE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/api/SessionM$EnrollmentResultType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        FAILURE = new <init>("FAILURE", 1);
        UNAVAILABLE = new <init>("UNAVAILABLE", 2);
        $VALUES = (new .VALUES[] {
            SUCCESS, FAILURE, UNAVAILABLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
