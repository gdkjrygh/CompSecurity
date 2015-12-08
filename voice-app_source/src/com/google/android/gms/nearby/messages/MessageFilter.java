// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            zzb

public class MessageFilter
    implements SafeParcelable
{
    public static final class zza
    {

        private final List zzaFP = new ArrayList();

        private zza zzC(String s, String s1)
        {
            zzaFP.add(new MessageType(s, s1));
            return this;
        }

        public zza zzwX()
        {
            return zzC("", "");
        }

        public MessageFilter zzwY()
        {
            boolean flag;
            if (!zzaFP.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "At least one of the include methods must be called.");
            return new MessageFilter(zzaFP);
        }

        public zza()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    public static final MessageFilter zzaFO = (new zza()).zzwX().zzwY();
    final int versionCode;
    private final List zzaFP;

    MessageFilter(int i, List list)
    {
        versionCode = i;
        zzaFP = Collections.unmodifiableList((List)zzu.zzu(list));
    }

    private MessageFilter(List list)
    {
        this(1, list);
    }


    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof MessageFilter))
        {
            return false;
        } else
        {
            obj = (MessageFilter)obj;
            return zzt.equal(zzaFP, ((MessageFilter) (obj)).zzaFP);
        }
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzaFP
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("MessageFilter").append(zzaFP).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    List zzwW()
    {
        return zzaFP;
    }

}
