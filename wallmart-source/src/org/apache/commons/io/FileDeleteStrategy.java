// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.File;
import java.io.IOException;

// Referenced classes of package org.apache.commons.io:
//            FileUtils

public class FileDeleteStrategy
{
    static class ForceFileDeleteStrategy extends FileDeleteStrategy
    {

        protected boolean doDelete(File file)
            throws IOException
        {
            FileUtils.forceDelete(file);
            return true;
        }

        ForceFileDeleteStrategy()
        {
            super("Force");
        }
    }


    public static final FileDeleteStrategy FORCE = new ForceFileDeleteStrategy();
    public static final FileDeleteStrategy NORMAL = new FileDeleteStrategy("Normal");
    private final String name;

    protected FileDeleteStrategy(String s)
    {
        name = s;
    }

    public void delete(File file)
        throws IOException
    {
        if (file.exists() && !doDelete(file))
        {
            throw new IOException((new StringBuilder()).append("Deletion failed: ").append(file).toString());
        } else
        {
            return;
        }
    }

    public boolean deleteQuietly(File file)
    {
        if (file == null || !file.exists())
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = doDelete(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        return flag;
    }

    protected boolean doDelete(File file)
        throws IOException
    {
        return file.delete();
    }

    public String toString()
    {
        return (new StringBuilder()).append("FileDeleteStrategy[").append(name).append("]").toString();
    }

}
