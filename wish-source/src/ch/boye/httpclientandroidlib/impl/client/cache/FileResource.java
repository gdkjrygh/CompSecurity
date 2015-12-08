// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import ch.boye.httpclientandroidlib.client.cache.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileResource
    implements Resource
{

    private static final long serialVersionUID = 0x3958ae6717f23345L;
    private volatile boolean disposed;
    private final File file;

    public FileResource(File file1)
    {
        file = file1;
        disposed = false;
    }

    public void dispose()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = disposed;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        disposed = true;
        file.delete();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    File getFile()
    {
        this;
        JVM INSTR monitorenter ;
        File file1 = file;
        this;
        JVM INSTR monitorexit ;
        return file1;
        Exception exception;
        exception;
        throw exception;
    }

    public InputStream getInputStream()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        FileInputStream fileinputstream = new FileInputStream(file);
        this;
        JVM INSTR monitorexit ;
        return fileinputstream;
        Exception exception;
        exception;
        throw exception;
    }

    public long length()
    {
        this;
        JVM INSTR monitorenter ;
        long l = file.length();
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }
}
