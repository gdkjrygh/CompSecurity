// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile.userlist;


// Referenced classes of package com.contextlogic.wish.ui.fragment.profile.userlist:
//            ProfileUserListFragment

public static final class  extends Enum
{

    private static final Followers $VALUES[];
    public static final Followers Followers;
    public static final Followers Following;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/fragment/profile/userlist/ProfileUserListFragment$SectionMode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Following = new <init>("Following", 0);
        Followers = new <init>("Followers", 1);
        $VALUES = (new .VALUES[] {
            Following, Followers
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
