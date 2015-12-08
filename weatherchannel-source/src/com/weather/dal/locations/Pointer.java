// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal.locations;

import java.io.Serializable;

// Referenced classes of package com.weather.dal.locations:
//            PointerId

class Pointer
    implements Serializable
{

    private static final long serialVersionUID = 0x2e28c20a583b4c19L;
    private final PointerId id;
    private int value;

    public Pointer(Pointer pointer)
    {
        value = pointer.value;
        id = pointer.id;
    }

    Pointer(PointerId pointerid)
    {
        value = -1;
        id = pointerid;
    }

    Pointer(PointerId pointerid, int i)
    {
        value = i;
        id = pointerid;
    }

    void clear()
    {
        set(-1);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Pointer)obj;
            if (id != ((Pointer) (obj)).id)
            {
                return false;
            }
            if (value != ((Pointer) (obj)).value)
            {
                return false;
            }
        }
        return true;
    }

    int get()
    {
        return value;
    }

    public PointerId getId()
    {
        return id;
    }

    public int hashCode()
    {
        int i;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        return (i + 31) * 31 + value;
    }

    boolean isEmpty()
    {
        return value == -1;
    }

    boolean isFollowMe()
    {
        return value == -2;
    }

    void set(int i)
    {
        value = i;
    }

    void setToFollowMe()
    {
        value = -2;
    }

    public String toString()
    {
        return (new StringBuilder()).append("id:").append(id).append(", value:").append(value).toString();
    }
}
