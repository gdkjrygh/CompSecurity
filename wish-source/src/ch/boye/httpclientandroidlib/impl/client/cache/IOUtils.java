// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client.cache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

class IOUtils
{

    IOUtils()
    {
    }

    static void closeSilently(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    static void copy(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[2048];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                return;
            }
        } while (true);
    }

    static void copyAndClose(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        try
        {
            copy(inputstream, outputstream);
            inputstream.close();
            outputstream.close();
            return;
        }
        catch (IOException ioexception)
        {
            closeSilently(inputstream);
            closeSilently(outputstream);
            throw ioexception;
        }
    }

    static void copyFile(File file, File file1)
        throws IOException
    {
        file = new RandomAccessFile(file, "r");
        file1 = new RandomAccessFile(file1, "rw");
        FileChannel filechannel;
        FileChannel filechannel1;
        IOException ioexception1;
        try
        {
            filechannel = file.getChannel();
            filechannel1 = file1.getChannel();
        }
        catch (IOException ioexception)
        {
            closeSilently(file);
            closeSilently(file1);
            throw ioexception;
        }
        filechannel.transferTo(0L, file.length(), filechannel1);
        filechannel.close();
        filechannel1.close();
        file.close();
        file1.close();
        return;
        ioexception1;
        closeSilently(filechannel);
        closeSilently(filechannel1);
        throw ioexception1;
    }
}
