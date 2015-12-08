// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.as;
import com.google.android.apps.youtube.core.client.m;
import com.google.android.apps.youtube.core.converter.http.HttpMethod;
import com.google.android.apps.youtube.core.converter.http.ad;
import com.google.android.apps.youtube.core.converter.http.dp;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;
import java.util.zip.CRC32;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.api:
//            h, x, i

public final class ApiDeviceRegistrationClientForV2Apis extends m
    implements as
{

    private final af a;
    private final af h;
    private final String i;
    private final byte j[];
    private final byte k[];
    private final String l;

    public ApiDeviceRegistrationClientForV2Apis(Context context, Executor executor, HttpClient httpclient, String s, String s1, byte abyte0[], byte abyte1[])
    {
        super(executor, httpclient);
        i = com.google.android.apps.youtube.common.fromguava.c.a(s, "developerKey cannot be null or empty");
        l = com.google.android.apps.youtube.common.fromguava.c.a(s1, "serial cannot be null or empty");
        k = (byte[])com.google.android.apps.youtube.common.fromguava.c.a(abyte0, "playerApiKey cannot be null");
        j = PackageUtil.h(context);
        a = a(new dp(HttpMethod.POST), new ad(abyte1));
        context = new h(this, (byte)0);
        h = a(context, context);
    }

    private byte[] a()
    {
        Cipher cipher = b();
        byte abyte0[];
        try
        {
            abyte0 = cipher.doFinal(j);
        }
        catch (BadPaddingException badpaddingexception)
        {
            throw new RuntimeException(badpaddingexception);
        }
        catch (IllegalBlockSizeException illegalblocksizeexception)
        {
            throw new RuntimeException(illegalblocksizeexception);
        }
        return abyte0;
    }

    static byte[] a(ApiDeviceRegistrationClientForV2Apis apideviceregistrationclientforv2apis)
    {
        return apideviceregistrationclientforv2apis.j;
    }

    static String b(ApiDeviceRegistrationClientForV2Apis apideviceregistrationclientforv2apis)
    {
        return apideviceregistrationclientforv2apis.i;
    }

    private Cipher b()
    {
        boolean flag = true;
        byte abyte0[];
        Object obj;
        Object obj1;
        try
        {
            abyte0 = l.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException(unsupportedencodingexception);
        }
        obj1 = new CRC32();
        ((CRC32) (obj1)).update(abyte0);
        abyte0 = ByteBuffer.allocate(8).putLong(((CRC32) (obj1)).getValue()).array();
        if (abyte0.length != 8)
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        obj1 = new SecretKeySpec(abyte0, "RC4");
        try
        {
            obj = Cipher.getInstance("RC4");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception = new x();
        }
        catch (NoSuchPaddingException nosuchpaddingexception)
        {
            nosuchpaddingexception = new x();
        }
        try
        {
            ((Cipher) (obj)).init(1, ((java.security.Key) (obj1)));
        }
        catch (InvalidKeyException invalidkeyexception)
        {
            throw new RuntimeException(invalidkeyexception);
        }
        return ((Cipher) (obj));
    }

    static String c(ApiDeviceRegistrationClientForV2Apis apideviceregistrationclientforv2apis)
    {
        return apideviceregistrationclientforv2apis.l;
    }

    static af d(ApiDeviceRegistrationClientForV2Apis apideviceregistrationclientforv2apis)
    {
        return apideviceregistrationclientforv2apis.h;
    }

    static byte[] e(ApiDeviceRegistrationClientForV2Apis apideviceregistrationclientforv2apis)
    {
        return apideviceregistrationclientforv2apis.a();
    }

    public final void a(b b1)
    {
        Object obj;
        try
        {
            obj = new String(k, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            throw new RuntimeException(b1);
        }
        obj = Uri.parse(String.format("https://www.google.com/youtube/accounts/registerDevice?type=GDATA&developer=%s&serialNumber=%s", new Object[] {
            obj, l
        }));
        a.a(obj, new i(this, b1));
    }
}
