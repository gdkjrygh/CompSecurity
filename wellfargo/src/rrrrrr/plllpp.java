// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.content.Context;
import android.content.Intent;
import com.visa.cbp.external.common.AidInfo;
import com.visa.cbp.external.common.DynParams;
import com.visa.cbp.external.common.ExpirationDate;
import com.visa.cbp.external.common.HCEData;
import com.visa.cbp.external.common.ICC;
import com.visa.cbp.external.common.MsdData;
import com.visa.cbp.external.common.QVSDCData;
import com.visa.cbp.external.common.QVSDCWithODA;
import com.visa.cbp.external.common.QVSDCWithoutODA;
import com.visa.cbp.external.common.StaticParams;
import com.visa.cbp.external.common.TokenInfo;
import com.visa.cbp.external.common.Track2DataDec;
import com.visa.cbp.external.common.Track2DataNotDec;
import com.visa.cbp.sdk.facade.activeaccountmanagement.ReplenishmentCheckService;
import com.visa.cbp.sdk.facade.data.TokenKey;
import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

// Referenced classes of package rrrrrr:
//            lpllpp, grrrrr, rgrrgg, rrrrgg, 
//            ppplpp, pllppl, rrgggg, ppplpl, 
//            rrgrgg, ggrrrr, rggrrr, grgrgr, 
//            rggrgg, llplpp, plpllp, lllppl, 
//            pplppp

public class plllpp
    implements lpllpp
{

    public static String b041E041E041E041E041E041E = "";
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static Object b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[];
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 3;
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static final short b042C042C042C042C042C042C_short_static_fld = 32;
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static Object b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[];
    public static short b042C042C042C042C042C042C_short_static_fld = 0;
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 7;
    public static short b042C042C042C042C042C042C_short_static_fld = 0;
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static short b042C042C042C042C042C042C_short_static_fld = 0;
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 1;
    public static short b042C042C042C042C042C042C_short_static_fld = 0;
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 9;
    public static short b042C042C042C042C042C042C_short_static_fld = 0;
    public static Object b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[];
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 5;
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static String b043504350435043504350435_java_lang_String_static_fld;
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static String b043504350435043504350435_java_lang_String_static_fld;
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static String b043504350435043504350435_java_lang_String_static_fld;
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static byte b043504350435043504350435_byte_static_fld = 0;
    public static final boolean b043504350435043504350435_boolean_static_fld = false;
    public static String b043504350435043504350435_java_lang_String_static_fld;
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static byte b044604460446044604460446_byte_array1d_static_fld[];
    public static Context b044604460446044604460446_android_content_Context_static_fld;
    private static Cipher b044604460446044604460446_javax_crypto_Cipher_static_fld;
    public static int b044604460446044604460446_int_static_fld = 80;
    public static byte b044604460446044604460446_byte_array1d_static_fld[];
    public static ppplpl b044604460446044604460446_rrrrrr_ppplpl_static_fld;
    public static int b044604460446044604460446_int_static_fld = 0;
    public static int b044604460446044604460446_int_static_fld = 2;
    public static byte b044604460446044604460446_byte_array1d_static_fld[];
    public static pplppp b044604460446044604460446_rrrrrr_pplppp_static_fld;
    private static RSAPrivateCrtKeySpec b044604460446044604460446_java_security_spec_RSAPrivateCrtKeySpec_static_fld;
    public static PrintWriter b044604460446044604460446_java_io_PrintWriter_static_fld;
    private static MessageDigest b044604460446044604460446_java_security_MessageDigest_static_fld;
    public static byte b044604460446044604460446_byte_array1d_static_fld[];
    public static String b044604460446044604460446_java_lang_String_static_fld;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b041E041E041E041E041E041E;
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static short b042C042C042C042C042C042C_short_array1d_static_fld[];
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 2;
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static short b042C042C042C042C042C042C_short_array1d_static_fld[];
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static int b042C042C042C042C042C042C_int_static_fld = 0;
    public static final short b042C042C042C042C042C042C_short_array1d_static_fld[];
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 6;
    public static short b042C042C042C042C042C042C_short_static_fld = 0;
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static Object b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[];
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 8;
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static short b042C042C042C042C042C042C_short_array1d_static_fld[];
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static String b042C042C042C042C042C042C_java_lang_String_static_fld;
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static byte b042C042C042C042C042C042C_byte_array1d_static_fld[];
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static final byte b042C042C042C042C042C042C_byte_static_fld = 4;
    public static byte b042C042C042C042C042C042C_byte_static_fld = 0;
    public static short b042C042C042C042C042C042C_short_static_fld = 0;
    public static String b043504350435043504350435_java_lang_String_static_fld;
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static String b043504350435043504350435_java_lang_String_static_fld;
    public static final String b043504350435043504350435_java_lang_String_static_fld;
    public static String b043504350435043504350435_java_lang_String_static_fld;
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static String b043504350435043504350435_java_lang_String_static_fld;
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static final boolean b043504350435043504350435_boolean_static_fld = true;
    public static String b043504350435043504350435_java_lang_String_static_fld;
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static byte b043504350435043504350435_byte_array1d_static_fld[];
    public static int b044604460446044604460446_int_static_fld = 0;
    public static byte b044604460446044604460446_byte_array1d_static_fld[];
    public static volatile TokenKey b044604460446044604460446_com_visa_cbp_sdk_facade_data_TokenKey_static_fld;
    private static short b044604460446044604460446_short_static_fld = 0;
    private static String b044604460446044604460446_java_lang_String_static_fld;
    private static Cipher b044604460446044604460446_javax_crypto_Cipher_static_fld;
    public static String b044604460446044604460446_java_lang_String_static_fld;
    public static String b044604460446044604460446_java_lang_String_static_fld;
    public static int b044604460446044604460446_int_static_fld = 1;
    public static byte b044604460446044604460446_byte_array1d_static_fld[];
    public static plpllp b044604460446044604460446_rrrrrr_plpllp_static_fld;
    public static String b044604460446044604460446_java_lang_String_static_fld;
    public static File b044604460446044604460446_java_io_File_static_fld = null;
    private static Cipher b044604460446044604460446_javax_crypto_Cipher_static_fld;
    public static byte b044604460446044604460446_byte_array1d_static_fld[];

    public plllpp()
    {
    }

    public static byte[] b0415041504150415041504150415(byte abyte0[])
    {
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 0
    //                   1 51;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 48
    //                   0 0
    //                   1 51;
           goto _L1 _L2 _L3
_L3:
        abyte0 = b0415041504150415041504150415(abyte0, (short)0);
        if (abyte0.length <= 2) goto _L5; else goto _L4
_L4:
        byte abyte1[];
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[(short)(abyte0.length + 4)];
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        int i = (short)1;
        abyte1[0] = -128;
        short word0;
        try
        {
            abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        word0 = (short)(i + 1);
        try
        {
            abyte1[i] = (byte)abyte0.length;
            rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)abyte0.length);
            i = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        word0 = (short)((short)i + word0);
        if (((b044604460446044604460446_int_static_fld + b0421042104210421042104210421()) * b044604460446044604460446_int_static_fld) % b0421042104210421042104210421() != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 10;
            b044604460446044604460446_int_static_fld = 56;
        }
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)-28672);
_L7:
        return b042C042C042C042C042C042C_byte_array1d_static_fld;
_L5:
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[(short)abyte0.length];
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, (short)abyte0.length);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static byte b0415041504150415041504150415(byte abyte0[])
    {
        short word0;
        short word1;
        int i;
        short word2;
        try
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld[0] = 106;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0 = b043504350435043504350435_java_lang_String_static_fld;
            if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
            {
                b044604460446044604460446_int_static_fld = 95;
                b044604460446044604460446_int_static_fld = 11;
            }
            ppplpp.b0415041504150415041504150415(abyte0, grrrrr.b044C044C044C044C044C044C("\202\245\245\236\240\232\245{\245\250\234\244\214\242\263\236~\261\234\236\251\255\242\250\247Ym", '9', '\005'));
            return -91;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            ppplpp.b0415041504150415041504150415(b043504350435043504350435_java_lang_String_static_fld, grrrrr.b044C044C044C044C044C044C("c\202\205q\202\205\205\212\217\210f\231\204\206\221\225\212\220\217AU", ')', '\b', '\002'));
            return -91;
        }
        word0 = (short)1;
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)-27391);
        word0 += 2;
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)770);
        word0 += 2;
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)b042C042C042C042C042C042C_int_static_fld);
        i = (short)(word0 + 2);
        word2 = (short)((short)(b044604460446044604460446_short_static_fld - 3 - 25) + i);
        Arrays.fill(b042C042C042C042C042C042C_byte_array1d_static_fld, i, word2, (byte)-69);
        word0 = (short)(i + (short)(b044604460446044604460446_short_static_fld - 3 - 25));
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[8], b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)4);
        word1 = (short)(word0 + 4);
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[1], b042C042C042C042C042C042C_byte_array1d_static_fld, word1, (short)6);
        word1 += 6;
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[5], b042C042C042C042C042C042C_byte_array1d_static_fld, word1, (short)2);
        i = (short)(word1 + 2);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        abyte0[i] = 1;
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[4];
        (new Random()).nextBytes(b042C042C042C042C042C042C_byte_array1d_static_fld);
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word1, (short)4);
        word1 += 4;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word1, (short)2);
        i = (short)(word1 + 2);
        b044604460446044604460446_java_security_MessageDigest_static_fld.update(b042C042C042C042C042C042C_byte_array1d_static_fld, 1, ((b044604460446044604460446_short_static_fld + 23) - 3 - 25) + 2);
        abyte0 = b044604460446044604460446_java_security_MessageDigest_static_fld.digest();
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)abyte0.length);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
          goto _L1
_L5:
        abyte0[(short)(word0 + 20)] = -68;
        abyte0 = b044604460446044604460446_javax_crypto_Cipher_static_fld.doFinal(b042C042C042C042C042C042C_byte_array1d_static_fld);
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, (short)abyte0.length);
        i = b0421042104210421042104210421();
        switch ((i * (b0421042104210421042104210421() + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 88;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            // fall through

        case 0: // '\0'
            return -91;
        }
_L1:
        0;
        JVM INSTR tableswitch 0 1: default 448
    //                   0 475
    //                   1 423;
           goto _L2 _L3 _L1
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 472
    //                   0 423
    //                   1 475;
           goto _L2 _L1 _L3
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 500
    //                   0 272
    //                   1 423;
           goto _L4 _L5 _L1
_L4:
        0;
        JVM INSTR tableswitch 0 1: default 524
    //                   0 272
    //                   1 423;
           goto _L4 _L5 _L1
    }

    private static int b0415041504150415041504150415(byte abyte0[], short word0, short word1)
    {
_L3:
        abyte0 = rgrrgg.b044A044A044A044A044A044A(String.format(abyte0, new Object[] {
            Integer.valueOf(b042C042C042C042C042C042C_int_static_fld)
        }));
        byte abyte1[] = rrrrgg.b041504150415041504150415;
        word0 = b044604460446044604460446_int_static_fld;
        switch ((word0 * (b044604460446044604460446_int_static_fld + word0)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 44;
            // fall through

        case 0: // '\0'
            word1 = (short)13;
            break;
        }
        abyte1[12] = (byte)((rrrrgg.b042604260426042604260426[1] << 4) + rrrrgg.b042604260426042604260426[2]);
        abyte1 = rrrrgg.b041504150415041504150415;
        word0 = (short)(word1 + 1);
        abyte1[word1] = (byte)((rrrrgg.b042604260426042604260426[3] << 4) + rrrrgg.b042604260426042604260426[4]);
        word1 = b044604460446044604460446_int_static_fld;
        switch ((word1 * (b044604460446044604460446_int_static_fld + word1)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 85;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            // fall through

        case 0: // '\0'
            abyte1 = rrrrgg.b041504150415041504150415;
            break;
        }
        word1 = (short)(word0 + 1);
        abyte1[word0] = (byte)((rrrrgg.b042604260426042604260426[5] << 4) + rrrrgg.b042604260426042604260426[6]);
        abyte1 = rrrrgg.b041504150415041504150415;
        word0 = (short)(word1 + 1);
        abyte1[word1] = abyte0[1];
        abyte1 = rrrrgg.b041504150415041504150415;
        word1 = (short)(word0 + 1);
        abyte1[word0] = abyte0[2];
        abyte0 = rrrrgg.b041504150415041504150415;
        word0 = (short)(word1 + 1);
        abyte0[word1] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[0] << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[1]);
        rrrrgg.b041504150415041504150415[word0] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[2] << 4) + (rrrrgg.b041504150415041504150415[word0] & 0xf));
        return 0;
        if (b042C042C042C042C042C042C_byte_static_fld == -91 && b042C042C042C042C042C042C_byte_static_fld == 90 && b042C042C042C042C042C042C_byte_static_fld == -91)
        {
            String s = (new StringBuilder()).append(b042C042C042C042C042C042C_java_lang_String_static_fld).append(grrrrr.b044C044C044C044C044C044C("\u0172", '\250', '\206', '\003')).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).toString();
            abyte0 = s;
            if (s.length() % 2 != 0)
            {
                abyte0 = (new StringBuilder()).append(s).append(grrrrr.b044C044C044C044C044C044C("\uFF47", 'U', '\004')).toString();
            }
            rrrrgg.b041504150415041504150415 = rgrrgg.b044A044A044A044A044A044A(abyte0, "", 16);
            return 0;
        }
        abyte0 = grrrrr.b044C044C044C044C044C044C("\uFF5B\uFF66\uFF6C\uFF9A", '\312', '\0');
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 436
    //                   0 413
    //                   1 132;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 460
    //                   0 436
    //                   1 487;
           goto _L4 _L1 _L5
_L4:
        0;
        JVM INSTR tableswitch 0 1: default 484
    //                   0 487
    //                   1 436;
           goto _L4 _L5 _L1
_L5:
        0;
        JVM INSTR tableswitch 0 1: default 512
    //                   0 132
    //                   1 413;
           goto _L1 _L3 _L2
    }

    public static boolean b0415041504150415041504150415(TokenKey tokenkey)
    {
        boolean flag1 = false;
        rrgrgg rrgrgg1;
        Context context;
        int i;
        boolean flag;
        try
        {
            pllppl.b041B041B041B041B041B041B();
            i = rrgggg.b044104410441044104410441_byte_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        flag = flag1;
        if (rrgggg.b044104410441044104410441_byte_static_fld != 9)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        flag = flag1;
        if (i != 4)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        b044604460446044604460446_rrrrrr_ppplpl_static_fld.b041B041B041B041B041B041B(tokenkey, b042C042C042C042C042C042C_int_static_fld);
        b044604460446044604460446_rrrrrr_ppplpl_static_fld.b041B041B041B041B041B041B(tokenkey);
        rrgrgg1 = new rrgrgg();
        rrgrgg1.b043604360436043604360436(tokenkey);
        rrgrgg1.setTimeStamp(ggrrrr.b044C044C044C044C044C044C());
        rrgrgg1.setUnpredictableNumber(b042C042C042C042C042C042C_java_lang_String_static_fld);
        rrgrgg1.setAtc(b042C042C042C042C042C042C_int_static_fld);
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            i = b044604460446044604460446_int_static_fld;
            switch ((i * (b0421042104210421042104210421() + i)) % b0421042104210421042104210421())
            {
            default:
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                break;

            case 0: // '\0'
                break;
            }
        }
        try
        {
            rrgrgg1.b044C044C044C044C044C044C(b044604460446044604460446_rrrrrr_ppplpl_static_fld.b041B041B041B041B041B041B(tokenkey).b044C044C044C044C044C044C());
            rrgrgg1.setTransactionType(b044604460446044604460446_java_lang_String_static_fld);
            context = grgrgr.b042B042B042B042B042B042B();
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        (new rggrgg(context)).b041F041F041F041F041F041F(tokenkey, rrgrgg1);
        rrgggg.b044104410441044104410441_byte_static_fld = 0;
        context.startService(new Intent(context, com/visa/cbp/sdk/facade/activeaccountmanagement/ReplenishmentCheckService));
        flag = true;
        return flag;
    }

    private static byte b0415041504150415041504150415()
    {
        byte byte0;
        byte byte1;
        byte1 = -91;
        int i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 14;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            // fall through

        case 0: // '\0'
            byte0 = byte1;
            break;
        }
        if (b042C042C042C042C042C042C_int_static_fld >= 65535) goto _L2; else goto _L1
_L1:
        int j;
        b042C042C042C042C042C042C_int_static_fld++;
        j = b042C042C042C042C042C042C_int_static_fld;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b0421042104210421042104210421())
        {
            b044604460446044604460446_int_static_fld = 27;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        byte0 = byte1;
        if (j >= 65535) goto _L2; else goto _L3
_L3:
        if (b042C042C042C042C042C042C_int_static_fld > 0) goto _L5; else goto _L4
_L4:
        byte0 = byte1;
_L2:
        return byte0;
_L6:
        byte0 = byte1;
        1;
        JVM INSTR tableswitch 0 1: default 148
    //                   0 151
    //                   1 119;
           goto _L6 _L7 _L2
_L7:
        byte0 = byte1;
        1;
        JVM INSTR tableswitch 0 1: default 176
    //                   0 151
    //                   1 119;
           goto _L6 _L7 _L2
_L5:
        byte1 = 90;
          goto _L7
    }

    private static byte b0415041504150415041504150415(byte abyte0[])
    {
        int i;
        try
        {
            throw new NullPointerException();
        }
        catch (Exception exception)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        i = abyte0[7];
        if ((i & 0x20) == 0) goto _L2; else goto _L1
_L1:
        if (b042C042C042C042C042C042C_byte_static_fld != 90) goto _L2; else goto _L3
_L12:
        if ((i & 1) != 0)
        {
            try
            {
                i = b042C042C042C042C042C042C_byte_static_fld;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
            if (i != 90)
            {
                try
                {
                    b042C042C042C042C042C042C_byte_static_fld = 90;
                    b042C042C042C042C042C042C_byte_static_fld = 2;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    throw abyte0;
                }
                i = 0;
                try
                {
                    do
                    {
                        i /= 0;
                    } while (true);
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    b044604460446044604460446_int_static_fld = 19;
                }
                return 90;
            }
        }
          goto _L4
_L2:
        if ((i & 0xffffff80) == 0) goto _L6; else goto _L5
_L5:
        if (b042C042C042C042C042C042C_byte_static_fld != 90) goto _L6; else goto _L7
_L7:
        b042C042C042C042C042C042C_byte_static_fld = 0;
        return 90;
_L4:
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = 1;
        return 90;
_L6:
        return -91;
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 148
    //                   0 38
    //                   1 124;
           goto _L8 _L9 _L3
_L9:
        continue; /* Loop/switch isn't completed */
_L8:
        1;
        JVM INSTR tableswitch 0 1: default 172
    //                   0 124
    //                   1 38;
           goto _L8 _L3 _L10
_L10:
        if (true) goto _L12; else goto _L11
_L11:
    }

    private static byte[] b0415041504150415041504150415(byte abyte0[], short word0)
    {
        short word1;
        byte abyte1[];
        byte abyte2[];
        byte abyte3[];
        short word3;
        int i;
        try
        {
            abyte3 = (byte[])(byte[])b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word0];
            abyte1 = new byte[256];
            abyte1 = new byte[256];
            abyte2 = new byte[256];
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        if (word0 != 0) goto _L2; else goto _L1
_L1:
        if (b0415041504150415041504150415() == 90)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        rrgggg.b044104410441044104410441_byte_static_fld = 127;
        abyte0 = new byte[2];
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte0, (short)0, (short)abyte0.length);
        return abyte0;
        word1 = rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, b042C042C042C042C042C042C_short_array1d_static_fld[word0]);
        if (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word0] == null || (short)abyte3.length == 0) goto _L4; else goto _L3
_L3:
        rgrrgg.b044A044A044A044A044A044A(abyte3, (short)0, abyte1, word1, (short)abyte3.length);
        word3 = (short)((short)abyte3.length + word1);
_L8:
        if (b042C042C042C042C042C042C_byte_static_fld != 90 || rrrrgg.b042604260426042604260426 == null) goto _L6; else goto _L5
_L5:
        i = rrrrgg.b042604260426042604260426[1];
        if ((i & 0x20) == 0);
_L6:
        abyte2 = b042C042C042C042C042C042C_short_array1d_static_fld;
        if ((abyte2[word0] & 0x2000) == 0)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        if (rrrrgg.b042604260426042604260426 != null && (rrrrgg.b042604260426042604260426[1] & 0x20) == 0 && b042C042C042C042C042C042C_byte_static_fld == 90)
        {
            if (b042C042C042C042C042C042C_byte_static_fld == -91)
            {
                b0415041504150415041504150415();
            }
            b0415041504150415041504150415(abyte0);
        }
        abyte0 = new byte[word3];
        word0 = b044604460446044604460446_int_static_fld;
        switch ((word0 * (b044604460446044604460446_int_static_fld + word0)) % b0421042104210421042104210421())
        {
        default:
            b044604460446044604460446_int_static_fld = 52;
            b044604460446044604460446_int_static_fld = 62;
            break;

        case 0: // '\0'
            break;
        }
        rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, abyte0, (short)0, (short)abyte0.length);
        return abyte0;
_L25:
        abyte3 = rrrrgg.b041504150415041504150415;
        byte abyte4[];
        rgrrgg.b044A044A044A044A044A044A(abyte4, (short)0, abyte1, word1, (short)abyte3.length);
        word1 += (short)rrrrgg.b041504150415041504150415.length;
