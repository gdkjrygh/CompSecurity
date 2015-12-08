// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionResultCreator, DetectedActivity

public class ActivityRecognitionResult
    implements SafeParcelable
{

    public static final ActivityRecognitionResultCreator CREATOR = new ActivityRecognitionResultCreator();
    private final int zzCY;
    List zzaxr;
    long zzaxs;
    long zzaxt;
    int zzaxu;

    public ActivityRecognitionResult(int i, List list, long l, long l1, int j)
    {
        zzCY = i;
        zzaxr = list;
        zzaxs = l;
        zzaxt = l1;
        zzaxu = j;
    }

    public ActivityRecognitionResult(DetectedActivity detectedactivity, long l, long l1)
    {
        this(detectedactivity, l, l1, 0);
    }

    public ActivityRecognitionResult(DetectedActivity detectedactivity, long l, long l1, int i)
    {
        this(Collections.singletonList(detectedactivity), l, l1, i);
    }

    public ActivityRecognitionResult(List list, long l, long l1)
    {
        this(list, l, l1, 0);
    }

    public ActivityRecognitionResult(List list, long l, long l1, int i)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Must have at least 1 detected activity");
        if (l > 0L && l1 > 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, "Must set times");
        zzCY = 2;
        zzaxr = list;
        zzaxs = l;
        zzaxt = l1;
        zzaxu = i;
    }

    public static ActivityRecognitionResult extractResult(Intent intent)
    {
        if (!hasResult(intent))
        {
            return null;
        }
        intent = ((Intent) (intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")));
        if (intent instanceof byte[])
        {
            Parcel parcel = Parcel.obtain();
            parcel.unmarshall((byte[])(byte[])intent, 0, ((byte[])(byte[])intent).length);
            parcel.setDataPosition(0);
            return CREATOR.createFromParcel(parcel);
        }
        if (intent instanceof ActivityRecognitionResult)
        {
            return (ActivityRecognitionResult)intent;
        } else
        {
            return null;
        }
    }

    public static boolean hasResult(Intent intent)
    {
        if (intent == null)
        {
            return false;
        } else
        {
            return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getActivityConfidence(int i)
    {
        for (Iterator iterator = zzaxr.iterator(); iterator.hasNext();)
        {
            DetectedActivity detectedactivity = (DetectedActivity)iterator.next();
            if (detectedactivity.getType() == i)
            {
                return detectedactivity.getConfidence();
            }
        }

        return 0;
    }

    public long getElapsedRealtimeMillis()
    {
        return zzaxt;
    }

    public DetectedActivity getMostProbableActivity()
    {
        return (DetectedActivity)zzaxr.get(0);
    }

    public List getProbableActivities()
    {
        return zzaxr;
    }

    public long getTime()
    {
        return zzaxs;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityRecognitionResult [probableActivities=").append(zzaxr).append(", timeMillis=").append(zzaxs).append(", elapsedRealtimeMillis=").append(zzaxt).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ActivityRecognitionResultCreator.zza(this, parcel, i);
    }

}
