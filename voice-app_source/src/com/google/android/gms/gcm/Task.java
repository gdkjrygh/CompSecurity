// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmNetworkManager

public abstract class Task
    implements Parcelable
{
    public static abstract class Builder
    {

        protected String gcmTaskService;
        protected boolean isPersisted;
        protected int requiredNetworkState;
        protected boolean requiresCharging;
        protected String tag;
        protected boolean updateCurrent;

        public abstract Task build();

        protected void checkConditions()
        {
            boolean flag;
            if (gcmTaskService != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must provide an endpoint for this task by calling setService(ComponentName).");
            GcmNetworkManager.zzcY(tag);
        }

        public abstract Builder setPersisted(boolean flag);

        public abstract Builder setRequiredNetwork(int i);

        public abstract Builder setRequiresCharging(boolean flag);

        public abstract Builder setService(Class class1);

        public abstract Builder setTag(String s);

        public abstract Builder setUpdateCurrent(boolean flag);

        public Builder()
        {
        }
    }


    public static final int NETWORK_STATE_ANY = 2;
    public static final int NETWORK_STATE_CONNECTED = 0;
    public static final int NETWORK_STATE_UNMETERED = 1;
    protected static final long UNINITIALIZED = -1L;
    private final String mTag;
    private final String zzawf;
    private final boolean zzawg;
    private final boolean zzawh;
    private final int zzawi;
    private final boolean zzawj;

    Task(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        zzawf = parcel.readString();
        mTag = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzawg = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzawh = flag;
        zzawi = 2;
        zzawj = false;
    }

    Task(Builder builder)
    {
        zzawf = builder.gcmTaskService;
        mTag = builder.tag;
        zzawg = builder.updateCurrent;
        zzawh = builder.isPersisted;
        zzawi = builder.requiredNetworkState;
        zzawj = builder.requiresCharging;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getRequiredNetwork()
    {
        return zzawi;
    }

    public boolean getRequiresCharging()
    {
        return zzawj;
    }

    public String getServiceName()
    {
        return zzawf;
    }

    public String getTag()
    {
        return mTag;
    }

    public boolean isPersisted()
    {
        return zzawh;
    }

    public boolean isUpdateCurrent()
    {
        return zzawg;
    }

    public void toBundle(Bundle bundle)
    {
        bundle.putString("tag", mTag);
        bundle.putBoolean("update_current", zzawg);
        bundle.putBoolean("persisted", zzawh);
        bundle.putString("service", zzawf);
        bundle.putInt("requiredNetwork", zzawi);
        bundle.putBoolean("requiresCharging", zzawj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(zzawf);
        parcel.writeString(mTag);
        if (zzawg)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (zzawh)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }
}
