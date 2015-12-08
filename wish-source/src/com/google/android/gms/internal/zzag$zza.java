// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzag

static class zzpC
{

    ByteArrayOutputStream zzpC;
    Base64OutputStream zzpD;

    public String toString()
    {
        String s;
        try
        {
            zzpD.close();
        }
        catch (IOException ioexception)
        {
            zzb.zzb("HashManager: Unable to convert to Base64.", ioexception);
        }
        zzpC.close();
        s = zzpC.toString();
        zzpC = null;
        zzpD = null;
        return s;
        Object obj;
        obj;
        zzb.zzb("HashManager: Unable to convert to Base64.", ((Throwable) (obj)));
        zzpC = null;
        zzpD = null;
        return "";
        obj;
        zzpC = null;
        zzpD = null;
        throw obj;
    }

    public void write(byte abyte0[])
        throws IOException
    {
        zzpD.write(abyte0);
    }

    public client.zzb()
    {
        zzpC = new ByteArrayOutputStream(4096);
        zzpD = new Base64OutputStream(zzpC, 10);
    }
}
