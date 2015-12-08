// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            be

public final class bo
    implements SafeParcelable
{

    public static final be CREATOR = new be();
    public final String gr;
    public final String gs;
    public final String gt;
    public final String gu;
    public final String mimeType;
    public final String packageName;
    public final String url;
    public final int versionCode;

    public bo(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        versionCode = i;
        gr = s;
        url = s1;
        mimeType = s2;
        packageName = s3;
        gs = s4;
        gt = s5;
        gu = s6;
    }

    public bo(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        be.a(this, parcel);
    }

}
