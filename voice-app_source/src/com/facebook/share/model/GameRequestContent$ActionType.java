// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//            GameRequestContent

public static final class  extends Enum
{

    public static final TURN ASKFOR;
    private static final TURN ENUM$VALUES[];
    public static final TURN SEND;
    public static final TURN TURN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/share/model/GameRequestContent$ActionType, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        SEND = new <init>("SEND", 0);
        ASKFOR = new <init>("ASKFOR", 1);
        TURN = new <init>("TURN", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            SEND, ASKFOR, TURN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
