// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class zza
{

    public zza()
    {
    }

    static List zzf(Collection collection)
    {
        if (collection == null || collection.isEmpty())
        {
            return Collections.emptyList();
        } else
        {
            return new ArrayList(collection);
        }
    }

    static Set zzl(List list)
    {
        if (list == null || list.isEmpty())
        {
            return Collections.emptySet();
        } else
        {
            return Collections.unmodifiableSet(new HashSet(list));
        }
    }

    public abstract Set getPlaceIds();

    public boolean isRestrictedToPlacesOpenNow()
    {
        return false;
    }
}
