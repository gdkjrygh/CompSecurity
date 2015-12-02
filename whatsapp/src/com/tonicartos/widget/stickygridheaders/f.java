// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.os.Parcel;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            n

final class f
    implements android.os.Parcelable.Creator
{

    f()
    {
    }

    public n a(Parcel parcel)
    {
        return new n(parcel, null);
    }

    public n[] a(int i)
    {
        return new n[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
