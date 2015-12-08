// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.visa.cbp.external.common.DynParams;
import com.visa.cbp.external.common.HCEData;
import com.visa.cbp.external.common.ICC;
import com.visa.cbp.external.common.QVSDCData;
import com.visa.cbp.external.common.QVSDCWithODA;
import com.visa.cbp.external.common.StaticParams;
import com.visa.cbp.external.common.TokenInfo;
import com.visa.cbp.external.enp.EnrollAndProvisionResponse;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.StringTokenizer;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package rrrrrr:
//            lpllpp, grrrrr, ppplpp

public class rgrrgg
    implements lpllpp
{

    public static final byte b042604260426042604260426_byte_static_fld = 0;
    public static int b042604260426042604260426_int_static_fld = 0;
    private static SecureRandom b042604260426042604260426_java_security_SecureRandom_static_fld;
    public static int b042604260426042604260426_int_static_fld = 1;
    private static short b042604260426042604260426_short_static_fld = 0;
    private static final String b042604260426042604260426_java_lang_String_static_fld;
    public static int b042604260426042604260426_int_static_fld = 2;
    private static short b042604260426042604260426_short_static_fld = 0;
    public static int b042604260426042604260426_int_static_fld = 8;
    public static final byte b042604260426042604260426_byte_static_fld = 1;

    public rgrrgg()
    {
        try
        {
            super();
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public static int b042704270427042704270427()
    {
        return 58;
    }

    private static short b044A044A044A044A044A044A(byte abyte0[], short word0)
    {
        short word1;
        for (word1 = word0; abyte0[word1] == 0 || abyte0[word1] == -1; word1++) { }
        if ((abyte0[word1] & 0x1f) != 31) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        int l;
        i = b042604260426042604260426_int_static_fld;
        j = b042604260426042604260426_int_static_fld;
        k = b042604260426042604260426_int_static_fld;
        l = b042604260426042604260426_int_static_fld;
        (l * (b042604260426042604260426_int_static_fld + l)) % b042604260426042604260426_int_static_fld;
        JVM INSTR tableswitch 0 0: default 84
    //                   0 95;
           goto _L3 _L4
_L3:
        b042604260426042604260426_int_static_fld = 11;
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
_L4:
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 124
    //                   0 355;
           goto _L5 _L6
_L5:
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        i = word1;
_L12:
        do
        {
            j = (short)(i + 1);
label0:
            do
            {
                switch (1)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            i = j;
        } while ((abyte0[j] & 0x80) == 128);
_L13:
        i = (short)(j + 1);
        j = (short)(i - word1);
        if (j != 1) goto _L8; else goto _L7
_L7:
        b042604260426042604260426_short_static_fld = (short)(abyte0[word1] & 0xff);
_L10:
        b042604260426042604260426_short_static_fld = 0;
        b042604260426042604260426_short_static_fld = (short)(abyte0[i] & 0xff);
        return (short)((short)(i + 1) - word0);
_L8:
        if (j != 2) goto _L10; else goto _L9
_L9:
        j = (short)(abyte0[word1] & 0xff);
label1:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break label1;

            case 1: // '\001'
                break;
            }
        } while (true);
        b042604260426042604260426_short_static_fld = (short)((short)(abyte0[(short)(word1 + 1)] & 0xff) + (j << 8));
        if (true) goto _L10; else goto _L11
_L11:
_L6:
        i = word1;
          goto _L12
_L2:
        j = word1;
          goto _L13
    }

    public static int b044A044A044A044A044A044A()
    {
        return 1;
    }

    public static String b044A044A044A044A044A044A(byte abyte0[])
    {
        return new String(Hex.encode(abyte0));
    }

    public static byte[] b044A044A044A044A044A044A(byte abyte0[])
    {
label0:
        {
            Object obj = null;
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                b042604260426042604260426_int_static_fld = 88;
            }
            byte abyte1[] = obj;
            if (abyte0 == null)
            {
                break label0;
            }
            abyte1 = obj;
            try
            {
                if (abyte0.length <= 0)
                {
                    break label0;
                }
                abyte0 = new byte[abyte0.length];
                abyte1 = b042604260426042604260426_java_security_SecureRandom_static_fld;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            try
            {
                abyte1.nextBytes(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            abyte1 = abyte0;
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b044A044A044A044A044A044A())
            {
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                b042604260426042604260426_int_static_fld = 6;
                abyte1 = abyte0;
            }
        }
        return abyte1;
    }

    public static byte[] b044A044A044A044A044A044A(String s)
    {
        byte abyte0[];
        int i;
        int j;
        i = 2;
        if (s == null)
        {
            return null;
        }
        s = new StringTokenizer(s);
        abyte0 = new byte[s.countTokens()];
        j = 0;
_L5:
        switch (0)
        {
        default:
label0:
            while (true) 
            {
                switch (0)
                {
                default:
                    break;

                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    continue; /* Loop/switch isn't completed */
                }
            }
            break;

        case 1: // '\001'
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;
        }
        if (!s.hasMoreTokens()) goto _L2; else goto _L1
_L1:
        abyte0[j] = (byte)(Integer.valueOf(Integer.parseInt(s.nextToken(), 16)).byteValue() & 0xff);
_L3:
        int k = i / 0;
        i = k;
        if (true) goto _L3; else goto _L2
_L2:
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = 41;
        }
        return abyte0;
        Exception exception;
        exception;
        b042604260426042604260426_int_static_fld = 47;
        j++;
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        b042604260426042604260426_int_static_fld = 10;
_L7:
        k = i / 0;
        i = k;
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
_L9:
        k = i / 0;
        i = k;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static short b044A044A044A044A044A044A(byte abyte0[], short word0)
    {
        int i;
        short word2;
        try
        {
            i = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        word2 = (short)i;
        for (short word1 = word0; word1 < word2; word1++)
        {
            int j = b042604260426042604260426_int_static_fld;
            switch ((j * (b044A044A044A044A044A044A() + j)) % b042604260426042604260426_int_static_fld)
            {
            default:
                b042604260426042604260426_int_static_fld = 71;
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                // fall through

            case 0: // '\0'
                j = abyte0[word1];
                break;
            }
            if ((j & 0xfffffff0) == -48)
            {
                return (short)((word1 - word0) * 2);
            }
            if ((j & 0xf) == 13)
            {
                return (short)((word1 - word0) * 2 + 1);
            }
        }

        return -1;
    }

    public static String b044A044A044A044A044A044A(byte abyte0[])
    {
        if (abyte0 != null)
        {
            return b044A044A044A044A044A044A(abyte0, 0, abyte0.length, grrrrr.b044C044C044C044C044C044C("\uFDE6", '\276', '\004'));
        } else
        {
            return "";
        }
    }

    public static byte[] b044A044A044A044A044A044A(String s)
    {
        byte abyte0[];
        int i;
        int j;
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b044A044A044A044A044A044A())
        {
            b042604260426042604260426_int_static_fld = 4;
            b042604260426042604260426_int_static_fld = 19;
        }
        abyte0 = new byte[6];
        j = s.length() - 1;
        i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            // fall through

        case 0: // '\0'
            i = 5;
            break;
        }
_L6:
        if (i < 0) goto _L2; else goto _L1
_L1:
        int k;
        k = j - 1;
        abyte0[i] = (byte)(s.charAt(j) - 48);
        if (k >= 0) goto _L3; else goto _L2
_L2:
        return abyte0;
_L3:
        byte byte0 = abyte0[i];
        j = k - 1;
        k = s.charAt(k);
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        abyte0[i] = (byte)((byte)(k - 48 << 4) | byte0);
        if (j < 0) goto _L2; else goto _L4
_L4:
        i--;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static int b044A044A044A044A044A044A()
    {
        return 0;
    }

    public static short b044A044A044A044A044A044A(byte abyte0[], short word0, short word1, short aword0[], short aword1[], short word2)
    {
        short word4 = b044A044A044A044A044A044A(abyte0, word0, word1);
        short word3;
        short word5;
        short word6;
        int i;
        if (word4 > 127)
        {
            word2++;
            word3 = word0;
        } else
        {
            word3 = word0;
        }
        if (word3 >= (short)(word0 + word1))
        {
            break MISSING_BLOCK_LABEL_208;
        }
        word6 = b044A044A044A044A044A044A(abyte0, word3);
        word5 = 0;
_L2:
        i = aword0.length;
        if (word5 >= i)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        i = b042604260426042604260426_short_static_fld;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
            l = b042604260426042604260426_int_static_fld;
            i1 = b042604260426042604260426_int_static_fld;
            j1 = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (((j + k) * l) % i1 != j1)
        {
            try
            {
                b042604260426042604260426_int_static_fld = 51;
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
        }
        if (i != aword0[word5])
        {
            break MISSING_BLOCK_LABEL_186;
        }
        aword1[word5] = word2;
        word5 = b042604260426042604260426_short_static_fld;
        word2 = (short)(word5 + word2);
        word3 += word6;
        continue; /* Loop/switch isn't completed */
        word5++;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        throw abyte0;
        abyte0;
        throw abyte0;
        return word4;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_25;
_L3:
    }

    public static String b044A044A044A044A044A044A(byte abyte0[], int i, int j, String s)
    {
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        StringBuffer stringbuffer = new StringBuffer(j);
        int k = 0;
_L2:
        if (k >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k != 0)
        {
            if (k % 16 != 0);
        }
        Object obj1 = Integer.toString(abyte0[k + i] & 0xff);
        Object obj = obj1;
        if (((String) (obj1)).length() != 1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        obj = (new StringBuilder()).append('0').append(((String) (obj1)));
        obj = ((StringBuilder) (obj)).toString();
        obj = ((String) (obj)).toUpperCase();
        obj1 = new StringBuilder();
        int l;
        int j1;
        int k1;
        int l1;
        int i2;
        try
        {
            l = b042604260426042604260426_int_static_fld;
            j1 = b042604260426042604260426_int_static_fld;
            k1 = b042604260426042604260426_int_static_fld;
            l1 = b042704270427042704270427();
            i2 = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (((l + j1) * k1) % l1 != i2)
        {
            int i1;
            try
            {
                b042604260426042604260426_int_static_fld = 68;
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            i1 = b042604260426042604260426_int_static_fld;
            switch ((i1 * (b044A044A044A044A044A044A() + i1)) % b042604260426042604260426_int_static_fld)
            {
            default:
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                break;

            case 0: // '\0'
                break;
            }
        }
        stringbuffer.append(((StringBuilder) (obj1)).append(((String) (obj))).append(s).toString());
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            return stringbuffer.toString();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        break MISSING_BLOCK_LABEL_253;
        return "";
        abyte0;
        throw abyte0;
        throw abyte0;
    }

    public static final short b044A044A044A044A044A044A(byte abyte0[], short word0)
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            // fall through

        case 0: // '\0'
            i = (short)abyte0[word0];
            break;
        }
        if (((b042704270427042704270427() + b042604260426042604260426_int_static_fld) * b042704270427042704270427()) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 91;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
        }
        return (short)((i << 8) + ((short)abyte0[(short)(word0 + 1)] & 0xff));
    }

    public static int b044A044A044A044A044A044A()
    {
        SecureRandom securerandom;
        Exception exception;
        int i;
        int j;
        try
        {
            i = b042604260426042604260426_int_static_fld;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        j = b042704270427042704270427();
        switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 85;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
        (i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld;
        JVM INSTR tableswitch 0 0: default 109
    //                   0 86;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_86;
_L1:
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        b042604260426042604260426_int_static_fld = 1;
        securerandom = b042604260426042604260426_java_security_SecureRandom_static_fld;
        i = securerandom.nextInt();
        return i;
        exception;
        throw exception;
        Exception exception2;
        exception2;
        throw exception2;
        exception2;
        throw exception2;
    }

    public static long b044A044A044A044A044A044A(byte abyte0[], int i, int j)
    {
        long l1 = 0L;
        long l2 = 1L;
        j = (i + j) - 1;
        do
        {
            if (j < i)
            {
                break;
            }
            int k;
            int l;
            int i1;
            long l3;
            long l4;
            try
            {
                k = b042604260426042604260426_int_static_fld;
                l = b042604260426042604260426_int_static_fld;
                i1 = b042604260426042604260426_int_static_fld;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            switch ((k * (l + k)) % i1)
            {
            default:
                try
                {
                    b042604260426042604260426_int_static_fld = 73;
                    b042604260426042604260426_int_static_fld = b042704270427042704270427();
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
                // fall through

            case 0: // '\0'
                k = abyte0[j];
                l3 = l1 + (long)(k & 0xff) * l2;
                l4 = l2 * 256L;
                k = j - 1;
                j = k;
                l2 = l4;
                l1 = l3;
                break;
            }
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = 0;
                b042604260426042604260426_int_static_fld = 2;
                j = k;
                l2 = l4;
                l1 = l3;
            }
        } while (true);
        return l1;
    }

    public static short b044A044A044A044A044A044A(byte abyte0[], short word0)
    {
        return (short)(abyte0[word0] & 0xff);
    }

    public static byte[] b044A044A044A044A044A044A(String s, String s1)
    {
        int i = 0;
        if (s != null) goto _L2; else goto _L1
_L1:
        s1 = null;
_L11:
        return s1;
_L2:
        byte abyte0[];
        int j;
        int k;
        int l;
        int i1;
        int j1;
        boolean flag;
        try
        {
            j = s.length() / 2;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            abyte0 = new byte[j];
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
            l = b042604260426042604260426_int_static_fld;
            i1 = b042604260426042604260426_int_static_fld;
            j1 = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((j + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        b042604260426042604260426_int_static_fld = 34;
        b042604260426042604260426_int_static_fld = 62;
        flag = s1.equals("");
        if (!flag) goto _L4; else goto _L3
_L3:
        j = 0;
_L8:
        k = b042604260426042604260426_int_static_fld;
        (k * (b044A044A044A044A044A044A() + k)) % b042604260426042604260426_int_static_fld;
        JVM INSTR tableswitch 0 0: default 128
    //                   0 140;
           goto _L5 _L6
_L5:
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
_L6:
        1;
        JVM INSTR tableswitch 0 1: default 164
    //                   0 90
    //                   1 191;
           goto _L7 _L8 _L9
_L7:
        1;
        JVM INSTR tableswitch 0 1: default 188
    //                   0 90
    //                   1 191;
           goto _L7 _L8 _L9
_L9:
        k = s.length();
        s1 = abyte0;
        if (j >= k) goto _L11; else goto _L10
_L10:
        abyte0[i] = (byte)Integer.parseInt(s.substring(j, j + 2));
        j += 2;
        i++;
          goto _L8
_L4:
        s = b044A044A044A044A044A044A(s);
        return s;
    }

    public static long b044A044A044A044A044A044A(byte abyte0[])
    {
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        long l = 0L;
        long l1 = 1L;
        int i = abyte0.length - 1;
        do
        {
            if (i < 0)
            {
                break;
            }
label1:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label1;

                        case 1: // '\001'
                            break label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label1;

                case 1: // '\001'
                    break;
                }
            } while (true);
            long l2 = abyte0[i] & 0xf;
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
            }
            long l3 = l1 * 10L;
            l2 = l + l2 * l1 + (long)(abyte0[i] >> 4) * l3;
            l3 *= 10L;
            int j = i - 1;
            i = j;
            l1 = l3;
            l = l2;
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = 3;
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                i = j;
                l1 = l3;
                l = l2;
            }
        } while (true);
        return l;
    }

    public static short b044A044A044A044A044A044A(byte abyte0[], short word0, short word1)
    {
        boolean flag;
        flag = false;
        word1 = (short)((word0 + word1) - 1);
_L10:
        short word2 = flag;
        if (word1 <= word0) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (abyte0[word1] != -128)
        {
            word1--;
            continue; /* Loop/switch isn't completed */
        }
          goto _L3
_L8:
        try
        {
            i = b042604260426042604260426_int_static_fld;
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
            l = b042704270427042704270427();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        try
        {
            i1 = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042704270427042704270427())
        {
        default:
            b042604260426042604260426_int_static_fld = 10;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        word2 = (short)(word1 - word0);
_L2:
        return word2;
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 176
    //                   0 29
    //                   1 152;
           goto _L4 _L5 _L3
_L5:
        continue; /* Loop/switch isn't completed */
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 200
    //                   0 152
    //                   1 29;
           goto _L4 _L3 _L6
_L6:
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static boolean b044A044A044A044A044A044A(byte abyte0[], int i, byte abyte1[], int j, int k)
    {
        if (abyte0 == null)
        {
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = 99;
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
                {
                    b042604260426042604260426_int_static_fld = b042704270427042704270427();
                    b042604260426042604260426_int_static_fld = b042704270427042704270427();
                }
            }
            return true;
        }
        if (abyte1 == null)
        {
            return false;
        }
        continue;
        while (true) 
        {
            int l = i;
            do
            {
                if (l >= i + k)
                {
                    break;
                }
label0:
                do
                {
                    switch (1)
                    {
                    default:
                        while (true) 
                        {
                            switch (1)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                continue label0;

                            case 1: // '\001'
                                break label0;
                            }
                        }
                        break;

                    case 0: // '\0'
                        break;

                    case 1: // '\001'
                        break label0;
                    }
                } while (true);
                if (abyte1[j] != abyte0[l])
                {
label1:
                    do
                    {
                        switch (1)
                        {
                        default:
                            while (true) 
                            {
                                switch (0)
                                {
                                default:
                                    break;

                                case 0: // '\0'
                                    break label1;

                                case 1: // '\001'
                                    continue label1;
                                }
                            }
                            break;

                        case 0: // '\0'
                            break;

                        case 1: // '\001'
                            break label1;
                        }
                    } while (true);
                    return false;
                }
                l++;
                j++;
            } while (true);
            return true;
        }
    }

    public static boolean b042704270427042704270427(byte abyte0[], int i, byte abyte1[], int j)
    {
        boolean flag1 = false;
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        if (abyte1 != null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        int k;
        try
        {
            i = b042604260426042604260426_int_static_fld;
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        flag = flag1;
        switch ((i * (j + i)) % k)
        {
        default:
            int l;
            byte byte0;
            byte byte1;
            try
            {
                b042604260426042604260426_int_static_fld = 95;
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            i = b042604260426042604260426_int_static_fld;
            flag = flag1;
            break MISSING_BLOCK_LABEL_79;

        case 0: // '\0'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_217;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
label0:
            {
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                break label0;
            }
            break;

        case 0: // '\0'
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
        break MISSING_BLOCK_LABEL_217;
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        return false;
_L14:
        if (l >= abyte0.length + i) goto _L7; else goto _L6
_L6:
        byte0 = abyte1[j];
        byte1 = abyte0[l];
        flag = flag1;
        if (byte0 != byte1) goto _L4; else goto _L8
_L8:
        l++;
        j++;
_L11:
        0;
        JVM INSTR tableswitch 0 1: default 188
    //                   0 122
    //                   1 163;
           goto _L9 _L10 _L11
_L10:
        continue; /* Loop/switch isn't completed */
_L9:
        1;
        JVM INSTR tableswitch 0 1: default 212
    //                   0 163
    //                   1 122;
           goto _L9 _L11 _L12
_L12:
        if (true) goto _L14; else goto _L13
_L13:
_L7:
        return true;
        l = i;
          goto _L11
    }

    public static int b042704270427042704270427()
    {
        return 2;
    }

    public static short b044A044A044A044A044A044A(byte abyte0[], short word0, short word1)
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042704270427042704270427())
        {
        default:
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
        if (((b042704270427042704270427() + b042604260426042604260426_int_static_fld) * b042704270427042704270427()) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 78;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
        }
        short word2 = word0;
        short word3 = 0;
        do
        {
            if (word2 >= (short)(word0 + word1))
            {
                break;
            }
            short word4 = b044A044A044A044A044A044A(abyte0, word2);
label0:
            do
            {
                switch (1)
                {
                default:
                    while (true) 
                    {
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            word3 += b042604260426042604260426_short_static_fld;
            word2 += word4;
        } while (true);
        return word3;
    }

    public static String b044A044A044A044A044A044A(byte abyte0[])
    {
        if (abyte0 != null)
        {
label0:
            do
            {
                switch (1)
                {
                default:
                    while (true) 
                    {
label1:
                        switch (1)
                        {
                        case 0: // '\0'
                            break;

                        default:
label2:
                            while (true) 
                            {
                                switch (1)
                                {
                                default:
                                    break;

                                case 0: // '\0'
                                    break label1;

                                case 1: // '\001'
                                    break label2;
                                }
                            }
                            // fall through

                        case 1: // '\001'
                            switch (1)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                continue label0;

                            case 1: // '\001'
                                break label0;
                            }
                            break;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
            abyte0 = b044A044A044A044A044A044A(abyte0, 0, abyte0.length, grrrrr.b044C044C044C044C044C044C("\uFFE4", '<', '\0'));
        } else
        {
            abyte0 = "";
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042704270427042704270427() != b042604260426042604260426_int_static_fld)
            {
                int i = b042604260426042604260426_int_static_fld;
                switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042704270427042704270427())
                {
                default:
                    b042604260426042604260426_int_static_fld = 35;
                    b042604260426042604260426_int_static_fld = 22;
                    // fall through

                case 0: // '\0'
                    b042604260426042604260426_int_static_fld = b042704270427042704270427();
                    break;
                }
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                return "";
            }
        }
        return abyte0;
    }

    public static final short b044A044A044A044A044A044A(byte abyte0[], short word0, short word1)
    {
        abyte0[word0] = (byte)(word1 >> 8);
        abyte0[word0 + 1] = (byte)word1;
        return (short)(word0 + 2);
    }

    public static String b044A044A044A044A044A044A()
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 58;
            b042604260426042604260426_int_static_fld = 90;
            break;

        case 0: // '\0'
            break;
        }
        String s;
        try
        {
            s = (new BigInteger(130, b042604260426042604260426_java_security_SecureRandom_static_fld)).toString(32);
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
label0:
            do
            {
                switch (1)
                {
                default:
                    while (true) 
                    {
                        switch (1)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            continue label0;

                        case 1: // '\001'
                            break label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label0;
                }
            } while (true);
        }
        return s;
    }

    public static long b044A044A044A044A044A044A(byte abyte0[])
    {
        int i;
        long l;
        try
        {
            i = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        try
        {
            l = b044A044A044A044A044A044A(abyte0, 0, i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        return l;
    }

    public static short b044A044A044A044A044A044A(byte abyte0[], short word0, short aword0[])
    {
        int i;
        for (i = word0; abyte0[i] == 0 || abyte0[i] == -1; i = (short)(i + 1)) { }
          goto _L1
_L4:
        int j;
        if (j == 2)
        {
            j = (short)(abyte0[i] & 0xff);
            aword0[0] = (short)((short)(abyte0[(short)(i + 1)] & 0xff) + (j << 8));
        }
          goto _L2
_L6:
        j = i;
        do
        {
            k = (short)(j + 1);
            j = k;
        } while ((abyte0[k] & 0x80) == 128);
_L5:
        k = (short)(k + 1);
        j = (short)(k - i);
        if (j != 1) goto _L4; else goto _L3
_L3:
        aword0[0] = (short)(abyte0[i] & 0xff);
          goto _L2
_L7:
        k = i;
          goto _L5
_L2:
        aword0[1] = 0;
        int k;
        if ((abyte0[k] & 0xffffff80) == 0)
        {
            aword0[1] = abyte0[k];
        } else
        {
            j = (short)(abyte0[k] & 0x7f);
            i = k;
            do
            {
                k = i;
                if (j <= 0)
                {
                    break;
                }
                k = (short)(i + 1);
                word1 = abyte0[k];
                i = b042604260426042604260426_int_static_fld;
                switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
                {
                default:
                    b042604260426042604260426_int_static_fld = b042704270427042704270427();
                    b042604260426042604260426_int_static_fld = 65;
                    // fall through

                case 0: // '\0'
                    word2 = aword0[1];
                    break;
                }
                i = word1;
                if (word1 < 0)
                {
                    word1 += 256;
                    i = word1;
                    if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
                    {
                        b042604260426042604260426_int_static_fld = 52;
                        b042604260426042604260426_int_static_fld = 60;
                        i = word1;
                    }
                }
                aword0[1] = (short)(i + word2);
                if (j > 1)
                {
                    aword0[1] = (short)(aword0[1] * 256);
                }
                j = (short)(j - 1);
                i = k;
            } while (true);
        }
        return (short)((short)(k + 1) - word0);
_L1:
        if ((abyte0[i] & 0x1f) != 31) goto _L7; else goto _L6
    }

    public static String b044A044A044A044A044A044A(byte abyte0[], int i, int j, String s)
    {
        if (abyte0 != null)
        {
            StringBuffer stringbuffer = new StringBuffer(j);
            for (int k = 0; k < j; k++)
            {
                if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b044A044A044A044A044A044A())
                {
                    b042604260426042604260426_int_static_fld = 4;
                    b042604260426042604260426_int_static_fld = 9;
                }
                if (k != 0)
                {
                    if (k % 16 != 0);
                }
label0:
                do
                {
                    switch (0)
                    {
                    default:
                        while (true) 
                        {
                            switch (0)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label0;

                            case 1: // '\001'
                                continue label0;
                            }
                        }
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        break;
                    }
                } while (true);
                String s1 = Integer.toHexString(abyte0[k + i] & 0xff);
                Object obj = s1;
                if (s1.length() == 1)
                {
                    obj = (new StringBuilder()).append('0').append(s1).toString();
                }
                obj = ((String) (obj)).toUpperCase(Locale.US);
                obj = (new StringBuilder()).append(((String) (obj)));
                int l = b042604260426042604260426_int_static_fld;
                switch ((l * (b042604260426042604260426_int_static_fld + l)) % b042704270427042704270427())
                {
                default:
                    b042604260426042604260426_int_static_fld = b042704270427042704270427();
                    b042604260426042604260426_int_static_fld = b042704270427042704270427();
                    // fall through

                case 0: // '\0'
                    stringbuffer.append(((StringBuilder) (obj)).append(s).toString());
                    break;
                }
            }

            return stringbuffer.toString();
        } else
        {
            return "";
        }
    }

    public static byte[] b044A044A044A044A044A044A(int i)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static boolean b044A044A044A044A044A044A(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        short word0 = 11;
        int i = 0;
        while (word0 >= 0) 
        {
            byte byte0 = abyte0[word0];
            short word1 = abyte1[word0];
            if (i > 9)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            byte0 = (byte)(i + (byte0 + word1));
            if (((b042604260426042604260426_int_static_fld + b044A044A044A044A044A044A()) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = 8;
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
            }
            word1 = (short)(word0 - 1);
            i = b042604260426042604260426_int_static_fld;
            switch ((i * (b044A044A044A044A044A044A() + i)) % b042604260426042604260426_int_static_fld)
            {
            default:
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                b042604260426042604260426_int_static_fld = 13;
                break;

            case 0: // '\0'
                break;
            }
            if (byte0 > 9)
            {
                i = 10;
            } else
            {
                i = 0;
            }
            abyte2[word0] = (byte)(byte0 - i);
            word0 = word1;
            i = byte0;
        }
        return i <= 9;
    }

    public static String b044A044A044A044A044A044A(int i)
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b044A044A044A044A044A044A())
        {
            b042604260426042604260426_int_static_fld = 48;
            b042604260426042604260426_int_static_fld = 55;
        }
        int j = 0xffff & i;
        i = j;
        if ((j & 0xff00) == 65280)
        {
            i = j & 0xff;
        }
        if (i <= 256) goto _L2; else goto _L1
_L1:
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        if (i >= 16) goto _L2; else goto _L3
_L3:
        stringbuffer.append(grrrrr.b044C044C044C044C044C044C("\211", 'Y', '\005'));
_L5:
        stringbuffer.append(Integer.toHexString(i).toUpperCase(Locale.US));
        return stringbuffer.toString();
_L2:
        if (i <= 255) goto _L5; else goto _L4
_L4:
label1:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label1;

                    case 1: // '\001'
                        continue label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
        if (i >= 4096) goto _L5; else goto _L6
_L6:
        String s = grrrrr.b044C044C044C044C044C044C("\337", '\257', '\005');
        int k = b042704270427042704270427();
        switch ((k * (b042604260426042604260426_int_static_fld + k)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = 79;
            // fall through

        case 0: // '\0'
            stringbuffer.append(s);
            break;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    public static void b044A044A044A044A044A044A(byte abyte0[], short word0, byte abyte1[], short word1, short word2)
    {
_L13:
        short word7 = word3;
        byte byte2 = byte1;
        short word5 = word0;
        short word6 = word1;
        short word4 = word2;
        if (word3 == 0)
        {
            word7 = word3;
            byte2 = byte1;
            word5 = word0;
            word6 = word1;
            word4 = word2;
            if (byte1 == 0)
            {
                byte byte0;
                try
                {
                    word3 = word1 / 2;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
                word3 = (short)word3;
                byte1 = abyte1[word3];
                try
                {
                    word4 = abyte0[(short)(word0 / 2)];
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
                byte0 = (byte)((byte1 & 0xf0) + (word4 & 0xf));
                abyte1[word3] = byte0;
                word4 = (short)(word2 - 1);
                word6 = (short)(word1 + 1);
                word5 = (short)(word0 + 1);
                byte2 = 1;
                word7 = 1;
            }
        }
        if (word7 == 0 || byte2 == 0) goto _L2; else goto _L1
_L1:
        b044A044A044A044A044A044A(abyte0, (short)(word5 / 2), abyte1, (short)(word6 / 2), (short)(word4 / 2));
        if (word4 % 2 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        word0 = (short)((short)(word6 + word4) / 2);
        abyte1[word0] = (byte)((abyte1[word0] & 0xf) + (abyte0[(short)((short)(word5 + word4) / 2)] & 0xf0));
        return;
_L3:
        while (word0 < word2) 
        {
            word3 = abyte0[word1];
            word1++;
            abyte1[word0] = (byte)((word3 << 4) + (abyte0[word1] >> 4 & 0xf));
            word0++;
        }
        if (word4 % 2 != 0)
        {
            word2 = abyte1[word0];
            word1 = abyte0[word1];
            if (((b042704270427042704270427() + b042604260426042604260426_int_static_fld) * b042704270427042704270427()) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = 84;
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
            }
            abyte1[word0] = (byte)((word1 << 4) + (word2 & 0xf));
            return;
        }
        break; /* Loop/switch isn't completed */
_L11:
        word2 += word0;
        while (word0 < word2) 
        {
            abyte1[word1] = (byte)((abyte1[word1] & 0xf0) + (abyte0[word0] >> 4 & 0xf));
            word1++;
            abyte1[word1] = (byte)((abyte1[word1] & 0xf) + (abyte0[word0] << 4));
            word0++;
        }
        if (word4 % 2 != 0)
        {
            word2 = abyte1[word1];
            abyte1[word1] = (byte)((abyte0[word0] >> 4 & 0xf) + (word2 & 0xf0));
            return;
        }
        break; /* Loop/switch isn't completed */
_L10:
        word1 = (short)(word5 / 2);
        word0 = (short)(word6 / 2);
        word2 = (short)(word4 / 2 + word0);
          goto _L3
_L2:
        if (byte2 == 0) goto _L5; else goto _L4
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 424
    //                   0 400
    //                   1 333;
           goto _L6 _L4 _L7
_L7:
        continue; /* Loop/switch isn't completed */
_L6:
        1;
        JVM INSTR tableswitch 0 1: default 448
    //                   0 400
    //                   1 333;
           goto _L6 _L4 _L8
_L8:
        if (true) goto _L10; else goto _L9
_L9:
_L5:
        word1 = (short)(word6 / 2);
        word0 = word5 / 2;
        word0 = word0;
        word2 = word4 / 2;
          goto _L11
        byte byte1 = 0;
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 60;
            b042604260426042604260426_int_static_fld = 28;
        }
        short word3;
        if (word0 % 2 == 0)
        {
            word3 = 1;
        } else
        {
            word3 = 0;
        }
        if (word1 % 2 == 0)
        {
            byte1 = 1;
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static String b044A044A044A044A044A044A(byte abyte0[], int i, int j, String s)
    {
        int k;
        if (abyte0 != null)
        {
            char c;
            Object obj;
            String s1;
            StringBuffer stringbuffer;
            int l;
            int i1;
            try
            {
                stringbuffer = new StringBuffer(j);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            k = 0;
        } else
        {
            return "";
        }
          goto _L1
_L9:
        l = k + i;
        i1 = abyte0[l];
        if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = 23;
            b042604260426042604260426_int_static_fld = 20;
        }
        if (i1 < 32 || abyte0[l] > 125) goto _L3; else goto _L2
_L2:
        c = (char)(abyte0[k + i] & 0xff);
        try
        {
            obj = (new StringBuilder()).append("").append(c);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        obj = ((StringBuilder) (obj)).toString();
_L5:
        obj = ((String) (obj)).toUpperCase();
        obj = (new StringBuilder()).append(((String) (obj)));
        stringbuffer.append(((StringBuilder) (obj)).append(s).toString());
        k++;
          goto _L1
_L3:
        l = abyte0[k + i];
        i1 = b042604260426042604260426_int_static_fld;
        switch ((i1 * (b042604260426042604260426_int_static_fld + i1)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 83;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
        s1 = Integer.toHexString(l & 0xff);
        obj = s1;
        if (s1.length() != 1) goto _L5; else goto _L4
_L4:
        obj = (new StringBuilder()).append('0').append(s1).toString();
          goto _L5
_L7:
        return stringbuffer.toString();
_L1:
        if (k >= j) goto _L7; else goto _L6
_L6:
        if (k != 0)
        {
label0:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break;
                }
            } while (true);
            if (k % 16 != 0);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static final short b044A044A044A044A044A044A(byte byte0, byte byte1)
    {
        byte0 = (short)byte0;
        byte1 = (short)byte1;
        if (((b042604260426042604260426_int_static_fld + b044A044A044A044A044A044A()) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
        {
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
        }
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        int i = b042604260426042604260426_int_static_fld;
        int j = b042604260426042604260426_int_static_fld;
        int k = b042604260426042604260426_int_static_fld;
label1:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label1;

                    case 1: // '\001'
                        continue label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
        switch ((i * (j + i)) % k)
        {
        default:
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = 72;
            // fall through

        case 0: // '\0'
            return (short)((byte0 << 8) + (byte1 & 0xff));
        }
    }

    public static long b044A044A044A044A044A044A()
    {
        int i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        try
        {
            throw new NullPointerException();
        }
        catch (Exception exception)
        {
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
        }
        long l;
        try
        {
            l = b042604260426042604260426_java_security_SecureRandom_static_fld.nextLong();
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        return l;
    }

    public static void b044A044A044A044A044A044A(String s, byte abyte0[], String s1, int i)
    {
        ppplpp.b0415041504150415041504150415(s, (new StringBuilder()).append(s1).append(grrrrr.b044C044C044C044C044C044C("+1", '\021', '\002')).toString());
        ppplpp.b0415041504150415041504150415(s, b044A044A044A044A044A044A(abyte0, 0, i, grrrrr.b044C044C044C044C044C044C("\u0142", '\221', '\001')));
    }

    public static byte[] b044A044A044A044A044A044A(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            int k = b042604260426042604260426_int_static_fld;
            switch ((k * (b042604260426042604260426_int_static_fld + k)) % b042604260426042604260426_int_static_fld)
            {
            default:
                b042604260426042604260426_int_static_fld = 48;
                b042604260426042604260426_int_static_fld = 40;
                // fall through

            case 0: // '\0'
                k = i / 2;
                break;
            }
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
            }
            abyte0[k] = (byte)(Character.digit(s.charAt(i), 16) << 4 | Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    public static void b044A044A044A044A044A044A(EnrollAndProvisionResponse enrollandprovisionresponse)
    {
        DynParams dynparams = enrollandprovisionresponse.getTokenInfo().getHceData().getDynParams();
        enrollandprovisionresponse.getTokenInfo().setToken(b044A044A044A044A044A044A());
        dynparams.setKey(b044A044A044A044A044A044A());
        dynparams.setMaxPmts(Integer.valueOf(b044A044A044A044A044A044A()));
        dynparams.setApi(b044A044A044A044A044A044A());
        dynparams.setKeyExpTS(Long.valueOf(b044A044A044A044A044A044A()));
        enrollandprovisionresponse = enrollandprovisionresponse.getTokenInfo().getHceData().getStaticParams().getQvsdcData().getQvsdcWithODA().getIcc();
        enrollandprovisionresponse.setIccPrivKExpo(b044A044A044A044A044A044A());
        int i;
        try
        {
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042704270427042704270427() != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                b042604260426042604260426_int_static_fld = 60;
            }
        }
        // Misplaced declaration of an exception variable
        catch (EnrollAndProvisionResponse enrollandprovisionresponse)
        {
            throw enrollandprovisionresponse;
        }
        i = b042604260426042604260426_int_static_fld;
        switch ((i * (b042604260426042604260426_int_static_fld + i)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 38;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            // fall through

        case 0: // '\0'
            return;
        }
        enrollandprovisionresponse;
        throw enrollandprovisionresponse;
        enrollandprovisionresponse;
        throw enrollandprovisionresponse;
        enrollandprovisionresponse;
    }

    public static byte[] b044A044A044A044A044A044A(String s, String s1, int i)
    {
        int j = 0;
        if (s == null)
        {
            return null;
        }
        byte abyte0[] = new byte[s.length() / 2];
        int k = b042604260426042604260426_int_static_fld;
        int i1 = b042604260426042604260426_int_static_fld;
        int j1 = b042604260426042604260426_int_static_fld;
        int k1 = b042604260426042604260426_int_static_fld;
        switch ((k1 * (b042604260426042604260426_int_static_fld + k1)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 83;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
        if (((k + i1) * j1) % b042704270427042704270427() != b044A044A044A044A044A044A())
        {
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
        }
        if (s1.equals(""))
        {
            for (int l = 0; l < s.length();)
            {
                abyte0[j] = (byte)Integer.parseInt(s.substring(l, l + 2), i);
                l += 2;
                j++;
            }

            return abyte0;
        } else
        {
            return b044A044A044A044A044A044A(s);
        }
    }

    public static void b044A044A044A044A044A044A(byte abyte0[], short word0, byte abyte1[], short word1, short word2)
    {
        int i = 0;
        do
        {
            if (i >= word2)
            {
                break;
            }
label0:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break;
                }
            } while (true);
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
            }
            abyte1[word1 + i] = abyte0[word0 + i];
            int j = i + 1;
            i = j;
            if (((b042604260426042604260426_int_static_fld + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042604260426042604260426_int_static_fld != b042604260426042604260426_int_static_fld)
            {
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                b042604260426042604260426_int_static_fld = b042704270427042704270427();
                i = j;
            }
        } while (true);
    }

    public static byte[] b044A044A044A044A044A044A(byte abyte0[], byte abyte1[])
    {
        byte abyte2[];
        int i;
        short word0;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            abyte2 = new byte[abyte0.length];
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        i = 0;
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        word0 = abyte0[i];
        j = b042604260426042604260426_int_static_fld;
        switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 27;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            // fall through

        case 0: // '\0'
            abyte2[i] = (byte)(word0 ^ abyte1[i]);
            break;
        }
        word0 = (short)(i + 1);
        try
        {
            j = b042604260426042604260426_int_static_fld;
            k = b042604260426042604260426_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        l = b042604260426042604260426_int_static_fld;
        i1 = b042604260426042604260426_int_static_fld;
        j1 = b042604260426042604260426_int_static_fld;
        i = word0;
        if (((j + k) * l) % i1 == j1)
        {
            continue; /* Loop/switch isn't completed */
        }
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        i = b042704270427042704270427();
        b042604260426042604260426_int_static_fld = i;
        i = word0;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_7;
_L1:
        return abyte2;
    }

    public byte[] b044A044A044A044A044A044A(byte abyte0[], int i, int j)
    {
        byte abyte1[];
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        try
        {
            abyte1 = new byte[j];
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
          goto _L1
_L3:
        k = b042604260426042604260426_int_static_fld;
        l = b042604260426042604260426_int_static_fld;
        i1 = b042604260426042604260426_int_static_fld;
        j1 = b042604260426042604260426_int_static_fld;
        k1 = b044A044A044A044A044A044A();
        if (((k + l) * i1) % j1 == k1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        k = b042604260426042604260426_int_static_fld;
        switch ((k * (b042604260426042604260426_int_static_fld + k)) % b042604260426042604260426_int_static_fld)
        {
        default:
            b042604260426042604260426_int_static_fld = 99;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        b042604260426042604260426_int_static_fld = b042704270427042704270427();
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return abyte1;
        abyte0;
        throw abyte0;
_L1:
        0;
        JVM INSTR tableswitch 0 1: default 148
    //                   0 8
    //                   1 125;
           goto _L2 _L3 _L1
_L2:
        0;
        JVM INSTR tableswitch 0 1: default 172
    //                   0 8
    //                   1 125;
           goto _L2 _L3 _L1
    }

    static 
    {
        int i;
        int j;
        try
        {
            b042604260426042604260426_java_lang_String_static_fld = rrrrrr/rgrrgg.getSimpleName();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            b042604260426042604260426_java_security_SecureRandom_static_fld = new SecureRandom();
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        i = b042604260426042604260426_int_static_fld;
        j = b042604260426042604260426_int_static_fld;
        switch ((j * (b042604260426042604260426_int_static_fld + j)) % b042704270427042704270427())
        {
        default:
            b042604260426042604260426_int_static_fld = 71;
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            break;

        case 0: // '\0'
            break;
        }
        if (((i + b042604260426042604260426_int_static_fld) * b042604260426042604260426_int_static_fld) % b042704270427042704270427() != b042604260426042604260426_int_static_fld)
        {
label0:
            do
            {
                switch (0)
                {
                default:
                    while (true) 
                    {
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
                        }
                    }
                    break;

                case 0: // '\0'
                    break label0;

                case 1: // '\001'
                    break;
                }
            } while (true);
            b042604260426042604260426_int_static_fld = b042704270427042704270427();
            b042604260426042604260426_int_static_fld = 77;
        }
    }
}
