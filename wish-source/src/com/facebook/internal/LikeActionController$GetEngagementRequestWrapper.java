// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.Response;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Logger, Utility

private class setRequest extends setRequest
{

    String likeCountStringWithLike;
    String likeCountStringWithoutLike;
    String socialSentenceStringWithLike;
    String socialSentenceStringWithoutLike;
    final LikeActionController this$0;

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$1000(), "Error fetching engagement for object '%s' : %s", new Object[] {
            objectId, facebookrequesterror
        });
        LikeActionController.access$2600(LikeActionController.this, "get_engagement", facebookrequesterror);
    }

    protected void processSuccess(Response response)
    {
        response = Utility.tryGetJSONObjectFromResponse(response.getGraphObject(), "engagement");
        if (response != null)
        {
            likeCountStringWithLike = response.optString("count_string_with_like");
            likeCountStringWithoutLike = response.optString("count_string_without_like");
            socialSentenceStringWithLike = response.optString("social_sentence_with_like");
            socialSentenceStringWithoutLike = response.optString("social_sentence_without_like");
        }
    }

    (String s)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, s);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
        setRequest(new Request(LikeActionController.access$2700(LikeActionController.this), s, bundle, HttpMethod.GET));
    }
}
