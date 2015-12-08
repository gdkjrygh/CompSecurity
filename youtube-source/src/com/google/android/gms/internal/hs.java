// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            hl, ht, hu, gi

public final class hs extends hl
    implements SafeParcelable
{

    public static final ht CREATOR = new ht();
    private static final hs Fs = new hs(0, new hu[0], new float[0], 0L);
    private final long Ag;
    private final hu Ft[];
    private final float Fu[];
    final int jE;

    hs(int i, hu ahu[], float af[], long l)
    {
        boolean flag;
        if (ahu.length == af.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gi.b(flag, "mismatched places to probabilities arrays");
        jE = i;
        Ft = ahu;
        Fu = af;
        Ag = l;
    }

    public final hu[] dQ()
    {
        return Ft;
    }

    public final float[] dR()
    {
        return Fu;
    }

    public final int describeContents()
    {
        ht ht1 = CREATOR;
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof hs))
            {
                return false;
            }
            obj = (hs)obj;
            if (!Ft.equals(((hs) (obj)).Ft) || !Fu.equals(((hs) (obj)).Fu))
            {
                return false;
            }
        }
        return true;
    }

    public final long getTimestampMillis()
    {
        return Ag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Ft, Fu
        });
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("PlaceEstimate{");
        for (int i = 0; i < Ft.length; i++)
        {
            stringbuilder.append(String.format("(%f, %s)", new Object[] {
                Float.valueOf(Fu[i]), Ft[i].toString()
            }));
            if (i != Ft.length - 1)
            {
                stringbuilder.append(",");
            }
        }

        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ht ht1 = CREATOR;
        ht.a(this, parcel, i);
    }

}
