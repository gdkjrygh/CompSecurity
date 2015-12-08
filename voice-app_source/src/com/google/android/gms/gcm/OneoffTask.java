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

        private long zzawb;
        private long zzawc;

        static long zza(Builder builder)
        {
            return builder.zzawb;
        }

        static long zzb(Builder builder)
        {
            return builder.zzawc;
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
            if (zzawb == -1L || zzawc == -1L)
            {
                throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
            }
            if (zzawb >= zzawc)
            {
                throw new IllegalArgumentException("Window start must be shorter than window end.");
            } else
            {
                return;
            }
        }

        public Builder setExecutionWindow(long l, long l1)
        {
            zzawb = l;
            zzawc = l1;
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
            zzawb = -1L;
            zzawc = -1L;
            isPersisted = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Object createFromParcel(Parcel parcel)
        {
            return zzdV(parcel);
        }

        public Object[] newArray(int i)
        {
            return zzgh(i);
        }

        public OneoffTask zzdV(Parcel parcel)
        {
            return new OneoffTask(parcel);
        }

        public OneoffTask[] zzgh(int i)
        {
            return new OneoffTask[i];
        }

    };
    private final long zzavZ;
    private final long zzawa;

    private OneoffTask(Parcel parcel)
    {
        super(parcel);
        zzavZ = parcel.readLong();
        zzawa = parcel.readLong();
    }


    private OneoffTask(Builder builder)
    {
        super(builder);
        zzavZ = Builder.zza(builder);
        zzawa = Builder.zzb(builder);
    }


    public long getWindowEnd()
    {
        return zzawa;
    }

    public long getWindowStart()
    {
        return zzavZ;
    }

    public void toBundle(Bundle bundle)
    {
        super.toBundle(bundle);
        bundle.putLong("window_start", zzavZ);
        bundle.putLong("window_end", zzawa);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append(" ").append("windowStart=").append(getWindowStart()).append(" ").append("windowEnd=").append(getWindowEnd()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeLong(zzavZ);
        parcel.writeLong(zzawa);
    }

}
