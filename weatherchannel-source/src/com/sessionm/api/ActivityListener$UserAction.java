// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;


// Referenced classes of package com.sessionm.api:
//            ActivityListener

public static final class code extends Enum
{

    private static final OTHER $VALUES[];
    public static final OTHER ACHIEVEMENT_DISMISSED;
    public static final OTHER ACHIEVEMENT_ENGAGED;
    public static final OTHER ACHIEVEMENT_VIEWED;
    public static final OTHER CHECKIN_COMPLETED;
    public static final OTHER OTHER;
    public static final OTHER PORTAL_DISMISSED;
    public static final OTHER PORTAL_VIEWED;
    public static final OTHER REDEEMED_REWARD;
    public static final OTHER REGISTERED;
    public static final OTHER SIGN_IN;
    public static final OTHER SIGN_OUT;
    public static final OTHER SPONSOR_CONTENT_DISMISSED;
    public static final OTHER SPONSOR_CONTENT_ENGAGED;
    public static final OTHER SPONSOR_CONTENT_VIEWED;
    private int code;

    public static code valueOf(String s)
    {
        return (code)Enum.valueOf(com/sessionm/api/ActivityListener$UserAction, s);
    }

    public static code[] values()
    {
        return (code[])$VALUES.clone();
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int i)
    {
        code = i;
    }

    static 
    {
        ACHIEVEMENT_VIEWED = new <init>("ACHIEVEMENT_VIEWED", 0, 100);
        ACHIEVEMENT_ENGAGED = new <init>("ACHIEVEMENT_ENGAGED", 1, 101);
        ACHIEVEMENT_DISMISSED = new <init>("ACHIEVEMENT_DISMISSED", 2, 102);
        SPONSOR_CONTENT_VIEWED = new <init>("SPONSOR_CONTENT_VIEWED", 3, 103);
        SPONSOR_CONTENT_ENGAGED = new <init>("SPONSOR_CONTENT_ENGAGED", 4, 104);
        SPONSOR_CONTENT_DISMISSED = new <init>("SPONSOR_CONTENT_DISMISSED", 5, 105);
        PORTAL_VIEWED = new <init>("PORTAL_VIEWED", 6, 106);
        SIGN_IN = new <init>("SIGN_IN", 7, 107);
        SIGN_OUT = new <init>("SIGN_OUT", 8, 108);
        REGISTERED = new <init>("REGISTERED", 9, 109);
        PORTAL_DISMISSED = new <init>("PORTAL_DISMISSED", 10, 110);
        REDEEMED_REWARD = new <init>("REDEEMED_REWARD", 11, 111);
        CHECKIN_COMPLETED = new <init>("CHECKIN_COMPLETED", 12, 112);
        OTHER = new <init>("OTHER", 13, -1);
        $VALUES = (new .VALUES[] {
            ACHIEVEMENT_VIEWED, ACHIEVEMENT_ENGAGED, ACHIEVEMENT_DISMISSED, SPONSOR_CONTENT_VIEWED, SPONSOR_CONTENT_ENGAGED, SPONSOR_CONTENT_DISMISSED, PORTAL_VIEWED, SIGN_IN, SIGN_OUT, REGISTERED, 
            PORTAL_DISMISSED, REDEEMED_REWARD, CHECKIN_COMPLETED, OTHER
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        code = j;
    }
}
