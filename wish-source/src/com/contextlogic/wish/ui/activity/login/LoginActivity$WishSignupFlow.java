// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;


// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

public static final class  extends Enum
{

    private static final None $VALUES[];
    public static final None Categories;
    public static final None FreeGifts;
    public static final None GenderFreeGifts;
    public static final None None;
    public static final None Other;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/activity/login/LoginActivity$WishSignupFlow, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Categories = new <init>("Categories", 0);
        FreeGifts = new <init>("FreeGifts", 1);
        GenderFreeGifts = new <init>("GenderFreeGifts", 2);
        Other = new <init>("Other", 3);
        None = new <init>("None", 4);
        $VALUES = (new .VALUES[] {
            Categories, FreeGifts, GenderFreeGifts, Other, None
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
