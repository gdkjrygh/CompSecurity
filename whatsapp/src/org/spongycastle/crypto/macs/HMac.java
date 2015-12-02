// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.macs;

import java.util.Hashtable;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.util.Memoable;

public class HMac
    implements Mac
{

    private static final byte IPAD = 54;
    private static final byte OPAD = 92;
    public static int a;
    private static Hashtable blockLengths;
    private static final String z[];
    private int blockLength;
    private Digest digest;
    private int digestSize;
    private byte inputPad[];
    private Memoable ipadState;
    private Memoable opadState;
    private byte outputBuf[];

    public HMac(Digest digest1)
    {
        this(digest1, getByteLength(digest1));
    }

    private HMac(Digest digest1, int i)
    {
        digest = digest1;
        digestSize = digest1.getDigestSize();
        blockLength = i;
        inputPad = new byte[blockLength];
        outputBuf = new byte[blockLength + digestSize];
    }

    private static int getByteLength(Digest digest1)
    {
label0:
        {
            int i;
            try
            {
                if (!(digest1 instanceof ExtendedDigest))
                {
                    break label0;
                }
                i = ((ExtendedDigest)digest1).getByteLength();
            }
            // Misplaced declaration of an exception variable
            catch (Digest digest1)
            {
                throw digest1;
            }
            return i;
        }
        Integer integer = (Integer)blockLengths.get(digest1.getAlgorithmName());
        if (integer == null)
        {
            try
            {
                throw new IllegalArgumentException((new StringBuilder()).append(z[1]).append(digest1.getAlgorithmName()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Digest digest1)
            {
                throw digest1;
            }
        } else
        {
            return integer.intValue();
        }
    }

    private static void xorPad(byte abyte0[], int i, byte byte0)
    {
        int k = a;
        int j = 0;
        do
        {
            if (j >= i)
            {
                break;
            }
            abyte0[j] = (byte)(abyte0[j] ^ byte0);
            j++;
        } while (k == 0);
    }

    public int doFinal(byte abyte0[], int i)
    {
        int j = a;
        Memoable memoable;
        digest.doFinal(outputBuf, blockLength);
        memoable = opadState;
        if (memoable != null)
        {
            int k;
            try
            {
                ((Memoable)digest).reset(opadState);
                digest.update(outputBuf, blockLength, digest.getDigestSize());
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_98;
            }
        }
        digest.update(outputBuf, 0, outputBuf.length);
        k = digest.doFinal(abyte0, i);
        i = blockLength;
        do
        {
            if (i >= outputBuf.length)
            {
                break;
            }
            outputBuf[i] = 0;
            i++;
        } while (j == 0);
        abyte0 = ipadState;
        if (abyte0 != null)
        {
            try
            {
                ((Memoable)digest).reset(ipadState);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_190;
            }
        }
        digest.update(inputPad, 0, inputPad.length);
        try
        {
            if (BaseKeyGenerator.a)
            {
                a = j + 1;
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        return k;
        abyte0;
        throw abyte0;
        abyte0;
        throw abyte0;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(digest.getAlgorithmName()).append(z[0]).toString();
    }

    public int getMacSize()
    {
        return digestSize;
    }

    public Digest getUnderlyingDigest()
    {
        return digest;
    }

    public void init(CipherParameters cipherparameters)
    {
label0:
        {
            int k = a;
            digest.reset();
            cipherparameters = ((KeyParameter)cipherparameters).getKey();
            int j = cipherparameters.length;
            int i = j;
            if (j > blockLength)
            {
                digest.update(cipherparameters, 0, j);
                digest.doFinal(inputPad, 0);
                j = digestSize;
                i = j;
                if (k == 0)
                {
                    break label0;
                }
                boolean flag;
                try
                {
                    flag = BaseKeyGenerator.a;
                }
                // Misplaced declaration of an exception variable
                catch (CipherParameters cipherparameters)
                {
                    throw cipherparameters;
                }
                if (flag)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                BaseKeyGenerator.a = flag;
                i = j;
            }
            System.arraycopy(cipherparameters, 0, inputPad, 0, i);
        }
        do
        {
            if (i >= inputPad.length)
            {
                break;
            }
            inputPad[i] = 0;
            i++;
        } while (k == 0);
        try
        {
            System.arraycopy(inputPad, 0, outputBuf, 0, blockLength);
            xorPad(inputPad, blockLength, (byte)54);
            xorPad(outputBuf, blockLength, (byte)92);
            if (digest instanceof Memoable)
            {
                opadState = ((Memoable)digest).copy();
                ((Digest)opadState).update(outputBuf, 0, blockLength);
            }
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters)
        {
            throw cipherparameters;
        }
        try
        {
            digest.update(inputPad, 0, inputPad.length);
            if (digest instanceof Memoable)
            {
                ipadState = ((Memoable)digest).copy();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CipherParameters cipherparameters)
        {
            throw cipherparameters;
        }
    }

    public void reset()
    {
        digest.reset();
        digest.update(inputPad, 0, inputPad.length);
    }

    public void update(byte byte0)
    {
        digest.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        digest.update(abyte0, i, j);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "=vAI\t".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "gPgf%eP,l#u[\177|jb_\177{/v\004,".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 684
    //                   0 702
    //                   1 708
    //                   2 714
    //                   3 720;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_720;
_L1:
        byte0 = 74;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 18;
          goto _L7
_L3:
        byte0 = 62;
          goto _L7
_L4:
        byte0 = 12;
          goto _L7
        byte0 = 8;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            blockLengths = new Hashtable();
            obj = blockLengths;
            ac = "Uq_\\y&\017=".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_99;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 764
    //                   0 782
    //                   1 788
    //                   2 794
    //                   3 800;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_800;
_L8:
        byte1 = 74;
_L14:
        ac[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 18;
          goto _L14
_L10:
        byte1 = 62;
          goto _L14
_L11:
        byte1 = 12;
          goto _L14
        byte1 = 8;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(32));
            obj = blockLengths;
            ac = "_z>".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_142;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 844
    //                   0 862
    //                   1 868
    //                   2 874
    //                   3 880;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_880;
_L15:
        byte2 = 74;
_L21:
        ac[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 18;
          goto _L21
_L17:
        byte2 = 62;
          goto _L21
_L18:
        byte2 = 12;
          goto _L21
        byte2 = 8;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(16));
            obj = blockLengths;
            ac = "_z8".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_185;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 924
    //                   0 942
    //                   1 948
    //                   2 954
    //                   3 960;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_960;
_L22:
        byte3 = 74;
_L28:
        ac[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 18;
          goto _L28
_L24:
        byte3 = 62;
          goto _L28
_L25:
        byte3 = 12;
          goto _L28
        byte3 = 8;
          goto _L28
_L34:
        byte byte3;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(64));
            obj = blockLengths;
            ac = "_z9".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_228;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1004
    //                   0 1022
    //                   1 1028
    //                   2 1034
    //                   3 1040;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_1040;
_L29:
        byte4 = 74;
_L35:
        ac[i] = (char)(byte4 ^ c);
        i++;
          goto _L34
_L30:
        byte4 = 18;
          goto _L35
_L31:
        byte4 = 62;
          goto _L35
_L32:
        byte4 = 12;
          goto _L35
        byte4 = 8;
          goto _L35
_L41:
        byte byte4;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(64));
            obj = blockLengths;
            ac = "@w\\M\007V\017>0".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_271;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1084
    //                   0 1102
    //                   1 1108
    //                   2 1114
    //                   3 1120;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_1120;
_L36:
        byte5 = 74;
_L42:
        ac[i] = (char)(byte5 ^ c);
        i++;
          goto _L41
_L37:
        byte5 = 18;
          goto _L42
_L38:
        byte5 = 62;
          goto _L42
_L39:
        byte5 = 12;
          goto _L42
        byte5 = 8;
          goto _L42
_L48:
        byte byte5;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(64));
            obj = blockLengths;
            ac = "@w\\M\007V\017:8".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_314;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1164
    //                   0 1182
    //                   1 1188
    //                   2 1194
    //                   3 1200;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1200;
_L43:
        byte6 = 74;
_L49:
        ac[i] = (char)(byte6 ^ c);
        i++;
          goto _L48
_L44:
        byte6 = 18;
          goto _L49
_L45:
        byte6 = 62;
          goto _L49
_L46:
        byte6 = 12;
          goto _L49
        byte6 = 8;
          goto _L49
_L55:
        byte byte6;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(64));
            obj = blockLengths;
            ac = "AvM%{".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_357;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1244
    //                   0 1262
    //                   1 1268
    //                   2 1274
    //                   3 1280;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1280;
_L50:
        byte7 = 74;
_L56:
        ac[i] = (char)(byte7 ^ c);
        i++;
          goto _L55
_L51:
        byte7 = 18;
          goto _L56
_L52:
        byte7 = 62;
          goto _L56
_L53:
        byte7 = 12;
          goto _L56
        byte7 = 8;
          goto _L56
_L62:
        byte byte7;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(64));
            obj = blockLengths;
            ac = "AvM%x \n".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_400;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1324
    //                   0 1342
    //                   1 1348
    //                   2 1354
    //                   3 1360;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1360;
_L57:
        byte8 = 74;
_L63:
        ac[i] = (char)(byte8 ^ c);
        i++;
          goto _L62
_L58:
        byte8 = 18;
          goto _L63
_L59:
        byte8 = 62;
          goto _L63
_L60:
        byte8 = 12;
          goto _L63
        byte8 = 8;
          goto _L63
_L69:
        byte byte8;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(64));
            obj = blockLengths;
            ac = "AvM%x'\b".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_443;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1404
    //                   0 1422
    //                   1 1428
    //                   2 1434
    //                   3 1440;
           goto _L64 _L65 _L66 _L67 _L68
_L68:
        break MISSING_BLOCK_LABEL_1440;
_L64:
        byte9 = 74;
_L70:
        ac[i] = (char)(byte9 ^ c);
        i++;
          goto _L69
_L65:
        byte9 = 18;
          goto _L70
_L66:
        byte9 = 62;
          goto _L70
_L67:
        byte9 = 12;
          goto _L70
        byte9 = 8;
          goto _L70
_L76:
        byte byte9;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(64));
            obj = blockLengths;
            ac = "AvM%y*\n".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_486;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1484
    //                   0 1502
    //                   1 1508
    //                   2 1514
    //                   3 1520;
           goto _L71 _L72 _L73 _L74 _L75
_L75:
        break MISSING_BLOCK_LABEL_1520;
_L71:
        byte10 = 74;
_L77:
        ac[i] = (char)(byte10 ^ c);
        i++;
          goto _L76
_L72:
        byte10 = 18;
          goto _L77
_L73:
        byte10 = 62;
          goto _L77
_L74:
        byte10 = 12;
          goto _L77
        byte10 = 8;
          goto _L77
_L83:
        byte byte10;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(128));
            obj = blockLengths;
            ac = "AvM%\177#\f".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_530;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1564
    //                   0 1582
    //                   1 1588
    //                   2 1594
    //                   3 1600;
           goto _L78 _L79 _L80 _L81 _L82
