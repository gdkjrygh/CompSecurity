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

static class zzsj
{

    ByteArrayOutputStream zzsj;
    Base64OutputStream zzsk;

    public String toString()
    {
        String s;
        try
        {
            zzsk.close();
        }
        catch (IOException ioexception)
        {
            zzb.zzb("HashManager: Unable to convert to Base64.", ioexception);
        }
        zzsj.close();
        s = zzsj.toString();
        zzsj = null;
        zzsk = null;
        return s;
        Object obj;
        obj;
        zzb.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
        zzsj = null;
        zzsk = null;
        return "";
        obj;
        zzsj = null;
        zzsk = null;
        throw obj;
    }

    public void write(byte abyte0[])
        throws IOException
    {
        zzsk.write(abyte0);
    }

    public client.zzb()
    {
        zzsj = new ByteArrayOutputStream(4096);
        zzsk = new Base64OutputStream(zzsj, 10);
    }
}
