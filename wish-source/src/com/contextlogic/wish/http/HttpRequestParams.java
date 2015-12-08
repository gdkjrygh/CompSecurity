// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.http;

import ch.boye.httpclientandroidlib.HttpEntity;
import ch.boye.httpclientandroidlib.client.entity.UrlEncodedFormEntity;
import ch.boye.httpclientandroidlib.client.utils.URLEncodedUtils;
import ch.boye.httpclientandroidlib.message.BasicNameValuePair;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HttpRequestParams
{

    private ConcurrentHashMap arrayRequestParams;
    private ConcurrentHashMap requestParams;

    public HttpRequestParams()
    {
        requestParams = new ConcurrentHashMap();
        arrayRequestParams = new ConcurrentHashMap();
    }

    public boolean hasValue(String s)
    {
        return s != null && (requestParams.contains(s) || arrayRequestParams.contains(s));
    }

    public void put(String s, String s1)
    {
        if (s != null && s1 != null)
        {
            requestParams.put(s, s1);
        }
    }

    public void putArray(String s, List list)
    {
        if (s != null && list != null)
        {
            arrayRequestParams.put(s, list);
        }
    }

    public void removeArray(String s)
    {
        arrayRequestParams.remove(s);
    }

    public HttpEntity toEntity()
    {
        Object obj = new LinkedList();
        java.util.Map.Entry entry;
        for (Iterator iterator = requestParams.entrySet().iterator(); iterator.hasNext(); ((List) (obj)).add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        for (Iterator iterator1 = arrayRequestParams.entrySet().iterator(); iterator1.hasNext();)
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
            Iterator iterator2 = ((List)entry1.getValue()).iterator();
            while (iterator2.hasNext()) 
            {
                String s = (String)iterator2.next();
                ((List) (obj)).add(new BasicNameValuePair((String)entry1.getKey(), s));
            }
        }

        try
        {
            obj = new UrlEncodedFormEntity(((List) (obj)), "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return null;
        }
        return ((HttpEntity) (obj));
    }

    public String toString()
    {
        LinkedList linkedlist = new LinkedList();
        java.util.Map.Entry entry;
        for (Iterator iterator = requestParams.entrySet().iterator(); iterator.hasNext(); linkedlist.add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        for (Iterator iterator1 = arrayRequestParams.entrySet().iterator(); iterator1.hasNext();)
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)iterator1.next();
            Iterator iterator2 = ((List)entry1.getValue()).iterator();
            while (iterator2.hasNext()) 
            {
                String s = (String)iterator2.next();
                linkedlist.add(new BasicNameValuePair((String)entry1.getKey(), s));
            }
        }

        return URLEncodedUtils.format(linkedlist, "UTF-8");
    }
}
