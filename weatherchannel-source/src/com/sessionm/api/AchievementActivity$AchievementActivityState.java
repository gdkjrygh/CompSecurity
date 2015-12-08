// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;


// Referenced classes of package com.sessionm.api:
//            AchievementActivity

private static final class  extends Enum
{

    private static final CANCELLED $VALUES[];
    public static final CANCELLED CANCELLED;
    public static final CANCELLED CLAIMED;
    public static final CANCELLED PRESENTED;
    public static final CANCELLED UNPRESENTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/api/AchievementActivity$AchievementActivityState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNPRESENTED = new <init>("UNPRESENTED", 0);
        PRESENTED = new <init>("PRESENTED", 1);
        CLAIMED = new <init>("CLAIMED", 2);
        CANCELLED = new <init>("CANCELLED", 3);
        $VALUES = (new .VALUES[] {
            UNPRESENTED, PRESENTED, CLAIMED, CANCELLED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
