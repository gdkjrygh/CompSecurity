// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.nearby.messages.Message;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zze

public class MessageWrapper
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    final int versionCode;
    public final Message zzaFZ;

    MessageWrapper(int i, Message message)
    {
        versionCode = i;
        zzaFZ = (Message)zzu.zzu(message);
    }

    public int describeContents()
    {
        zze zze1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

}
