// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com;

import android.os.Build;
import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;

// Referenced classes of package com:
//            c

public final class a
{

    public static boolean a;
    private static final byte b[];
    private static final String z[];

    private static void a()
    {
        int i;
        try
        {
            i = android.os.Build.VERSION.SDK_INT;
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw nosuchalgorithmexception;
        }
        if (i <= 18) goto _L2; else goto _L1
_L1:
        return;
_L2:
        java.security.Provider aprovider[];
        aprovider = Security.getProviders(z[9]);
        if (aprovider == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        i = aprovider.length;
        if (i < 1)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        boolean flag = com/c.equals(aprovider[0].getClass());
        if (flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        SecureRandom securerandom;
        NoSuchAlgorithmException nosuchalgorithmexception2;
        try
        {
            Security.insertProviderAt(new c(), 1);
        }
        // Misplaced declaration of an exception variable
        catch (NoSuchAlgorithmException nosuchalgorithmexception2)
        {
            throw nosuchalgorithmexception2;
        }
        securerandom = new SecureRandom();
        try
        {
            if (!com/c.equals(securerandom.getProvider().getClass()))
            {
                throw new SecurityException((new StringBuilder()).append(z[8]).append(securerandom.getProvider().getClass()).toString());
            }
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception1)
        {
            throw nosuchalgorithmexception1;
        }
        break MISSING_BLOCK_LABEL_136;
        nosuchalgorithmexception2;
        throw nosuchalgorithmexception2;
        nosuchalgorithmexception2;
        throw nosuchalgorithmexception2;
        try
        {
            nosuchalgorithmexception2 = SecureRandom.getInstance(z[7]);
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception3)
        {
            throw new SecurityException(z[11], nosuchalgorithmexception3);
        }
        if (com/c.equals(nosuchalgorithmexception2.getProvider().getClass())) goto _L1; else goto _L3
_L3:
        throw new SecurityException((new StringBuilder()).append(z[10]).append(nosuchalgorithmexception2.getProvider().getClass()).toString());
        nosuchalgorithmexception2;
        throw nosuchalgorithmexception2;
    }

    private static String b()
    {
        String s;
        try
        {
            s = (String)android/os/Build.getField(z[14]).get(null);
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    private static byte[] c()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s = Build.FINGERPRINT;
        byte abyte0[];
        if (s != null)
        {
            try
            {
                stringbuilder.append(s);
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                throw unsupportedencodingexception;
            }
        }
        s = b();
        if (s != null)
        {
            try
            {
                stringbuilder.append(s);
            }
            catch (UnsupportedEncodingException unsupportedencodingexception1)
            {
                throw unsupportedencodingexception1;
            }
        }
        try
        {
            abyte0 = stringbuilder.toString().getBytes(z[12]);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception2)
        {
            throw new RuntimeException(z[13]);
        }
        return abyte0;
    }

    private static byte[] d()
    {
        byte abyte0[];
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
            dataoutputstream.writeLong(System.currentTimeMillis());
            dataoutputstream.writeLong(System.nanoTime());
            dataoutputstream.writeInt(Process.myPid());
            dataoutputstream.writeInt(Process.myUid());
            dataoutputstream.write(b);
            dataoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        catch (IOException ioexception)
        {
            throw new SecurityException(z[15], ioexception);
        }
        return abyte0;
    }

    static byte[] e()
    {
        return d();
    }

    public static void f()
    {
        g();
        a();
    }

    private static void g()
    {
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L2; else goto _L1
_L1:
        int i = android.os.Build.VERSION.SDK_INT;
        if (i <= 18) goto _L3; else goto _L2
_L2:
        return;
        Exception exception;
        exception;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
_L3:
        try
        {
            Class.forName(z[2]).getMethod(z[0], new Class[] {
                [B
            }).invoke(null, new Object[] {
                d()
            });
            i = ((Integer)Class.forName(z[3]).getMethod(z[4], new Class[] {
                java/lang/String, Long.TYPE
            }).invoke(null, new Object[] {
                z[1], Integer.valueOf(1024)
            })).intValue();
        }
        catch (Exception exception1)
        {
            throw new SecurityException(z[6], exception1);
        }
        if (i == 1024) goto _L2; else goto _L4
_L4:
        throw new IOException((new StringBuilder()).append(z[5]).append(i).toString());
        exception;
        throw exception;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[16];
        obj = "\026\000Eb/7$nB";
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
                obj = "k%nP_13jH\024+,";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "+3l\b\0214 hN\025j)jT\035+/r\b\b*$\177\b\0006.}O\024!3%L\0037$%h\0210(}C368{R\037";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "+3l\b\0214 hN\025j)jT\035+/r\b\b*$\177\b\0006.}O\024!3%L\0037$%h\0210(}C368{R\037";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\026\000Eb/(.jB/\"(gC";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\021/n^\000!\"\177C\024d/~K\022!3+I\026d#rR\0257ayC\021 amT\037)aGO\03619+v\"\n\0061\006";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\002 bJ\025 a\177IP7$nBP\0131nH#\027\r+v\"\n\006";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\027\tJ\027 \026\017L";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "*$|\006#!\"~T\025\026 eB\037)i\"\006\022%\"`C\024d#r\006\0076.eAP\0243dP\031 $y\034P";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\027$hS\002!\023jH\024+,%u8\005p[t>\003";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\027$hS\002!\023jH\024+,%A\0250\beU\004%/hCXf\022CgA\024\023EaRmaiG\023/$o\006\022=a|T\037*&+v\002+7bB\0256{+";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                obj = "\027\tJ\027 \026\017L\006\036+5+G\006%(gG\022($";
                byte0 = 10;
                i = 11;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\021\025M\013H";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\021\025M\013Hd$eE\037 (eAP*.\177\006\00311{I\0020$o";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\027\004Yo1\b";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\002 bJ\025 a\177IP#$eC\002%5n\006\003!$o";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                z = as;
                b = c();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 440
    //                   0 463
    //                   1 470
    //                   2 477
    //                   3 484;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_484;
_L3:
        byte byte1 = 112;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 68;
          goto _L9
_L5:
        byte1 = 65;
          goto _L9
_L6:
        byte1 = 11;
          goto _L9
        byte1 = 38;
          goto _L9
    }
}
