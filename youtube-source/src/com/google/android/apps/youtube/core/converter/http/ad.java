// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.util.Base64;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.datalib.legacy.model.b;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ay

public final class ad extends ay
{

    private final byte a[];

    public ad(byte abyte0[])
    {
        a = (byte[])c.a(abyte0);
    }

    private byte[] a(String s)
    {
label0:
        {
            Cipher cipher;
            byte abyte0[];
            byte abyte1[];
            try
            {
                cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new ConverterException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new ConverterException(s);
            }
            abyte1 = Base64.decode(a, 0);
            s = Base64.decode(s, 0);
            try
            {
                cipher.init(2, new SecretKeySpec(abyte1, "AES"));
                s = cipher.doFinal(s);
                if (s.length <= 20)
                {
                    break label0;
                }
                abyte0 = new byte[20];
                System.arraycopy(s, 0, abyte0, 0, 20);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new ConverterException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new ConverterException(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new ConverterException(s);
            }
            return abyte0;
        }
        return s;
    }

    protected final Object a(InputStream inputstream)
    {
        Object obj = new Properties();
        ((Properties) (obj)).load(inputstream);
        inputstream = ((Properties) (obj)).getProperty("DeviceId");
        obj = ((Properties) (obj)).getProperty("DeviceKey");
        if (inputstream != null && obj != null)
        {
            return new b(inputstream, a(((String) (obj))));
        } else
        {
            throw new ConverterException("invalid device registration response");
        }
    }
}
