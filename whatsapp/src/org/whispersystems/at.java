// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package org.whispersystems:
//            ax, aX

public abstract class at
{

    public static boolean a;
    private static final String z[];

    public at()
    {
    }

    public static at a(int i)
    {
        switch (i)
        {
        default:
            throw new AssertionError((new StringBuilder()).append(z[0]).append(i).toString());

        case 2: // '\002'
            return new ax();

        case 3: // '\003'
            return new aX();
        }
    }

    private byte[] a(byte abyte0[], byte abyte1[])
    {
        Mac mac = Mac.getInstance(z[2]);
        mac.init(new SecretKeySpec(abyte0, z[1]));
        abyte0 = mac.doFinal(abyte1);
        return abyte0;
        abyte0;
_L2:
        throw new AssertionError(abyte0);
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private byte[] b(byte abyte0[], byte abyte1[], int i)
    {
        double d;
        boolean flag;
        flag = a;
        d = (double)i / 32D;
        byte abyte2[];
        ByteArrayOutputStream bytearrayoutputstream;
        int k;
        int l;
        l = (int)Math.ceil(d);
        abyte2 = new byte[0];
        bytearrayoutputstream = new ByteArrayOutputStream();
        k = a();
        int j;
        j = i;
        i = k;
_L2:
        Mac mac;
        if (i >= a() + l)
        {
            break; /* Loop/switch isn't completed */
        }
        mac = Mac.getInstance(z[4]);
        mac.init(new SecretKeySpec(abyte0, z[3]));
        mac.update(abyte2);
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        mac.update(abyte1);
        byte byte0 = (byte)i;
        mac.update(byte0);
        abyte2 = mac.doFinal();
        k = Math.min(j, abyte2.length);
        bytearrayoutputstream.write(abyte2, 0, k);
        j -= k;
        i++;
        if (!flag) goto _L2; else goto _L1
_L1:
        try
        {
            return bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        break MISSING_BLOCK_LABEL_167;
        abyte0;
        throw abyte0;
        throw new AssertionError(abyte0);
    }

    protected abstract int a();

    public byte[] a(byte abyte0[], byte abyte1[], int i)
    {
        return a(abyte0, new byte[32], abyte1, i);
    }

    public byte[] a(byte abyte0[], byte abyte1[], byte abyte2[], int i)
    {
        return b(a(abyte1, abyte0), abyte2, i);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\020iP{\0002i\033c\n7tRz\001\177'";
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
                obj = "\rjZv<\rF\t Y";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\rjZv<\rF\t Y";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\rjZv<\rF\t Y";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\rjZv<\rF\t Y";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 111;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 69;
          goto _L9
_L5:
        byte1 = 7;
          goto _L9
_L6:
        byte1 = 59;
          goto _L9
        byte1 = 21;
          goto _L9
    }
}
