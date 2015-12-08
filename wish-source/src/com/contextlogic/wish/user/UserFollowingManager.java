// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.user;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.api.service.GetUserFolloweesService;
import com.contextlogic.wish.util.StateSerializer;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class UserFollowingManager
{

    private HashMap followingMapping;
    private GetUserFolloweesService getFolloweesService;

    public UserFollowingManager()
    {
        getFolloweesService = new GetUserFolloweesService();
    }

    public boolean deserialize()
    {
        Object obj1;
        Object obj2;
        Exception exception;
        Object obj3;
        obj2 = null;
        obj1 = null;
        obj3 = null;
        exception = null;
        Object obj = WishApplication.getAppInstance().openFileInput("serialized_following");
        obj1 = obj;
        obj2 = obj;
        ObjectInputStream objectinputstream = new ObjectInputStream(((java.io.InputStream) (obj)));
        obj2 = new JSONObject((String)objectinputstream.readObject());
        obj1 = new HashMap();
        for (obj2 = ((JSONObject) (obj2)).keys(); ((Iterator) (obj2)).hasNext(); ((HashMap) (obj1)).put((String)((Iterator) (obj2)).next(), Boolean.valueOf(true))) { }
          goto _L1
        obj1;
        obj1 = objectinputstream;
_L5:
        if (obj1 != null)
        {
            try
            {
                ((ObjectInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
        }
        return false;
_L1:
        setFollowingMapping(((HashMap) (obj1)));
        if (objectinputstream != null)
        {
            try
            {
                objectinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        Throwable throwable;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return true;
            }
            return true;
        } else
        {
            return true;
        }
        obj;
        obj2 = obj3;
_L3:
        if (obj2 != null)
        {
            try
            {
                ((ObjectInputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
        exception;
        obj2 = objectinputstream;
        obj1 = obj;
        obj = exception;
        if (true) goto _L3; else goto _L2
_L2:
        throwable;
        throwable = ((Throwable) (obj2));
        obj1 = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean isFollowing(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (followingMapping != null)
        {
            flag = flag1;
            if (followingMapping.get(s) != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void refreshFollowing()
    {
        if (getFolloweesService.isPending())
        {
            return;
        } else
        {
            getFolloweesService.requestService(true, new com.contextlogic.wish.api.service.GetUserFolloweesService.SuccessCallback() {

                final UserFollowingManager this$0;

                public void onServiceSucceeded()
                {
                }

            
            {
                this$0 = UserFollowingManager.this;
                super();
            }
            }, null);
            return;
        }
    }

    public void serialize()
    {
        if (followingMapping == null)
        {
            return;
        }
        final Object storedObject = new JSONObject();
        try
        {
            for (Iterator iterator = followingMapping.keySet().iterator(); iterator.hasNext(); ((JSONObject) (storedObject)).put((String)iterator.next(), true)) { }
        }
        // Misplaced declaration of an exception variable
        catch (final Object storedObject)
        {
            return;
        }
        StateSerializer.getInstance().getThreadPool(com.contextlogic.wish.util.StateSerializer.SerializationType.Follower).execute(new Runnable() {

            final UserFollowingManager this$0;
            final JSONObject val$storedObject;

            public void run()
            {
                Object obj1;
                Object obj2;
                Object obj3;
                Object obj4;
                obj2 = null;
                obj1 = null;
                obj3 = null;
                obj4 = null;
                Object obj = WishApplication.getAppInstance().openFileOutput("serialized_following", 0);
                obj1 = obj;
                obj2 = obj;
                ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
                objectoutputstream.writeObject(storedObject.toString());
                if (objectoutputstream != null)
                {
                    try
                    {
                        objectoutputstream.close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                }
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_150;
                }
                ((FileOutputStream) (obj)).close();
_L2:
                return;
                obj;
                return;
                obj;
                obj2 = obj4;
                obj = obj1;
_L5:
                if (obj2 != null)
                {
                    try
                    {
                        ((ObjectOutputStream) (obj2)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                }
                if (obj == null) goto _L2; else goto _L1
_L1:
                try
                {
                    ((FileOutputStream) (obj)).close();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
                obj;
                obj1 = obj3;
_L4:
                if (obj1 != null)
                {
                    try
                    {
                        ((ObjectOutputStream) (obj1)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                }
                if (obj2 != null)
                {
                    try
                    {
                        ((FileOutputStream) (obj2)).close();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1) { }
                }
                throw obj;
                Exception exception;
                exception;
                obj1 = objectoutputstream;
                obj2 = obj;
                obj = exception;
                if (true) goto _L4; else goto _L3
_L3:
                Throwable throwable;
                throwable;
                obj2 = objectoutputstream;
                  goto _L5
            }

            
            {
                this$0 = UserFollowingManager.this;
                storedObject = jsonobject;
                super();
            }
        });
    }

    public void setFollowing(String s)
    {
        if (followingMapping != null)
        {
            if (!followingMapping.containsKey(s))
            {
                followingMapping.put(s, Boolean.valueOf(true));
                serialize();
            }
            return;
        } else
        {
            followingMapping = new HashMap();
            followingMapping.put(s, Boolean.valueOf(true));
            return;
        }
    }

    public void setFollowingMapping(HashMap hashmap)
    {
        setFollowingMapping(hashmap, true);
    }

    public void setFollowingMapping(HashMap hashmap, boolean flag)
    {
        followingMapping = hashmap;
        if (flag)
        {
            serialize();
        }
    }

    public void setNotFollowing(String s)
    {
        if (followingMapping != null && followingMapping.containsKey(s))
        {
            followingMapping.remove(s);
            serialize();
        }
    }
}
