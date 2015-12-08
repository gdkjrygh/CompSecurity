// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.a;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            b, d

public class FieldOnlyFilter
    implements SafeParcelable, a
{

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.drive.query.internal.b();
    final int jE;
    final MetadataBundle vZ;
    private final b wa;

    FieldOnlyFilter(int i, MetadataBundle metadatabundle)
    {
        jE = i;
        vZ = metadatabundle;
        wa = com.google.android.gms.drive.query.internal.d.a(metadatabundle);
    }

    public FieldOnlyFilter(b b1)
    {
        this(1, MetadataBundle.a(b1, null));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.query.internal.b.a(this, parcel, i);
    }

}
