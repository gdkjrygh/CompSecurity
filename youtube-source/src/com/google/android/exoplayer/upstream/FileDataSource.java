// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            i, j

public final class FileDataSource
    implements i
{

    private RandomAccessFile a;
    private long b;

    public FileDataSource()
    {
    }

    public final int a(byte abyte0[], int k, int l)
    {
        if (b == 0L)
        {
            return -1;
        }
        try
        {
            k = a.read(abyte0, k, (int)Math.min(b, l));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new FileDataSourceException(abyte0);
        }
        b = b - (long)k;
        return k;
    }

    public final long a(j j1)
    {
        try
        {
            a = new RandomAccessFile(j1.a.getPath(), "r");
            a.seek(j1.d);
            long l;
            if (j1.e == -1L)
            {
                l = a.length() - j1.d;
            } else
            {
                l = j1.e;
            }
            b = l;
            return b;
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new FileDataSourceException(j1);
        }
    }

    public final void a()
    {
        if (a != null)
        {
            try
            {
                a.close();
            }
            catch (IOException ioexception)
            {
                throw new FileDataSourceException(ioexception);
            }
            a = null;
        }
    }

    private class FileDataSourceException extends IOException
    {

        public FileDataSourceException(IOException ioexception)
        {
            super(ioexception);
        }
    }

}
