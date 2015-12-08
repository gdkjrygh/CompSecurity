// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.model;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.google.android.apps.ytremote.model:
//            StringId, e

public class ScreenId extends StringId
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();

    public ScreenId(String s)
    {
        super(s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(toString());
    }

}
