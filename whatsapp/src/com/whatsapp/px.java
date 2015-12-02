// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.backport.util.Base64;
import com.whatsapp.protocol.br;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.whatsapp:
//            my

public class px
    implements br
{

    private static final String z[];
    SecureRandom a;

    public px()
    {
        a = new SecureRandom();
    }

    public static byte[] a(byte abyte0[], byte abyte1[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte0 = new SecretKeySpec(abyte0, z[4]);
            Mac mac = Mac.getInstance(z[5]);
            mac.init(abyte0);
            abyte0 = mac.doFinal(abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e((new StringBuilder()).append(z[3]).append(abyte0).toString());
            return null;
        }
        return abyte0;
    }

    public static byte[] a(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        if (abyte0 == null || abyte1 == null || abyte2 == null)
        {
            return null;
        }
        try
        {
            abyte0 = new SecretKeySpec(abyte0, z[12]);
            Cipher cipher = Cipher.getInstance(z[13]);
            cipher.init(1, abyte0, new IvParameterSpec(abyte1));
            abyte0 = cipher.doFinal(abyte2);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e((new StringBuilder()).append(z[11]).append(abyte0).toString());
            return null;
        }
        return abyte0;
    }

    public static byte[] b(byte abyte0[], byte abyte1[])
    {
        byte abyte2[] = new byte[abyte0.length + abyte1.length];
        System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
        System.arraycopy(abyte1, 0, abyte2, abyte0.length, abyte1.length);
        return abyte2;
    }

    public byte[] a(byte abyte0[])
    {
        byte abyte1[];
        byte abyte2[];
        byte abyte3[] = my.j;
        abyte1 = my.d;
        if (abyte3 == null || abyte1 == null || abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte2 = new byte[16];
            a.nextBytes(abyte2);
            abyte0 = a(abyte3, abyte2, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e((new StringBuilder()).append(z[0]).append(abyte0).toString());
            return null;
        }
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        Log.e(z[2]);
        return null;
        abyte0 = b(abyte2, abyte0);
        abyte1 = a(abyte1, abyte0);
        if (abyte1 != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        Log.e(z[1]);
        return null;
        abyte0 = b(abyte1, abyte0);
        return abyte0;
    }

    public byte[] b(byte abyte0[])
    {
        byte abyte1[];
        byte abyte2[];
        byte abyte3[];
        abyte1 = my.j;
        byte abyte5[] = my.d;
        if (abyte1 == null || abyte5 == null || abyte0 == null)
        {
            return null;
        }
        try
        {
            abyte3 = new byte[32];
            abyte2 = new byte[abyte0.length - 32];
            System.arraycopy(abyte0, 0, abyte3, 0, abyte3.length);
            System.arraycopy(abyte0, abyte3.length, abyte2, 0, abyte2.length);
            abyte0 = a(abyte5, abyte2);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e((new StringBuilder()).append(z[9]).append(abyte0).toString());
            return null;
        }
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        Log.e(z[10]);
        return null;
        if (Arrays.equals(abyte3, abyte0))
        {
            break MISSING_BLOCK_LABEL_153;
        }
        Log.c(z[8], null, new Object[] {
            Base64.encodeToString(abyte3, 2), Base64.encodeToString(abyte0, 2)
        });
        return null;
        abyte0 = new byte[16];
        byte abyte4[] = new byte[abyte2.length - 16];
        System.arraycopy(abyte2, 0, abyte0, 0, abyte0.length);
        System.arraycopy(abyte2, abyte0.length, abyte4, 0, abyte4.length);
        SecretKeySpec secretkeyspec = new SecretKeySpec(abyte1, z[6]);
        Cipher cipher = Cipher.getInstance(z[7]);
        cipher.init(2, secretkeyspec, new IvParameterSpec(abyte0));
        abyte0 = cipher.doFinal(abyte4);
        return abyte0;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[14];
        obj = "(\022\t\002D:\022P\027^y\006H\016Fy";
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
                obj = "(\022\t\002D:\022P\027^y\rH\004\n?\001@\013";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "(\022\t\002D:\022P\027^y\001L\024\n?\001@\013";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "(\022\t\017G8\003\t\001K0\f\t";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\021\rH\004y\021!\033R\034";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\021\rH\004y\021!\033R\034";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\030%z";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\030%zHi\033#\0067a\0323\0367K=\004@\tM";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "(\022\t\003O:\022P\027^y\bD\006Iy\r@\024G8\024J\017\n|\023\tBY";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "(\022\t\003O:\022P\027^y\006H\016Fy";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "(\022\t\003O:\022P\027^y\rH\004\n?\001@\013";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "(\022\t\006O*@O\006C5@";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\030%z";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\030%zHi\033#\0067a\0323\0367K=\004@\tM";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 388
    //                   0 411
    //                   1 418
    //                   2 425
    //                   3 432;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_432;
_L3:
        byte byte1 = 42;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 89;
          goto _L9
_L5:
        byte1 = 96;
          goto _L9
_L6:
        byte1 = 41;
          goto _L9
        byte1 = 103;
          goto _L9
    }
}
