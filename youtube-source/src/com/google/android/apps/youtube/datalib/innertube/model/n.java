// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.os.Parcel;
import com.google.a.a.a.a.hv;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            InfoCardCollection

final class n
    implements android.os.Parcelable.Creator
{

    n()
    {
    }

    private static InfoCardCollection a(Parcel parcel)
    {
        byte abyte0[] = new byte[parcel.readInt()];
        parcel.readByteArray(abyte0);
        try
        {
            parcel = new InfoCardCollection((hv)c.a(new hv(), abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return null;
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new InfoCardCollection[i];
    }
}
