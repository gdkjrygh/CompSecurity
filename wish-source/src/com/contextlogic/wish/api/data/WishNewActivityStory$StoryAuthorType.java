// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;


// Referenced classes of package com.contextlogic.wish.api.data:
//            WishNewActivityStory

public static final class I extends Enum
{

    private static final User $VALUES[];
    public static final User Unknown;
    public static final User User;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/contextlogic/wish/api/data/WishNewActivityStory$StoryAuthorType, s);
    }

    public static I[] values()
    {
        return (I[])$VALUES.clone();
    }

    static 
    {
        Unknown = new <init>("Unknown", 0);
        User = new <init>("User", 1);
        $VALUES = (new .VALUES[] {
            Unknown, User
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
