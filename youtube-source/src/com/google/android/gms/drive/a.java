// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.drive:
//            Contents, DriveId

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(Contents contents, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, contents.jE);
        b.a(parcel, 2, contents.sp, i, false);
        b.a(parcel, 3, contents.uL);
        b.a(parcel, 4, contents.uM);
        b.a(parcel, 5, contents.uN, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        DriveId driveid = null;
        int i = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        ParcelFileDescriptor parcelfiledescriptor = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 5: // '\005'
                    driveid = (DriveId)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, DriveId.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new Contents(k, parcelfiledescriptor, j, i, driveid);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new Contents[i];
    }
}
