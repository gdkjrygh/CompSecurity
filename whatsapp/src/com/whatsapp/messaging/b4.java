// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;

// Referenced classes of package com.whatsapp.messaging:
//            br

final class b4
    implements android.os.Parcelable.Creator
{

    b4()
    {
    }

    public br a(Parcel parcel)
    {
        return new br(parcel, null);
    }

    public br[] a(int i)
    {
        return new br[i];
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
