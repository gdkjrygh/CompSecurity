// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

// Referenced classes of package org.apache.commons.io.output:
//            ThresholdingOutputStream, ByteArrayOutputStream

public class DeferredFileOutputStream extends ThresholdingOutputStream
{

    private boolean closed;
    private OutputStream currentOutputStream;
    private final File directory;
    private ByteArrayOutputStream memoryOutputStream;
    private File outputFile;
    private final String prefix;
    private final String suffix;

    public DeferredFileOutputStream(int i, File file)
    {
        this(i, file, null, null, null);
    }

    private DeferredFileOutputStream(int i, File file, String s, String s1, File file1)
    {
        super(i);
        closed = false;
        outputFile = file;
        memoryOutputStream = new ByteArrayOutputStream();
        currentOutputStream = memoryOutputStream;
        prefix = s;
        suffix = s1;
        directory = file1;
    }

    public DeferredFileOutputStream(int i, String s, String s1, File file)
    {
        this(i, null, s, s1, file);
        if (s == null)
        {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        } else
        {
            return;
        }
    }

    public void close()
        throws IOException
    {
        super.close();
        closed = true;
    }

    public byte[] getData()
    {
        if (memoryOutputStream != null)
        {
            return memoryOutputStream.toByteArray();
        } else
        {
            return null;
        }
    }

    public File getFile()
    {
        return outputFile;
    }

    protected OutputStream getStream()
        throws IOException
    {
        return currentOutputStream;
    }

    public boolean isInMemory()
    {
        return !isThresholdExceeded();
    }

    protected void thresholdReached()
        throws IOException
    {
        if (prefix != null)
        {
            outputFile = File.createTempFile(prefix, suffix, directory);
        }
        FileOutputStream fileoutputstream = new FileOutputStream(outputFile);
        memoryOutputStream.writeTo(fileoutputstream);
        currentOutputStream = fileoutputstream;
        memoryOutputStream = null;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        FileInputStream fileinputstream;
        if (!closed)
        {
            throw new IOException("Stream not closed");
        }
        if (isInMemory())
        {
            memoryOutputStream.writeTo(outputstream);
            return;
        }
        fileinputstream = new FileInputStream(outputFile);
        IOUtils.copy(fileinputstream, outputstream);
        IOUtils.closeQuietly(fileinputstream);
        return;
        outputstream;
        IOUtils.closeQuietly(fileinputstream);
        throw outputstream;
    }
}
