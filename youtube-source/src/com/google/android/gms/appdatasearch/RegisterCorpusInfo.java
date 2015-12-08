// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ge;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            ak, i, GlobalSearchCorpusConfig, RegisterSectionInfo

public class RegisterCorpusInfo
    implements SafeParcelable
{

    public static final ak CREATOR = new ak();
    public static final int MAX_NUMBER_SECTIONS_ALLOWED = 16;
    public final Uri contentProviderUri;
    public final GlobalSearchCorpusConfig globalSearchConfig;
    final int jE;
    public final String name;
    public final RegisterSectionInfo sections[];
    public final boolean trimmable;
    public final String version;

    RegisterCorpusInfo(int j, String s, String s1, Uri uri, RegisterSectionInfo aregistersectioninfo[], GlobalSearchCorpusConfig globalsearchcorpusconfig, boolean flag)
    {
        jE = j;
        name = s;
        version = s1;
        contentProviderUri = uri;
        sections = aregistersectioninfo;
        globalSearchConfig = globalsearchcorpusconfig;
        trimmable = flag;
    }

    public RegisterCorpusInfo(String s, String s1, Uri uri, RegisterSectionInfo aregistersectioninfo[], GlobalSearchCorpusConfig globalsearchcorpusconfig, boolean flag)
    {
        this(2, s, s1, uri, aregistersectioninfo, globalsearchcorpusconfig, flag);
    }

    public static i builder(String s)
    {
        return new i(s);
    }

    public int describeContents()
    {
        ak ak1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof RegisterCorpusInfo)
        {
            obj = (RegisterCorpusInfo)obj;
            flag = flag1;
            if (ge.a(name, ((RegisterCorpusInfo) (obj)).name))
            {
                flag = flag1;
                if (ge.a(contentProviderUri, ((RegisterCorpusInfo) (obj)).contentProviderUri))
                {
                    flag = flag1;
                    if (ge.a(sections, ((RegisterCorpusInfo) (obj)).sections))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        ak ak1 = CREATOR;
        ak.a(this, parcel, j);
    }

}
