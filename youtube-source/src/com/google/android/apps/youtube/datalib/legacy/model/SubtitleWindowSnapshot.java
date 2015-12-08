// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            aj, SubtitleWindowSettings, ai

public final class SubtitleWindowSnapshot
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new aj((byte)0);
    public final String fullText;
    public final SubtitleWindowSettings settings;
    public final int snapshotTimeMillis;
    public final String text;
    public final int windowId;

    public SubtitleWindowSnapshot(int i, int j, String s, String s1, SubtitleWindowSettings subtitlewindowsettings)
    {
        windowId = i;
        snapshotTimeMillis = j;
        text = s;
        settings = subtitlewindowsettings;
        fullText = s1;
    }

    private SubtitleWindowSnapshot(Parcel parcel)
    {
        this(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (SubtitleWindowSettings)parcel.readParcelable(com/google/android/apps/youtube/datalib/legacy/model/SubtitleWindowSettings.getClassLoader()));
    }

    SubtitleWindowSnapshot(Parcel parcel, ai ai)
    {
        this(parcel);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return String.format("id: %d time: %d text: %s fullText: %s settings: %s", new Object[] {
            Integer.valueOf(windowId), Integer.valueOf(snapshotTimeMillis), text, fullText, settings.toString()
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(windowId);
        parcel.writeInt(snapshotTimeMillis);
        parcel.writeString(text);
        parcel.writeString(fullText);
        parcel.writeParcelable(settings, 0);
    }

}
