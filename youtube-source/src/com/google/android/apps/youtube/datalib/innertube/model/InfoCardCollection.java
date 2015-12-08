// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.a.a.a.a.hv;
import com.google.a.a.a.a.ic;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            n, m

public class InfoCardCollection
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    private final hv infoCardCollectionProto;
    private List infoCards;

    public InfoCardCollection(hv hv1)
    {
        infoCardCollectionProto = (hv)c.a(hv1);
    }

    public static InfoCardCollection fromByteArray(byte abyte0[])
    {
        try
        {
            abyte0 = new InfoCardCollection((hv)com.google.protobuf.nano.c.a(new hv(), abyte0));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public List getInfoCards()
    {
        if (infoCards == null)
        {
            infoCards = new ArrayList();
            ic aic[] = infoCardCollectionProto.b;
            int j = aic.length;
            for (int i = 0; i < j; i++)
            {
                ic ic1 = aic[i];
                infoCards.add(new m(ic1.b));
            }

        }
        return infoCards;
    }

    public byte[] toByteArray()
    {
        return com.google.protobuf.nano.c.a(infoCardCollectionProto);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        byte abyte0[] = com.google.protobuf.nano.c.a(infoCardCollectionProto);
        parcel.writeInt(abyte0.length);
        parcel.writeByteArray(abyte0);
    }

}
