// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.spongycastle.util:
//            Pack

public final class Strings
{

    private static final String z[];

    public Strings()
    {
    }

    public static void toUTF8ByteArray(char ac[], OutputStream outputstream)
    {
        int i;
        boolean flag;
        i = 0;
        flag = Pack.a;
_L8:
        char c;
        if (i >= ac.length)
        {
            break; /* Loop/switch isn't completed */
        }
        c = ac[i];
        if (c >= '\200') goto _L2; else goto _L1
_L1:
        outputstream.write(c);
        int j = i;
        if (!flag) goto _L3; else goto _L2
_L2:
        if (c >= '\u0800') goto _L5; else goto _L4
_L4:
        outputstream.write(c >> 6 | 0xc0);
        outputstream.write(c & 0x3f | 0x80);
        j = i;
        if (!flag) goto _L3; else goto _L5
_L5:
        if (c < '\uD800' || c > '\uDFFF')
        {
            break MISSING_BLOCK_LABEL_303;
        }
        try
        {
            if (i + 1 >= ac.length)
            {
                throw new IllegalStateException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            throw ac;
        }
        break MISSING_BLOCK_LABEL_133;
        ac;
        try
        {
            throw ac;
        }
        // Misplaced declaration of an exception variable
        catch (char ac[]) { }
        try
        {
            throw ac;
        }
        // Misplaced declaration of an exception variable
        catch (char ac[]) { }
        try
        {
            throw ac;
        }
        // Misplaced declaration of an exception variable
        catch (char ac[]) { }
        try
        {
            throw ac;
        }
        // Misplaced declaration of an exception variable
        catch (char ac[]) { }
        throw ac;
        i++;
        char c1 = ac[i];
        if (c > '\uDBFF')
        {
            try
            {
                throw new IllegalStateException(z[0]);
            }
            // Misplaced declaration of an exception variable
            catch (char ac[])
            {
                throw ac;
            }
        }
        j = ((c & 0x3ff) << 10 | c1 & 0x3ff) + 0x10000;
        try
        {
            outputstream.write(j >> 18 | 0xf0);
            outputstream.write(j >> 12 & 0x3f | 0x80);
            outputstream.write(j >> 6 & 0x3f | 0x80);
            outputstream.write(j & 0x3f | 0x80);
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            throw ac;
        }
        j = i;
        if (!flag) goto _L3; else goto _L6
_L6:
        j = c1;
_L9:
        outputstream.write(j >> 12 | 0xe0);
        outputstream.write(j >> 6 & 0x3f | 0x80);
        outputstream.write(j & 0x3f | 0x80);
        j = i;
_L3:
        i = j + 1;
        if (!flag) goto _L8; else goto _L7
_L7:
        return;
        j = c;
          goto _L9
    }

    public static byte[] toUTF8ByteArray(char ac[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            toUTF8ByteArray(ac, ((OutputStream) (bytearrayoutputstream)));
        }
        // Misplaced declaration of an exception variable
        catch (char ac[])
        {
            throw new IllegalStateException(z[2]);
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static String toUpperCase(String s)
    {
        int i = 0;
        boolean flag2 = Pack.a;
        char ac[] = s.toCharArray();
        boolean flag = false;
        boolean flag1;
        do
        {
            flag1 = flag;
            if (i == ac.length)
            {
                break;
            }
            char c = ac[i];
            flag1 = flag;
            if ('a' <= c)
            {
                flag1 = flag;
                if ('z' >= c)
                {
                    flag1 = true;
                    ac[i] = (char)((c - 97) + 65);
                }
            }
            i++;
            flag = flag1;
        } while (!flag2);
        if (flag1)
        {
            try
            {
                s = new String(ac);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        return s;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "vrB\"\003vx\024\026;Y1\005uO|sP&\037puZ7".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "vrB\"\003vx\024\026;Y1\005uO|sP&\037puZ7".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_195;
_L1:
        byte0 = 111;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 31;
          goto _L7
_L3:
        byte0 = 28;
          goto _L7
_L4:
        byte0 = 52;
          goto _L7
        byte0 = 67;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            ac = "|}Z-\000k<Q-\fpxQc\034kn]-\b?h[c\rfhQc\016mnU:N".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 240
    //                   0 261
    //                   1 267
    //                   2 273
    //                   3 279;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_279;
_L8:
        byte1 = 111;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 31;
          goto _L14
_L10:
        byte1 = 28;
          goto _L14
_L11:
        byte1 = 52;
          goto _L14
        byte1 = 67;
          goto _L14
_L21:
        byte byte1;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 345
    //                   1 351
    //                   2 357
    //                   3 363;
           goto _L15 _L16 _L17 _L18 _L19
_L16:
        break; /* Loop/switch isn't completed */
_L19:
        break MISSING_BLOCK_LABEL_363;
_L15:
        byte byte2 = 111;
_L22:
        ac[i] = (char)(byte2 ^ c);
        i++;
        if (true) goto _L21; else goto _L20
_L20:
        byte2 = 31;
          goto _L22
_L17:
        byte2 = 28;
          goto _L22
_L18:
        byte2 = 52;
          goto _L22
        byte2 = 67;
          goto _L22
    }
}
