// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.onboarding;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.feature.profiles.onboarding:
//            OnBoardingIntroCard

final class Shape_OnBoardingIntroCard extends OnBoardingIntroCard
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static OnBoardingIntroCard a(Parcel parcel)
        {
            return new Shape_OnBoardingIntroCard(parcel, (byte)0);
        }

        private static OnBoardingIntroCard[] a(int i)
        {
            return new OnBoardingIntroCard[i];
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
    private static final ClassLoader a = com/ubercab/client/feature/profiles/onboarding/Shape_OnBoardingIntroCard.getClassLoader();
    private int b;
    private String c;
    private int d;

    Shape_OnBoardingIntroCard()
    {
    }

    private Shape_OnBoardingIntroCard(Parcel parcel)
    {
        b = ((Integer)parcel.readValue(a)).intValue();
        c = (String)parcel.readValue(a);
        d = ((Integer)parcel.readValue(a)).intValue();
    }

    Shape_OnBoardingIntroCard(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    final int a()
    {
        return b;
    }

    final OnBoardingIntroCard a(int i)
    {
        b = i;
        return this;
    }

    final OnBoardingIntroCard a(String s)
    {
        c = s;
        return this;
    }

    final OnBoardingIntroCard b(int i)
    {
        d = i;
        return this;
    }

    final String b()
    {
        return c;
    }

    final int c()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (OnBoardingIntroCard)obj;
            if (((OnBoardingIntroCard) (obj)).a() != a())
            {
                return false;
            }
            if (((OnBoardingIntroCard) (obj)).b() == null ? b() != null : !((OnBoardingIntroCard) (obj)).b().equals(b()))
            {
                return false;
            }
            if (((OnBoardingIntroCard) (obj)).c() != c())
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = b;
        int i;
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.hashCode();
        }
        return (i ^ (j ^ 0xf4243) * 0xf4243) * 0xf4243 ^ d;
    }

    public final String toString()
    {
        return (new StringBuilder("OnBoardingIntroCard{bylineResId=")).append(b).append(", imageUrl=").append(c).append(", titleResId=").append(d).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(Integer.valueOf(b));
        parcel.writeValue(c);
        parcel.writeValue(Integer.valueOf(d));
    }

}
