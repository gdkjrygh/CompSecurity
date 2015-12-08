// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.cache:
//            RemovalCause

public final class RemovalNotification
    implements java.util.Map.Entry
{

    private static final long serialVersionUID = 0L;
    private final RemovalCause cause;
    private final Object key;
    private final Object value;

    RemovalNotification(Object obj, Object obj1, RemovalCause removalcause)
    {
        key = obj;
        value = obj1;
        cause = (RemovalCause)Preconditions.checkNotNull(removalcause);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (Objects.equal(getKey(), ((java.util.Map.Entry) (obj)).getKey()))
            {
                flag = flag1;
                if (Objects.equal(getValue(), ((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public RemovalCause getCause()
    {
        return cause;
    }

    public Object getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int j = 0;
        Object obj = getKey();
        Object obj1 = getValue();
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        if (obj1 != null)
        {
            j = obj1.hashCode();
        }
        return j ^ i;
    }

    public final Object setValue(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(getKey()));
        String s1 = String.valueOf(String.valueOf(getValue()));
        return (new StringBuilder(s.length() + 1 + s1.length())).append(s).append("=").append(s1).toString();
    }

    public boolean wasEvicted()
    {
        return cause.wasEvicted();
    }
}
