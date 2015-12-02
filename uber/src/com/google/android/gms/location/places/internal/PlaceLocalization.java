// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import asf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import wl;
import wm;

public final class PlaceLocalization
    implements SafeParcelable
{

    public static final asf CREATOR = new asf();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public PlaceLocalization(int i, String s, String s1, String s2, String s3, List list)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = list;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PlaceLocalization))
            {
                return false;
            }
            obj = (PlaceLocalization)obj;
            if (!wl.a(b, ((PlaceLocalization) (obj)).b) || !wl.a(c, ((PlaceLocalization) (obj)).c) || !wl.a(d, ((PlaceLocalization) (obj)).d) || !wl.a(e, ((PlaceLocalization) (obj)).e) || !wl.a(f, ((PlaceLocalization) (obj)).f))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return wl.a(new Object[] {
            b, c, d, e
        });
    }

    public final String toString()
    {
        return wl.a(this).a("name", b).a("address", c).a("internationalPhoneNumber", d).a("regularOpenHours", e).a("attributions", f).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        asf.a(this, parcel);
    }

}
