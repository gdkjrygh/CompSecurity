// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupData, ThirdPartyToken

public final class Shape_SignupData extends SignupData
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static SignupData a(Parcel parcel)
        {
            return new Shape_SignupData(parcel, (byte)0);
        }

        private static SignupData[] a(int i1)
        {
            return new SignupData[i1];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    private static final ClassLoader a = com/ubercab/client/feature/signup/Shape_SignupData.getClassLoader();
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private SignupData.PromoCode i;
    private String j;
    private String k;
    private String l;
    private String m;
    private ThirdPartyToken n;

    Shape_SignupData()
    {
    }

    private Shape_SignupData(Parcel parcel)
    {
        b = (String)parcel.readValue(a);
        c = (String)parcel.readValue(a);
        d = (String)parcel.readValue(a);
        e = (String)parcel.readValue(a);
        f = (String)parcel.readValue(a);
        g = (String)parcel.readValue(a);
        h = (String)parcel.readValue(a);
        i = (SignupData.PromoCode)parcel.readValue(a);
        j = (String)parcel.readValue(a);
        k = (String)parcel.readValue(a);
        l = (String)parcel.readValue(a);
        m = (String)parcel.readValue(a);
        n = (ThirdPartyToken)parcel.readValue(a);
    }

    Shape_SignupData(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final SignupData a(SignupData.PromoCode promocode)
    {
        i = promocode;
        return this;
    }

    public final SignupData a(ThirdPartyToken thirdpartytoken)
    {
        n = thirdpartytoken;
        return this;
    }

    public final SignupData a(String s)
    {
        b = s;
        return this;
    }

    public final String a()
    {
        return b;
    }

    public final SignupData b(String s)
    {
        c = s;
        return this;
    }

    public final String b()
    {
        return c;
    }

    public final SignupData c(String s)
    {
        d = s;
        return this;
    }

    public final String c()
    {
        return d;
    }

    public final SignupData d(String s)
    {
        e = s;
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

    public final SignupData e(String s)
    {
        f = s;
        return this;
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
            obj = (SignupData)obj;
            if (((SignupData) (obj)).a() == null ? a() != null : !((SignupData) (obj)).a().equals(a()))
            {
                return false;
            }
            if (((SignupData) (obj)).b() == null ? b() != null : !((SignupData) (obj)).b().equals(b()))
            {
                return false;
            }
            if (((SignupData) (obj)).c() == null ? c() != null : !((SignupData) (obj)).c().equals(c()))
            {
                return false;
            }
            if (((SignupData) (obj)).d() == null ? d() != null : !((SignupData) (obj)).d().equals(d()))
            {
                return false;
            }
            if (((SignupData) (obj)).e() == null ? e() != null : !((SignupData) (obj)).e().equals(e()))
            {
                return false;
            }
            if (((SignupData) (obj)).f() == null ? f() != null : !((SignupData) (obj)).f().equals(f()))
            {
                return false;
            }
            if (((SignupData) (obj)).g() == null ? g() != null : !((SignupData) (obj)).g().equals(g()))
            {
                return false;
            }
            if (((SignupData) (obj)).h() == null ? h() != null : !((SignupData) (obj)).h().equals(h()))
            {
                return false;
            }
            if (((SignupData) (obj)).i() == null ? i() != null : !((SignupData) (obj)).i().equals(i()))
            {
                return false;
            }
            if (((SignupData) (obj)).j() == null ? j() != null : !((SignupData) (obj)).j().equals(j()))
            {
                return false;
            }
            if (((SignupData) (obj)).k() == null ? k() != null : !((SignupData) (obj)).k().equals(k()))
            {
                return false;
            }
            if (((SignupData) (obj)).l() == null ? l() != null : !((SignupData) (obj)).l().equals(l()))
            {
                return false;
            }
            if (((SignupData) (obj)).m() == null ? m() != null : !((SignupData) (obj)).m().equals(m()))
            {
                return false;
            }
        }
        return true;
    }

    public final SignupData f(String s)
    {
        g = s;
        return this;
    }

    public final String f()
    {
        return g;
    }

    public final SignupData g(String s)
    {
        h = s;
        return this;
    }

    public final String g()
    {
        return h;
    }

    public final SignupData.PromoCode h()
    {
        return i;
    }

    public final SignupData h(String s)
    {
        j = s;
        return this;
    }

    public final int hashCode()
    {
        int i4 = 0;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.hashCode();
        }
        if (c == null)
        {
            j1 = 0;
        } else
        {
            j1 = c.hashCode();
        }
        if (d == null)
        {
            k1 = 0;
        } else
        {
            k1 = d.hashCode();
        }
        if (e == null)
        {
            l1 = 0;
        } else
        {
            l1 = e.hashCode();
        }
        if (f == null)
        {
            i2 = 0;
        } else
        {
            i2 = f.hashCode();
        }
        if (g == null)
        {
            j2 = 0;
        } else
        {
            j2 = g.hashCode();
        }
        if (h == null)
        {
            k2 = 0;
        } else
        {
            k2 = h.hashCode();
        }
        if (i == null)
        {
            l2 = 0;
        } else
        {
            l2 = i.hashCode();
        }
        if (j == null)
        {
            i3 = 0;
        } else
        {
            i3 = j.hashCode();
        }
        if (k == null)
        {
            j3 = 0;
        } else
        {
            j3 = k.hashCode();
        }
        if (l == null)
        {
            k3 = 0;
        } else
        {
            k3 = l.hashCode();
        }
        if (m == null)
        {
            l3 = 0;
        } else
        {
            l3 = m.hashCode();
        }
        if (n != null)
        {
            i4 = n.hashCode();
        }
        return (l3 ^ (k3 ^ (j3 ^ (i3 ^ (l2 ^ (k2 ^ (j2 ^ (i2 ^ (l1 ^ (k1 ^ (j1 ^ (i1 ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ i4;
    }

    public final SignupData i(String s)
    {
        k = s;
        return this;
    }

    public final String i()
    {
        return j;
    }

    public final SignupData j(String s)
    {
        l = s;
        return this;
    }

    public final String j()
    {
        return k;
    }

    public final SignupData k(String s)
    {
        m = s;
        return this;
    }

    public final String k()
    {
        return l;
    }

    public final String l()
    {
        return m;
    }

    public final ThirdPartyToken m()
    {
        return n;
    }

    public final String toString()
    {
        return (new StringBuilder("SignupData{email=")).append(b).append(", mobile=").append(c).append(", mobileCountryIso2=").append(d).append(", password=").append(e).append(", firstName=").append(f).append(", lastName=").append(g).append(", pictureUrl=").append(h).append(", promoCode=").append(i).append(", payPalAuthorizationCode=").append(j).append(", googleToken=").append(k).append(", alipayAccountId=").append(l).append(", alipayMobile=").append(m).append(", thirdPartyToken=").append(n).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeValue(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
        parcel.writeValue(e);
        parcel.writeValue(f);
        parcel.writeValue(g);
        parcel.writeValue(h);
        parcel.writeValue(i);
        parcel.writeValue(j);
        parcel.writeValue(k);
        parcel.writeValue(l);
        parcel.writeValue(m);
        parcel.writeValue(n);
    }

}