_L22:
        short word2 = word1;
        if (rrrrgg.b041504150415041504150415 != null)
        {
            b0415041504150415041504150415((short)rrrrgg.b041504150415041504150415.length, abyte2);
            rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte1, word1, (short)(rrrrgg.b041504150415041504150415.length + 3));
            word2 = (short)(word1 + (short)(rrrrgg.b041504150415041504150415.length + 3));
        }
        word1 = word2;
        if (rrrrgg.b041504150415041504150415 == null)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        abyte1[rgrrgg.b044A044A044A044A044A044A(abyte1, word2, (short)-24794)] = (byte)rrrrgg.b041504150415041504150415.length;
        word1 = (short)(word2 + 3);
        rgrrgg.b044A044A044A044A044A044A(b0415041504150415041504150415(abyte0), (short)0, abyte1, word1, (short)rrrrgg.b041504150415041504150415.length);
        word3 = rrrrgg.b041504150415041504150415.length;
        word1 += (short)word3;
        word2 = word1;
        if (rrrrgg.b042604260426042604260426 == null)
        {
            break MISSING_BLOCK_LABEL_473;
        }
        abyte1[rgrrgg.b044A044A044A044A044A044A(abyte1, word1, (short)-24793)] = (byte)rrrrgg.b042604260426042604260426.length;
        word1 += 3;
        abyte2 = rrrrgg.b042604260426042604260426;
        word3 = rrrrgg.b042604260426042604260426.length;
        word2 = (short)word3;
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte1, word1, word2);
        word3 = rrrrgg.b042604260426042604260426.length;
        word2 = (short)(word1 + (short)word3);
        abyte1[rgrrgg.b044A044A044A044A044A044A(abyte1, word2, (short)-24778)] = 2;
        word2 = rgrrgg.b044A044A044A044A044A044A(abyte1, (short)(word2 + 3), (short)b042C042C042C042C042C042C_int_static_fld);
        word1 = word2;
        if (rrrrgg.b042604260426042604260426 == null)
        {
            break MISSING_BLOCK_LABEL_568;
        }
        abyte1[rgrrgg.b044A044A044A044A044A044A(abyte1, word2, (short)-24724)] = (byte)rrrrgg.b042604260426042604260426.length;
        word1 = (short)(word2 + 3);
        abyte2 = rrrrgg.b042604260426042604260426;
        word3 = rrrrgg.b042604260426042604260426.length;
        word2 = (short)word3;
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte1, word1, word2);
        word3 = rrrrgg.b042604260426042604260426.length;
        word1 += (short)word3;
        word2 = word1;
        if (rrrrgg.b042604260426042604260426 == null)
        {
            break MISSING_BLOCK_LABEL_663;
        }
        abyte1[rgrrgg.b044A044A044A044A044A044A(abyte1, word1, (short)-24722)] = (byte)rrrrgg.b042604260426042604260426.length;
        word1 += 3;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte1, word1, (short)rrrrgg.b042604260426042604260426.length);
        word3 = rrrrgg.b042604260426042604260426.length;
        word3 = (short)word3;
        if (((b0421042104210421042104210421() + b044604460446044604460446_int_static_fld) * b0421042104210421042104210421()) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        word2 = (short)(word1 + word3);
        word3 = word2;
        if (b042C042C042C042C042C042C_byte_static_fld != 90) goto _L8; else goto _L7
_L7:
        word3 = word2;
        if (b042C042C042C042C042C042C_byte_static_fld != 90) goto _L8; else goto _L9
_L9:
        word1 = word2;
        if (rrrrgg.b042604260426042604260426 == null)
        {
            break MISSING_BLOCK_LABEL_743;
        }
        abyte1[rgrrgg.b044A044A044A044A044A044A(abyte1, word2, (short)-24708)] = (byte)rrrrgg.b042604260426042604260426.length;
        word1 = (short)(word2 + 3);
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte1, word1, (short)rrrrgg.b042604260426042604260426.length);
        word3 = rrrrgg.b042604260426042604260426.length;
        word1 += (short)word3;
        word3 = word1;
        if (rrrrgg.b042604260426042604260426 == null) goto _L8; else goto _L10
_L10:
        abyte1[rgrrgg.b044A044A044A044A044A044A(abyte1, word1, (short)24352)] = (byte)rrrrgg.b042604260426042604260426.length;
        word1 += 3;
        abyte2 = rrrrgg.b042604260426042604260426;
        abyte3 = rrrrgg.b042604260426042604260426;
        word3 = abyte3.length;
        word2 = (short)word3;
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte1, word1, word2);
        word3 = rrrrgg.b042604260426042604260426.length;
        word3 = (short)(word1 + (short)word3);
          goto _L8
_L18:
        word1 = rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, (short)-32254);
        word2 = rgrrgg.b044A044A044A044A044A044A(abyte1, word1, b042C042C042C042C042C042C_short_array1d_static_fld[word0]);
        word1 = word2;
        if (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word0] == null) goto _L12; else goto _L11
_L11:
        word1 = word2;
        if ((short)abyte3.length == 0) goto _L12; else goto _L13
_L13:
        word3 = (short)(word2 + 1);
          goto _L14
_L32:
        abyte1[word2] = -108;
        word1 = (short)(word3 + 1);
        abyte1[word3] = (byte)abyte3.length;
        word3 = abyte3.length;
        word2 = (short)word3;
        rgrrgg.b044A044A044A044A044A044A(abyte3, (short)0, abyte1, word1, word2);
        word1 = (short)((short)abyte3.length + word1);
_L12:
        word3 = b0415041504150415041504150415();
        if (word3 == 90) goto _L16; else goto _L15
_L15:
        rrgggg.b044104410441044104410441_byte_static_fld = 127;
        abyte0 = new byte[2];
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte0, (short)0, (short)abyte0.length);
        return abyte0;
        abyte0;
        throw abyte0;
_L2:
        word3 = b0415041504150415041504150415(abyte0);
        if (word3 != -91)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = new byte[2];
        abyte1 = b044604460446044604460446_byte_array1d_static_fld;
        rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, abyte0, (short)0, (short)abyte0.length);
        return abyte0;
        if (b042C042C042C042C042C042C_byte_static_fld != 90 || b042C042C042C042C042C042C_byte_static_fld == 90) goto _L18; else goto _L17
_L17:
        word2 = rgrrgg.b044A044A044A044A044A044A(abyte1, rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, (short)-32254), b042C042C042C042C042C042C_short_array1d_static_fld[1]);
        abyte3 = (byte[])(byte[])b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[1];
        abyte4 = ((byte []) (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld));
        word1 = word2;
        if (abyte4[1] == null) goto _L12; else goto _L19
_L19:
        word3 = abyte3.length;
        word1 = word2;
        if ((short)word3 == 0) goto _L12; else goto _L20
_L20:
        word3 = (short)(word2 + 1);
        abyte1[word2] = -108;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld == b0421042104210421042104210421())
        {
            break MISSING_BLOCK_LABEL_1144;
        }
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        if (((b044604460446044604460446_int_static_fld + b0421042104210421042104210421()) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 14;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        word1 = (short)(word3 + 1);
        abyte1[word3] = (byte)abyte3.length;
        word3 = abyte3.length;
        word2 = (short)word3;
        int j;
        int k;
        int l;
        rgrrgg.b044A044A044A044A044A044A(abyte3, (short)0, abyte1, word1, word2);
        word3 = b044604460446044604460446_int_static_fld;
        i = b044604460446044604460446_int_static_fld;
        j = b044604460446044604460446_int_static_fld;
        k = b044604460446044604460446_int_static_fld;
        l = b044604460446044604460446_int_static_fld;
        if (((word3 + i) * j) % k == l)
        {
            break MISSING_BLOCK_LABEL_1231;
        }
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        word1 = (short)((short)abyte3.length + word1);
          goto _L12
_L29:
        b0415041504150415041504150415();
        b0415041504150415041504150415(rrrrgg.b041504150415041504150415, (short)0, (short)rrrrgg.b041504150415041504150415.length);
_L30:
        word3 = (short)(word1 + 1);
        abyte1[word1] = 87;
        word1 = (short)(word3 + 1);
        abyte1[word3] = (byte)rrrrgg.b041504150415041504150415.length;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b041504150415041504150415, (short)0, abyte1, word1, (short)rrrrgg.b041504150415041504150415.length);
        word3 = rrrrgg.b041504150415041504150415.length;
        word2 = (short)(word1 + (short)word3);
_L27:
        abyte3 = rrrrgg.b041504150415041504150415;
        word1 = word2;
        if (abyte3 == null) goto _L22; else goto _L21
_L21:
        abyte1[rgrrgg.b044A044A044A044A044A044A(abyte1, word2, (short)24372)] = (byte)rrrrgg.b041504150415041504150415.length;
        word1 = (short)(word2 + 3);
        abyte4 = rrrrgg.b041504150415041504150415;
_L24:
        1;
        JVM INSTR tableswitch 0 1: default 1376
    //                   0 1354
    //                   1 273;
           goto _L23 _L24 _L25
_L23:
        0;
        JVM INSTR tableswitch 0 1: default 1400
    //                   0 273
    //                   1 1354;
           goto _L23 _L25 _L24
_L16:
        word2 = word1;
        if (rrrrgg.b041504150415041504150415 == null) goto _L27; else goto _L26
_L26:
        if (b042C042C042C042C042C042C_byte_static_fld != -91 || b042C042C042C042C042C042C_byte_static_fld != 90 || b042C042C042C042C042C042C_byte_static_fld != -91) goto _L29; else goto _L28
_L28:
        abyte3 = rrrrgg.b041504150415041504150415;
        word3 = rrrrgg.b041504150415041504150415.length;
        word2 = (short)word3;
        b0415041504150415041504150415(abyte3, (short)0, word2);
          goto _L30
_L4:
        word3 = word1;
          goto _L8
_L14:
        0;
        JVM INSTR tableswitch 0 1: default 1492
    //                   0 870
    //                   1 1470;
           goto _L31 _L32 _L14
_L31:
        0;
        JVM INSTR tableswitch 0 1: default 1516
    //                   0 870
    //                   1 1470;
           goto _L31 _L32 _L14
    }

    public static int b0415041504150415041504150415(byte abyte0[], short word0, short word1)
    {
        short word2;
label0:
        do
        {
            word2 = word0;
            switch (0)
            {
            default:
                while (true) 
                {
                    word2 = word0;
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
label1:
        do
        {
            int i;
            do
            {
                if (word2 >= word1)
                {
                    break label1;
                }
                i = rgrrgg.b044A044A044A044A044A044A(abyte0, word2, b042C042C042C042C042C042C_short_array1d_static_fld);
                if (b042C042C042C042C042C042C_short_array1d_static_fld[0] != 165 && b042C042C042C042C042C042C_short_array1d_static_fld[0] != -16628)
                {
                    break;
                }
                word0 = (short)(word2 + i);
                word2 = word0;
                if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
                {
                    b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                    b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                    word2 = word0;
                }
            } while (true);
            if (b042C042C042C042C042C042C_short_array1d_static_fld[0] == -24776)
            {
                b042C042C042C042C042C042C_short_static_fld = rgrrgg.b044A044A044A044A044A044A(abyte0, (short)(word2 + i), b042C042C042C042C042C042C_short_array1d_static_fld[1], b042C042C042C042C042C042C_short_array1d_static_fld, b042C042C042C042C042C042C_short_array1d_static_fld, (short)7);
            }
            word0 = (short)((short)(b042C042C042C042C042C042C_short_array1d_static_fld[1] + i) + word2);
            i = b044604460446044604460446_int_static_fld;
            word2 = word0;
            switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
            {
            default:
                b044604460446044604460446_int_static_fld = 67;
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                word2 = word0;
                break;

            case 0: // '\0'
                break;
            }
        } while (true);
        return 0;
    }

    private static byte[] b0415041504150415041504150415(byte abyte0[])
    {
        if (rrrrgg.b042604260426042604260426[0] != 17) goto _L2; else goto _L1
_L1:
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[65];
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[1], b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, (short)6);
        short word0 = (short)6;
        short word1;
        byte abyte1[];
        int i;
        try
        {
            rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[8], b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)4);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            try
            {
                throw abyte0;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        try
        {
            if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
            {
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                b044604460446044604460446_int_static_fld = 0;
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        word0 += 4;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = b042C042C042C042C042C042C_int_static_fld;
        word1 = (short)i;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word0, word1);
        word0 += 2;
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)1, abyte1, word0, (short)1);
        i = (short)(word0 + 1);
_L5:
        return b044604460446044604460446_rrrrrr_plpllp_static_fld.b041B041B041B041B041B041B(b044604460446044604460446_rrrrrr_ppplpl_static_fld, b044604460446044604460446_com_visa_cbp_sdk_facade_data_TokenKey_static_fld, b042C042C042C042C042C042C_byte_array1d_static_fld);
_L2:
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[65];
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[1], b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, (short)6);
        word0 = (short)6;
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[2], b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)6);
        word0 += 6;
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[3], b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)2);
        word0 += 2;
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[4], b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)5);
        word0 += 5;
        word1 = b042C042C042C042C042C042C_short_array1d_static_fld[5];
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, abyte1, word0, (short)2);
        word0 += 2;
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[6], b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)3);
        word0 += 3;
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[7], b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)1);
        word0++;
        word1 = b042C042C042C042C042C042C_short_array1d_static_fld[8];
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, abyte1, word0, (short)4);
        word0 += 4;
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[1], b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, (short)6);
        b042C042C042C042C042C042C_java_lang_String_static_fld = rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, 0, 6, "");
        rgrrgg.b044A044A044A044A044A044A(abyte0, b042C042C042C042C042C042C_short_array1d_static_fld[8], b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, (short)4);
        b042C042C042C042C042C042C_java_lang_String_static_fld = rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, 0, 4, "");
        if (b042C042C042C042C042C042C_byte_static_fld != 90 || b042C042C042C042C042C042C_byte_static_fld == 90) goto _L4; else goto _L3
_L3:
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, b042C042C042C042C042C042C_short_array1d_static_fld[1]);
        word0 += 2;
_L6:
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)b042C042C042C042C042C042C_int_static_fld);
        word0 += 2;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b041504150415041504150415, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rrrrgg.b041504150415041504150415.length);
        i = rrrrgg.b041504150415041504150415.length;
        i = (short)(word0 + i);
          goto _L5
        abyte0;
        throw abyte0;
_L4:
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, b042C042C042C042C042C042C_short_array1d_static_fld[(short)b042C042C042C042C042C042C_byte_static_fld]);
        word0 += 2;
          goto _L6
    }

    public static byte[] b0415041504150415041504150415(byte abyte0[])
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static void b0415041504150415041504150415()
    {
        short word0;
        short word1 = 0;
        short word2;
        short word3;
        byte abyte0[];
        short aword0[];
        int i;
        short word5;
        try
        {
            abyte0 = b0421042104210421042104210421(b042C042C042C042C042C042C_byte_array1d_static_fld[0], b042C042C042C042C042C042C_byte_array1d_static_fld[1]);
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        if (b042C042C042C042C042C042C_byte_array1d_static_fld != null) goto _L4; else goto _L3
_L3:
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[16];
_L10:
        i = abyte0.length;
        i = (short)i;
        word0 = word1;
        if (((b0421042104210421042104210421() + b044604460446044604460446_int_static_fld) * b0421042104210421042104210421()) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 54;
            b044604460446044604460446_int_static_fld = 37;
            word0 = word1;
        }
_L7:
        if (word0 >= i) goto _L6; else goto _L5
_L5:
        aword0 = b042C042C042C042C042C042C_short_array1d_static_fld;
label0:
        {
            short word4;
            short word6;
            try
            {
                word4 = rgrrgg.b044A044A044A044A044A044A(abyte0, word0, aword0);
                word5 = b042C042C042C042C042C042C_short_array1d_static_fld[0];
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
            if (word5 != 112)
            {
                break label0;
            }
            word0 += word4;
        }
          goto _L7
        if (b042C042C042C042C042C042C_short_array1d_static_fld[0] != 87) goto _L9; else goto _L8
_L8:
        b042C042C042C042C042C042C_byte_array1d_static_fld[2] = (byte)(word0 + 2);
          goto _L6
_L15:
        i = b042C042C042C042C042C042C_byte_array1d_static_fld[2];
        word1 = i;
        word0 = rgrrgg.b044A044A044A044A044A044A(abyte0, word1);
        word2 = (short)(word1 * 2 + 4);
        aword0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        word3 = (short)(word0 - 4);
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, aword0, (short)4, word3);
        word1 = (short)(word1 * 2 + word0 + 1);
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)7);
        b042C042C042C042C042C042C_short_static_fld = (short)(word0 + 8);
_L2:
        return;
_L4:
        Arrays.fill(b042C042C042C042C042C042C_byte_array1d_static_fld, (byte)0);
          goto _L10
_L9:
        word6 = b042C042C042C042C042C042C_short_array1d_static_fld[1];
        word0 += (short)(word4 + word6);
          goto _L7
_L6:
        1;
        JVM INSTR tableswitch 0 1: default 316
    //                   0 294
    //                   1 146;
           goto _L11 _L6 _L12
_L12:
        continue; /* Loop/switch isn't completed */
_L11:
        1;
        JVM INSTR tableswitch 0 1: default 340
    //                   0 294
    //                   1 146;
           goto _L11 _L6 _L13
_L13:
        if (true) goto _L15; else goto _L14
_L14:
          goto _L7
    }

    public static int b0415041504150415041504150415(byte abyte0[], byte abyte1[])
    {
        byte byte0 = abyte0[2];
        byte byte1 = (byte)(abyte0[3] >> 3 & 0x1f);
        short word0;
        short word1;
        short word2;
        byte abyte2[];
        int i;
        short word3;
        try
        {
            abyte2 = b0421042104210421042104210421(byte1, byte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (abyte2 == null)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        i = abyte2.length;
        if (((b0421042104210421042104210421() + b044604460446044604460446_int_static_fld) * b0421042104210421042104210421()) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        i += 2;
        abyte0 = new byte[i];
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte0, (short)0, (short)abyte2.length);
        abyte0[abyte2.length] = -112;
        abyte0[(short)(abyte2.length + 1)] = 0;
        if (b042C042C042C042C042C042C_byte_static_fld != 0) goto _L2; else goto _L1
_L1:
        if (b042C042C042C042C042C042C_short_static_fld != -1 && b042C042C042C042C042C042C_byte_array1d_static_fld != null && byte1 == b042C042C042C042C042C042C_byte_array1d_static_fld[0] && byte0 == b042C042C042C042C042C042C_byte_array1d_static_fld[1])
        {
            b0415041504150415041504150415();
            b0421042104210421042104210421(abyte0);
        }
_L4:
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, (short)0, (short)abyte0.length);
        i = abyte0.length;
        return i;
_L8:
        try
        {
            i = b042C042C042C042C042C042C_byte_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (byte1 != i) goto _L4; else goto _L3
_L3:
        if (byte0 != b042C042C042C042C042C042C_byte_static_fld) goto _L4; else goto _L5
_L5:
        i = b042C042C042C042C042C042C_short_static_fld;
        word0 = (short)(i + 1);
        abyte0[i] = 1;
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, abyte0, word0, (short)4);
        word0 += 4;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte0, word0, (short)2);
        i = (short)(word0 + 2);
        i = (short)(abyte0[1] + b042C042C042C042C042C042C_short_static_fld);
        if (i < 128)
        {
            break MISSING_BLOCK_LABEL_438;
        }
        abyte2 = new byte[(short)(abyte0.length + b042C042C042C042C042C042C_short_static_fld + 1)];
        abyte2[0] = 112;
        word3 = (short)1;
        abyte2[word3] = -127;
        word3++;
        abyte2[word3] = (byte)i;
        word0 = (short)(word3 + 1);
        word1 = (short)(word0 - 1);
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            break;

        case 0: // '\0'
            break;
        }
        i = abyte0.length;
        word2 = (short)(i - word0);
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, abyte2, word0, word2);
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, abyte2, (short)(b042C042C042C042C042C042C_short_static_fld + 1), (short)b042C042C042C042C042C042C_byte_array1d_static_fld.length);
        abyte2[(short)(abyte2.length - 2)] = -112;
        abyte2[(short)(abyte2.length - 1)] = 0;
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte1, (short)0, (short)abyte2.length);
        return abyte2.length;
        i = abyte0.length;
        word3 = b042C042C042C042C042C042C_short_static_fld;
        i += word3;
        abyte2 = new byte[i];
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte2, (short)0, (short)abyte0.length);
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, abyte2, b042C042C042C042C042C042C_short_static_fld, (short)b042C042C042C042C042C042C_byte_array1d_static_fld.length);
        abyte2[(short)(abyte2.length - 2)] = -112;
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 5;
            b044604460446044604460446_int_static_fld = 70;
            break;

        case 0: // '\0'
            break;
        }
        abyte2[(short)(abyte2.length - 1)] = 0;
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte1, (short)0, (short)abyte2.length);
        i = abyte2.length;
        return i;
_L2:
        if (b042C042C042C042C042C042C_byte_static_fld != 2) goto _L4; else goto _L6
_L6:
        i = b042C042C042C042C042C042C_byte_static_fld;
        if (i != -91) goto _L8; else goto _L7
_L7:
        b0415041504150415041504150415();
          goto _L4
        return -8;
    }

    public static int b0415041504150415041504150415(byte abyte0[], byte abyte1[])
    {
        int j;
        j = -15;
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b044604460446044604460446_java_lang_String_static_fld = "";
        if (abyte0[2] == 4) goto _L2; else goto _L1
_L1:
        return j;
_L6:
        if (b042C042C042C042C042C042C_byte_static_fld == -91)
        {
            b0421042104210421042104210421();
        }
        int i;
        int k;
        int l;
        if (b043504350435043504350435_byte_array1d_static_fld != null)
        {
            rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_byte_array1d_static_fld, (short)0, abyte1, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
            rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte1, (short)(b043504350435043504350435_byte_array1d_static_fld.length - 2), (short)b044604460446044604460446_byte_array1d_static_fld.length);
            i = b043504350435043504350435_byte_array1d_static_fld.length;
        } else
        {
            i = -3;
        }
