// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzoh, zzob, zzod

public final class zzoa
    implements zzoh
{

    private static final Uri zzaHN;
    private final LogPrinter zzaHO = new LogPrinter(4, "GA/LogCatTransport");

    public zzoa()
    {
    }

    public void zzb(zzob zzob1)
    {
        Object obj = new ArrayList(zzob1.zzxi());
        Collections.sort(((List) (obj)), new Comparator() {

            final zzoa zzaHP;

            public int compare(Object obj1, Object obj2)
            {
                return zza((zzod)obj1, (zzod)obj2);
            }

            public int zza(zzod zzod1, zzod zzod2)
            {
                return zzod1.getClass().getCanonicalName().compareTo(zzod2.getClass().getCanonicalName());
            }

            
            {
                zzaHP = zzoa.this;
                super();
            }
        });
        zzob1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((zzod)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (zzob1.length() != 0)
                {
                    zzob1.append(", ");
                }
                zzob1.append(s);
            }
        } while (true);
        zzaHO.println(zzob1.toString());
    }

    public Uri zzhs()
    {
        return zzaHN;
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        zzaHN = builder.build();
    }
}
