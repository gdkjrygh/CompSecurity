// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.userlist;


// Referenced classes of package com.contextlogic.wish.ui.fragment.profile.userlist:
//            ProfileUserListFollowButton

public static final class  extends Enum
{

    private static final FollowingLoading $VALUES[];
    public static final FollowingLoading Follow;
    public static final FollowingLoading FollowLoading;
    public static final FollowingLoading Following;
    public static final FollowingLoading FollowingLoading;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/fragment/profile/userlist/ProfileUserListFollowButton$ButtonMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Follow = new <init>("Follow", 0);
        Following = new <init>("Following", 1);
        FollowLoading = new <init>("FollowLoading", 2);
        FollowingLoading = new <init>("FollowingLoading", 3);
        $VALUES = (new .VALUES[] {
            Follow, Following, FollowLoading, FollowingLoading
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
