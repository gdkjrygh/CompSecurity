// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.ByteOrderMark;

// Referenced classes of package org.apache.commons.io.input:
//            ProxyInputStream

public class BOMInputStream extends ProxyInputStream
{

    private static final Comparator ByteOrderMarkLengthComparator = new Comparator() {

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((ByteOrderMark)obj, (ByteOrderMark)obj1);
        }

        public int compare(ByteOrderMark byteordermark, ByteOrderMark byteordermark1)
        {
            int i = byteordermark.length();
            int j = byteordermark1.length();
            if (i > j)
            {
                return -1;
            }
            return j <= i ? 0 : 1;
        }

    };
    private final List boms;
    private ByteOrderMark byteOrderMark;
    private int fbIndex;
    private int fbLength;
    private int firstBytes[];
    private final boolean include;
    private int markFbIndex;
    private boolean markedAtStart;

    public BOMInputStream(InputStream inputstream)
    {
        this(inputstream, false, new ByteOrderMark[] {
            ByteOrderMark.UTF_8
        });
    }

    public BOMInputStream(InputStream inputstream, boolean flag)
    {
        this(inputstream, flag, new ByteOrderMark[] {
            ByteOrderMark.UTF_8
        });
    }

    public transient BOMInputStream(InputStream inputstream, boolean flag, ByteOrderMark abyteordermark[])
    {
        super(inputstream);
        if (abyteordermark == null || abyteordermark.length == 0)
        {
            throw new IllegalArgumentException("No BOMs specified");
        } else
        {
            include = flag;
            Arrays.sort(abyteordermark, ByteOrderMarkLengthComparator);
            boms = Arrays.asList(abyteordermark);
            return;
        }
    }

    public transient BOMInputStream(InputStream inputstream, ByteOrderMark abyteordermark[])
    {
        this(inputstream, false, abyteordermark);
    }

    private ByteOrderMark find()
    {
        for (Iterator iterator = boms.iterator(); iterator.hasNext();)
        {
            ByteOrderMark byteordermark = (ByteOrderMark)iterator.next();
            if (matches(byteordermark))
            {
                return byteordermark;
            }
        }

        return null;
    }

    private boolean matches(ByteOrderMark byteordermark)
    {
        for (int i = 0; i < byteordermark.length(); i++)
        {
            if (byteordermark.get(i) != firstBytes[i])
            {
                return false;
            }
        }

        return true;
    }

    private int readFirstBytes()
        throws IOException
    {
        getBOM();
        if (fbIndex < fbLength)
        {
            int ai[] = firstBytes;
            int i = fbIndex;
            fbIndex = i + 1;
            return ai[i];
        } else
        {
            return -1;
        }
    }

    public ByteOrderMark getBOM()
        throws IOException
    {
        if (firstBytes != null) goto _L2; else goto _L1
_L1:
        int i;
        fbLength = 0;
        firstBytes = new int[((ByteOrderMark)boms.get(0)).length()];
        i = 0;
_L7:
        if (i >= firstBytes.length) goto _L4; else goto _L3
_L3:
        firstBytes[i] = in.read();
        fbLength = fbLength + 1;
        if (firstBytes[i] >= 0) goto _L5; else goto _L4
_L4:
        byteOrderMark = find();
        if (byteOrderMark != null && !include)
        {
            if (byteOrderMark.length() < firstBytes.length)
            {
                fbIndex = byteOrderMark.length();
            } else
            {
                fbLength = 0;
            }
        }
_L2:
        return byteOrderMark;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String getBOMCharsetName()
        throws IOException
    {
        getBOM();
        if (byteOrderMark == null)
        {
            return null;
        } else
        {
            return byteOrderMark.getCharsetName();
        }
    }

    public boolean hasBOM()
        throws IOException
    {
        return getBOM() != null;
    }

    public boolean hasBOM(ByteOrderMark byteordermark)
        throws IOException
    {
        if (!boms.contains(byteordermark))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Stream not configure to detect ").append(byteordermark).toString());
        }
        return byteOrderMark != null && getBOM().equals(byteordermark);
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        markFbIndex = fbIndex;
        boolean flag;
        if (firstBytes == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        markedAtStart = flag;
        in.mark(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int read()
        throws IOException
    {
        int i = readFirstBytes();
        if (i >= 0)
        {
            return i;
        } else
        {
            return in.read();
        }
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return read(abyte0, 0, abyte0.length);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        boolean flag = false;
        int k = 0;
        int l = j;
        j = i;
        i = ((flag) ? 1 : 0);
        do
        {
            if (l <= 0 || k < 0)
            {
                break;
            }
            int i1 = readFirstBytes();
            k = i1;
            if (i1 >= 0)
            {
                abyte0[j] = (byte)(i1 & 0xff);
                l--;
                i++;
                j++;
                k = i1;
            }
        } while (true);
        j = in.read(abyte0, j, l);
        if (j < 0)
        {
            if (i > 0)
            {
                return i;
            } else
            {
                return -1;
            }
        } else
        {
            return i + j;
        }
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        fbIndex = markFbIndex;
        if (markedAtStart)
        {
            firstBytes = null;
        }
        in.reset();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long skip(long l)
        throws IOException
    {
        for (; l > 0L && readFirstBytes() >= 0; l--) { }
        return in.skip(l);
    }

}
