// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.signin:
//            a

public class GoogleSignInAccount
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Uri f;

    GoogleSignInAccount(int i, String s, String s1, String s2, String s3, Uri uri)
    {
        a = i;
        b = au.a(s);
        c = s1;
        d = s2;
        e = s3;
        f = uri;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return d;
    }

    public String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.signin.a.a(this, parcel, i);
    }

}
