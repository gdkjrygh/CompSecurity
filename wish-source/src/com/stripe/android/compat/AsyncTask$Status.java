// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.android.compat;


// Referenced classes of package com.stripe.android.compat:
//            AsyncTask

public static final class  extends Enum
{

    private static final FINISHED $VALUES[];
    public static final FINISHED FINISHED;
    public static final FINISHED PENDING;
    public static final FINISHED RUNNING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/stripe/android/compat/AsyncTask$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PENDING = new <init>("PENDING", 0);
        RUNNING = new <init>("RUNNING", 1);
        FINISHED = new <init>("FINISHED", 2);
        $VALUES = (new .VALUES[] {
            PENDING, RUNNING, FINISHED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
