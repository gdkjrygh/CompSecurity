// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.backport.util.Base64;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class ni
{

    private static final String z[];

    private static PublicKey a(String s)
    {
        try
        {
            s = Base64.decode(s.getBytes(), 0);
            s = KeyFactory.getInstance(z[9]).generatePublic(new X509EncodedKeySpec(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(z[10]);
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public static boolean a(String s, String s1, String s2)
    {
label0:
        {
            try
            {
                if (!TextUtils.isEmpty(s))
                {
                    break label0;
                }
                Log.e(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return false;
        }
label1:
        {
            try
            {
                if (!TextUtils.isEmpty(s1))
                {
                    break label1;
                }
                Log.e(z[3]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return false;
        }
label2:
        {
            try
            {
                if (!TextUtils.isEmpty(s2))
                {
                    break label2;
                }
                Log.e(z[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return false;
        }
        boolean flag = a(a(s), s1, s2);
        Log.i((new StringBuilder()).append(z[1]).append(flag).toString());
        return flag;
    }

    private static boolean a(PublicKey publickey, String s, String s1)
    {
label0:
        {
            try
            {
                Signature signature = Signature.getInstance(z[5]);
                signature.initVerify(publickey);
                signature.update(s.getBytes());
                if (signature.verify(Base64.decode(s1, 0)))
                {
                    break label0;
                }
                Log.e(z[4]);
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                Log.a(z[6], publickey);
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                Log.a(z[8], publickey);
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (PublicKey publickey)
            {
                Log.a(z[7], publickey);
                return false;
            }
            return false;
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[11];
        obj = ";;d/]75'5Q+;n:\031)'z \\8!mlG05f\"@, mcQ4\"|:";
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
                obj = ";;d/]75'5Q+;n:\031)'z \\8!mlB< a%]<6(";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ";;d/]75'5Q+;n:\031)'z \\8!ml_<+(&Y)&q";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ";;d/]75'5Q+;n:\031)'z \\8!mlP8&icQ4\"|:";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = ";;d/]75'0Q:'z*@ }~&F04qlR8;d";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\n\032IrC0&`\021g\030";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ";;d/]75'0Q:'z*@ }~&F04qlQ!1m3@0=f";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = ";;d/]75'0Q:'z*@ }~&F04qlQ!1m3@0=f";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                obj = ";;d/]75'0Q:'z*@ }~&F04qlQ!1m3@0=f";
                byte0 = 7;
                i = 8;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\013\001I";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = ";;d/]75'0Q:'z*@ }o&Z< i7Qt\"}!X01%(Q }a-B8>a'\03127qnG)7k*R01i7]6<";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 347
    //                   1 354
    //                   2 361
    //                   3 368;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_368;
_L3:
        byte byte1 = 52;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 89;
          goto _L9
_L5:
        byte1 = 82;
          goto _L9
_L6:
        byte1 = 8;
          goto _L9
        byte1 = 67;
          goto _L9
    }
}
