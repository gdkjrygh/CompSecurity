// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness;

import android.content.Intent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzmx;
import com.google.android.gms.internal.zzmz;
import com.google.android.gms.internal.zzna;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zznc;
import com.google.android.gms.internal.zznd;
import com.google.android.gms.internal.zzne;
import com.google.android.gms.internal.zznf;
import com.google.android.gms.internal.zznh;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness:
//            BleApi, ConfigApi, HistoryApi, RecordingApi, 
//            SensorsApi, SessionsApi

public class Fitness
{

    public static final String ACTION_TRACK = "vnd.google.fitness.TRACK";
    public static final String ACTION_VIEW = "vnd.google.fitness.VIEW";
    public static final String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";
    public static final Void API = null;
    public static final Api BLE_API;
    public static final BleApi BleApi = zzqo();
    public static final Api CONFIG_API;
    public static final ConfigApi ConfigApi = new zzna();
    public static final String EXTRA_END_TIME = "vnd.google.fitness.end_time";
    public static final String EXTRA_START_TIME = "vnd.google.fitness.start_time";
    public static final Api HISTORY_API;
    public static final HistoryApi HistoryApi = new zznb();
    public static final Api RECORDING_API;
    public static final RecordingApi RecordingApi = new zznd();
    public static final Scope SCOPE_ACTIVITY_READ = new Scope("https://www.googleapis.com/auth/fitness.activity.read");
    public static final Scope SCOPE_ACTIVITY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.activity.write");
    public static final Scope SCOPE_BODY_READ = new Scope("https://www.googleapis.com/auth/fitness.body.read");
    public static final Scope SCOPE_BODY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.body.write");
    public static final Scope SCOPE_LOCATION_READ = new Scope("https://www.googleapis.com/auth/fitness.location.read");
    public static final Scope SCOPE_LOCATION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.location.write");
    public static final Scope SCOPE_NUTRITION_READ = new Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
    public static final Scope SCOPE_NUTRITION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
    public static final Api SENSORS_API;
    public static final Api SESSIONS_API;
    public static final SensorsApi SensorsApi = new zzne();
    public static final SessionsApi SessionsApi = new zznf();
    public static final Api zzada;
    public static final com.google.android.gms.common.api.Api.ClientKey zzajA;
    public static final com.google.android.gms.common.api.Api.ClientKey zzajB;
    public static final com.google.android.gms.common.api.Api.ClientKey zzajC;
    public static final zzmx zzajD = new zznc();
    public static final com.google.android.gms.common.api.Api.ClientKey zzajw;
    public static final com.google.android.gms.common.api.Api.ClientKey zzajx;
    public static final com.google.android.gms.common.api.Api.ClientKey zzajy;
    public static final com.google.android.gms.common.api.Api.ClientKey zzajz;

    private Fitness()
    {
    }

    public static long getEndTime(Intent intent, TimeUnit timeunit)
    {
        long l = intent.getLongExtra("vnd.google.fitness.end_time", -1L);
        if (l == -1L)
        {
            return -1L;
        } else
        {
            return timeunit.convert(l, TimeUnit.MILLISECONDS);
        }
    }

    public static long getStartTime(Intent intent, TimeUnit timeunit)
    {
        long l = intent.getLongExtra("vnd.google.fitness.start_time", -1L);
        if (l == -1L)
        {
            return -1L;
        } else
        {
            return timeunit.convert(l, TimeUnit.MILLISECONDS);
        }
    }

    private static BleApi zzqo()
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return new zzmz();
        } else
        {
            return new zznh();
        }
    }

    static 
    {
        zzajw = new com.google.android.gms.common.api.Api.ClientKey();
        zzajx = new com.google.android.gms.common.api.Api.ClientKey();
        zzajy = new com.google.android.gms.common.api.Api.ClientKey();
        zzajz = new com.google.android.gms.common.api.Api.ClientKey();
        zzajA = new com.google.android.gms.common.api.Api.ClientKey();
        zzajB = new com.google.android.gms.common.api.Api.ClientKey();
        zzajC = new com.google.android.gms.common.api.Api.ClientKey();
        SENSORS_API = new Api("Fitness.SENSORS_API", new com.google.android.gms.internal.zzmc.zzb(), zzajB, new Scope[0]);
        RECORDING_API = new Api("Fitness.RECORDING_API", new com.google.android.gms.internal.zzmb.zzb(), zzajA, new Scope[0]);
        SESSIONS_API = new Api("Fitness.SESSIONS_API", new com.google.android.gms.internal.zzmd.zzb(), zzajC, new Scope[0]);
        HISTORY_API = new Api("Fitness.HISTORY_API", new com.google.android.gms.internal.zzlz.zzb(), zzajy, new Scope[0]);
        CONFIG_API = new Api("Fitness.CONFIG_API", new com.google.android.gms.internal.zzly.zzb(), zzajx, new Scope[0]);
        BLE_API = new Api("Fitness.BLE_API", new com.google.android.gms.internal.zzlx.zzb(), zzajw, new Scope[0]);
        zzada = new Api("Fitness.INTERNAL_API", new com.google.android.gms.internal.zzma.zza(), zzajz, new Scope[0]);
    }
}
