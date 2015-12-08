// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzp, Application

public class Session
    implements SafeParcelable
{
    public static class Builder
    {

        private String mName;
        private long zzKT;
        private long zzajH;
        private int zzajR;
        private String zzakL;
        private String zzakM;
        private Long zzakN;
        private Application zzake;

        static long zza(Builder builder)
        {
            return builder.zzKT;
        }

        static long zzb(Builder builder)
        {
            return builder.zzajH;
        }

        static String zzc(Builder builder)
        {
            return builder.mName;
        }

        static String zzd(Builder builder)
        {
            return builder.zzakL;
        }

        static String zze(Builder builder)
        {
            return builder.zzakM;
        }

        static int zzf(Builder builder)
        {
            return builder.zzajR;
        }

        static Application zzg(Builder builder)
        {
            return builder.zzake;
        }

        static Long zzh(Builder builder)
        {
            return builder.zzakN;
        }

        public Session build()
        {
label0:
            {
                boolean flag1 = false;
                StringBuilder stringbuilder;
                boolean flag;
                if (zzKT > 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzu.zza(flag, "Start time should be specified.");
                if (zzajH != 0L)
                {
                    flag = flag1;
                    if (zzajH <= zzKT)
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            zzu.zza(flag, "End time should be later than start time.");
            if (zzakL == null)
            {
                stringbuilder = new StringBuilder();
                String s;
                if (mName == null)
                {
                    s = "";
                } else
                {
                    s = mName;
                }
                zzakL = stringbuilder.append(s).append(zzKT).toString();
            }
            return new Session(this);
        }

        public Builder setActiveTime(long l, TimeUnit timeunit)
        {
            zzakN = Long.valueOf(timeunit.toMillis(l));
            return this;
        }

        public Builder setActivity(String s)
        {
            return zzeo(FitnessActivities.zzcF(s));
        }

        public Builder setDescription(String s)
        {
            boolean flag;
            if (s.length() <= 1000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Session description cannot exceed %d characters", new Object[] {
                Integer.valueOf(1000)
            });
            zzakM = s;
            return this;
        }

        public Builder setEndTime(long l, TimeUnit timeunit)
        {
            boolean flag;
            if (l >= 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "End time should be positive.");
            zzajH = timeunit.toMillis(l);
            return this;
        }

        public Builder setIdentifier(String s)
        {
            boolean flag;
            if (s != null && TextUtils.getTrimmedLength(s) > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzV(flag);
            zzakL = s;
            return this;
        }

        public Builder setName(String s)
        {
            boolean flag;
            if (s.length() <= 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "Session name cannot exceed %d characters", new Object[] {
                Integer.valueOf(100)
            });
            mName = s;
            return this;
        }

        public Builder setStartTime(long l, TimeUnit timeunit)
        {
            boolean flag;
            if (l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zza(flag, "Start time should be positive.");
            zzKT = timeunit.toMillis(l);
            return this;
        }

        public Builder zzeo(int i)
        {
            zzajR = i;
            return this;
        }

        public Builder()
        {
            zzKT = 0L;
            zzajH = 0L;
            mName = null;
            zzajR = 4;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    public static final String EXTRA_SESSION = "vnd.google.fitness.session";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
    private final String mName;
    private final int zzCY;
    private final long zzKT;
    private final long zzajH;
    private final int zzajR;
    private final String zzakL;
    private final String zzakM;
    private final Long zzakN;
    private final Application zzake;

    Session(int i, long l, long l1, String s, String s1, 
            String s2, int j, Application application, Long long1)
    {
        zzCY = i;
        zzKT = l;
        zzajH = l1;
        mName = s;
        zzakL = s1;
        zzakM = s2;
        zzajR = j;
        zzake = application;
        zzakN = long1;
    }

    public Session(long l, long l1, String s, String s1, String s2, 
            int i, Application application, Long long1)
    {
        this(3, l, l1, s, s1, s2, i, application, long1);
    }

    private Session(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), com.google.android.gms.fitness.data.Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder));
    }


    public static Session extract(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return (Session)zzc.zza(intent, "vnd.google.fitness.session", CREATOR);
        }
    }

    public static String getMimeType(String s)
    {
        return (new StringBuilder()).append("vnd.google.fitness.session/").append(s).toString();
    }

    private boolean zza(Session session)
    {
        return zzKT == session.zzKT && zzajH == session.zzajH && zzt.equal(mName, session.mName) && zzt.equal(zzakL, session.zzakL) && zzt.equal(zzakM, session.zzakM) && zzt.equal(zzake, session.zzake) && zzajR == session.zzajR;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof Session) && zza((Session)obj);
    }

    public long getActiveTime(TimeUnit timeunit)
    {
        boolean flag;
        if (zzakN != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Active time is not set");
        return timeunit.convert(zzakN.longValue(), TimeUnit.MILLISECONDS);
    }

    public String getActivity()
    {
        return FitnessActivities.getName(zzajR);
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

    public String getDescription()
    {
        return zzakM;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzajH, TimeUnit.MILLISECONDS);
    }

    public String getIdentifier()
    {
        return zzakL;
    }

    public String getName()
    {
        return mName;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzKT, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public boolean hasActiveTime()
    {
        return zzakN != null;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Long.valueOf(zzKT), Long.valueOf(zzajH), zzakL
        });
    }

    public boolean isOngoing()
    {
        return zzajH == 0L;
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("startTime", Long.valueOf(zzKT)).zzg("endTime", Long.valueOf(zzajH)).zzg("name", mName).zzg("identifier", zzakL).zzg("description", zzakM).zzg("activity", Integer.valueOf(zzajR)).zzg("application", zzake).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.zza(this, parcel, i);
    }

    public long zzkt()
    {
        return zzKT;
    }

    public Application zzqB()
    {
        return zzake;
    }

    public Long zzqJ()
    {
        return zzakN;
    }

    public int zzqq()
    {
        return zzajR;
    }

    public long zzqs()
    {
        return zzajH;
    }

}
