// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;


// Referenced classes of package com.google.common.hash:
//            Funnel, Funnels, PrimitiveSink

private static final class  extends Enum
    implements Funnel
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/hash/Funnels$IntegerFunnel, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public void funnel(Integer integer, PrimitiveSink primitivesink)
    {
        primitivesink.putInt(integer.intValue());
    }

    public volatile void funnel(Object obj, PrimitiveSink primitivesink)
    {
        funnel((Integer)obj, primitivesink);
    }

    public String toString()
    {
        return "Funnels.integerFunnel()";
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
