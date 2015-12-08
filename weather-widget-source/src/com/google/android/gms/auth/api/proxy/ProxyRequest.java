// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Patterns;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.auth.api.proxy:
//            zzb

public class ProxyRequest
    implements SafeParcelable
{
    public static class Builder
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

        public Builder putHeader(String s, String s1)
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

        public Builder setBody(byte abyte0[])
        {
            zzRI = abyte0;
            return this;
        }

        public Builder setHttpMethod(int i)
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

        public Builder setTimeoutMillis(long l)
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

        public Builder(String s)
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


    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int LAST_CODE = 7;
    public static final int VERSION_CODE = 2;
    public final byte body[];
    public final int httpMethod;
    public final long timeoutMillis;
    public final String url;
    final int versionCode;
    Bundle zzRE;

    ProxyRequest(int i, String s, int j, long l, byte abyte0[], Bundle bundle)
    {
        versionCode = i;
        url = s;
        httpMethod = j;
        timeoutMillis = l;
        body = abyte0;
        zzRE = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public Map getHeaderMap()
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap(zzRE.size());
        String s;
        for (Iterator iterator = zzRE.keySet().iterator(); iterator.hasNext(); linkedhashmap.put(s, zzRE.getString(s)))
        {
            s = (String)iterator.next();
        }

        return Collections.unmodifiableMap(linkedhashmap);
    }

    public String toString()
    {
        return (new StringBuilder()).append("ProxyRequest[ url: ").append(url).append(", method: ").append(httpMethod).append(" ]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

}
