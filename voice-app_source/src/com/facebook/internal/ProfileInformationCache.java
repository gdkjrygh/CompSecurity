// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

class ProfileInformationCache
{

    private static final ConcurrentHashMap infoCache = new ConcurrentHashMap();

    ProfileInformationCache()
    {
    }

    public static JSONObject getProfileInformation(String s)
    {
        return (JSONObject)infoCache.get(s);
    }

    public static void putProfileInformation(String s, JSONObject jsonobject)
    {
        infoCache.put(s, jsonobject);
    }

}
