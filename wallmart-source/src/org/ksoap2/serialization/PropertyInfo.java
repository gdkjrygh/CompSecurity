// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.ksoap2.serialization;

import java.util.Vector;

public class PropertyInfo
{

    public static final Class BOOLEAN_CLASS = (new Boolean(true)).getClass();
    public static final Class INTEGER_CLASS = (new Integer(0)).getClass();
    public static final Class LONG_CLASS = (new Long(0L)).getClass();
    public static final int MULTI_REF = 2;
    public static final Class OBJECT_CLASS = (new Object()).getClass();
    public static final PropertyInfo OBJECT_TYPE = new PropertyInfo();
    public static final int REF_ONLY = 4;
    public static final Class STRING_CLASS = "".getClass();
    public static final int TRANSIENT = 1;
    public static final Class VECTOR_CLASS = (new Vector()).getClass();
    public PropertyInfo elementType;
    public int flags;
    public boolean multiRef;
    public String name;
    public String namespace;
    public Object type;
    protected Object value;

    public PropertyInfo()
    {
        type = OBJECT_CLASS;
    }

    public void clear()
    {
        type = OBJECT_CLASS;
        flags = 0;
        name = null;
        namespace = null;
    }

    public PropertyInfo getElementType()
    {
        return elementType;
    }

    public int getFlags()
    {
        return flags;
    }

    public String getName()
    {
        return name;
    }

    public String getNamespace()
    {
        return namespace;
    }

    public Object getType()
    {
        return type;
    }

    public Object getValue()
    {
        return value;
    }

    public boolean isMultiRef()
    {
        return multiRef;
    }

    public void setElementType(PropertyInfo propertyinfo)
    {
        elementType = propertyinfo;
    }

    public void setFlags(int i)
    {
        flags = i;
    }

    public void setMultiRef(boolean flag)
    {
        multiRef = flag;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNamespace(String s)
    {
        namespace = s;
    }

    public void setType(Object obj)
    {
        type = obj;
    }

    public void setValue(Object obj)
    {
        value = obj;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(name);
        stringbuffer.append(" : ");
        if (value != null)
        {
            stringbuffer.append(value);
        } else
        {
            stringbuffer.append("(not set)");
        }
        return stringbuffer.toString();
    }

}
