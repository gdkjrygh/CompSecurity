// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.StringBuilderWriter;

// Referenced classes of package org.apache.commons.io:
//            Charsets, LineIterator

public class IOUtils
{

    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final char DIR_SEPARATOR;
    public static final char DIR_SEPARATOR_UNIX = 47;
    public static final char DIR_SEPARATOR_WINDOWS = 92;
    private static final int EOF = -1;
    public static final String LINE_SEPARATOR;
    public static final String LINE_SEPARATOR_UNIX = "\n";
    public static final String LINE_SEPARATOR_WINDOWS = "\r\n";
    private static final int SKIP_BUFFER_SIZE = 2048;
    private static byte SKIP_BYTE_BUFFER[];
    private static char SKIP_CHAR_BUFFER[];

    public IOUtils()
    {
    }

    public static void close(URLConnection urlconnection)
    {
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
        }
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void closeQuietly(InputStream inputstream)
    {
        closeQuietly(((Closeable) (inputstream)));
    }

    public static void closeQuietly(OutputStream outputstream)
    {
        closeQuietly(((Closeable) (outputstream)));
    }

    public static void closeQuietly(Reader reader)
    {
        closeQuietly(((Closeable) (reader)));
    }

    public static void closeQuietly(Writer writer)
    {
        closeQuietly(((Closeable) (writer)));
    }

