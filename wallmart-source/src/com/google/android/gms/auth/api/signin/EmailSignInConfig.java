// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.util.Patterns;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            zza

public class EmailSignInConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int versionCode;
    private final Uri zzRO;
    private String zzRP;
    private Uri zzRQ;

    EmailSignInConfig(int i, Uri uri, String s, Uri uri1)
    {
        zzx.zzb(uri, "Server widget url cannot be null in order to use email/password sign in.");
        zzx.zzh(uri.toString(), "Server widget url cannot be null in order to use email/password sign in.");
        zzx.zzb(Patterns.WEB_URL.matcher(uri.toString()).matches(), "Invalid server widget url");
        versionCode = i;
        zzRO = uri;
        zzRP = s;
        zzRQ = uri1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public Uri zzlA()
    {
        return zzRO;
    }

    public Uri zzlB()
    {
        return zzRQ;
    }

    public String zzlC()
    {
        return zzRP;
    }

}
