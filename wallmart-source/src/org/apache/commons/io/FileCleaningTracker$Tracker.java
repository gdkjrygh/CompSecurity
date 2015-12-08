// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

// Referenced classes of package org.apache.commons.io:
//            FileCleaningTracker, FileDeleteStrategy

private static final class deleteStrategy extends PhantomReference
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

    (String s, FileDeleteStrategy filedeletestrategy, Object obj, ReferenceQueue referencequeue)
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
