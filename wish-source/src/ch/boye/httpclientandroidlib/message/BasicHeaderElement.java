// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.message;

import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.NameValuePair;
import ch.boye.httpclientandroidlib.util.LangUtils;

public class BasicHeaderElement
    implements HeaderElement, Cloneable
{

    private final String name;
    private final NameValuePair parameters[];
    private final String value;

    public BasicHeaderElement(String s, String s1)
    {
        this(s, s1, null);
    }

    public BasicHeaderElement(String s, String s1, NameValuePair anamevaluepair[])
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        name = s;
        value = s1;
        if (anamevaluepair != null)
        {
            parameters = anamevaluepair;
            return;
        } else
        {
            parameters = new NameValuePair[0];
            return;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof HeaderElement)
            {
                if (!name.equals(((BasicHeaderElement) (obj = (BasicHeaderElement)obj)).name) || !LangUtils.equals(value, ((BasicHeaderElement) (obj)).value) || !LangUtils.equals(parameters, ((BasicHeaderElement) (obj)).parameters))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public String getName()
    {
        return name;
    }

    public NameValuePair getParameter(int i)
    {
        return parameters[i];
    }

    public NameValuePair getParameterByName(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        Object obj = null;
        int i = 0;
        do
        {
label0:
            {
                NameValuePair namevaluepair = obj;
                if (i < parameters.length)
                {
                    namevaluepair = parameters[i];
                    if (!namevaluepair.getName().equalsIgnoreCase(s))
                    {
                        break label0;
                    }
                }
                return namevaluepair;
            }
            i++;
        } while (true);
    }

    public int getParameterCount()
    {
        return parameters.length;
    }

    public NameValuePair[] getParameters()
    {
        return (NameValuePair[])parameters.clone();
    }

    public String getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int j = LangUtils.hashCode(LangUtils.hashCode(17, name), value);
        for (int i = 0; i < parameters.length; i++)
        {
            j = LangUtils.hashCode(j, parameters[i]);
        }

        return j;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(name);
        if (value != null)
        {
            stringbuilder.append("=");
            stringbuilder.append(value);
        }
        for (int i = 0; i < parameters.length; i++)
        {
            stringbuilder.append("; ");
            stringbuilder.append(parameters[i]);
        }

        return stringbuilder.toString();
    }
}
