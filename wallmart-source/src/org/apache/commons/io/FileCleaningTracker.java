// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package org.apache.commons.io:
//            FileDeleteStrategy

public class FileCleaningTracker
{
    private final class Reaper extends Thread
    {

        final FileCleaningTracker this$0;

        public void run()
        {
            while (!exitWhenFinished || trackers.size() > 0) 
            {
                try
                {
                    Tracker tracker = (Tracker)q.remove();
                    trackers.remove(tracker);
                    if (!tracker.delete())
                    {
                        deleteFailures.add(tracker.getPath());
                    }
                    tracker.clear();
                }
                catch (InterruptedException interruptedexception) { }
            }
        }

        Reaper()
        {
            this$0 = FileCleaningTracker.this;
            super("File Reaper");
            setPriority(10);
            setDaemon(true);
        }
    }

    private static final class Tracker extends PhantomReference
    {

        private final FileDeleteStrategy deleteStrategy;
        private final String path;

        public boolean delete()
        {
            return deleteStrategy.deleteQuietly(new File(path));
        }

        public String getPath()
        {
            return path;
        }

        Tracker(String s, FileDeleteStrategy filedeletestrategy, Object obj, ReferenceQueue referencequeue)
        {
            super(obj, referencequeue);
            path = s;
            s = filedeletestrategy;
            if (filedeletestrategy == null)
            {
                s = FileDeleteStrategy.NORMAL;
            }
            deleteStrategy = s;
        }
    }


    final List deleteFailures = Collections.synchronizedList(new ArrayList());
    volatile boolean exitWhenFinished;
    ReferenceQueue q;
    Thread reaper;
    final Collection trackers = Collections.synchronizedSet(new HashSet());

    public FileCleaningTracker()
    {
        q = new ReferenceQueue();
        exitWhenFinished = false;
    }

    private void addTracker(String s, Object obj, FileDeleteStrategy filedeletestrategy)
    {
        this;
        JVM INSTR monitorenter ;
        if (exitWhenFinished)
        {
            throw new IllegalStateException("No new trackers can be added once exitWhenFinished() is called");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (reaper == null)
        {
            reaper = new Reaper();
            reaper.start();
        }
        trackers.add(new Tracker(s, filedeletestrategy, obj, q));
        this;
        JVM INSTR monitorexit ;
    }

    public void exitWhenFinished()
    {
        this;
        JVM INSTR monitorenter ;
        exitWhenFinished = true;
        if (reaper != null)
        {
            synchronized (reaper)
            {
                reaper.interrupt();
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        thread;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public List getDeleteFailures()
    {
        return deleteFailures;
    }

    public int getTrackCount()
    {
        return trackers.size();
    }

    public void track(File file, Object obj)
    {
        track(file, obj, (FileDeleteStrategy)null);
    }

    public void track(File file, Object obj, FileDeleteStrategy filedeletestrategy)
    {
        if (file == null)
        {
            throw new NullPointerException("The file must not be null");
        } else
        {
            addTracker(file.getPath(), obj, filedeletestrategy);
            return;
        }
    }

    public void track(String s, Object obj)
    {
        track(s, obj, (FileDeleteStrategy)null);
    }

    public void track(String s, Object obj, FileDeleteStrategy filedeletestrategy)
    {
        if (s == null)
        {
            throw new NullPointerException("The path must not be null");
        } else
        {
            addTracker(s, obj, filedeletestrategy);
            return;
        }
    }
}