_L4:
        j = i;
        1;
        JVM INSTR tableswitch 0 1: default 108
    //                   0 83
    //                   1 25;
           goto _L3 _L4 _L1
_L3:
        j = i;
        0;
        JVM INSTR tableswitch 0 1: default 132
    //                   0 25
    //                   1 83;
           goto _L3 _L1 _L4
_L2:
        if (abyte0[3] == 0 || abyte0[3] == 2) goto _L6; else goto _L5
_L5:
        i = b044604460446044604460446_int_static_fld;
        k = b044604460446044604460446_int_static_fld;
        l = b044604460446044604460446_int_static_fld;
        if (((b044604460446044604460446_int_static_fld + b0421042104210421042104210421()) * b044604460446044604460446_int_static_fld) % b0421042104210421042104210421() != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 61;
        }
        switch ((i * (k + i)) % l)
        {
        default:
            b044604460446044604460446_int_static_fld = 71;
            break; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;
        }
        if (true) goto _L1; else goto _L7
_L7:
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        return -15;
    }

    public static int b0421042104210421042104210421()
    {
        return 0;
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
        byte abyte0[] = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word1 = (short)1;
        abyte0[0] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int i = (short)(word1 + 1);
        abyte0[word1] = -30;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        abyte0[i] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word2 = (short)(word1 + 1);
        abyte0[word1] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(word2 + 1);
        abyte0[word2] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        abyte0[word1] = 2;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word3 = (short)(i + 1);
        if (((b0421042104210421042104210421() + b044604460446044604460446_int_static_fld) * b0421042104210421042104210421()) % b044604460446044604460446_int_static_fld != b0421042104210421042104210421())
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 67;
        }
        abyte0[i] = 2;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word3 + 1);
        abyte0[word3] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word4 = (short)(i + 1);
        abyte0[i] = 112;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(word4 + 1);
        if (((b044604460446044604460446_int_static_fld + b0421042104210421042104210421()) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        abyte0[word4] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        abyte0[word1] = -112;
        if (rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length >= 128)
        {
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
            word1 = (short)(i + 1);
            abyte0[i] = -127;
            i = word1;
        }
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word0 = (short)(i + 1);
        abyte0[i] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        String s = b041E041E041E041E041E041E;
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
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(s), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        word1 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        s[word1] = -97;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        s[i] = 50;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(word1 + 1);
        s[word1] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        s = b041E041E041E041E041E041E;
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 12;
            // fall through

        case 0: // '\0'
            rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(s), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
            break;
        }
        word1 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        s[word1] = -110;
        if (rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length >= 128)
        {
            s = b042C042C042C042C042C042C_byte_array1d_static_fld;
            word1 = (short)(i + 1);
            s[i] = -127;
            i = word1;
        }
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        s[i] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        s[i] = -113;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(word1 + 1);
        s[word1] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 58;
            b044604460446044604460446_int_static_fld = 99;
        }
        s[word4] = (byte)(word0 - word4 - 1);
        i = word0 - word4 - 1;
        if (i >= 128)
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld[word2] = (byte)(word0 - word2);
            b042C042C042C042C042C042C_byte_array1d_static_fld[word3] = (byte)(word0 - word3);
            b042C042C042C042C042C042C_byte_array1d_static_fld[word4] = -127;
            byte abyte1[] = new byte[(short)i];
            rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)(word4 + 1), abyte1, (short)0, (short)i);
            b042C042C042C042C042C042C_byte_array1d_static_fld[word4 + 1] = (byte)i;
            rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, (short)(word4 + 2), (short)i);
            word0++;
        } else
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld[word2] = (byte)(word0 - word2 - 1);
            b042C042C042C042C042C042C_byte_array1d_static_fld[word3] = (byte)(word0 - word3 - 1);
            b042C042C042C042C042C042C_byte_array1d_static_fld[word4] = (byte)(word0 - word4 - 1);
        }
        b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
        b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\uFF5E\uFF60\uFF5E\uFF60", '\322', '\0'), b043504350435043504350435_byte_array1d_static_fld);
    }

    private static void b0421042104210421042104210421(byte byte0, byte byte1)
    {
        byte byte2 = 0;
_L2:
        if (byte2 >= 32)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        if (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[byte2] != null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
label0:
        do
        {
            if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b0421042104210421042104210421())
            {
                b044604460446044604460446_int_static_fld = 6;
                b044604460446044604460446_int_static_fld = 86;
            }
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
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[byte2] = (new byte[] {
                byte0, byte1
            });
        }
        catch (Exception exception)
        {
            throw exception;
        }
        byte2++;
        try
        {
            i = b044604460446044604460446_int_static_fld;
            j = b044604460446044604460446_int_static_fld;
            k = b044604460446044604460446_int_static_fld;
            l = b044604460446044604460446_int_static_fld;
            i1 = b044604460446044604460446_int_static_fld;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        b044604460446044604460446_int_static_fld = 2;
        b044604460446044604460446_int_static_fld = 20;
        b042C042C042C042C042C042C_short_static_fld = byte2;
        return;
        byte2++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int b0421042104210421042104210421()
    {
        return 1;
    }

    public static byte[] b0421042104210421042104210421(byte abyte0[], short word0, short word1)
    {
        byte abyte1[];
        int i;
        abyte1 = new byte[2];
        b042C042C042C042C042C042C_byte_static_fld = -91;
        i = rgrrgg.b044A044A044A044A044A044A(abyte0, (short)(word0 + 5));
        short word2;
        short word3;
        word3 = (short)(abyte0[(short)(word0 + 5 + 2)] & 0xff);
        word2 = (short)(word0 + 8);
        if ((abyte0[(short)(word0 + 2)] & 0xffffff80) != -128)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        b042C042C042C042C042C042C_byte_static_fld = 90;
        int j;
        word0 = (short)((short)(i >> 8) & 0xff);
        j = (short)(i & 0xff);
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte1, (short)0, (short)b044604460446044604460446_byte_array1d_static_fld.length);
        if (word0 < 1 || word0 > 30) goto _L2; else goto _L1
_L1:
        if (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld == null)
        {
            b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld = new Object[b042C042C042C042C042C042C_short_static_fld];
        }
        word0 = b0421042104210421042104210421((byte)word0, (byte)j);
        if (word0 == -1)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        byte abyte2[] = new byte[word3];
        String s;
        byte abyte3[];
        int k;
        int l;
        int i1;
        try
        {
            i = b044604460446044604460446_int_static_fld;
            j = b044604460446044604460446_int_static_fld;
            k = b044604460446044604460446_int_static_fld;
            l = b044604460446044604460446_int_static_fld;
            i1 = b0421042104210421042104210421();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (((i + j) * k) % l != i1)
        {
            try
            {
                b044604460446044604460446_int_static_fld = 38;
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, abyte2, (short)0, word3);
        b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word0] = abyte2;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 7;
        }
_L5:
        if (b042C042C042C042C042C042C_byte_static_fld == 90)
        {
            b0421042104210421042104210421();
        }
        return abyte1;
_L25:
        b042C042C042C042C042C042C_byte_static_fld = 1;
        b042C042C042C042C042C042C_byte_static_fld = 90;
        word1 = word2;
        word0 = word3;
          goto _L3
_L6:
        if (word1 >= i) goto _L5; else goto _L4
_L4:
        word0 = rgrrgg.b044A044A044A044A044A044A(abyte0, word1, b042C042C042C042C042C042C_short_array1d_static_fld);
        b0421042104210421042104210421(b042C042C042C042C042C042C_short_array1d_static_fld[0], abyte0, (short)(word1 + word0), b042C042C042C042C042C042C_short_array1d_static_fld[1]);
        word1 = (short)((short)(word0 + b042C042C042C042C042C042C_short_array1d_static_fld[1]) + word1);
          goto _L6
_L20:
        if (word3 == 7)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        abyte2 = b044604460446044604460446_byte_array1d_static_fld;
        word0 = b044604460446044604460446_byte_array1d_static_fld.length;
        word1 = word0;
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte1, (short)0, word1);
        rrrrgg.b042604260426042604260426 = new byte[7];
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, rrrrgg.b042604260426042604260426, (short)0, word3);
        word1 = word2;
        word0 = 0;
          goto _L3
_L23:
        if (abyte0[8] == 111)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte1, (short)0, (short)b044604460446044604460446_byte_array1d_static_fld.length);
        if (abyte0[10] == -124)
        {
            break MISSING_BLOCK_LABEL_425;
        }
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte1, (short)0, (short)b044604460446044604460446_byte_array1d_static_fld.length);
        word0 = abyte0[26];
        if (word0 == -91)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        abyte2 = b044604460446044604460446_byte_array1d_static_fld;
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte1, (short)0, (short)b044604460446044604460446_byte_array1d_static_fld.length);
        if (abyte0[31] == 97)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte1, (short)0, (short)b044604460446044604460446_byte_array1d_static_fld.length);
        word1 = abyte0[7];
        b043504350435043504350435_byte_array1d_static_fld = new byte[(short)(word1 + 2)];
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)8, b043504350435043504350435_byte_array1d_static_fld, (short)0, word1);
        word0 = abyte0[32];
        word0 = word0;
        word1 = 33;
          goto _L3
_L21:
        j;
        JVM INSTR tableswitch 1 3: default 548
    //                   1 663
    //                   2 548
    //                   3 848;
           goto _L7 _L8 _L7 _L9
_L7:
        word0 = 0;
        i = b0421042104210421042104210421();
        switch ((i * (b0421042104210421042104210421() + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 11;
            break;

        case 0: // '\0'
            break;
        }
        i = b0421042104210421042104210421();
        j = b044604460446044604460446_int_static_fld;
        k = b044604460446044604460446_int_static_fld;
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 644
    //                   0 1091;
           goto _L10 _L11
_L10:
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        word1 = word2;
        word0 = 0;
          goto _L3
_L8:
        abyte2 = new byte[word3];
        b044604460446044604460446_byte_array1d_static_fld = abyte2;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, b044604460446044604460446_byte_array1d_static_fld, (short)0, word3);
        abyte2 = b044604460446044604460446_byte_array1d_static_fld;
        s = rgrrgg.b044A044A044A044A044A044A(abyte2);
        b041E041E041E041E041E041E = s;
          goto _L7
        abyte0;
        throw abyte0;
_L24:
        if (abyte0[8] == 111) goto _L13; else goto _L12
_L12:
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte1, (short)0, (short)b044604460446044604460446_byte_array1d_static_fld.length);
_L13:
        if (abyte0[10] == -124) goto _L15; else goto _L14
_L14:
        s = b044604460446044604460446_byte_array1d_static_fld;
        abyte3 = b044604460446044604460446_byte_array1d_static_fld;
        rgrrgg.b044A044A044A044A044A044A(s, (short)0, abyte1, (short)0, (short)abyte3.length);
_L15:
        word0 = abyte0[19];
        if (word0 == -91) goto _L17; else goto _L16
_L16:
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte1, (short)0, (short)b044604460446044604460446_byte_array1d_static_fld.length);
_L17:
        word2 = abyte0[7];
        b043504350435043504350435_byte_array1d_static_fld = new byte[(short)(word2 + 2)];
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)8, b043504350435043504350435_byte_array1d_static_fld, (short)0, word2);
        s = b043504350435043504350435_byte_array1d_static_fld;
        word0 = b043504350435043504350435_byte_array1d_static_fld.length;
        word2 = (short)(word0 - 2);
        b0415041504150415041504150415(s, (short)11, word2);
        word0 = 0;
          goto _L3
_L9:
        b044604460446044604460446_byte_array1d_static_fld = new byte[word3];
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, b044604460446044604460446_byte_array1d_static_fld, (short)0, word3);
        s = b044604460446044604460446_byte_array1d_static_fld;
        s = rgrrgg.b044A044A044A044A044A044A(s);
        b041E041E041E041E041E041E = s;
          goto _L7
_L32:
        b044604460446044604460446_byte_array1d_static_fld = new byte[word3];
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, b044604460446044604460446_byte_array1d_static_fld, (short)0, word3);
        b044604460446044604460446_java_lang_String_static_fld = rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld);
          goto _L18
_L33:
        b044604460446044604460446_byte_array1d_static_fld = new byte[word3];
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, b044604460446044604460446_byte_array1d_static_fld, (short)0, word3);
        b044604460446044604460446_java_lang_String_static_fld = rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld);
          goto _L18
_L27:
        b042C042C042C042C042C042C_byte_static_fld = 0;
        b042C042C042C042C042C042C_byte_static_fld = 90;
        word1 = word2;
        word0 = word3;
          goto _L3
_L2:
        i;
        JVM INSTR lookupswitch 14: default 1088
    //                   -32767: 322
    //                   -32511: 519
    //                   -32509: 519
    //                   -32255: 1129
    //                   -32254: 1129
    //                   -32253: 1129
    //                   -32252: 1129
    //                   -32251: 1129
    //                   -28414: 377
    //                   -28413: 711
    //                   -28395: 257
    //                   -28393: 1256
    //                   -28154: 946
    //                   12289: 1297;
           goto _L19 _L20 _L21 _L21 _L22 _L22 _L22 _L22 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L19:
        word0 = word3;
_L11:
        word1 = word2;
          goto _L3
_L30:
        b044604460446044604460446_byte_array1d_static_fld = new byte[word3];
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, b044604460446044604460446_byte_array1d_static_fld, (short)0, word3);
        b041E041E041E041E041E041E = rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld);
          goto _L18
        abyte0;
        throw abyte0;
_L22:
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, word3);
        word1 = (short)(word3 * 2);
        b044604460446044604460446_short_static_fld = word1;
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[b044604460446044604460446_short_static_fld];
        b042C042C042C042C042C042C_byte_static_fld = -91;
        j;
        JVM INSTR tableswitch 1 5: default 1305
    //                   1 1196
    //                   2 1096
    //                   3 1226
    //                   4 886
    //                   5 916;
           goto _L18 _L29 _L30 _L31 _L32 _L33
_L29:
        b044604460446044604460446_byte_array1d_static_fld = new byte[word3];
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, b044604460446044604460446_byte_array1d_static_fld, (short)0, word3);
        b041E041E041E041E041E041E = rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld);
          goto _L18
_L31:
        b044604460446044604460446_byte_array1d_static_fld = new byte[word3];
        rgrrgg.b044A044A044A044A044A044A(abyte0, word2, b044604460446044604460446_byte_array1d_static_fld, (short)0, word3);
        b041E041E041E041E041E041E = rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld);
          goto _L18
_L26:
        b042C042C042C042C042C042C_byte_static_fld = 2;
        b042C042C042C042C042C042C_byte_static_fld = 90;
        b042C042C042C042C042C042C_byte_static_fld = 90;
        word1 = word2;
        word0 = word3;
_L3:
        i = (short)(word0 + word1);
          goto _L6
_L18:
        word1 = word2;
        word0 = 0;
          goto _L3
