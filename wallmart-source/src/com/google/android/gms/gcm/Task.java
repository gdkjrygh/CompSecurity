// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.gcm:
//            GcmNetworkManager

public abstract class Task
    implements Parcelable
{
    public static abstract class Builder
    {

        protected Bundle extras;
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
            zzx.zzb(flag, "Must provide an endpoint for this task by calling setService(ComponentName).");
            GcmNetworkManager.zzdi(tag);
            if (isPersisted)
            {
                Task.zzz(extras);
            }
        }

        public abstract Builder setExtras(Bundle bundle);

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


    public static final int EXTRAS_LIMIT_BYTES = 10240;
    public static final int NETWORK_STATE_ANY = 2;
    public static final int NETWORK_STATE_CONNECTED = 0;
    public static final int NETWORK_STATE_UNMETERED = 1;
    protected static final long UNINITIALIZED = -1L;
    private final Bundle mExtras;
    private final String mTag;
    private final String zzaAh;
    private final boolean zzaAi;
    private final boolean zzaAj;
    private final int zzaAk;
    private final boolean zzaAl;

    Task(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        zzaAh = parcel.readString();
        mTag = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzaAi = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzaAj = flag;
        zzaAk = 2;
        zzaAl = false;
        mExtras = null;
    }

    Task(Builder builder)
    {
        zzaAh = builder.gcmTaskService;
        mTag = builder.tag;
        zzaAi = builder.updateCurrent;
        zzaAj = builder.isPersisted;
        zzaAk = builder.requiredNetworkState;
        zzaAl = builder.requiresCharging;
        mExtras = builder.extras;
    }

    private static boolean zzy(Object obj)
    {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean);
    }

    public static void zzz(Bundle bundle)
    {
label0:
        {
            if (bundle == null)
            {
                break label0;
            }
            Object obj = Parcel.obtain();
            bundle.writeToParcel(((Parcel) (obj)), 0);
            int i = ((Parcel) (obj)).dataSize();
            if (i > 10240)
            {
                ((Parcel) (obj)).recycle();
                throw new IllegalArgumentException((new StringBuilder()).append("Extras exceeding maximum size(10240 bytes): ").append(i).toString());
            }
            ((Parcel) (obj)).recycle();
            obj = bundle.keySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (zzy(bundle.get((String)((Iterator) (obj)).next())));
            throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean. ");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public int getRequiredNetwork()
    {
        return zzaAk;
    }

    public boolean getRequiresCharging()
    {
        return zzaAl;
    }

    public String getServiceName()
    {
        return zzaAh;
    }

    public String getTag()
    {
        return mTag;
    }

    public boolean isPersisted()
    {
        return zzaAj;
    }

    public boolean isUpdateCurrent()
    {
        return zzaAi;
    }

    public void toBundle(Bundle bundle)
    {
        bundle.putString("tag", mTag);
        bundle.putBoolean("update_current", zzaAi);
        bundle.putBoolean("persisted", zzaAj);
        bundle.putString("service", zzaAh);
        bundle.putInt("requiredNetwork", zzaAk);
        bundle.putBoolean("requiresCharging", zzaAl);
        bundle.putBundle("extras", mExtras);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(zzaAh);
        parcel.writeString(mTag);
        if (zzaAi)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (zzaAj)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }
}
