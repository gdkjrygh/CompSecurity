// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.cache.TransientCache;
import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.api.service:
//            ApiService

public class GooglePlusFriendsService extends ApiService
{
    public static interface SuccessCallback
    {

        public abstract void onServiceSucceeded(HashMap hashmap);
    }


    private Object requestTag;

    public GooglePlusFriendsService()
    {
    }

    public void cancelAllRequests()
    {
        if (requestTag != null)
        {
            requestTag = null;
        }
    }

    public boolean isPending()
    {
        return requestTag != null;
    }

    public void loadFriendPage(final HashMap friendMapping, String s, final SuccessCallback successCallback, final ApiService.FailureCallback failureCallback, final Object currentRequestTag)
    {
        if (currentRequestTag != requestTag)
        {
            return;
        } else
        {
            Plus.PeopleApi.loadVisible(GooglePlusManager.getInstance().getPlusClient(), 0, s).setResultCallback(new ResultCallback() {

                final GooglePlusFriendsService this$0;
                final Object val$currentRequestTag;
                final ApiService.FailureCallback val$failureCallback;
                final HashMap val$friendMapping;
                final SuccessCallback val$successCallback;

                public volatile void onResult(Result result)
                {
                    onResult((com.google.android.gms.plus.People.LoadPeopleResult)result);
                }

                public void onResult(com.google.android.gms.plus.People.LoadPeopleResult loadpeopleresult)
                {
                    String s1;
                    Status status;
                    s1 = loadpeopleresult.getNextPageToken();
                    status = loadpeopleresult.getStatus();
                    loadpeopleresult = loadpeopleresult.getPersonBuffer();
                    if (!status.isSuccess()) goto _L2; else goto _L1
_L1:
                    for (int i = 0; i < loadpeopleresult.getCount(); i++)
                    {
                        Object obj = loadpeopleresult.get(i);
                        String s2 = ((Person) (obj)).getDisplayName();
                        if (s2 != null && !s2.equals(""))
                        {
                            obj = new WishUser(((Person) (obj)).getDisplayName(), ((Person) (obj)).getId(), ((Person) (obj)).getImage().getUrl());
                            friendMapping.put(((WishUser) (obj)).getGoogleId(), obj);
                        }
                    }

                    if (currentRequestTag == requestTag) goto _L4; else goto _L3
_L3:
                    return;
_L4:
                    if (s1 == null) goto _L6; else goto _L5
_L5:
                    loadFriendPage(friendMapping, s1, successCallback, failureCallback, currentRequestTag);
_L7:
                    try
                    {
                        loadpeopleresult.close();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (com.google.android.gms.plus.People.LoadPeopleResult loadpeopleresult)
                    {
                        return;
                    }
_L6:
                    TransientCache.getInstance().cacheGoogleFriendMapping(friendMapping);
                    if (successCallback != null)
                    {
                        successCallback.onServiceSucceeded(friendMapping);
                    }
                    if (true) goto _L7; else goto _L2
_L2:
                    if (currentRequestTag == requestTag && failureCallback != null)
                    {
                        failureCallback.onServiceFailed();
                        return;
                    }
                    if (true) goto _L3; else goto _L8
_L8:
                }

            
            {
                this$0 = GooglePlusFriendsService.this;
                friendMapping = hashmap;
                currentRequestTag = obj;
                successCallback = successcallback;
                failureCallback = failurecallback;
                super();
            }
            });
            return;
        }
    }

    public void requestService(SuccessCallback successcallback, ApiService.FailureCallback failurecallback)
    {
        cancelAllRequests();
        HashMap hashmap = TransientCache.getInstance().getCachedGoogleFriendMapping();
        if (hashmap != null && hashmap.size() > 0)
        {
            successcallback.onServiceSucceeded(hashmap);
            return;
        } else
        {
            Object obj = new Object();
            requestTag = obj;
            loadFriendPage(new HashMap(), null, successcallback, failurecallback, obj);
            return;
        }
    }

}
