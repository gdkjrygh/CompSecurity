// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;


// Referenced classes of package com.devicecollector.collectors:
//            LocalCollector

private static final class  extends Enum
{

    private static final UID $VALUES[];
    public static final UID ANDROID_ID;
    public static final UID ANDROID_SERIAL;
    public static final UID MAC_HASH;
    public static final UID UID;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/devicecollector/collectors/LocalCollector$DeviceIDType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        ANDROID_ID = new <init>("ANDROID_ID", 0);
        ANDROID_SERIAL = new <init>("ANDROID_SERIAL", 1);
        MAC_HASH = new <init>("MAC_HASH", 2);
        UID = new <init>("UID", 3);
        $VALUES = (new .VALUES[] {
            ANDROID_ID, ANDROID_SERIAL, MAC_HASH, UID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
