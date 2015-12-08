// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            GlobalSearchApplicationInfo

public final class ab
    implements android.os.Parcelable.Creator
{

    public ab()
    {
    }

    static void a(GlobalSearchApplicationInfo globalsearchapplicationinfo, Parcel parcel)
    {
        int i = b.a(parcel);
        b.a(parcel, 1, globalsearchapplicationinfo.packageName, false);
        b.a(parcel, 1000, globalsearchapplicationinfo.jE);
        b.a(parcel, 2, globalsearchapplicationinfo.labelId);
        b.a(parcel, 3, globalsearchapplicationinfo.settingsDescriptionId);
        b.a(parcel, 4, globalsearchapplicationinfo.iconId);
        b.a(parcel, 5, globalsearchapplicationinfo.defaultIntentAction, false);
        b.a(parcel, 6, globalsearchapplicationinfo.defaultIntentData, false);
        b.a(parcel, 7, globalsearchapplicationinfo.defaultIntentActivity, false);
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s1 = null;
        String s2 = null;
        int j = 0;
        int k = 0;
        String s3 = null;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new GlobalSearchApplicationInfo(l, s3, k, j, i, s2, s1, s);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new GlobalSearchApplicationInfo[i];
    }
}
