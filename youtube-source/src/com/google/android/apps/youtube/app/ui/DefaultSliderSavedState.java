// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bh

public class DefaultSliderSavedState extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new bh();
    public int expandedLayer;

    public DefaultSliderSavedState(Parcel parcel)
    {
        super(parcel);
        expandedLayer = -1;
        expandedLayer = parcel.readInt();
    }

    public DefaultSliderSavedState(Parcelable parcelable)
    {
        super(parcelable);
        expandedLayer = -1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(expandedLayer);
    }

}
