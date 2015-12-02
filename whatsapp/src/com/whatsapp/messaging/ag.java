// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.protocol.bd;

// Referenced classes of package com.whatsapp.messaging:
//            bd, h

final class ag
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.whatsapp.messaging.bd();
    private final bd a;

    public ag(Parcel parcel)
    {
        a = new bd(parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
    }

    public ag(bd bd1)
    {
        a = bd1;
    }

    public static ag[] a(bd abd[])
    {
        int j = h.a;
        ag aag[] = new ag[abd.length];
        int i = 0;
        do
        {
            if (i >= abd.length)
            {
                break;
            }
            aag[i] = new ag(abd[i]);
            i++;
        } while (j == 0);
        return aag;
    }

    public static bd[] a(ag aag[])
    {
        int j = h.a;
        bd abd[] = new bd[aag.length];
        int i = 0;
        do
        {
            if (i >= aag.length)
            {
                break;
            }
            abd[i] = aag[i].a();
            i++;
        } while (j == 0);
        return abd;
    }

    public bd a()
    {
        return a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeByteArray(a.c);
        parcel.writeByteArray(a.a);
        parcel.writeByteArray(a.b);
    }

}
