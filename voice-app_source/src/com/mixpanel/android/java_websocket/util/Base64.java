// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Base64
{
    public static class InputStream extends FilterInputStream
    {

        private boolean breakLines;
        private byte buffer[];
        private int bufferLength;
        private byte decodabet[];
        private boolean encode;
        private int lineLength;
        private int numSigBytes;
        private int options;
        private int position;

        public int read()
            throws IOException
        {
            if (position >= 0) goto _L2; else goto _L1
_L1:
            if (!encode) goto _L4; else goto _L3
_L3:
            byte abyte0[];
            int i;
            int j;
            abyte0 = new byte[3];
            j = 0;
            i = 0;
_L12:
            if (i < 3)
            {
                if ((k = in.read()) >= 0)
                {
                    abyte0[i] = (byte)k;
                    j++;
                    i++;
                    continue; /* Loop/switch isn't completed */
                }
            }
            if (j <= 0) goto _L6; else goto _L5
_L5:
            Base64.encode3to4(abyte0, 0, j, buffer, 0, options);
            position = 0;
            numSigBytes = 4;
              goto _L2
_L6:
            return -1;
_L4:
            abyte0 = new byte[4];
            i = 0;
_L10:
            if (i < 4) goto _L8; else goto _L7
_L7:
            if (i == 4)
            {
                numSigBytes = Base64.decode4to3(abyte0, 0, buffer, 0, options);
                position = 0;
            } else
            if (i == 0)
            {
                return -1;
            } else
            {
                throw new IOException("Improperly padded Base64 input.");
            }
              goto _L2
_L8:
            do
            {
                j = in.read();
            } while (j >= 0 && decodabet[j & 0x7f] <= -5);
            if (j < 0) goto _L7; else goto _L9
_L9:
            abyte0[i] = (byte)j;
            i++;
              goto _L10
_L2:
            if (position >= 0)
            {
                int k;
                if (position >= numSigBytes)
                {
                    return -1;
                }
                if (encode && breakLines && lineLength >= 76)
                {
                    lineLength = 0;
                    return 10;
                }
                lineLength = lineLength + 1;
                abyte0 = buffer;
                i = position;
                position = i + 1;
                i = abyte0[i];
                if (position >= bufferLength)
                {
                    position = -1;
                }
                return i & 0xff;
            }
            throw new IOException("Error in Base64 code reading stream.");
            if (true) goto _L12; else goto _L11
_L11:
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            int k = 0;
_L5:
            if (k < j) goto _L2; else goto _L1
_L1:
            return k;
_L2:
            int l = read();
            if (l < 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            abyte0[i + k] = (byte)l;
            k++;
            continue; /* Loop/switch isn't completed */
            if (k != 0) goto _L1; else goto _L3
_L3:
            return -1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public InputStream(java.io.InputStream inputstream)
        {
            this(inputstream, 0);
        }

        public InputStream(java.io.InputStream inputstream, int i)
        {
            boolean flag1 = true;
            super(inputstream);
            options = i;
            int j;
            boolean flag;
            if ((i & 8) > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            breakLines = flag;
            if ((i & 1) > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            encode = flag;
            if (encode)
            {
                j = 4;
            } else
            {
                j = 3;
            }
            bufferLength = j;
            buffer = new byte[bufferLength];
            position = -1;
            lineLength = 0;
            decodabet = Base64.getDecodabet(i);
        }
    }

    public static class OutputStream extends FilterOutputStream
    {

        private byte b4[];
        private boolean breakLines;
        private byte buffer[];
        private int bufferLength;
        private byte decodabet[];
        private boolean encode;
        private int lineLength;
        private int options;
        private int position;
        private boolean suspendEncoding;

        public void close()
            throws IOException
        {
            flushBase64();
            super.close();
            buffer = null;
            out = null;
        }

        public void flushBase64()
            throws IOException
        {
label0:
            {
                if (position > 0)
                {
                    if (!encode)
                    {
                        break label0;
                    }
                    out.write(Base64.encode3to4(b4, buffer, position, options));
                    position = 0;
                }
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        public void resumeEncoding()
        {
            suspendEncoding = false;
        }

        public void suspendEncoding()
            throws IOException
        {
            flushBase64();
            suspendEncoding = true;
        }

        public void write(int i)
            throws IOException
        {
            if (!suspendEncoding) goto _L2; else goto _L1
_L1:
            out.write(i);
_L4:
            return;
_L2:
            if (!encode)
            {
                break; /* Loop/switch isn't completed */
            }
            byte abyte0[] = buffer;
            int j = position;
            position = j + 1;
            abyte0[j] = (byte)i;
            if (position >= bufferLength)
            {
                out.write(Base64.encode3to4(b4, buffer, bufferLength, options));
                lineLength = lineLength + 4;
                if (breakLines && lineLength >= 76)
                {
                    out.write(10);
                    lineLength = 0;
                }
                position = 0;
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (decodabet[i & 0x7f] <= -5)
            {
                continue; /* Loop/switch isn't completed */
            }
            byte abyte1[] = buffer;
            int k = position;
            position = k + 1;
            abyte1[k] = (byte)i;
            if (position < bufferLength) goto _L4; else goto _L5
_L5:
            i = Base64.decode4to3(buffer, 0, b4, 0, options);
            out.write(b4, 0, i);
            position = 0;
            return;
            if (decodabet[i & 0x7f] == -5) goto _L4; else goto _L6
_L6:
            throw new IOException("Invalid character in Base64 data.");
        }

        public void write(byte abyte0[], int i, int j)
            throws IOException
        {
            if (suspendEncoding)
            {
                out.write(abyte0, i, j);
            } else
            {
                int k = 0;
                while (k < j) 
                {
                    write(abyte0[i + k]);
                    k++;
                }
            }
        }

        public OutputStream(java.io.OutputStream outputstream)
        {
            this(outputstream, 1);
        }

        public OutputStream(java.io.OutputStream outputstream, int i)
        {
            boolean flag1 = true;
            super(outputstream);
            int j;
            boolean flag;
            if ((i & 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            breakLines = flag;
            if ((i & 1) != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            encode = flag;
            if (encode)
            {
                j = 3;
            } else
            {
                j = 4;
            }
            bufferLength = j;
            buffer = new byte[bufferLength];
            position = 0;
            lineLength = 0;
            suspendEncoding = false;
            b4 = new byte[4];
            options = i;
            decodabet = Base64.getDecodabet(i);
        }
    }


    static final boolean $assertionsDisabled;
    public static final int DECODE = 0;
    public static final int DONT_GUNZIP = 4;
    public static final int DO_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    public static final int GZIP = 2;
    private static final int MAX_LINE_LENGTH = 76;
    private static final byte NEW_LINE = 10;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    private static final String PREFERRED_ENCODING = "US-ASCII";
    public static final int URL_SAFE = 16;
    private static final byte WHITE_SPACE_ENC = -5;
    private static final byte _ORDERED_ALPHABET[] = {
        45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 
        57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 
        74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 
        84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 
        99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 
        109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 
        119, 120, 121, 122
    };
    private static final byte _ORDERED_DECODABET[];
    private static final byte _STANDARD_ALPHABET[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte _STANDARD_DECODABET[];
    private static final byte _URL_SAFE_ALPHABET[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    private static final byte _URL_SAFE_DECODABET[];

    private Base64()
    {
    }

    public static byte[] decode(String s)
        throws IOException
    {
        return decode(s, 0);
    }

    public static byte[] decode(String s, int i)
        throws IOException
    {
        if (s == null)
        {
            throw new NullPointerException("Input string was null.");
        }
        byte abyte0[] = s.getBytes("US-ASCII");
        s = abyte0;
_L6:
        Object obj1;
        Object obj2;
        byte abyte1[];
        abyte1 = decode(((byte []) (s)), 0, s.length, i);
        if ((i & 4) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj2 = abyte1;
        if (abyte1 == null) goto _L2; else goto _L1
_L1:
        obj2 = abyte1;
        if (abyte1.length < 4) goto _L2; else goto _L3
_L3:
        obj2 = abyte1;
        if (i != 0) goto _L2; else goto _L4
_L4:
        obj2 = abyte1;
        if (35615 != (abyte1[0] & 0xff | abyte1[1] << 8 & 0xff00)) goto _L2; else goto _L5
_L5:
        obj2 = null;
        Object obj6 = null;
        obj1 = null;
        Object obj3 = null;
        Object obj5 = null;
        Object obj4 = null;
        String s1 = null;
        Object obj7 = null;
        byte abyte2[] = new byte[2048];
        Object obj;
        Exception exception;
        Exception exception1;
        try
        {
            s = new ByteArrayOutputStream();
        }
        catch (IOException ioexception)
        {
            obj = obj1;
            s = obj7;
            obj1 = ioexception;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = s1;
            s = ((String) (obj2));
        }
        try
        {
_L8:
            obj = new ByteArrayInputStream(abyte1);
        }
        catch (IOException ioexception1)
        {
            obj = obj1;
            obj1 = ioexception1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = s;
            s = obj6;
            obj3 = obj5;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = new GZIPInputStream(((java.io.InputStream) (obj)));
_L7:
        i = ((GZIPInputStream) (obj1)).read(abyte2);
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        obj2 = s.toByteArray();
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((GZIPInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((ByteArrayInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ((byte []) (obj2));
        }
_L2:
        return ((byte []) (obj2));
        obj;
        s = s.getBytes();
          goto _L6
        s.write(abyte2, 0, i);
          goto _L7
        obj2;
        obj4 = obj1;
        obj1 = obj2;
_L11:
        obj2 = obj;
        s1 = s;
        obj3 = obj4;
        ((IOException) (obj1)).printStackTrace();
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((GZIPInputStream) (obj4)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((ByteArrayInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return abyte1;
        }
        return abyte1;
_L9:
        try
        {
            ((ByteArrayOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            ((GZIPInputStream) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw obj1;
        exception;
        obj1 = s;
        s = ((String) (obj));
        obj = obj1;
        obj3 = obj5;
        obj1 = exception;
        continue; /* Loop/switch isn't completed */
        exception1;
        exception = s;
        s = ((String) (obj));
        obj = exception;
        obj3 = obj1;
        obj1 = exception1;
        if (true) goto _L9; else goto _L8
        obj1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static byte[] decode(byte abyte0[])
        throws IOException
    {
        return decode(abyte0, 0, abyte0.length, 0);
    }

    public static byte[] decode(byte abyte0[], int i, int j, int k)
        throws IOException
    {
        byte abyte1[];
        byte abyte2[];
        byte abyte3[];
        int l;
        int i1;
        int j1;
        if (abyte0 == null)
        {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i < 0 || i + j > abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[] {
                Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
            }));
        }
        if (j == 0)
        {
            return new byte[0];
        }
        if (j < 4)
        {
            throw new IllegalArgumentException((new StringBuilder("Base64-encoded string must have at least four characters, but length specified was ")).append(j).toString());
        }
        abyte2 = getDecodabet(k);
        abyte1 = new byte[(j * 3) / 4];
        i1 = 0;
        abyte3 = new byte[4];
        j1 = i;
        l = 0;
_L5:
        if (j1 < i + j) goto _L2; else goto _L1
_L1:
        abyte0 = new byte[i1];
        System.arraycopy(abyte1, 0, abyte0, 0, i1);
        return abyte0;
_L2:
        int k1;
        k1 = abyte2[abyte0[j1] & 0xff];
        if (k1 < -5)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k1 < -1)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        int l1 = l + 1;
        abyte3[l] = abyte0[j1];
        l = l1;
        k1 = i1;
        if (l1 <= 3)
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = i1 + decode4to3(abyte3, 0, abyte1, i1, k);
        l = 0;
        i1 = k1;
        if (abyte0[j1] == 61) goto _L1; else goto _L3
_L3:
        j1++;
        i1 = k1;
        if (true) goto _L5; else goto _L4
_L4:
        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", new Object[] {
            Integer.valueOf(abyte0[j1] & 0xff), Integer.valueOf(j1)
        }));
        k1 = i1;
          goto _L3
    }

    private static int decode4to3(byte abyte0[], int i, byte abyte1[], int j, int k)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("Source array was null.");
        }
        if (abyte1 == null)
        {
            throw new NullPointerException("Destination array was null.");
        }
        if (i < 0 || i + 3 >= abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[] {
                Integer.valueOf(abyte0.length), Integer.valueOf(i)
            }));
        }
        if (j < 0 || j + 2 >= abyte1.length)
        {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[] {
                Integer.valueOf(abyte1.length), Integer.valueOf(j)
            }));
        }
        byte abyte2[] = getDecodabet(k);
        if (abyte0[i + 2] == 61)
        {
            abyte1[j] = (byte)(((abyte2[abyte0[i]] & 0xff) << 18 | (abyte2[abyte0[i + 1]] & 0xff) << 12) >>> 16);
            return 1;
        }
        if (abyte0[i + 3] == 61)
        {
            i = (abyte2[abyte0[i]] & 0xff) << 18 | (abyte2[abyte0[i + 1]] & 0xff) << 12 | (abyte2[abyte0[i + 2]] & 0xff) << 6;
            abyte1[j] = (byte)(i >>> 16);
            abyte1[j + 1] = (byte)(i >>> 8);
            return 2;
        } else
        {
            i = (abyte2[abyte0[i]] & 0xff) << 18 | (abyte2[abyte0[i + 1]] & 0xff) << 12 | (abyte2[abyte0[i + 2]] & 0xff) << 6 | abyte2[abyte0[i + 3]] & 0xff;
            abyte1[j] = (byte)(i >> 16);
            abyte1[j + 1] = (byte)(i >> 8);
            abyte1[j + 2] = (byte)i;
            return 3;
        }
    }

    public static void decodeFileToFile(String s, String s1)
        throws IOException
    {
        Object obj;
        byte abyte0[];
        abyte0 = decodeFromFile(s);
        s = null;
        obj = null;
        s1 = new BufferedOutputStream(new FileOutputStream(s1));
        s1.write(abyte0);
        try
        {
            s1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s1;
        s = obj;
_L4:
        throw s1;
        s1;
_L2:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s1;
        Object obj1;
        obj1;
        s = s1;
        s1 = ((String) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        s = s1;
        s1 = ((String) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static byte[] decodeFromFile(String s)
        throws IOException
    {
        byte abyte0[];
        Object obj;
        Object obj2;
        obj2 = null;
        obj = null;
        abyte0 = obj2;
        s = new File(s);
        int i;
        i = 0;
        abyte0 = obj2;
        if (s.length() <= 0x7fffffffL) goto _L2; else goto _L1
_L1:
        abyte0 = obj2;
        try
        {
            throw new IOException((new StringBuilder("File is too big for this convenience method (")).append(s.length()).append(" bytes).").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            abyte0 = obj;
        }
        finally { }
_L8:
        throw s;
_L6:
        byte abyte1[];
        int j;
        try
        {
            abyte0.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        throw s;
_L2:
        abyte0 = obj2;
        abyte1 = new byte[(int)s.length()];
        abyte0 = obj2;
        s = new InputStream(new BufferedInputStream(new FileInputStream(s)), 0);
_L4:
        j = s.read(abyte1, i, 4096);
        if (j >= 0)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        abyte0 = new byte[i];
        System.arraycopy(abyte1, 0, abyte0, 0, i);
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return abyte0;
        }
        return abyte0;
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1;
        obj1;
        abyte0 = s;
        s = ((String) (obj1));
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        abyte0 = s;
        s = ((String) (obj1));
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void decodeToFile(String s, String s1)
        throws IOException
    {
        String s2;
        Object obj;
        s2 = null;
        obj = null;
        s1 = new OutputStream(new FileOutputStream(s1), 0);
        s1.write(s.getBytes("US-ASCII"));
        try
        {
            s1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s;
        s2 = obj;
_L4:
        throw s;
        s;
_L2:
        try
        {
            s2.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s;
        s;
        s2 = s1;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        s2 = s1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Object decodeToObject(String s)
        throws IOException, ClassNotFoundException
    {
        return decodeToObject(s, 0, null);
    }

    public static Object decodeToObject(String s, int i, ClassLoader classloader)
        throws IOException, ClassNotFoundException
    {
        Object obj;
        byte abyte0[];
        String s1;
        String s2;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        abyte0 = decode(s, i);
        s = null;
        s2 = null;
        s1 = null;
        obj = null;
        obj3 = null;
        obj5 = null;
        obj4 = null;
        obj1 = null;
        obj2 = null;
        final ByteArrayInputStream final_inputstream = new ByteArrayInputStream(abyte0);
        if (classloader != null) goto _L2; else goto _L1
_L1:
        obj = obj5;
        s1 = obj4;
        s2 = obj1;
        s = new ObjectInputStream(final_inputstream);
_L4:
        obj = s;
        s1 = s;
        s2 = s;
        classloader = ((ClassLoader) (s.readObject()));
        try
        {
            final_inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return classloader;
        }
        return classloader;
_L2:
        obj = obj5;
        s1 = obj4;
        s2 = obj1;
        s = new ObjectInputStream(classloader) {

            private final ClassLoader val$loader;

            public Class resolveClass(ObjectStreamClass objectstreamclass)
                throws IOException, ClassNotFoundException
            {
                Class class2 = Class.forName(objectstreamclass.getName(), false, loader);
                Class class1 = class2;
                if (class2 == null)
                {
                    class1 = super.resolveClass(objectstreamclass);
                }
                return class1;
            }

            
                throws StreamCorruptedException, IOException
            {
                loader = classloader;
                super(final_inputstream);
            }
        };
        if (true) goto _L4; else goto _L3
_L3:
        classloader;
        obj = obj2;
        s = s1;
_L8:
        throw classloader;
        classloader;
_L5:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            ((ObjectInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw classloader;
        classloader;
        obj = obj3;
        s = s2;
_L6:
        throw classloader;
        classloader;
        s = final_inputstream;
          goto _L5
        classloader;
        s = final_inputstream;
        obj = s1;
          goto _L6
        classloader;
        s = final_inputstream;
        obj = s2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void encode(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
    {
        byte abyte0[] = new byte[3];
        byte abyte1[] = new byte[4];
        do
        {
            if (!bytebuffer.hasRemaining())
            {
                return;
            }
            int i = Math.min(3, bytebuffer.remaining());
            bytebuffer.get(abyte0, 0, i);
            encode3to4(abyte1, abyte0, i, 0);
            bytebuffer1.put(abyte1);
        } while (true);
    }

    public static void encode(ByteBuffer bytebuffer, CharBuffer charbuffer)
    {
        byte abyte0[] = new byte[3];
        byte abyte1[] = new byte[4];
        do
        {
            if (!bytebuffer.hasRemaining())
            {
                return;
            }
            int i = Math.min(3, bytebuffer.remaining());
            bytebuffer.get(abyte0, 0, i);
            encode3to4(abyte1, abyte0, i, 0);
            i = 0;
            while (i < 4) 
            {
                charbuffer.put((char)(abyte1[i] & 0xff));
                i++;
            }
        } while (true);
    }

    private static byte[] encode3to4(byte abyte0[], int i, int j, byte abyte1[], int k, int l)
    {
        int j1 = 0;
        byte abyte2[] = getAlphabet(l);
        int i1;
        if (j > 0)
        {
            l = (abyte0[i] << 24) >>> 8;
        } else
        {
            l = 0;
        }
        if (j > 1)
        {
            i1 = (abyte0[i + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (j > 2)
        {
            j1 = (abyte0[i + 2] << 24) >>> 24;
        }
        i = i1 | l | j1;
        switch (j)
        {
        default:
            return abyte1;

        case 3: // '\003'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = abyte2[i & 0x3f];
            return abyte1;

        case 2: // '\002'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = 61;
            return abyte1;

        case 1: // '\001'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = 61;
            abyte1[k + 3] = 61;
            return abyte1;
        }
    }

    private static byte[] encode3to4(byte abyte0[], byte abyte1[], int i, int j)
    {
        encode3to4(abyte1, 0, i, abyte0, 0, j);
        return abyte0;
    }

    public static String encodeBytes(byte abyte0[])
    {
        Object obj = null;
        try
        {
            abyte0 = encodeBytes(abyte0, 0, abyte0.length, 0);
        }
        catch (IOException ioexception)
        {
            abyte0 = obj;
            if (!$assertionsDisabled)
            {
                throw new AssertionError(ioexception.getMessage());
            }
        }
        if (!$assertionsDisabled && abyte0 == null)
        {
            throw new AssertionError();
        } else
        {
            return abyte0;
        }
    }

    public static String encodeBytes(byte abyte0[], int i)
        throws IOException
    {
        return encodeBytes(abyte0, 0, abyte0.length, i);
    }

    public static String encodeBytes(byte abyte0[], int i, int j)
    {
        Object obj = null;
        try
        {
            abyte0 = encodeBytes(abyte0, i, j, 0);
        }
        catch (IOException ioexception)
        {
            abyte0 = obj;
            if (!$assertionsDisabled)
            {
                throw new AssertionError(ioexception.getMessage());
            }
        }
        if (!$assertionsDisabled && abyte0 == null)
        {
            throw new AssertionError();
        } else
        {
            return abyte0;
        }
    }

    public static String encodeBytes(byte abyte0[], int i, int j, int k)
        throws IOException
    {
        abyte0 = encodeBytesToBytes(abyte0, i, j, k);
        String s;
        try
        {
            s = new String(abyte0, "US-ASCII");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return new String(abyte0);
        }
        return s;
    }

    public static byte[] encodeBytesToBytes(byte abyte0[])
    {
        Object obj = null;
        try
        {
            abyte0 = encodeBytesToBytes(abyte0, 0, abyte0.length, 0);
        }
        catch (IOException ioexception)
        {
            abyte0 = obj;
            if (!$assertionsDisabled)
            {
                throw new AssertionError((new StringBuilder("IOExceptions only come from GZipping, which is turned off: ")).append(ioexception.getMessage()).toString());
            }
        }
        return abyte0;
    }

    public static byte[] encodeBytesToBytes(byte abyte0[], int i, int j, int k)
        throws IOException
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot have negative offset: ")).append(i).toString());
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Cannot have length offset: ")).append(j).toString());
        }
        if (i + j > abyte0.length)
        {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(abyte0.length)
            }));
        }
        if ((k & 2) == 0) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        obj1 = null;
        obj8 = null;
        obj3 = null;
        obj5 = null;
        obj4 = null;
        obj2 = null;
        obj7 = null;
        obj6 = null;
        Object obj = new ByteArrayOutputStream();
        int l;
        int i1;
        boolean flag;
        int j1;
        int k1;
        int l1;
        try
        {
            obj1 = new OutputStream(((java.io.OutputStream) (obj)), k | 1);
        }
        catch (IOException ioexception)
        {
            abyte0 = ((byte []) (obj));
            obj = ioexception;
            ioexception = obj6;
            obj3 = obj4;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = obj;
            obj = obj7;
            obj3 = obj5;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
_L3:
            obj2 = new GZIPOutputStream(((java.io.OutputStream) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            abyte0 = ((byte []) (obj));
            obj = obj2;
            obj3 = obj4;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj2 = obj;
            obj = obj1;
            obj1 = obj2;
            obj3 = obj5;
            continue; /* Loop/switch isn't completed */
        }
        ((GZIPOutputStream) (obj2)).write(abyte0, i, j);
        ((GZIPOutputStream) (obj2)).close();
        try
        {
            ((GZIPOutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            ((OutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            ((ByteArrayOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        return ((ByteArrayOutputStream) (obj)).toByteArray();
        obj;
        obj3 = obj4;
        abyte0 = obj8;
        obj1 = obj6;
_L6:
        obj2 = obj1;
        obj1 = abyte0;
        throw obj;
        abyte0;
        obj = obj2;
_L4:
        try
        {
            ((GZIPOutputStream) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2) { }
        try
        {
            ((OutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            ((ByteArrayOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw abyte0;
_L2:
        if ((k & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = j / 3;
        if (j % 3 > 0)
        {
            l = 4;
        } else
        {
            l = 0;
        }
        i1 = i1 * 4 + l;
        l = i1;
        if (flag)
        {
            l = i1 + i1 / 76;
        }
        obj = new byte[l];
        j1 = 0;
        l = 0;
        i1 = 0;
        do
        {
            if (j1 >= j - 2)
            {
                i1 = l;
                if (j1 < j)
                {
                    encode3to4(abyte0, j1 + i, j - j1, ((byte []) (obj)), l, k);
                    i1 = l + 4;
                }
                if (i1 <= obj.length - 1)
                {
                    abyte0 = new byte[i1];
                    System.arraycopy(obj, 0, abyte0, 0, i1);
                    return abyte0;
                } else
                {
                    return ((byte []) (obj));
                }
            }
            encode3to4(abyte0, j1 + i, 3, ((byte []) (obj)), l, k);
            l1 = i1 + 4;
            k1 = l;
            i1 = l1;
            if (flag)
            {
                k1 = l;
                i1 = l1;
                if (l1 >= 76)
                {
                    obj[l + 4] = 10;
                    k1 = l + 1;
                    i1 = 0;
                }
            }
            j1 += 3;
            l = k1 + 4;
        } while (true);
        abyte0;
        obj3 = obj;
        obj = obj1;
        obj1 = obj3;
        obj3 = obj2;
        if (true) goto _L4; else goto _L3
        IOException ioexception1;
        ioexception1;
        abyte0 = ((byte []) (obj));
        obj = ioexception1;
        ioexception1 = ((IOException) (obj2));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void encodeFileToFile(String s, String s1)
        throws IOException
    {
        Object obj;
        String s2;
        s2 = encodeFromFile(s);
        s = null;
        obj = null;
        s1 = new BufferedOutputStream(new FileOutputStream(s1));
        s1.write(s2.getBytes("US-ASCII"));
        try
        {
            s1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        s1;
        s = obj;
_L4:
        throw s1;
        s1;
_L2:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s1;
        Object obj1;
        obj1;
        s = s1;
        s1 = ((String) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        s = s1;
        s1 = ((String) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String encodeFromFile(String s)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj3 = null;
        obj1 = null;
        obj = obj3;
        s = new File(s);
        obj = obj3;
        byte abyte0[] = new byte[Math.max((int)((double)s.length() * 1.3999999999999999D + 1.0D), 40)];
        int i;
        i = 0;
        obj = obj3;
        s = new InputStream(new BufferedInputStream(new FileInputStream(s)), 1);
_L2:
        int j = s.read(abyte0, i, 4096);
        if (j >= 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        obj = new String(abyte0, 0, i, "US-ASCII");
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return ((String) (obj));
        }
        return ((String) (obj));
        i += j;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        obj = obj1;
_L6:
        throw s;
        s;
_L4:
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw s;
        Object obj2;
        obj2;
        obj = s;
        s = ((String) (obj2));
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj = s;
        s = ((String) (obj2));
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String encodeObject(Serializable serializable)
        throws IOException
    {
        return encodeObject(serializable, 0);
    }

    public static String encodeObject(Serializable serializable, int i)
        throws IOException
    {
        Object obj2;
        Object obj3;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        if (serializable == null)
        {
            throw new NullPointerException("Cannot serialize a null object.");
        }
        obj5 = null;
        obj13 = null;
        obj3 = null;
        obj15 = null;
        obj8 = null;
        obj2 = null;
        obj6 = null;
        obj12 = null;
        obj18 = null;
        obj16 = null;
        obj11 = null;
        obj7 = null;
        obj10 = null;
        obj17 = null;
        obj14 = null;
        obj9 = null;
        Object obj = new ByteArrayOutputStream();
        Object obj1;
        try
        {
            obj1 = new OutputStream(((java.io.OutputStream) (obj)), i | 1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            serializable = ((Serializable) (obj));
            obj = obj8;
            obj7 = obj9;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            serializable = obj15;
            obj1 = obj12;
            obj7 = obj10;
            continue; /* Loop/switch isn't completed */
        }
        if ((i & 2) == 0) goto _L2; else goto _L1
_L1:
        obj5 = obj18;
        obj6 = obj17;
        obj7 = obj16;
        obj8 = obj14;
        Object obj4;
        try
        {
            obj2 = new GZIPOutputStream(((java.io.OutputStream) (obj1)));
        }
        catch (IOException ioexception)
        {
            serializable = ((Serializable) (obj));
            obj = obj1;
            obj1 = ioexception;
            ioexception = ((IOException) (obj7));
            obj7 = obj8;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            serializable = ((Serializable) (obj1));
            obj1 = obj5;
            obj7 = obj6;
            continue; /* Loop/switch isn't completed */
        }
        obj3 = new ObjectOutputStream(((java.io.OutputStream) (obj2)));
_L4:
        obj5 = obj2;
        obj6 = obj3;
        obj7 = obj2;
        obj8 = obj3;
        ((ObjectOutputStream) (obj3)).writeObject(serializable);
        try
        {
            ((ObjectOutputStream) (obj3)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        try
        {
            ((GZIPOutputStream) (obj2)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        try
        {
            ((java.io.OutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        try
        {
            ((ByteArrayOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        try
        {
            serializable = new String(((ByteArrayOutputStream) (obj)).toByteArray(), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable)
        {
            return new String(((ByteArrayOutputStream) (obj)).toByteArray());
        }
        return serializable;
_L2:
        obj5 = obj18;
        obj6 = obj17;
        obj7 = obj16;
        obj8 = obj14;
        obj3 = new ObjectOutputStream(((java.io.OutputStream) (obj1)));
        obj2 = obj11;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        obj7 = obj9;
        serializable = obj13;
        obj = obj8;
_L8:
        obj3 = obj;
        obj5 = serializable;
        obj6 = obj2;
        throw obj1;
        obj2;
        obj1 = obj6;
        obj = obj5;
        serializable = ((Serializable) (obj3));
_L6:
        try
        {
            ((ObjectOutputStream) (obj7)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4) { }
        try
        {
            ((GZIPOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        try
        {
            serializable.close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        try
        {
            ((ByteArrayOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Serializable serializable) { }
        throw obj2;
        obj4;
        serializable = ((Serializable) (obj1));
        obj1 = obj2;
        obj7 = obj10;
        obj2 = obj4;
        if (true) goto _L6; else goto _L5
_L5:
        break MISSING_BLOCK_LABEL_83;
        IOException ioexception1;
        ioexception1;
        serializable = ((Serializable) (obj));
        obj = obj1;
        obj1 = ioexception1;
        obj7 = obj9;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void encodeToFile(byte abyte0[], String s)
        throws IOException
    {
        String s1;
        Object obj;
        if (abyte0 == null)
        {
            throw new NullPointerException("Data to encode was null.");
        }
        s1 = null;
        obj = null;
        s = new OutputStream(new FileOutputStream(s), 1);
        s.write(abyte0);
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return;
        }
        abyte0;
        s1 = obj;
_L4:
        throw abyte0;
        abyte0;
_L2:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw abyte0;
        abyte0;
        s1 = s;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        s1 = s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static final byte[] getAlphabet(int i)
    {
        if ((i & 0x10) == 16)
        {
            return _URL_SAFE_ALPHABET;
        }
        if ((i & 0x20) == 32)
        {
            return _ORDERED_ALPHABET;
        } else
        {
            return _STANDARD_ALPHABET;
        }
    }

    private static final byte[] getDecodabet(int i)
    {
        if ((i & 0x10) == 16)
        {
            return _URL_SAFE_DECODABET;
        }
        if ((i & 0x20) == 32)
        {
            return _ORDERED_DECODABET;
        } else
        {
            return _STANDARD_DECODABET;
        }
    }

    static 
    {
        byte abyte0[];
        boolean flag;
        if (!com/mixpanel/android/java_websocket/util/Base64.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        abyte0 = new byte[256];
        abyte0[0] = -9;
        abyte0[1] = -9;
        abyte0[2] = -9;
        abyte0[3] = -9;
        abyte0[4] = -9;
        abyte0[5] = -9;
        abyte0[6] = -9;
        abyte0[7] = -9;
        abyte0[8] = -9;
        abyte0[9] = -5;
        abyte0[10] = -5;
        abyte0[11] = -9;
        abyte0[12] = -9;
        abyte0[13] = -5;
        abyte0[14] = -9;
        abyte0[15] = -9;
        abyte0[16] = -9;
        abyte0[17] = -9;
        abyte0[18] = -9;
        abyte0[19] = -9;
        abyte0[20] = -9;
        abyte0[21] = -9;
        abyte0[22] = -9;
        abyte0[23] = -9;
        abyte0[24] = -9;
        abyte0[25] = -9;
        abyte0[26] = -9;
        abyte0[27] = -9;
        abyte0[28] = -9;
        abyte0[29] = -9;
        abyte0[30] = -9;
        abyte0[31] = -9;
        abyte0[32] = -5;
        abyte0[33] = -9;
        abyte0[34] = -9;
        abyte0[35] = -9;
        abyte0[36] = -9;
        abyte0[37] = -9;
        abyte0[38] = -9;
        abyte0[39] = -9;
        abyte0[40] = -9;
        abyte0[41] = -9;
        abyte0[42] = -9;
        abyte0[43] = 62;
        abyte0[44] = -9;
        abyte0[45] = -9;
        abyte0[46] = -9;
        abyte0[47] = 63;
        abyte0[48] = 52;
        abyte0[49] = 53;
        abyte0[50] = 54;
        abyte0[51] = 55;
        abyte0[52] = 56;
        abyte0[53] = 57;
        abyte0[54] = 58;
        abyte0[55] = 59;
        abyte0[56] = 60;
        abyte0[57] = 61;
        abyte0[58] = -9;
        abyte0[59] = -9;
        abyte0[60] = -9;
        abyte0[61] = -1;
        abyte0[62] = -9;
        abyte0[63] = -9;
        abyte0[64] = -9;
        abyte0[66] = 1;
        abyte0[67] = 2;
        abyte0[68] = 3;
        abyte0[69] = 4;
        abyte0[70] = 5;
        abyte0[71] = 6;
        abyte0[72] = 7;
        abyte0[73] = 8;
        abyte0[74] = 9;
        abyte0[75] = 10;
        abyte0[76] = 11;
        abyte0[77] = 12;
        abyte0[78] = 13;
        abyte0[79] = 14;
        abyte0[80] = 15;
        abyte0[81] = 16;
        abyte0[82] = 17;
        abyte0[83] = 18;
        abyte0[84] = 19;
        abyte0[85] = 20;
        abyte0[86] = 21;
        abyte0[87] = 22;
        abyte0[88] = 23;
        abyte0[89] = 24;
        abyte0[90] = 25;
        abyte0[91] = -9;
        abyte0[92] = -9;
        abyte0[93] = -9;
        abyte0[94] = -9;
        abyte0[95] = -9;
        abyte0[96] = -9;
        abyte0[97] = 26;
        abyte0[98] = 27;
        abyte0[99] = 28;
        abyte0[100] = 29;
        abyte0[101] = 30;
        abyte0[102] = 31;
        abyte0[103] = 32;
        abyte0[104] = 33;
        abyte0[105] = 34;
        abyte0[106] = 35;
        abyte0[107] = 36;
        abyte0[108] = 37;
        abyte0[109] = 38;
        abyte0[110] = 39;
        abyte0[111] = 40;
        abyte0[112] = 41;
        abyte0[113] = 42;
        abyte0[114] = 43;
        abyte0[115] = 44;
        abyte0[116] = 45;
        abyte0[117] = 46;
        abyte0[118] = 47;
        abyte0[119] = 48;
        abyte0[120] = 49;
        abyte0[121] = 50;
        abyte0[122] = 51;
        abyte0[123] = -9;
        abyte0[124] = -9;
        abyte0[125] = -9;
        abyte0[126] = -9;
        abyte0[127] = -9;
        abyte0[128] = -9;
        abyte0[129] = -9;
        abyte0[130] = -9;
        abyte0[131] = -9;
        abyte0[132] = -9;
        abyte0[133] = -9;
        abyte0[134] = -9;
        abyte0[135] = -9;
        abyte0[136] = -9;
        abyte0[137] = -9;
        abyte0[138] = -9;
        abyte0[139] = -9;
        abyte0[140] = -9;
        abyte0[141] = -9;
        abyte0[142] = -9;
        abyte0[143] = -9;
        abyte0[144] = -9;
        abyte0[145] = -9;
        abyte0[146] = -9;
        abyte0[147] = -9;
        abyte0[148] = -9;
        abyte0[149] = -9;
        abyte0[150] = -9;
        abyte0[151] = -9;
        abyte0[152] = -9;
        abyte0[153] = -9;
        abyte0[154] = -9;
        abyte0[155] = -9;
        abyte0[156] = -9;
        abyte0[157] = -9;
        abyte0[158] = -9;
        abyte0[159] = -9;
        abyte0[160] = -9;
        abyte0[161] = -9;
        abyte0[162] = -9;
        abyte0[163] = -9;
        abyte0[164] = -9;
        abyte0[165] = -9;
        abyte0[166] = -9;
        abyte0[167] = -9;
        abyte0[168] = -9;
        abyte0[169] = -9;
        abyte0[170] = -9;
        abyte0[171] = -9;
        abyte0[172] = -9;
        abyte0[173] = -9;
        abyte0[174] = -9;
        abyte0[175] = -9;
        abyte0[176] = -9;
        abyte0[177] = -9;
        abyte0[178] = -9;
        abyte0[179] = -9;
        abyte0[180] = -9;
        abyte0[181] = -9;
        abyte0[182] = -9;
        abyte0[183] = -9;
        abyte0[184] = -9;
        abyte0[185] = -9;
        abyte0[186] = -9;
        abyte0[187] = -9;
        abyte0[188] = -9;
        abyte0[189] = -9;
        abyte0[190] = -9;
        abyte0[191] = -9;
        abyte0[192] = -9;
        abyte0[193] = -9;
        abyte0[194] = -9;
        abyte0[195] = -9;
        abyte0[196] = -9;
        abyte0[197] = -9;
        abyte0[198] = -9;
        abyte0[199] = -9;
        abyte0[200] = -9;
        abyte0[201] = -9;
        abyte0[202] = -9;
        abyte0[203] = -9;
        abyte0[204] = -9;
        abyte0[205] = -9;
        abyte0[206] = -9;
        abyte0[207] = -9;
        abyte0[208] = -9;
        abyte0[209] = -9;
        abyte0[210] = -9;
        abyte0[211] = -9;
        abyte0[212] = -9;
        abyte0[213] = -9;
        abyte0[214] = -9;
        abyte0[215] = -9;
        abyte0[216] = -9;
        abyte0[217] = -9;
        abyte0[218] = -9;
        abyte0[219] = -9;
        abyte0[220] = -9;
        abyte0[221] = -9;
        abyte0[222] = -9;
        abyte0[223] = -9;
        abyte0[224] = -9;
        abyte0[225] = -9;
        abyte0[226] = -9;
        abyte0[227] = -9;
        abyte0[228] = -9;
        abyte0[229] = -9;
        abyte0[230] = -9;
        abyte0[231] = -9;
        abyte0[232] = -9;
        abyte0[233] = -9;
        abyte0[234] = -9;
        abyte0[235] = -9;
        abyte0[236] = -9;
        abyte0[237] = -9;
        abyte0[238] = -9;
        abyte0[239] = -9;
        abyte0[240] = -9;
        abyte0[241] = -9;
        abyte0[242] = -9;
        abyte0[243] = -9;
        abyte0[244] = -9;
        abyte0[245] = -9;
        abyte0[246] = -9;
        abyte0[247] = -9;
        abyte0[248] = -9;
        abyte0[249] = -9;
        abyte0[250] = -9;
        abyte0[251] = -9;
        abyte0[252] = -9;
        abyte0[253] = -9;
        abyte0[254] = -9;
        abyte0[255] = -9;
        _STANDARD_DECODABET = abyte0;
        abyte0 = new byte[256];
        abyte0[0] = -9;
        abyte0[1] = -9;
        abyte0[2] = -9;
        abyte0[3] = -9;
        abyte0[4] = -9;
        abyte0[5] = -9;
        abyte0[6] = -9;
        abyte0[7] = -9;
        abyte0[8] = -9;
        abyte0[9] = -5;
        abyte0[10] = -5;
        abyte0[11] = -9;
        abyte0[12] = -9;
        abyte0[13] = -5;
        abyte0[14] = -9;
        abyte0[15] = -9;
        abyte0[16] = -9;
        abyte0[17] = -9;
        abyte0[18] = -9;
        abyte0[19] = -9;
        abyte0[20] = -9;
        abyte0[21] = -9;
        abyte0[22] = -9;
        abyte0[23] = -9;
        abyte0[24] = -9;
        abyte0[25] = -9;
        abyte0[26] = -9;
        abyte0[27] = -9;
        abyte0[28] = -9;
        abyte0[29] = -9;
        abyte0[30] = -9;
        abyte0[31] = -9;
        abyte0[32] = -5;
        abyte0[33] = -9;
        abyte0[34] = -9;
        abyte0[35] = -9;
        abyte0[36] = -9;
        abyte0[37] = -9;
        abyte0[38] = -9;
        abyte0[39] = -9;
        abyte0[40] = -9;
        abyte0[41] = -9;
        abyte0[42] = -9;
        abyte0[43] = -9;
        abyte0[44] = -9;
        abyte0[45] = 62;
        abyte0[46] = -9;
        abyte0[47] = -9;
        abyte0[48] = 52;
        abyte0[49] = 53;
        abyte0[50] = 54;
        abyte0[51] = 55;
        abyte0[52] = 56;
        abyte0[53] = 57;
        abyte0[54] = 58;
        abyte0[55] = 59;
        abyte0[56] = 60;
        abyte0[57] = 61;
        abyte0[58] = -9;
        abyte0[59] = -9;
        abyte0[60] = -9;
        abyte0[61] = -1;
        abyte0[62] = -9;
        abyte0[63] = -9;
        abyte0[64] = -9;
        abyte0[66] = 1;
        abyte0[67] = 2;
        abyte0[68] = 3;
        abyte0[69] = 4;
        abyte0[70] = 5;
        abyte0[71] = 6;
        abyte0[72] = 7;
        abyte0[73] = 8;
        abyte0[74] = 9;
        abyte0[75] = 10;
        abyte0[76] = 11;
        abyte0[77] = 12;
        abyte0[78] = 13;
        abyte0[79] = 14;
        abyte0[80] = 15;
        abyte0[81] = 16;
        abyte0[82] = 17;
        abyte0[83] = 18;
        abyte0[84] = 19;
        abyte0[85] = 20;
        abyte0[86] = 21;
        abyte0[87] = 22;
        abyte0[88] = 23;
        abyte0[89] = 24;
        abyte0[90] = 25;
        abyte0[91] = -9;
        abyte0[92] = -9;
        abyte0[93] = -9;
        abyte0[94] = -9;
        abyte0[95] = 63;
        abyte0[96] = -9;
        abyte0[97] = 26;
        abyte0[98] = 27;
        abyte0[99] = 28;
        abyte0[100] = 29;
        abyte0[101] = 30;
        abyte0[102] = 31;
        abyte0[103] = 32;
        abyte0[104] = 33;
        abyte0[105] = 34;
        abyte0[106] = 35;
        abyte0[107] = 36;
        abyte0[108] = 37;
        abyte0[109] = 38;
        abyte0[110] = 39;
        abyte0[111] = 40;
        abyte0[112] = 41;
        abyte0[113] = 42;
        abyte0[114] = 43;
        abyte0[115] = 44;
        abyte0[116] = 45;
        abyte0[117] = 46;
        abyte0[118] = 47;
        abyte0[119] = 48;
        abyte0[120] = 49;
        abyte0[121] = 50;
        abyte0[122] = 51;
        abyte0[123] = -9;
        abyte0[124] = -9;
        abyte0[125] = -9;
        abyte0[126] = -9;
        abyte0[127] = -9;
        abyte0[128] = -9;
        abyte0[129] = -9;
        abyte0[130] = -9;
        abyte0[131] = -9;
        abyte0[132] = -9;
        abyte0[133] = -9;
        abyte0[134] = -9;
        abyte0[135] = -9;
        abyte0[136] = -9;
        abyte0[137] = -9;
        abyte0[138] = -9;
        abyte0[139] = -9;
        abyte0[140] = -9;
        abyte0[141] = -9;
        abyte0[142] = -9;
        abyte0[143] = -9;
        abyte0[144] = -9;
        abyte0[145] = -9;
        abyte0[146] = -9;
        abyte0[147] = -9;
        abyte0[148] = -9;
        abyte0[149] = -9;
        abyte0[150] = -9;
        abyte0[151] = -9;
        abyte0[152] = -9;
        abyte0[153] = -9;
        abyte0[154] = -9;
        abyte0[155] = -9;
        abyte0[156] = -9;
        abyte0[157] = -9;
        abyte0[158] = -9;
        abyte0[159] = -9;
        abyte0[160] = -9;
        abyte0[161] = -9;
        abyte0[162] = -9;
        abyte0[163] = -9;
        abyte0[164] = -9;
        abyte0[165] = -9;
        abyte0[166] = -9;
        abyte0[167] = -9;
        abyte0[168] = -9;
        abyte0[169] = -9;
        abyte0[170] = -9;
        abyte0[171] = -9;
        abyte0[172] = -9;
        abyte0[173] = -9;
        abyte0[174] = -9;
        abyte0[175] = -9;
        abyte0[176] = -9;
        abyte0[177] = -9;
        abyte0[178] = -9;
        abyte0[179] = -9;
        abyte0[180] = -9;
        abyte0[181] = -9;
        abyte0[182] = -9;
        abyte0[183] = -9;
        abyte0[184] = -9;
        abyte0[185] = -9;
        abyte0[186] = -9;
        abyte0[187] = -9;
        abyte0[188] = -9;
        abyte0[189] = -9;
        abyte0[190] = -9;
        abyte0[191] = -9;
        abyte0[192] = -9;
        abyte0[193] = -9;
        abyte0[194] = -9;
        abyte0[195] = -9;
        abyte0[196] = -9;
        abyte0[197] = -9;
        abyte0[198] = -9;
        abyte0[199] = -9;
        abyte0[200] = -9;
        abyte0[201] = -9;
        abyte0[202] = -9;
        abyte0[203] = -9;
        abyte0[204] = -9;
        abyte0[205] = -9;
        abyte0[206] = -9;
        abyte0[207] = -9;
        abyte0[208] = -9;
        abyte0[209] = -9;
        abyte0[210] = -9;
        abyte0[211] = -9;
        abyte0[212] = -9;
        abyte0[213] = -9;
        abyte0[214] = -9;
        abyte0[215] = -9;
        abyte0[216] = -9;
        abyte0[217] = -9;
        abyte0[218] = -9;
        abyte0[219] = -9;
        abyte0[220] = -9;
        abyte0[221] = -9;
        abyte0[222] = -9;
        abyte0[223] = -9;
        abyte0[224] = -9;
        abyte0[225] = -9;
        abyte0[226] = -9;
        abyte0[227] = -9;
        abyte0[228] = -9;
        abyte0[229] = -9;
        abyte0[230] = -9;
        abyte0[231] = -9;
        abyte0[232] = -9;
        abyte0[233] = -9;
        abyte0[234] = -9;
        abyte0[235] = -9;
        abyte0[236] = -9;
        abyte0[237] = -9;
        abyte0[238] = -9;
        abyte0[239] = -9;
        abyte0[240] = -9;
        abyte0[241] = -9;
        abyte0[242] = -9;
        abyte0[243] = -9;
        abyte0[244] = -9;
        abyte0[245] = -9;
        abyte0[246] = -9;
        abyte0[247] = -9;
        abyte0[248] = -9;
        abyte0[249] = -9;
        abyte0[250] = -9;
        abyte0[251] = -9;
        abyte0[252] = -9;
        abyte0[253] = -9;
        abyte0[254] = -9;
        abyte0[255] = -9;
        _URL_SAFE_DECODABET = abyte0;
        abyte0 = new byte[257];
        abyte0[0] = -9;
        abyte0[1] = -9;
        abyte0[2] = -9;
        abyte0[3] = -9;
        abyte0[4] = -9;
        abyte0[5] = -9;
        abyte0[6] = -9;
        abyte0[7] = -9;
        abyte0[8] = -9;
        abyte0[9] = -5;
        abyte0[10] = -5;
        abyte0[11] = -9;
        abyte0[12] = -9;
        abyte0[13] = -5;
        abyte0[14] = -9;
        abyte0[15] = -9;
        abyte0[16] = -9;
        abyte0[17] = -9;
        abyte0[18] = -9;
        abyte0[19] = -9;
        abyte0[20] = -9;
        abyte0[21] = -9;
        abyte0[22] = -9;
        abyte0[23] = -9;
        abyte0[24] = -9;
        abyte0[25] = -9;
        abyte0[26] = -9;
        abyte0[27] = -9;
        abyte0[28] = -9;
        abyte0[29] = -9;
        abyte0[30] = -9;
        abyte0[31] = -9;
        abyte0[32] = -5;
        abyte0[33] = -9;
        abyte0[34] = -9;
        abyte0[35] = -9;
        abyte0[36] = -9;
        abyte0[37] = -9;
        abyte0[38] = -9;
        abyte0[39] = -9;
        abyte0[40] = -9;
        abyte0[41] = -9;
        abyte0[42] = -9;
        abyte0[43] = -9;
        abyte0[44] = -9;
        abyte0[46] = -9;
        abyte0[47] = -9;
        abyte0[48] = 1;
        abyte0[49] = 2;
        abyte0[50] = 3;
        abyte0[51] = 4;
        abyte0[52] = 5;
        abyte0[53] = 6;
        abyte0[54] = 7;
        abyte0[55] = 8;
        abyte0[56] = 9;
        abyte0[57] = 10;
        abyte0[58] = -9;
        abyte0[59] = -9;
        abyte0[60] = -9;
        abyte0[61] = -1;
        abyte0[62] = -9;
        abyte0[63] = -9;
        abyte0[64] = -9;
        abyte0[65] = 11;
        abyte0[66] = 12;
        abyte0[67] = 13;
        abyte0[68] = 14;
        abyte0[69] = 15;
        abyte0[70] = 16;
        abyte0[71] = 17;
        abyte0[72] = 18;
        abyte0[73] = 19;
        abyte0[74] = 20;
        abyte0[75] = 21;
        abyte0[76] = 22;
        abyte0[77] = 23;
        abyte0[78] = 24;
        abyte0[79] = 25;
        abyte0[80] = 26;
        abyte0[81] = 27;
        abyte0[82] = 28;
        abyte0[83] = 29;
        abyte0[84] = 30;
        abyte0[85] = 31;
        abyte0[86] = 32;
        abyte0[87] = 33;
        abyte0[88] = 34;
        abyte0[89] = 35;
        abyte0[90] = 36;
        abyte0[91] = -9;
        abyte0[92] = -9;
        abyte0[93] = -9;
        abyte0[94] = -9;
        abyte0[95] = 37;
        abyte0[96] = -9;
        abyte0[97] = 38;
        abyte0[98] = 39;
        abyte0[99] = 40;
        abyte0[100] = 41;
        abyte0[101] = 42;
        abyte0[102] = 43;
        abyte0[103] = 44;
        abyte0[104] = 45;
        abyte0[105] = 46;
        abyte0[106] = 47;
        abyte0[107] = 48;
        abyte0[108] = 49;
        abyte0[109] = 50;
        abyte0[110] = 51;
        abyte0[111] = 52;
        abyte0[112] = 53;
        abyte0[113] = 54;
        abyte0[114] = 55;
        abyte0[115] = 56;
        abyte0[116] = 57;
        abyte0[117] = 58;
        abyte0[118] = 59;
        abyte0[119] = 60;
        abyte0[120] = 61;
        abyte0[121] = 62;
        abyte0[122] = 63;
        abyte0[123] = -9;
        abyte0[124] = -9;
        abyte0[125] = -9;
        abyte0[126] = -9;
        abyte0[127] = -9;
        abyte0[128] = -9;
        abyte0[129] = -9;
        abyte0[130] = -9;
        abyte0[131] = -9;
        abyte0[132] = -9;
        abyte0[133] = -9;
        abyte0[134] = -9;
        abyte0[135] = -9;
        abyte0[136] = -9;
        abyte0[137] = -9;
        abyte0[138] = -9;
        abyte0[139] = -9;
        abyte0[140] = -9;
        abyte0[141] = -9;
        abyte0[142] = -9;
        abyte0[143] = -9;
        abyte0[144] = -9;
        abyte0[145] = -9;
        abyte0[146] = -9;
        abyte0[147] = -9;
        abyte0[148] = -9;
        abyte0[149] = -9;
        abyte0[150] = -9;
        abyte0[151] = -9;
        abyte0[152] = -9;
        abyte0[153] = -9;
        abyte0[154] = -9;
        abyte0[155] = -9;
        abyte0[156] = -9;
        abyte0[157] = -9;
        abyte0[158] = -9;
        abyte0[159] = -9;
        abyte0[160] = -9;
        abyte0[161] = -9;
        abyte0[162] = -9;
        abyte0[163] = -9;
        abyte0[164] = -9;
        abyte0[165] = -9;
        abyte0[166] = -9;
        abyte0[167] = -9;
        abyte0[168] = -9;
        abyte0[169] = -9;
        abyte0[170] = -9;
        abyte0[171] = -9;
        abyte0[172] = -9;
        abyte0[173] = -9;
        abyte0[174] = -9;
        abyte0[175] = -9;
        abyte0[176] = -9;
        abyte0[177] = -9;
        abyte0[178] = -9;
        abyte0[179] = -9;
        abyte0[180] = -9;
        abyte0[181] = -9;
        abyte0[182] = -9;
        abyte0[183] = -9;
        abyte0[184] = -9;
        abyte0[185] = -9;
        abyte0[186] = -9;
        abyte0[187] = -9;
        abyte0[188] = -9;
        abyte0[189] = -9;
        abyte0[190] = -9;
        abyte0[191] = -9;
        abyte0[192] = -9;
        abyte0[193] = -9;
        abyte0[194] = -9;
        abyte0[195] = -9;
        abyte0[196] = -9;
        abyte0[197] = -9;
        abyte0[198] = -9;
        abyte0[199] = -9;
        abyte0[200] = -9;
        abyte0[201] = -9;
        abyte0[202] = -9;
        abyte0[203] = -9;
        abyte0[204] = -9;
        abyte0[205] = -9;
        abyte0[206] = -9;
        abyte0[207] = -9;
        abyte0[208] = -9;
        abyte0[209] = -9;
        abyte0[210] = -9;
        abyte0[211] = -9;
        abyte0[212] = -9;
        abyte0[213] = -9;
        abyte0[214] = -9;
        abyte0[215] = -9;
        abyte0[216] = -9;
        abyte0[217] = -9;
        abyte0[218] = -9;
        abyte0[219] = -9;
        abyte0[220] = -9;
        abyte0[221] = -9;
        abyte0[222] = -9;
        abyte0[223] = -9;
        abyte0[224] = -9;
        abyte0[225] = -9;
        abyte0[226] = -9;
        abyte0[227] = -9;
        abyte0[228] = -9;
        abyte0[229] = -9;
        abyte0[230] = -9;
        abyte0[231] = -9;
        abyte0[232] = -9;
        abyte0[233] = -9;
        abyte0[234] = -9;
        abyte0[235] = -9;
        abyte0[236] = -9;
        abyte0[237] = -9;
        abyte0[238] = -9;
        abyte0[239] = -9;
        abyte0[240] = -9;
        abyte0[241] = -9;
        abyte0[242] = -9;
        abyte0[243] = -9;
        abyte0[244] = -9;
        abyte0[245] = -9;
        abyte0[246] = -9;
        abyte0[247] = -9;
        abyte0[248] = -9;
        abyte0[249] = -9;
        abyte0[250] = -9;
        abyte0[251] = -9;
        abyte0[252] = -9;
        abyte0[253] = -9;
        abyte0[254] = -9;
        abyte0[255] = -9;
        abyte0[256] = -9;
        _ORDERED_DECODABET = abyte0;
    }




}
