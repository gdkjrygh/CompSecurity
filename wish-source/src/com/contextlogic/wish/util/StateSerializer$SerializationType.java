// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;


// Referenced classes of package com.contextlogic.wish.util:
//            StateSerializer

public static final class  extends Enum
{

    private static final Status $VALUES[];
    public static final Status Follower;
    public static final Status Profile;
    public static final Status Session;
    public static final Status Status;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/util/StateSerializer$SerializationType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Profile = new <init>("Profile", 0);
        Follower = new <init>("Follower", 1);
        Session = new <init>("Session", 2);
        Status = new <init>("Status", 3);
        $VALUES = (new .VALUES[] {
            Profile, Follower, Session, Status
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
