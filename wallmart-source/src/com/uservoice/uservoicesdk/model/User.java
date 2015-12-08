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
//            BaseModel, RequestToken, AccessToken, AccessTokenResult

public class User extends BaseModel
{

    private String email;
    private String name;

    public User()
    {
    }

    public static void discover(String s, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("email", s);
        doGet(apiPath("/users/discover.json", new Object[0]), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeObject(jsonobject, "user", com/uservoice/uservoicesdk/model/User));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static void findOrCreate(String s, String s1, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("user[display_name]", s1);
        hashmap.put("user[email]", s);
        hashmap.put("request_token", Session.getInstance().getRequestToken().getKey());
        doPost(apiPath("/users.json", new Object[0]), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                AccessToken accesstoken = (AccessToken)BaseModel.deserializeObject(jsonobject, "token", com/uservoice/uservoicesdk/model/AccessToken);
                jsonobject = (User)BaseModel.deserializeObject(jsonobject, "user", com/uservoice/uservoicesdk/model/User);
                callback.onModel(new AccessTokenResult(jsonobject, accesstoken));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static void findOrCreate(String s, String s1, String s2, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("user[display_name]", s1);
        hashmap.put("user[email]", s);
        hashmap.put("user[guid]", s2);
        hashmap.put("request_token", Session.getInstance().getRequestToken().getKey());
        doPost(apiPath("/users/find_or_create.json", new Object[0]), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                AccessToken accesstoken = (AccessToken)BaseModel.deserializeObject(jsonobject, "token", com/uservoice/uservoicesdk/model/AccessToken);
                jsonobject = (User)BaseModel.deserializeObject(jsonobject, "user", com/uservoice/uservoicesdk/model/User);
                callback.onModel(new AccessTokenResult(jsonobject, accesstoken));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static void loadCurrentUser(Callback callback)
    {
        doGet(apiPath("/users/current.json", new Object[0]), new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeObject(jsonobject, "user", com/uservoice/uservoicesdk/model/User));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public static void sendForgotPassword(String s, Callback callback)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("user[email]", s);
        doGet(apiPath("/users/forgot_password.json", new Object[0]), hashmap, new RestTaskCallback(callback, callback) {

            final Callback val$callback;

            public void onComplete(JSONObject jsonobject)
                throws JSONException
            {
                callback.onModel(BaseModel.deserializeObject(jsonobject, "user", com/uservoice/uservoicesdk/model/User));
            }

            
            {
                callback = callback2;
                super(callback1);
            }
        });
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }

    public void load(JSONObject jsonobject)
        throws JSONException
    {
        super.load(jsonobject);
        name = getString(jsonobject, "name");
        email = getString(jsonobject, "email");
    }
}
