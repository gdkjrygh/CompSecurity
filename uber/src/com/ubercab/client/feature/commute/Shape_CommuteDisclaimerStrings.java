// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.commute;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.commute:
//            CommuteDisclaimerStrings

final class Shape_CommuteDisclaimerStrings extends CommuteDisclaimerStrings
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static CommuteDisclaimerStrings a(Parcel parcel)
        {
            return new Shape_CommuteDisclaimerStrings(parcel, (byte)0);
        }

        private static CommuteDisclaimerStrings[] a(int i)
        {
            return new CommuteDisclaimerStrings[i];
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
    private static final ClassLoader a = com/ubercab/client/feature/commute/Shape_CommuteDisclaimerStrings.getClassLoader();
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    Shape_CommuteDisclaimerStrings()
    {
    }

    private Shape_CommuteDisclaimerStrings(Parcel parcel)
    {
        b = (String)parcel.readValue(a);
        c = (String)parcel.readValue(a);
        d = (String)parcel.readValue(a);
        e = (String)parcel.readValue(a);
        f = (String)parcel.readValue(a);
        g = (String)parcel.readValue(a);
    }

    Shape_CommuteDisclaimerStrings(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    final String a()
    {
        return b;
    }

    final String b()
    {
        return c;
    }

    final String c()
    {
        return d;
    }

    final String d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    final String e()
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
            obj = (CommuteDisclaimerStrings)obj;
            if (((CommuteDisclaimerStrings) (obj)).a() == null ? a() != null : !((CommuteDisclaimerStrings) (obj)).a().equals(a()))
            {
                return false;
            }
            if (((CommuteDisclaimerStrings) (obj)).b() == null ? b() != null : !((CommuteDisclaimerStrings) (obj)).b().equals(b()))
            {
                return false;
            }
            if (((CommuteDisclaimerStrings) (obj)).c() == null ? c() != null : !((CommuteDisclaimerStrings) (obj)).c().equals(c()))
            {
                return false;
            }
            if (((CommuteDisclaimerStrings) (obj)).d() == null ? d() != null : !((CommuteDisclaimerStrings) (obj)).d().equals(d()))
            {
                return false;
            }
            if (((CommuteDisclaimerStrings) (obj)).e() == null ? e() != null : !((CommuteDisclaimerStrings) (obj)).e().equals(e()))
            {
                return false;
            }
            if (((CommuteDisclaimerStrings) (obj)).f() == null ? f() != null : !((CommuteDisclaimerStrings) (obj)).f().equals(f()))
            {
                return false;
            }
        }
        return true;
    }

    final String f()
    {
        return g;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.hashCode();
        }
        if (d == null)
        {
            k = 0;
        } else
        {
            k = d.hashCode();
        }
        if (e == null)
        {
            l = 0;
        } else
        {
            l = e.hashCode();
        }
        if (f == null)
        {
            i1 = 0;
        } else
        {
            i1 = f.hashCode();
        }
        if (g != null)
        {
            j1 = g.hashCode();
        }
        return (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j1;
    }

    public final String toString()
    {
        return (new StringBuilder("CommuteDisclaimerStrings{content=")).append(b).append(", continueText=").append(c).append(", learnMoreText=").append(d).append(", learnMoreUrl=").append(e).append(", notNowText=").append(f).append(", title=").append(g).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
        parcel.writeValue(e);
        parcel.writeValue(f);
        parcel.writeValue(g);
    }

}
