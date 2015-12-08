// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;


// Referenced classes of package com.contextlogic.wish.http:
//            HttpRequest

public static final class  extends Enum
{

    private static final Post $VALUES[];
    public static final Post Get;
    public static final Post Post;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/http/HttpRequest$RequestType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Get = new <init>("Get", 0);
        Post = new <init>("Post", 1);
        $VALUES = (new .VALUES[] {
            Get, Post
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
