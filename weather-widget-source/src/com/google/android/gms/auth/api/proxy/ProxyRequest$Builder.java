// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.util.Patterns;
import com.google.android.gms.common.internal.zzx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            ProxyRequest

public static class zzRF
{

    private String zzRF;
    private int zzRG;
    private long zzRH;
    private byte zzRI[];
    private Bundle zzRJ;

    public ProxyRequest build()
    {
        if (zzRI == null)
        {
            zzRI = new byte[0];
        }
        return new ProxyRequest(2, zzRF, zzRG, zzRH, zzRI, zzRJ);
    }

    public zzRJ putHeader(String s, String s1)
    {
        zzx.zzh(s, "Header name cannot be null or empty!");
        Bundle bundle = zzRJ;
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        bundle.putString(s, s2);
        return this;
    }

    public zzRJ setBody(byte abyte0[])
    {
        zzRI = abyte0;
        return this;
    }

    public zzRI setHttpMethod(int i)
    {
        boolean flag;
        if (i >= 0 && i <= ProxyRequest.LAST_CODE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "Unrecognized http method code.");
        zzRG = i;
        return this;
    }

    public zzRG setTimeoutMillis(long l)
    {
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "The specified timeout must be non-negative.");
        zzRH = l;
        return this;
    }

    public (String s)
    {
        zzRG = ProxyRequest.HTTP_METHOD_GET;
        zzRH = 3000L;
        zzRI = null;
        zzRJ = new Bundle();
        zzx.zzcs(s);
        if (Patterns.WEB_URL.matcher(s).matches())
        {
            zzRF = s;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("The supplied url [ ").append(s).append("] is not match Patterns.WEB_URL!").toString());
        }
    }
}
