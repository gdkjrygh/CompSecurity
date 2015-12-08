// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GraphUtil
{

    private static final String dateFormats[] = {
        "yyyy-MM-dd'T'HH:mm:ssZ", "yyyy-MM-dd'T'HH:mm:ss", "yyyy-MM-dd"
    };

    public GraphUtil()
    {
    }

    public static JSONObject createOpenGraphActionForPost(String s)
    {
        JSONObject jsonobject = new JSONObject();
        if (s != null)
        {
            try
            {
                jsonobject.put("type", s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new FacebookException("An error occurred while setting up the open graph action", s);
            }
        }
        return jsonobject;
    }

    public static JSONObject createOpenGraphObjectForPost(String s)
    {
        return createOpenGraphObjectForPost(s, null, null, null, null, null, null);
    }

    public static JSONObject createOpenGraphObjectForPost(String s, String s1, String s2, String s3, String s4, JSONObject jsonobject, String s5)
    {
        JSONObject jsonobject1;
        jsonobject1 = new JSONObject();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        jsonobject1.put("type", s);
        jsonobject1.put("title", s1);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        s = new JSONObject();
        s.put("url", s2);
        s1 = new JSONArray();
        s1.put(s);
        jsonobject1.put("image", s1);
        jsonobject1.put("url", s3);
        jsonobject1.put("description", s4);
        jsonobject1.put("fbsdk:create_object", true);
        if (jsonobject != null)
        {
            try
            {
                jsonobject1.put("data", jsonobject);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new FacebookException("An error occurred while setting up the graph object", s);
            }
        }
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        jsonobject1.put("id", s5);
        return jsonobject1;
    }

    public static boolean isOpenGraphObjectForPost(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            return jsonobject.optBoolean("fbsdk:create_object");
        } else
        {
            return false;
        }
    }

}
