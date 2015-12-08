// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            RequestQueue

public static final class  extends Enum
{

    public static final hG hF;
    public static final hG hG;
    private static final hG hH[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/net/RequestQueue$RequestQueueState, s);
    }

    public static [] values()
    {
        return ([])hH.clone();
    }

    static 
    {
        hF = new <init>("STOPPED", 0);
        hG = new <init>("STARTED", 1);
        hH = (new hH[] {
            hF, hG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
