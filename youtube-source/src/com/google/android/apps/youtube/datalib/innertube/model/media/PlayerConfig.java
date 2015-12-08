// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.a.a.a.a.ep;
import com.google.a.a.a.a.nh;
import com.google.android.apps.youtube.a.a.f;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.protobuf.micro.a;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.media:
//            h, i

public class PlayerConfig
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final ExoPlayerActivationType exoPlayerActivationType;
    private final nh innertubePlayerConfigProto;

    public PlayerConfig()
    {
        this(new nh(), ExoPlayerActivationType.SERVER_EXPERIMENT);
    }

    public PlayerConfig(nh nh1, ExoPlayerActivationType exoplayeractivationtype)
    {
        innertubePlayerConfigProto = (nh)c.a(nh1);
        exoPlayerActivationType = (ExoPlayerActivationType)c.a(exoplayeractivationtype);
    }

    public PlayerConfig(f f1)
    {
        innertubePlayerConfigProto = new nh();
        if (f1.b())
        {
            byte abyte0[] = f1.a().b();
            try
            {
                com.google.protobuf.nano.c.a(innertubePlayerConfigProto, abyte0);
            }
            catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception) { }
        }
        if (f1.d())
        {
            f1 = ExoPlayerActivationType.valueOf(f1.c());
        } else
        {
            f1 = ExoPlayerActivationType.SERVER_EXPERIMENT;
        }
        exoPlayerActivationType = f1;
    }

    public float bandwidthFraction()
    {
        float f1;
        if (innertubePlayerConfigProto.f != null)
        {
            f1 = innertubePlayerConfigProto.f.l;
        } else
        {
            f1 = 0.0F;
        }
        if (f1 != 0.0F)
        {
            return f1;
        } else
        {
            return 0.75F;
        }
    }

    public int bufferChunkSizeKb()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.m;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 64;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass().equals(obj.getClass()))
        {
            obj = (PlayerConfig)obj;
            if (com.google.protobuf.nano.c.a(innertubePlayerConfigProto, ((PlayerConfig) (obj)).innertubePlayerConfigProto) && b.a(exoPlayerActivationType, ((PlayerConfig) (obj)).exoPlayerActivationType))
            {
                return true;
            }
        }
        return false;
    }

    public float highPoolLoad()
    {
        float f1;
        if (innertubePlayerConfigProto.f != null)
        {
            f1 = innertubePlayerConfigProto.f.k;
        } else
        {
            f1 = 0.0F;
        }
        if (f1 != 0.0F)
        {
            return f1;
        } else
        {
            return 0.8F;
        }
    }

    public int highWatermarkMs()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.i;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 30000;
        }
    }

    public int httpConnectTimeoutMs()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.n;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 8000;
        }
    }

    public int httpReadTimeoutMs()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.o;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 8000;
        }
    }

    public boolean isAdaptiveBitrateEnabled()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (com.google.android.apps.youtube.datalib.innertube.model.media.i.a[exoPlayerActivationType.ordinal()])
        {
        default:
            if (innertubePlayerConfigProto.f != null && innertubePlayerConfigProto.f.c)
            {
                return true;
            }
            break;

        case 3: // '\003'
            return true;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean isExoPlayerEnabled()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (com.google.android.apps.youtube.datalib.innertube.model.media.i.a[exoPlayerActivationType.ordinal()])
        {
        default:
            if (innertubePlayerConfigProto.f != null && innertubePlayerConfigProto.f.b)
            {
                return true;
            }
            break;

        case 2: // '\002'
        case 3: // '\003'
            return true;

        case 1: // '\001'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public float lowPoolLoad()
    {
        float f1;
        if (innertubePlayerConfigProto.f != null)
        {
            f1 = innertubePlayerConfigProto.f.j;
        } else
        {
            f1 = 0.0F;
        }
        if (f1 != 0.0F)
        {
            return f1;
        } else
        {
            return 0.2F;
        }
    }

    public int lowWatermarkMs()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.h;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 15000;
        }
    }

    public int maxDurationForQualityDecreaseMs()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.f;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 25000;
        }
    }

    public int maxInitialByteRate()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.d;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 0x186a0;
        }
    }

    public int minBufferMs()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.r;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 500;
        }
    }

    public int minDurationForQualityIncreaseMs()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.e;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 10000;
        }
    }

    public int minDurationToRetainAfterDiscardMs()
    {
        int k;
        if (innertubePlayerConfigProto.f != null)
        {
            k = innertubePlayerConfigProto.f.g;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            return k;
        } else
        {
            return 25000;
        }
    }

    public f toPlayerConfigProto()
    {
        f f1 = new f();
        f1.a(a.a(com.google.protobuf.nano.c.a(innertubePlayerConfigProto)));
        f1.a(exoPlayerActivationType.toString());
        return f1;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        j.a(parcel, toPlayerConfigProto());
    }


    private class ExoPlayerActivationType extends Enum
    {

        private static final ExoPlayerActivationType $VALUES[];
        public static final ExoPlayerActivationType ADAPTIVE;
        public static final ExoPlayerActivationType NON_ADAPTIVE;
        public static final ExoPlayerActivationType OFF;
        public static final String PREFERENCES_KEY = "ExoPlayer";
        public static final ExoPlayerActivationType SERVER_EXPERIMENT;

        public static ExoPlayerActivationType getDefaultValue(boolean flag)
        {
            if (flag)
            {
                return NON_ADAPTIVE;
            } else
            {
                return SERVER_EXPERIMENT;
            }
        }

        public static ExoPlayerActivationType valueOf(String s)
        {
            return (ExoPlayerActivationType)Enum.valueOf(com/google/android/apps/youtube/datalib/innertube/model/media/PlayerConfig$ExoPlayerActivationType, s);
        }

        public static ExoPlayerActivationType[] values()
        {
            return (ExoPlayerActivationType[])$VALUES.clone();
        }

        static 
        {
            OFF = new ExoPlayerActivationType("OFF", 0);
            NON_ADAPTIVE = new ExoPlayerActivationType("NON_ADAPTIVE", 1);
            ADAPTIVE = new ExoPlayerActivationType("ADAPTIVE", 2);
            SERVER_EXPERIMENT = new ExoPlayerActivationType("SERVER_EXPERIMENT", 3);
            $VALUES = (new ExoPlayerActivationType[] {
                OFF, NON_ADAPTIVE, ADAPTIVE, SERVER_EXPERIMENT
            });
        }

        private ExoPlayerActivationType(String s, int k)
        {
            super(s, k);
        }
    }

}
