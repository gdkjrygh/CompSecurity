// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;

import android.os.Parcel;
import com.google.a.a.a.a.sb;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.j;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.media:
//            VideoStreamingData

final class l
    implements android.os.Parcelable.Creator
{

    l()
    {
    }

    private static VideoStreamingData a(Parcel parcel)
    {
        sb sb1;
        boolean flag;
        flag = true;
        sb1 = null;
        sb sb2 = (sb)j.b(parcel, new sb());
        sb1 = sb2;
_L1:
        String s = parcel.readString();
        long l1 = parcel.readLong();
        long l2 = parcel.readLong();
        InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception;
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        return new VideoStreamingData(sb1, s, l1, l2, flag);
        invalidprotocolbuffernanoexception;
        L.a("Error reading streaming data", invalidprotocolbuffernanoexception);
          goto _L1
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new VideoStreamingData[i];
    }
}
