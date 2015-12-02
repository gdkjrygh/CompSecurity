// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public final class gkq
{

    public static final char a;
    public static final String b;

    private static int a(InputStream inputstream, OutputStream outputstream)
    {
        long l = b(inputstream, outputstream);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    private static int a(Reader reader, Writer writer)
    {
        long l = b(reader, writer);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    private static long a(InputStream inputstream, OutputStream outputstream, byte abyte0[])
    {
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (-1 != i)
            {
                outputstream.write(abyte0, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

    private static long a(Reader reader, Writer writer, char ac[])
    {
        long l = 0L;
        do
        {
            int i = reader.read(ac);
            if (-1 != i)
            {
                writer.write(ac, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

    private static String a(InputStream inputstream, Charset charset)
    {
        gks gks1 = new gks();
        a(inputstream, ((Writer) (gks1)), charset);
        return gks1.toString();
    }

    private static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void a(InputStream inputstream)
    {
        a(((Closeable) (inputstream)));
    }

    public static void a(InputStream inputstream, Writer writer)
    {
        a(inputstream, writer, Charset.defaultCharset());
    }

    private static void a(InputStream inputstream, Writer writer, Charset charset)
    {
        a(((Reader) (new InputStreamReader(inputstream, gkp.a(charset)))), writer);
    }

    public static void a(OutputStream outputstream)
    {
        a(((Closeable) (outputstream)));
    }

    public static void a(Writer writer)
    {
        a(((Closeable) (writer)));
    }

    private static long b(InputStream inputstream, OutputStream outputstream)
    {
        return a(inputstream, outputstream, new byte[4096]);
    }

    private static long b(Reader reader, Writer writer)
    {
        return a(reader, writer, new char[4096]);
    }

    public static byte[] b(InputStream inputstream)
    {
        gkr gkr1 = new gkr();
        a(inputstream, gkr1);
        return gkr1.a();
    }

    public static String c(InputStream inputstream)
    {
        return a(inputstream, Charset.defaultCharset());
    }

    static 
    {
        a = File.separatorChar;
        gks gks1 = new gks((byte)0);
        PrintWriter printwriter = new PrintWriter(gks1);
        printwriter.println();
        b = gks1.toString();
        printwriter.close();
    }
}
