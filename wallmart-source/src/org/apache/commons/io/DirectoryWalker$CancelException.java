// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

// Referenced classes of package org.apache.commons.io:
//            DirectoryWalker

public static class depth extends IOException
{

    private static final long serialVersionUID = 0x12b2b63ef9f577f0L;
    private final int depth;
    private final File file;

    public int getDepth()
    {
        return depth;
    }

    public File getFile()
    {
        return file;
    }

    public (File file1, int i)
    {
        this("Operation Cancelled", file1, i);
    }

    public <init>(String s, File file1, int i)
    {
        super(s);
        file = file1;
        depth = i;
    }
}
