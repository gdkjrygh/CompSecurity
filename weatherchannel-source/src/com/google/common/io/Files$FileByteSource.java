// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

// Referenced classes of package com.google.common.io:
//            ByteSource, Files, Closer

private static final class <init> extends ByteSource
{

    private final File file;

    public FileInputStream openStream()
        throws IOException
    {
        return new FileInputStream(file);
    }

    public volatile InputStream openStream()
        throws IOException
    {
        return openStream();
    }

    public byte[] read()
        throws IOException
    {
        Closer closer = Closer.create();
        byte abyte0[];
        FileInputStream fileinputstream = (FileInputStream)closer.register(openStream());
        abyte0 = Files.readFile(fileinputstream, fileinputstream.getChannel().size());
        closer.close();
        return abyte0;
        Object obj;
        obj;
        throw closer.rethrow(((Throwable) (obj)));
        obj;
        closer.close();
        throw obj;
    }

    public long size()
        throws IOException
    {
        if (!file.isFile())
        {
            throw new FileNotFoundException(file.toString());
        } else
        {
            return file.length();
        }
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(file));
        return (new StringBuilder(s.length() + 20)).append("Files.asByteSource(").append(s).append(")").toString();
    }

    private (File file1)
    {
        file = (File)Preconditions.checkNotNull(file1);
    }

    NotNull(File file1, NotNull notnull)
    {
        this(file1);
    }
}
