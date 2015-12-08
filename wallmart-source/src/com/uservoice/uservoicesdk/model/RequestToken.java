// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel

public class RequestToken extends BaseModel
{

    private String key;
    private String secret;

    public RequestToken()
    {
    }

    public static void getRequestToken(Callback callback)
    {
        doGet(apiPath("/oauth/request_token.json", new Object[0]), new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeObject(jsonobject, "token", com/uservoice/uservoicesdk/model/RequestToken));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public String getKey()
    {
        return key;
    }

    public String getSecret()
    {
        return secret;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        key = jsonobject.getString("oauth_token");
        secret = jsonobject.getString("oauth_token_secret");
    }
}
