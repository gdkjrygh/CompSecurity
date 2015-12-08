// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.cache;

import java.util.HashMap;
import java.util.UUID;

public class RuntimeStateStore
{

    private static RuntimeStateStore _instance = new RuntimeStateStore();
    private HashMap stateStore;

    private RuntimeStateStore()
    {
        stateStore = new HashMap();
    }

    public static RuntimeStateStore getInstance()
    {
        return _instance;
    }

    public void clearState(String s)
    {
        if (s != null)
        {
            stateStore.remove(s);
        }
    }

    public Object getState(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return stateStore.get(s);
        }
    }

    public String storeState(Object obj, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = String.valueOf(UUID.randomUUID());
        }
        if (obj != null)
        {
            stateStore.put(s1, obj);
        }
        return s1;
    }

}
