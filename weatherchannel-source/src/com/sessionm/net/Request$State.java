// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            Request

public static final class  extends Enum
{

    public static final gJ gG;
    public static final gJ gH;
    public static final gJ gI;
    public static final gJ gJ;
    private static final gJ gK[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/net/Request$State, s);
    }

    public static [] values()
    {
        return ([])gK.clone();
    }

    public boolean bh()
    {
        return this == gI || this == gJ;
    }

    static 
    {
        gG = new <init>("UNSENT", 0);
        gH = new <init>("SENDING", 1);
        gI = new <init>("COMPLETED", 2);
        gJ = new <init>("FAILED", 3);
        gK = (new gK[] {
            gG, gH, gI, gJ
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
