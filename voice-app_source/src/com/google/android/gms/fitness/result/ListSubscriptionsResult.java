// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzh

public class ListSubscriptionsResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private final int zzCY;
    private final Status zzOt;
    private final List zzamW;

    ListSubscriptionsResult(int i, List list, Status status)
    {
        zzCY = i;
        zzamW = list;
        zzOt = status;
    }

    public ListSubscriptionsResult(List list, Status status)
    {
        zzCY = 3;
        zzamW = Collections.unmodifiableList(list);
        zzOt = (Status)zzu.zzb(status, "status");
    }

    public static ListSubscriptionsResult zzN(Status status)
    {
        return new ListSubscriptionsResult(Collections.emptyList(), status);
    }

    private boolean zzb(ListSubscriptionsResult listsubscriptionsresult)
    {
        return zzOt.equals(listsubscriptionsresult.zzOt) && zzt.equal(zzamW, listsubscriptionsresult.zzamW);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof ListSubscriptionsResult) && zzb((ListSubscriptionsResult)obj);
    }

    public Status getStatus()
    {
        return zzOt;
    }

    public List getSubscriptions()
    {
        return zzamW;
    }

    public List getSubscriptions(DataType datatype)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzamW.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Subscription subscription = (Subscription)iterator.next();
            if (datatype.equals(subscription.zzqM()))
            {
                arraylist.add(subscription);
            }
        } while (true);
        return Collections.unmodifiableList(arraylist);
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzOt, zzamW
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("status", zzOt).zzg("subscriptions", zzamW).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

}
