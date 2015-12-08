// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.FacebookException;

// Referenced classes of package com.facebook.share.internal:
//            VideoUploader

class val.videoId
    implements Runnable
{

    final val.videoId this$1;
    private final FacebookException val$error;
    private final String val$videoId;

    public void run()
    {
        VideoUploader.access$6(loadContext, val$error, val$videoId);
    }

    ()
    {
        this$1 = final_;
        val$error = facebookexception;
        val$videoId = String.this;
        super();
    }
}
