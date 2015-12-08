// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookSdk;
import com.facebook.internal.FileLruCache;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class  extends AccessTokenTracker
{

    protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
    {
        accesstoken = FacebookSdk.getApplicationContext();
        if (accesstoken1 == null)
        {
            LikeActionController.access$13((LikeActionController.access$12() + 1) % 1000);
            accesstoken.getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.access$12()).apply();
            LikeActionController.access$7().clear();
            LikeActionController.access$14().clearCache();
        }
        LikeActionController.access$15(null, "com.facebook.sdk.LikeActionController.DID_RESET");
    }

    ()
    {
    }
}
