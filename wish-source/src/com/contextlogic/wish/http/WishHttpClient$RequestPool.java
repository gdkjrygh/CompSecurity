// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;


// Referenced classes of package com.contextlogic.wish.http:
//            WishHttpClient

public static final class  extends Enum
{

    private static final Image $VALUES[];
    public static final Image Api;
    public static final Image BackgroundApi;
    public static final Image Cached;
    public static final Image Image;
    public static final Image ImagePrefetch;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/http/WishHttpClient$RequestPool, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        BackgroundApi = new <init>("BackgroundApi", 0);
        Api = new <init>("Api", 1);
        ImagePrefetch = new <init>("ImagePrefetch", 2);
        Cached = new <init>("Cached", 3);
        Image = new <init>("Image", 4);
        $VALUES = (new .VALUES[] {
            BackgroundApi, Api, ImagePrefetch, Cached, Image
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
