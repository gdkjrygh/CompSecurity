// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Base64;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public final class h
{

    private static String a = com/paypal/android/sdk/onetouch/core/h.getSimpleName();
    private String b;

    public h(String s)
    {
        b = s;
    }

    private static String a(Exception exception)
    {
        Log.e(a, exception.getMessage());
        return null;
    }

    public final String a(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            Object obj = new DESKeySpec(b.getBytes("UTF8"));
            obj = SecretKeyFactory.getInstance("DES").generateSecret(((java.security.spec.KeySpec) (obj)));
            s = s.getBytes("UTF8");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, ((java.security.Key) (obj)));
            s = Base64.encodeToString(cipher.doFinal(s), 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(((Exception) (s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(((Exception) (s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(((Exception) (s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(((Exception) (s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(((Exception) (s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(((Exception) (s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(((Exception) (s)));
        }
        return s;
    }

    public final String b(String s)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            Object obj = new DESKeySpec(b.getBytes("UTF8"));
            obj = SecretKeyFactory.getInstance("DES").generateSecret(((java.security.spec.KeySpec) (obj)));
            s = Base64.decode(s, 0);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, ((java.security.Key) (obj)));
            s = new String(cipher.doFinal(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return a(s);
        }
        return s;
    }

}
