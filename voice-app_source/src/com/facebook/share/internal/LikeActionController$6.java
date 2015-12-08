// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.Logger;
import com.facebook.internal.NativeProtocol;
import java.util.UUID;

// Referenced classes of package com.facebook.share.internal:
//            ResultProcessor, LikeActionController

class val.analyticsParameters extends ResultProcessor
{

    final LikeActionController this$0;
    private final Bundle val$analyticsParameters;

    public void onCancel(AppCall appcall)
    {
        onError(appcall, new FacebookOperationCanceledException());
    }

    public void onError(AppCall appcall, FacebookException facebookexception)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$0(), "Like Dialog failed with error : %s", new Object[] {
            facebookexception
        });
        Bundle bundle;
        if (val$analyticsParameters == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = val$analyticsParameters;
        }
        bundle.putString("call_id", appcall.getCallId().toString());
        LikeActionController.access$19(LikeActionController.this, "present_dialog", bundle);
        LikeActionController.access$20(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", NativeProtocol.createBundleForException(facebookexception));
    }

    public void onSuccess(AppCall appcall, Bundle bundle)
    {
        if (bundle == null || !bundle.containsKey("object_is_liked"))
        {
            return;
        }
        boolean flag = bundle.getBoolean("object_is_liked");
        String s = LikeActionController.access$3(LikeActionController.this);
        String s1 = LikeActionController.access$4(LikeActionController.this);
        if (bundle.containsKey("like_count_string"))
        {
            s = bundle.getString("like_count_string");
            s1 = s;
        }
        String s2 = LikeActionController.access$5(LikeActionController.this);
        String s3 = LikeActionController.access$6(LikeActionController.this);
        if (bundle.containsKey("social_sentence"))
        {
            s2 = bundle.getString("social_sentence");
            s3 = s2;
        }
        Bundle bundle1;
        if (bundle.containsKey("object_is_liked"))
        {
            bundle = bundle.getString("unlike_token");
        } else
        {
            bundle = LikeActionController.access$16(LikeActionController.this);
        }
        if (val$analyticsParameters == null)
        {
            bundle1 = new Bundle();
        } else
        {
            bundle1 = val$analyticsParameters;
        }
        bundle1.putString("call_id", appcall.getCallId().toString());
        LikeActionController.access$17(LikeActionController.this).logSdkEvent("fb_like_control_dialog_did_succeed", null, bundle1);
        LikeActionController.access$18(LikeActionController.this, flag, s, s1, s2, s3, bundle);
    }

    (Bundle bundle)
    {
        this$0 = final_likeactioncontroller;
        val$analyticsParameters = bundle;
        super(FacebookCallback.this);
    }
}