_L28:
        word1 = word2;
        word0 = word3;
          goto _L3
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 80;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            int i = b044604460446044604460446_int_static_fld;
            switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
            {
            default:
                b044604460446044604460446_int_static_fld = 10;
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                break;

            case 0: // '\0'
                break;
            }
        }
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
        byte abyte0[] = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word2 = (short)1;
        abyte0[0] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word1 = (short)(word2 + 1);
        abyte0[word2] = -30;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word1 + 1);
        abyte0[word1] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(word2 + 1);
        abyte0[word2] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word1 + 1);
        abyte0[word1] = 10;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(word2 + 1);
        abyte0[word2] = 48;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word1 + 1);
        abyte0[word1] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(word2 + 1);
        abyte0[word2] = 7;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word1 + 1);
        abyte0[word1] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(word2 + 1);
        abyte0[word2] = 104;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word0 = (short)(word1 + 1);
        abyte0[word1] = (byte)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length + word0);
        b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
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
        b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\uFE5D\uFE5A\uFE5A\uFE5B", '\365', '\341', '\0'), b043504350435043504350435_byte_array1d_static_fld);
    }

    public static Boolean b0421042104210421042104210421(TokenKey tokenkey, TokenInfo tokeninfo, int i, rggrrr rggrrr1)
    {
        boolean flag;
        flag = false;
        if (tokeninfo == null || tokenkey == null || rggrrr1 == null)
        {
            return Boolean.valueOf(false);
        }
          goto _L1
_L5:
        byte abyte0[];
        if (rrrrgg.b042604260426042604260426 == null)
        {
            rrrrgg.b042604260426042604260426 = new byte[1];
        }
        if (rrrrgg.b042604260426042604260426 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        abyte0 = new byte[1];
        rrrrgg.b042604260426042604260426 = abyte0;
        if (rrrrgg.b042604260426042604260426 == null)
        {
            rrrrgg.b042604260426042604260426 = new byte[1];
        }
        if (rrrrgg.b042604260426042604260426 == null)
        {
            rrrrgg.b042604260426042604260426 = new byte[1];
        }
        abyte0 = rrrrgg.b042604260426042604260426;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        rrrrgg.b042604260426042604260426 = new byte[6];
        if (rrrrgg.b042604260426042604260426 == null)
        {
            rrrrgg.b042604260426042604260426 = new byte[4];
        }
        abyte0 = rrrrgg.b042604260426042604260426;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        rrrrgg.b042604260426042604260426 = new byte[4];
        abyte0 = rrrrgg.b042604260426042604260426;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        rrrrgg.b042604260426042604260426 = new byte[1];
        abyte0 = rrrrgg.b042604260426042604260426;
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        rrrrgg.b042604260426042604260426 = new byte[14];
        b042C042C042C042C042C042C_byte_static_fld = 0;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld = null;
        b0421042104210421042104210421();
        b0421042104210421042104210421(tokeninfo, rggrrr1, false);
        b0421042104210421042104210421(tokenkey);
        b0421042104210421042104210421(tokenkey, false);
        if (b043504350435043504350435_byte_static_fld == 90)
        {
            b0421042104210421042104210421(tokenkey, true);
        }
        i = b041E041E041E041E041E041E.length();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        try
        {
            tokeninfo = b041E041E041E041E041E041E;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        if (tokeninfo.length() > 0)
        {
            b0421042104210421042104210421(tokenkey);
            b0421042104210421042104210421(tokenkey);
        }
        i = b041E041E041E041E041E041E.length();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        i = b041E041E041E041E041E041E.length();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        b0421042104210421042104210421(tokenkey);
        b0421042104210421042104210421(tokenkey);
        b0421042104210421042104210421(tokenkey);
        b0421042104210421042104210421(tokenkey);
        if (b041E041E041E041E041E041E.length() > 0 && b041E041E041E041E041E041E.length() > 0)
        {
            b0421042104210421042104210421(tokenkey);
            b0421042104210421042104210421(tokenkey);
            b0421042104210421042104210421(tokenkey);
            b0421042104210421042104210421(tokenkey);
        }
        if (b041E041E041E041E041E041E.length() <= 0 || b041E041E041E041E041E041E.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_417;
        }
        tokenkey = b043504350435043504350435_byte_array1d_static_fld;
        tokeninfo = b043504350435043504350435_byte_array1d_static_fld;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b0421042104210421042104210421())
        {
            b044604460446044604460446_int_static_fld = 46;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        b0421042104210421042104210421(((byte []) (tokenkey)), (short)0, (short)tokeninfo.length);
        if (b041E041E041E041E041E041E.length() > 0 && b041E041E041E041E041E041E.length() > 0)
        {
            b0421042104210421042104210421(b043504350435043504350435_byte_array1d_static_fld, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
        }
        if (b041E041E041E041E041E041E.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_481;
        }
        tokenkey = b041E041E041E041E041E041E;
        if (tokenkey.length() > 0)
        {
            b0421042104210421042104210421(b043504350435043504350435_byte_array1d_static_fld, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
        }
        if (b041E041E041E041E041E041E.length() > 0 && b041E041E041E041E041E041E.length() > 0)
        {
            b0421042104210421042104210421(b043504350435043504350435_byte_array1d_static_fld, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
        }
        if (b041E041E041E041E041E041E.length() <= 0 || b041E041E041E041E041E041E.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_545;
        }
        tokenkey = b043504350435043504350435_byte_array1d_static_fld;
        b0421042104210421042104210421(((byte []) (tokenkey)), (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
        try
        {
            tokenkey = b041E041E041E041E041E041E;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        if (tokenkey.length() > 0 && b041E041E041E041E041E041E.length() > 0)
        {
            b0421042104210421042104210421(b043504350435043504350435_byte_array1d_static_fld, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
            b0421042104210421042104210421(b043504350435043504350435_byte_array1d_static_fld, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
            b0421042104210421042104210421(b043504350435043504350435_byte_array1d_static_fld, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
        }
        b0421042104210421042104210421(b043504350435043504350435_byte_array1d_static_fld, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
        b0421042104210421042104210421(b043504350435043504350435_byte_array1d_static_fld, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
        b042C042C042C042C042C042C_byte_static_fld = 90;
        b0421042104210421042104210421();
        return Boolean.valueOf(true);
_L1:
        b042C042C042C042C042C042C_int_static_fld = i;
        (new lllppl()).b043604360436043604360436(tokenkey);
        i = ((flag) ? 1 : 0);
_L3:
        if (i >= 9)
        {
            continue; /* Loop/switch isn't completed */
        }
        b042C042C042C042C042C042C_short_array1d_static_fld[i] = -1;
        i = (short)(i + 1);
        if (true) goto _L3; else goto _L2
_L2:
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static int b0421042104210421042104210421()
    {
        return 2;
    }

    private static void b0421042104210421042104210421(byte abyte0[])
    {
        byte abyte1[];
        int i;
        int j;
        int k;
        byte byte0;
        try
        {
            i = b042C042C042C042C042C042C_short_static_fld;
            abyte1 = rrrrgg.b042604260426042604260426;
            j = (short)(i + b042C042C042C042C042C042C_byte_array1d_static_fld[2] * 2);
            i = j / 2;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        i = (short)i;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b0421042104210421042104210421() != b0421042104210421042104210421())
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        if (j % 2 != 1) goto _L2; else goto _L1
_L1:
        abyte0[i] = (byte)((abyte0[i] & 0xf0) + abyte1[0]);
        j = b044604460446044604460446_int_static_fld;
        switch ((j * (b044604460446044604460446_int_static_fld + j)) % b0421042104210421042104210421())
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            // fall through

        case 0: // '\0'
            i++;
            break;
        }
        abyte0[i] = (byte)((abyte1[1] << 4) + abyte1[2]);
        i++;
        abyte0[i] = (byte)((abyte1[3] << 4) + abyte1[4]);
        i++;
        j = abyte1[5];
        abyte0[i] = (byte)(abyte1[6] + (j << 4));
        j = (short)(i + 1);
        i = (short)(j + 1);
        try
        {
            k = b042C042C042C042C042C042C_byte_array1d_static_fld[0];
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        byte0 = b042C042C042C042C042C042C_byte_array1d_static_fld[1];
        abyte0[j] = (byte)((k << 4) + byte0);
        j = (short)(i + 1);
        abyte0[i] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[2] << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[3]);
        i = (short)(j + 1);
          goto _L3
_L8:
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = abyte1[4];
        abyte0[j] = (byte)((i << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[5]);
        return;
_L2:
        k = (short)(i + 1);
        abyte0[i] = (byte)((abyte1[0] << 4) + abyte1[1]);
        j = (short)(k + 1);
        abyte0[k] = (byte)((abyte1[2] << 4) + abyte1[3]);
        i = (short)(j + 1);
        k = abyte1[4];
        abyte0[j] = (byte)((k << 4) + abyte1[5]);
        abyte0[i] = (byte)((abyte1[6] << 4) + (abyte0[i] & 0xf));
        j = abyte0[i];
        k = b044604460446044604460446_int_static_fld;
        switch ((k * (b044604460446044604460446_int_static_fld + k)) % b0421042104210421042104210421())
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 4;
            break;

        case 0: // '\0'
            break;
        }
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        abyte0[i] = (byte)((j & 0xf0) + abyte1[0]);
        i++;
        abyte0[i] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[1] << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[2]);
        i++;
        abyte0[i] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[3] << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[4]);
        i++;
        abyte0[i] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[5] << 4) + (abyte0[i] & 0xf));
        return;
_L3:
        1;
        JVM INSTR tableswitch 0 1: default 516
    //                   0 493
    //                   1 250;
           goto _L4 _L3 _L5
_L5:
        continue; /* Loop/switch isn't completed */
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 540
    //                   0 493
    //                   1 250;
           goto _L4 _L3 _L6
_L6:
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        short word0;
        Object obj;
        String s;
        byte abyte0[];
        short word1;
        short word2;
        try
        {
            obj = (new StringBuilder()).append(b041E041E041E041E041E041E.substring(0, 2)).append(grrrrr.b044C044C044C044C044C044C("\uFD3F", '\373', '\004')).append(b041E041E041E041E041E041E.substring(2, 3));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b0421042104210421042104210421())
        {
            b044604460446044604460446_int_static_fld = 23;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        obj = ((StringBuilder) (obj)).append(grrrrr.b044C044C044C044C044C044C("z", 'J', '\002')).append(b041E041E041E041E041E041E.substring(3, 4)).append(grrrrr.b044C044C044C044C044C044C("o", '\216', 'O', '\002')).append(b041E041E041E041E041E041E.substring(4, 5));
        try
        {
            obj = ((StringBuilder) (obj)).append(grrrrr.b044C044C044C044C044C044C("i", 'n', '\247', '\001'));
            s = b041E041E041E041E041E041E;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        obj = ((StringBuilder) (obj)).append(s.substring(5, 6)).append(grrrrr.b044C044C044C044C044C044C("\360", '@', '\006')).append(b041E041E041E041E041E041E.substring(6, 7)).append(grrrrr.b044C044C044C044C044C044C("\017", '5', '\024', '\001')).append(b041E041E041E041E041E041E.substring(7, 8)).toString();
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)1;
        abyte0[0] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(word2 + 1);
        abyte0[word2] = -30;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word1 + 1);
        abyte0[word1] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(word2 + 1);
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 36;
        }
        abyte0[word2] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word1 + 1);
        abyte0[word1] = 10;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(word2 + 1);
        abyte0[word2] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word1 + 1);
        abyte0[word1] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(word2 + 1);
        abyte0[word2] = 7;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(((String) (obj))), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(((String) (obj))).length);
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(((String) (obj))).length + word0);
        b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
        b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\347\337\337\340", 'w', '8', '\003'), b043504350435043504350435_byte_array1d_static_fld);
        return;
    }

    private static byte[] b0421042104210421042104210421(byte byte0, byte byte1)
    {
        byte abyte0[] = null;
        short word0 = b0421042104210421042104210421(byte0, byte1);
        if (word0 == -1)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        abyte0 = ((byte []) (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word0]));
        Exception exception;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b044604460446044604460446_int_static_fld;
            j = b0421042104210421042104210421();
            k = b044604460446044604460446_int_static_fld;
            l = b044604460446044604460446_int_static_fld;
            i1 = b044604460446044604460446_int_static_fld;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 76;
            b044604460446044604460446_int_static_fld = 93;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            b044604460446044604460446_int_static_fld = 66;
            i = b0421042104210421042104210421();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        b044604460446044604460446_int_static_fld = i;
        abyte0 = (byte[])(byte[])abyte0;
        return abyte0;
        exception;
        throw exception;
        exception;
        throw exception;
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey, boolean flag)
    {
        int i;
        int j;
        byte byte0;
        short word0;
        short word1;
        byte abyte0[];
        String s;
        byte abyte1[];
        int k;
        int i1;
        short word2;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        try
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        word2 = (short)1;
        abyte0[0] = 111;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word2 + 1);
        abyte0[word2] = 1;
        if (b043504350435043504350435_byte_static_fld != 90 || !flag) goto _L2; else goto _L1
_L1:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = -124;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(i + 1);
        abyte0[i] = -91;
        try
        {
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        i1 = (short)(k + 1);
        abyte0[k] = 1;
        j1 = b043504350435043504350435_java_lang_String_static_fld.length();
        j = k;
        i = i1;
        if (j1 <= 0) goto _L4; else goto _L3
_L3:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(i1 + 1);
        abyte0[i1] = 80;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        abyte0[i] = (byte)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length + word0);
        i = k;
_L10:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = 56;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 24;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
          goto _L5
_L12:
        j = (short)(k + 1);
        abyte0[k] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 102;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i1 = (short)(k + 1);
        abyte0[k] = 4;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i1 + 1);
        abyte0[i1] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        i1 = b044604460446044604460446_int_static_fld;
        j1 = b044604460446044604460446_int_static_fld;
        k1 = b044604460446044604460446_int_static_fld;
        l1 = b044604460446044604460446_int_static_fld;
        i2 = b044604460446044604460446_int_static_fld;
        if (((i1 + j1) * k1) % l1 == i2)
        {
            break MISSING_BLOCK_LABEL_471;
        }
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = 65;
        abyte0[j] = 2;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = 6;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = 3;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 6;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 26;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = 2;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = -107;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = 5;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 95;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = 42;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 2;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = -102;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 3;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = -100;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte0[k] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 55;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(k + 1);
        abyte0[k] = 4;
        j = b042C042C042C042C042C042C_java_lang_String_static_fld.length();
        word0 = word1;
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_983;
        }
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(word1 + 1);
        abyte0[word1] = 95;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        abyte0[j] = 45;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(k + 1);
        abyte0[k] = (byte)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, word0, (short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length);
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 79;
        }
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)-16628);
        abyte0[j] = 1;
        j = b044604460446044604460446_int_static_fld;
        switch ((j * (b044604460446044604460446_int_static_fld + j)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 83;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            // fall through

        case 0: // '\0'
            j = (short)(word0 + 2);
            break;
        }
        i1 = (short)(j + 1);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(i1 + 1);
        abyte0[i1] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i1 = (short)(k + 1);
        abyte0[k] = 90;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i1 + 1);
        abyte0[i1] = (byte)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld);
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length);
        k = rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length;
        word0 = (short)((short)k + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        abyte0[word2] = (byte)(word0 - word2 - 1);
        b042C042C042C042C042C042C_byte_array1d_static_fld[i] = (byte)(word0 - i - 1);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        byte0 = (byte)(word0 - j - 1);
        abyte0[j] = byte0;
        if (b043504350435043504350435_byte_static_fld != 90 || !flag) goto _L7; else goto _L6
_L6:
        b043504350435043504350435_byte_array1d_static_fld = new byte[(short)(word0 + 2)];
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
        b0415041504150415041504150415(b043504350435043504350435_byte_array1d_static_fld, (short)11, (short)(b043504350435043504350435_byte_array1d_static_fld.length - 2));
        s = grrrrr.b044C044C044C044C044C044C("\315\305\304\307\306", 'e', '/', '\003');
        b0421042104210421042104210421(tokenkey, s, b043504350435043504350435_byte_array1d_static_fld);
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 64;
            b044604460446044604460446_int_static_fld = 84;
            // fall through

        case 0: // '\0'
            return;
        }
_L2:
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        s[i] = -124;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        s[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length + word0);
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(i + 1);
        s[i] = -91;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i1 = (short)(k + 1);
        s[k] = 1;
        j = k;
        i = i1;
        if (b043504350435043504350435_java_lang_String_static_fld.length() <= 0) goto _L4; else goto _L8
_L8:
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(i1 + 1);
        s[i1] = 80;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        s[i] = (byte)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        i1 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length + word0);
        j1 = b044604460446044604460446_int_static_fld;
        k1 = b044604460446044604460446_int_static_fld;
        l1 = b044604460446044604460446_int_static_fld;
        i2 = b044604460446044604460446_int_static_fld;
        j2 = b044604460446044604460446_int_static_fld;
        j = k;
        i = i1;
        if (((j1 + k1) * l1) % i2 == j2) goto _L4; else goto _L9
_L9:
        b044604460446044604460446_int_static_fld = 26;
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        j = i1;
        i = k;
          goto _L10
_L7:
        b043504350435043504350435_byte_array1d_static_fld = new byte[(short)(word0 + 2)];
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
        b0415041504150415041504150415(b043504350435043504350435_byte_array1d_static_fld, (short)11, (short)(b043504350435043504350435_byte_array1d_static_fld.length - 2));
        b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\uFFB8\uFFB0\uFFAF\uFFB2\uFFB0", 'P', '\321', '\002'), b043504350435043504350435_byte_array1d_static_fld);
        return;
_L4:
        int l = j;
        j = i;
        i = l;
          goto _L10
_L5:
        0;
        JVM INSTR tableswitch 0 1: default 1720
    //                   0 337
    //                   1 1698;
           goto _L11 _L12 _L5
_L11:
        0;
        JVM INSTR tableswitch 0 1: default 1744
    //                   0 337
    //                   1 1698;
           goto _L11 _L12 _L5
    }

    private static void b0421042104210421042104210421(short word0, byte abyte0[], short word1, short word2)
    {
        byte byte2 = abyte0[word1];
        word0;
        JVM INSTR lookupswitch 13: default 120
    //                   -24816: 350
    //                   -24794: 769
    //                   -24793: 783
    //                   -24778: 730
    //                   -24728: 683
    //                   -24724: 717
    //                   -24722: 696
    //                   -24708: 756
    //                   87: 584
    //                   130: 121
    //                   148: 149
    //                   24352: 743
    //                   24372: 571;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        return;
_L11:
        word1 = rgrrgg.b044A044A044A044A044A044A(abyte0, word1);
        if (b042C042C042C042C042C042C_short_array1d_static_fld == null)
        {
            b042C042C042C042C042C042C_short_array1d_static_fld = new short[3];
        }
        b042C042C042C042C042C042C_short_array1d_static_fld[(short)b042C042C042C042C042C042C_byte_static_fld] = word1;
        return;
_L2:
        rrrrgg.b041504150415041504150415 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b041504150415041504150415, word2);
        rrrrgg.b042604260426042604260426[0] = (byte)word2;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, rrrrgg.b042604260426042604260426, (short)0, (short)1);
        word1++;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, rrrrgg.b042604260426042604260426, (short)0, (short)1);
        word1++;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, rrrrgg.b042604260426042604260426, (short)0, (short)1);
        word1++;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, rrrrgg.b042604260426042604260426, (short)0, (short)6);
        word1 += 6;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, rrrrgg.b042604260426042604260426, (short)0, (short)4);
        word1 += 4;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        word0 = b044604460446044604460446_int_static_fld;
        switch ((word0 * (b044604460446044604460446_int_static_fld + word0)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 77;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            // fall through

        case 0: // '\0'
            rgrrgg.b044A044A044A044A044A044A(abyte0, word1, rrrrgg.b042604260426042604260426, (short)0, (short)4);
            break;
        }
        word1 += 4;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, rrrrgg.b042604260426042604260426, (short)0, (short)1);
        word1++;
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, rrrrgg.b042604260426042604260426, (short)0, (short)14);
        word0 = (short)(word1 + 14);
        return;
_L14:
        rrrrgg.b041504150415041504150415 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b041504150415041504150415, (short)1);
        return;
_L10:
        if (b042C042C042C042C042C042C_byte_static_fld == 0)
        {
            byte abyte2[] = b0421042104210421042104210421(abyte0, word1, rrrrgg.b042604260426042604260426, word2);
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
            rrrrgg.b042604260426042604260426 = abyte2;
        }
        if (b042C042C042C042C042C042C_byte_static_fld == 1 || b042C042C042C042C042C042C_byte_static_fld == 2)
        {
            rrrrgg.b041504150415041504150415 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b041504150415041504150415, word2);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        rrrrgg.b042604260426042604260426 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b042604260426042604260426, (short)4);
        return;
_L8:
        rrrrgg.b042604260426042604260426 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b042604260426042604260426, (short)4);
        return;
_L12:
        if (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld == null)
        {
            b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld = new Object[3];
        }
        word0 = b042C042C042C042C042C042C_byte_static_fld;
        b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word0] = new byte[word2];
        byte abyte1[] = (byte[])(byte[])b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word0];
        rgrrgg.b044A044A044A044A044A044A(abyte0, word1, abyte1, (short)0, word2);
        short word3 = (short)(abyte1.length / 4);
        word0 = 0;
        do
        {
            if (word0 >= word3)
            {
                continue; /* Loop/switch isn't completed */
            }
            short word4 = (short)(word0 * 4);
            byte byte0 = abyte1[(short)(word4 + 1)];
            byte byte3 = abyte1[(short)(word4 + 2)];
            byte byte1 = (byte)(abyte1[word4] >> 3 & 0x1f);
            for (; byte0 <= byte3; byte0++)
            {
                b0421042104210421042104210421(byte1, byte0);
                if (b042C042C042C042C042C042C_byte_static_fld == 0 && byte1 == 1 && (byte0 == 1 || byte0 == 2))
                {
                    b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[3];
                    b042C042C042C042C042C042C_byte_array1d_static_fld[0] = byte1;
                    if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
                    {
                        b044604460446044604460446_int_static_fld = 77;
                        b044604460446044604460446_int_static_fld = 69;
                    }
                    b042C042C042C042C042C042C_byte_array1d_static_fld[1] = byte0;
                }
            }

            word0++;
        } while (true);
_L7:
        rrrrgg.b042604260426042604260426 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b042604260426042604260426, (short)2);
        return;
_L5:
        b042C042C042C042C042C042C_int_static_fld = rgrrgg.b044A044A044A044A044A044A(abyte0, word1) & 0xffff;
        return;
_L13:
        rrrrgg.b042604260426042604260426 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b042604260426042604260426, word2);
        return;
_L9:
        rrrrgg.b042604260426042604260426 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b042604260426042604260426, word2);
        return;
_L3:
        rrrrgg.b041504150415041504150415 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b041504150415041504150415, (short)8);
        return;
_L4:
        rrrrgg.b042604260426042604260426 = b0421042104210421042104210421(abyte0, word1, rrrrgg.b042604260426042604260426, (short)1);
        return;
        if (true) goto _L1; else goto _L15
_L15:
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        byte byte0;
        short word0;
        short word1;
        String s;
        byte abyte0[];
        String s1;
        byte abyte1[];
        byte abyte2[];
        String s2;
        String s3;
        byte abyte3[];
        byte abyte4[];
        short word2;
        short word3;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        try
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
            s1 = grrrrr.b044C044C044C044C044C044C("\332\333\332\330\332\331\332\336\332\337\332\334\332\335\332\322", '\352', '\002');
            s = grrrrr.b044C044C044C044C044C044C("\025\025\025\025", '\261', '\226', '\001');
            abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            try
            {
                throw tokenkey;
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey) { }
            try
            {
                throw tokenkey;
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey;
            }
        }
        word3 = (short)1;
        abyte2[0] = -128;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word3 + 1);
        abyte2[word3] = -30;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word3 = (short)(word2 + 1);
        abyte2[word2] = 0;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word3 + 1);
        abyte2[word3] = 1;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word3 = (short)(word2 + 1);
        abyte2[word2] = 1;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word3 + 1);
        abyte2[word3] = -111;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word3 = (short)(i + 1);
        abyte2[i] = 21;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(word3 + 1);
        abyte2[word3] = 1;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte2[j] = -126;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        j = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        k = b044604460446044604460446_int_static_fld;
        l = b044604460446044604460446_int_static_fld;
        i1 = b044604460446044604460446_int_static_fld;
        j1 = b044604460446044604460446_int_static_fld;
        k1 = b0421042104210421042104210421();
        if (((k + l) * i1) % j1 == k1)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = 74;
        byte0 = (byte)j;
        abyte2[i] = byte0;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte2[i] = -108;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte2[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte2[i] = 87;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte2[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte2[j] = 95;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte2[i] = 52;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        s3 = b041E041E041E041E041E041E;
        abyte2[j] = (byte)rgrrgg.b044A044A044A044A044A044A(s3).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        j = (short)((short)i + word0);
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte2[j] = -97;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte2[i] = 16;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte2[j] = 32;
        abyte2 = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E);
        abyte3 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        abyte4 = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E);
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte3, word0, (short)abyte4.length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte2[j] = -97;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte2[i] = 38;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        i = rgrrgg.b044A044A044A044A044A044A(s1).length;
        byte0 = (byte)i;
        abyte2[j] = byte0;
        abyte2 = rgrrgg.b044A044A044A044A044A044A(s1);
        abyte3 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte3, word0, (short)rgrrgg.b044A044A044A044A044A044A(s1).length);
        abyte1 = rgrrgg.b044A044A044A044A044A044A(s1);
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 1;
            break;

        case 0: // '\0'
            break;
        }
        i = abyte1.length;
        j = (short)((short)i + word0);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte1[j] = -97;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte1[i] = 39;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte1[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        abyte1 = b041E041E041E041E041E041E;
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(abyte1).length + word0);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte1[j] = -97;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte1[i] = 54;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte1[j] = (byte)rgrrgg.b044A044A044A044A044A044A(s).length;
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)b042C042C042C042C042C042C_int_static_fld);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(s).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 108;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        s2 = b041E041E041E041E041E041E;
        i = b044604460446044604460446_int_static_fld;
        j = b044604460446044604460446_int_static_fld;
        k = b044604460446044604460446_int_static_fld;
        l = b044604460446044604460446_int_static_fld;
        i1 = b044604460446044604460446_int_static_fld;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_1157;
        }
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = 55;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, word0, (short)rgrrgg.b044A044A044A044A044A044A(s2).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 110;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        word1 = (short)i;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, word0, word1);
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        byte0 = (byte)(word0 - word2 - 1);
        abyte0[word2] = byte0;
        try
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld[word3] = (byte)(word0 - word3 - 1);
            b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
            rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
            b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\371\361\361\365", '$', '\234', '\003'), b043504350435043504350435_byte_array1d_static_fld);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        throw tokenkey;
        tokenkey;
        throw tokenkey;
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        byte abyte0[];
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int j;
        j = (short)1;
        abyte0[0] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int i;
        i = (short)(j + 1);
        abyte0[j] = -30;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word3;
        word3 = (short)(j + 1);
        abyte0[j] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(word3 + 1);
        abyte0[word3] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = 2;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word4;
        word4 = (short)(i + 1);
        abyte0[i] = 4;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word4 + 1);
        abyte0[word4] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word5;
        word5 = (short)(i + 1);
        abyte0[i] = 112;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(word5 + 1);
        abyte0[word5] = -114;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = 95;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 36;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 90;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 7;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = 95;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = b044604460446044604460446_int_static_fld;
        switch ((j * (b044604460446044604460446_int_static_fld + j)) % b0421042104210421042104210421())
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 12;
            // fall through

        case 0: // '\0'
            j = (short)(i + 1);
            break;
        }
        abyte0[i] = 40;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        byte abyte1[];
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        short word1 = (short)i;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, word0, word1);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        i = j;
        if (b041E041E041E041E041E041E.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_895;
        }
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        int k = b044604460446044604460446_int_static_fld;
        int l = b044604460446044604460446_int_static_fld;
        int i1 = b044604460446044604460446_int_static_fld;
        int j1 = b044604460446044604460446_int_static_fld;
        int k1 = b044604460446044604460446_int_static_fld;
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
        if (((k + l) * i1) % j1 != k1)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 75;
        }
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 25;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        i = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        byte byte0 = (byte)i;
        abyte0[j] = byte0;
        String s = b041E041E041E041E041E041E;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(s), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        s = b041E041E041E041E041E041E;
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b0421042104210421042104210421() + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 93;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            break;

        case 0: // '\0'
            break;
        }
        i = rgrrgg.b044A044A044A044A044A044A(s).length;
        i = (short)((short)i + word0);
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        s[i] = -97;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        s[j] = 105;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        s[i] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        s[j] = -97;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        s[i] = 75;
        short word6 = b044604460446044604460446_short_static_fld;
        i = j;
        if (word6 < 128)
        {
            break MISSING_BLOCK_LABEL_1066;
        }
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        s[j] = -127;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        s[i] = (byte)b044604460446044604460446_short_static_fld;
        i = word0 - word5 - 1;
        if (i < 128)
        {
            break MISSING_BLOCK_LABEL_1266;
        }
        b042C042C042C042C042C042C_byte_array1d_static_fld[word3] = (byte)(word0 - word3);
        b042C042C042C042C042C042C_byte_array1d_static_fld[word4] = (byte)(word0 - word4);
        b042C042C042C042C042C042C_byte_array1d_static_fld[word5] = -127;
        s = new byte[(short)i];
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)(word5 + 1), s, (short)0, (short)i);
        b042C042C042C042C042C042C_byte_array1d_static_fld[word5 + 1] = (byte)i;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word2;
        word1 = (short)(word5 + 2);
        word2 = (short)i;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b0421042104210421042104210421())
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 55;
        }
        rgrrgg.b044A044A044A044A044A044A(s, (short)0, abyte1, word1, word2);
        word0++;
