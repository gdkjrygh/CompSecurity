// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            Config

public static final class  extends Enum
{

    public static final aF aB;
    public static final aF aC;
    public static final aF aD;
    public static final aF aE;
    public static final aF aF;
    private static final aF aG[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/core/Config$ServerType, s);
    }

    public static [] values()
    {
        return ([])aG.clone();
    }

    static 
    {
        aB = new <init>("PRODUCTION", 0);
        aC = new <init>("STAGING", 1);
        aD = new <init>("DEVELOPMENT", 2);
        aE = new <init>("JAPAN", 3);
        aF = new <init>("CUSTOM", 4);
        aG = (new aG[] {
            aB, aC, aD, aE, aF
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
