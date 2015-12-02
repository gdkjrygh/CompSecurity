// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashMap;
import java.util.Map;

public final class gkh
{

    private final Map a = new LinkedHashMap();

    public gkh()
    {
    }

    public final gkg a()
    {
        return new gkg(a, (byte)0);
    }

    public final gkh a(Object obj, Object obj1)
    {
        if (a.containsKey(obj))
        {
            throw new IllegalArgumentException("duplicate key");
        } else
        {
            a.put(obj, obj1);
            return this;
        }
    }
}
