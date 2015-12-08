// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            zza

public class Message
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private final byte content[];
    private final String type;
    final int versionCode;
    private final String zzaby;

    Message(int i, byte abyte0[], String s, String s1)
    {
        boolean flag;
        if (abyte0.length <= 0x19000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", new Object[] {
            Integer.valueOf(abyte0.length), Integer.valueOf(0x19000)
        });
        versionCode = i;
        content = (byte[])zzu.zzu(abyte0);
        type = (String)zzu.zzu(s1);
        abyte0 = s;
        if (s == null)
        {
            abyte0 = "";
        }
        zzaby = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getNamespace()
    {
        return zzaby;
    }

    public String getType()
    {
        return type;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Message{type='").append(type).append("'").append(", namespace='").append(zzaby).append("'").append(", content=[").append(content.length).append(" bytes]").append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public byte[] zzwV()
    {
        return content;
    }

}
