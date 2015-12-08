// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.Arrays;
import org.apache.commons.io.IOUtils;

// Referenced classes of package org.apache.commons.io.filefilter:
//            AbstractFileFilter

public class MagicNumberFileFilter extends AbstractFileFilter
    implements Serializable
{

    private static final long serialVersionUID = 0xf8660f93da39d554L;
    private final long byteOffset;
    private final byte magicNumbers[];

    public MagicNumberFileFilter(String s)
    {
        this(s, 0L);
    }

    public MagicNumberFileFilter(String s, long l)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (s.length() == 0)
        {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("The offset cannot be negative");
        } else
        {
            magicNumbers = s.getBytes();
            byteOffset = l;
            return;
        }
    }

    public MagicNumberFileFilter(byte abyte0[])
    {
        this(abyte0, 0L);
    }

    public MagicNumberFileFilter(byte abyte0[], long l)
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (abyte0.length == 0)
        {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (l < 0L)
        {
            throw new IllegalArgumentException("The offset cannot be negative");
        } else
        {
            magicNumbers = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, magicNumbers, 0, abyte0.length);
            byteOffset = l;
            return;
        }
    }

    public boolean accept(File file)
    {
        Object obj;
        Object obj2;
        if (file == null || !file.isFile() || !file.canRead())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        obj2 = null;
        obj = null;
        byte abyte0[];
        abyte0 = new byte[magicNumbers.length];
        file = new RandomAccessFile(file, "r");
        int i;
        int j;
        file.seek(byteOffset);
        i = file.read(abyte0);
        j = magicNumbers.length;
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        IOUtils.closeQuietly(file);
        return false;
        boolean flag = Arrays.equals(magicNumbers, abyte0);
        IOUtils.closeQuietly(file);
        return flag;
        file;
        file = obj;
_L4:
        IOUtils.closeQuietly(file);
        return false;
        Object obj1;
        obj1;
        file = obj2;
_L2:
        IOUtils.closeQuietly(file);
        throw obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append("(");
        stringbuilder.append(new String(magicNumbers));
        stringbuilder.append(",");
        stringbuilder.append(byteOffset);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }
}
