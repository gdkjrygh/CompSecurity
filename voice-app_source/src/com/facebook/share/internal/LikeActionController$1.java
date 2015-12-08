// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class val.data
    implements eationCallback
{

    private final Intent val$data;
    private final int val$requestCode;
    private final int val$resultCode;

    public void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception)
    {
        if (facebookexception == null)
        {
            LikeActionController.access$10(likeactioncontroller, val$requestCode, val$resultCode, val$data);
            return;
        } else
        {
            Utility.logd(LikeActionController.access$0(), facebookexception);
            return;
        }
    }

    eationCallback()
    {
        val$requestCode = i;
        val$resultCode = j;
        val$data = intent;
        super();
    }
}
