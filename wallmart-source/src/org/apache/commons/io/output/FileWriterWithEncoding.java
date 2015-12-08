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
import java.nio.charset.CharsetEncoder;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class FileWriterWithEncoding extends Writer
{

    private final Writer out;

    public FileWriterWithEncoding(File file, String s)
        throws IOException
    {
        this(file, s, false);
    }

    public FileWriterWithEncoding(File file, String s, boolean flag)
        throws IOException
    {
        out = initWriter(file, s, flag);
    }

    public FileWriterWithEncoding(File file, Charset charset)
        throws IOException
    {
        this(file, charset, false);
    }

    public FileWriterWithEncoding(File file, Charset charset, boolean flag)
        throws IOException
    {
        out = initWriter(file, charset, flag);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetencoder)
        throws IOException
    {
        this(file, charsetencoder, false);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetencoder, boolean flag)
        throws IOException
    {
        out = initWriter(file, charsetencoder, flag);
    }

    public FileWriterWithEncoding(String s, String s1)
        throws IOException
    {
        this(new File(s), s1, false);
    }

    public FileWriterWithEncoding(String s, String s1, boolean flag)
        throws IOException
    {
        this(new File(s), s1, flag);
    }

    public FileWriterWithEncoding(String s, Charset charset)
        throws IOException
    {
        this(new File(s), charset, false);
    }

    public FileWriterWithEncoding(String s, Charset charset, boolean flag)
        throws IOException
    {
        this(new File(s), charset, flag);
    }

    public FileWriterWithEncoding(String s, CharsetEncoder charsetencoder)
        throws IOException
    {
        this(new File(s), charsetencoder, false);
    }

    public FileWriterWithEncoding(String s, CharsetEncoder charsetencoder, boolean flag)
        throws IOException
    {
        this(new File(s), charsetencoder, flag);
    }

    private static Writer initWriter(File file, Object obj, boolean flag)
        throws IOException
    {
        Object obj1;
        Object obj2;
        boolean flag1;
        if (file == null)
        {
            throw new NullPointerException("File is missing");
        }
        if (obj == null)
        {
            throw new NullPointerException("Encoding is missing");
        }
        flag1 = file.exists();
        obj2 = null;
        obj1 = null;
        FileOutputStream fileoutputstream = new FileOutputStream(file, flag);
        if (obj instanceof Charset)
        {
            return new OutputStreamWriter(fileoutputstream, (Charset)obj);
        }
        if (obj instanceof CharsetEncoder)
        {
            return new OutputStreamWriter(fileoutputstream, (CharsetEncoder)obj);
        }
        obj = new OutputStreamWriter(fileoutputstream, (String)obj);
        return ((Writer) (obj));
        obj;
        fileoutputstream = obj1;
_L4:
        IOUtils.closeQuietly(null);
        IOUtils.closeQuietly(fileoutputstream);
        if (!flag1)
        {
            FileUtils.deleteQuietly(file);
        }
        throw obj;
        obj;
        fileoutputstream = obj2;
_L2:
        IOUtils.closeQuietly(null);
        IOUtils.closeQuietly(fileoutputstream);
        if (!flag1)
        {
            FileUtils.deleteQuietly(file);
        }
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void close()
        throws IOException
    {
        out.close();
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
