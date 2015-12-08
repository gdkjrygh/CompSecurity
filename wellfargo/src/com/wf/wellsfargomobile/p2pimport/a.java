// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.p2pimport;

import android.os.Parcel;

// Referenced classes of package com.wf.wellsfargomobile.p2pimport:
//            P2PContact

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public P2PContact a(Parcel parcel)
    {
        return new P2PContact(parcel);
    }

    public P2PContact[] a(int i)
    {
        return new P2PContact[i];
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
