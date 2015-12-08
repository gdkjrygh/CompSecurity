// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messenger;


// Referenced classes of package com.facebook.messenger:
//            MessengerThreadParams

public static final class _cls9 extends Enum
{

    public static final UNKNOWN COMPOSE_FLOW;
    private static final UNKNOWN ENUM$VALUES[];
    public static final UNKNOWN REPLY_FLOW;
    public static final UNKNOWN UNKNOWN;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/facebook/messenger/MessengerThreadParams$Origin, s);
    }

    public static _cls9[] values()
    {
        _cls9 a_lcls9[] = ENUM$VALUES;
        int i = a_lcls9.length;
        _cls9 a_lcls9_1[] = new ENUM.VALUES[i];
        System.arraycopy(a_lcls9, 0, a_lcls9_1, 0, i);
        return a_lcls9_1;
    }

    static 
    {
        REPLY_FLOW = new <init>("REPLY_FLOW", 0);
        COMPOSE_FLOW = new <init>("COMPOSE_FLOW", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            REPLY_FLOW, COMPOSE_FLOW, UNKNOWN
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
