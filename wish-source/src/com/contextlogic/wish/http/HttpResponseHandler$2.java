// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;


// Referenced classes of package com.contextlogic.wish.http:
//            HttpResponseHandler

static class sponseMessageType
{

    static final int $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[];

    static 
    {
        $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType = new int[sponseMessageType.values().length];
        try
        {
            $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[sponseMessageType.RequestStarted.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[sponseMessageType.RequestFailed.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[sponseMessageType.RequestSucceeded.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[sponseMessageType.RequestFinished.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$contextlogic$wish$http$HttpResponseHandler$ResponseMessageType[sponseMessageType.CachedResponse.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
