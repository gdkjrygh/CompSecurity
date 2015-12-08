// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlq;
import com.google.android.gms.internal.zzls;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzl

public final class zze
{

    private static final Map zzagH = new HashMap();

    public static void zzb(DataHolder dataholder)
    {
        zzlo.zzahl.zzd(dataholder);
    }

    private static void zzb(MetadataField metadatafield)
    {
        if (zzagH.containsKey(metadatafield.getName()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate field name registered: ").append(metadatafield.getName()).toString());
        } else
        {
            zzagH.put(metadatafield.getName(), metadatafield);
            return;
        }
    }

    public static MetadataField zzcw(String s)
    {
        return (MetadataField)zzagH.get(s);
    }

    public static Collection zzpW()
    {
        return Collections.unmodifiableCollection(zzagH.values());
    }

    static 
    {
        zzb(zzlo.zzagK);
        zzb(zzlo.zzahp);
        zzb(zzlo.zzahg);
        zzb(zzlo.zzahn);
        zzb(zzlo.zzahq);
        zzb(zzlo.zzagX);
        zzb(zzlo.zzagW);
        zzb(zzlo.zzagY);
        zzb(zzlo.zzagZ);
        zzb(zzlo.zzagU);
        zzb(zzlo.zzahb);
        zzb(zzlo.zzahc);
        zzb(zzlo.zzahd);
        zzb(zzlo.zzahl);
        zzb(zzlo.zzagL);
        zzb(zzlo.zzahi);
        zzb(zzlo.zzagN);
        zzb(zzlo.zzagV);
        zzb(zzlo.zzagO);
        zzb(zzlo.zzagP);
        zzb(zzlo.zzagQ);
        zzb(zzlo.zzagR);
        zzb(zzlo.zzahf);
        zzb(zzlo.zzaha);
        zzb(zzlo.zzahh);
        zzb(zzlo.zzahj);
        zzb(zzlo.zzahk);
        zzb(zzlo.zzahm);
        zzb(zzlo.zzahr);
        zzb(zzlo.zzahs);
        zzb(zzlo.zzagT);
        zzb(zzlo.zzagS);
        zzb(zzlo.zzaho);
        zzb(zzlo.zzahe);
        zzb(zzlo.zzagM);
        zzb(zzlo.zzaht);
        zzb(zzlo.zzahu);
        zzb(zzlo.zzahv);
        zzb(zzlo.zzahw);
        zzb(zzlo.zzahx);
        zzb(zzlq.zzahy);
        zzb(zzlq.zzahA);
        zzb(zzlq.zzahB);
        zzb(zzlq.zzahC);
        zzb(zzlq.zzahz);
        zzb(zzls.zzahE);
        zzb(zzls.zzahF);
    }
}
