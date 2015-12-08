// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class Task
    implements Parcelable
{

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
    /* block-local class not found */
    class Builder {}

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
