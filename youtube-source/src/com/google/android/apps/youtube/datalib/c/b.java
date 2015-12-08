// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.c;

import android.util.Base64;
import com.google.android.apps.youtube.common.e.a;
import com.google.android.apps.youtube.common.fromguava.c;
import java.security.InvalidKeyException;
import java.security.Key;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.apps.youtube.datalib.c:
//            c, d

final class b
{

    private final String a;
    private final byte b[];
    private com.google.android.apps.youtube.datalib.c.c c;
    private final Key d;

    b(String s, byte abyte0[])
    {
        a = com.google.android.apps.youtube.common.fromguava.c.a(s);
        b = (byte[])((byte[])com.google.android.apps.youtube.common.fromguava.c.a(abyte0)).clone();
        d = new SecretKeySpec(abyte0, "HmacSHA1");
        c = new com.google.android.apps.youtube.datalib.c.c(abyte0);
    }

    private String a(byte abyte0[], int i)
    {
        abyte0 = a(d, abyte0);
        if (i != 20)
        {
            abyte0 = com.google.android.apps.youtube.common.e.a.a(abyte0, 0, i);
        }
        byte abyte1[] = (byte[])c.b();
        return new String(Base64.encode(com.google.android.apps.youtube.common.e.a.a(new byte[][] {
            new byte[] {
                0
            }, abyte1, abyte0
        }), 3));
    }

    static byte[] a(Key key, byte abyte0[])
    {
        mac;
        JVM INSTR monitorenter ;
        synchronized (com.google.android.apps.youtube.datalib.c.d.a)
        {
            com.google.android.apps.youtube.datalib.c.d.a.init(key);
            key = com.google.android.apps.youtube.datalib.c.d.a.doFinal(abyte0);
        }
        return key;
        key;
        throw new RuntimeException("Fatal error: hmac key is invalid.", key);
        key;
        mac;
        JVM INSTR monitorexit ;
        throw key;
    }

    final void a(Map map, String s, byte abyte0[])
    {
        map.put("X-Goog-Device-Auth", String.format("device_id=%s,data=%s,content=%s", new Object[] {
            a, a(com.google.android.apps.youtube.common.e.a.b(s.getBytes(), s.getBytes().length + 1), 4), a(abyte0, 20)
        }));
    }

    final byte[] a()
    {
        return b;
    }

    final String b()
    {
        return a;
    }
}