    public static void closeQuietly(ServerSocket serversocket)
    {
        if (serversocket == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        serversocket.close();
        return;
        serversocket;
    }

    public static void closeQuietly(Socket socket)
    {
        if (socket == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        socket.close();
        return;
        socket;
    }

    public static void closeQuietly(Selector selector)
    {
        if (selector == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        selector.close();
        return;
        selector;
    }

    public static boolean contentEquals(InputStream inputstream, InputStream inputstream1)
        throws IOException
    {
        Object obj;
        int i;
        obj = inputstream;
        if (!(inputstream instanceof BufferedInputStream))
        {
            obj = new BufferedInputStream(inputstream);
        }
        inputstream = inputstream1;
        if (!(inputstream1 instanceof BufferedInputStream))
        {
            inputstream = new BufferedInputStream(inputstream1);
        }
        i = ((InputStream) (obj)).read();
_L7:
        if (-1 == i) goto _L2; else goto _L1
_L1:
        if (i == inputstream.read()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        i = ((InputStream) (obj)).read();
        continue; /* Loop/switch isn't completed */
_L2:
        if (inputstream.read() != -1) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean contentEquals(Reader reader, Reader reader1)
        throws IOException
    {
        int i;
        reader = toBufferedReader(reader);
        reader1 = toBufferedReader(reader1);
        i = reader.read();
_L7:
        if (-1 == i) goto _L2; else goto _L1
_L1:
        if (i == reader1.read()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        i = reader.read();
        continue; /* Loop/switch isn't completed */
_L2:
        if (reader1.read() != -1) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader1)
        throws IOException
    {
        BufferedReader bufferedreader = toBufferedReader(reader);
        BufferedReader bufferedreader1 = toBufferedReader(reader1);
        reader = bufferedreader.readLine();
        for (reader1 = bufferedreader1.readLine(); reader != null && reader1 != null && reader.equals(reader1); reader1 = bufferedreader1.readLine())
        {
            reader = bufferedreader.readLine();
        }

        if (reader == null)
        {
            return reader1 == null;
        } else
        {
            return reader.equals(reader1);
        }
    }

    public static int copy(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        long l = copyLarge(inputstream, outputstream);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    public static int copy(Reader reader, Writer writer)
        throws IOException
    {
        long l = copyLarge(reader, writer);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    public static void copy(InputStream inputstream, Writer writer)
        throws IOException
    {
        copy(inputstream, writer, Charset.defaultCharset());
    }

    public static void copy(InputStream inputstream, Writer writer, String s)
        throws IOException
    {
        copy(inputstream, writer, Charsets.toCharset(s));
    }

    public static void copy(InputStream inputstream, Writer writer, Charset charset)
        throws IOException
    {
        copy(((Reader) (new InputStreamReader(inputstream, Charsets.toCharset(charset)))), writer);
    }

    public static void copy(Reader reader, OutputStream outputstream)
        throws IOException
    {
        copy(reader, outputstream, Charset.defaultCharset());
    }

    public static void copy(Reader reader, OutputStream outputstream, String s)
        throws IOException
    {
        copy(reader, outputstream, Charsets.toCharset(s));
    }

    public static void copy(Reader reader, OutputStream outputstream, Charset charset)
        throws IOException
    {
        outputstream = new OutputStreamWriter(outputstream, Charsets.toCharset(charset));
        copy(reader, ((Writer) (outputstream)));
        outputstream.flush();
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        return copyLarge(inputstream, outputstream, new byte[4096]);
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream, long l, long l1)
        throws IOException
    {
        return copyLarge(inputstream, outputstream, l, l1, new byte[4096]);
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream, long l, long l1, byte abyte0[])
        throws IOException
    {
        if (l > 0L)
        {
            skipFully(inputstream, l);
        }
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        long l2 = 0L;
_L4:
        return l2;
_L2:
        int i;
        int i1;
        i1 = abyte0.length;
        int j = i1;
        i = j;
        if (l1 > 0L)
        {
            i = j;
            if (l1 < (long)i1)
            {
                i = (int)l1;
            }
        }
        l = 0L;
_L6:
        l2 = l;
        if (i <= 0) goto _L4; else goto _L3
_L3:
        int k;
        k = inputstream.read(abyte0, 0, i);
        l2 = l;
        if (-1 == k) goto _L4; else goto _L5
_L5:
        outputstream.write(abyte0, 0, k);
        long l3 = l + (long)k;
        l = l3;
        if (l1 > 0L)
        {
            i = (int)Math.min(l1 - l3, i1);
            l = l3;
        }
          goto _L6
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream, byte abyte0[])
        throws IOException
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

    public static long copyLarge(Reader reader, Writer writer)
        throws IOException
    {
        return copyLarge(reader, writer, new char[4096]);
    }

    public static long copyLarge(Reader reader, Writer writer, long l, long l1)
        throws IOException
    {
        return copyLarge(reader, writer, l, l1, new char[4096]);
    }

    public static long copyLarge(Reader reader, Writer writer, long l, long l1, char ac[])
        throws IOException
    {
        if (l > 0L)
        {
            skipFully(reader, l);
        }
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        long l2 = 0L;
_L4:
        return l2;
_L2:
        int i;
        int j = ac.length;
        i = j;
        if (l1 > 0L)
        {
            i = j;
            if (l1 < (long)ac.length)
            {
                i = (int)l1;
            }
        }
        l = 0L;
_L6:
        l2 = l;
        if (i <= 0) goto _L4; else goto _L3
_L3:
        int k;
        k = reader.read(ac, 0, i);
        l2 = l;
        if (-1 == k) goto _L4; else goto _L5
_L5:
        writer.write(ac, 0, k);
        long l3 = l + (long)k;
        l = l3;
        if (l1 > 0L)
        {
            i = (int)Math.min(l1 - l3, ac.length);
            l = l3;
        }
          goto _L6
    }

    public static long copyLarge(Reader reader, Writer writer, char ac[])
        throws IOException
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

    public static LineIterator lineIterator(InputStream inputstream, String s)
        throws IOException
    {
        return lineIterator(inputstream, Charsets.toCharset(s));
    }

    public static LineIterator lineIterator(InputStream inputstream, Charset charset)
        throws IOException
    {
        return new LineIterator(new InputStreamReader(inputstream, Charsets.toCharset(charset)));
    }

    public static LineIterator lineIterator(Reader reader)
    {
        return new LineIterator(reader);
    }

    public static int read(InputStream inputstream, byte abyte0[])
        throws IOException
    {
        return read(inputstream, abyte0, 0, abyte0.length);
    }

    public static int read(InputStream inputstream, byte abyte0[], int i, int j)
        throws IOException
    {
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Length must not be negative: ").append(j).toString());
        }
        int k = j;
        do
        {
            int l;
label0:
            {
                if (k > 0)
                {
                    l = inputstream.read(abyte0, i + (j - k), k);
                    if (-1 != l)
                    {
                        break label0;
                    }
                }
                return j - k;
            }
            k -= l;
        } while (true);
    }

    public static int read(Reader reader, char ac[])
        throws IOException
    {
        return read(reader, ac, 0, ac.length);
    }

    public static int read(Reader reader, char ac[], int i, int j)
        throws IOException
    {
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Length must not be negative: ").append(j).toString());
        }
        int k = j;
        do
        {
            int l;
label0:
            {
                if (k > 0)
                {
                    l = reader.read(ac, i + (j - k), k);
                    if (-1 != l)
                    {
                        break label0;
                    }
                }
                return j - k;
            }
            k -= l;
        } while (true);
    }

    public static void readFully(InputStream inputstream, byte abyte0[])
        throws IOException
    {
        readFully(inputstream, abyte0, 0, abyte0.length);
    }

    public static void readFully(InputStream inputstream, byte abyte0[], int i, int j)
        throws IOException
    {
        i = read(inputstream, abyte0, i, j);
        if (i != j)
        {
            throw new EOFException((new StringBuilder()).append("Length to read: ").append(j).append(" actual: ").append(i).toString());
        } else
        {
            return;
        }
    }

    public static void readFully(Reader reader, char ac[])
        throws IOException
    {
        readFully(reader, ac, 0, ac.length);
    }

    public static void readFully(Reader reader, char ac[], int i, int j)
        throws IOException
    {
        i = read(reader, ac, i, j);
        if (i != j)
        {
            throw new EOFException((new StringBuilder()).append("Length to read: ").append(j).append(" actual: ").append(i).toString());
        } else
        {
            return;
        }
    }

    public static List readLines(InputStream inputstream)
        throws IOException
    {
        return readLines(inputstream, Charset.defaultCharset());
    }

    public static List readLines(InputStream inputstream, String s)
        throws IOException
    {
        return readLines(inputstream, Charsets.toCharset(s));
    }

    public static List readLines(InputStream inputstream, Charset charset)
        throws IOException
    {
        return readLines(((Reader) (new InputStreamReader(inputstream, Charsets.toCharset(charset)))));
    }

    public static List readLines(Reader reader)
        throws IOException
    {
        BufferedReader bufferedreader = toBufferedReader(reader);
        ArrayList arraylist = new ArrayList();
        for (reader = bufferedreader.readLine(); reader != null; reader = bufferedreader.readLine())
        {
            arraylist.add(reader);
        }

        return arraylist;
    }

    public static long skip(InputStream inputstream, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Skip count must be non-negative, actual: ").append(l).toString());
        }
        if (SKIP_BYTE_BUFFER == null)
        {
            SKIP_BYTE_BUFFER = new byte[2048];
        }
        long l1 = l;
        do
        {
            long l2;
label0:
            {
                if (l1 > 0L)
                {
                    l2 = inputstream.read(SKIP_BYTE_BUFFER, 0, (int)Math.min(l1, 2048L));
                    if (l2 >= 0L)
                    {
                        break label0;
                    }
                }
                return l - l1;
            }
            l1 -= l2;
        } while (true);
    }

    public static long skip(Reader reader, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Skip count must be non-negative, actual: ").append(l).toString());
        }
        if (SKIP_CHAR_BUFFER == null)
        {
            SKIP_CHAR_BUFFER = new char[2048];
        }
        long l1 = l;
        do
        {
            long l2;
label0:
            {
                if (l1 > 0L)
                {
                    l2 = reader.read(SKIP_CHAR_BUFFER, 0, (int)Math.min(l1, 2048L));
                    if (l2 >= 0L)
                    {
                        break label0;
                    }
                }
                return l - l1;
            }
            l1 -= l2;
        } while (true);
    }

    public static void skipFully(InputStream inputstream, long l)
        throws IOException
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bytes to skip must not be negative: ").append(l).toString());
        }
        long l1 = skip(inputstream, l);
        if (l1 != l)
        {
            throw new EOFException((new StringBuilder()).append("Bytes to skip: ").append(l).append(" actual: ").append(l1).toString());
        } else
        {
            return;
        }
    }

    public static void skipFully(Reader reader, long l)
        throws IOException
    {
        long l1 = skip(reader, l);
        if (l1 != l)
        {
            throw new EOFException((new StringBuilder()).append("Chars to skip: ").append(l).append(" actual: ").append(l1).toString());
        } else
        {
            return;
        }
    }

    public static InputStream toBufferedInputStream(InputStream inputstream)
        throws IOException
    {
        return ByteArrayOutputStream.toBufferedInputStream(inputstream);
    }

    public static BufferedReader toBufferedReader(Reader reader)
    {
        if (reader instanceof BufferedReader)
        {
            return (BufferedReader)reader;
        } else
        {
            return new BufferedReader(reader);
        }
    }

    public static byte[] toByteArray(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        copy(inputstream, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] toByteArray(InputStream inputstream, int i)
        throws IOException
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Size must be equal or greater than zero: ").append(i).toString());
        }
        if (i == 0)
        {
            inputstream = new byte[0];
        } else
        {
            byte abyte0[] = new byte[i];
            int j = 0;
            do
            {
                if (j >= i)
                {
                    break;
                }
                int k = inputstream.read(abyte0, j, i - j);
                if (k == -1)
                {
                    break;
                }
                j += k;
            } while (true);
            inputstream = abyte0;
            if (j != i)
            {
                throw new IOException((new StringBuilder()).append("Unexpected readed size. current: ").append(j).append(", excepted: ").append(i).toString());
            }
        }
        return inputstream;
    }

    public static byte[] toByteArray(InputStream inputstream, long l)
        throws IOException
    {
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Size cannot be greater than Integer max value: ").append(l).toString());
        } else
        {
            return toByteArray(inputstream, (int)l);
        }
    }

