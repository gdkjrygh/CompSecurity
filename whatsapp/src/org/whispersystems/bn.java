// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.a3;
import com.google.bp;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package org.whispersystems:
//            aO, aa, aD, a0, 
//            aI, b9, P, bY, 
//            bs, ae

public class bn
    implements aO
{

    private static final String z[];
    private final a0 a;
    private final byte b[];
    private final int c;
    private final int d;
    private final int e;
    private final byte f[];

    public bn(int i, SecretKeySpec secretkeyspec, a0 a0_1, int j, int k, byte abyte0[], ae ae1, 
            ae ae2)
    {
        byte abyte1[] = new byte[1];
        abyte1[0] = aa.a(i, 3);
        byte abyte2[] = aD.a().b(a3.a(a0_1.a())).a(j).b(k).a(a3.a(abyte0)).a().e();
        f = aa.a(new byte[][] {
            abyte1, abyte2, a(i, ae1, ae2, secretkeyspec, aa.a(new byte[][] {
                abyte1, abyte2
            }))
        });
        a = a0_1;
        c = j;
        d = k;
        b = abyte0;
        e = i;
    }

    public bn(byte abyte0[])
    {
        Object obj = aa.a(abyte0, 1, abyte0.length - 1 - 8, 8);
        byte byte0;
        byte abyte1[];
        byte0 = obj[0][0];
        abyte1 = obj[1];
        obj = obj[2];
        if (aa.a(byte0) <= 1)
        {
            throw new P((new StringBuilder()).append(z[2]).append(aa.a(byte0)).toString());
        }
        break MISSING_BLOCK_LABEL_92;
        abyte0;
        aD ad;
        boolean flag;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        throw new bY(abyte0);
        if (aa.a(byte0) > 3)
        {
            throw new bY((new StringBuilder()).append(z[3]).append(aa.a(byte0)).toString());
        }
        break MISSING_BLOCK_LABEL_136;
        abyte0;
        throw abyte0;
        ad = aD.a(abyte1);
        if (!ad.l())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        flag = ad.n();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        flag = ad.g();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        throw new bY(z[4]);
_L1:
        throw abyte0;
        abyte0;
        throw abyte0;
        abyte0;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
          goto _L1
        f = abyte0;
        a = bs.a(ad.o().f(), 0);
        e = aa.a(byte0);
        c = ad.c();
        d = ad.m();
        b = ad.j().f();
        return;
    }

    private byte[] a(int i, ae ae1, ae ae2, SecretKeySpec secretkeyspec, byte abyte0[])
    {
        Mac mac = Mac.getInstance(z[0]);
        mac.init(secretkeyspec);
        if (i < 3)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        mac.update(ae1.a().a());
        mac.update(ae2.a().a());
        try
        {
            return aa.a(mac.doFinal(abyte0), 8);
        }
        // Misplaced declaration of an exception variable
        catch (ae ae1) { }
        break MISSING_BLOCK_LABEL_67;
        ae1;
        throw ae1;
_L2:
        throw new AssertionError(ae1);
        ae1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int a()
    {
        return 2;
    }

    public a0 a()
    {
        return a;
    }

    public void a(int i, ae ae1, ae ae2, SecretKeySpec secretkeyspec)
    {
        byte abyte0[][] = aa.b(f, f.length - 8, 8);
        if (!MessageDigest.isEqual(a(i, ae1, ae2, secretkeyspec, abyte0[0]), abyte0[1]))
        {
            throw new bY(z[1]);
        } else
        {
            return;
        }
    }

    public int b()
    {
        return c;
    }

    public byte[] b()
    {
        return f;
    }

    public byte[] c()
    {
        return b;
    }

    public int d()
    {
        return e;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = "\026'\000\016V\026\013SX3";
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
                obj = "\034+\005MH?)@";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\022/\006\ff'j\f\bv-+\006\b?~";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\013$\n\003j)$A\033`,9\b\002kdj";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\027$\002\002h.&\004\031`~'\004\036v?-\004C";
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
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 214
    //                   1 221
    //                   2 228
    //                   3 235;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_235;
_L3:
        byte byte1 = 5;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 94;
          goto _L9
_L5:
        byte1 = 74;
          goto _L9
_L6:
        byte1 = 97;
          goto _L9
        byte1 = 109;
          goto _L9
    }
}
