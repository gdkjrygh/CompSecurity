// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.signin:
//            zza

public class GoogleSignInAccount
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int versionCode;
    private String zzRn;
    private String zzaNX;
    private Uri zzaNY;
    private String zzahh;
    private String zzwj;

    GoogleSignInAccount(int i, String s, String s1, String s2, String s3, Uri uri)
    {
        versionCode = i;
        zzwj = zzx.zzcs(s);
        zzRn = s1;
        zzaNX = s2;
        zzahh = s3;
        zzaNY = uri;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDisplayName()
    {
        return zzahh;
    }

    public String getEmail()
    {
        return zzaNX;
    }

    public String getId()
    {
        return zzwj;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public String zzlv()
    {
        return zzRn;
    }

    public Uri zzzm()
    {
        return zzaNY;
    }

}
