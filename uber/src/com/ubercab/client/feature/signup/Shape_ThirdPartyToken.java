// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.signup:
//            ThirdPartyToken

public final class Shape_ThirdPartyToken extends ThirdPartyToken
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static ThirdPartyToken a(Parcel parcel)
        {
            return new Shape_ThirdPartyToken(parcel, (byte)0);
        }

        private static ThirdPartyToken[] a(int i)
        {
            return new ThirdPartyToken[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private static final ClassLoader a = com/ubercab/client/feature/signup/Shape_ThirdPartyToken.getClassLoader();
    private String b;
    private long c;
    private String d;
    private String e;
    private String f;

    Shape_ThirdPartyToken()
    {
    }

    private Shape_ThirdPartyToken(Parcel parcel)
    {
        b = (String)parcel.readValue(a);
        c = ((Long)parcel.readValue(a)).longValue();
        d = (String)parcel.readValue(a);
        e = (String)parcel.readValue(a);
        f = (String)parcel.readValue(a);
    }

    Shape_ThirdPartyToken(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    final ThirdPartyToken a(long l)
    {
        c = l;
        return this;
    }

    final ThirdPartyToken a(String s)
    {
        b = s;
        return this;
    }

    public final String a()
    {
        return b;
    }

    public final long b()
    {
        return c;
    }

    final ThirdPartyToken b(String s)
    {
        d = s;
        return this;
    }

    final ThirdPartyToken c(String s)
    {
        e = s;
        return this;
    }

    public final String c()
    {
        return d;
    }

    final ThirdPartyToken d(String s)
    {
        f = s;
        return this;
    }

    public final String d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return f;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ThirdPartyToken)obj;
            if (((ThirdPartyToken) (obj)).a() == null ? a() != null : !((ThirdPartyToken) (obj)).a().equals(a()))
            {
                return false;
            }
            if (((ThirdPartyToken) (obj)).b() != b())
            {
                return false;
            }
            if (((ThirdPartyToken) (obj)).c() == null ? c() != null : !((ThirdPartyToken) (obj)).c().equals(c()))
            {
                return false;
            }
            if (((ThirdPartyToken) (obj)).d() == null ? d() != null : !((ThirdPartyToken) (obj)).d().equals(d()))
            {
                return false;
            }
            if (((ThirdPartyToken) (obj)).e() == null ? e() != null : !((ThirdPartyToken) (obj)).e().equals(e()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        int l;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        l = (int)((long)((i ^ 0xf4243) * 0xf4243) ^ (c >>> 32 ^ c));
        if (d == null)
        {
            i = 0;
        } else
        {
            i = d.hashCode();
        }
        if (e == null)
        {
            j = 0;
        } else
        {
            j = e.hashCode();
        }
        if (f != null)
        {
            k = f.hashCode();
        }
        return (j ^ (i ^ l * 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    public final String toString()
    {
        return (new StringBuilder("ThirdPartyToken{code=")).append(b).append(", expiresInMs=").append(c).append(", redirectUri=").append(d).append(", token=").append(e).append(", type=").append(f).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(b);
        parcel.writeValue(Long.valueOf(c));
        parcel.writeValue(d);
        parcel.writeValue(e);
        parcel.writeValue(f);
    }

}
