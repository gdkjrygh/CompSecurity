// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

// Referenced classes of package com.whatsapp.fieldstats:
//            bl

public final class aw
{

    private static final String z[];

    public static ByteBuffer a()
    {
        return ByteBuffer.allocate(1034);
    }

    public static void a(byte byte0, int i, long l, Double double1, ByteBuffer bytebuffer)
    {
        a(byte0, i, l, double1, bytebuffer);
    }

    private static void a(byte byte0, int i, long l, Object obj, ByteBuffer bytebuffer)
    {
        if (obj == null)
        {
            try
            {
                throw new NullPointerException(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        boolean flag;
        if (obj instanceof Double)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        flag = obj instanceof String;
        if (!flag)
        {
            try
            {
                throw new IllegalArgumentException(z[4]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        break MISSING_BLOCK_LABEL_66;
        obj;
        throw obj;
        String s;
        if (!(obj instanceof String))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        s = (String)obj;
        if (s.getBytes(z[6]).length > 1024)
        {
            throw new IllegalArgumentException(z[3]);
        }
        break MISSING_BLOCK_LABEL_129;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new Error(((Throwable) (obj)));
        }
        if (i < 0 || i >= 0x1000000)
        {
            try
            {
                throw new IllegalArgumentException(z[5]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        long l1;
        if (l / 1000L < 0L)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        l1 = l / 1000L;
        if (l1 < 0x100000000L)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        try
        {
            throw new IllegalArgumentException(z[1]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj;
        throw obj;
        bytebuffer.put(byte0);
        bytebuffer.put((byte)i);
        bytebuffer.put((byte)(i >> 8));
        bytebuffer.put((byte)(i >> 16));
        i = (int)(l / 1000L);
        bytebuffer.put((byte)i);
        bytebuffer.put((byte)(i >> 8));
        bytebuffer.put((byte)(i >> 16));
        bytebuffer.put((byte)(i >> 24));
        if (!(obj instanceof String))
        {
            break MISSING_BLOCK_LABEL_355;
        }
        String s1 = (String)obj;
        byte abyte0[];
        boolean flag1;
        try
        {
            abyte0 = s1.getBytes(z[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new Error(((Throwable) (obj)));
        }
        bytebuffer.put((byte)abyte0.length);
        bytebuffer.put((byte)(abyte0.length >> 8));
        bytebuffer.put(abyte0);
        if (bl.a == 0)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        flag1 = obj instanceof Double;
        if (flag1)
        {
            l = Double.doubleToRawLongBits(((Double)obj).doubleValue());
            bytebuffer.put((byte)(int)l);
            bytebuffer.put((byte)(int)(l >> 8));
            bytebuffer.put((byte)(int)(l >> 16));
            bytebuffer.put((byte)(int)(l >> 24));
            bytebuffer.put((byte)(int)(l >> 32));
            bytebuffer.put((byte)(int)(l >> 40));
            bytebuffer.put((byte)(int)(l >> 48));
            bytebuffer.put((byte)(int)(l >> 56));
        }
        return;
        obj;
        throw obj;
    }

    public static void a(byte byte0, int i, long l, String s, ByteBuffer bytebuffer)
    {
        a(byte0, i, l, s, bytebuffer);
    }

    public static ByteBuffer b()
    {
        return ByteBuffer.allocate(16);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "HA/\022n";
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
                obj = "i|\004Z\033ty\005V%=z\034KvrsIM7sr\f";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "kt\005J3=v\bQ8raI]3={\034S:";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Na\033V8z5\005Z8za\001\037?n5\005V;ta\f[vizI\016f/!Ij\002[8Q\0374da\fL";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "Na\033V8z5\bQ2=Q\006J4qpI^$x5\035W3=z\007S/=f\034O&rg\035Z2=c\bS#x5\035F&xf";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "tqIP#i5\006Yvot\007X3";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "HA/\022n";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 86;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 29;
          goto _L9
_L5:
        byte1 = 21;
          goto _L9
_L6:
        byte1 = 105;
          goto _L9
        byte1 = 63;
          goto _L9
    }
}
