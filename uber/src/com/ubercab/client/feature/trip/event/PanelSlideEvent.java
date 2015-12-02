// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.event;

import android.os.Parcel;
import android.os.Parcelable;

public final class PanelSlideEvent
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static PanelSlideEvent a(Parcel parcel)
        {
            return new PanelSlideEvent(parcel);
        }

        private static PanelSlideEvent[] a(int i)
        {
            return new PanelSlideEvent[i];
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
    private float a;
    private int b;

    public PanelSlideEvent()
    {
    }

    PanelSlideEvent(Parcel parcel)
    {
        a = parcel.readFloat();
        b = parcel.readInt();
    }

    public final float a()
    {
        return a;
    }

    public final PanelSlideEvent a(int i, float f)
    {
        b = i;
        a = f;
        return this;
    }

    public final int b()
    {
        return b;
    }

    public final boolean c()
    {
        return a == 0.0F;
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
            obj = (PanelSlideEvent)obj;
            if (b != ((PanelSlideEvent) (obj)).b)
            {
                return false;
            }
            if (Float.compare(((PanelSlideEvent) (obj)).a, a) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        if (a != 0.0F)
        {
            i = Float.floatToIntBits(a);
        } else
        {
            i = 0;
        }
        return i * 31 + b;
    }

    public final String toString()
    {
        return String.format("%.2f of %d", new Object[] {
            Float.valueOf(a), Integer.valueOf(b)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeFloat(a);
        parcel.writeInt(b);
    }

}
