// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;

import com.android.internal.util.Predicate;
import com.urbanairship.ApplicationMetrics;
import com.urbanairship.UAirship;

// Referenced classes of package com.urbanairship.actions:
//            ActionRegistry, Situation, ActionArguments

class this._cls0
    implements Predicate
{

    final ActionRegistry this$0;

    public boolean apply(ActionArguments actionarguments)
    {
label0:
        {
            if (Situation.PUSH_RECEIVED.equals(actionarguments.getSituation()))
            {
                long l = UAirship.shared().getApplicationMetrics().getLastOpenTimeMillis();
                if (System.currentTimeMillis() - l > 0x240c8400L)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    public volatile boolean apply(Object obj)
    {
        return apply((ActionArguments)obj);
    }

    ()
    {
        this$0 = ActionRegistry.this;
        super();
    }
}
