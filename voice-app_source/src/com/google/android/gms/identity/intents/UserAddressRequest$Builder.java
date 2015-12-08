// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.identity.intents:
//            UserAddressRequest

public final class <init>
{

    final UserAddressRequest zzawy;

    public <init> addAllowedCountrySpecification(CountrySpecification countryspecification)
    {
        if (zzawy.zzawx == null)
        {
            zzawy.zzawx = new ArrayList();
        }
        zzawy.zzawx.add(countryspecification);
        return this;
    }

    public zzawy addAllowedCountrySpecifications(Collection collection)
    {
        if (zzawy.zzawx == null)
        {
            zzawy.zzawx = new ArrayList();
        }
        zzawy.zzawx.addAll(collection);
        return this;
    }

    public UserAddressRequest build()
    {
        if (zzawy.zzawx != null)
        {
            zzawy.zzawx = Collections.unmodifiableList(zzawy.zzawx);
        }
        return zzawy;
    }

    private (UserAddressRequest useraddressrequest)
    {
        zzawy = useraddressrequest;
        super();
    }

    zzawy(UserAddressRequest useraddressrequest, zzawy zzawy1)
    {
        this(useraddressrequest);
    }
}
