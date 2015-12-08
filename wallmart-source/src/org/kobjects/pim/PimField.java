// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.pim;

import java.util.Enumeration;
import java.util.Hashtable;

public class PimField
{

    String name;
    Hashtable properties;
    Object value;

    public PimField(String s)
    {
        name = s;
    }

    public PimField(PimField pimfield)
    {
        this(pimfield.name);
        if (pimfield.value instanceof String[])
        {
            String as[] = new String[((String[])(String[])pimfield.value).length];
            System.arraycopy((String[])(String[])pimfield.value, 0, as, 0, as.length);
            value = as;
        } else
        {
            value = pimfield.value;
        }
        if (pimfield.properties != null)
        {
            properties = new Hashtable();
            String s;
            for (Enumeration enumeration = pimfield.properties.keys(); enumeration.hasMoreElements(); properties.put(s, pimfield.properties.get(s)))
            {
                s = (String)enumeration.nextElement();
            }

        }
    }

    public boolean getAttribute(String s)
    {
        for (String s1 = getProperty("type"); s1 == null || s1.indexOf(s) == -1;)
        {
            return false;
        }

        return true;
    }

    public String getProperty(String s)
    {
        if (properties == null)
        {
            return null;
        } else
        {
            return (String)properties.get(s);
        }
    }

    public Object getValue()
    {
        return value;
    }

    public Enumeration propertyNames()
    {
        return properties.keys();
    }

    public void setAttribute(String s, boolean flag)
    {
        String s2;
        if (getAttribute(s) == flag)
        {
            return;
        }
        s2 = getProperty("type");
        if (!flag) goto _L2; else goto _L1
_L1:
        String s1;
        if (s2 == null || s2.length() == 0)
        {
            s1 = s;
        } else
        {
            s1 = (new StringBuilder()).append(s2).append(s).toString();
        }
_L4:
        setProperty("type", s1);
        return;
_L2:
        int j = s2.indexOf(s);
        int i = j;
        if (j > 0)
        {
            i = j - 1;
        }
        s1 = s2;
        if (i != -1)
        {
            s1 = (new StringBuilder()).append(s2.substring(0, i)).append(s2.substring(s.length() + i + 1)).toString();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setProperty(String s, String s1)
    {
        if (properties == null)
        {
            if (s1 == null)
            {
                return;
            }
            properties = new Hashtable();
        }
        if (s1 == null)
        {
            properties.remove(s);
            return;
        } else
        {
            properties.put(s, s1);
            return;
        }
    }

    public void setValue(Object obj)
    {
        value = obj;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(name);
        String s;
        if (properties != null)
        {
            s = (new StringBuilder()).append(";").append(properties).toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(":").append(value).toString();
    }
}
