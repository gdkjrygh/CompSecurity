// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.whatsapp.messaging:
//            h

final class b0 extends FilterInputStream
{

    private static final String z[];
    private int a;
    private boolean b;

    public b0(InputStream inputstream)
    {
        super(inputstream);
        if (inputstream == null)
        {
            throw new NullPointerException(z[11]);
        } else
        {
            return;
        }
    }

    public int available()
    {
        return 0;
    }

    public void mark(int i)
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean markSupported()
    {
        return false;
    }

    public int read()
    {
        Object obj;
        byte abyte0[];
        int i;
        i = h.a;
        obj = ByteBuffer.allocate(1024);
        abyte0 = ((ByteBuffer) (obj)).array();
_L2:
        int j;
        j = super.read();
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int k;
        if (b)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((ByteBuffer) (obj)).remaining();
        if (k == 0)
        {
            try
            {
                throw new IOException(z[8]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        break MISSING_BLOCK_LABEL_67;
        obj;
        throw obj;
        ((ByteBuffer) (obj)).put((byte)j);
        if (((ByteBuffer) (obj)).position() < 2 || abyte0[((ByteBuffer) (obj)).position() - 1] != 10 || abyte0[((ByteBuffer) (obj)).position() - 2] != 13) goto _L2; else goto _L1
_L1:
label0:
        {
            String s;
            String as[];
            String s2;
            boolean flag;
            try
            {
                if (((ByteBuffer) (obj)).position() != 2)
                {
                    break label0;
                }
                b = true;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_250;
            }
        }
        as = (new String(abyte0, 0, ((ByteBuffer) (obj)).position() - 2, z[5])).split(":", 2);
        if (as.length != 2)
        {
            break MISSING_BLOCK_LABEL_250;
        }
        s = as[0].trim();
        s2 = as[1].trim();
        if (!s.equalsIgnoreCase(z[9]))
        {
            break MISSING_BLOCK_LABEL_250;
        }
        flag = s2.equalsIgnoreCase(z[6]);
        if (!flag)
        {
            try
            {
                throw new IOException((new StringBuilder()).append(z[3]).append(s2).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        break MISSING_BLOCK_LABEL_250;
        obj;
        throw obj;
        ((ByteBuffer) (obj)).clear();
        if (i == 0) goto _L2; else goto _L3
_L3:
label1:
        {
            try
            {
                if (a <= 0)
                {
                    break label1;
                }
                a = a - 1;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return j;
        }
        try
        {
            if (((ByteBuffer) (obj)).remaining() == 0)
            {
                throw new IOException(z[2]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        ((ByteBuffer) (obj)).put((byte)j);
        if (((ByteBuffer) (obj)).position() < 2 || abyte0[((ByteBuffer) (obj)).position() - 1] != 10 || abyte0[((ByteBuffer) (obj)).position() - 2] != 13) goto _L2; else goto _L4
_L4:
        if (((ByteBuffer) (obj)).position() > 2)
        {
            String s1 = new String(abyte0, 0, ((ByteBuffer) (obj)).position() - 2, z[4]);
            try
            {
                a = Integer.parseInt(s1, 16);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IOException((new StringBuilder()).append(z[0]).append(s1).append(z[10]).toString());
            }
            if (a == 0)
            {
                if (super.read() == -1)
                {
                    try
                    {
                        throw new IOException(z[1]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                }
                if (super.read() == -1)
                {
                    try
                    {
                        throw new IOException(z[7]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw obj;
                    }
                } else
                {
                    return -1;
                }
            }
        }
        ((ByteBuffer) (obj)).clear();
        if (i == 0) goto _L2; else goto _L5
_L5:
        return -1;
    }

    public int read(byte abyte0[], int i, int j)
    {
        int i1 = h.a;
        int k = 0;
        do
        {
            int l;
label0:
            {
                l = j;
                if (k < j)
                {
                    l = read();
                    if (l != -1)
                    {
                        break label0;
                    }
                    l = k;
                }
                return l;
            }
            abyte0[i + k] = (byte)l;
            k++;
            if (i1 != 0)
            {
                return j;
            }
        } while (true);
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        throw new UnsupportedOperationException();
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long skip(long l)
    {
        int i = h.a;
        long l1 = 0L;
        do
        {
label0:
            {
                long l2 = l;
                if (l1 < l)
                {
                    if (read() != -1)
                    {
                        break label0;
                    }
                    l2 = l1;
                }
                return l2;
            }
            l1++;
            if (i != 0)
            {
                return l;
            }
        } while (true);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = ",:'tUo>7tY;:r";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "<& \177_\"r7tZ*6r\177_=>+:Z: ;tYo\"3hM*r4sP.>ryV:<9";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",= hK?&rjM*'6u\036'&&j\036&<\"oJo\t?{Fo1:oP$r:\177_+7 :R*<5nVo7*y[*67~c";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\032<7bN*1&:J=3<iX* r\177P,=6sP(r7t] '<n[=76 \036";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\032\006\0247\006";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\032\006\0247\006";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ",:'tU*6";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "<& \177_\"r7tZ*6r\177_=>+:Z: ;tYo\"3hM*r4sP.>ryV:<9";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = ",= hK?&rjM*'6u\036'&&j\036&<\"oJo\t?{Fo:&nNo:7{Z* rv[!5&r\036**1\177[+76G";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\033 3tM)7 7{!1=~W!5";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "o43sR*6rnQo\"3hM*";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "&<rw_6r<uJo07:P:>>";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 62;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 79;
          goto _L9
_L5:
        byte1 = 82;
          goto _L9
_L6:
        byte1 = 82;
          goto _L9
        byte1 = 26;
          goto _L9
    }
}
