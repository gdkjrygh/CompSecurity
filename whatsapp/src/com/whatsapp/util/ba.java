// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.backport.util.Base64;
import com.whatsapp.al0;
import com.whatsapp.o4;
import com.whatsapp.x7;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.whatsapp.util:
//            Log, bf, bw

public class ba
{

    private static ba q;
    private static final String z[];
    private Cipher a;
    private Cipher b;
    private Cipher c;
    private Cipher d;
    private Cipher e;
    private Cipher f;
    private Cipher g;
    private Cipher h;
    private Cipher i;
    private Cipher j;
    private Cipher k;
    private Cipher l;
    private Cipher m;
    private boolean n;
    private Cipher o;
    byte p[];
    private Cipher r;
    private Cipher s;

    private ba()
    {
        p = new byte[0x20000];
        n = false;
        try
        {
            SecretKeySpec secretkeyspec = new SecretKeySpec(al0.t.getBytes(z[23]), z[17]);
            SecretKeySpec secretkeyspec1 = new SecretKeySpec(Base64.decode(z[12], 0), z[24]);
            SecretKeySpec secretkeyspec2 = new SecretKeySpec(o4.a(Base64.decode(z[21], 0)), z[31]);
            IvParameterSpec ivparameterspec = new IvParameterSpec(Base64.decode(z[11], 0));
            f = Cipher.getInstance(z[13]);
            l = Cipher.getInstance(z[14]);
            s = Cipher.getInstance(z[20]);
            k = Cipher.getInstance(z[16]);
            b = Cipher.getInstance(z[22]);
            i = Cipher.getInstance(z[32]);
            e = Cipher.getInstance(z[33]);
            j = Cipher.getInstance(z[35]);
            g = Cipher.getInstance(z[30]);
            m = Cipher.getInstance(z[36]);
            h = Cipher.getInstance(z[18]);
            d = Cipher.getInstance(z[26]);
            c = Cipher.getInstance(z[29]);
            r = Cipher.getInstance(z[28]);
            o = Cipher.getInstance(z[38]);
            a = Cipher.getInstance(z[25]);
            f.init(1, secretkeyspec);
            l.init(1, secretkeyspec1);
            s.init(1, secretkeyspec2);
            k.init(1, secretkeyspec2, ivparameterspec);
            b.init(1, secretkeyspec2, ivparameterspec);
            g.init(2, secretkeyspec);
            m.init(2, secretkeyspec1);
            h.init(2, secretkeyspec2);
            d.init(2, secretkeyspec2, ivparameterspec);
            c.init(2, secretkeyspec2, ivparameterspec);
            n = true;
            return;
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            Log.c(z[27], unsupportedencodingexception);
            return;
        }
        catch (NoSuchPaddingException nosuchpaddingexception)
        {
            Log.c(z[34], nosuchpaddingexception);
            return;
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            Log.c(z[37], nosuchalgorithmexception);
            return;
        }
        catch (InvalidKeyException invalidkeyexception)
        {
            Log.c(z[15], invalidkeyexception);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidalgorithmparameterexception)
        {
            Log.c(z[19], invalidalgorithmparameterexception);
        }
    }