    public static byte[] toByteArray(Reader reader)
        throws IOException
    {
        return toByteArray(reader, Charset.defaultCharset());
    }

    public static byte[] toByteArray(Reader reader, String s)
        throws IOException
    {
        return toByteArray(reader, Charsets.toCharset(s));
    }

    public static byte[] toByteArray(Reader reader, Charset charset)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        copy(reader, bytearrayoutputstream, charset);
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] toByteArray(String s)
        throws IOException
    {
        return s.getBytes();
    }

    public static byte[] toByteArray(URI uri)
        throws IOException
    {
        return toByteArray(uri.toURL());
    }

    public static byte[] toByteArray(URL url)
        throws IOException
    {
        url = url.openConnection();
        byte abyte0[] = toByteArray(((URLConnection) (url)));
        close(url);
        return abyte0;
        Exception exception;
        exception;
        close(url);
        throw exception;
    }

    public static byte[] toByteArray(URLConnection urlconnection)
        throws IOException
    {
        urlconnection = urlconnection.getInputStream();
        byte abyte0[] = toByteArray(((InputStream) (urlconnection)));
        urlconnection.close();
        return abyte0;
        Exception exception;
        exception;
        urlconnection.close();
        throw exception;
    }

    public static char[] toCharArray(InputStream inputstream)
        throws IOException
    {
        return toCharArray(inputstream, Charset.defaultCharset());
    }

    public static char[] toCharArray(InputStream inputstream, String s)
        throws IOException
    {
        return toCharArray(inputstream, Charsets.toCharset(s));
    }

    public static char[] toCharArray(InputStream inputstream, Charset charset)
        throws IOException
    {
        CharArrayWriter chararraywriter = new CharArrayWriter();
        copy(inputstream, chararraywriter, charset);
        return chararraywriter.toCharArray();
    }

    public static char[] toCharArray(Reader reader)
        throws IOException
    {
        CharArrayWriter chararraywriter = new CharArrayWriter();
        copy(reader, chararraywriter);
        return chararraywriter.toCharArray();
    }

    public static InputStream toInputStream(CharSequence charsequence)
    {
        return toInputStream(charsequence, Charset.defaultCharset());
    }

    public static InputStream toInputStream(CharSequence charsequence, String s)
        throws IOException
    {
        return toInputStream(charsequence, Charsets.toCharset(s));
    }

    public static InputStream toInputStream(CharSequence charsequence, Charset charset)
    {
        return toInputStream(charsequence.toString(), charset);
    }

    public static InputStream toInputStream(String s)
    {
        return toInputStream(s, Charset.defaultCharset());
    }

    public static InputStream toInputStream(String s, String s1)
        throws IOException
    {
        return new ByteArrayInputStream(s.getBytes(Charsets.toCharset(s1)));
    }

    public static InputStream toInputStream(String s, Charset charset)
    {
        return new ByteArrayInputStream(s.getBytes(Charsets.toCharset(charset)));
    }

    public static String toString(InputStream inputstream)
        throws IOException
    {
        return toString(inputstream, Charset.defaultCharset());
    }

    public static String toString(InputStream inputstream, String s)
        throws IOException
    {
        return toString(inputstream, Charsets.toCharset(s));
    }

    public static String toString(InputStream inputstream, Charset charset)
        throws IOException
    {
        StringBuilderWriter stringbuilderwriter = new StringBuilderWriter();
        copy(inputstream, stringbuilderwriter, charset);
        return stringbuilderwriter.toString();
    }

    public static String toString(Reader reader)
        throws IOException
    {
        StringBuilderWriter stringbuilderwriter = new StringBuilderWriter();
        copy(reader, stringbuilderwriter);
        return stringbuilderwriter.toString();
    }

    public static String toString(URI uri)
        throws IOException
    {
        return toString(uri, Charset.defaultCharset());
    }

    public static String toString(URI uri, String s)
        throws IOException
    {
        return toString(uri, Charsets.toCharset(s));
    }

    public static String toString(URI uri, Charset charset)
        throws IOException
    {
        return toString(uri.toURL(), Charsets.toCharset(charset));
    }

    public static String toString(URL url)
        throws IOException
    {
        return toString(url, Charset.defaultCharset());
    }

    public static String toString(URL url, String s)
        throws IOException
    {
        return toString(url, Charsets.toCharset(s));
    }

    public static String toString(URL url, Charset charset)
        throws IOException
    {
        url = url.openStream();
        charset = toString(((InputStream) (url)), charset);
        url.close();
        return charset;
        charset;
        url.close();
        throw charset;
    }

    public static String toString(byte abyte0[])
        throws IOException
    {
        return new String(abyte0);
    }

    public static String toString(byte abyte0[], String s)
        throws IOException
    {
        return new String(abyte0, Charsets.toCharset(s));
    }

    public static void write(CharSequence charsequence, OutputStream outputstream)
        throws IOException
    {
        write(charsequence, outputstream, Charset.defaultCharset());
    }

    public static void write(CharSequence charsequence, OutputStream outputstream, String s)
        throws IOException
    {
        write(charsequence, outputstream, Charsets.toCharset(s));
    }

    public static void write(CharSequence charsequence, OutputStream outputstream, Charset charset)
        throws IOException
    {
        if (charsequence != null)
        {
            write(charsequence.toString(), outputstream, charset);
        }
    }

    public static void write(CharSequence charsequence, Writer writer)
        throws IOException
    {
        if (charsequence != null)
        {
            write(charsequence.toString(), writer);
        }
    }

    public static void write(String s, OutputStream outputstream)
        throws IOException
    {
        write(s, outputstream, Charset.defaultCharset());
    }

    public static void write(String s, OutputStream outputstream, String s1)
        throws IOException
    {
        write(s, outputstream, Charsets.toCharset(s1));
    }

    public static void write(String s, OutputStream outputstream, Charset charset)
        throws IOException
    {
        if (s != null)
        {
            outputstream.write(s.getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(String s, Writer writer)
        throws IOException
    {
        if (s != null)
        {
            writer.write(s);
        }
    }

    public static void write(StringBuffer stringbuffer, OutputStream outputstream)
        throws IOException
    {
        write(stringbuffer, outputstream, (String)null);
    }

    public static void write(StringBuffer stringbuffer, OutputStream outputstream, String s)
        throws IOException
    {
        if (stringbuffer != null)
        {
            outputstream.write(stringbuffer.toString().getBytes(Charsets.toCharset(s)));
        }
    }

    public static void write(StringBuffer stringbuffer, Writer writer)
        throws IOException
    {
        if (stringbuffer != null)
        {
            writer.write(stringbuffer.toString());
        }
    }

    public static void write(byte abyte0[], OutputStream outputstream)
        throws IOException
    {
        if (abyte0 != null)
        {
            outputstream.write(abyte0);
        }
    }

    public static void write(byte abyte0[], Writer writer)
        throws IOException
    {
        write(abyte0, writer, Charset.defaultCharset());
    }

    public static void write(byte abyte0[], Writer writer, String s)
        throws IOException
    {
        write(abyte0, writer, Charsets.toCharset(s));
    }

    public static void write(byte abyte0[], Writer writer, Charset charset)
        throws IOException
    {
        if (abyte0 != null)
        {
            writer.write(new String(abyte0, Charsets.toCharset(charset)));
        }
    }

    public static void write(char ac[], OutputStream outputstream)
        throws IOException
    {
        write(ac, outputstream, Charset.defaultCharset());
    }

    public static void write(char ac[], OutputStream outputstream, String s)
        throws IOException
    {
        write(ac, outputstream, Charsets.toCharset(s));
    }

    public static void write(char ac[], OutputStream outputstream, Charset charset)
        throws IOException
    {
        if (ac != null)
        {
            outputstream.write((new String(ac)).getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(char ac[], Writer writer)
        throws IOException
    {
        if (ac != null)
        {
            writer.write(ac);
        }
    }

    public static void writeLines(Collection collection, String s, OutputStream outputstream)
        throws IOException
    {
        writeLines(collection, s, outputstream, Charset.defaultCharset());
    }

    public static void writeLines(Collection collection, String s, OutputStream outputstream, String s1)
        throws IOException
    {
        writeLines(collection, s, outputstream, Charsets.toCharset(s1));
    }

    public static void writeLines(Collection collection, String s, OutputStream outputstream, Charset charset)
        throws IOException
    {
        if (collection != null)
        {
            String s1 = s;
            if (s == null)
            {
                s1 = LINE_SEPARATOR;
            }
            s = Charsets.toCharset(charset);
            collection = collection.iterator();
            while (collection.hasNext()) 
            {
                charset = ((Charset) (collection.next()));
                if (charset != null)
                {
                    outputstream.write(charset.toString().getBytes(s));
                }
                outputstream.write(s1.getBytes(s));
            }
        }
    }

    public static void writeLines(Collection collection, String s, Writer writer)
        throws IOException
    {
        if (collection != null)
        {
            String s1 = s;
            if (s == null)
            {
                s1 = LINE_SEPARATOR;
            }
            collection = collection.iterator();
            while (collection.hasNext()) 
            {
                s = ((String) (collection.next()));
                if (s != null)
                {
                    writer.write(s.toString());
                }
                writer.write(s1);
            }
        }
    }

    static 
    {
        DIR_SEPARATOR = File.separatorChar;
        StringBuilderWriter stringbuilderwriter = new StringBuilderWriter(4);
        PrintWriter printwriter = new PrintWriter(stringbuilderwriter);
        printwriter.println();
        LINE_SEPARATOR = stringbuilderwriter.toString();
        printwriter.close();
    }
}
