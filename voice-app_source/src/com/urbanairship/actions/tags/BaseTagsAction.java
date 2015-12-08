// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions.tags;

import com.urbanairship.actions.Action;
import com.urbanairship.actions.ActionArguments;
import com.urbanairship.push.PushManager;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class BaseTagsAction extends Action
{

    private final PushManager pushManager;

    public BaseTagsAction()
    {
        this(PushManager.shared());
    }

    BaseTagsAction(PushManager pushmanager)
    {
        pushManager = pushmanager;
    }

    public boolean acceptsArguments(ActionArguments actionarguments)
    {
        return getTags(actionarguments) != null;
    }

    protected PushManager getPushManager()
    {
        return pushManager;
    }

    protected Set getTags(ActionArguments actionarguments)
    {
        HashSet hashset;
        Object obj;
        hashset = null;
        obj = actionarguments.getValue();
        if (obj != null) goto _L2; else goto _L1
_L1:
        actionarguments = hashset;
_L4:
        return actionarguments;
_L2:
        if (obj instanceof String)
        {
            hashset = new HashSet();
            hashset.add(String.valueOf(actionarguments.getValue()));
            return hashset;
        }
        actionarguments = hashset;
        if (!(obj instanceof Collection))
        {
            continue;
        }
        hashset = new HashSet();
        obj = ((Collection)obj).iterator();
        do
        {
            actionarguments = hashset;
            if (!((Iterator) (obj)).hasNext())
            {
                continue;
            }
            hashset.add(String.valueOf(((Iterator) (obj)).next()));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
