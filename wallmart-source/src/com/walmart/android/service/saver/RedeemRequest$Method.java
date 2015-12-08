// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;


// Referenced classes of package com.walmart.android.service.saver:
//            RedeemRequest

public static final class  extends Enum
{

    private static final GCReload $VALUES[];
    public static final GCReload AMEX;
    public static final GCReload GCActivate;
    public static final GCReload GCReload;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmart/android/service/saver/RedeemRequest$Method, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AMEX = new <init>("AMEX", 0);
        GCActivate = new <init>("GCActivate", 1);
        GCReload = new <init>("GCReload", 2);
        $VALUES = (new .VALUES[] {
            AMEX, GCActivate, GCReload
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
