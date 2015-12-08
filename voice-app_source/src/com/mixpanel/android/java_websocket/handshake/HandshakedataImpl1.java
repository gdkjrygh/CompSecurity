// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.handshake;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.mixpanel.android.java_websocket.handshake:
//            HandshakeBuilder

public class HandshakedataImpl1
    implements HandshakeBuilder
{

    private byte content[];
    private TreeMap map;

    public HandshakedataImpl1()
    {
        map = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }

    public byte[] getContent()
    {
        return content;
    }

    public String getFieldValue(String s)
    {
        String s1 = (String)map.get(s);
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return s;
    }

    public boolean hasFieldValue(String s)
    {
        return map.containsKey(s);
    }

    public Iterator iterateHttpFields()
    {
        return Collections.unmodifiableSet(map.keySet()).iterator();
    }

    public void put(String s, String s1)
    {
        map.put(s, s1);
    }

    public void setContent(byte abyte0[])
    {
        content = abyte0;
    }
}
