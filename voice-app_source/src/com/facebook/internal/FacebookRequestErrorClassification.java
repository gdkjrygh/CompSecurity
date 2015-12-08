// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FacebookRequestErrorClassification
{

    private static int $SWITCH_TABLE$com$facebook$FacebookRequestError$Category[];
    public static final int EC_APP_TOO_MANY_CALLS = 4;
    public static final int EC_INVALID_SESSION = 102;
    public static final int EC_INVALID_TOKEN = 190;
    public static final int EC_RATE = 9;
    public static final int EC_SERVICE_UNAVAILABLE = 2;
    public static final int EC_TOO_MANY_USER_ACTION_CALLS = 341;
    public static final int EC_USER_TOO_MANY_CALLS = 17;
    public static final String KEY_LOGIN_RECOVERABLE = "login_recoverable";
    public static final String KEY_NAME = "name";
    public static final String KEY_OTHER = "other";
    public static final String KEY_RECOVERY_MESSAGE = "recovery_message";
    public static final String KEY_TRANSIENT = "transient";
    private static FacebookRequestErrorClassification defaultInstance;
    private final Map loginRecoverableErrors;
    private final String loginRecoverableRecoveryMessage;
    private final Map otherErrors;
    private final String otherRecoveryMessage;
    private final Map transientErrors;
    private final String transientRecoveryMessage;

    static int[] $SWITCH_TABLE$com$facebook$FacebookRequestError$Category()
    {
        int ai[] = $SWITCH_TABLE$com$facebook$FacebookRequestError$Category;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[com.facebook.FacebookRequestError.Category.values().length];
        try
        {
            ai[com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[com.facebook.FacebookRequestError.Category.OTHER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[com.facebook.FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$facebook$FacebookRequestError$Category = ai;
        return ai;
    }

    FacebookRequestErrorClassification(Map map, Map map1, Map map2, String s, String s1, String s2)
    {
        otherErrors = map;
        transientErrors = map1;
        loginRecoverableErrors = map2;
        otherRecoveryMessage = s;
        transientRecoveryMessage = s1;
        loginRecoverableRecoveryMessage = s2;
    }

    public static FacebookRequestErrorClassification createFromJSON(JSONArray jsonarray)
    {
        String s;
        String s1;
        String s2;
        Map map;
        Map map1;
        Map map3;
        int i;
        if (jsonarray == null)
        {
            return null;
        }
        map3 = null;
        map1 = null;
        map = null;
        s2 = null;
        s1 = null;
        s = null;
        i = 0;
_L2:
        Map map2;
        Map map4;
        Map map5;
        String s3;
        String s4;
        String s5;
        JSONObject jsonobject;
        if (i >= jsonarray.length())
        {
            return new FacebookRequestErrorClassification(map3, map1, map, s2, s1, s);
        }
        jsonobject = jsonarray.optJSONObject(i);
        if (jsonobject != null)
        {
            break; /* Loop/switch isn't completed */
        }
        s5 = s;
        s4 = s1;
        s3 = s2;
        map5 = map;
        map4 = map1;
        map2 = map3;
_L3:
        i++;
        map3 = map2;
        map1 = map4;
        map = map5;
        s2 = s3;
        s1 = s4;
        s = s5;
        if (true) goto _L2; else goto _L1
_L1:
        String s6 = jsonobject.optString("name");
        map2 = map3;
        map4 = map1;
        map5 = map;
        s3 = s2;
        s4 = s1;
        s5 = s;
        if (s6 != null)
        {
            if (s6.equalsIgnoreCase("other"))
            {
                s3 = jsonobject.optString("recovery_message", null);
                map2 = parseJSONDefinition(jsonobject);
                map4 = map1;
                map5 = map;
                s4 = s1;
                s5 = s;
            } else
            if (s6.equalsIgnoreCase("transient"))
            {
                s4 = jsonobject.optString("recovery_message", null);
                map4 = parseJSONDefinition(jsonobject);
                map2 = map3;
                map5 = map;
                s3 = s2;
                s5 = s;
            } else
            {
                map2 = map3;
                map4 = map1;
                map5 = map;
                s3 = s2;
                s4 = s1;
                s5 = s;
                if (s6.equalsIgnoreCase("login_recoverable"))
                {
                    s5 = jsonobject.optString("recovery_message", null);
                    map5 = parseJSONDefinition(jsonobject);
                    map2 = map3;
                    map4 = map1;
                    s3 = s2;
                    s4 = s1;
                }
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static FacebookRequestErrorClassification getDefaultErrorClassification()
    {
        com/facebook/internal/FacebookRequestErrorClassification;
        JVM INSTR monitorenter ;
        FacebookRequestErrorClassification facebookrequesterrorclassification;
        if (defaultInstance == null)
        {
            defaultInstance = getDefaultErrorClassificationImpl();
        }
        facebookrequesterrorclassification = defaultInstance;
        com/facebook/internal/FacebookRequestErrorClassification;
        JVM INSTR monitorexit ;
        return facebookrequesterrorclassification;
        Exception exception;
        exception;
        throw exception;
    }

    private static FacebookRequestErrorClassification getDefaultErrorClassificationImpl()
    {
        return new FacebookRequestErrorClassification(null, new HashMap() {

            
            {
                put(Integer.valueOf(2), null);
                put(Integer.valueOf(4), null);
                put(Integer.valueOf(9), null);
                put(Integer.valueOf(17), null);
                put(Integer.valueOf(341), null);
            }
        }, new HashMap() {

            
            {
                put(Integer.valueOf(102), null);
                put(Integer.valueOf(190), null);
            }
        }, null, null, null);
    }

    private static Map parseJSONDefinition(JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("items");
        if (jsonarray.length() != 0) goto _L2; else goto _L1
_L1:
        jsonobject = null;
_L4:
        return jsonobject;
_L2:
        HashMap hashmap;
        int i;
        hashmap = new HashMap();
        i = 0;
_L7:
        jsonobject = hashmap;
        if (i >= jsonarray.length()) goto _L4; else goto _L3
_L3:
        jsonobject = jsonarray.optJSONObject(i);
        if (jsonobject != null) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L6:
        int k = jsonobject.optInt("code");
        if (k == 0) goto _L5; else goto _L8
_L8:
        Object obj;
        JSONArray jsonarray1;
        obj = null;
        jsonarray1 = jsonobject.optJSONArray("subcodes");
        jsonobject = obj;
        if (jsonarray1 == null) goto _L10; else goto _L9
_L9:
        jsonobject = obj;
        if (jsonarray1.length() <= 0) goto _L10; else goto _L11
_L11:
        int j;
        jsonobject = new HashSet();
        j = 0;
_L12:
        if (j < jsonarray1.length())
        {
            break MISSING_BLOCK_LABEL_137;
        }
_L10:
        hashmap.put(Integer.valueOf(k), jsonobject);
          goto _L5
        int l = jsonarray1.optInt(j);
        if (l != 0)
        {
            jsonobject.add(Integer.valueOf(l));
        }
        j++;
          goto _L12
    }

    public com.facebook.FacebookRequestError.Category classify(int i, int j, boolean flag)
    {
        if (flag)
        {
            return com.facebook.FacebookRequestError.Category.TRANSIENT;
        }
        if (otherErrors != null && otherErrors.containsKey(Integer.valueOf(i)))
        {
            Set set = (Set)otherErrors.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(j)))
            {
                return com.facebook.FacebookRequestError.Category.OTHER;
            }
        }
        if (loginRecoverableErrors != null && loginRecoverableErrors.containsKey(Integer.valueOf(i)))
        {
            Set set1 = (Set)loginRecoverableErrors.get(Integer.valueOf(i));
            if (set1 == null || set1.contains(Integer.valueOf(j)))
            {
                return com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE;
            }
        }
        if (transientErrors != null && transientErrors.containsKey(Integer.valueOf(i)))
        {
            Set set2 = (Set)transientErrors.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(j)))
            {
                return com.facebook.FacebookRequestError.Category.TRANSIENT;
            }
        }
        return com.facebook.FacebookRequestError.Category.OTHER;
    }

    public Map getLoginRecoverableErrors()
    {
        return loginRecoverableErrors;
    }

    public Map getOtherErrors()
    {
        return otherErrors;
    }

    public String getRecoveryMessage(com.facebook.FacebookRequestError.Category category)
    {
        switch ($SWITCH_TABLE$com$facebook$FacebookRequestError$Category()[category.ordinal()])
        {
        default:
            return null;

        case 2: // '\002'
            return otherRecoveryMessage;

        case 1: // '\001'
            return loginRecoverableRecoveryMessage;

        case 3: // '\003'
            return transientRecoveryMessage;
        }
    }

    public Map getTransientErrors()
    {
        return transientErrors;
    }
}
