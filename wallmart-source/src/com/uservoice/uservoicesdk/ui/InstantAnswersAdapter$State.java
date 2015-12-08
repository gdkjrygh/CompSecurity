// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;


// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            InstantAnswersAdapter

protected static final class  extends Enum
{

    private static final DETAILS $VALUES[];
    public static final DETAILS DETAILS;
    public static final DETAILS INIT;
    public static final DETAILS INIT_LOADING;
    public static final DETAILS INSTANT_ANSWERS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/uservoice/uservoicesdk/ui/InstantAnswersAdapter$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        INIT = new <init>("INIT", 0);
        INIT_LOADING = new <init>("INIT_LOADING", 1);
        INSTANT_ANSWERS = new <init>("INSTANT_ANSWERS", 2);
        DETAILS = new <init>("DETAILS", 3);
        $VALUES = (new .VALUES[] {
            INIT, INIT_LOADING, INSTANT_ANSWERS, DETAILS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
