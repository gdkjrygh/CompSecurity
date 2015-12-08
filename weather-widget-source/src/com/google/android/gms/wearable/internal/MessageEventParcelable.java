// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaz

public class MessageEventParcelable
    implements SafeParcelable, MessageEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaz();
    private final String mPath;
    final int mVersionCode;
    private final String zzaDI;
    private final int zzagq;
    private final byte zzayG[];

    MessageEventParcelable(int i, int j, String s, byte abyte0[], String s1)
    {
        mVersionCode = i;
        zzagq = j;
        mPath = s;
        zzayG = abyte0;
        zzaDI = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getData()
    {
        return zzayG;
    }

    public String getPath()
    {
        return mPath;
    }

    public int getRequestId()
    {
        return zzagq;
    }

    public String getSourceNodeId()
    {
        return zzaDI;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("MessageEventParcelable[").append(zzagq).append(",").append(mPath).append(", size=");
        Object obj;
        if (zzayG == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(zzayG.length);
        }
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaz.zza(this, parcel, i);
    }

}
