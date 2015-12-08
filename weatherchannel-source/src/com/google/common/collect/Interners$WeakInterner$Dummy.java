// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            Interners

private static final class  extends Enum
{

    private static final VALUE $VALUES[];
    public static final VALUE VALUE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/collect/Interners$WeakInterner$Dummy, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        VALUE = new <init>("VALUE", 0);
        $VALUES = (new .VALUES[] {
            VALUE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
