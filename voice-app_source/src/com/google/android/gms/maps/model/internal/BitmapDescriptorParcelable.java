// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zza

public final class BitmapDescriptorParcelable
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    private final int zzCY;
    private byte zzaDM;
    private Bundle zzaDN;
    private Bitmap zzaDO;

    BitmapDescriptorParcelable(int i, byte byte0, Bundle bundle, Bitmap bitmap)
    {
        zzCY = i;
        zzaDM = byte0;
        zzaDN = bundle;
        zzaDO = bitmap;
    }

    public int describeContents()
    {
        return 0;
    }

    public Bitmap getBitmap()
    {
        return zzaDO;
    }

    public Bundle getParameters()
    {
        return zzaDN;
    }

    public byte getType()
    {
        return zzaDM;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
