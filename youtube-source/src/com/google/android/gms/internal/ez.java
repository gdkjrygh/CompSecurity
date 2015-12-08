// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            gn, fb, gq

public class ez
    implements SafeParcelable
{

    public static final gn CREATOR = new gn();
    private final int jE;
    private final fb uj;

    ez(int i, fb fb1)
    {
        jE = i;
        uj = fb1;
    }

    private ez(fb fb1)
    {
        jE = 1;
        uj = fb1;
    }

    public static ez a(gq gq)
    {
        if (gq instanceof fb)
        {
            return new ez((fb)gq);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    fb ce()
    {
        return uj;
    }

    public gq cf()
    {
        if (uj != null)
        {
            return uj;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    public int describeContents()
    {
        gn gn1 = CREATOR;
        return 0;
    }

    int getVersionCode()
    {
        return jE;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        gn gn1 = CREATOR;
        gn.a(this, parcel, i);
    }

}
