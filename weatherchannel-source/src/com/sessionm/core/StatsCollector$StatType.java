// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            StatsCollector

public static final class  extends Enum
{

    public static final eS eQ;
    public static final eS eR;
    public static final eS eS;
    private static final eS eT[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/core/StatsCollector$StatType, s);
    }

    public static [] values()
    {
        return ([])eT.clone();
    }

    static 
    {
        eQ = new <init>("AVERAGE", 0);
        eR = new <init>("VALUE", 1);
        eS = new <init>("COUNT", 2);
        eT = (new eT[] {
            eQ, eR, eS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
