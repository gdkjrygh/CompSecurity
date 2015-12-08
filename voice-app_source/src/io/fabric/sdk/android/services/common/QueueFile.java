// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueFile
    implements Closeable
{
    static class Element
    {

        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final int position;

        public String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append("[").append("position = ").append(position).append(", length = ").append(length).append("]").toString();
        }


        Element(int i, int j)
        {
            position = i;
            length = j;
        }
    }

    private final class ElementInputStream extends InputStream
    {

        private int position;
        private int remaining;
        final QueueFile this$0;

        public int read()
            throws IOException
        {
            if (remaining == 0)
            {
                return -1;
            } else
            {
                raf.seek(position);
                int i = raf.read();
                position = wrapPosition(position + 1);
                remaining = remaining - 1;
                return i;
            }
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            QueueFile.nonNull(abyte0, "buffer");
            if ((i | j) < 0 || j > abyte0.length - i)
            {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (remaining > 0)
            {
                int k = j;
                if (j > remaining)
                {
                    k = remaining;
                }
                ringRead(position, abyte0, i, k);
                position = wrapPosition(position + k);
                remaining = remaining - k;
                return k;
            } else
            {
                return -1;
            }
        }

        private ElementInputStream(Element element)
        {
            this$0 = QueueFile.this;
            super();
            position = wrapPosition(element.position + 4);
            remaining = element.length;
        }

    }

    public static interface ElementReader
    {

        public abstract void read(InputStream inputstream, int i)
            throws IOException;
    }


    static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = Logger.getLogger(io/fabric/sdk/android/services/common/QueueFile.getName());
    private final byte buffer[];
    private int elementCount;
    int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;

    public QueueFile(File file)
        throws IOException
    {
        buffer = new byte[16];
        if (!file.exists())
        {
            initialize(file);
        }
        raf = open(file);
        readHeader();
    }

    QueueFile(RandomAccessFile randomaccessfile)
        throws IOException
    {
        buffer = new byte[16];
        raf = randomaccessfile;
        readHeader();
    }

    private void expandIfNecessary(int i)
        throws IOException
    {
        int i1 = i + 4;
        i = remainingBytes();
        if (i >= i1)
        {
            return;
        }
        int j = fileLength;
        int k;
        int l;
        do
        {
            l = i + j;
            k = j << 1;
            j = k;
            i = l;
        } while (l < i1);
        setLength(k);
        i = wrapPosition(last.position + 4 + last.length);
        if (i < first.position)
        {
            FileChannel filechannel = raf.getChannel();
            filechannel.position(fileLength);
            i -= 4;
            if (filechannel.transferTo(16L, i, filechannel) != (long)i)
            {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        if (last.position < first.position)
        {
            i = (fileLength + last.position) - 16;
            writeHeader(k, elementCount, first.position, i);
            last = new Element(i, last.length);
        } else
        {
            writeHeader(k, elementCount, first.position, last.position);
        }
        fileLength = k;
    }

    private static void initialize(File file)
        throws IOException
    {
        RandomAccessFile randomaccessfile;
        File file1;
        file1 = new File((new StringBuilder()).append(file.getPath()).append(".tmp").toString());
        randomaccessfile = open(file1);
        randomaccessfile.setLength(4096L);
        randomaccessfile.seek(0L);
        byte abyte0[] = new byte[16];
        writeInts(abyte0, new int[] {
            4096, 0, 0, 0
        });
        randomaccessfile.write(abyte0);
        randomaccessfile.close();
        if (!file1.renameTo(file))
        {
            throw new IOException("Rename failed!");
        } else
        {
            return;
        }
        file;
        randomaccessfile.close();
        throw file;
    }

    private static Object nonNull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException(s);
        } else
        {
            return obj;
        }
    }

    private static RandomAccessFile open(File file)
        throws FileNotFoundException
    {
        return new RandomAccessFile(file, "rwd");
    }

    private Element readElement(int i)
        throws IOException
    {
        if (i == 0)
        {
            return Element.NULL;
        } else
        {
            raf.seek(i);
            return new Element(i, raf.readInt());
        }
    }

    private void readHeader()
        throws IOException
    {
        raf.seek(0L);
        raf.readFully(buffer);
        fileLength = readInt(buffer, 0);
        if ((long)fileLength > raf.length())
        {
            throw new IOException((new StringBuilder()).append("File is truncated. Expected length: ").append(fileLength).append(", Actual length: ").append(raf.length()).toString());
        } else
        {
            elementCount = readInt(buffer, 4);
            int i = readInt(buffer, 8);
            int j = readInt(buffer, 12);
            first = readElement(i);
            last = readElement(j);
            return;
        }
    }

    private static int readInt(byte abyte0[], int i)
    {
        return ((abyte0[i] & 0xff) << 24) + ((abyte0[i + 1] & 0xff) << 16) + ((abyte0[i + 2] & 0xff) << 8) + (abyte0[i + 3] & 0xff);
    }

    private int remainingBytes()
    {
        return fileLength - usedBytes();
    }

    private void ringRead(int i, byte abyte0[], int j, int k)
        throws IOException
    {
        i = wrapPosition(i);
        if (i + k <= fileLength)
        {
            raf.seek(i);
            raf.readFully(abyte0, j, k);
            return;
        } else
        {
            int l = fileLength - i;
            raf.seek(i);
            raf.readFully(abyte0, j, l);
            raf.seek(16L);
            raf.readFully(abyte0, j + l, k - l);
            return;
        }
    }

    private void ringWrite(int i, byte abyte0[], int j, int k)
        throws IOException
    {
        i = wrapPosition(i);
        if (i + k <= fileLength)
        {
            raf.seek(i);
            raf.write(abyte0, j, k);
            return;
        } else
        {
            int l = fileLength - i;
            raf.seek(i);
            raf.write(abyte0, j, l);
            raf.seek(16L);
            raf.write(abyte0, j + l, k - l);
            return;
        }
    }

    private void setLength(int i)
        throws IOException
    {
        raf.setLength(i);
        raf.getChannel().force(true);
    }

    private int wrapPosition(int i)
    {
        if (i < fileLength)
        {
            return i;
        } else
        {
            return (i + 16) - fileLength;
        }
    }

    private void writeHeader(int i, int j, int k, int l)
        throws IOException
    {
        writeInts(buffer, new int[] {
            i, j, k, l
        });
        raf.seek(0L);
        raf.write(buffer);
    }

    private static void writeInt(byte abyte0[], int i, int j)
    {
        abyte0[i] = (byte)(j >> 24);
        abyte0[i + 1] = (byte)(j >> 16);
        abyte0[i + 2] = (byte)(j >> 8);
        abyte0[i + 3] = (byte)j;
    }

    private static transient void writeInts(byte abyte0[], int ai[])
    {
        int j = 0;
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            writeInt(abyte0, j, ai[i]);
            j += 4;
        }

    }

    public void add(byte abyte0[])
        throws IOException
    {
        add(abyte0, 0, abyte0.length);
    }

    public void add(byte abyte0[], int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        nonNull(abyte0, "buffer");
        if ((i | j) < 0)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        if (j <= abyte0.length - i)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        throw new IndexOutOfBoundsException();
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        boolean flag;
        expandIfNecessary(j);
        flag = isEmpty();
        if (!flag) goto _L2; else goto _L1
_L1:
        int k = 16;
_L3:
        Element element;
        element = new Element(k, j);
        writeInt(buffer, 0, j);
        ringWrite(element.position, buffer, 0, 4);
        ringWrite(element.position + 4, abyte0, i, j);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        i = element.position;
_L4:
        writeHeader(fileLength, elementCount + 1, i, element.position);
        last = element;
        elementCount = elementCount + 1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        first = last;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        k = wrapPosition(last.position + 4 + last.length);
          goto _L3
        i = first.position;
          goto _L4
    }

    public void clear()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        writeHeader(4096, 0, 0, 0);
        elementCount = 0;
        first = Element.NULL;
        last = Element.NULL;
        if (fileLength > 4096)
        {
            setLength(4096);
        }
        fileLength = 4096;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        raf.close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void forEach(ElementReader elementreader)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        int j = first.position;
        int i = 0;
