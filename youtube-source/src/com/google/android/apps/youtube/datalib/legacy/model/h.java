// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int i = parcel.readInt();
        Uri uri = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        String s = parcel.readString();
        ArrayList arraylist = new ArrayList();
        parcel.readTypedList(arraylist, Uri.CREATOR);
        return new InfoCard.InfoCardAction(i, uri, s, Collections.unmodifiableList(arraylist));
    }

    public final volatile Object[] newArray(int i)
    {
        return new InfoCard.InfoCardAction[i];
    }
}
