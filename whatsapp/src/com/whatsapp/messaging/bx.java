// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.UnsupportedCharsetException;

// Referenced classes of package com.whatsapp.messaging:
//            h

final class bx extends FilterOutputStream
{

    private static final String z[];
    private boolean a;
    private final ByteBuffer b;

    public bx(OutputStream outputstream)
    {
        super(outputstream);
        if (outputstream == null)
        {
            throw new NullPointerException(z[5]);
        } else
        {
            b = ByteBuffer.allocate(8192);
            return;
        }
    }

    private void a()
    {
        super.out.write(z[2].getBytes(z[3]));
        a = true;
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = null;
        flush();
        out.write(z[1].getBytes(z[0]));
_L4:
        super.close();
        Object obj1 = obj;
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        Thread.currentThread().stop(((Throwable) (obj1)));
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw new Error(((Throwable) (obj)));
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Throwable throwable;
        throwable;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = throwable;
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void flush()
    {
        this;
        JVM INSTR monitorenter ;
        if (!a)
        {
            a();
        }
        if (b.position() > 0)
        {
            out.write(Integer.toHexString(b.position()).getBytes(z[4]));
            out.write(13);
            out.write(10);
            out.write(b.array(), 0, b.position());
            out.write(13);
            out.write(10);
            b.clear();
        }
        super.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw obj;
    }

    public void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (!b.hasRemaining())
        {
            flush();
        }
        b.put((byte)i);
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void write(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = h.a;
_L2:
        int k;
        int l;
        l = j;
        k = i;
        if (j <= b.remaining())
        {
            break; /* Loop/switch isn't completed */
        }
        l = b.remaining();
        b.put(abyte0, i, l);
        flush();
        k = i + l;
        l = j - l;
        j = l;
        i = k;
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        b.put(abyte0, k, l);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "vp/\001D";
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
                obj = "\023)c!v";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "sk:x\\\fG\001M\b\003l=x,\f\025G\035q)l\006_\b\031\004\n\002\013KE\035_\035STGB\031W)cy\017FVDm\033FJ\035\026\\nK\023E\020OEF\031R\023\004AO\023NT\bX\025AH\f\027\\te*D\035W\013X\002N\030\004BD\bWTS\003STS\036\002\013KE\035_\035STGO\023N\013\nC\022WE\nXU..=^\035MW\017I\016\016a\007O\023GM\007KF\003G\001Y\022HA\r!v..";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "vp/\001D";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "vp/\001D";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "LQ\035\f\021B]IB\023W\004\013I\\MQ\005@";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 124;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 35;
          goto _L9
_L5:
        byte1 = 36;
          goto _L9
_L6:
        byte1 = 105;
          goto _L9
        byte1 = 44;
          goto _L9
    }
}