_L1:
        try
        {
            b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
            rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
            b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("rtrv", '!', '\001'), b043504350435043504350435_byte_array1d_static_fld);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        break MISSING_BLOCK_LABEL_1309;
        b042C042C042C042C042C042C_byte_array1d_static_fld[word3] = (byte)(word0 - word3 - 1);
        b042C042C042C042C042C042C_byte_array1d_static_fld[word4] = (byte)(word0 - word4 - 1);
        b042C042C042C042C042C042C_byte_array1d_static_fld[word5] = (byte)(word0 - word5 - 1);
          goto _L1
        try
        {
            throw tokenkey;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        tokenkey;
        throw tokenkey;
    }

    private static void b0421042104210421042104210421()
    {
        rrrrgg.b042604260426042604260426 = null;
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
        rrrrgg.b042604260426042604260426 = null;
        b043504350435043504350435_java_lang_String_static_fld = "";
        b043504350435043504350435_java_lang_String_static_fld = "";
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b043504350435043504350435_java_lang_String_static_fld = "";
        int i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 61;
            // fall through

        case 0: // '\0'
            b043504350435043504350435_java_lang_String_static_fld = "";
            break;
        }
    }

    private static byte[] b0415041504150415041504150415(byte abyte0[], short word0)
    {
        abyte0 = b0415041504150415041504150415(abyte0, word0);
        if (abyte0.length > 2)
        {
            int i = abyte0.length;
            int j = b044604460446044604460446_int_static_fld;
            switch ((j * (b044604460446044604460446_int_static_fld + j)) % b044604460446044604460446_int_static_fld)
            {
            default:
                b044604460446044604460446_int_static_fld = 24;
                b044604460446044604460446_int_static_fld = 40;
                // fall through

            case 0: // '\0'
                b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[(short)(i + 4)];
                break;
            }
            if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
            {
                b044604460446044604460446_int_static_fld = 79;
                b044604460446044604460446_int_static_fld = 86;
            }
            byte abyte1[] = b042C042C042C042C042C042C_byte_array1d_static_fld;
            i = (short)1;
            abyte1[0] = 119;
            abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
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
            word0 = (short)(i + 1);
            abyte1[i] = (byte)abyte0.length;
            rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)abyte0.length);
            word0 = (short)((short)abyte0.length + word0);
            rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)-28672);
        } else
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[(short)abyte0.length];
            rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, (short)abyte0.length);
        }
        return b042C042C042C042C042C042C_byte_array1d_static_fld;
    }

    public static byte b0415041504150415041504150415(byte abyte0[])
    {
        byte byte1 = 90;
        if (b042C042C042C042C042C042C_byte_static_fld != 90) goto _L2; else goto _L1
_L1:
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld), (short)0, rrrrgg.b042604260426042604260426, (short)0, (short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length);
_L13:
        int i;
        byte byte2;
        byte byte3;
        i = abyte0[b042C042C042C042C042C042C_short_array1d_static_fld[0]];
        byte2 = abyte0[(short)(b042C042C042C042C042C042C_short_array1d_static_fld[0] + 1)];
        byte3 = abyte0[(short)(b042C042C042C042C042C042C_short_array1d_static_fld[0] + 2)];
        byte byte0 = byte1;
        if (rrrrgg.b042604260426042604260426 == null) goto _L4; else goto _L3
_L3:
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = (byte)(abyte0[0] & 0x3f);
        try
        {
            abyte0 = rrrrgg.b042604260426042604260426;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        abyte0[1] = (byte)(abyte0[1] & 0x7f);
        try
        {
            rrrrgg.b042604260426042604260426[0] = 0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if ((byte2 & 0x40) == 0) goto _L6; else goto _L5
_L5:
        abyte0 = rrrrgg.b042604260426042604260426;
        byte0 = byte1;
        if (abyte0 == null) goto _L8; else goto _L7
_L7:
        if ((i & 4) == 0) goto _L10; else goto _L9
_L9:
        abyte0 = rrrrgg.b042604260426042604260426;
        if ((abyte0[2] & 0xffffff80) != 0) goto _L12; else goto _L11
_L11:
        if ((rrrrgg.b042604260426042604260426[2] & 0x40) == 0) goto _L10; else goto _L12
_L12:
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = (byte)(abyte0[0] | 0xffffff80);
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = (byte)(abyte0[0] | 0x60);
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = (byte)(abyte0[0] | 0xe);
        byte0 = byte1;
_L8:
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[1] = (byte)(abyte0[1] | 0x20);
_L4:
        return byte0;
_L2:
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, rrrrgg.b042604260426042604260426, (short)0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
          goto _L13
_L6:
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[1] = (byte)(abyte0[1] | 0xffffff80);
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = 0;
        byte0 = byte1;
          goto _L8
_L19:
        abyte0 = rrrrgg.b042604260426042604260426;
        i = abyte0[1];
        byte0 = (byte)(i | 0xffffff80);
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 67;
            b044604460446044604460446_int_static_fld = 83;
            // fall through

        case 0: // '\0'
            abyte0[1] = byte0;
            break;
        }
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = (byte)(abyte0[0] | 0x50);
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = (byte)(abyte0[0] | 1);
        byte0 = byte1;
          goto _L8
_L16:
        if ((i & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_426;
        }
        if ((rrrrgg.b042604260426042604260426[2] & 0x10) == 0)
        {
            break MISSING_BLOCK_LABEL_426;
        }
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = (byte)(abyte0[0] | 0x40);
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = (byte)(abyte0[0] | 0x60);
        abyte0 = rrrrgg.b042604260426042604260426;
        abyte0[0] = (byte)(abyte0[0] | 0xd);
        byte0 = byte1;
          goto _L8
        abyte0 = rrrrgg.b042604260426042604260426;
        i = abyte0[1];
        byte0 = (byte)(i | 0xffffff80);
        abyte0[1] = byte0;
        rrrrgg.b042604260426042604260426[0] = 0;
        byte0 = byte1;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld == b044604460446044604460446_int_static_fld) goto _L8; else goto _L14
_L14:
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        byte0 = byte1;
          goto _L8
_L10:
        if ((byte3 & 0x40) == 0) goto _L16; else goto _L15
_L15:
        if ((rrrrgg.b042604260426042604260426[2] & 8) == 0) goto _L16; else goto _L17
_L17:
        abyte0 = rrgggg.b044104410441044104410441_java_lang_Boolean_static_fld;
        boolean flag = abyte0.booleanValue();
        if (flag) goto _L19; else goto _L18
_L18:
        byte0 = -91;
          goto _L8
    }

    private static int b0415041504150415041504150415(byte abyte0[], short word0, short word1)
    {
        String s;
        if (b042C042C042C042C042C042C_byte_static_fld != -91 || b042C042C042C042C042C042C_byte_static_fld != 90)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        s = (new StringBuilder()).append(b042C042C042C042C042C042C_java_lang_String_static_fld).append(grrrrr.b044C044C044C044C044C044C("G", '\001', '\002', '\003')).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).toString();
        abyte0 = s;
        if (s.length() % 2 == 0)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        abyte0 = (new StringBuilder()).append(s);
        byte abyte1[];
        byte byte1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            abyte0 = abyte0.append(grrrrr.b044C044C044C044C044C044C("\320", '\212', '\005')).toString();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
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
        try
        {
            rrrrgg.b041504150415041504150415 = rgrrgg.b044A044A044A044A044A044A(abyte0, "", 16);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        return 0;
        abyte0 = rrrrgg.b041504150415041504150415;
        word1 = (short)13;
        word0 = rrrrgg.b042604260426042604260426[0];
        abyte1 = rrrrgg.b042604260426042604260426;
        byte byte0 = (byte)((word0 << 4) + abyte1[1]);
        abyte0[12] = byte0;
        abyte0 = rrrrgg.b041504150415041504150415;
        word0 = (short)(word1 + 1);
        abyte0[word1] = (byte)((rrrrgg.b042604260426042604260426[2] << 4) + rrrrgg.b042604260426042604260426[3]);
        abyte0 = rrrrgg.b041504150415041504150415;
        word1 = (short)(word0 + 1);
        byte1 = rrrrgg.b042604260426042604260426[4];
        abyte1 = rrrrgg.b042604260426042604260426;
        abyte0[word0] = (byte)((byte1 << 4) + abyte1[5]);
        rrrrgg.b041504150415041504150415[word1] = (byte)((rrrrgg.b042604260426042604260426[6] << 4) + (rrrrgg.b041504150415041504150415[word1] & 0xf));
        rrrrgg.b041504150415041504150415[word1] = (byte)((rrrrgg.b041504150415041504150415[word1] & 0xf0) + b042C042C042C042C042C042C_byte_array1d_static_fld[0]);
        word0 = (short)(word1 + 1);
        abyte0 = rrrrgg.b041504150415041504150415;
        word1 = b042C042C042C042C042C042C_byte_array1d_static_fld[1];
        abyte0[word0] = (byte)((word1 << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[2]);
        word0++;
        abyte0 = rrrrgg.b041504150415041504150415;
        word1 = b042C042C042C042C042C042C_byte_array1d_static_fld[3];
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 43;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        abyte0[word0] = (byte)((word1 << 4) + abyte1[4]);
        word0++;
        abyte0 = rrrrgg.b041504150415041504150415;
        word1 = b042C042C042C042C042C042C_byte_array1d_static_fld[5];
        abyte1 = rrrrgg.b041504150415041504150415;
        byte1 = abyte1[word0];
        i = b044604460446044604460446_int_static_fld;
        j = b0421042104210421042104210421();
        k = b044604460446044604460446_int_static_fld;
        l = b044604460446044604460446_int_static_fld;
        i1 = b044604460446044604460446_int_static_fld;
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        abyte0[word0] = (byte)((word1 << 4) + (byte1 & 0xf));
        return 0;
    }

    private static void b0415041504150415041504150415()
    {
        b042C042C042C042C042C042C_byte_static_fld = 90;
        if (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld == null) goto _L2; else goto _L1
_L1:
        short word1 = 0;
_L24:
        if (word1 >= b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld.length) goto _L2; else goto _L3
_L3:
        Object obj = (byte[])(byte[])b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word1];
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (obj.length != 0) goto _L6; else goto _L5
_L16:
        short word0;
        short word4;
        if (b042C042C042C042C042C042C_short_array1d_static_fld[0] == -24727)
        {
            b042C042C042C042C042C042C_short_static_fld = (short)(word0 + word4);
        }
_L17:
        short aword0[] = b042C042C042C042C042C042C_short_array1d_static_fld;
        word0 += (short)(word4 + aword0[1]);
_L11:
        byte abyte0[];
        if (word0 >= abyte0.length) goto _L8; else goto _L7
_L7:
        short word5;
        word4 = rgrrgg.b044A044A044A044A044A044A(abyte0, word0, b042C042C042C042C042C042C_short_array1d_static_fld);
        word5 = b042C042C042C042C042C042C_short_array1d_static_fld[0];
        if (word5 != 112) goto _L10; else goto _L9
_L9:
        word0 += word4;
          goto _L11
_L8:
        byte byte0;
        byte0++;
_L19:
        byte byte2;
        if (byte0 > byte2) goto _L13; else goto _L12
_L12:
        byte byte1;
        try
        {
            b0421042104210421042104210421(byte1, byte0);
            abyte0 = b0421042104210421042104210421(byte1, byte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (abyte0 == null) goto _L8; else goto _L14
_L14:
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 73;
        }
        word0 = 0;
          goto _L11
_L21:
        if (b042C042C042C042C042C042C_short_array1d_static_fld[0] != -24757) goto _L16; else goto _L15
_L15:
        b042C042C042C042C042C042C_byte_static_fld = byte1;
        b042C042C042C042C042C042C_byte_static_fld = byte0;
        b042C042C042C042C042C042C_short_static_fld = (short)(word0 + word4);
        b042C042C042C042C042C042C_short_static_fld = b044604460446044604460446_short_static_fld;
          goto _L17
_L6:
        short word3 = (short)(obj.length / 4);
        short word2 = 0;
_L22:
        if (word2 >= word3) goto _L5; else goto _L18
_L18:
        word0 = (short)(word2 * 4);
        byte1 = (byte)(rgrrgg.b044A044A044A044A044A044A(((byte []) (obj)), word0) >> 3);
        byte0 = obj[(short)(word0 + 1)];
        byte2 = obj[(short)(word0 + 2)];
          goto _L19
_L10:
        try
        {
            word5 = b042C042C042C042C042C042C_short_array1d_static_fld[0];
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (word5 != -24761) goto _L21; else goto _L20
_L20:
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 80;
        }
        word5 = (short)(word0 + word4);
        b044604460446044604460446_java_lang_String_static_fld = rgrrgg.b044A044A044A044A044A044A(abyte0[word5]);
          goto _L17
_L13:
        word2++;
          goto _L22
_L2:
        return;
_L5:
        word1++;
        if (true) goto _L24; else goto _L23
_L23:
    }

    public static int b0415041504150415041504150415(short word0, byte abyte0[])
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b0415041504150415041504150415(byte abyte0[], byte abyte1[])
    {
_L6:
        if (b043504350435043504350435_java_lang_String_static_fld.length() <= 0 || !rgrrgg.b044A044A044A044A044A044A(abyte3, 0, abyte0, 5, (short)abyte0[4])) goto _L2; else goto _L1
_L1:
        abyte0 = b043504350435043504350435_byte_array1d_static_fld;
        short word0;
        String s;
        byte abyte2[];
        int i;
        int j;
        try
        {
            rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
            i = b044604460446044604460446_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        try
        {
            j = b044604460446044604460446_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        (i * (j + i)) % b0421042104210421042104210421();
        JVM INSTR tableswitch 0 0: default 302
    //                   0 102;
           goto _L3 _L4
_L3:
        b044604460446044604460446_int_static_fld = 87;
        b044604460446044604460446_int_static_fld = 93;
_L4:
        abyte0 = b044604460446044604460446_byte_array1d_static_fld;
        i = b043504350435043504350435_byte_array1d_static_fld.length;
        word0 = (short)(i - 2);
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, word0, (short)b044604460446044604460446_byte_array1d_static_fld.length);
        i = b043504350435043504350435_byte_array1d_static_fld.length;
        b042C042C042C042C042C042C_byte_static_fld = 90;
        return i;
_L9:
        s = b042C042C042C042C042C042C_java_lang_String_static_fld;
        abyte2 = rgrrgg.b044A044A044A044A044A044A(s, "", 16);
        abyte3 = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld, "", 16);
        if (!rgrrgg.b044A044A044A044A044A044A(abyte2, 0, abyte0, 5, (short)abyte0[4])) goto _L6; else goto _L5
_L5:
        rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_byte_array1d_static_fld, (short)0, abyte1, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_byte_array1d_static_fld, (short)0, abyte1, (short)(b043504350435043504350435_byte_array1d_static_fld.length - 2), (short)b044604460446044604460446_byte_array1d_static_fld.length);
        i = b043504350435043504350435_byte_array1d_static_fld.length;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        return i;
        byte abyte3[];
        if (abyte0[2] != 4)
        {
            return -15;
        }
        i = abyte0[3];
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        if (abyte0[3] != 2) goto _L2; else goto _L7
_L7:
        if ((short)abyte0[4] == 7) goto _L9; else goto _L8
_L8:
        return -15;
_L2:
        return -15;
    }

    private static byte[] b0415041504150415041504150415()
    {
        int i;
        short word0;
        i = 0;
        byte byte0;
        byte abyte0[];
        Exception exception;
        short word1;
        byte byte1;
        byte byte2;
        try
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[32];
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
          goto _L1
_L16:
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, (short)16, (short)16);
        rgrrgg.b044A044A044A044A044A044A(b044604460446044604460446_rrrrrr_plpllp_static_fld.b041B041B041B041B041B041B(b044604460446044604460446_rrrrrr_ppplpl_static_fld, b044604460446044604460446_com_visa_cbp_sdk_facade_data_TokenKey_static_fld, b044604460446044604460446_byte_array1d_static_fld), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, (short)16, (short)8);
        word1 = 0;
_L10:
        if (word1 >= 16) goto _L3; else goto _L2
_L2:
        if (word1 >= 8) goto _L5; else goto _L4
_L4:
        byte1 = b042C042C042C042C042C042C_byte_array1d_static_fld[(short)(word1 + 16)];
        byte0 = (byte)(byte1 >> 4 & 0xf);
        if (byte0 > 9) goto _L7; else goto _L6
_L6:
        try
        {
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        }
        catch (Exception exception2)
        {
            throw exception2;
        }
        word0 = (short)(i + 1);
        abyte0[i] = byte0;
        i = word0;
        if (word0 <= 5) goto _L7; else goto _L3
_L12:
        byte1 &= 0xf;
        word0 = i;
        if (byte1 < 10) goto _L9; else goto _L8
_L8:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = b044604460446044604460446_int_static_fld;
        switch ((word0 * (b044604460446044604460446_int_static_fld + word0)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 85;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            // fall through

        case 0: // '\0'
            word0 = (short)(i + 1);
            break;
        }
        abyte0[i] = (byte)(byte1 - 10);
        if (word0 > 5)
        {
            break; /* Loop/switch isn't completed */
        }
        i = word0;
_L14:
        word1++;
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            b044604460446044604460446_int_static_fld = 68;
        }
          goto _L10
_L5:
        byte1 = b042C042C042C042C042C042C_byte_array1d_static_fld[(short)(word1 + 8)];
        byte2 = (byte)(byte1 >> 4 & 0xf);
        if (byte2 < 10) goto _L12; else goto _L11
_L11:
        exception = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        exception[i] = (byte)(byte2 - 10);
        i = word0;
        if (word0 <= 5) goto _L12; else goto _L3
_L7:
        byte0 = (byte)(byte1 & 0xf);
        word0 = i;
        if (byte0 > 9) goto _L9; else goto _L13
_L13:
        exception = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        exception[i] = byte0;
        i = word0;
        if (word0 <= 5) goto _L14; else goto _L3
_L9:
        i = word0;
          goto _L14
_L1:
        0;
        JVM INSTR tableswitch 0 1: default 360
    //                   0 12
    //                   1 338;
           goto _L15 _L16 _L1
_L15:
        0;
        JVM INSTR tableswitch 0 1: default 384
    //                   0 12
    //                   1 338;
           goto _L15 _L16 _L1
_L3:
        return null;
    }

    public static short b0415041504150415041504150415(byte abyte0[], short word0, short word1)
    {
        if (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld == null)
        {
            b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld = new Object[4];
        }
        short word2 = 0;
        while (word0 < word1) 
        {
            short word5 = rgrrgg.b044A044A044A044A044A044A(abyte0, word0, b042C042C042C042C042C042C_short_array1d_static_fld);
            if (b042C042C042C042C042C042C_short_array1d_static_fld[0] == 165 || b042C042C042C042C042C042C_short_array1d_static_fld[0] == -16628 || b042C042C042C042C042C042C_short_array1d_static_fld[0] == 132)
            {
                word0 += word5;
            } else
            {
                if (b042C042C042C042C042C042C_short_array1d_static_fld[0] == 97)
                {
                    if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
                    {
                        int i = b044604460446044604460446_int_static_fld;
                        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
                        {
                        default:
                            b044604460446044604460446_int_static_fld = 31;
                            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                            // fall through

                        case 0: // '\0'
                            b044604460446044604460446_int_static_fld = 90;
                            break;
                        }
                        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                    }
                    short word3 = abyte0[(short)(word0 + 3)];
                    short word4 = (short)(word0 + 4);
                    if (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word2] == null)
                    {
                        b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word2] = new byte[word3];
                    }
                    rgrrgg.b044A044A044A044A044A044A(abyte0, word4, (byte[])(byte[])b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word2], (short)0, word3);
                    word2++;
                }
                word0 = (short)((short)(b042C042C042C042C042C042C_short_array1d_static_fld[1] + word5) + word0);
            }
        }
        return word2;
    }

    private static byte[] b0415041504150415041504150415()
    {
        int i;
        short word0;
        short word1;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b0421042104210421042104210421() != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 16;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        byte byte0;
        plpllp plpllp1;
        byte abyte0[];
        ppplpl ppplpl1;
        byte abyte1[];
        TokenKey tokenkey;
        byte abyte2[];
        byte byte1;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[32];
            rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, (short)16, (short)16);
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        try
        {
            rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(String.format(grrrrr.b044C044C044C044C044C044C("\217\232\240\316", 'j', '\005'), new Object[] {
                Integer.valueOf(b042C042C042C042C042C042C_int_static_fld)
            })), (short)1, b044604460446044604460446_byte_array1d_static_fld, (short)0, (short)2);
            plpllp1 = b044604460446044604460446_rrrrrr_plpllp_static_fld;
            ppplpl1 = b044604460446044604460446_rrrrrr_ppplpl_static_fld;
            tokenkey = b044604460446044604460446_com_visa_cbp_sdk_facade_data_TokenKey_static_fld;
            abyte2 = b044604460446044604460446_byte_array1d_static_fld;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        abyte0 = plpllp1.b041B041B041B041B041B041B(ppplpl1, tokenkey, abyte2);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, (short)16, (short)8);
        i = 0;
        word1 = 0;
