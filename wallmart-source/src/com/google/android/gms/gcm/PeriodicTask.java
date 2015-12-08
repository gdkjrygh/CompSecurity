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
    public static class Builder extends Task.Builder
    {

        private long zzaAf;
        private long zzaAg;

        static long zza(Builder builder)
        {
            return builder.zzaAf;
        }

        static long zzb(Builder builder)
        {
            return builder.zzaAg;
        }

        public PeriodicTask build()
        {
            checkConditions();
            return new PeriodicTask(this);
        }

        public volatile Task build()
        {
            return build();
        }

        protected void checkConditions()
        {
            super.checkConditions();
            if (zzaAf == -1L)
            {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            }
            if (zzaAg == -1L)
            {
                zzaAg = (long)((float)zzaAf * 0.1F);
            }
        }

        public Builder setExtras(Bundle bundle)
        {
            extras = bundle;
            return this;
        }

        public volatile Task.Builder setExtras(Bundle bundle)
        {
            return setExtras(bundle);
        }

        public Builder setFlex(long l)
        {
            zzaAg = l;
            return this;
        }

        public Builder setPeriod(long l)
        {
            zzaAf = l;
            return this;
        }

        public Builder setPersisted(boolean flag)
        {
            isPersisted = flag;
            return this;
        }

        public volatile Task.Builder setPersisted(boolean flag)
        {
            return setPersisted(flag);
        }

        public Builder setRequiredNetwork(int i)
        {
            requiredNetworkState = i;
            return this;
        }

        public volatile Task.Builder setRequiredNetwork(int i)
        {
            return setRequiredNetwork(i);
        }

        public Builder setRequiresCharging(boolean flag)
        {
            requiresCharging = flag;
            return this;
        }

        public volatile Task.Builder setRequiresCharging(boolean flag)
        {
            return setRequiresCharging(flag);
        }

        public Builder setService(Class class1)
        {
            gcmTaskService = class1.getName();
            return this;
        }

        public volatile Task.Builder setService(Class class1)
        {
            return setService(class1);
        }

        public Builder setTag(String s)
        {
            tag = s;
            return this;
        }

        public volatile Task.Builder setTag(String s)
        {
            return setTag(s);
        }

        public Builder setUpdateCurrent(boolean flag)
        {
            updateCurrent = flag;
            return this;
        }

        public volatile Task.Builder setUpdateCurrent(boolean flag)
        {
            return setUpdateCurrent(flag);
        }

        public Builder()
        {
            zzaAf = -1L;
            zzaAg = -1L;
            isPersisted = true;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return zzej(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzgv(i);
        }

        public PeriodicTask zzej(Parcel parcel)
        {
            return new PeriodicTask(parcel);
        }

        public PeriodicTask[] zzgv(int i)
        {
            return new PeriodicTask[i];
        }

    };
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


    private PeriodicTask(Builder builder)
    {
        super(builder);
        mIntervalInSeconds = -1L;
        mFlexInSeconds = -1L;
        mIntervalInSeconds = Builder.zza(builder);
        mFlexInSeconds = Builder.zzb(builder);
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

}
