// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzbm

static class zzrQ
{

    ByteArrayOutputStream zzrQ;
    Base64OutputStream zzrR;

    public String toString()
    {
        String s;
        try
        {
            zzrR.close();
        }
        catch (IOException ioexception)
        {
            zzb.zzb("HashManager: Unable to convert to Base64.", ioexception);
        }
        zzrQ.close();
        s = zzrQ.toString();
        zzrQ = null;
        zzrR = null;
        return s;
        Object obj;
        obj;
        zzb.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
        zzrQ = null;
        zzrR = null;
        return "";
        obj;
        zzrQ = null;
        zzrR = null;
        throw obj;
    }

    public void write(byte abyte0[])
        throws IOException
    {
        zzrR.write(abyte0);
    }

    public client.zzb()
    {
        zzrQ = new ByteArrayOutputStream(4096);
        zzrR = new Base64OutputStream(zzrQ, 10);
    }
}
