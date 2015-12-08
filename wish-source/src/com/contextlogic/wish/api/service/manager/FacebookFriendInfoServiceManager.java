// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.data.FacebookFriendInfo;
import com.contextlogic.wish.api.data.WishProfileImage;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.facebook.FacebookManager;
import com.facebook.HttpMethod;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.model.GraphObject;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookFriendInfoServiceManager
{
    public static interface Callback
    {

        public abstract void onFailure();

        public abstract void onSuccess(HashMap hashmap);
    }


    private Callback callback;
    private HashMap friendMapping;
    private Handler handler;
    private boolean isPending;

    public FacebookFriendInfoServiceManager()
    {
        if (Looper.myLooper() != null)
        {
            handler = new Handler();
        }
        isPending = false;
        friendMapping = new HashMap();
    }

    private void processFacebookResponse(Response response)
    {
        int i;
        JSONObject jsonobject;
        FacebookFriendInfo facebookfriendinfo;
        try
        {
            response = response.getGraphObject().getInnerJSONObject().getJSONArray("data");
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            throw new ApiMalformedDataException(response.getMessage());
        }
        i = 0;
_L2:
        if (i < response.length())
        {
            jsonobject = response.getJSONObject(i);
            facebookfriendinfo = new FacebookFriendInfo();
            if (jsonobject.has("id") && !jsonobject.isNull("id"))
            {
                facebookfriendinfo.setFbId(jsonobject.getString("id"));
                facebookfriendinfo.setProfileImage(new WishProfileImage(jsonobject.getString("id"), true));
                if (jsonobject.has("name") && !jsonobject.isNull("name"))
                {
                    facebookfriendinfo.setName(jsonobject.getString("name"));
                    if (jsonobject.has("first_name") && !jsonobject.isNull("first_name"))
                    {
                        facebookfriendinfo.setFirstName(jsonobject.getString("first_name"));
                        if (jsonobject.has("birthday") && !jsonobject.isNull("birthday"))
                        {
                            facebookfriendinfo.setBirthday(jsonobject.getString("birthday"));
                        }
                        friendMapping.put(facebookfriendinfo.getFbId(), facebookfriendinfo);
                    }
                }
            }
            break MISSING_BLOCK_LABEL_220;
        }
        TransientCache.getInstance().cacheFriendInfoMapping(friendMapping);
        sendCallbackSuccessOnMainThread(friendMapping);
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void sendCallbackFailure()
    {
        isPending = false;
        if (callback != null)
        {
            callback.onFailure();
        }
    }

    private void sendCallbackFailureOnMainThread()
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final FacebookFriendInfoServiceManager this$0;

                public void run()
                {
                    sendCallbackFailure();
                }

            
            {
                this$0 = FacebookFriendInfoServiceManager.this;
                super();
            }
            });
            return;
        } else
        {
            sendCallbackFailure();
            return;
        }
    }

    private void sendCallbackSuccess(HashMap hashmap)
    {
        isPending = false;
        if (callback != null)
        {
            callback.onSuccess(hashmap);
        }
    }

    private void sendCallbackSuccessOnMainThread(final HashMap friendMapping)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final FacebookFriendInfoServiceManager this$0;
                final HashMap val$friendMapping;

                public void run()
                {
                    sendCallbackSuccess(friendMapping);
                }

            
            {
                this$0 = FacebookFriendInfoServiceManager.this;
                friendMapping = hashmap;
                super();
            }
            });
            return;
        } else
        {
            sendCallbackSuccess(friendMapping);
            return;
        }
    }

    private void startFacebookRequest()
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,gender,birthday,first_name");
        (new Request(FacebookManager.getInstance().getFacebookSession(), "me/friends", bundle, HttpMethod.GET, new com.facebook.Request.Callback() {

            final FacebookFriendInfoServiceManager this$0;

            public void onCompleted(Response response)
            {
                if (response.getError() != null)
                {
                    sendCallbackFailureOnMainThread();
                    return;
                } else
                {
                    processFacebookResponse(response);
                    return;
                }
            }

            
            {
                this$0 = FacebookFriendInfoServiceManager.this;
                super();
            }
        })).executeAsync();
    }

    private void startFacebookRequestOnMainThread()
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final FacebookFriendInfoServiceManager this$0;

                public void run()
                {
                    startFacebookRequest();
                }

            
            {
                this$0 = FacebookFriendInfoServiceManager.this;
                super();
            }
            });
            return;
        } else
        {
            startFacebookRequest();
            return;
        }
    }

    public void cancelRequests()
    {
        callback = null;
    }

    public void fetchFriendInfo(Callback callback1)
    {
        callback = callback1;
        isPending = true;
        callback1 = TransientCache.getInstance().getCachedFriendInfoMapping();
        if (callback1 != null && callback1.size() > 0)
        {
            sendCallbackSuccess(callback1);
            return;
        } else
        {
            startFacebookRequestOnMainThread();
            return;
        }
    }

    public boolean isPendind()
    {
        return isPending;
    }





}
