// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            b

public class SetupAccountWorkflowRequest
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    public final AppDescription callingAppDescription;
    Bundle mI;
    boolean np;
    boolean nq;
    List nr;
    final int version;

    SetupAccountWorkflowRequest(int i, boolean flag, boolean flag1, List list, Bundle bundle, AppDescription appdescription)
    {
        version = i;
        np = flag;
        nq = flag1;
        nr = list;
        mI = bundle;
        callingAppDescription = (AppDescription)gi.a(appdescription);
    }

    public SetupAccountWorkflowRequest(AppDescription appdescription)
    {
        version = 1;
        mI = new Bundle();
        callingAppDescription = appdescription;
    }

    public int describeContents()
    {
        return 0;
    }

    public List getAllowedDomains()
    {
        return Collections.unmodifiableList(nr);
    }

    public Bundle getOptions()
    {
        return new Bundle(mI);
    }

    public boolean isBackupAccount()
    {
        return nq;
    }

    public boolean isMultiUser()
    {
        return np;
    }

    public SetupAccountWorkflowRequest setAllowedDomains(Collection collection)
    {
        if (collection != null)
        {
            nr = new ArrayList(collection);
            return this;
        } else
        {
            nr = null;
            return this;
        }
    }

    public SetupAccountWorkflowRequest setBackupAccount(boolean flag)
    {
        nq = flag;
        return this;
    }

    public SetupAccountWorkflowRequest setMultiUser(boolean flag)
    {
        np = flag;
        return this;
    }

    public SetupAccountWorkflowRequest setOptions(Bundle bundle)
    {
        mI.clear();
        mI.putAll(bundle);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