_L2:
        if (i >= elementCount)
        {
            break; /* Loop/switch isn't completed */
        }
        Element element = readElement(j);
        elementreader.read(new ElementInputStream(element), element.length);
        j = wrapPosition(element.position + 4 + element.length);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        elementreader;
        throw elementreader;
    }

    public boolean hasSpaceFor(int i, int j)
    {
        return usedBytes() + 4 + i <= j;
    }

    public boolean isEmpty()
    {
        this;
        JVM INSTR monitorenter ;
        int i = elementCount;
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void peek(ElementReader elementreader)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (elementCount > 0)
        {
            elementreader.read(new ElementInputStream(first), first.length);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        elementreader;
        throw elementreader;
    }

    public byte[] peek()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = isEmpty();
        if (!flag) goto _L2; else goto _L1
_L1:
        byte abyte0[] = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
_L2:
        int i = first.length;
        abyte0 = new byte[i];
        ringRead(first.position + 4, abyte0, 0, i);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void remove()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        break MISSING_BLOCK_LABEL_22;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (elementCount != 1)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        clear();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        int i = wrapPosition(first.position + 4 + first.length);
        ringRead(i, buffer, 0, 4);
        int j = readInt(buffer, 0);
        writeHeader(fileLength, elementCount - 1, i, last.position);
        elementCount = elementCount - 1;
        first = new Element(i, j);
          goto _L1
    }

    public int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i = elementCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        final StringBuilder builder = new StringBuilder();
        builder.append(getClass().getSimpleName()).append('[');
        builder.append("fileLength=").append(fileLength);
        builder.append(", size=").append(elementCount);
        builder.append(", first=").append(first);
        builder.append(", last=").append(last);
        builder.append(", element lengths=[");
        try
        {
            forEach(new ElementReader() {

                boolean first;
                final QueueFile this$0;
                final StringBuilder val$builder;

                public void read(InputStream inputstream, int i)
                    throws IOException
                {
                    if (first)
                    {
                        first = false;
                    } else
                    {
                        builder.append(", ");
                    }
                    builder.append(i);
                }

            
            {
                this$0 = QueueFile.this;
                builder = stringbuilder;
                super();
                first = true;
            }
            });
        }
        catch (IOException ioexception)
        {
            LOGGER.log(Level.WARNING, "read error", ioexception);
        }
        builder.append("]]");
        return builder.toString();
    }

    public int usedBytes()
    {
        if (elementCount == 0)
        {
            return 16;
        }
        if (last.position >= first.position)
        {
            return (last.position - first.position) + 4 + last.length + 16;
        } else
        {
            return (last.position + 4 + last.length + fileLength) - first.position;
        }
    }





}
