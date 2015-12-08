// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector;


// Referenced classes of package com.devicecollector:
//            DeviceCollector

public static final class  extends Enum
{

    private static final RUNTIME_FAILURE $VALUES[];
    public static final RUNTIME_FAILURE INVALID_MERCHANT;
    public static final RUNTIME_FAILURE INVALID_SESSION;
    public static final RUNTIME_FAILURE INVALID_URL;
    public static final RUNTIME_FAILURE MERCHANT_CANCELLED;
    public static final RUNTIME_FAILURE NO_NETWORK;
    public static final RUNTIME_FAILURE RUNTIME_FAILURE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/devicecollector/DeviceCollector$ErrorCode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NO_NETWORK = new <init>("NO_NETWORK", 0);
        INVALID_URL = new <init>("INVALID_URL", 1);
        INVALID_MERCHANT = new <init>("INVALID_MERCHANT", 2);
        INVALID_SESSION = new <init>("INVALID_SESSION", 3);
        MERCHANT_CANCELLED = new <init>("MERCHANT_CANCELLED", 4);
        RUNTIME_FAILURE = new <init>("RUNTIME_FAILURE", 5);
        $VALUES = (new .VALUES[] {
            NO_NETWORK, INVALID_URL, INVALID_MERCHANT, INVALID_SESSION, MERCHANT_CANCELLED, RUNTIME_FAILURE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
