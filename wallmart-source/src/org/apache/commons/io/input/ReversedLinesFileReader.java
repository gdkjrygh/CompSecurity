// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.io.Charsets;

public class ReversedLinesFileReader
    implements Closeable
{
    private class FilePart
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
            byte abyte1[][] = newLineSequences;
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
                if (!flag && i < avoidNewlineSplitBufferSize)
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
                        obj = new String(((byte []) (obj)), encoding);
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
                    s = new String(leftOver, encoding);
                    leftOver = null;
                }
            }
            return s;
            int k = i - byteDecrement;
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

        private FilePart rollOver()
            throws IOException
        {
            if (currentLastBytePos > -1)
            {
                throw new IllegalStateException((new StringBuilder()).append("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=").append(currentLastBytePos).toString());
            }
            if (no > 1L)
            {
                return new FilePart(no - 1L, blockSize, leftOver);
            }
            if (leftOver != null)
            {
                throw new IllegalStateException((new StringBuilder()).append("Unexpected leftover of the last block: leftOverOfThisFilePart=").append(new String(leftOver, encoding)).toString());
            } else
            {
                return null;
            }
        }



        private FilePart(long l, int i, byte abyte0[])
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
            l1 = blockSize;
            if (l > 0L)
            {
                randomAccessFile.seek((l - 1L) * l1);
                if (randomAccessFile.read(data, 0, i) != i)
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

        FilePart(long l, int i, byte abyte0[], _cls1 _pcls1)
            throws IOException
        {
            this(l, i, abyte0);
        }
    }


    private final int avoidNewlineSplitBufferSize;
    private final int blockSize;
    private final int byteDecrement;
    private FilePart currentFilePart;
    private final Charset encoding;
    private final byte newLineSequences[][];
    private final RandomAccessFile randomAccessFile;
    private final long totalBlockCount;
    private final long totalByteLength;
    private boolean trailingNewlineOfFileSkipped;

    public ReversedLinesFileReader(File file)
        throws IOException
    {
        this(file, 4096, Charset.defaultCharset().toString());
    }

    public ReversedLinesFileReader(File file, int i, String s)
        throws IOException
    {
        this(file, i, Charsets.toCharset(s));
    }

    public ReversedLinesFileReader(File file, int i, Charset charset)
        throws IOException
    {
        int j;
        trailingNewlineOfFileSkipped = false;
        blockSize = i;
        encoding = charset;
        randomAccessFile = new RandomAccessFile(file, "r");
        totalByteLength = randomAccessFile.length();
        j = (int)(totalByteLength % (long)i);
        if (j <= 0) goto _L2; else goto _L1
_L1:
        totalBlockCount = totalByteLength / (long)i + 1L;
_L8:
        currentFilePart = new FilePart(totalBlockCount, j, null);
        file = Charsets.toCharset(charset);
        if (file.newEncoder().maxBytesPerChar() != 1.0F) goto _L4; else goto _L3
_L3:
        byteDecrement = 1;
_L6:
        newLineSequences = (new byte[][] {
            "\r\n".getBytes(charset), "\n".getBytes(charset), "\r".getBytes(charset)
        });
        avoidNewlineSplitBufferSize = newLineSequences[0].length;
        return;
_L2:
        totalBlockCount = totalByteLength / (long)i;
        if (totalByteLength > 0L)
        {
            j = i;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (file == Charset.forName("UTF-8"))
        {
            byteDecrement = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (file == Charset.forName("Shift_JIS"))
        {
            byteDecrement = 1;
            continue; /* Loop/switch isn't completed */
        }
        if (file != Charset.forName("UTF-16BE") && file != Charset.forName("UTF-16LE"))
        {
            break; /* Loop/switch isn't completed */
        }
        byteDecrement = 2;
        if (true) goto _L6; else goto _L5
_L5:
        if (file == Charset.forName("UTF-16"))
        {
            throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
        }
        throw new UnsupportedEncodingException((new StringBuilder()).append("Encoding ").append(charset).append(" is not supported yet (feel free to submit a patch)").toString());
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void close()
        throws IOException
    {
        randomAccessFile.close();
    }

    public String readLine()
        throws IOException
    {
        String s = currentFilePart.readLine();
        do
        {
            if (s != null)
            {
                break;
            }
            currentFilePart = currentFilePart.rollOver();
            if (currentFilePart == null)
            {
                break;
            }
            s = currentFilePart.readLine();
        } while (true);
        String s1 = s;
        if ("".equals(s))
        {
            s1 = s;
            if (!trailingNewlineOfFileSkipped)
            {
                trailingNewlineOfFileSkipped = true;
                s1 = readLine();
            }
        }
        return s1;
    }






}
