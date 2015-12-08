// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.urbanairship.actions:
//            ActionArguments, Situation

public static class metadata
{

    private Map metadata;
    private Situation situation;
    private Object value;

    public metadata addMetadata(String s, Object obj)
    {
        metadata.put(s, obj);
        return this;
    }

    public ActionArguments create()
    {
        return new ActionArguments(situation, value, metadata, null);
    }

    public metadata setSituation(Situation situation1)
    {
        situation = situation1;
        return this;
    }

    public situation setValue(Object obj)
    {
        value = obj;
        return this;
    }

    public ()
    {
        situation = Situation.MANUAL_INVOCATION;
        metadata = new HashMap();
    }
}
