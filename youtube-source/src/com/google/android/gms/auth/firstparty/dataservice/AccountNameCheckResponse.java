// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            b

public class AccountNameCheckResponse
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    String lV;
    List lW;
    String lX;
    CaptchaChallenge lY;
    final int version;

    AccountNameCheckResponse(int i, String s, List list, String s1, CaptchaChallenge captchachallenge)
    {
        version = i;
        lV = s;
        lW = list;
        lX = s1;
        lY = captchachallenge;
    }

    public AccountNameCheckResponse(Status status)
    {
        this(status, Collections.EMPTY_LIST);
    }

    public AccountNameCheckResponse(Status status, String s, CaptchaChallenge captchachallenge, List list)
    {
        version = 1;
        lV = ((Status)gi.a(status)).getWire();
        lX = s;
        lY = captchachallenge;
        lW = Collections.unmodifiableList(new ArrayList(list));
    }

    public AccountNameCheckResponse(Status status, String s, List list)
    {
        this(status, s, null, list);
    }

    public AccountNameCheckResponse(Status status, List list)
    {
        this(status, null, list);
    }

    public int describeContents()
    {
        return 0;
    }

    public List getAccountNameSuggestions()
    {
        return lW;
    }

    public CaptchaChallenge getCaptchaChallenge()
    {
        return lY;
    }

    public String getDetail()
    {
        return lX;
    }

    public Status getStatus()
    {
        return Status.fromWireCode(lV);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
