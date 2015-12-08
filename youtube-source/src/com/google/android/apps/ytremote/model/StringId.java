// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import com.google.android.apps.ytremote.util.c;
import java.io.Serializable;

public abstract class StringId
    implements Serializable
{

    private final String id;

    public StringId(String s)
    {
        c.a(s);
        id = s;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof StringId))
        {
            return false;
        } else
        {
            obj = (StringId)obj;
            return id.equals(((StringId) (obj)).id);
        }
    }

    public int hashCode()
    {
        return id.hashCode();
    }

    public String toString()
    {
        return id;
    }
}
