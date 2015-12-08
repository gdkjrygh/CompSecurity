// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.geodata.items.ww;

import android.os.Parcel;
import android.os.Parcelable;
import com.wsi.android.framework.wxdata.controller.helpers.GeoDataUpdateListener;
import com.wsi.android.framework.wxdata.geodata.items.GeoDataCollection;

// Referenced classes of package com.wsi.android.framework.wxdata.geodata.items.ww:
//            WatchWarningBox

public class WatchWarningBoxCollection extends GeoDataCollection
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();

    public WatchWarningBoxCollection()
    {
    }

    private WatchWarningBoxCollection(Parcel parcel)
    {
        super(parcel.createTypedArrayList(WatchWarningBox.CREATOR), parcel.readLong());
        categoryFeatureId = parcel.readString();
    }

    WatchWarningBoxCollection(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public void notifyGeoDataUpdated(GeoDataUpdateListener geodataupdatelistener)
    {
        geodataupdatelistener.onUpdateWatchWarningBoxes(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedList(getData());
        parcel.writeLong(getLastPollingTime());
        parcel.writeString(getCategoryFeatureId());
    }


    /* member class not found */
    class _cls1 {}

}
