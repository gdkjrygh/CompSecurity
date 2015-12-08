// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;


// Referenced classes of package com.contextlogic.wish.http:
//            HttpResponseHandler

private static final class  extends Enum
{

    private static final CachedResponse $VALUES[];
    public static final CachedResponse CachedResponse;
    public static final CachedResponse RequestFailed;
    public static final CachedResponse RequestFinished;
    public static final CachedResponse RequestStarted;
    public static final CachedResponse RequestSucceeded;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/http/HttpResponseHandler$ResponseMessageType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        RequestStarted = new <init>("RequestStarted", 0);
        RequestSucceeded = new <init>("RequestSucceeded", 1);
        RequestFailed = new <init>("RequestFailed", 2);
        RequestFinished = new <init>("RequestFinished", 3);
        CachedResponse = new <init>("CachedResponse", 4);
        $VALUES = (new .VALUES[] {
            RequestStarted, RequestSucceeded, RequestFailed, RequestFinished, CachedResponse
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
