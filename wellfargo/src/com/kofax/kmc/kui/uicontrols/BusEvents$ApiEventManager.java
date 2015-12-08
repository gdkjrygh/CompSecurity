// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.squareup.otto.Bus;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class 
{

    private static final List a = new CopyOnWriteArrayList();

    public static void registerWrapper(Bus bus,  )
    {
        if (!a.contains())
        {
            a.add();
            bus.register();
        }
    }

    public static void unregisterWrapper(Bus bus, Object obj, Class class1)
    {
        Iterator iterator = a.iterator();
_L2:
        a a1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = (a)iterator.next();
        if (!a1.tListenerType().equals(class1) || !a1.tListener().equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        bus.unregister(a1);
        a.remove(a1);
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        return;
        bus;
    }


    public ()
    {
    }
}
