// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.a.c;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

public final class a
{

    public static String a(Map map)
    {
        if (map == null || map.isEmpty())
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            try
            {
                stringbuffer.append((new StringBuilder()).append((String)entry.getKey()).append('=').append(URLEncoder.encode((String)entry.getValue(), "UTF-8")).append('&').toString());
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw new IllegalStateException("UTF-8 should be supported by the server");
            }
        }

        return stringbuffer.substring(0, Math.max(0, stringbuffer.length() - 1));
    }

    public static void a(HttpResponse httpresponse)
    {
        if (httpresponse == null || httpresponse.getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        httpresponse.getEntity().consumeContent();
        return;
        httpresponse;
    }

    public static String b(Map map)
    {
        StringBuffer stringbuffer = new StringBuffer();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); stringbuffer.append((new StringBuilder()).append((String)entry.getKey()).append(": ").append((String)entry.getValue()).append("\r\n").toString()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return stringbuffer.toString();
    }
}
