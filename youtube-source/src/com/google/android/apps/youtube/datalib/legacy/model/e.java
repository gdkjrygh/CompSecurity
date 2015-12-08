// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            InfoCard

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = parcel.readInt();
        Object obj = new ArrayList();
        parcel.readTypedList(((java.util.List) (obj)), InfoCard.InfoCardAction.CREATOR);
        obj = Collections.unmodifiableList(((java.util.List) (obj)));
        ArrayList arraylist = new ArrayList();
        parcel.readTypedList(arraylist, InfoCard.InfoCardTrackingEvent.CREATOR);
        return new InfoCard(i, ((java.util.List) (obj)), Collections.unmodifiableList(arraylist), (InfoCard.InfoCardApp)parcel.readParcelable(com/google/android/apps/youtube/datalib/legacy/model/InfoCard$InfoCardApp.getClassLoader()), null);
    }

    public final volatile Object[] newArray(int i)
    {
        return new InfoCard[i];
    }
}
