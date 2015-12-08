// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            c

public class GoogleSignInConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    private final ArrayList b;

    public GoogleSignInConfig()
    {
        this(1, new ArrayList());
    }

    GoogleSignInConfig(int i, ArrayList arraylist)
    {
        a = i;
        b = arraylist;
    }

    public ArrayList a()
    {
        return new ArrayList(b);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
