// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.List;

// Referenced classes of package org.apache.commons.io:
//            FileCleaningTracker

private final class setDaemon extends Thread
{

    final FileCleaningTracker this$0;

    public void run()
    {
        while (!exitWhenFinished || trackers.size() > 0) 
        {
            try
            {
                  = ()q.remove();
                trackers.remove();
                if (!.delete())
                {
                    deleteFailures.add(.getPath());
                }
                .clear();
            }
            catch (InterruptedException interruptedexception) { }
        }
    }

    ()
    {
        this$0 = FileCleaningTracker.this;
        super("File Reaper");
        setPriority(10);
        setDaemon(true);
    }
}
