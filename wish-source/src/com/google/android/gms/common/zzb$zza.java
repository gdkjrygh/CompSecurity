// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import com.google.android.gms.common.internal.zzv;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common:
//            zzb

static abstract class zzOQ
{

    private int zzOQ;

    protected static byte[] zzby(String s)
    {
        try
        {
            s = s.getBytes("ISO-8859-1");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof zzOQ))
        {
            return false;
        } else
        {
            obj = (zzOQ)obj;
            return Arrays.equals(getBytes(), ((getBytes) (obj)).getBytes());
        }
    }

    abstract byte[] getBytes();

    public int hashCode()
    {
        return zzOQ;
    }

    protected .zzv(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length == 25)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "cert hash data has incorrect length");
        zzOQ = Arrays.hashCode(abyte0);
    }
}
