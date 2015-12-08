// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;


// Referenced classes of package com.contextlogic.wish.api.service:
//            GetWishlistFeedService

public static final class  extends Enum
{

    private static final MENU $VALUES[];
    public static final MENU FEED;
    public static final MENU MENU;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/service/GetWishlistFeedService$REQUEST_SOURCE, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        FEED = new <init>("FEED", 0);
        MENU = new <init>("MENU", 1);
        $VALUES = (new .VALUES[] {
            FEED, MENU
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
