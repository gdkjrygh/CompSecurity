// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState

class 
    implements android.os.ayState.AnswerMap._cls1
{

    public  createFromParcel(Parcel parcel)
    {
        Bundle bundle = new Bundle(com/mixpanel/android/mpmetrics/UpdateDisplayState$AnswerMap.getClassLoader());
          = new nit>();
        bundle.readFromParcel(parcel);
        parcel = bundle.keySet().iterator();
        do
        {
            if (!parcel.hasNext())
            {
                return ;
            }
            String s = (String)parcel.next();
            .t(Integer.valueOf(s), bundle.getString(s));
        } while (true);
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

    ()
    {
    }
}