    public static ba b()
    {
        try
        {
            if (q == null)
            {
                q = new ba();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        return q;
    }

    public void a(InputStream inputstream, OutputStream outputstream, int i1, int j1, long l1, x7 x7_1, 
            bw bw1, byte abyte0[], byte abyte1[])
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean flag;
        flag = Log.f;
        try
        {
            if (!n)
            {
                throw new IllegalStateException(z[40]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream;
        }
        obj2 = inputstream;
        obj3 = inputstream;
        obj4 = inputstream;
        obj5 = inputstream;
        obj = inputstream;
        obj1 = inputstream;
        bf.a[bw1.ordinal()];
        JVM INSTR tableswitch 1 8: default 104
    //                   1 183
    //                   2 209
    //                   3 236
    //                   4 263
    //                   5 290
    //                   6 313
    //                   7 313
    //                   8 417;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L7 _L8
_L1:
        long l2 = 0L;
label0:
        do
        {
            long l3;
            do
            {
                do
                {
                    int k1 = inputstream.read(p);
                    if (k1 < 0)
                    {
                        break label0;
                    }
                    outputstream.write(p, 0, k1);
                    l3 = l2 + (long)k1;
                    l2 = l3;
                } while (x7_1 == null);
                l2 = l3;
            } while (j1 <= 0);
            x7_1.a(l3, l1, i1, j1);
            l2 = l3;
        } while (!flag);
        return;
_L2:
        obj = new CipherInputStream(inputstream, g);
        inputstream = ((InputStream) (obj));
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj;
_L3:
        obj = new CipherInputStream(((InputStream) (obj2)), m);
        inputstream = ((InputStream) (obj));
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj3 = obj;
_L4:
        obj = new CipherInputStream(((InputStream) (obj3)), h);
        inputstream = ((InputStream) (obj));
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj4 = obj;
_L5:
        obj = new CipherInputStream(((InputStream) (obj4)), d);
        inputstream = ((InputStream) (obj));
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj5 = obj;
_L6:
        obj = new CipherInputStream(((InputStream) (obj5)), c);
        inputstream = ((InputStream) (obj));
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        obj1 = new SecretKeySpec(abyte0, z[43]);
        obj2 = new IvParameterSpec(abyte1);
        if (bw1 != bw.CRYPT6) goto _L10; else goto _L9
_L9:
        inputstream = r;
_L12:
        try
        {
            inputstream.init(2, ((java.security.Key) (obj1)), ((java.security.spec.AlgorithmParameterSpec) (obj2)));
            inputstream = new CipherInputStream(((InputStream) (obj)), inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.c(z[41], inputstream);
            inputstream = ((InputStream) (obj));
        }
        continue; /* Loop/switch isn't completed */
        inputstream;
        throw inputstream;
        inputstream;
        Log.c(z[44], inputstream);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
_L8:
        inputstream = new SecretKeySpec(abyte0, z[45]);
        bw1 = new IvParameterSpec(abyte1);
        try
        {
            abyte0 = a;
            abyte0.init(2, inputstream, bw1);
            inputstream = new GZIPInputStream(new CipherInputStream(((InputStream) (obj1)), abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.c(z[39], inputstream);
            inputstream = ((InputStream) (obj1));
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.c(z[42], inputstream);
            inputstream = ((InputStream) (obj1));
        }
        continue; /* Loop/switch isn't completed */
_L10:
        inputstream = o;
        if (true) goto _L12; else goto _L11
_L11:
        inputstream = ((InputStream) (obj));
        if (true) goto _L1; else goto _L13
_L13:
    }

    public void a(InputStream inputstream, OutputStream outputstream, bw bw1, byte abyte0[], byte abyte1[])
    {
        boolean flag = Log.f;
        if (!n) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        OutputStream outputstream1;
        Object obj2;
        Object obj3;
        OutputStream outputstream2;
        OutputStream outputstream3;
        OutputStream outputstream4;
        obj3 = outputstream;
        outputstream2 = outputstream;
        outputstream3 = outputstream;
        outputstream4 = outputstream;
        outputstream1 = outputstream;
        obj2 = outputstream;
        obj1 = outputstream;
        obj = outputstream;
        bf.a[bw1.ordinal()];
        JVM INSTR tableswitch 1 8: default 813
    //                   1 160
    //                   2 187
    //                   3 217
    //                   4 247
    //                   5 277
    //                   6 307
    //                   7 307
    //                   8 430;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L9 _L10
_L3:
        obj1 = outputstream;
        obj = outputstream;
        int i1 = inputstream.read(p);
        if (i1 < 0) goto _L12; else goto _L11
_L11:
        obj1 = outputstream;
        obj = outputstream;
        outputstream.write(p, 0, i1);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L12:
        try
        {
            outputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.e((new StringBuilder()).append(z[0]).append(inputstream.toString()).toString());
        }
_L17:
        if (!flag) goto _L13; else goto _L2
_L2:
        try
        {
            throw new IllegalStateException(z[2]);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream;
        }
_L4:
        obj1 = outputstream;
        obj = outputstream;
        outputstream = new CipherOutputStream(outputstream, f);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj3 = outputstream;
_L5:
        obj1 = obj3;
        obj = obj3;
        outputstream = new CipherOutputStream(((OutputStream) (obj3)), l);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        outputstream2 = outputstream;
_L6:
        obj1 = outputstream2;
        obj = outputstream2;
        outputstream = new CipherOutputStream(outputstream2, s);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        outputstream3 = outputstream;
_L7:
        obj1 = outputstream3;
        obj = outputstream3;
        outputstream = new CipherOutputStream(outputstream3, k);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        outputstream4 = outputstream;
_L8:
        obj1 = outputstream4;
        obj = outputstream4;
        outputstream = new CipherOutputStream(outputstream4, b);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        outputstream1 = outputstream;
_L9:
        obj1 = outputstream1;
        obj = outputstream1;
        obj2 = new IvParameterSpec(abyte1);
        obj1 = outputstream1;
        obj = outputstream1;
        obj3 = new SecretKeySpec(abyte0, z[6]);
        obj1 = outputstream1;
        obj = outputstream1;
        if (bw1 != bw.CRYPT6) goto _L15; else goto _L14
_L14:
        obj1 = outputstream1;
        obj = outputstream1;
        outputstream = i;
_L18:
        obj1 = outputstream1;
        obj = outputstream1;
        outputstream.init(1, ((java.security.Key) (obj3)), ((java.security.spec.AlgorithmParameterSpec) (obj2)));
        obj1 = outputstream1;
        obj = outputstream1;
        outputstream = new CipherOutputStream(outputstream1, outputstream);
        outputstream1 = outputstream;
_L16:
        outputstream = outputstream1;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = outputstream1;
_L10:
        obj1 = obj2;
        obj = obj2;
        outputstream = new IvParameterSpec(abyte1);
        obj1 = obj2;
        obj = obj2;
        bw1 = new SecretKeySpec(abyte0, z[10]);
        obj1 = obj2;
        obj = obj2;
        abyte0 = j;
        obj1 = obj2;
        obj = obj2;
        abyte0.init(1, bw1, outputstream);
        obj1 = obj2;
        obj = obj2;
        outputstream = new GZIPOutputStream(new CipherOutputStream(((OutputStream) (obj2)), abyte0));
        continue; /* Loop/switch isn't completed */
        outputstream;
        obj1 = outputstream1;
        obj = outputstream1;
        throw outputstream;
        outputstream;
        obj1 = outputstream1;
        obj = outputstream1;
        Log.c(z[5], outputstream);
          goto _L16
        inputstream;
        obj = obj1;
        Log.e((new StringBuilder()).append(z[9]).append(inputstream.toString()).toString());
        try
        {
            ((OutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            Log.e((new StringBuilder()).append(z[1]).append(inputstream.toString()).toString());
        }
          goto _L17
_L15:
        obj1 = outputstream1;
        obj = outputstream1;
        outputstream = e;
          goto _L18
        outputstream;
        obj1 = outputstream1;
        obj = outputstream1;
        Log.c(z[4], outputstream);
          goto _L16
        inputstream;
        try
        {
            ((OutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            Log.e((new StringBuilder()).append(z[3]).append(outputstream.toString()).toString());
        }
        throw inputstream;
        outputstream;
        obj1 = obj2;
        obj = obj2;
        Log.c(z[8], outputstream);
        outputstream = ((OutputStream) (obj2));
        continue; /* Loop/switch isn't completed */
        outputstream;
        obj1 = obj2;
        obj = obj2;
        Log.c(z[7], outputstream);
        outputstream = ((OutputStream) (obj2));
        continue; /* Loop/switch isn't completed */
_L13:
        return;
        if (true) goto _L3; else goto _L19
_L19:
    }

    public boolean a()
    {
        return n;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[46];
        obj = "-7\0207j8-\0267<-7\020j|=-\\,|h";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "-7\0207j8-\0267<-7\020j|=-\\,|h";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "-7\0207j8-\032*}h7\03413)/\022,\177);\037 ";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "-7\0207j8-\0267<-7\020j|=-\\,|h";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                i1 = 4;
                obj = "-7\0207j8-\0267<-7\0207j8-\\,}>8\037,w)5\0245r:8\036";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "-7\0207j8-\0267<-7\0207j8-\\,}>8\037,w#<\n";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "\t\034 ";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "-7\0207j8-\0267<-7\0207j8-\\,}>8\037,w)5\0245r:8\036";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "-7\0207j8-\0267<-7\0207j8-\\,}>8\037,w#<\n";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "-7\0207j8-\0267<-7\020jz'y";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "\t\034 ";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "\0003\035?r-2=6i97<uB:,D$d=\bNx";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "\002)#\027E\030\023E)K\r\n5\007{y\020\024#e\f5<<`>)&\027U\007\025";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "\t\034 ";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "\t\034 ";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                i1 = 15;
                obj = "-7\0207j8-\0267<!7\005$\177!=\030 j";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i1] = ((String) (obj));
                i1 = 16;
                obj = "\t\034 jP\034\013\\\013|\0308\027!z&>";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i1] = ((String) (obj));
                i1 = 17;
                obj = "\t\034 ";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i1] = ((String) (obj));
                i1 = 18;
                obj = "\t\034 ";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i1] = ((String) (obj));
                obj = "-7\0207j8-\0267<!7\005$\177!=\022)t88\001$~";
                byte0 = 18;
                i1 = 19;
                break;

            case 18: // '\022'
                as1[i1] = ((String) (obj));
                i1 = 20;
                obj = "\t\034 ";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i1] = ((String) (obj));
                i1 = 21;
                obj = "\"\f\000\023K\0057\\\"v\020\025J3c|\036'\037b\030**-c$\0031']-\r";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i1] = ((String) (obj));
                i1 = 22;
                obj = "\t\034 jP\n\032\\\025X\013\nF\025r,=\032+t";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i1] = ((String) (obj));
                i1 = 23;
                obj = "\t\n0\fZ";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i1] = ((String) (obj));
                i1 = 24;
                obj = "\t\034 ";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i1] = ((String) (obj));
                i1 = 25;
                obj = "\t\034 jP\n\032\\\025X\013\nF\025r,=\032+t";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i1] = ((String) (obj));
                i1 = 26;
                obj = "\t\034 jP\034\013\\\013|\0308\027!z&>";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i1] = ((String) (obj));
                i1 = 27;
                obj = "-7\0207j8-\0267<=7\0000c86\0011v,<\035&|,0\035\"";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i1] = ((String) (obj));
                i1 = 28;
                obj = "\t\034 jP\n\032\\\025X\013\nF\025r,=\032+t";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i1] = ((String) (obj));
                i1 = 29;
                obj = "\t\034 jP\n\032\\\025X\013\nF\025r,=\032+t";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i1] = ((String) (obj));
                i1 = 30;
                obj = "\t\034 ";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i1] = ((String) (obj));
                i1 = 31;
                obj = "\t\034 ";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i1] = ((String) (obj));
                i1 = 32;
                obj = "\t\034 jP\n\032\\\025X\013\nF\025r,=\032+t";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i1] = ((String) (obj));
                i1 = 33;
                obj = "\t\034 jP\n\032\\\025X\013\nF\025r,=\032+t";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i1] = ((String) (obj));
                i1 = 34;
                obj = "-7\0207j8-\0267<&6\0000p )\022!w!7\024";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i1] = ((String) (obj));
                i1 = 35;
                obj = "\t\034 jP\n\032\\\025X\013\nF\025r,=\032+t";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i1] = ((String) (obj));
                i1 = 36;
                obj = "\t\034 ";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i1] = ((String) (obj));
                i1 = 37;
                obj = "-7\0207j8-\0267<&6\0000p 8\037\"";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i1] = ((String) (obj));
                i1 = 38;
                obj = "\t\034 jP\n\032\\\025X\013\nF\025r,=\032+t";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i1] = ((String) (obj));
                i1 = 39;
                obj = "-7\0207j8-\0267<,<\0207j8-\\,}>8\037,w#<\n";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i1] = ((String) (obj));
                i1 = 40;
                obj = ",<\0207j8-\032*}h7\03413)/\022,\177);\037 ";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i1] = ((String) (obj));
                i1 = 41;
                obj = "-7\0207j8-\0267<,<\0207j8-\\,}>8\037,w#<\n";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i1] = ((String) (obj));
                i1 = 42;
                obj = "-7\0207j8-\0267<,<\0207j8-\\,}>8\037,w)5\0245r:8\036";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i1] = ((String) (obj));
                i1 = 43;
                obj = "\t\034 ";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i1] = ((String) (obj));
                i1 = 44;
                obj = "-7\0207j8-\0267<,<\0207j8-\\,}>8\037,w)5\0245r:8\036";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i1] = ((String) (obj));
                i1 = 45;
                obj = "\t\034 ";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i1] = ((String) (obj));
                z = as;
                q = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 1096
    //                   0 1119
    //                   1 1126
    //                   2 1133
    //                   3 1140;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1140;
_L3:
        byte byte1 = 19;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 72;
          goto _L9
_L5:
        byte1 = 89;
          goto _L9
_L6:
        byte1 = 115;
          goto _L9
        byte1 = 69;
          goto _L9
    }
}
