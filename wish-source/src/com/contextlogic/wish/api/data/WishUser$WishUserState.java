// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;


// Referenced classes of package com.contextlogic.wish.api.data:
//            WishUser

public static final class  extends Enum
{

    private static final Unknown $VALUES[];
    public static final Unknown Registered;
    public static final Unknown Unknown;
    public static final Unknown Unregistered;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/data/WishUser$WishUserState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Registered = new <init>("Registered", 0);
        Unregistered = new <init>("Unregistered", 1);
        Unknown = new <init>("Unknown", 2);
        $VALUES = (new .VALUES[] {
            Registered, Unregistered, Unknown
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
