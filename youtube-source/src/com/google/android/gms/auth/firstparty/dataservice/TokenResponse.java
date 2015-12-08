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
//            t

public class TokenResponse
    implements SafeParcelable
{

    public static final t CREATOR = new t();
    String accountName;
    String lV;
    String lX;
    CaptchaChallenge lY;
    String mO;
    String mT;
    String mp;
    String mq;
    String ne;
    String nf;
    String ng;
    boolean nh;
    boolean ni;
    boolean nj;
    boolean nk;
    List nl;
    boolean nm;
    final int version;

    public TokenResponse()
    {
        version = 1;
        nl = new ArrayList();
    }

    TokenResponse(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, boolean flag, boolean flag1, boolean flag2, boolean flag3, CaptchaChallenge captchachallenge, 
            List list, String s8, String s9, boolean flag4)
    {
        version = i;
        accountName = s;
        lV = s1;
        ne = s2;
        nf = s3;
        lX = s4;
        ng = s5;
        mp = s6;
        mq = s7;
        nh = flag;
        ni = flag1;
        nj = flag2;
        nk = flag3;
        lY = captchachallenge;
        nl = list;
        mT = s8;
        mO = s9;
        nm = flag4;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public CaptchaChallenge getCaptchaChallenge()
    {
        return lY;
    }

    public String getDetail()
    {
        return lX;
    }

    public String getFirstName()
    {
        return mp;
    }

    public String getLastName()
    {
        return mq;
    }

    public String getPicasaUser()
    {
        return ng;
    }

    public String getRopRevision()
    {
        return mO;
    }

    public String getRopText()
    {
        return mT;
    }

    public List getScopeData()
    {
        return Collections.unmodifiableList(nl);
    }

    public String getSignInUrl()
    {
        return nf;
    }

    public Status getStatus()
    {
        return Status.fromWireCode(lV);
    }

    public String getToken()
    {
        return ne;
    }

    public boolean isBrowserSignInSuggested()
    {
        return nk;
    }

    public boolean isEsMobileServiceEnabled()
    {
        return nj;
    }

    public boolean isGPlusServiceAllowed()
    {
        return nh;
    }

    public boolean isGPlusServiceEnabled()
    {
        return ni;
    }

    public boolean isTokenCached()
    {
        return nm;
    }

    public TokenResponse setAccountName(String s)
    {
        accountName = s;
        return this;
    }

    public TokenResponse setBrowserSignInSuggested(boolean flag)
    {
        nk = flag;
        return this;
    }

    public TokenResponse setCaptchaChallenge(CaptchaChallenge captchachallenge)
    {
        lY = captchachallenge;
        return this;
    }

    public TokenResponse setDetail(String s)
    {
        lX = s;
        return this;
    }

    public TokenResponse setEsMobileServiceEnabled(boolean flag)
    {
        nj = flag;
        return this;
    }

    public TokenResponse setFirstName(String s)
    {
        mp = s;
        return this;
    }

    public TokenResponse setGPlusServiceAllowed(boolean flag)
    {
        nh = flag;
        return this;
    }

    public TokenResponse setGPlusServiceEnabled(boolean flag)
    {
        ni = flag;
        return this;
    }

    public TokenResponse setIsTokenCached(boolean flag)
    {
        nm = flag;
        return this;
    }

    public TokenResponse setLastName(String s)
    {
        mq = s;
        return this;
    }

    public TokenResponse setPicasaUser(String s)
    {
        ng = s;
        return this;
    }

    public TokenResponse setRopRevision(String s)
    {
        mO = s;
        return this;
    }

    public TokenResponse setRopText(String s)
    {
        mT = s;
        return this;
    }

    public TokenResponse setScopeData(List list)
    {
        nl.clear();
        nl.addAll(list);
        return this;
    }

    public TokenResponse setSignInUrl(String s)
    {
        nf = s;
        return this;
    }

    public TokenResponse setStatus(Status status)
    {
        lV = ((Status)gi.a(status)).getWire();
        return this;
    }

    public TokenResponse setToken(String s)
    {
        ne = s;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        t.a(this, parcel, i);
    }

}
