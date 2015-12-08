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
//            zznu, zzno, zznq

public final class zznn
    implements zznu
{

    private static final Uri zzaDR;
    private final LogPrinter zzaDS = new LogPrinter(4, "GA/LogCatTransport");

    public zznn()
    {
    }

    public void zzb(zzno zzno1)
    {
        Object obj = new ArrayList(zzno1.zzvQ());
        Collections.sort(((List) (obj)), new Comparator() {

            final zznn zzaDT;

            public int compare(Object obj1, Object obj2)
            {
                return zza((zznq)obj1, (zznq)obj2);
            }

            public int zza(zznq zznq1, zznq zznq2)
            {
                return zznq1.getClass().getCanonicalName().compareTo(zznq2.getClass().getCanonicalName());
            }

            
            {
                zzaDT = zznn.this;
                super();
            }
        });
        zzno1 = new StringBuilder();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = ((zznq)((Iterator) (obj)).next()).toString();
            if (!TextUtils.isEmpty(s))
            {
                if (zzno1.length() != 0)
                {
                    zzno1.append(", ");
                }
                zzno1.append(s);
            }
        } while (true);
        zzaDS.println(zzno1.toString());
    }

    public Uri zzhe()
    {
        return zzaDR;
    }

    static 
    {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("local");
        zzaDR = builder.build();
    }
}
