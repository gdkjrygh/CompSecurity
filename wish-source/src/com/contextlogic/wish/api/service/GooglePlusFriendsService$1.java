// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.data.WishUser;
import com.contextlogic.wish.cache.TransientCache;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GooglePlusFriendsService

class val.failureCallback
    implements ResultCallback
{

    final GooglePlusFriendsService this$0;
    final Object val$currentRequestTag;
    final onServiceFailed val$failureCallback;
    final HashMap val$friendMapping;
    final ccessCallback val$successCallback;

    public volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.plus.ice._cls1.onResult)result);
    }

    public void onResult(com.google.android.gms.plus.ice._cls1 _pcls1)
    {
        String s;
        Status status;
        s = _pcls1.NextPageToken();
        status = _pcls1.Status();
        _pcls1 = _pcls1.PersonBuffer();
        if (!status.isSuccess()) goto _L2; else goto _L1
_L1:
        for (int i = 0; i < _pcls1.getCount(); i++)
        {
            Object obj = _pcls1.get(i);
            String s1 = ((Person) (obj)).getDisplayName();
            if (s1 != null && !s1.equals(""))
            {
                obj = new WishUser(((Person) (obj)).getDisplayName(), ((Person) (obj)).getId(), ((Person) (obj)).getImage().());
                val$friendMapping.put(((WishUser) (obj)).getGoogleId(), obj);
            }
        }

        if (val$currentRequestTag == GooglePlusFriendsService.access$000(GooglePlusFriendsService.this)) goto _L4; else goto _L3
_L3:
        return;
_L4:
        if (s == null) goto _L6; else goto _L5
_L5:
        loadFriendPage(val$friendMapping, s, val$successCallback, val$failureCallback, val$currentRequestTag);
_L7:
        try
        {
            _pcls1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.plus.ice._cls1 _pcls1)
        {
            return;
        }
_L6:
        TransientCache.getInstance().cacheGoogleFriendMapping(val$friendMapping);
        if (val$successCallback != null)
        {
            val$successCallback.onServiceSucceeded(val$friendMapping);
        }
        if (true) goto _L7; else goto _L2
_L2:
        if (val$currentRequestTag == GooglePlusFriendsService.access$000(GooglePlusFriendsService.this) && val$failureCallback != null)
        {
            val$failureCallback.onServiceFailed();
            return;
        }
        if (true) goto _L3; else goto _L8
_L8:
    }

    ccessCallback()
    {
        this$0 = final_googleplusfriendsservice;
        val$friendMapping = hashmap;
        val$currentRequestTag = obj;
        val$successCallback = ccesscallback;
        val$failureCallback = val.failureCallback.this;
        super();
    }
}
