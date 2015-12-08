// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.serialization;


public class SoapPrimitive
{

    String name;
    String namespace;
    String value;

    public SoapPrimitive(String s, String s1, String s2)
    {
        namespace = s;
        name = s1;
        value = s2;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof SoapPrimitive)
        {
            if (name.equals(((SoapPrimitive) (obj = (SoapPrimitive)obj)).name) && (namespace != null ? namespace.equals(((SoapPrimitive) (obj)).namespace) : ((SoapPrimitive) (obj)).namespace == null) && (value != null ? value.equals(((SoapPrimitive) (obj)).value) : ((SoapPrimitive) (obj)).value == null))
            {
                return true;
            }
        }
        return false;
    }

    public String getName()
    {
        return name;
    }

    public String getNamespace()
    {
        return namespace;
    }

    public int hashCode()
    {
        int j = name.hashCode();
        int i;
        if (namespace == null)
        {
            i = 0;
        } else
        {
            i = namespace.hashCode();
        }
        return i ^ j;
    }

    public String toString()
    {
        return value;
    }
}
