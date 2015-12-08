// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaw

public class MessageEventParcelable
    implements SafeParcelable, MessageEvent
{

    public static final android.os.Parcelable.Creator CREATOR = new zzaw();
    final int zzCY;
    private final String zzaTQ;
    private final int zzacR;
    private final byte zzauL[];
    private final String zzazL;

    MessageEventParcelable(int i, int j, String s, byte abyte0[], String s1)
    {
        zzCY = i;
        zzacR = j;
        zzaTQ = s;
        zzauL = abyte0;
        zzazL = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getData()
    {
        return zzauL;
    }

    public String getPath()
    {
        return zzaTQ;
    }

    public int getRequestId()
    {
        return zzacR;
    }

    public String getSourceNodeId()
    {
        return zzazL;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("MessageEventParcelable[").append(zzacR).append(",").append(zzaTQ).append(", size=");
        Object obj;
        if (zzauL == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(zzauL.length);
        }
        return stringbuilder.append(obj).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaw.zza(this, parcel, i);
    }

}
