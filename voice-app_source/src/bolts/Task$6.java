// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package bolts:
//            Continuation, Task

static final class ect
    implements Continuation
{

    final Collection val$tasks;

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    public List then(Task task)
        throws Exception
    {
        if (val$tasks.size() != 0) goto _L2; else goto _L1
_L1:
        task = Collections.emptyList();
_L4:
        return task;
_L2:
        ArrayList arraylist = new ArrayList();
        Iterator iterator = val$tasks.iterator();
        do
        {
            task = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            arraylist.add(((Task)iterator.next()).getResult());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    lection(Collection collection)
    {
        val$tasks = collection;
        super();
    }
}
