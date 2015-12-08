// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            w

public class WebSetupConfigRequest
    implements SafeParcelable
{

    public static final w CREATOR = new w();
    public final AppDescription callingAppDescription;
    final int version;

    WebSetupConfigRequest(int i, AppDescription appdescription)
    {
        version = i;
        callingAppDescription = (AppDescription)gi.a(appdescription);
    }

    public WebSetupConfigRequest(AppDescription appdescription)
    {
        this(1, appdescription);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        w.a(this, parcel, i);
    }

}
