// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

// Referenced classes of package org.apache.commons.io:
//            FileDeleteStrategy, FileUtils

static class  extends FileDeleteStrategy
{

    protected boolean doDelete(File file)
        throws IOException
    {
        FileUtils.forceDelete(file);
        return true;
    }

    ()
    {
        super("Force");
    }
}
