// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.urbanairship.actions:
//            Situation

public class ActionArguments
{
    public static class Builder
    {

        private Map metadata;
        private Situation situation;
        private Object value;

        public Builder addMetadata(String s, Object obj)
        {
            metadata.put(s, obj);
            return this;
        }

        public ActionArguments create()
        {
            return new ActionArguments(situation, value, metadata, null);
        }

        public Builder setSituation(Situation situation1)
        {
            situation = situation1;
            return this;
        }

        public Builder setValue(Object obj)
        {
            value = obj;
            return this;
        }

        public Builder()
        {
            situation = Situation.MANUAL_INVOCATION;
            metadata = new HashMap();
        }
    }


    public static final String PUSH_MESSAGE_METADATA = "com.urbanairship.PUSH_MESSAGE";
    public static final String RICH_PUSH_METADATA = "com.urbanairship.RICH_PUSH_METADATA";
    private Map metadata;
    private final Situation situation;
    private Object value;

    public ActionArguments(Situation situation1, Object obj)
    {
        this(situation1, obj, null);
    }

    private ActionArguments(Situation situation1, Object obj, Map map)
    {
        value = obj;
        situation = situation1;
        if (map != null)
        {
            metadata = new HashMap(map);
        }
    }

    ActionArguments(Situation situation1, Object obj, Map map, _cls1 _pcls1)
    {
        this(situation1, obj, map);
    }

    public Object getMetadata(String s)
    {
        Object obj = null;
        if (metadata != null)
        {
            obj = metadata.get(s);
        }
        s = ((String) (obj));
        if (obj == null)
        {
            s = null;
        }
        return s;
    }

    public Situation getSituation()
    {
        return situation;
    }

    public Object getValue()
    {
        return value;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ActionArguments { situation: ").append(situation).append(", value: ").append(value).append(", metadata: {");
        if (metadata != null)
        {
            String s;
            for (Iterator iterator = metadata.keySet().iterator(); iterator.hasNext(); stringbuilder.append(" ").append(s).append(": ").append(metadata.get(s)))
            {
                s = (String)iterator.next();
            }

        }
        stringbuilder.append(" } }");
        return stringbuilder.toString();
    }
}
