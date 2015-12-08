// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.analytics;


// Referenced classes of package com.contextlogic.wish.analytics:
//            Analytics

public static final class _cls9 extends Enum
{

    private static final Scroll $VALUES[];
    public static final Scroll Click;
    public static final Scroll Failure;
    public static final Scroll None;
    public static final Scroll Scroll;
    public static final Scroll Success;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/contextlogic/wish/analytics/Analytics$LabelType, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        None = new <init>("None", 0);
        Success = new <init>("Success", 1);
        Failure = new <init>("Failure", 2);
        Click = new <init>("Click", 3);
        Scroll = new <init>("Scroll", 4);
        $VALUES = (new .VALUES[] {
            None, Success, Failure, Click, Scroll
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
