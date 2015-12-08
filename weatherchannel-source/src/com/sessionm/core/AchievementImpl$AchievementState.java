// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            AchievementImpl

public static final class  extends Enum
{

    public static final V S;
    public static final V T;
    public static final V U;
    public static final V V;
    private static final V W[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/core/AchievementImpl$AchievementState, s);
    }

    public static [] values()
    {
        return ([])W.clone();
    }

    static 
    {
        S = new <init>("UNEARNED", 0);
        T = new <init>("UNCLAIMED", 1);
        U = new <init>("PRESENTED", 2);
        V = new <init>("CLAIMED", 3);
        W = (new W[] {
            S, T, U, V
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
