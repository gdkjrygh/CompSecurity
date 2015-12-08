// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.core;


// Referenced classes of package com.contextlogic.wish.api.core:
//            WishApiRequest, WishApiResponse

public interface WishApiCallback
{

    public abstract void onFailure(WishApiRequest wishapirequest, WishApiResponse wishapiresponse);

    public abstract void onSuccess(WishApiRequest wishapirequest, WishApiResponse wishapiresponse);
}
