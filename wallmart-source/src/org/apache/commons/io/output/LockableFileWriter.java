// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class LockableFileWriter extends Writer
{

    private static final String LCK = ".lck";
    private final File lockFile;
    private final Writer out;

    public LockableFileWriter(File file)
        throws IOException
    {
        this(file, false, null);
    }

    public LockableFileWriter(File file, String s)
        throws IOException
    {
        this(file, s, false, null);
    }

    public LockableFileWriter(File file, String s, boolean flag, String s1)
        throws IOException
    {
        this(file, Charsets.toCharset(s), flag, s1);
    }

    public LockableFileWriter(File file, Charset charset)
        throws IOException
    {
        this(file, charset, false, null);
    }

    public LockableFileWriter(File file, Charset charset, boolean flag, String s)
        throws IOException
    {
        File file1 = file.getAbsoluteFile();
        if (file1.getParentFile() != null)
        {
            FileUtils.forceMkdir(file1.getParentFile());
        }
        if (file1.isDirectory())
        {
            throw new IOException("File specified is a directory");
        }
        file = s;
        if (s == null)
        {
            file = System.getProperty("java.io.tmpdir");
        }
        file = new File(file);
        FileUtils.forceMkdir(file);
        testLockDir(file);
        lockFile = new File(file, (new StringBuilder()).append(file1.getName()).append(".lck").toString());
        createLock();
        out = initWriter(file1, charset, flag);
    }

    public LockableFileWriter(File file, boolean flag)
        throws IOException
    {
        this(file, flag, null);
    }

    public LockableFileWriter(File file, boolean flag, String s)
        throws IOException
    {
        this(file, Charset.defaultCharset(), flag, s);
    }

    public LockableFileWriter(String s)
        throws IOException
    {
        this(s, false, null);
    }

    public LockableFileWriter(String s, boolean flag)
        throws IOException
    {
        this(s, flag, null);
    }

    public LockableFileWriter(String s, boolean flag, String s1)
        throws IOException
    {
        this(new File(s), flag, s1);
    }

    private void createLock()
        throws IOException
    {
        org/apache/commons/io/output/LockableFileWriter;
        JVM INSTR monitorenter ;
        if (!lockFile.createNewFile())
        {
            throw new IOException((new StringBuilder()).append("Can't write file, lock ").append(lockFile.getAbsolutePath()).append(" exists").toString());
        }
        break MISSING_BLOCK_LABEL_57;
        Exception exception;
        exception;
        org/apache/commons/io/output/LockableFileWriter;
        JVM INSTR monitorexit ;
        throw exception;
        lockFile.deleteOnExit();
        org/apache/commons/io/output/LockableFileWriter;
        JVM INSTR monitorexit ;
    }

    private Writer initWriter(File file, Charset charset, boolean flag)
        throws IOException
    {
        Object obj;
        Object obj1;
        boolean flag1;
        flag1 = file.exists();
        obj1 = null;
        obj = null;
        FileOutputStream fileoutputstream = new FileOutputStream(file.getAbsolutePath(), flag);
        charset = new OutputStreamWriter(fileoutputstream, Charsets.toCharset(charset));
        return charset;
        charset;
        fileoutputstream = obj;
_L4:
        IOUtils.closeQuietly(null);
        IOUtils.closeQuietly(fileoutputstream);
        FileUtils.deleteQuietly(lockFile);
        if (!flag1)
        {
            FileUtils.deleteQuietly(file);
        }
        throw charset;
        charset;
        fileoutputstream = obj1;
_L2:
        IOUtils.closeQuietly(null);
        IOUtils.closeQuietly(fileoutputstream);
        FileUtils.deleteQuietly(lockFile);
        if (!flag1)
        {
            FileUtils.deleteQuietly(file);
        }
        throw charset;
        charset;
        if (true) goto _L2; else goto _L1
_L1:
        charset;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void testLockDir(File file)
        throws IOException
    {
        if (!file.exists())
        {
            throw new IOException((new StringBuilder()).append("Could not find lockDir: ").append(file.getAbsolutePath()).toString());
        }
        if (!file.canWrite())
        {
            throw new IOException((new StringBuilder()).append("Could not write to lockDir: ").append(file.getAbsolutePath()).toString());
        } else
        {
            return;
        }
    }

    public void close()
        throws IOException
    {
        out.close();
        lockFile.delete();
        return;
        Exception exception;
        exception;
        lockFile.delete();
        throw exception;
    }

    public void flush()
        throws IOException
    {
        out.flush();
    }

    public void write(int i)
        throws IOException
    {
        out.write(i);
    }

    public void write(String s)
        throws IOException
    {
        out.write(s);
    }

    public void write(String s, int i, int j)
        throws IOException
    {
        out.write(s, i, j);
    }

    public void write(char ac[])
        throws IOException
    {
        out.write(ac);
    }

    public void write(char ac[], int i, int j)
        throws IOException
    {
        out.write(ac, i, j);
    }
}
