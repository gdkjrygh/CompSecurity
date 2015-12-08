// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.geodata.helpers;

import android.os.Parcel;
import android.os.Parcelable;

public class RemoteDownloadingResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final int RESULT_FAILURE = 1;
    public static final int RESULT_OK = 0;
    private String additionalData;
    private Throwable error;
    private int resultId;

    public RemoteDownloadingResult(int i, String s)
    {
        resultId = i;
        additionalData = s;
    }

    public RemoteDownloadingResult(int i, Throwable throwable)
    {
        resultId = i;
        error = throwable;
    }

    private RemoteDownloadingResult(Parcel parcel)
    {
        resultId = parcel.readInt();
        additionalData = parcel.readString();
        error = (Throwable)parcel.readSerializable();
    }

    RemoteDownloadingResult(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public Throwable getError()
    {
        return error;
    }

    public int getResultId()
    {
        return resultId;
    }

    public String getaAdditionalData()
    {
        return additionalData;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(resultId);
        parcel.writeString(additionalData);
        parcel.writeSerializable(error);
    }


    /* member class not found */
    class _cls1 {}

}
