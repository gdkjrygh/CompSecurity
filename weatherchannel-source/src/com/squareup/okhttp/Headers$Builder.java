// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.squareup.okhttp:
//            Headers

public static final class 
{

    private final List namesAndValues = new ArrayList(20);

    private  addLenient(String s, String s1)
    {
        namesAndValues.add(s);
        namesAndValues.add(s1.trim());
        return this;
    }

    public namesAndValues add(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("name == null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("value == null");
        }
        if (s.length() == 0 || s.indexOf('\0') != -1 || s1.indexOf('\0') != -1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected header: ").append(s).append(": ").append(s1).toString());
        } else
        {
            return addLenient(s, s1);
        }
    }

    addLenient addLine(String s)
    {
        int i = s.indexOf(":", 1);
        if (i != -1)
        {
            return addLenient(s.substring(0, i), s.substring(i + 1));
        }
        if (s.startsWith(":"))
        {
            return addLenient("", s.substring(1));
        } else
        {
            return addLenient("", s);
        }
    }

    public Headers build()
    {
        return new Headers(this, null);
    }

    public String get(String s)
    {
        for (int i = namesAndValues.size() - 2; i >= 0; i -= 2)
        {
            if (s.equalsIgnoreCase((String)namesAndValues.get(i)))
            {
                return (String)namesAndValues.get(i + 1);
            }
        }

        return null;
    }

    public namesAndValues removeAll(String s)
    {
        int j;
        for (int i = 0; i < namesAndValues.size(); i = j + 2)
        {
            j = i;
            if (s.equalsIgnoreCase((String)namesAndValues.get(i)))
            {
                namesAndValues.remove(i);
                namesAndValues.remove(i);
                j = i - 2;
            }
        }

        return this;
    }

    public namesAndValues set(String s, String s1)
    {
        removeAll(s);
        add(s, s1);
        return this;
    }


    public ()
    {
    }
}
