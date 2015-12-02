// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.backport.util.Base64;
import android.content.Context;
import android.content.pm.Signature;
import com.whatsapp.util.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

// Referenced classes of package com.whatsapp:
//            App, o4, DialogToastActivity

public final class i
{

    public static int b;
    private static final byte c[];
    private static final String z[];
    private boolean a;
    private int d;
    private final byte e[];

    private i(byte abyte0[])
    {
        e = abyte0;
    }

    public static i a(Context context, String s)
    {
        Object obj1;
        int k;
        obj1 = null;
        k = b;
        if (App.u != 3) goto _L2; else goto _L1
_L1:
        java.security.Key key = new i(new byte[20]);
_L4:
        return key;
        context;
        throw context;
_L2:
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = context.getPackageName();
        key = obj1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        Signature asignature[];
        int j;
        int l;
        boolean flag;
        try
        {
            flag = z[5].equals(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        key = obj1;
        if (!flag) goto _L4; else goto _L5
_L5:
        try
        {
            bytearrayoutputstream.write(((String) (obj)).getBytes(z[2]));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new Error(context);
        }
        obj = com/whatsapp/i.getResourceAsStream(z[3]);
        if (obj == null)
        {
            obj = com/whatsapp/i.getResourceAsStream(z[1]);
        }
        key = obj1;
        if (obj == null) goto _L4; else goto _L6
_L6:
        key = new byte[8192];
        try
        {
            j = ((InputStream) (obj)).read(key);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
            return null;
        }
        finally { }
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        bytearrayoutputstream.write(key, 0, j);
        j = ((InputStream) (obj)).read(key);
        if (k == 0) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_132;
_L7:
        try
        {
            ((InputStream) (obj)).close();
        }
        catch (IOException ioexception) { }
        key = o4.a(bytearrayoutputstream.toByteArray(), c, 128, 512);
        try
        {
            obj = Mac.getInstance(z[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AssertionError(context);
        }
        try
        {
            ((Mac) (obj)).init(key);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AssertionError(context);
        }
        asignature = v.a(context);
        key = obj1;
        if (asignature == null) goto _L4; else goto _L9
_L9:
        try
        {
            j = asignature.length;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            try
            {
                throw context;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
        }
        key = obj1;
        if (j == 0) goto _L4; else goto _L10
_L10:
        l = asignature.length;
        j = 0;
        do
        {
            if (j >= l)
            {
                break;
            }
            ((Mac) (obj)).update(asignature[j].toByteArray());
            j++;
        } while (k == 0);
        if (3 == App.l)
        {
            context = new byte[16];
        } else
        {
            context = o4.b(context);
        }
        ((Mac) (obj)).update(context);
        try
        {
            context = s.getBytes(z[4]);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new Error(context);
        }
        ((Mac) (obj)).update(context);
        return new i(((Mac) (obj)).doFinal());
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw context;
    }

    public boolean equals(Object obj)
    {
        int j = b;
        boolean flag;
        if (this == obj || obj != null && getClass().equals(obj.getClass()) && Arrays.equals(e, ((i)obj).e))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j != 0)
        {
            DialogToastActivity.g++;
        }
        return flag;
    }

    public int hashCode()
    {
        if (a)
        {
            return d;
        } else
        {
            d = Arrays.hashCode(e);
            a = true;
            return d;
        }
    }

    public String toString()
    {
        return Base64.encodeToString(e, 2);
    }

    static 
    {
        char ac[];
        String as[];
        byte byte0;
        int j;
        as = new String[6];
        ac = "\fIYo[\fE)";
        byte0 = -1;
        j = 0;
_L17:
        String as1[];
        int l;
        int i1;
        as1 = as;
        ac = ac.toCharArray();
        i1 = ac.length;
        l = 0;
_L15:
        if (i1 > l) goto _L2; else goto _L1
_L1:
        ac = (new String(ac)).intern();
        byte0;
        JVM INSTR tableswitch 0 4: default 84
    //                   0 100
    //                   1 116
    //                   2 132
    //                   3 148
    //                   4 164;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        as1[j] = ac;
        ac = "kv}_' vy[i&h}\001` tq\001~p+yNg1pG@g#k6\\f#";
        j = 1;
        byte0 = 0;
        break; /* Loop/switch isn't completed */
_L4:
        as1[j] = ac;
        ac = "\021P^\0010";
        j = 2;
        byte0 = 1;
        break; /* Loop/switch isn't completed */
_L5:
        as1[j] = ac;
        ac = "kv}_' vy[i&h}\001` tq\003i&kmXW(k\177C&4j\177";
        j = 3;
        byte0 = 2;
        break; /* Loop/switch isn't completed */
_L6:
        as1[j] = ac;
        ac = "\021P^\0010";
        j = 4;
        byte0 = 3;
        break; /* Loop/switch isn't completed */
_L7:
        as1[j] = ac;
        j = 5;
        ac = "'ku\002\177,el_i4t";
        byte0 = 4;
        break; /* Loop/switch isn't completed */
_L8:
        int k;
        as1[j] = ac;
        z = as;
        ac = "\024oL[C\027^iyn\005Qa~86TI\024`\035N([F7UI\037l\02353\037[\007jaxP\rb]mp<W/\031N3o\\J<ssVZ''<h|;44_tC\0262WcY)laiZ3|/\030n35Ju[\0215(e<65\177UJ\022@z~Bp4hEl.I,\035OuM)CF".toCharArray();
        k = ac.length;
        j = 0;
          goto _L9
_L2:
        c1 = ac[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 252
    //                   0 275
    //                   1 282
    //                   2 288
    //                   3 295;
           goto _L10 _L11 _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_295;
_L10:
        k = 8;
_L16:
        ac[l] = (char)(k ^ c1);
        l++;
          goto _L15
_L11:
        k = 68;
          goto _L16
_L12:
        k = 4;
          goto _L16
_L13:
        k = 24;
          goto _L16
        k = 44;
          goto _L16
        if (true) goto _L17; else goto _L2
_L9:
        char c1;
        if (k <= j)
        {
            c = Base64.decode((new String(ac)).intern(), 0);
            return;
        }
        l = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 365
    //                   1 371
    //                   2 376
    //                   3 382;
           goto _L18 _L19 _L20 _L21 _L22
_L22:
        break MISSING_BLOCK_LABEL_382;
_L19:
        break; /* Loop/switch isn't completed */
_L18:
        byte0 = 8;
_L24:
        ac[j] = (char)(byte0 ^ l);
        j++;
        if (true) goto _L9; else goto _L23
_L23:
        byte0 = 68;
          goto _L24
_L20:
        byte0 = 4;
          goto _L24
_L21:
        byte0 = 24;
          goto _L24
        byte0 = 44;
          goto _L24
    }
}
