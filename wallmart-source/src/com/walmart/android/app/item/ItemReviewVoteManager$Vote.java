// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;


// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewVoteManager

public static final class  extends Enum
{

    private static final NOT_HELPFUL $VALUES[];
    public static final NOT_HELPFUL HELPFUL;
    public static final NOT_HELPFUL NOT_HELPFUL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/walmart/android/app/item/ItemReviewVoteManager$Vote, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        HELPFUL = new <init>("HELPFUL", 0);
        NOT_HELPFUL = new <init>("NOT_HELPFUL", 1);
        $VALUES = (new .VALUES[] {
            HELPFUL, NOT_HELPFUL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
