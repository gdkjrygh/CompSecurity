// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zza, CustomProperty

public final class AppVisibleCustomProperties
    implements SafeParcelable, Iterable
{
    public static class zza
    {

        private final Map zzagF = new HashMap();

        public zza zza(CustomPropertyKey custompropertykey, String s)
        {
            zzu.zzb(custompropertykey, "key");
            zzagF.put(custompropertykey, new CustomProperty(custompropertykey, s));
            return this;
        }

        public AppVisibleCustomProperties zzpU()
        {
            return new AppVisibleCustomProperties(zzagF.values());
        }

        public zza()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.drive.metadata.internal.zza();
    public static final AppVisibleCustomProperties zzagD = (new zza()).zzpU();
    final int zzCY;
    final List zzagE;

    AppVisibleCustomProperties(int i, Collection collection)
    {
        zzCY = i;
        zzu.zzu(collection);
        zzagE = new ArrayList(collection);
    }

    private AppVisibleCustomProperties(Collection collection)
    {
        this(1, collection);
    }


    public int describeContents()
    {
        return 0;
    }

    public Iterator iterator()
    {
        return zzagE.iterator();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.drive.metadata.internal.zza.zza(this, parcel, i);
    }

    public Map zzpT()
    {
        HashMap hashmap = new HashMap(zzagE.size());
        CustomProperty customproperty;
        for (Iterator iterator1 = zzagE.iterator(); iterator1.hasNext(); hashmap.put(customproperty.zzpV(), customproperty.getValue()))
        {
            customproperty = (CustomProperty)iterator1.next();
        }

        return Collections.unmodifiableMap(hashmap);
    }

}
