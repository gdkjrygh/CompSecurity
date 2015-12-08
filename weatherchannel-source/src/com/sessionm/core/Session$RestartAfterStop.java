// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;


// Referenced classes of package com.sessionm.core:
//            Session

private static final class  extends Enum
{

    public static final eq eo;
    public static final eq ep;
    public static final eq eq;
    private static final eq er[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/core/Session$RestartAfterStop, s);
    }

    public static [] values()
    {
        return ([])er.clone();
    }

    static 
    {
        eo = new <init>("DoNotRestart", 0);
        ep = new <init>("ClearClientAndRestart", 1);
        eq = new <init>("RestartWithoutReset", 2);
        er = (new er[] {
            eo, ep, eq
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
