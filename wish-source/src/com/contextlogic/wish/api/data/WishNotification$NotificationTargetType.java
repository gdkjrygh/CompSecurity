// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;


// Referenced classes of package com.contextlogic.wish.api.data:
//            WishNotification

public static final class  extends Enum
{

    private static final DeepLink $VALUES[];
    public static final DeepLink Alert;
    public static final DeepLink BrandFeed;
    public static final DeepLink DeepLink;
    public static final DeepLink Feed;
    public static final DeepLink Invite;
    public static final DeepLink None;
    public static final DeepLink Product;
    public static final DeepLink Profile;
    public static final DeepLink Rate;
    public static final DeepLink Website;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/data/WishNotification$NotificationTargetType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Website = new <init>("Website", 0);
        Product = new <init>("Product", 1);
        None = new <init>("None", 2);
        Invite = new <init>("Invite", 3);
        Feed = new <init>("Feed", 4);
        Profile = new <init>("Profile", 5);
        Alert = new <init>("Alert", 6);
        BrandFeed = new <init>("BrandFeed", 7);
        Rate = new <init>("Rate", 8);
        DeepLink = new <init>("DeepLink", 9);
        $VALUES = (new .VALUES[] {
            Website, Product, None, Invite, Feed, Profile, Alert, BrandFeed, Rate, DeepLink
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
