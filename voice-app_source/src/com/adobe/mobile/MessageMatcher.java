// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, MessageMatcherUnknown, MessageMatcherExists, MessageMatcherEquals, 
//            MessageMatcherNotEquals, MessageMatcherGreaterThan, MessageMatcherGreaterThanOrEqual, MessageMatcherLessThan, 
//            MessageMatcherLessThanOrEqual, MessageMatcherContains, MessageMatcherNotContains, MessageMatcherStartsWith, 
//            MessageMatcherEndsWith, MessageMatcherNotExists

abstract class MessageMatcher
{

    private static final String MESSAGE_JSON_KEY = "key";
    private static final String MESSAGE_JSON_MATCHES = "matches";
    private static final String MESSAGE_JSON_VALUES = "values";
    private static final String MESSAGE_MATCHER_STRING_CONTAINS = "co";
    private static final String MESSAGE_MATCHER_STRING_ENDS_WITH = "ew";
    private static final String MESSAGE_MATCHER_STRING_EQUALS = "eq";
    private static final String MESSAGE_MATCHER_STRING_EXISTS = "ex";
    private static final String MESSAGE_MATCHER_STRING_GREATER_THAN = "gt";
    private static final String MESSAGE_MATCHER_STRING_GREATER_THAN_OR_EQUALS = "ge";
    private static final String MESSAGE_MATCHER_STRING_LESS_THAN = "lt";
    private static final String MESSAGE_MATCHER_STRING_LESS_THAN_OR_EQUALS = "le";
    private static final String MESSAGE_MATCHER_STRING_NOT_CONTAINS = "nc";
    private static final String MESSAGE_MATCHER_STRING_NOT_EQUALS = "ne";
    private static final String MESSAGE_MATCHER_STRING_NOT_EXISTS = "nx";
    private static final String MESSAGE_MATCHER_STRING_STARTS_WITH = "sw";
    private static final Map _messageMatcherDictionary = new HashMap() {

            
            {
                put("eq", com/adobe/mobile/MessageMatcherEquals);
                put("ne", com/adobe/mobile/MessageMatcherNotEquals);
                put("gt", com/adobe/mobile/MessageMatcherGreaterThan);
                put("ge", com/adobe/mobile/MessageMatcherGreaterThanOrEqual);
                put("lt", com/adobe/mobile/MessageMatcherLessThan);
                put("le", com/adobe/mobile/MessageMatcherLessThanOrEqual);
                put("co", com/adobe/mobile/MessageMatcherContains);
                put("nc", com/adobe/mobile/MessageMatcherNotContains);
                put("sw", com/adobe/mobile/MessageMatcherStartsWith);
                put("ew", com/adobe/mobile/MessageMatcherEndsWith);
                put("ex", com/adobe/mobile/MessageMatcherExists);
                put("nx", com/adobe/mobile/MessageMatcherNotExists);
            }
    };
    protected String key;
    protected ArrayList values;

    MessageMatcher()
    {
    }

    protected static MessageMatcher messageMatcherWithJsonObject(JSONObject jsonobject)
    {
        Object obj;
        Object obj2;
        obj2 = null;
        Object obj1;
        Class class1;
        boolean flag;
        try
        {
            obj1 = jsonobject.getString("matches");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = "UNKNOWN";
            StaticMethods.logWarningFormat("Messages - message matcher type is required", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = obj1;
        if (((String) (obj1)).length() > 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        StaticMethods.logWarningFormat("Messages - message matcher type is empty", new Object[0]);
        obj = obj1;
_L8:
        class1 = (Class)_messageMatcherDictionary.get(obj);
        obj1 = class1;
        if (class1 == null)
        {
            obj1 = com/adobe/mobile/MessageMatcherUnknown;
            StaticMethods.logWarningFormat("Messages - message matcher type \"%s\" is invalid", new Object[] {
                obj
            });
        }
        try
        {
            obj = (MessageMatcher)((Class) (obj1)).newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            StaticMethods.logErrorFormat("Messages - Error creating matcher (%s)", new Object[] {
                ((InstantiationException) (obj)).getMessage()
            });
            obj = obj2;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            StaticMethods.logErrorFormat("Messages - Error creating matcher (%s)", new Object[] {
                ((IllegalAccessException) (obj)).getMessage()
            });
            obj = obj2;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        try
        {
            obj.key = jsonobject.getString("key").toLowerCase();
            if (((MessageMatcher) (obj)).key != null && ((MessageMatcher) (obj)).key.length() <= 0)
            {
                StaticMethods.logWarningFormat("Messages - error creating matcher, key is empty", new Object[0]);
            }
        }
        catch (JSONException jsonexception)
        {
            StaticMethods.logWarningFormat("Messages - error creating matcher, key is required", new Object[0]);
        }
        catch (NullPointerException nullpointerexception)
        {
            StaticMethods.logWarningFormat("Messages - error creating matcher, key is required", new Object[0]);
        }
        obj.values = new ArrayList();
        flag = obj instanceof MessageMatcherExists;
        if (!flag) goto _L3; else goto _L2
_L2:
        return ((MessageMatcher) (obj));
_L3:
        int j;
        jsonobject = jsonobject.getJSONArray("values");
        j = jsonobject.length();
        int i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((MessageMatcher) (obj)).values.add(jsonobject.get(i));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if (((MessageMatcher) (obj)).values.size() != 0) goto _L2; else goto _L6
_L6:
        StaticMethods.logWarningFormat("Messages - error creating matcher, values is empty", new Object[0]);
        return ((MessageMatcher) (obj));
        jsonobject;
        StaticMethods.logWarningFormat("Messages - error creating matcher, values is required", new Object[0]);
        return ((MessageMatcher) (obj));
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected boolean matches(Object obj)
    {
        return false;
    }

    protected transient boolean matchesInMaps(Map amap[])
    {
        if (amap != null && amap.length > 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj1;
        int i;
        int j;
        obj1 = null;
        j = amap.length;
        i = 0;
_L4:
        Object obj;
        obj = obj1;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = amap[i];
          goto _L3
_L6:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (obj == null || !((Map) (obj)).containsKey(key)) goto _L6; else goto _L5
_L5:
        obj = ((Map) (obj)).get(key);
        if (obj == null || !matches(obj)) goto _L1; else goto _L7
_L7:
        return true;
    }

    protected Double tryParseDouble(Object obj)
    {
        try
        {
            obj = Double.valueOf(obj.toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return ((Double) (obj));
    }

}
