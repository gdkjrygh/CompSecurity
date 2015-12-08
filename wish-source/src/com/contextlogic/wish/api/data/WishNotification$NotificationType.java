// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;


// Referenced classes of package com.contextlogic.wish.api.data:
//            WishNotification

public static final class  extends Enum
{

    private static final VisitProfile $VALUES[];
    public static final VisitProfile BeingFollowed;
    public static final VisitProfile Default;
    public static final VisitProfile Recommendation;
    public static final VisitProfile ViralProduct;
    public static final VisitProfile VisitFeed;
    public static final VisitProfile VisitProfile;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/api/data/WishNotification$NotificationType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Default = new <init>("Default", 0);
        Recommendation = new <init>("Recommendation", 1);
        BeingFollowed = new <init>("BeingFollowed", 2);
        ViralProduct = new <init>("ViralProduct", 3);
        VisitFeed = new <init>("VisitFeed", 4);
        VisitProfile = new <init>("VisitProfile", 5);
        $VALUES = (new .VALUES[] {
            Default, Recommendation, BeingFollowed, ViralProduct, VisitFeed, VisitProfile
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
