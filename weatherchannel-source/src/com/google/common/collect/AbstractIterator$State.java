// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            AbstractIterator

private static final class  extends Enum
{

    private static final FAILED $VALUES[];
    public static final FAILED DONE;
    public static final FAILED FAILED;
    public static final FAILED NOT_READY;
    public static final FAILED READY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/collect/AbstractIterator$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        READY = new <init>("READY", 0);
        NOT_READY = new <init>("NOT_READY", 1);
        DONE = new <init>("DONE", 2);
        FAILED = new <init>("FAILED", 3);
        $VALUES = (new .VALUES[] {
            READY, NOT_READY, DONE, FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
