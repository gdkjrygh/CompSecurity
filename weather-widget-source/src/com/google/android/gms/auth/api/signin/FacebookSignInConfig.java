// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            zzb

public class FacebookSignInConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private Intent mIntent;
    final int versionCode;
    private final ArrayList zzRR;

    public FacebookSignInConfig()
    {
        this(1, null, new ArrayList());
    }

    FacebookSignInConfig(int i, Intent intent, ArrayList arraylist)
    {
        versionCode = i;
        mIntent = intent;
        zzRR = arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public Intent zzlD()
    {
        return mIntent;
    }

    public ArrayList zzlE()
    {
        return new ArrayList(zzRR);
    }

}
