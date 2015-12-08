// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net;


// Referenced classes of package com.sessionm.net:
//            RequestQueue

public static final class _cls9 extends Enum
{

    public static final hD hC;
    public static final hD hD;
    private static final hD hE[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/sessionm/net/RequestQueue$RequestQueueSendState, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])hE.clone();
    }

    static 
    {
        hC = new <init>("IDLE", 0);
        hD = new <init>("SENDING", 1);
        hE = (new hE[] {
            hC, hD
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
