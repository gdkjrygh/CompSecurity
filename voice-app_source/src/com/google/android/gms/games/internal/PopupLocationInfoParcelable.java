// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupLocationInfoParcelableCreator

public final class PopupLocationInfoParcelable
    implements SafeParcelable
{

    public static final PopupLocationInfoParcelableCreator CREATOR = new PopupLocationInfoParcelableCreator();
    private final int zzCY;
    private final Bundle zzaqr;
    private final IBinder zzaqs;

    PopupLocationInfoParcelable(int i, Bundle bundle, IBinder ibinder)
    {
        zzCY = i;
        zzaqr = bundle;
        zzaqs = ibinder;
    }

    public PopupLocationInfoParcelable(PopupManager.PopupLocationInfo popuplocationinfo)
    {
        zzCY = 1;
        zzaqr = popuplocationinfo.zztc();
        zzaqs = popuplocationinfo.zzaqv;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public IBinder getWindowToken()
    {
        return zzaqs;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PopupLocationInfoParcelableCreator.zza(this, parcel, i);
    }

    public Bundle zztc()
    {
        return zzaqr;
    }

}
