// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            SafeParcelable

public final class zzc
{

    public static SafeParcelable zza(Intent intent, String s, android.os.Parcelable.Creator creator)
    {
        intent = intent.getByteArrayExtra(s);
        if (intent == null)
        {
            return null;
        } else
        {
            return zza(((byte []) (intent)), creator);
        }
    }

    public static SafeParcelable zza(byte abyte0[], android.os.Parcelable.Creator creator)
    {
        zzu.zzu(creator);
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        abyte0 = (SafeParcelable)creator.createFromParcel(parcel);
        parcel.recycle();
        return abyte0;
    }

    public static void zza(SafeParcelable safeparcelable, Intent intent, String s)
    {
        intent.putExtra(s, zza(safeparcelable));
    }

    public static byte[] zza(SafeParcelable safeparcelable)
    {
        Parcel parcel = Parcel.obtain();
        safeparcelable.writeToParcel(parcel, 0);
        safeparcelable = parcel.marshall();
        parcel.recycle();
        return safeparcelable;
    }
}
