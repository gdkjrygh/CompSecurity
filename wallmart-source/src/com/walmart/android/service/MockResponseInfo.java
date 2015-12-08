// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MockResponseInfo
{

    private String mFilePath;
    private String mMethodName;
    private String mMockResponseName;
    private HashMap mParameters;
    private String mServiceName;

    public MockResponseInfo(String s)
    {
        mParameters = new HashMap();
        String s1;
        int i;
        int j;
        int k;
        if (s.contains("/"))
        {
            String as[] = s.split("/");
            s1 = as[as.length - 1];
        } else
        {
            s1 = s;
        }
        mFilePath = s;
        i = s1.lastIndexOf(".");
        j = s1.indexOf("_");
        s = s1.substring(0, i);
        mServiceName = s.substring(0, j);
        k = s1.indexOf("_", j + 1);
        mMethodName = s.substring(j + 1, k);
        j = k + 1;
        if (s.contains("&"))
        {
            int l = s.indexOf("&");
            mMockResponseName = s.substring(j, l);
            extractParameters(s.substring(l + 1, i));
            return;
        } else
        {
            mMockResponseName = s.substring(j, i);
            return;
        }
    }

    private void extractParameters(String s)
    {
        s = s.split("&");
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String as[] = s[i].split("=");
            if (as.length == 2)
            {
                String s1 = as[0];
                String s2 = as[1];
                mParameters.put(s1, s2);
            }
        }

    }

    public String getFileName()
    {
        return mFilePath;
    }

    public String getMethodName()
    {
        return mMethodName;
    }

    public String getMockResponseName()
    {
        return mMockResponseName;
    }

    public HashMap getParameters()
    {
        return mParameters;
    }

    public String getServiceName()
    {
        return mServiceName;
    }

    public boolean hasParameters()
    {
        return !mParameters.isEmpty();
    }

    public boolean matchesParameters(HashMap hashmap)
    {
        boolean flag1 = true;
        Iterator iterator = mParameters.keySet().iterator();
        do
        {
            boolean flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (hashmap.containsKey(s))
            {
                if (((String)mParameters.get(s)).equals((String)hashmap.get(s)))
                {
                    continue;
                }
                flag = false;
                break;
            } else
            {
                return false;
            }
        } while (true);
        return flag;
    }
}
