// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            GlobalSearchApplication, GlobalSearchApplicationInfo, g

public final class aa
    implements android.os.Parcelable.Creator
{

    public aa()
    {
    }

    static void a(GlobalSearchApplication globalsearchapplication, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, globalsearchapplication.appInfo, i, false);
        b.a(parcel, 1000, globalsearchapplication.jE);
        b.a(parcel, 2, globalsearchapplication.jS, i, false);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        GlobalSearchApplicationInfo globalsearchapplicationinfo = null;
        int i = 0;
        g ag[] = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    globalsearchapplicationinfo = (GlobalSearchApplicationInfo)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, GlobalSearchApplicationInfo.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    ag = (g[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, g.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GlobalSearchApplication(i, globalsearchapplicationinfo, ag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GlobalSearchApplication[i];
    }
}
