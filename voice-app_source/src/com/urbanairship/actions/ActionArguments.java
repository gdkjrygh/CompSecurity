// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;


// Referenced classes of package com.urbanairship.actions:
//            Situation

public class ActionArguments
{

    private final Situation situation;
    private Object value;

    public ActionArguments(Situation situation1, Object obj)
    {
        value = obj;
        situation = situation1;
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
        return (new StringBuilder()).append("ActionArguments situation: ").append(situation).append(" value: ").append(value).toString();
    }
}
