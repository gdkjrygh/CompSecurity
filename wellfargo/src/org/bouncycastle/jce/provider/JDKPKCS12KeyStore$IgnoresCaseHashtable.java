// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.util.Strings;

class <init>
{

    private Hashtable keys;
    private Hashtable orig;

    public Enumeration elements()
    {
        return orig.elements();
    }

    public Object get(String s)
    {
        Hashtable hashtable = keys;
        if (s == null)
        {
            s = null;
        } else
        {
            s = Strings.toLowerCase(s);
        }
        s = (String)hashtable.get(s);
        if (s == null)
        {
            return null;
        } else
        {
            return orig.get(s);
        }
    }

    public Enumeration keys()
    {
        return orig.keys();
    }

    public void put(String s, Object obj)
    {
        String s1;
        String s2;
        if (s == null)
        {
            s1 = null;
        } else
        {
            s1 = Strings.toLowerCase(s);
        }
        s2 = (String)keys.get(s1);
        if (s2 != null)
        {
            orig.remove(s2);
        }
        keys.put(s1, s);
        orig.put(s, obj);
    }

    public Object remove(String s)
    {
        Hashtable hashtable = keys;
        if (s == null)
        {
            s = null;
        } else
        {
            s = Strings.toLowerCase(s);
        }
        s = (String)hashtable.remove(s);
        if (s == null)
        {
            return null;
        } else
        {
            return orig.remove(s);
        }
    }

    private ()
    {
        orig = new Hashtable();
        keys = new Hashtable();
    }

    keys(keys keys1)
    {
        this();
    }
}