_L14:
        if (word1 >= 16) goto _L2; else goto _L1
_L1:
        if (word1 >= 8) goto _L4; else goto _L3
_L3:
        byte1 = b042C042C042C042C042C042C_byte_array1d_static_fld[(short)(word1 + 16)];
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
        byte0 = (byte)(byte1 >> 4 & 0xf);
        if (byte0 > 9) goto _L6; else goto _L5
_L5:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        abyte0[i] = byte0;
        i = word0;
        if (word0 <= 5) goto _L6; else goto _L2
_L2:
        return null;
_L10:
        byte1 &= 0xf;
        word0 = i;
        if (byte1 < 10) goto _L8; else goto _L7
_L7:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        j = b0421042104210421042104210421();
        k = b044604460446044604460446_int_static_fld;
        l = b0421042104210421042104210421();
        i1 = b044604460446044604460446_int_static_fld;
        j1 = b044604460446044604460446_int_static_fld;
        if (((j + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = 49;
        byte0 = (byte)(byte1 - 10);
        abyte0[i] = byte0;
        if (word0 > 5)
        {
            break; /* Loop/switch isn't completed */
        }
        i = word0;
        break; /* Loop/switch isn't completed */
_L4:
        byte1 = b042C042C042C042C042C042C_byte_array1d_static_fld[(short)(word1 + 8)];
        j = (byte)(byte1 >> 4 & 0xf);
        if (j < 10) goto _L10; else goto _L9
_L9:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        abyte0[i] = (byte)(j - 10);
        i = word0;
        if (word0 <= 5) goto _L10; else goto _L2
_L6:
        byte0 = (byte)(byte1 & 0xf);
        word0 = i;
        if (byte0 > 9) goto _L8; else goto _L11
_L11:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        abyte0[i] = byte0;
        i = word0;
        if (word0 <= 5) goto _L12; else goto _L2
_L8:
        i = word0;
_L12:
        word1++;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private static String b0415041504150415041504150415(String s)
    {
        Object obj;
        String s1;
        s = new File(s);
        obj = new StringBuilder((int)s.length());
        s = new Scanner(s);
        s1 = System.getProperty(grrrrr.b044C044C044C044C044C044C("jglc,qcn_p_rmp", '\362', '\360', '\001'));
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 17;
        }
_L2:
        if (!s.hasNextLine())
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(s.nextLine()).append(s1);
        if (((b0421042104210421042104210421() + b044604460446044604460446_int_static_fld) * b0421042104210421042104210421()) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 81;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        if (true) goto _L2; else goto _L1
        obj;
        s.close();
        throw obj;
_L1:
        obj = ((StringBuilder) (obj)).toString();
        s.close();
        return ((String) (obj));
    }

    private static int b0415041504150415041504150415(short word0, byte abyte0[])
    {
        abyte0[rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, (short)-24816)] = (byte)word0;
        short word1 = (short)3;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte0, word1, (short)1);
        word1++;
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
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte0, word1, (short)1);
        word1++;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte0, word1, (short)1);
        word1++;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte0, word1, (short)6);
        word1 += 6;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte0, word1, (short)4);
        word1 += 4;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte0, word1, (short)4);
        word1 += 4;
        byte abyte1[] = rrrrgg.b042604260426042604260426;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 36;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, abyte0, word1, (short)1);
        word1++;
        rgrrgg.b044A044A044A044A044A044A(rrrrgg.b042604260426042604260426, (short)0, abyte0, word1, (short)14);
        word0 = (short)(word1 + 14);
        abyte1 = rrrrgg.b041504150415041504150415;
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
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)3, abyte1, (short)0, (short)(word0 - 3));
        return 0;
    }

    public static int b0415041504150415041504150415(byte abyte0[], byte abyte1[])
    {
        byte byte0;
        byte0 = 0;
        byte abyte2[] = new byte[2];
        b042C042C042C042C042C042C_byte_static_fld = -91;
        if (abyte0[2] == 0) goto _L2; else goto _L1
_L1:
        byte0 = -7;
_L10:
        return byte0;
_L2:
        int i;
        if (abyte0[3] != 0)
        {
            if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
            {
                b044604460446044604460446_int_static_fld = 76;
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            }
            return -7;
        }
        if (abyte0[5] != -125)
        {
            return -7;
        }
        i = (short)1;
        word0 = abyte0[6];
        if (word0 == 0)
        {
            return -7;
        }
          goto _L3
_L8:
        while (i != 2 || !rgrrgg.b044A044A044A044A044A044A(abyte0, 0, b044604460446044604460446_byte_array1d_static_fld, 0, 2)) 
        {
            i = b044604460446044604460446_int_static_fld;
            switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
            {
            default:
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                // fall through

            case 0: // '\0'
                rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, (short)0, (short)abyte0.length);
                break;
            }
            i = abyte0.length;
            b044604460446044604460446_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C("\uFE61", '\370', '\003');
            return i;
        }
        return -17;
_L5:
        short word0;
        if (word0 != b042C042C042C042C042C042C_short_static_fld)
        {
            return -7;
        }
        word0 = (short)(i + 1);
        i = word0;
        if (word0 != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b0415041504150415041504150415(abyte0) != 90)
        {
            return -3;
        }
        i = (short)(word0 + 1);
        continue; /* Loop/switch isn't completed */
_L12:
        abyte0 = b0415041504150415041504150415(abyte0);
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, (short)0, (short)abyte0.length);
        i = abyte0.length;
        b044604460446044604460446_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C("\uFF3D", '\210', '\003');
        return i;
_L3:
        if (word0 == (short)((abyte0[4] & 0xff) - 2)) goto _L5; else goto _L4
_L4:
        return -7;
_L9:
        switch (b042C042C042C042C042C042C_byte_static_fld)
        {
        default:
            return -6;

        case 0: // '\0'
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        abyte0 = b0415041504150415041504150415(abyte0, b042C042C042C042C042C042C_byte_static_fld);
        i = abyte0.length;
_L7:
        1;
        JVM INSTR tableswitch 0 1: default 316
    //                   0 291
    //                   1 140;
           goto _L6 _L7 _L8
_L6:
        0;
        JVM INSTR tableswitch 0 1: default 340
    //                   0 140
    //                   1 291;
           goto _L6 _L8 _L7
        if (i != 3) goto _L10; else goto _L9
        if (true) goto _L12; else goto _L11
_L11:
    }

    private static void b0421042104210421042104210421(byte abyte0[])
    {
_L6:
        byte abyte2[];
        abyte0[word0] = (byte)((abyte1[1] << 4) + abyte1[2]);
        word0 = (short)(word1 + 1);
        abyte0[word1] = (byte)((abyte1[3] << 4) + abyte1[4]);
        word1 = (short)(word0 + 1);
        byte byte0 = abyte1[5];
        int i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 72;
            b044604460446044604460446_int_static_fld = 29;
            // fall through

        case 0: // '\0'
            abyte0[word0] = (byte)(abyte1[6] + (byte0 << 4));
            break;
        }
        word0 = (short)(word1 + 1);
        abyte0[word1] = abyte2[1];
        word1 = (short)(word0 + 1);
        abyte0[word0] = abyte2[2];
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        word0 = (short)(word1 + 1);
        abyte0[word1] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[0] << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[1]);
        abyte0[word0] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[2] << 4) + (abyte0[word0] & 0xf));
        return;
        short word0 = b042C042C042C042C042C042C_short_static_fld;
        byte abyte1[] = rrrrgg.b042604260426042604260426;
        short word1 = (short)(word0 + b042C042C042C042C042C042C_byte_array1d_static_fld[2] * 2);
        word0 = (short)(word1 / 2);
        if (word1 % 2 == 1)
        {
            abyte0[word0] = (byte)((abyte0[word0] & 0xf0) + abyte1[0]);
            word0++;
            abyte0[word0] = (byte)((abyte1[1] << 4) + abyte1[2]);
            word0++;
            abyte0[word0] = (byte)((abyte1[3] << 4) + abyte1[4]);
            word0++;
            word1 = abyte1[5];
            abyte0[word0] = (byte)(abyte1[6] + (word1 << 4));
            word1 = (short)(word0 + 1);
            word0 = (short)(word1 + 1);
            abyte0[word1] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[0] << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[1]);
            word1 = (short)(word0 + 1);
            abyte0[word0] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[2] << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[3]);
            word0 = (short)(word1 + 1);
            abyte0[word1] = (byte)((b042C042C042C042C042C042C_byte_array1d_static_fld[4] << 4) + b042C042C042C042C042C042C_byte_array1d_static_fld[5]);
            return;
        }
        abyte2 = rgrrgg.b044A044A044A044A044A044A(String.format(grrrrr.b044C044C044C044C044C044C("\351\374\372\250", '\314', '\002'), new Object[] {
            Integer.valueOf(b042C042C042C042C042C042C_int_static_fld)
        }));
        word1 = (short)(word0 + 1);
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 452
    //                   0 428
    //                   1 186;
           goto _L1 _L2 _L3
_L3:
        continue; /* Loop/switch isn't completed */
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 476
    //                   0 428
    //                   1 186;
           goto _L1 _L2 _L4
