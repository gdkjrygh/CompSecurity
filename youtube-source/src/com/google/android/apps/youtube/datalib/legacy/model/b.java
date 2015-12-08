// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class b
{

    private volatile int a;
    private final String b;
    private final byte c[];

    public b(String s, byte abyte0[])
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s, "deviceId cannot be empty");
        com.google.android.apps.youtube.common.fromguava.c.a(abyte0);
        boolean flag;
        if (abyte0.length == 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "deviceKey must be 20 bytes");
        b = s;
        c = abyte0;
    }

    public static b a(SharedPreferences sharedpreferences, String s)
    {
        Object obj = null;
        String s1 = sharedpreferences.getString((new StringBuilder("device_id")).append(s).toString(), null);
        s = sharedpreferences.getString((new StringBuilder("device_key")).append(s).toString(), null);
        sharedpreferences = obj;
        if (s1 != null)
        {
            sharedpreferences = obj;
            if (s != null)
            {
                sharedpreferences = new b(s1, Base64.decode(s, 0));
            }
        }
        return sharedpreferences;
    }

    private static String a(String s, byte abyte0[])
    {
        abyte0 = new SecretKeySpec(abyte0, "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(abyte0);
        s = (new String(Base64.encode(mac.doFinal(s.getBytes()), 0))).trim();
        return s;
        s;
        L.a("error signing request", s);
_L2:
        return null;
        s;
        L.a("error signing request", s);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(b b1, SharedPreferences sharedpreferences, String s)
    {
        sharedpreferences.edit().putString((new StringBuilder("device_id")).append(s).toString(), b1.b).putString((new StringBuilder("device_key")).append(s).toString(), new String(Base64.encode(b1.c, 0))).apply();
    }

    public final String a(Uri uri)
    {
        StringBuilder stringbuilder = new StringBuilder(uri.getEncodedPath());
        uri = uri.getEncodedQuery();
        if (uri != null)
        {
            stringbuilder.append("?").append(uri);
        }
        uri = a(stringbuilder.toString(), c);
        return String.format("device-id=\"%s\", data=\"%s\"", new Object[] {
            b, uri
        });
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            if (b.equals(((b) (obj = (b)obj)).b) && Arrays.equals(c, ((b) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int j = a;
        int i = j;
        if (j == 0)
        {
            i = (b.hashCode() + 527) * 31 + Arrays.hashCode(c);
            a = i;
        }
        return i;
    }
}
