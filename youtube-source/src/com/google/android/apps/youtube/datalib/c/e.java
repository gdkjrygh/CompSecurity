// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.c;

import android.net.Uri;
import android.util.Base64;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.j;
import com.android.volley.m;
import com.android.volley.o;
import com.google.android.apps.youtube.common.e.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.a.l;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.youtube.datalib.c:
//            b

public final class e extends Request
{

    private static final byte a[] = {
        83, 0, 0, 0, 0, 0, 0, 0, 0
    };
    private final Cipher b = Cipher.getInstance("AES/CTR/NoPadding");
    private final byte c[];
    private final Key d;
    private final Key e;
    private final int f = 4;
    private final o g;

    public e(Uri uri, l l, byte abyte0[], int i)
    {
        super(1, uri.toString(), l);
        g = (o)com.google.android.apps.youtube.common.fromguava.c.a(l);
        com.google.android.apps.youtube.common.fromguava.c.a(true);
        boolean flag;
        if (abyte0.length > 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "projectKey must contain 16-byte key");
        i = abyte0.length - 16;
        uri = new byte[16];
        l = new byte[i];
        System.arraycopy(abyte0, 0, uri, 0, 16);
        System.arraycopy(abyte0, 16, l, 0, i);
        d = new SecretKeySpec(uri, "AES");
        e = new SecretKeySpec(l, "HmacSHA1");
        abyte0 = ByteBuffer.allocate(abyte0.length + 16);
        abyte0.putLong(16L);
        abyte0.put(uri);
        abyte0.putLong(i);
        abyte0.put(l);
        c = com.google.android.apps.youtube.common.e.a.b(Util.a(abyte0.array()), 4);
    }

    private byte[] c(String s)
    {
        byte abyte0[];
        byte abyte1[];
        int i;
        s = Base64.decode(s, 0);
        boolean flag;
        if (s.length > 17)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, "Encrypted string is invalid.");
        if (s[0] != 0)
        {
            throw new JSONException("Bad 'type' in encoded string.");
        }
        if (!Arrays.equals(com.google.android.apps.youtube.common.e.a.a(s, 1, 4), c))
        {
            throw new JSONException("Project key signature does not match.");
        }
        i = s.length - f;
        abyte0 = com.google.android.apps.youtube.common.e.a.a(s, 0, i);
        if (!Arrays.equals(com.google.android.apps.youtube.common.e.a.a(s, i, f), com.google.android.apps.youtube.common.e.a.b(com.google.android.apps.youtube.datalib.c.b.a(e, com.google.android.apps.youtube.common.e.a.a(new byte[][] {
    a, abyte0
})), f)))
        {
            throw new JSONException("HMAC signature does not match.");
        }
        abyte0 = com.google.android.apps.youtube.common.e.a.a(com.google.android.apps.youtube.common.e.a.a(s, 5, 8), 16);
        i = s.length - 13 - f;
        abyte1 = com.google.android.apps.youtube.common.e.a.a(com.google.android.apps.youtube.common.e.a.a(s, 13, i), 16);
        synchronized (b)
        {
            b.init(2, d, new IvParameterSpec(abyte0));
            abyte0 = com.google.android.apps.youtube.common.e.a.b(b.doFinal(abyte1), i);
        }
        return abyte0;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
        s;
        throw new RuntimeException("Fatal error: project encryption key invalid.", s);
        s;
        throw new RuntimeException("Fatal error: initialization vector is the wrong size.", s);
        s;
        throw new RuntimeException("Unexpected IllegalBlockSizeException.", s);
        s;
        throw new JSONException("Bad input padding.");
    }

    protected final m a(j j1)
    {
        try
        {
            JSONObject jsonobject = new JSONObject(new String(j1.b, "UTF-8"));
            j1 = m.a(new b(jsonobject.getString("id"), c(jsonobject.getString("key"))), com.android.volley.toolbox.e.a(j1));
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            return m.a(new ParseError(j1));
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new RuntimeException("Could not find UTF-8 character set!");
        }
        return j1;
    }

    protected final volatile void a(Object obj)
    {
        obj = (b)obj;
        g.a(obj);
    }

}
