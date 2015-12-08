// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.b;

import a.a.a.a.a.a;
import java.io.Serializable;

// Referenced classes of package a.a.a.a.b:
//            a

public abstract class b
    implements Serializable, Comparable, java.util.Map.Entry
{

    public b()
    {
    }

    public static b a(Object obj, Object obj1)
    {
        return new a.a.a.a.b.a(obj, obj1);
    }

    public int a(b b1)
    {
        return (new a()).a(a(), b1.a()).a(b(), b1.b()).a();
    }

    public abstract Object a();

    public abstract Object b();

    public int compareTo(Object obj)
    {
        return a((b)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                if (!a.a.a.a.b.a(getKey(), ((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getKey()) || !a.a.a.a.b.a(getValue(), ((java.util.Map.Entry) (obj)).getValue()))
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

    public final Object getKey()
    {
        return a();
    }

    public Object getValue()
    {
        return b();
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (getKey() == null)
        {
            i = 0;
        } else
        {
            i = getKey().hashCode();
        }
        if (getValue() != null)
        {
            j = getValue().hashCode();
        }
        return i ^ j;
    }

    public String toString()
    {
        return (new StringBuilder()).append('(').append(a()).append(',').append(b()).append(')').toString();
    }
}
