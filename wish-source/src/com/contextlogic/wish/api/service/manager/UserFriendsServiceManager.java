// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import android.os.Handler;
import android.os.Looper;
import com.contextlogic.wish.analytics.Analytics;
import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.http.StringHttpResponseHandler;
import com.contextlogic.wish.http.WishHttpClient;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.model.GraphUser;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class UserFriendsServiceManager
{
    public static interface Callback
    {

        public abstract void onFailure();

        public abstract void onSuccess(HashMap hashmap);
    }


    private Callback callback;
    private HashMap friendMapping;
    private Handler handler;
    private Object requestTag;

    public UserFriendsServiceManager()
    {
        if (Looper.myLooper() != null)
        {
            handler = new Handler();
        }
        friendMapping = new HashMap();
    }

    private void processFacebookResponse(List list, boolean flag)
    {
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            list = (GraphUser)iterator.next();
            String s1 = list.getId();
            if (!friendMapping.containsKey(s1))
            {
                String s = list.getName();
                list = s;
                if (s == null)
                {
                    list = "";
                }
                list = new WishUser(list, s1);
                list.setUserState(com.contextlogic.wish.api.data.WishUser.WishUserState.Unregistered);
                friendMapping.put(s1, list);
            }
        } while (true);
        if (flag)
        {
            TransientCache.getInstance().cacheFriendMapping(friendMapping);
        }
        sendCallbackSuccessOnMainThread(friendMapping);
    }

    private void sendCallbackFailure()
    {
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.UserFriendsServiceManagerFetch, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Failure);
        requestTag = null;
        if (callback != null)
        {
            callback.onFailure();
            callback = null;
        }
    }

    private void sendCallbackFailureOnMainThread()
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final UserFriendsServiceManager this$0;

                public void run()
                {
                    sendCallbackFailure();
                }

            
            {
                this$0 = UserFriendsServiceManager.this;
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
        Analytics.getInstance().trackEvent(com.contextlogic.wish.analytics.Analytics.EventType.UserFriendsServiceManagerFetch, com.contextlogic.wish.analytics.Analytics.PageViewType.Api, com.contextlogic.wish.analytics.Analytics.LabelType.Success);
        requestTag = null;
        if (callback != null)
        {
            callback.onSuccess(hashmap);
            callback = null;
        }
    }

    private void sendCallbackSuccessOnMainThread(final HashMap friendMapping)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final UserFriendsServiceManager this$0;
                final HashMap val$friendMapping;

                public void run()
                {
                    sendCallbackSuccess(friendMapping);
                }

            
            {
                this$0 = UserFriendsServiceManager.this;
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

    private void startFacebookRequest(final boolean cacheResults)
    {
        Request.newMyFriendsRequest(FacebookManager.getInstance().getFacebookSession(), new com.facebook.Request.GraphUserListCallback() {

            final UserFriendsServiceManager this$0;
            final boolean val$cacheResults;

            public void onCompleted(List list, Response response)
            {
                if (response.getError() != null)
                {
                    sendCallbackFailureOnMainThread();
                    return;
                } else
                {
                    processFacebookResponse(list, cacheResults);
                    return;
                }
            }

            
            {
                this$0 = UserFriendsServiceManager.this;
                cacheResults = flag;
                super();
            }
        }).executeAsync();
    }

    private void startFacebookRequestOnMainThread(final boolean cacheResults)
    {
        if (handler != null)
        {
            handler.post(new Runnable() {

                final UserFriendsServiceManager this$0;
                final boolean val$cacheResults;

                public void run()
                {
                    startFacebookRequest(cacheResults);
                }

            
            {
                this$0 = UserFriendsServiceManager.this;
                cacheResults = flag;
                super();
            }
            });
            return;
        } else
        {
            startFacebookRequest(cacheResults);
            return;
        }
    }

    public void cancel()
    {
        callback = null;
        if (requestTag != null)
        {
            WishHttpClient.getInstance().cancelRequests(requestTag);
            requestTag = null;
        }
    }

    public void fetchFriends(String s, Callback callback1)
    {
        callback = callback1;
        callback1 = TransientCache.getInstance().getCachedFriendMapping();
        requestTag = new Object();
        if (callback1 != null)
        {
            sendCallbackSuccess(callback1);
            return;
        }
        callback1 = new StringHttpResponseHandler() {

            final UserFriendsServiceManager this$0;

            public void onFailure(Throwable throwable, String s1)
            {
                startFacebookRequestOnMainThread(false);
            }

            public void onSuccess(String s1)
            {
                processFriendJs(s1);
            }

            
            {
                this$0 = UserFriendsServiceManager.this;
                super();
            }
        };
        callback1.setCacheExpiry(0x19bfcc00L);
        callback1.setCanUseCachedResponse(true);
        callback1.setShouldCacheResponse(true);
        if (s != null)
        {
            WishHttpClient.getInstance().get(com.contextlogic.wish.http.WishHttpClient.RequestPool.Api, requestTag, s, null, callback1);
            return;
        } else
        {
            startFacebookRequestOnMainThread(true);
            return;
        }
    }

    public boolean isPending()
    {
        return requestTag != null;
    }

    public void processFriendJs(String s)
    {
        int i = s.indexOf('{');
        int j = s.lastIndexOf('}');
        if (i < 0 || j < 0 || j <= i)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        s = s.substring(i, j + 1);
        s = new JSONObject(s);
        JSONObject jsonobject;
        Object obj;
        for (Iterator iterator = s.keys(); iterator.hasNext(); friendMapping.put(obj.toString(), new WishUser(jsonobject)))
        {
            obj = (String)iterator.next();
            jsonobject = s.getJSONObject(((String) (obj)));
            jsonobject.put("id", obj);
            obj = jsonobject.get("fb_uid");
        }

        try
        {
            startFacebookRequestOnMainThread(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            sendCallbackFailureOnMainThread();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            sendCallbackFailureOnMainThread();
        }
        return;
        TransientCache.getInstance().cacheFriendMapping(friendMapping);
        sendCallbackSuccessOnMainThread(friendMapping);
        return;
    }






}
