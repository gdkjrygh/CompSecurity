// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import com.google.android.apps.youtube.a.a.a.c;
import com.google.android.apps.youtube.common.e.j;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            SurveyQuestion

final class at
    implements android.os.Parcelable.Creator
{

    at()
    {
    }

    private static SurveyQuestion a(Parcel parcel)
    {
        try
        {
            parcel = new SurveyQuestion((c)j.b(parcel, new c()), null);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            return null;
        }
        return parcel;
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SurveyQuestion[i];
    }
}