_L82:
        break MISSING_BLOCK_LABEL_1600;
_L78:
        byte11 = 74;
_L84:
        ac[i] = (char)(byte11 ^ c);
        i++;
          goto _L83
_L79:
        byte11 = 18;
          goto _L84
_L80:
        byte11 = 62;
          goto _L84
_L81:
        byte11 = 12;
          goto _L84
        byte11 = 8;
          goto _L84
_L90:
        byte byte11;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(128));
            obj = blockLengths;
            ac = "FWkm8".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_574;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1644
    //                   0 1662
    //                   1 1668
    //                   2 1674
    //                   3 1680;
           goto _L85 _L86 _L87 _L88 _L89
_L89:
        break MISSING_BLOCK_LABEL_1680;
_L85:
        byte12 = 74;
_L91:
        ac[i] = (char)(byte12 ^ c);
        i++;
          goto _L90
_L86:
        byte12 = 18;
          goto _L91
_L87:
        byte12 = 62;
          goto _L91
_L88:
        byte12 = 12;
          goto _L91
        byte12 = 8;
          goto _L91
_L97:
        byte byte12;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(64));
            obj = blockLengths;
            ac = "EVez&bQcd".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_617;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1724
    //                   0 1742
    //                   1 1748
    //                   2 1754
    //                   3 1760;
           goto _L92 _L93 _L94 _L95 _L96
_L96:
        break MISSING_BLOCK_LABEL_1760;
_L92:
        byte13 = 74;
_L98:
        ac[i] = (char)(byte13 ^ c);
        i++;
          goto _L97
_L93:
        byte13 = 18;
          goto _L98
_L94:
        byte13 = 62;
          goto _L98
_L95:
        byte13 = 12;
          goto _L98
        byte13 = 8;
          goto _L98
_L105:
        byte byte13;
        if (j <= i)
        {
            ((Hashtable) (obj)).put((new String(ac)).intern(), Integer.valueOf(64));
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 1804
    //                   0 1822
    //                   1 1828
    //                   2 1834
    //                   3 1840;
           goto _L99 _L100 _L101 _L102 _L103
_L100:
        break; /* Loop/switch isn't completed */
_L103:
        break MISSING_BLOCK_LABEL_1840;
_L99:
        byte byte14 = 74;
_L106:
        ac[i] = (char)(byte14 ^ c);
        i++;
        if (true) goto _L105; else goto _L104
_L104:
        byte14 = 18;
          goto _L106
_L101:
        byte14 = 62;
          goto _L106
_L102:
        byte14 = 12;
          goto _L106
        byte14 = 8;
          goto _L106
    }
}
