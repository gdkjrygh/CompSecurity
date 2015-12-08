// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            c, Status

public class CaptchaChallenge
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    String lV;
    Bitmap nC;
    String ne;
    final int version;

    CaptchaChallenge(int i, String s, String s1, Bitmap bitmap)
    {
        version = i;
        lV = s;
        ne = s1;
        nC = bitmap;
    }

    public CaptchaChallenge(Status status)
    {
        this(status, null, null);
    }

    public CaptchaChallenge(Status status, String s, Bitmap bitmap)
    {
        version = 1;
        lV = ((Status)gi.a(status)).getWire();
        ne = s;
        nC = bitmap;
    }

    public int describeContents()
    {
        return 0;
    }

    public Bitmap getCaptcha()
    {
        return nC;
    }

    public String getCaptchaToken()
    {
        return ne;
    }

    public Status getStatus()
    {
        return Status.fromWireCode(lV);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
