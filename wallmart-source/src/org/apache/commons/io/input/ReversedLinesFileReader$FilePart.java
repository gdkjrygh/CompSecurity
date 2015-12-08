// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.RandomAccessFile;

// Referenced classes of package org.apache.commons.io.input:
//            ReversedLinesFileReader

private class <init>
{

    private int currentLastBytePos;
    private final byte data[];
    private byte leftOver[];
    private final long no;
    final ReversedLinesFileReader this$0;

    private void createLeftOver()
    {
        int i = currentLastBytePos + 1;
        if (i > 0)
        {
            leftOver = new byte[i];
            System.arraycopy(data, 0, leftOver, 0, i);
        } else
        {
            leftOver = null;
        }
        currentLastBytePos = -1;
    }

    private int getNewLineMatchByteCount(byte abyte0[], int i)
    {
        boolean flag1 = false;
        byte abyte1[][] = ReversedLinesFileReader.access$800(ReversedLinesFileReader.this);
        int i1 = abyte1.length;
        int j = 0;
        do
        {
label0:
            {
                int k = ((flag1) ? 1 : 0);
                if (j < i1)
                {
                    byte abyte2[] = abyte1[j];
                    boolean flag = true;
                    k = abyte2.length - 1;
                    while (k >= 0) 
                    {
                        int l = (i + k) - (abyte2.length - 1);
                        if (l >= 0 && abyte0[l] == abyte2[k])
                        {
                            l = 1;
                        } else
                        {
                            l = 0;
                        }
                        flag &= l;
                        k--;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                    k = abyte2.length;
                }
                return k;
            }
            j++;
        } while (true);
    }

    private String readLine()
        throws IOException
    {
        Object obj;
        String s;
        int i;
        s = null;
        boolean flag;
        if (no == 1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = currentLastBytePos;
_L4:
        obj = s;
        if (i > -1)
        {
            if (!flag && i < ReversedLinesFileReader.access$600(ReversedLinesFileReader.this))
            {
                createLeftOver();
                obj = s;
            } else
            {
label0:
                {
                    int j = getNewLineMatchByteCount(data, i);
                    if (j <= 0)
                    {
                        break label0;
                    }
                    int l = i + 1;
                    int i1 = (currentLastBytePos - l) + 1;
                    if (i1 < 0)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Unexpected negative line length=").append(i1).toString());
                    }
                    obj = new byte[i1];
                    System.arraycopy(data, l, obj, 0, i1);
                    obj = new String(((byte []) (obj)), ReversedLinesFileReader.access$500(ReversedLinesFileReader.this));
                    currentLastBytePos = i - j;
                }
            }
        }
_L2:
        s = ((String) (obj));
        if (flag)
        {
            s = ((String) (obj));
            if (leftOver != null)
            {
                s = new String(leftOver, ReversedLinesFileReader.access$500(ReversedLinesFileReader.this));
                leftOver = null;
            }
        }
        return s;
        int k = i - ReversedLinesFileReader.access$700(ReversedLinesFileReader.this);
        i = k;
        if (k >= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        createLeftOver();
        obj = s;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    private createLeftOver rollOver()
        throws IOException
    {
        if (currentLastBytePos > -1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=").append(currentLastBytePos).toString());
        }
        if (no > 1L)
        {
            return new <init>(no - 1L, ReversedLinesFileReader.access$300(ReversedLinesFileReader.this), leftOver);
        }
        if (leftOver != null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unexpected leftover of the last block: leftOverOfThisFilePart=").append(new String(leftOver, ReversedLinesFileReader.access$500(ReversedLinesFileReader.this))).toString());
        } else
        {
            return null;
        }
    }



    private (long l, int i, byte abyte0[])
        throws IOException
    {
        this$0 = ReversedLinesFileReader.this;
        super();
        no = l;
        int j;
        long l1;
        if (abyte0 != null)
        {
            j = abyte0.length;
        } else
        {
            j = 0;
        }
        data = new byte[i + j];
        l1 = ReversedLinesFileReader.access$300(ReversedLinesFileReader.this);
        if (l > 0L)
        {
            ReversedLinesFileReader.access$400(ReversedLinesFileReader.this).seek((l - 1L) * l1);
            if (ReversedLinesFileReader.access$400(ReversedLinesFileReader.this).read(data, 0, i) != i)
            {
                throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
            }
        }
        if (abyte0 != null)
        {
            System.arraycopy(abyte0, 0, data, i, abyte0.length);
        }
        currentLastBytePos = data.length - 1;
        leftOver = null;
    }

    leftOver(long l, int i, byte abyte0[], leftOver leftover)
        throws IOException
    {
        this(l, i, abyte0);
    }
}
