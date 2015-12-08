// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            Request

public static final class  extends Enum
{

    public static final gE gC;
    public static final gE gD;
    public static final gE gE;
    private static final gE gF[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/net/Request$Priority, s);
    }

    public static [] values()
    {
        return ([])gF.clone();
    }

    static 
    {
        gC = new <init>("LOW", 0);
        gD = new <init>("NORMAL", 1);
        gE = new <init>("HIGH", 2);
        gF = (new gF[] {
            gC, gD, gE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
