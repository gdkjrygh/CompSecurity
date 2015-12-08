// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.File;

// Referenced classes of package org.apache.commons.io:
//            FileCleaningTracker, FileDeleteStrategy

public class FileCleaner
{

    static final FileCleaningTracker theInstance = new FileCleaningTracker();

    public FileCleaner()
    {
    }

    public static void exitWhenFinished()
    {
        org/apache/commons/io/FileCleaner;
        JVM INSTR monitorenter ;
        theInstance.exitWhenFinished();
        org/apache/commons/io/FileCleaner;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static FileCleaningTracker getInstance()
    {
        return theInstance;
    }

    public static int getTrackCount()
    {
        return theInstance.getTrackCount();
    }

    public static void track(File file, Object obj)
    {
        theInstance.track(file, obj);
    }

    public static void track(File file, Object obj, FileDeleteStrategy filedeletestrategy)
    {
        theInstance.track(file, obj, filedeletestrategy);
    }

    public static void track(String s, Object obj)
    {
        theInstance.track(s, obj);
    }

    public static void track(String s, Object obj, FileDeleteStrategy filedeletestrategy)
    {
        theInstance.track(s, obj, filedeletestrategy);
    }

}
