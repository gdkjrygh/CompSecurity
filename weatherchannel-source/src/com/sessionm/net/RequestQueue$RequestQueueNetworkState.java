// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            RequestQueue

public static final class  extends Enum
{

    public static final hA hA;
    private static final hA hB[];
    public static final hA hy;
    public static final hA hz;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/net/RequestQueue$RequestQueueNetworkState, s);
    }

    public static [] values()
    {
        return ([])hB.clone();
    }

    static 
    {
        hy = new <init>("CONNECTED", 0);
        hz = new <init>("DISCONNECTED", 1);
        hA = new <init>("CONNECTING", 2);
        hB = (new hB[] {
            hy, hz, hA
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
