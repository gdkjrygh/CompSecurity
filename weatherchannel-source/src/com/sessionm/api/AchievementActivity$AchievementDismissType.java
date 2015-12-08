// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;


// Referenced classes of package com.sessionm.api:
//            AchievementActivity

public static final class A extends Enum
{

    private static final CANCELLED $VALUES[];
    public static final CANCELLED CANCELLED;
    public static final CANCELLED CLAIMED;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/sessionm/api/AchievementActivity$AchievementDismissType, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        CLAIMED = new <init>("CLAIMED", 0);
        CANCELLED = new <init>("CANCELLED", 1);
        $VALUES = (new .VALUES[] {
            CLAIMED, CANCELLED
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}
