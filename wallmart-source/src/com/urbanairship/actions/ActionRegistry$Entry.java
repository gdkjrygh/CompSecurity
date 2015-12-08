// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import com.android.internal.util.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.urbanairship.actions:
//            ActionRegistry, Action, Situation

public static final class <init>
{

    private Action defaultAction;
    private List names;
    private Predicate predicate;
    private Map situationOverrides;

    private void addName(String s)
    {
        synchronized (names)
        {
            names.add(s);
        }
        return;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void removeName(String s)
    {
        synchronized (names)
        {
            names.remove(s);
        }
        return;
        s;
        list;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void addSituationOverride(Action action, Situation situation)
    {
        if (situation == null || action == null)
        {
            return;
        } else
        {
            situationOverrides.put(situation, action);
            return;
        }
    }

    public Action getActionForSituation(Situation situation)
    {
        if (situation == null)
        {
            situation = defaultAction;
        } else
        {
            Action action = (Action)situationOverrides.get(situation);
            situation = action;
            if (action == null)
            {
                return defaultAction;
            }
        }
        return situation;
    }

    public Action getDefaultAction()
    {
        return defaultAction;
    }

    public List getNames()
    {
        ArrayList arraylist;
        synchronized (names)
        {
            arraylist = new ArrayList(names);
        }
        return arraylist;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Predicate getPredicate()
    {
        return predicate;
    }

    public void setDefaultAction(Action action)
    {
        if (action == null)
        {
            return;
        } else
        {
            defaultAction = action;
            return;
        }
    }

    public void setPredicate(Predicate predicate1)
    {
        predicate = predicate1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Action Entry: ").append(names).toString();
    }


    private (Action action, String as[])
    {
        situationOverrides = new ConcurrentHashMap();
        defaultAction = action;
        names = new ArrayList(Arrays.asList(as));
    }

    names(Action action, String as[], names names1)
    {
        this(action, as);
    }
}
