// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;


// Referenced classes of package com.google.common.hash:
//            Funnel, Funnels, PrimitiveSink

private static final class _cls9 extends Enum
    implements Funnel
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/google/common/hash/Funnels$UnencodedCharsFunnel, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    public void funnel(CharSequence charsequence, PrimitiveSink primitivesink)
    {
        primitivesink.putUnencodedChars(charsequence);
    }

    public volatile void funnel(Object obj, PrimitiveSink primitivesink)
    {
        funnel((CharSequence)obj, primitivesink);
    }

    public String toString()
    {
        return "Funnels.unencodedCharsFunnel()";
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
