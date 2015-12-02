// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import com.whatsapp.DialogToastActivity;
import com.whatsapp.o4;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;

// Referenced classes of package com.whatsapp.protocol:
//            bj, c4

public class ba
    implements bj
{

    private static final String z[];
    private final Cipher a;
    private final byte b[];
    private int c;
    private final Mac d;
    private final Cipher e;
    private int f;
    private final byte g[];
    private final Mac h;

    public ba(byte abyte0[], byte abyte1[])
    {
        javax.crypto.SecretKey secretkey;
        javax.crypto.SecretKey secretkey1;
        javax.crypto.SecretKey secretkey2;
        int i;
        i = c4.F;
        super();
        b = new byte[4];
        g = new byte[4];
        byte abyte2[] = new byte[abyte1.length + 1];
        System.arraycopy(abyte1, 0, abyte2, 0, abyte1.length);
        abyte2[abyte1.length] = 1;
        secretkey1 = o4.a(abyte0, abyte2, 2, 160);
        abyte2[abyte1.length] = 2;
        secretkey = o4.a(abyte0, abyte2, 2, 160);
        abyte2[abyte1.length] = 3;
        secretkey2 = o4.a(abyte0, abyte2, 2, 160);
        abyte2[abyte1.length] = 4;
        abyte0 = o4.a(abyte0, abyte2, 2, 160);
        a = Cipher.getInstance(z[2]);
        try
        {
            a.init(2, secretkey2);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        abyte1 = new byte[768];
        try
        {
            a.update(abyte1, 0, abyte1.length, abyte1, 0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        try
        {
            d = Mac.getInstance(z[4]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        try
        {
            d.init(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        e = Cipher.getInstance(z[1]);
        try
        {
            e.init(1, secretkey1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        abyte0 = new byte[768];
        try
        {
            e.update(abyte0, 0, abyte0.length, abyte0, 0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        try
        {
            h = Mac.getInstance(z[3]);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        try
        {
            h.init(secretkey);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        if (i != 0)
        {
            DialogToastActivity.g++;
        }
        return;
        abyte0;
_L4:
        throw new AssertionError(abyte0);
        abyte0;
_L2:
        throw new AssertionError(abyte0);
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(int i, byte abyte0[])
    {
        abyte0[0] = (byte)(i >>> 24);
        abyte0[1] = (byte)(i >>> 16);
        abyte0[2] = (byte)(i >>> 8);
        abyte0[3] = (byte)i;
    }

    public InputStream a(InputStream inputstream)
    {
        return new InflaterInputStream(inputstream);
    }

    public OutputStream a(OutputStream outputstream)
    {
        return new DeflaterOutputStream(outputstream);
    }

    public void a(byte abyte0[], int i, int j)
    {
        try
        {
            e.update(abyte0, i, j, abyte0, i);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            try
            {
                if (android.os.Build.VERSION.SDK_INT >= 9)
                {
                    throw new IOException(abyte0);
                }
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            throw new IOException((new StringBuilder()).append(z[5]).append(abyte0.getMessage()).toString());
        }
        h.update(abyte0, i, j);
    }

    public byte[] a()
    {
        int i = c;
        c = i + 1;
        a(i, b);
        h.update(b, 0, b.length);
        return h.doFinal();
    }

    public void b(byte abyte0[], int i, int j)
    {
        d.update(abyte0, i, j);
        try
        {
            a.update(abyte0, i, j, abyte0, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                throw new IOException(abyte0);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        throw new IOException((new StringBuilder()).append(z[0]).append(abyte0.getMessage()).toString());
    }

    public byte[] b()
    {
        int i = f;
        f = i + 1;
        a(i, g);
        d.update(g, 0, g.length);
        return d.doFinal();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "Q'\036zJ@:\027n[p\n\tk[r;\030gP\"+\004zWl(Ql[a=\bxJk \0372\036";
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
                obj = "C\0352<";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "C\0352<";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "J\0020KmJ\016@";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "J\0020KmJ\016@";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Q'\036zJ@:\027n[p\n\tk[r;\030gP\"+\004zWl(QmPa=\bxJk \0372\036";
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
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 245
    //                   2 252
    //                   3 259;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_259;
_L3:
        byte byte1 = 62;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 2;
          goto _L9
_L5:
        byte1 = 79;
          goto _L9
_L6:
        byte1 = 113;
          goto _L9
        byte1 = 8;
          goto _L9
    }
}
