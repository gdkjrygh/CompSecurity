// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            AppVisibleCustomProperties, CustomProperty

public static class 
{

    private final Map zzagF = new HashMap();

    public  zza(CustomPropertyKey custompropertykey, String s)
    {
        zzu.zzb(custompropertykey, "key");
        zzagF.put(custompropertykey, new CustomProperty(custompropertykey, s));
        return this;
    }

    public AppVisibleCustomProperties zzpU()
    {
        return new AppVisibleCustomProperties(zzagF.values(), null);
    }

    public ()
    {
    }
}
