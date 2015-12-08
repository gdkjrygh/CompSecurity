// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public class PeriodicTask extends Task
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    protected long mFlexInSeconds;
    protected long mIntervalInSeconds;

    private PeriodicTask(Parcel parcel)
    {
        super(parcel);
        mIntervalInSeconds = -1L;
        mFlexInSeconds = -1L;
        mIntervalInSeconds = parcel.readLong();
        mFlexInSeconds = parcel.readLong();
    }

    PeriodicTask(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private PeriodicTask(Builder builder)
    {
        super(builder);
        mIntervalInSeconds = -1L;
        mFlexInSeconds = -1L;
    /* block-local class not found */
    class Builder {}

        mIntervalInSeconds = Builder.zza(builder);
        mFlexInSeconds = Builder.zzb(builder);
    }

    PeriodicTask(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public long getFlex()
    {
        return mFlexInSeconds;
    }

    public long getPeriod()
    {
        return mIntervalInSeconds;
    }

    public void toBundle(Bundle bundle)
    {
        super.toBundle(bundle);
        bundle.putLong("period", mIntervalInSeconds);
        bundle.putLong("period_flex", mFlexInSeconds);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" ").append("period=").append(getPeriod()).append(" ").append("flex=").append(getFlex()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeLong(mIntervalInSeconds);
        parcel.writeLong(mFlexInSeconds);
    }


    /* member class not found */
    class _cls1 {}

}
