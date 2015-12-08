// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


// Referenced classes of package com.adobe.mobile:
//            Config

public static final class value extends Enum
{

    private static final APPLICATION_TYPE_WEARABLE $VALUES[];
    public static final APPLICATION_TYPE_WEARABLE APPLICATION_TYPE_HANDHELD;
    public static final APPLICATION_TYPE_WEARABLE APPLICATION_TYPE_WEARABLE;
    private final int value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/adobe/mobile/Config$ApplicationType, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    protected int getValue()
    {
        return value;
    }

    static 
    {
        APPLICATION_TYPE_HANDHELD = new <init>("APPLICATION_TYPE_HANDHELD", 0, 0);
        APPLICATION_TYPE_WEARABLE = new <init>("APPLICATION_TYPE_WEARABLE", 1, 1);
        $VALUES = (new .VALUES[] {
            APPLICATION_TYPE_HANDHELD, APPLICATION_TYPE_WEARABLE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
