// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class t
{

    static long a(File file)
    {
        file = new RandomAccessFile(file, "r");
        long l = a(((RandomAccessFile) (file)), a(((RandomAccessFile) (file))));
        file.close();
        return l;
        Exception exception;
        exception;
        file.close();
        throw exception;
    }

    private static long a(RandomAccessFile randomaccessfile, u u1)
    {
        CRC32 crc32 = new CRC32();
        long l = u1.b;
        randomaccessfile.seek(u1.a);
        int i = (int)Math.min(16384L, l);
        u1 = new byte[16384];
        i = randomaccessfile.read(u1, 0, i);
        do
        {
            if (i == -1)
            {
                break;
            }
            crc32.update(u1, 0, i);
            l -= i;
            if (l == 0L)
            {
                break;
            }
            i = randomaccessfile.read(u1, 0, (int)Math.min(16384L, l));
        } while (true);
        return crc32.getValue();
    }

    private static u a(RandomAccessFile randomaccessfile)
    {
        long l = 0L;
        long l1 = randomaccessfile.length() - 22L;
        if (l1 < 0L)
        {
            throw new ZipException((new StringBuilder("File too short to be a zip file: ")).append(randomaccessfile.length()).toString());
        }
        long l2 = l1 - 0x10000L;
        int i;
        if (l2 >= 0L)
        {
            l = l2;
        }
        i = Integer.reverseBytes(0x6054b50);
        do
        {
            randomaccessfile.seek(l1);
            if (randomaccessfile.readInt() != i)
            {
                l2 = l1 - 1L;
                l1 = l2;
                if (l2 < l)
                {
                    throw new ZipException("End Of Central Directory signature not found");
                }
            } else
            {
                randomaccessfile.skipBytes(2);
                randomaccessfile.skipBytes(2);
                randomaccessfile.skipBytes(2);
                randomaccessfile.skipBytes(2);
                u u1 = new u();
                u1.b = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                u1.a = (long)Integer.reverseBytes(randomaccessfile.readInt()) & 0xffffffffL;
                return u1;
            }
        } while (true);
    }
}
