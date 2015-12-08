// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.os.Parcel;
import android.os.Parcelable;
import com.weather.commons.video2.dsx.VideoValidation;
import com.weather.util.parsing.ValidationException;

public class Dma
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Dma createFromParcel(Parcel parcel)
        {
            return new Dma(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Dma[] newArray(int i)
        {
            return new Dma[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final String dma;

    public Dma(Parcel parcel)
    {
        this(parcel.readString());
    }

    public Dma(String s)
    {
        try
        {
            dma = VideoValidation.validateDma("dma", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
    }

    public Dma(String s, Integer integer)
    {
        this((new StringBuilder()).append(s).append('.').append(integer).append(':').append(s).toString());
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (Dma)obj;
            return dma.equals(((Dma) (obj)).dma);
        }
    }

    public String get()
    {
        return dma;
    }

    public int hashCode()
    {
        return dma.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Dma{dma='").append(dma).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(dma);
    }

}
