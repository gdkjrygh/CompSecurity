// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.math.BigInteger;
import java.security.SecureRandom;

// Referenced classes of package com.whatsapp:
//            App

public class 
    implements 
{

    private static final BigInteger G;
    private static final BigInteger P;
    private static final String z[];
    private final SecureRandom secureRandom = new SecureRandom();

    public BigInteger generateDiffieHellmanSharedPublicKey(byte abyte0[])
    {
        BigInteger biginteger;
        byte abyte2[];
        int l;
        l = App.am;
        byte abyte1[] = new byte[193];
        secureRandom.nextBytes(abyte1);
        abyte1[0] = 0;
        biginteger = new BigInteger(abyte1);
        abyte2 = G.modPow(biginteger, P).toByteArray();
        if (abyte2.length <= abyte0.length) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = 0;
        do
        {
            if (i >= abyte2.length - abyte0.length)
            {
                break;
            }
            if (abyte2[i] != 0)
            {
                Log.e((new StringBuilder()).append(z[3]).append(abyte2.length).append(z[2]).append(abyte0.length).append(")").toString());
                return null;
            }
            i++;
        } while (l == 0);
        i = abyte2.length - abyte0.length;
        j = i;
        if (l == 0) goto _L4; else goto _L3
_L3:
        j = i;
        if (abyte2.length >= abyte0.length) goto _L4; else goto _L5
_L5:
        int k = 0;
_L8:
        j = i;
        if (k >= abyte0.length - abyte2.length) goto _L4; else goto _L6
_L6:
        abyte0[k] = 0;
        k++;
        if (l == 0) goto _L8; else goto _L7
_L7:
        j = i;
_L4:
        System.arraycopy(abyte2, j, abyte0, Math.max(abyte0.length - abyte2.length, 0), Math.min(abyte0.length, abyte2.length));
        return biginteger;
_L2:
        i = 0;
        if (true) goto _L3; else goto _L9
_L9:
    }

    public boolean generateDiffieHellmanSymmetricKey(BigInteger biginteger, byte abyte0[], byte abyte1[])
    {
        int l;
        l = App.am;
        byte abyte2[] = abyte0;
        if (abyte0[0] != 0)
        {
            abyte2 = new byte[abyte0.length + 1];
            abyte2[0] = 0;
            System.arraycopy(abyte0, 0, abyte2, 1, abyte0.length);
        }
        biginteger = (new BigInteger(abyte2)).modPow(biginteger, P).toByteArray();
        if (biginteger.length <= abyte1.length) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = 0;
        do
        {
            if (i >= biginteger.length - abyte1.length)
            {
                break;
            }
            if (biginteger[i] != 0)
            {
                Log.e((new StringBuilder()).append(z[0]).append(biginteger.length).append(z[1]).append(abyte1.length).append(")").toString());
                return false;
            }
            i++;
        } while (l == 0);
        i = biginteger.length - abyte1.length;
        j = i;
        if (l == 0) goto _L4; else goto _L3
_L3:
        j = i;
        if (biginteger.length >= abyte1.length) goto _L4; else goto _L5
_L5:
        int k = 0;
_L8:
        j = i;
        if (k >= abyte1.length - biginteger.length) goto _L4; else goto _L6
_L6:
        abyte1[k] = 0;
        k++;
        if (l == 0) goto _L8; else goto _L7
_L7:
        j = i;
_L4:
        System.arraycopy(biginteger, j, abyte1, Math.max(abyte1.length - biginteger.length, 0), Math.min(abyte1.length, biginteger.length));
        return true;
_L2:
        i = 0;
        if (true) goto _L3; else goto _L9
_L9:
    }

    public byte[] generateRandomBytes(int i)
    {
        byte abyte0[] = new byte[i];
        secureRandom.nextBytes(abyte0);
        return abyte0;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\030\027'ft\027\0207zw\037\rt`b\020\03213t\036\013t`k\034\0241g`\030\032txw\bYy-2\024\0277|v\024\035t\177w\037\036 {2Y";
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
                obj = "XY\"`2\002\t5pwQ\030\"r{\035\0306\177wQQ";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "XY\"`2\002\t5pwQ\030\"r{\035\0306\177wQQ";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\030\027'ft\027\0207zw\037\rt`b\020\03213t\036\013tcg\023\025=p2\032\034-3?OY1}q\036\0351w2\035\034:tf\031Y|";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "7?\022UT7?\022UT7?\022UT7:m#T58\025! @OlP BM\027'QGOf+PII\020P#2=e!+AK`V\"IA\025%%2:c'\"CI\026QW0OgQ#B@\026! DH`R\"INm+WBMd'V5<\022*'@@\026 Q5J\025'!@;g# 3I\025%V7KaU#EJc'T4Hg&$5O\020&#2K`&WEAaQ'FOb!'4N\021P$7M`P&C<mR$BN\021W$3I\026UTD:\026%TEIbQ%4=\021V!IO\026UPD8l*+78aRWH?f'#@N\027'P@?\021%&HKl%$DH\021PWEL\026 V2Kd#%2;lR#GJ\026U\"D@lWSEAg%#2LaW!H8b*#GJ\022R*7=f'Q7L\022+!GLaW B=\027R!0=m%#2OfU!DOf#*DLfQPH<\020& HIc$\"HOm%$5Oc#QBL`V&0;\027**AM\022\"%EO\027#*28f %BKcUT7?\022UT7?\022UT7?\022U";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                P = new BigInteger(z[4], 16);
                G = BigInteger.valueOf(2L);
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
        byte byte1 = 18;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 113;
          goto _L9
_L5:
        byte1 = 121;
          goto _L9
_L6:
        byte1 = 84;
          goto _L9
        byte1 = 19;
          goto _L9
    }

    public ()
    {
    }
}
