// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public class OneoffTask extends Task
{
    public static class Builder extends Task.Builder
    {

        private long zzaAd;
        private long zzaAe;

        static long zza(Builder builder)
        {
            return builder.zzaAd;
        }

        static long zzb(Builder builder)
        {
            return builder.zzaAe;
        }

        public OneoffTask build()
        {
            checkConditions();
            return new OneoffTask(this);
        }

        public volatile Task build()
        {
            return build();
        }

        protected void checkConditions()
        {
            super.checkConditions();
            if (zzaAd == -1L || zzaAe == -1L)
            {
                throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
            }
            if (zzaAd >= zzaAe)
            {
                throw new IllegalArgumentException("Window start must be shorter than window end.");
            } else
            {
                return;
            }
        }

        public Builder setExecutionWindow(long l, long l1)
        {
            zzaAd = l;
            zzaAe = l1;
            return this;
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
            zzaAd = -1L;
            zzaAe = -1L;
            isPersisted = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return zzeh(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzgt(i);
        }

        public OneoffTask zzeh(Parcel parcel)
        {
            return new OneoffTask(parcel);
        }

        public OneoffTask[] zzgt(int i)
        {
            return new OneoffTask[i];
        }

    };
    private final long zzaAb;
    private final long zzaAc;

    private OneoffTask(Parcel parcel)
    {
        super(parcel);
        zzaAb = parcel.readLong();
        zzaAc = parcel.readLong();
    }


    private OneoffTask(Builder builder)
    {
        super(builder);
        zzaAb = Builder.zza(builder);
        zzaAc = Builder.zzb(builder);
    }


    public long getWindowEnd()
    {
        return zzaAc;
    }

    public long getWindowStart()
    {
        return zzaAb;
    }

    public void toBundle(Bundle bundle)
    {
        super.toBundle(bundle);
        bundle.putLong("window_start", zzaAb);
        bundle.putLong("window_end", zzaAc);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" ").append("windowStart=").append(getWindowStart()).append(" ").append("windowEnd=").append(getWindowEnd()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeLong(zzaAb);
        parcel.writeLong(zzaAc);
    }

}