_L4:
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey, String s, byte abyte0[])
    {
        try
        {
            lllppl lllppl1 = new lllppl();
            lllppl1.b043604360436043604360436(tokenkey);
            lllppl1.b041B041B041B041B041B041B(s);
            lllppl1.b041B041B041B041B041B041B(abyte0);
            b044604460446044604460446_rrrrrr_pplppp_static_fld.b044004400440044004400440(lllppl1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        String s;
        String s1;
        byte abyte2[];
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
        s1 = grrrrr.b044C044C044C044C044C044C("\uFF6A\uFF6B\uFF6A\uFF6C\uFF6A\uFF6D\uFF6A\uFF6E\uFF6A\uFF6F\uFF6A\uFF70\uFF6A\uFF71\uFF6A\uFF72", '\n', '\274', '\0');
        s = grrrrr.b044C044C044C044C044C044C("\341\341\341\341", '\321', '\002');
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int j;
        j = (short)1;
        abyte2[0] = -128;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int i;
        i = (short)(j + 1);
        abyte2[j] = -30;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte2[i] = 0;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int k;
        k = (short)(j + 1);
        abyte2[j] = 1;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        abyte2[k] = 1;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte2[j] = -111;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word2;
        word2 = (short)(i + 1);
        abyte2[i] = 23;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word2 + 1);
        abyte2[word2] = 1;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte2[i] = -97;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte2[j] = 38;
        abyte2 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word0 = (short)(i + 1);
        j = rgrrgg.b044A044A044A044A044A044A(s1).length;
        byte byte0 = (byte)j;
        int l;
        int i1;
        j = b044604460446044604460446_int_static_fld;
        l = b044604460446044604460446_int_static_fld;
        i1 = b044604460446044604460446_int_static_fld;
        int j1;
        int k1;
        j1 = b044604460446044604460446_int_static_fld;
        k1 = b044604460446044604460446_int_static_fld;
        if (((j + l) * i1) % j1 == k1)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = 57;
        abyte2[i] = byte0;
        byte abyte3[];
        abyte2 = rgrrgg.b044A044A044A044A044A044A(s1);
        abyte3 = b042C042C042C042C042C042C_byte_array1d_static_fld;
          goto _L1
_L11:
        byte abyte1[];
        rgrrgg.b044A044A044A044A044A044A(abyte2, (short)0, abyte3, word0, (short)rgrrgg.b044A044A044A044A044A044A(s1).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(s1).length + word0);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte1[i] = -126;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 60;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        word0 = (short)(j + 1);
        abyte1[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte1[i] = -108;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte1[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte1[j] = 95;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte1[i] = 52;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte1[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte1[j] = -97;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte1[i] = 54;
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte2 = rgrrgg.b044A044A044A044A044A044A(s);
        byte abyte0[];
        abyte1[j] = (byte)abyte2.length;
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)b042C042C042C042C042C042C_int_static_fld);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(s).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 108;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        short word1 = (short)i;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, word0, word1);
        i = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 96;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        j = (short)((short)i + word0);
        i = j;
        if (b041E041E041E041E041E041E.length() <= 0) goto _L3; else goto _L2
_L2:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = 95;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 32;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte1 = b041E041E041E041E041E041E;
          goto _L4
_L13:
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(abyte1).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
_L3:
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = 39;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        abyte1 = b041E041E041E041E041E041E;
        abyte0[i] = (byte)rgrrgg.b044A044A044A044A044A044A(abyte1).length;
        abyte0 = b041E041E041E041E041E041E;
        String s2;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(abyte0);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        s2 = b041E041E041E041E041E041E;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, word0, (short)rgrrgg.b044A044A044A044A044A044A(s2).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        i = j;
        if (b041E041E041E041E041E041E.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_1205;
        }
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 124;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = 110;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        abyte0[i] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E);
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        j = (short)((short)i + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 16;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = 32;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 87;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        b042C042C042C042C042C042C_byte_array1d_static_fld[k] = (byte)(word0 - k - 1);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = b044604460446044604460446_int_static_fld;
        j = b044604460446044604460446_int_static_fld;
        k = b044604460446044604460446_int_static_fld;
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 1540
    //                   0 1551;
           goto _L5 _L6
_L5:
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = 82;
_L6:
        byte byte1 = (byte)(word0 - word2 - 1);
        abyte0[word2] = byte1;
        b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        abyte1 = b043504350435043504350435_byte_array1d_static_fld;
        if (((b0421042104210421042104210421() + b044604460446044604460446_int_static_fld) * b0421042104210421042104210421()) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 50;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        try
        {
            rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, (short)0, word0);
            b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\uFFCB\uFFC3\uFFC3\uFFC9", '\370', '\212', '\001'), b043504350435043504350435_byte_array1d_static_fld);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        try
        {
            throw tokenkey;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        try
        {
            throw tokenkey;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        tokenkey;
        try
        {
            throw tokenkey;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        throw tokenkey;
_L1:
        0;
        JVM INSTR tableswitch 0 1: default 1684
    //                   0 312
    //                   1 1659;
           goto _L7 _L8 _L1
_L8:
        continue; /* Loop/switch isn't completed */
_L7:
        1;
        JVM INSTR tableswitch 0 1: default 1708
    //                   0 1659
    //                   1 312;
           goto _L7 _L1 _L9
_L9:
        if (true) goto _L11; else goto _L10
_L10:
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 1736
    //                   0 1711
    //                   1 931;
           goto _L12 _L4 _L13
_L12:
        0;
        JVM INSTR tableswitch 0 1: default 1760
    //                   0 931
    //                   1 1711;
           goto _L12 _L13 _L4
    }

    private static short b0421042104210421042104210421(byte byte0, byte byte1)
    {
        if (b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld == null)
        {
            return -1;
        }
          goto _L1
_L2:
        short word0;
        short word1 = (short)(word0 + 1);
        word0 = word1;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b0421042104210421042104210421())
        {
            if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
            {
                b044604460446044604460446_int_static_fld = 97;
                b044604460446044604460446_int_static_fld = 80;
            }
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            word0 = word1;
        }
_L3:
        if (word0 < 32 && b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word0] != null)
        {
            byte abyte0[] = (byte[])(byte[])b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld[word0];
            byte byte2 = abyte0[0];
            byte byte3 = abyte0[1];
            if (byte2 == byte0 && byte3 == byte1)
            {
                return word0;
            }
        } else
        {
            return -1;
        }
        if (true) goto _L2; else goto _L1
_L1:
        word0 = 0;
          goto _L3
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
        byte abyte0[] = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word1 = (short)1;
        abyte0[0] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int i = (short)(word1 + 1);
        abyte0[word1] = -30;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        abyte0[i] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = b044604460446044604460446_int_static_fld;
        int j = b0421042104210421042104210421();
        int k = b044604460446044604460446_int_static_fld;
        int l = b0421042104210421042104210421();
        switch ((l * (b044604460446044604460446_int_static_fld + l)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 59;
            b044604460446044604460446_int_static_fld = 64;
            break;

        case 0: // '\0'
            break;
        }
        if (((i + j) * k) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 71;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        i = (short)(word1 + 1);
        abyte0[word1] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        abyte0[i] = 13;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        abyte0[word1] = -110;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        abyte0[i] = 6;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        abyte0[word1] = 10;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        abyte0[i] = -126;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word0 = (short)(word1 + 1);
        abyte0[word1] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        word1 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        abyte0[word1] = -108;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        abyte0[i] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
        b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\u023D\u0236\u0234\u023A", '\254', '\006'), b043504350435043504350435_byte_array1d_static_fld);
    }

    public static int b0421042104210421042104210421(byte abyte0[], short word0, short word1)
    {
        word0 = b044604460446044604460446_int_static_fld;
        switch ((word0 * (b044604460446044604460446_int_static_fld + word0)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 5;
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
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            break;

        case 0: // '\0'
            break;
        }
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 45;
            b044604460446044604460446_int_static_fld = 84;
        }
        return -10;
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        byte abyte0[];
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word2;
        int i = b0421042104210421042104210421();
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 57;
            b044604460446044604460446_int_static_fld = 26;
            // fall through

        case 0: // '\0'
            word2 = (short)1;
            break;
        }
        abyte0[0] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int j;
        j = (short)(word2 + 1);
        abyte0[word2] = -30;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(j + 1);
        abyte0[j] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word3;
        word3 = (short)(word2 + 1);
        abyte0[word2] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word3 + 1);
        abyte0[word3] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(word2 + 1);
        abyte0[word2] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word4;
        word4 = (short)(j + 1);
        abyte0[j] = 3;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(word4 + 1);
        abyte0[word4] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word5;
        word5 = (short)(j + 1);
        abyte0[j] = 112;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word5 + 1);
        abyte0[word5] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(word2 + 1);
        abyte0[word2] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(j + 1);
        abyte0[j] = 7;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word0 = (short)(word2 + 1);
        j = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        byte byte0 = (byte)j;
        abyte0[word2] = byte0;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        word2 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        j = word2;
        if (b041E041E041E041E041E041E.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_511;
        }
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word6;
        word6 = (short)(word2 + 1);
        abyte0[word2] = 95;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(word6 + 1);
        abyte0[word6] = 32;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        String s1 = b041E041E041E041E041E041E;
        byte byte1;
        short word1;
        String s;
        byte abyte1[];
        String s2;
        int k;
        int l;
        int i1;
        try
        {
            k = b044604460446044604460446_int_static_fld;
            l = b044604460446044604460446_int_static_fld;
            i1 = b044604460446044604460446_int_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        switch ((k * (l + k)) % i1)
        {
        default:
            try
            {
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey;
            }
            break;

        case 0: // '\0'
            break;
        }
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(s1).length;
        s = b041E041E041E041E041E041E;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(s), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        l = b041E041E041E041E041E041E.length();
        k = j;
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_625;
        }
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        s[j] = -97;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        s[k] = 124;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        s[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        k = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        s[k] = 95;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(j + 1);
        s[j] = 40;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(k + 1);
        s[k] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        word1 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        word0 = word1;
        if (b042C042C042C042C042C042C_java_lang_String_static_fld.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_932;
        }
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        k = (short)(word1 + 1);
        s[word1] = -97;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(k + 1);
        s[k] = 25;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        k = rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length;
        byte1 = (byte)k;
        s[j] = byte1;
        s = rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld);
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 22;
            b044604460446044604460446_int_static_fld = 38;
        }
        s2 = b042C042C042C042C042C042C_java_lang_String_static_fld;
        j = b044604460446044604460446_int_static_fld;
        k = b044604460446044604460446_int_static_fld;
        switch ((j * (k + j)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            j = b0421042104210421042104210421();
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_904;
        }
        b044604460446044604460446_int_static_fld = j;
        rgrrgg.b044A044A044A044A044A044A(s, (short)0, abyte1, word0, (short)rgrrgg.b044A044A044A044A044A044A(s2).length);
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length + word0);
        b042C042C042C042C042C042C_byte_array1d_static_fld[word3] = (byte)(word0 - word3 - 1);
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        byte1 = (byte)(word0 - word4 - 1);
        s[word4] = byte1;
        s = b042C042C042C042C042C042C_byte_array1d_static_fld;
        s[word5] = (byte)(word0 - word5 - 1);
        try
        {
            b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
            rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
            b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\uFFB7\uFFB8\uFFB7\uFFBA", 'y', '\0'), b043504350435043504350435_byte_array1d_static_fld);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        break MISSING_BLOCK_LABEL_1026;
        tokenkey;
        try
        {
            throw tokenkey;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        throw tokenkey;
        throw tokenkey;
    }

    public static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        int i = b0421042104210421042104210421();
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 72;
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
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
        b0421042104210421042104210421(tokenkey);
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 81;
        }
        b0421042104210421042104210421(b043504350435043504350435_byte_array1d_static_fld, (short)0, (short)b043504350435043504350435_byte_array1d_static_fld.length);
    }

    private static boolean b0421042104210421042104210421(TokenInfo tokeninfo, rggrrr rggrrr1, boolean flag)
    {
        b043504350435043504350435_byte_static_fld = -91;
        b043504350435043504350435_java_lang_String_static_fld = "";
        DynParams dynparams = tokeninfo.getHceData().getDynParams();
        StaticParams staticparams = tokeninfo.getHceData().getStaticParams();
        Object obj;
        Object obj1;
        String s;
        int i;
        if (flag)
        {
            b042C042C042C042C042C042C_java_lang_String_static_fld = tokeninfo.getToken();
        } else
        {
            b042C042C042C042C042C042C_java_lang_String_static_fld = rggrrr1.b044C044C044C044C044C044C();
        }
        b042C042C042C042C042C042C_java_lang_String_static_fld = b042C042C042C042C042C042C_java_lang_String_static_fld;
        if (tokeninfo.getTokenRequestorID() != null)
        {
            b042C042C042C042C042C042C_java_lang_String_static_fld = tokeninfo.getTokenRequestorID();
            if (b042C042C042C042C042C042C_java_lang_String_static_fld.length() == 11)
            {
                b042C042C042C042C042C042C_java_lang_String_static_fld = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("\uFE6A", '\343', '\003')).append(b042C042C042C042C042C042C_java_lang_String_static_fld).toString();
            }
            b041E041E041E041E041E041E = b042C042C042C042C042C042C_java_lang_String_static_fld;
        } else
        {
            b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        }
        obj = staticparams.getAidInfos();
        if (obj == null || ((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        obj1 = (AidInfo)((List) (obj)).get(0);
        s = ((AidInfo) (obj1)).getAid();
        if (s.compareTo(b043504350435043504350435_java_lang_String_static_fld) == 0)
        {
            b043504350435043504350435_byte_static_fld = 90;
            b043504350435043504350435_java_lang_String_static_fld = s;
            b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj1)).getPriority();
            if (b043504350435043504350435_java_lang_String_static_fld.length() == 1)
            {
                b043504350435043504350435_java_lang_String_static_fld = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("\u0190", '\365', 'k', '\003')).append(b043504350435043504350435_java_lang_String_static_fld).toString();
            }
            b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj1)).getApplicationLabel();
            b042C042C042C042C042C042C_java_lang_String_static_fld = ((AidInfo) (obj1)).getCap();
        } else
        {
            b042C042C042C042C042C042C_java_lang_String_static_fld = s;
            b042C042C042C042C042C042C_java_lang_String_static_fld = b042C042C042C042C042C042C_java_lang_String_static_fld;
            b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj1)).getPriority();
            if (b043504350435043504350435_java_lang_String_static_fld.length() == 1)
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
                b043504350435043504350435_java_lang_String_static_fld = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("\uFF59", 'd', 's', '\0')).append(b043504350435043504350435_java_lang_String_static_fld).toString();
            }
            b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj1)).getApplicationLabel();
            b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj1)).getCap();
        }
        if (((List) (obj)).size() > 1)
        {
            obj = (AidInfo)((List) (obj)).get(1);
            obj1 = ((AidInfo) (obj)).getAid();
            if (((String) (obj1)).compareTo(b043504350435043504350435_java_lang_String_static_fld) == 0)
            {
                b043504350435043504350435_byte_static_fld = 90;
                if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
                {
                    b044604460446044604460446_int_static_fld = 2;
                    b044604460446044604460446_int_static_fld = 22;
                }
                b043504350435043504350435_java_lang_String_static_fld = ((String) (obj1));
                b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj)).getPriority();
                if (b043504350435043504350435_java_lang_String_static_fld.length() == 1)
                {
                    b043504350435043504350435_java_lang_String_static_fld = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("\uFF6E", '\302', '\0')).append(b043504350435043504350435_java_lang_String_static_fld).toString();
                }
                b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj)).getApplicationLabel();
                b042C042C042C042C042C042C_java_lang_String_static_fld = ((AidInfo) (obj)).getCap();
            } else
            {
                b042C042C042C042C042C042C_java_lang_String_static_fld = ((String) (obj1));
                b042C042C042C042C042C042C_java_lang_String_static_fld = b042C042C042C042C042C042C_java_lang_String_static_fld;
                b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj)).getPriority();
                if (b043504350435043504350435_java_lang_String_static_fld.length() == 1)
                {
                    b043504350435043504350435_java_lang_String_static_fld = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("\u0118", '\350', '\005')).append(b043504350435043504350435_java_lang_String_static_fld).toString();
                }
                b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj)).getApplicationLabel();
                b043504350435043504350435_java_lang_String_static_fld = ((AidInfo) (obj)).getCap();
            }
        }
        if (tokeninfo.getLang() != null)
        {
            b042C042C042C042C042C042C_java_lang_String_static_fld = tokeninfo.getLang();
        } else
        {
            b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        }
        b042C042C042C042C042C042C_java_lang_String_static_fld = tokeninfo.getAppPrgrmID();
        b041E041E041E041E041E041E = (new StringBuilder()).append(tokeninfo.getExpirationDate().getYear().substring(2, 4)).append(tokeninfo.getExpirationDate().getMonth()).toString();
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        b041E041E041E041E041E041E = staticparams.getKernelIdentifier();
        if (b041E041E041E041E041E041E.length() == 1)
        {
            b041E041E041E041E041E041E = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("v", 'F', '\002')).append(b041E041E041E041E041E041E).toString();
        }
        if (staticparams.getIssuerIdentificationNumber() != null)
        {
            b043504350435043504350435_java_lang_String_static_fld = staticparams.getIssuerIdentificationNumber();
        } else
        {
            b043504350435043504350435_java_lang_String_static_fld = "";
        }
        if (staticparams.getCountrycode5F55() != null)
        {
            b043504350435043504350435_java_lang_String_static_fld = staticparams.getCountrycode5F55();
        } else
        {
            b043504350435043504350435_java_lang_String_static_fld = "";
        }
        tokeninfo = staticparams.getMsdData();
        if (tokeninfo != null && tokeninfo.getAip() != null)
        {
            b041E041E041E041E041E041E = tokeninfo.getAip();
            b041E041E041E041E041E041E = tokeninfo.getAfl();
        } else
        {
            b041E041E041E041E041E041E = "";
            b041E041E041E041E041E041E = "";
        }
        b042C042C042C042C042C042C_byte_static_fld = -91;
        if (staticparams.getTrack2DataDec() != null && staticparams.getTrack2DataDec().getSvcCode() != null)
        {
            b041E041E041E041E041E041E = staticparams.getTrack2DataDec().getSvcCode();
            b041E041E041E041E041E041E = b041E041E041E041E041E041E;
            b042C042C042C042C042C042C_byte_static_fld = 90;
        } else
        {
            b041E041E041E041E041E041E = "";
            b041E041E041E041E041E041E = "";
        }
        if (staticparams.getTrack2DataNotDec() != null && staticparams.getTrack2DataNotDec().getSvcCode() != null)
        {
            b041E041E041E041E041E041E = staticparams.getTrack2DataNotDec().getSvcCode();
            b041E041E041E041E041E041E = staticparams.getTrack2DataNotDec().getTrack2DiscData();
            if (staticparams.getTrack2DataNotDec().getPinVerField() != null)
            {
                b041E041E041E041E041E041E = staticparams.getTrack2DataNotDec().getPinVerField();
            } else
            {
                b041E041E041E041E041E041E = "";
            }
        } else
        {
            b041E041E041E041E041E041E = "";
            b041E041E041E041E041E041E = "";
            b041E041E041E041E041E041E = "";
        }
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getCtq();
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getFfi();
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getAuc();
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getPsn();
        if (b041E041E041E041E041E041E.length() == 1)
        {
            if (((b0421042104210421042104210421() + b044604460446044604460446_int_static_fld) * b0421042104210421042104210421()) % b044604460446044604460446_int_static_fld != b0421042104210421042104210421())
            {
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
                {
                    b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                    b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                }
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            }
            b041E041E041E041E041E041E = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("\u0166", '\352', 'L', '\003')).append(b041E041E041E041E041E041E).toString();
        }
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 87;
            b044604460446044604460446_int_static_fld = 25;
            break;

        case 0: // '\0'
            break;
        }
        if (staticparams.getQvsdcData().getCed() != null)
        {
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getCed();
        } else
        {
            b041E041E041E041E041E041E = "";
        }
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getCountryCode();
        if (b041E041E041E041E041E041E.length() == 3)
        {
            b041E041E041E041E041E041E = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("\uFDFC", '\274', '\004')).append(b041E041E041E041E041E041E).toString();
        }
        if (staticparams.getCardHolderNameVCPCS() != null)
        {
            b041E041E041E041E041E041E = staticparams.getCardHolderNameVCPCS();
            b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        } else
        {
            b041E041E041E041E041E041E = "";
            b041E041E041E041E041E041E = "";
        }
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getCid();
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getCvn();
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithoutODA().getAfl();
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithoutODA().getAip();
        b041E041E041E041E041E041E = staticparams.getQvsdcData().getDigitalWalletID();
        b041E041E041E041E041E041E = rggrrr1.b044C044C044C044C044C044C().substring(1, 8);
        b041E041E041E041E041E041E = rggrrr1.b044C044C044C044C044C044C();
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        b041E041E041E041E041E041E = dynparams.getDki();
        if (b041E041E041E041E041E041E.length() == 1)
        {
            b041E041E041E041E041E041E = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C(";", '\013', '\002')).append(b041E041E041E041E041E041E).toString();
        }
        if (staticparams.getQvsdcData().getQvsdcWithODA() != null && staticparams.getQvsdcData().getQvsdcWithODA().getAip() != null)
        {
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getAip();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getAfl();
        } else
        {
            b041E041E041E041E041E041E = "";
            b041E041E041E041E041E041E = "";
        }
        b041E041E041E041E041E041E = grrrrr.b044C044C044C044C044C044C("\uFDA5\uFDA6\uFDA5\uFDA7\uFDA5\uFDA8\uFDA5\uFDA9\uFDA5\uFDAA\uFDA5\uFDAB\uFDA5\uFDAC\uFDA5\uFDAD", '\331', '\004');
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        b041E041E041E041E041E041E = grrrrr.b044C044C044C044C044C044C("\266\266\266\266", '\206', '\005');
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        b041E041E041E041E041E041E = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("\uFF26\uFF3B", 'Y', '\004')).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(grrrrr.b044C044C044C044C044C044C("\u0111\u0111", '\341', '\005')).append(grrrrr.b044C044C044C044C044C044C("\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A\uFF0A", 'b', '\004')).toString();
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        if (b041E041E041E041E041E041E.length() <= 0 || b041E041E041E041E041E041E.length() <= 0) goto _L4; else goto _L3
_L3:
        b041E041E041E041E041E041E = (new StringBuilder()).append(b042C042C042C042C042C042C_java_lang_String_static_fld).append(grrrrr.b044C044C044C044C044C044C("\u02F9", '\347', '\006')).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(grrrrr.b044C044C044C044C044C044C("\234\234\234\234\234\234", 'l', '\005')).append(grrrrr.b044C044C044C044C044C044C("*", '>', '"', '\001')).toString();
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
_L6:
        b041E041E041E041E041E041E = b041E041E041E041E041E041E;
        if (b041E041E041E041E041E041E.length() > 0)
        {
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIPubkCert();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIPubkExpo();
            if (b041E041E041E041E041E041E.length() == 1)
            {
                b041E041E041E041E041E041E = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("L", '\324', '\270', '\002')).append(b041E041E041E041E041E041E).toString();
            }
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIPubkRem();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getCapki();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIcc().getIccPubKCert();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIcc().getIccPubKExpo();
            if (b041E041E041E041E041E041E.length() == 1)
            {
                b041E041E041E041E041E041E = (new StringBuilder()).append(grrrrr.b044C044C044C044C044C044C("\uFF71", '\'', '\230', '\0')).append(b041E041E041E041E041E041E).toString();
            }
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIcc().getIccPubKRem();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getAppExpDate();
            b041E041E041E041E041E041E = b042C042C042C042C042C042C_java_lang_String_static_fld;
            b041E041E041E041E041E041E = b041E041E041E041E041E041E;
            b041E041E041E041E041E041E = grrrrr.b044C044C044C044C044C044C("\uFE6B\uFE6C\uFE6B\uFE6D\uFE6B\uFE6E\uFE6B\uFE6F\uFE6B\uFE70\uFE6B\uFE71\uFE6B\uFE72", '\227', '\004');
            b041E041E041E041E041E041E = b041E041E041E041E041E041E;
            b041E041E041E041E041E041E = b042C042C042C042C042C042C_java_lang_String_static_fld;
            b041E041E041E041E041E041E = rggrrr1.b044C044C044C044C044C044C();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIcc().getIccKeymod();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIcc().getIccCRTCoeffQModP();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIcc().getIccCRTCoeffDModQ();
            b041E041E041E041E041E041E = staticparams.getQvsdcData().getQvsdcWithODA().getIcc().getIccCRTCoeffDModP();
            b044604460446044604460446_java_lang_String_static_fld = staticparams.getQvsdcData().getQvsdcWithODA().getIcc().getIccCRTprimep();
            b044604460446044604460446_java_lang_String_static_fld = staticparams.getQvsdcData().getQvsdcWithODA().getIcc().getIccCRTprimeq();
            b044604460446044604460446_short_static_fld = (short)b044604460446044604460446_java_lang_String_static_fld.length();
            b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[b044604460446044604460446_short_static_fld];
        }
        return true;
_L2:
        return false;
_L4:
        b041E041E041E041E041E041E = (new StringBuilder()).append(b042C042C042C042C042C042C_java_lang_String_static_fld).append(grrrrr.b044C044C044C044C044C044C("\u0127", '\243', '@', '\003')).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).append(b041E041E041E041E041E041E).toString();
        if (b041E041E041E041E041E041E.length() % 2 != 0)
        {
            b041E041E041E041E041E041E = (new StringBuilder()).append(b041E041E041E041E041E041E).append(grrrrr.b044C044C044C044C044C044C("\uFFA0", 'S', '\003')).toString();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void b0421042104210421042104210421()
    {
        if (b042C042C042C042C042C042C_byte_static_fld != 90)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        b0415041504150415041504150415();
_L3:
        if (b042C042C042C042C042C042C_byte_static_fld != 90) goto _L2; else goto _L1
_L1:
        b0415041504150415041504150415();
        Object obj;
        Object obj2;
        Object obj3;
        BigInteger biginteger;
        obj = new BigInteger(b041E041E041E041E041E041E, b044604460446044604460446_int_static_fld);
        obj2 = new BigInteger(b044604460446044604460446_java_lang_String_static_fld, b044604460446044604460446_int_static_fld);
        obj3 = new BigInteger(b041E041E041E041E041E041E, b044604460446044604460446_int_static_fld);
        biginteger = new BigInteger(b044604460446044604460446_java_lang_String_static_fld, b044604460446044604460446_int_static_fld);
        String s;
        int i;
        s = b044604460446044604460446_java_lang_String_static_fld;
        i = b044604460446044604460446_int_static_fld;
        Object obj1;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            j = b0421042104210421042104210421();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        try
        {
            k = b044604460446044604460446_int_static_fld;
            l = b0421042104210421042104210421();
            i1 = b044604460446044604460446_int_static_fld;
            j1 = b044604460446044604460446_int_static_fld;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((j + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        j = b0421042104210421042104210421();
        switch ((j * (b044604460446044604460446_int_static_fld + j)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 39;
            break;

        case 0: // '\0'
            break;
        }
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        b044604460446044604460446_int_static_fld = 1;
        b044604460446044604460446_java_security_spec_RSAPrivateCrtKeySpec_static_fld = new RSAPrivateCrtKeySpec(((BigInteger) (obj)), ((BigInteger) (obj2)), ((BigInteger) (obj3)), biginteger, new BigInteger(s, i), new BigInteger(b041E041E041E041E041E041E, b044604460446044604460446_int_static_fld), new BigInteger(b041E041E041E041E041E041E, b044604460446044604460446_int_static_fld), new BigInteger(b041E041E041E041E041E041E, b044604460446044604460446_int_static_fld));
        obj = MessageDigest.getInstance(grrrrr.b044C044C044C044C044C044C("\222\207\200", '?', '\005'));
        b044604460446044604460446_java_security_MessageDigest_static_fld = ((MessageDigest) (obj));
        obj = (RSAPrivateCrtKey)KeyFactory.getInstance(grrrrr.b044C044C044C044C044C044C("()\027", '*', '\0')).generatePrivate(b044604460446044604460446_java_security_spec_RSAPrivateCrtKeySpec_static_fld);
        b044604460446044604460446_javax_crypto_Cipher_static_fld = Cipher.getInstance(grrrrr.b044C044C044C044C044C044C("\uFFD7\uFFD8\uFFC6\uFFB4\uFFD3\uFFF4\uFFF3\uFFEA\uFFB4\uFFD3\uFFF4\uFFD5\uFFE6\uFFE9\uFFE9\uFFEE\uFFF3\uFFEC", '{', '\0'));
        obj2 = b044604460446044604460446_javax_crypto_Cipher_static_fld;
        obj3 = b044604460446044604460446_javax_crypto_Cipher_static_fld;
        ((Cipher) (obj2)).init(1, ((java.security.Key) (obj)));
_L2:
        return;
        obj1;
        ppplpp.b0415041504150415041504150415(b043504350435043504350435_java_lang_String_static_fld, grrrrr.b044C044C044C044C044C044C("\u0189\u01AE\u01B6\u01A1\u01AC\u01A9\u01A4\u018B\u01A5\u01B9\u0193\u01B0\u01A5\u01A3\u0185\u01B8\u01A3\u01A5\u01B0\u01B4\u01A9\u01AF\u01AE\u0160\u0171", '\240', '\001'));
        return;
        obj1;
        throw obj1;
        obj1;
        obj1 = b043504350435043504350435_java_lang_String_static_fld;
        ppplpp.b0415041504150415041504150415(((String) (obj1)), grrrrr.b044C044C044C044C044C044C("\350\u0109\355\u010F\375\u0102\352\373\376\376\u0103\u0108\u0101\337\u0112\375\377\u010A\u010E\u0103\u0109\u0108\272\313", '\215', '\r', '\003'));
        return;
        obj1;
        throw obj1;
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[16];
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[3];
          goto _L3
        obj1;
        ppplpp.b0415041504150415041504150415(b043504350435043504350435_java_lang_String_static_fld, grrrrr.b044C044C044C044C044C044C("9Z>`NS,WRZ]T_SX0cNP[_TZY\013\034", '\342', '\367', '\002'));
        return;
        obj1;
        ppplpp.b0415041504150415041504150415(b043504350435043504350435_java_lang_String_static_fld, grrrrr.b044C044C044C044C044C044C("\uFFAF\uFFD4\uFFDC\uFFC7\uFFD2\uFFCF\uFFCA\uFFB1\uFFCB\uFFDF\uFFAB\uFFDE\uFFC9\uFFCB\uFFD6\uFFDA\uFFCF\uFFD5\uFFD4\uFF86\uFF97", '\232', '\0'));
        return;
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        short word0;
        byte abyte0[];
        byte abyte1[];
        String s;
        int i;
        short word1;
        try
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            try
            {
                throw tokenkey;
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey;
            }
        }
        word1 = (short)1;
        abyte0[0] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        abyte0[word1] = -30;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        abyte0[i] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        abyte0[word1] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        abyte0[i] = 19;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word1 + 1);
        abyte0[word1] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word1 = (short)(i + 1);
        abyte0[i] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(word1 + 1);
        abyte0[word1] = 16;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E);
        i = b044604460446044604460446_int_static_fld;
        (i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld;
        JVM INSTR tableswitch 0 0: default 327
    //                   0 238;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_238;
_L1:
        b044604460446044604460446_int_static_fld = 43;
        b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 77;
            b044604460446044604460446_int_static_fld = 77;
            break;

        case 0: // '\0'
            break;
        }
        abyte1 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        s = b041E041E041E041E041E041E;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, word0, (short)rgrrgg.b044A044A044A044A044A044A(s).length);
        i = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        word0 = (short)((short)i + word0);
        b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        abyte1 = b043504350435043504350435_byte_array1d_static_fld;
        try
        {
            rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte1, (short)0, word0);
            b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("6...", '~', '|', '\001'), b043504350435043504350435_byte_array1d_static_fld);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey) { }
        throw tokenkey;
    }

    public static void b0421042104210421042104210421()
    {
        short word0;
        byte abyte0[];
        byte abyte1[];
        int i;
        int j;
        int k;
        try
        {
            abyte0 = new byte[43];
        }
        catch (Exception exception)
        {
            throw exception;
        }
        abyte0[0] = -128;
        abyte0[1] = -30;
        i = b0421042104210421042104210421();
        j = b044604460446044604460446_int_static_fld;
        k = b044604460446044604460446_int_static_fld;
        switch ((i * (j + i)) % k)
        {
        default:
            try
            {
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                b044604460446044604460446_int_static_fld = 16;
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
            // fall through

        case 0: // '\0'
            abyte0[2] = 0;
            abyte0[3] = 1;
            abyte0[4] = 37;
            abyte0[5] = -111;
            abyte0[6] = 2;
            abyte0[7] = 34;
            abyte0[8] = 111;
            abyte0[9] = 32;
            abyte0[10] = -124;
            abyte0[11] = 14;
            abyte0[12] = 50;
            abyte0[13] = 80;
            abyte0[14] = 65;
            abyte0[15] = 89;
            abyte0[16] = 46;
            abyte0[17] = 83;
            abyte0[18] = 89;
            abyte0[19] = 83;
            abyte0[20] = 46;
            break;
        }
          goto _L1
_L3:
        abyte0[21] = 68;
        abyte0[22] = 68;
        abyte0[23] = 70;
        abyte0[24] = 48;
        abyte0[25] = 49;
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            // fall through

        case 0: // '\0'
            abyte0[26] = -91;
            break;
        }
        abyte0[27] = 14;
        abyte0[28] = -65;
        abyte0[29] = 12;
        abyte0[30] = 11;
        abyte0[31] = 97;
        abyte0[32] = 9;
        abyte0[33] = 79;
        abyte0[34] = 7;
        abyte0[35] = -96;
        abyte0[36] = 0;
        abyte0[37] = 0;
        abyte0[38] = 0;
        abyte0[39] = 3;
        abyte0[40] = 16;
        abyte0[41] = 16;
        abyte0[42] = 0;
        abyte1 = new byte[62];
        abyte1[0] = -128;
        abyte1[1] = -30;
        abyte1[2] = 0;
        abyte1[3] = 1;
        abyte1[4] = 56;
        abyte1[5] = -111;
        abyte1[6] = 3;
        abyte1[7] = 53;
        abyte1[8] = 111;
        abyte1[9] = 51;
        abyte1[10] = -124;
        abyte1[11] = 7;
        abyte1[12] = -96;
        abyte1[13] = 0;
        abyte1[14] = 0;
        abyte1[15] = 0;
        abyte1[16] = 3;
        abyte1[17] = 16;
        abyte1[18] = 16;
        abyte1[19] = -91;
        abyte1[20] = 40;
        abyte1[21] = 80;
        abyte1[22] = 11;
        abyte1[23] = 86;
        abyte1[24] = 73;
        abyte1[25] = 83;
        abyte1[26] = 65;
        abyte1[27] = 32;
        abyte1[28] = 67;
        abyte1[29] = 82;
        abyte1[30] = 69;
        abyte1[31] = 68;
        abyte1[32] = 73;
        abyte1[33] = 84;
        abyte1[34] = -97;
        abyte1[35] = 56;
        abyte1[36] = 24;
        abyte1[37] = -97;
        abyte1[38] = 102;
        abyte1[39] = 4;
        abyte1[40] = -97;
        abyte1[41] = 2;
        abyte1[42] = 6;
        abyte1[43] = -97;
        abyte1[44] = 3;
        abyte1[45] = 6;
        abyte1[46] = -97;
        abyte1[47] = 26;
        abyte1[48] = 2;
        abyte1[49] = -107;
        abyte1[50] = 5;
        abyte1[51] = 95;
        abyte1[52] = 42;
        abyte1[53] = 2;
        abyte1[54] = -102;
        abyte1[55] = 3;
        abyte1[56] = -100;
        abyte1[57] = 1;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b0421042104210421042104210421() != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = 44;
            b044604460446044604460446_int_static_fld = 66;
        }
        abyte1[58] = -97;
        abyte1[59] = 55;
        abyte1[60] = 4;
        abyte1[61] = 0;
        i = abyte0.length;
        word0 = (short)i;
        b0421042104210421042104210421(abyte0, (short)0, word0);
        b0421042104210421042104210421(abyte1, (short)0, (short)abyte1.length);
        b042C042C042C042C042C042C_byte_static_fld = 90;
        return;
