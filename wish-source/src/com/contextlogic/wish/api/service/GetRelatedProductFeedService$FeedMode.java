// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;


// Referenced classes of package com.contextlogic.wish.api.service:
//            GetRelatedProductFeedService

public static final class  extends Enum
{

    private static final Similar $VALUES[];
    public static final Similar Similar;
    public static final Similar Tag;
    public static final Similar Trending;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/service/GetRelatedProductFeedService$FeedMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Tag = new <init>("Tag", 0);
        Trending = new <init>("Trending", 1);
        Similar = new <init>("Similar", 2);
        $VALUES = (new .VALUES[] {
            Tag, Trending, Similar
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
