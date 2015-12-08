// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.kahuna.sdk:
//            IKahunaUserCredentials, KahunaUtils, KahunaCommon

public class KahunaUserCredentials
    implements IKahunaUserCredentials
{

    public static final String EMAIL_KEY = "email";
    public static final String FACEBOOK_KEY = "fbid";
    public static final String GOOGLE_PLUS_ID = "gplus_id";
    public static final String INSTALL_TOKEN_KEY = "install_token";
    public static final String LINKEDIN_KEY = "lnk";
    public static final String TWITTER_KEY = "twtr";
    public static final String USERNAME_KEY = "username";
    public static final String USER_ID_KEY = "user_id";
    private Map mCredentialsMap;

    protected KahunaUserCredentials()
    {
        mCredentialsMap = new HashMap();
    }

    protected KahunaUserCredentials(Map map)
    {
        mCredentialsMap = map;
    }

    public void add(String s, String s1)
    {
        if (KahunaUtils.isNullOrEmpty(s) || KahunaUtils.isNullOrEmpty(s1))
        {
            if (KahunaCommon.getDebugModeEnabled())
            {
                Log.w("Kahuna", (new StringBuilder()).append("Attempted to add invalid credentials to a UserCredentials Object. Key: ").append(KahunaUtils.safeObjectToString(s)).append(" Value:").append(KahunaUtils.safeObjectToString(s1)).toString());
            }
            return;
        }
        if (!mCredentialsMap.containsKey(s))
        {
            mCredentialsMap.put(s, new HashSet());
        }
        ((Set)mCredentialsMap.get(s)).add(s1);
    }

    public boolean areCredentialsEqual(KahunaUserCredentials kahunausercredentials)
    {
        boolean flag1 = true;
        if (kahunausercredentials != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        kahunausercredentials = kahunausercredentials.mCredentialsMap;
        Iterator iterator = mCredentialsMap.entrySet().iterator();
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Set set = (Set)entry.getValue();
            if (!kahunausercredentials.containsKey(entry.getKey()))
            {
                return false;
            }
            if (set.size() != ((Set)kahunausercredentials.get(entry.getKey())).size())
            {
                return false;
            }
            if (!set.containsAll((Collection)kahunausercredentials.get(entry.getKey())))
            {
                return false;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Map getCredentialsAsMap()
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = mCredentialsMap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj = (Set)entry.getValue();
            if (!KahunaUtils.isNullOrEmpty(((Set) (obj))))
            {
                obj = new HashSet(((Collection) (obj)));
                hashmap.put(entry.getKey(), obj);
            }
        } while (true);
        return hashmap;
    }

    public boolean isEmpty()
    {
        return mCredentialsMap.isEmpty();
    }
}