_L1:
        0;
        JVM INSTR tableswitch 0 1: default 792
    //                   0 177
    //                   1 768;
           goto _L2 _L3 _L1
_L2:
        0;
        JVM INSTR tableswitch 0 1: default 816
    //                   0 177
    //                   1 768;
           goto _L2 _L3 _L1
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        byte byte0;
        short word0;
        short word1;
        byte abyte0[];
        byte abyte1[];
        int i;
        int j;
        short word2;
        short word3;
        short word4;
        short word5;
        int k;
        try
        {
            abyte0 = new byte[256];
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        word2 = (short)1;
        abyte0[0] = 111;
        i = (short)(word2 + 1);
        abyte0[word2] = 1;
        j = (short)(i + 1);
        abyte0[i] = -124;
        word0 = (short)(j + 1);
        try
        {
            abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length;
            rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld), (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length);
            i = (short)(word0 + (short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length);
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        word3 = (short)(i + 1);
        abyte0[i] = -91;
        word0 = (short)(word3 + 1);
        abyte0[word3] = 1;
        abyte0[rgrrgg.b044A044A044A044A044A044A(abyte0, word0, (short)-16628)] = 1;
        break MISSING_BLOCK_LABEL_136;
_L5:
        i = (short)(word5 + 1);
        abyte0[word5] = 1;
        j = (short)(i + 1);
        abyte0[i] = 79;
        word0 = (short)(j + 1);
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
        abyte0[j] = 7;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld), (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length);
        j = (short)(word0 + (short)rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_java_lang_String_static_fld).length);
        i = j;
        if (b043504350435043504350435_java_lang_String_static_fld.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        i = (short)(j + 1);
        abyte0[j] = 80;
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 34;
        }
        word0 = (short)(i + 1);
        j = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        byte0 = (byte)j;
        abyte0[i] = byte0;
        abyte1 = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld);
        rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        i = (short)(word0 + (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        j = (short)(i + 1);
        abyte0[i] = -121;
        word0 = (short)(j + 1);
        abyte0[j] = 1;
        abyte1 = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld);
        i = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        word1 = (short)i;
        rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, abyte0, word0, word1);
        j = (short)(word0 + 1);
        i = (short)(j + 1);
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
        abyte0[j] = -97;
        j = (short)(i + 1);
        abyte0[i] = 42;
        word0 = (short)(j + 1);
        abyte0[j] = 1;
          goto _L1
_L3:
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        word1 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        if (b043504350435043504350435_byte_static_fld == 90)
        {
            break MISSING_BLOCK_LABEL_633;
        }
        word0 = word1;
        if (b043504350435043504350435_byte_static_fld != -91)
        {
            break MISSING_BLOCK_LABEL_690;
        }
        word0 = word1;
        if (b043504350435043504350435_java_lang_String_static_fld.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_690;
        }
        i = (short)(word1 + 1);
        abyte0[word1] = 66;
        word0 = (short)(i + 1);
        abyte0[i] = 3;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        word0 += (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        if (b043504350435043504350435_byte_static_fld == 90)
        {
            break MISSING_BLOCK_LABEL_719;
        }
        word1 = word0;
        if (b043504350435043504350435_byte_static_fld != -91)
        {
            break MISSING_BLOCK_LABEL_790;
        }
        word1 = word0;
        if (b043504350435043504350435_java_lang_String_static_fld.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_790;
        }
        i = (short)(word0 + 1);
        abyte0[word0] = 95;
        j = (short)(i + 1);
        abyte0[i] = 85;
        word0 = (short)(j + 1);
        abyte0[j] = 2;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        word1 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length + word0);
        abyte0[word5] = (byte)(word1 - word5 - 1);
        word0 = word1;
        if (b043504350435043504350435_byte_static_fld != 90)
        {
            break MISSING_BLOCK_LABEL_1443;
        }
        word5 = (short)(word1 + 1);
        abyte0[word1] = 97;
        i = (short)(word5 + 1);
        abyte0[word5] = 1;
        j = (short)(i + 1);
        abyte0[i] = 79;
        word0 = (short)(j + 1);
        abyte0[j] = 7;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        abyte1 = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld);
        i = b0421042104210421042104210421();
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 67;
            b044604460446044604460446_int_static_fld = 9;
            break;

        case 0: // '\0'
            break;
        }
        i = abyte1.length;
        j = (short)(word0 + (short)i);
        k = b043504350435043504350435_java_lang_String_static_fld.length();
        i = j;
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_1049;
        }
        i = (short)(j + 1);
        abyte0[j] = 80;
        word0 = (short)(i + 1);
        abyte0[i] = (byte)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        abyte1 = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld);
        i = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        word1 = (short)i;
        rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, abyte0, word0, word1);
        i = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        i = (short)(word0 + (short)i);
        j = (short)(i + 1);
        abyte0[i] = -121;
        word0 = (short)(j + 1);
        abyte0[j] = 1;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        j = (short)(word0 + 1);
        i = (short)(j + 1);
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b0421042104210421042104210421() != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = 6;
        }
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        abyte0[j] = -97;
        j = (short)(i + 1);
        abyte0[i] = 42;
        word0 = (short)(j + 1);
        abyte0[j] = 1;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        i = (short)(j + 1);
        abyte0[j] = 66;
        j = b044604460446044604460446_int_static_fld;
        switch ((j * (b044604460446044604460446_int_static_fld + j)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            // fall through

        case 0: // '\0'
            word0 = (short)(i + 1);
            break;
        }
        abyte0[i] = 3;
        abyte1 = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld);
        rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        i = rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length;
        j = (short)(word0 + (short)i);
        i = (short)(j + 1);
        abyte0[j] = 95;
        j = (short)(i + 1);
        abyte0[i] = 85;
        word0 = (short)(j + 1);
        abyte0[j] = 2;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld), (short)0, abyte0, word0, (short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length);
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b043504350435043504350435_java_lang_String_static_fld).length + word0);
        abyte0[word5] = (byte)(word0 - word5 - 1);
        abyte0[word2] = (byte)(word0 - word2 - 1);
        byte0 = (byte)(word0 - word3 - 1);
        abyte0[word3] = byte0;
        abyte0[word4] = (byte)(word0 - word4 - 1);
        abyte1 = new byte[(short)(word0 + 2)];
        b043504350435043504350435_byte_array1d_static_fld = abyte1;
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
        b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\330\320\321\323", '\341', '\002'), b043504350435043504350435_byte_array1d_static_fld);
        return;
        word4 = (short)(word0 + 2);
        i = (short)(word4 + 1);
        word5 = (short)(i + 1);
        abyte0[i] = 97;
label2:
        do
        {
            switch (1)
            {
            case 0: // '\0'
                continue;

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
            do
            {
                switch (1)
                {
                default:
                    break;

                case 0: // '\0'
                    continue label2;

                case 1: // '\001'
                    continue; /* Loop/switch isn't completed */
                }
            } while (true);
        } while (true);
_L1:
        0;
        JVM INSTR tableswitch 0 1: default 1604
    //                   0 571
    //                   1 1579;
           goto _L2 _L3 _L1
_L2:
        0;
        JVM INSTR tableswitch 0 1: default 1628
    //                   0 571
    //                   1 1579;
           goto _L2 _L3 _L1
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static byte[] b0421042104210421042104210421(byte abyte0[], short word0, byte abyte1[], short word1)
    {
        abyte1 = new byte[word1];
        if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
label0:
        do
        {
            if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
            {
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                b044604460446044604460446_int_static_fld = 95;
            }
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
        rgrrgg.b044A044A044A044A044A044A(abyte0, word0, abyte1, (short)0, word1);
        return abyte1;
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
        byte abyte0[] = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word3 = (short)1;
        abyte0[0] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word2 = (short)(word3 + 1);
        abyte0[word3] = -30;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word3 = (short)(word2 + 1);
        abyte0[word2] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word2 = (short)(word3 + 1);
        abyte0[word3] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word3 = (short)(word2 + 1);
        abyte0[word2] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word4 = (short)(word3 + 1);
        abyte0[word3] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word3 = (short)(word4 + 1);
        abyte0[word4] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int i = (short)(word3 + 1);
        abyte0[word3] = 23;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word4 = (short)(i + 1);
        abyte0[i] = 112;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word4 + 1);
        abyte0[word4] = 21;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word5 = (short)(i + 1);
        abyte0[i] = 87;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word0 = (short)(word5 + 1);
        abyte0[word5] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        short word1 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        word0 = word1;
        if (b041E041E041E041E041E041E.length() > 0)
        {
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
            i = (short)(word1 + 1);
            abyte0[word1] = 95;
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
            short word6 = (short)(i + 1);
            abyte0[i] = 32;
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
            word0 = (short)(word6 + 1);
            abyte0[word6] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
            rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
            word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        }
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 59;
            b044604460446044604460446_int_static_fld = 95;
            if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
            {
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                b044604460446044604460446_int_static_fld = 17;
            }
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
        abyte0[word2] = (byte)(word0 - word2 - 1);
        b042C042C042C042C042C042C_byte_array1d_static_fld[word3] = (byte)(word0 - word3 - 1);
        b042C042C042C042C042C042C_byte_array1d_static_fld[word4] = (byte)(word0 - word4 - 1);
        b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
        b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\uFFAC\uFFAD\uFFAC\uFFAD", 'B', '\003'), b043504350435043504350435_byte_array1d_static_fld);
    }

    private static void b0421042104210421042104210421(TokenKey tokenkey)
    {
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[256];
        byte abyte0[] = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int j = (short)1;
        abyte0[0] = -128;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        int i = (short)(j + 1);
        abyte0[j] = -30;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 0;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word1 = (short)(j + 1);
        abyte0[j] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(word1 + 1);
        abyte0[word1] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = 2;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word2 = (short)(i + 1);
        abyte0[i] = 3;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word2 + 1);
        abyte0[word2] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word3 = (short)(i + 1);
        abyte0[i] = 112;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(word3 + 1);
        abyte0[word3] = 1;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = 70;
        if (rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length >= 128)
        {
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
            j = (short)(i + 1);
            abyte0[i] = -127;
            i = j;
        }
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        short word0 = (short)(i + 1);
        abyte0[i] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        j = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
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
        abyte0[j] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = 71;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(j + 1);
        abyte0[j] = (byte)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
        rgrrgg.b044A044A044A044A044A044A(rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E), (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, word0, (short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length);
        i = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        j = (short)(i + 1);
        abyte0[i] = -97;
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        i = (short)(j + 1);
        abyte0[j] = 72;
        if (rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length >= 128)
        {
            abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
            j = (short)(i + 1);
            abyte0[i] = -127;
            i = j;
        }
        abyte0 = b042C042C042C042C042C042C_byte_array1d_static_fld;
        word0 = (short)(i + 1);
        j = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length;
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
        abyte0[i] = (byte)j;
        abyte0 = rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E);
        byte abyte2[] = b042C042C042C042C042C042C_byte_array1d_static_fld;
        String s = b041E041E041E041E041E041E;
        i = b0421042104210421042104210421();
        j = b044604460446044604460446_int_static_fld;
        int k = b0421042104210421042104210421();
        int l = b0421042104210421042104210421();
        int i1 = b044604460446044604460446_int_static_fld;
        switch ((i1 * (b044604460446044604460446_int_static_fld + i1)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = 33;
            b044604460446044604460446_int_static_fld = 48;
            break;

        case 0: // '\0'
            break;
        }
        if (((i + j) * k) % l != b044604460446044604460446_int_static_fld)
        {
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
        }
        rgrrgg.b044A044A044A044A044A044A(abyte0, (short)0, abyte2, word0, (short)rgrrgg.b044A044A044A044A044A044A(s).length);
        word0 = (short)((short)rgrrgg.b044A044A044A044A044A044A(b041E041E041E041E041E041E).length + word0);
        i = word0 - word3 - 1;
        if (i >= 128)
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld[word1] = (byte)(word0 - word1);
            byte abyte1[] = b042C042C042C042C042C042C_byte_array1d_static_fld;
            byte byte0 = (byte)(word0 - word2);
            if (((b044604460446044604460446_int_static_fld + b044604460446044604460446_int_static_fld) * b044604460446044604460446_int_static_fld) % b044604460446044604460446_int_static_fld != b044604460446044604460446_int_static_fld)
            {
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            }
            abyte1[word2] = byte0;
            b042C042C042C042C042C042C_byte_array1d_static_fld[word3] = -127;
            abyte1 = new byte[(short)i];
            rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)(word3 + 1), abyte1, (short)0, (short)i);
            b042C042C042C042C042C042C_byte_array1d_static_fld[word3 + 1] = (byte)i;
            rgrrgg.b044A044A044A044A044A044A(abyte1, (short)0, b042C042C042C042C042C042C_byte_array1d_static_fld, (short)(word3 + 2), (short)i);
            word0++;
        } else
        {
            b042C042C042C042C042C042C_byte_array1d_static_fld[word1] = (byte)(word0 - word1 - 1);
            b042C042C042C042C042C042C_byte_array1d_static_fld[word2] = (byte)(word0 - word2 - 1);
            b042C042C042C042C042C042C_byte_array1d_static_fld[word3] = (byte)(word0 - word3 - 1);
        }
        b043504350435043504350435_byte_array1d_static_fld = new byte[word0];
        rgrrgg.b044A044A044A044A044A044A(b042C042C042C042C042C042C_byte_array1d_static_fld, (short)0, b043504350435043504350435_byte_array1d_static_fld, (short)0, word0);
        b0421042104210421042104210421(tokenkey, grrrrr.b044C044C044C044C044C044C("\232\234\232\235", 'R', '\030', '\003'), b043504350435043504350435_byte_array1d_static_fld);
    }

    public static int b0421042104210421042104210421()
    {
        return 74;
    }

    static 
    {
        b043504350435043504350435_java_lang_String_static_fld = rrrrrr/plllpp.getName();
        b043504350435043504350435_byte_static_fld = -91;
        b043504350435043504350435_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C("\u01CB\u01BA\u01BA\u01BA\u01BA\u01BA\u01BA\u01BA\u01C3\u01C2\u01BA\u01C2\u01BE\u01BA", '\305', '\001');
        b043504350435043504350435_java_lang_String_static_fld = "";
        b043504350435043504350435_java_lang_String_static_fld = "";
        b043504350435043504350435_java_lang_String_static_fld = "";
        b043504350435043504350435_java_lang_String_static_fld = "";
        b043504350435043504350435_java_lang_String_static_fld = "";
        b043504350435043504350435_java_lang_String_static_fld = "";
        b043504350435043504350435_java_lang_String_static_fld = "";
        b043504350435043504350435_java_lang_String_static_fld = "";
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = 0;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_byte_static_fld = 0;
        b042C042C042C042C042C042C_byte_static_fld = 0;
        b042C042C042C042C042C042C_short_static_fld = 0;
        b042C042C042C042C042C042C_short_static_fld = 0;
        b042C042C042C042C042C042C_short_static_fld = 0;
        b042C042C042C042C042C042C_byte_static_fld = -91;
        b042C042C042C042C042C042C_int_static_fld = 0;
        b042C042C042C042C042C042C_java_lang_Object_array1d_static_fld = new Object[32];
        b042C042C042C042C042C042C_short_static_fld = -1;
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[6];
        b042C042C042C042C042C042C_short_array1d_static_fld = new short[2];
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[6];
        b042C042C042C042C042C042C_byte_array1d_static_fld = new byte[4];
        b042C042C042C042C042C042C_short_array1d_static_fld = (new short[] {
            -24730, -24830, -24829, -24806, 149, 24362, 154, 156, -24777
        });
        b042C042C042C042C042C042C_short_array1d_static_fld = new short[9];
        b042C042C042C042C042C042C_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C("\u0261\u0260\u0263\u025E\u0262\u025F\u0263\u0267\u0260\u0273\u0263\u0261\u0263\u0267\u0263\u0261\u0260\u0273\u0262\u0262\u0262\u0262\u0262\u0264\u0261\u025E\u0261\u025F", '\272', '\006');
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b042C042C042C042C042C042C_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C("\210wwwwwwwwzxwxw", 'G', '\005');
        b042C042C042C042C042C042C_java_lang_String_static_fld = b042C042C042C042C042C042C_java_lang_String_static_fld;
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b042C042C042C042C042C042C_java_lang_String_static_fld = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = grrrrr.b044C044C044C044C044C044C("{{y{{{{{{{{{", 'K', '\002');
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b041E041E041E041E041E041E = "";
        b044604460446044604460446_java_lang_String_static_fld = "";
        b044604460446044604460446_java_lang_String_static_fld = "";
        b044604460446044604460446_int_static_fld = 16;
        b044604460446044604460446_java_lang_String_static_fld = "";
        b044604460446044604460446_javax_crypto_Cipher_static_fld = null;
        b044604460446044604460446_javax_crypto_Cipher_static_fld = null;
        b044604460446044604460446_java_security_MessageDigest_static_fld = null;
        b044604460446044604460446_javax_crypto_Cipher_static_fld = null;
        b044604460446044604460446_java_lang_String_static_fld = grrrrr.b044C044C044C044C044C044C("\030\033\032\025\033\027\035\024\024\025\024\025\024\024\025\024", '\034', '\0');
        b044604460446044604460446_com_visa_cbp_sdk_facade_data_TokenKey_static_fld = null;
        int i = b044604460446044604460446_int_static_fld;
        switch ((i * (b044604460446044604460446_int_static_fld + i)) % b044604460446044604460446_int_static_fld)
        {
        default:
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            break;

        case 0: // '\0'
            break;
        }
        Exception exception;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            j = b044604460446044604460446_int_static_fld;
            k = b044604460446044604460446_int_static_fld;
            l = b044604460446044604460446_int_static_fld;
            i1 = b044604460446044604460446_int_static_fld;
            j1 = b044604460446044604460446_int_static_fld;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        if (((j + k) * l) % i1 != j1)
        {
            try
            {
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
                b044604460446044604460446_int_static_fld = b0421042104210421042104210421();
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception)
            {
                throw exception;
            }
        }
        b044604460446044604460446_java_io_PrintWriter_static_fld = null;
        return;
        exception;
        throw exception;
        exception;
        throw exception;
    }
}
