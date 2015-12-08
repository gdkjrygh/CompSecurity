// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            RequestQueue

public static final class  extends Enum
{

    public static final hJ hI;
    public static final hJ hJ;
    private static final hJ hK[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/net/RequestQueue$RequestQueueType, s);
    }

    public static [] values()
    {
        return ([])hK.clone();
    }

    static 
    {
        hI = new <init>("FAST_FAIL", 0);
        hJ = new <init>("BEST_EFFORT", 1);
        hK = (new hK[] {
            hI, hJ
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
