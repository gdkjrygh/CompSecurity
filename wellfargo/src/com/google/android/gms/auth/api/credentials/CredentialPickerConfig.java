// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            f, b, a

public final class CredentialPickerConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    final int a;
    private final boolean b;
    private final boolean c;

    CredentialPickerConfig(int i, boolean flag, boolean flag1)
    {
        a = i;
        b = flag;
        c = flag1;
    }

    private CredentialPickerConfig(b b1)
    {
        this(1, com.google.android.gms.auth.api.credentials.b.a(b1), com.google.android.gms.auth.api.credentials.b.b(b1));
    }

    CredentialPickerConfig(b b1, a a1)
    {
        this(b1);
    }

    public boolean a()
    {
        return b;
    }

    public boolean b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
