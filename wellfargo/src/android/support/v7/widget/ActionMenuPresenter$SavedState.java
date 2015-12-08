// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.widget:
//            i

class a
    implements Parcelable
{

    public static final android.os.ter.SavedState.a CREATOR = new i();
    public int a;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeInt(a);
    }


    ()
    {
    }

    (Parcel parcel)
    {
        a = parcel.readInt();
    }
}
