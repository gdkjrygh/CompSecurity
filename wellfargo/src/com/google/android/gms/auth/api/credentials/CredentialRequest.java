// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            g, b, CredentialPickerConfig

public final class CredentialRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    final int a;
    private final boolean b;
    private final String c[];
    private final CredentialPickerConfig d;
    private final CredentialPickerConfig e;

    CredentialRequest(int i, boolean flag, String as[], CredentialPickerConfig credentialpickerconfig, CredentialPickerConfig credentialpickerconfig1)
    {
        a = i;
        b = flag;
        c = (String[])au.a(as);
        as = credentialpickerconfig;
        if (credentialpickerconfig == null)
        {
            as = (new b()).a();
        }
        d = as;
        as = credentialpickerconfig1;
        if (credentialpickerconfig1 == null)
        {
            as = (new b()).a();
        }
        e = as;
    }

    public boolean a()
    {
        return b;
    }

    public String[] b()
    {
        return c;
    }

    public CredentialPickerConfig c()
    {
        return d;
    }

    public CredentialPickerConfig d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(this, parcel, i);
    }

}
