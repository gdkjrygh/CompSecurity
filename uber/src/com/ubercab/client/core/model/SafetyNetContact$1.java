// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            SafetyNetContact

final class 
    implements android.os.SafetyNetContact._cls1
{

    public final SafetyNetContact createFromParcel(Parcel parcel)
    {
        return new SafetyNetContact(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final SafetyNetContact[] newArray(int i)
    {
        return new SafetyNetContact[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
