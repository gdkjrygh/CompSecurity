// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzf, DataType, Application, Device

public class DataSource
    implements SafeParcelable
{
    public static final class Builder
    {

        private String mName;
        private int zzSq;
        private DataType zzajF;
        private Device zzakd;
        private Application zzake;
        private String zzakf;

        static DataType zza(Builder builder)
        {
            return builder.zzajF;
        }

        static int zzb(Builder builder)
        {
            return builder.zzSq;
        }

        static String zzc(Builder builder)
        {
            return builder.mName;
        }

        static Device zzd(Builder builder)
        {
            return builder.zzakd;
        }

        static Application zze(Builder builder)
        {
            return builder.zzake;
        }

        static String zzf(Builder builder)
        {
            return builder.zzakf;
        }

        public DataSource build()
        {
            boolean flag1 = true;
            boolean flag;
            if (zzajF != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Must set data type");
            if (zzSq >= 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Must set data source type");
            return new DataSource(this);
        }

        public Builder setAppPackageName(Context context)
        {
            return setAppPackageName(context.getPackageName());
        }

        public Builder setAppPackageName(String s)
        {
            zzake = Application.zzcG(s);
            return this;
        }

        public Builder setDataType(DataType datatype)
        {
            zzajF = datatype;
            return this;
        }

        public Builder setDevice(Device device)
        {
            zzakd = device;
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        public Builder setStreamName(String s)
        {
            boolean flag;
            if (s != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Must specify a valid stream name");
            zzakf = s;
            return this;
        }

        public Builder setType(int i)
        {
            zzSq = i;
            return this;
        }

        public Builder()
        {
            zzSq = -1;
            zzakf = "";
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW = 0;
    private final String mName;
    private final int zzCY;
    private final int zzSq;
    private final DataType zzajF;
    private final Device zzakd;
    private final Application zzake;
    private final String zzakf;
    private final String zzakg;

    DataSource(int i, DataType datatype, String s, int j, Device device, Application application, String s1)
    {
        zzCY = i;
        zzajF = datatype;
        zzSq = j;
        mName = s;
        zzakd = device;
        zzake = application;
        zzakf = s1;
        zzakg = zzqC();
    }

    private DataSource(Builder builder)
    {
        zzCY = 3;
        zzajF = Builder.zza(builder);
        zzSq = Builder.zzb(builder);
        mName = com.google.android.gms.fitness.data.Builder.zzc(builder);
        zzakd = Builder.zzd(builder);
        zzake = Builder.zze(builder);
        zzakf = Builder.zzf(builder);
        zzakg = zzqC();
    }


    public static DataSource extract(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return (DataSource)zzc.zza(intent, "vnd.google.fitness.data_source", CREATOR);
        }
    }

    private String getTypeString()
    {
        switch (zzSq)
        {
        default:
            throw new IllegalArgumentException("invalid type value");

        case 0: // '\0'
            return "raw";

        case 1: // '\001'
            return "derived";
        }
    }

    private boolean zza(DataSource datasource)
    {
        return zzakg.equals(datasource.zzakg);
    }

    private String zzqC()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getTypeString());
        stringbuilder.append(":").append(zzajF.getName());
        if (zzake != null)
        {
            stringbuilder.append(":").append(zzake.getPackageName());
        }
        if (zzakd != null)
        {
            stringbuilder.append(":").append(zzakd.getStreamIdentifier());
        }
        if (zzakf != null)
        {
            stringbuilder.append(":").append(zzakf);
        }
        return stringbuilder.toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataSource) && zza((DataSource)obj);
    }

    public String getAppPackageName()
    {
        if (zzake == null)
        {
            return null;
        } else
        {
            return zzake.getPackageName();
        }
    }

    public DataType getDataType()
    {
        return zzajF;
    }

    public Device getDevice()
    {
        return zzakd;
    }

    public String getName()
    {
        return mName;
    }

    public String getStreamIdentifier()
    {
        return zzakg;
    }

    public String getStreamName()
    {
        return zzakf;
    }

    public int getType()
    {
        return zzSq;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzakg.hashCode();
    }

    public String toDebugString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (zzSq == 0)
        {
            s = "r";
        } else
        {
            s = "d";
        }
        stringbuilder = stringbuilder.append(s).append(":").append(zzajF.zzqD());
        if (zzake == null)
        {
            s = "";
        } else
        if (zzake.equals(Application.zzajM))
        {
            s = ":gms";
        } else
        {
            s = (new StringBuilder()).append(":").append(zzake.getPackageName()).toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (zzakd != null)
        {
            s = (new StringBuilder()).append(":").append(zzakd.getModel()).append(":").append(zzakd.getUid()).toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (zzakf != null)
        {
            s = (new StringBuilder()).append(":").append(zzakf).toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("DataSource{");
        stringbuilder.append(getTypeString());
        if (mName != null)
        {
            stringbuilder.append(":").append(mName);
        }
        if (zzake != null)
        {
            stringbuilder.append(":").append(zzake);
        }
        if (zzakd != null)
        {
            stringbuilder.append(":").append(zzakd);
        }
        if (zzakf != null)
        {
            stringbuilder.append(":").append(zzakf);
        }
        stringbuilder.append(":").append(zzajF);
        return stringbuilder.append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public Application zzqB()
    {
        return zzake;
    }

}
