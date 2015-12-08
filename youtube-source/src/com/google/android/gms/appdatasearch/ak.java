// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            RegisterCorpusInfo, RegisterSectionInfo, GlobalSearchCorpusConfig

public final class ak
    implements android.os.Parcelable.Creator
{

    public ak()
    {
    }

    static void a(RegisterCorpusInfo registercorpusinfo, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, registercorpusinfo.name, false);
        b.a(parcel, 1000, registercorpusinfo.jE);
        b.a(parcel, 2, registercorpusinfo.version, false);
        b.a(parcel, 3, registercorpusinfo.contentProviderUri, i, false);
        b.a(parcel, 4, registercorpusinfo.sections, i, false);
        b.a(parcel, 7, registercorpusinfo.globalSearchConfig, i, false);
        b.a(parcel, 8, registercorpusinfo.trimmable);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        GlobalSearchCorpusConfig globalsearchcorpusconfig = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        String s = "0";
        boolean flag = true;
        RegisterSectionInfo aregistersectioninfo[] = null;
        Uri uri = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.m(parcel, k);
                    break;

                case 3: // '\003'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    aregistersectioninfo = (RegisterSectionInfo[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, RegisterSectionInfo.CREATOR);
                    break;

                case 7: // '\007'
                    globalsearchcorpusconfig = (GlobalSearchCorpusConfig)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, GlobalSearchCorpusConfig.CREATOR);
                    break;

                case 8: // '\b'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RegisterCorpusInfo(i, s1, s, uri, aregistersectioninfo, globalsearchcorpusconfig, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new RegisterCorpusInfo[i];
    }
}
