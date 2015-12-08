// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.Okio;
import okio.Sink;
import okio.Source;

// Referenced classes of package com.squareup.okhttp.internal.io:
//            FileSystem

static final class 
    implements FileSystem
{

    public Sink appendingSink(File file)
        throws FileNotFoundException
    {
        Sink sink1;
        try
        {
            sink1 = Okio.appendingSink(file);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            file.getParentFile().mkdirs();
            return Okio.appendingSink(file);
        }
        return sink1;
    }

    public void delete(File file)
        throws IOException
    {
        if (!file.delete() && file.exists())
        {
            throw new IOException((new StringBuilder()).append("failed to delete ").append(file).toString());
        } else
        {
            return;
        }
    }

    public void deleteContents(File file)
        throws IOException
    {
        File afile[] = file.listFiles();
        if (afile == null)
        {
            throw new IOException((new StringBuilder()).append("not a readable directory: ").append(file).toString());
        }
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            file = afile[i];
            if (file.isDirectory())
            {
                deleteContents(file);
            }
            if (!file.delete())
            {
                throw new IOException((new StringBuilder()).append("failed to delete ").append(file).toString());
            }
        }

    }

    public boolean exists(File file)
        throws IOException
    {
        return file.exists();
    }

    public void rename(File file, File file1)
        throws IOException
    {
        delete(file1);
        if (!file.renameTo(file1))
        {
            throw new IOException((new StringBuilder()).append("failed to rename ").append(file).append(" to ").append(file1).toString());
        } else
        {
            return;
        }
    }

    public Sink sink(File file)
        throws FileNotFoundException
    {
        Sink sink1;
        try
        {
            sink1 = Okio.sink(file);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            file.getParentFile().mkdirs();
            return Okio.sink(file);
        }
        return sink1;
    }

    public long size(File file)
    {
        return file.length();
    }

    public Source source(File file)
        throws FileNotFoundException
    {
        return Okio.source(file);
    }

    ()
    {
    }
}
