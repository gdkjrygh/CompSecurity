// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.model;

import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestTaskCallback;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.model:
//            BaseModel, RequestToken

public class AccessToken extends BaseModel
{

    private String key;
    private String secret;

    public AccessToken()
    {
    }

    public static void authorize(String s, String s1, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("email", s);
        hashmap.put("password", s1);
        hashmap.put("request_token", Session.getInstance().getRequestToken().getKey());
        doPost(apiPath("/oauth/authorize.json", new Object[0]), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeObject(jsonobject, "token", com/uservoice/uservoicesdk/model/AccessToken));
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

    public void save(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject.put("oauth_token", key);
        jsonobject.put("oauth_token_secret", secret);
    }
}
