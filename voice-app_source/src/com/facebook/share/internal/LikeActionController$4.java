// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.FacebookException;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class val.error
    implements Runnable
{

    private final eationCallback val$callback;
    private final LikeActionController val$controller;
    private final FacebookException val$error;

    public void run()
    {
        val$callback.onComplete(val$controller, val$error);
    }

    eationCallback()
    {
        val$callback = eationcallback;
        val$controller = likeactioncontroller;
        val$error = facebookexception;
        super();
    }
}
