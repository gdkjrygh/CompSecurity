// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState

class rveyState
    implements android.os.tate.DisplayState._cls1
{

    public rveyState createFromParcel(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState.getClassLoader());
        bundle.readFromParcel(parcel);
        parcel = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
        bundle = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
        if ("InAppNotificationState".equals(parcel))
        {
            return new AppNotificationState(bundle, null);
        }
        if ("SurveyState".equals(parcel))
        {
            return new rveyState(bundle, null);
        } else
        {
            throw new RuntimeException((new StringBuilder("Unrecognized display state type ")).append(parcel).toString());
        }
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public createFromParcel[] newArray(int i)
    {
        return new createFromParcel[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    rveyState()
    {
    }
}
