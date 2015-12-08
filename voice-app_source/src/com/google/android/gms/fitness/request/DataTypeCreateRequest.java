// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.internal.zzmh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzi

public class DataTypeCreateRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private String mName;
        private List zzakq;

        static String zza(Builder builder)
        {
            return builder.mName;
        }

        static List zzb(Builder builder)
        {
            return builder.zzakq;
        }

        public Builder addField(Field field)
        {
            if (!zzakq.contains(field))
            {
                zzakq.add(field);
            }
            return this;
        }

        public Builder addField(String s, int i)
        {
            boolean flag;
            if (s != null && !s.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Invalid name specified");
            return addField(Field.zzn(s, i));
        }

        public DataTypeCreateRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (mName != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Must set the name");
            if (!zzakq.isEmpty())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Must specify the data fields");
            return new DataTypeCreateRequest(this);
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        public Builder()
        {
            zzakq = new ArrayList();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    private final String mName;
    private final int zzCY;
    private final String zzMZ;
    private final List zzakq;
    private final zzmh zzamk;

    DataTypeCreateRequest(int i, String s, List list, IBinder ibinder, String s1)
    {
        zzCY = i;
        mName = s;
        zzakq = Collections.unmodifiableList(list);
        if (ibinder == null)
        {
            s = null;
        } else
        {
            s = com.google.android.gms.internal.zzmh.zza.zzbs(ibinder);
        }
        zzamk = s;
        zzMZ = s1;
    }

    private DataTypeCreateRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), null, null);
    }


    public DataTypeCreateRequest(DataTypeCreateRequest datatypecreaterequest, zzmh zzmh1, String s)
    {
        this(datatypecreaterequest.mName, datatypecreaterequest.zzakq, zzmh1, s);
    }

    public DataTypeCreateRequest(String s, List list, zzmh zzmh1, String s1)
    {
        zzCY = 2;
        mName = s;
        zzakq = Collections.unmodifiableList(list);
        zzamk = zzmh1;
        zzMZ = s1;
    }

    private boolean zzb(DataTypeCreateRequest datatypecreaterequest)
    {
        return zzt.equal(mName, datatypecreaterequest.mName) && zzt.equal(zzakq, datatypecreaterequest.zzakq);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataTypeCreateRequest) && zzb((DataTypeCreateRequest)obj);
    }

    public List getFields()
    {
        return zzakq;
    }

    public String getName()
    {
        return mName;
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            mName, zzakq
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("name", mName).zzg("fields", zzakq).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzamk == null)
        {
            return null;
        } else
        {
            return zzamk.asBinder();
        }
    }

}
