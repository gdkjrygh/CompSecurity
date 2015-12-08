// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map.type;


public final class ClassKey
    implements Comparable
{

    private Class _class;
    private String _className;
    private int _hashCode;

    public ClassKey()
    {
        _class = null;
        _className = null;
        _hashCode = 0;
    }

    public ClassKey(Class class1)
    {
        _class = class1;
        _className = class1.getName();
        _hashCode = _className.hashCode();
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((ClassKey)obj);
    }

    public int compareTo(ClassKey classkey)
    {
        return _className.compareTo(classkey._className);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            if (((ClassKey)obj)._class != _class)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return _hashCode;
    }

    public void reset(Class class1)
    {
        _class = class1;
        _className = class1.getName();
        _hashCode = _className.hashCode();
    }

    public String toString()
    {
        return _className;
    }
}
