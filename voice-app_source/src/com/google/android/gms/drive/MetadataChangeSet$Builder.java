// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlq;
import java.util.Date;

// Referenced classes of package com.google.android.gms.drive:
//            MetadataChangeSet

public static class 
{

    private final MetadataBundle zzadt = MetadataBundle.zzpX();
    private com.google.android.gms.drive.metadata.internal..zza zzadu;

    private int zzcu(String s)
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return s.getBytes().length;
        }
    }

    private String zzj(String s, int i, int j)
    {
        return String.format("%s must be no more than %d bytes, but is %d bytes.", new Object[] {
            s, Integer.valueOf(i), Integer.valueOf(j)
        });
    }

    private void zzk(String s, int i, int j)
    {
        boolean flag;
        if (j <= i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, zzj(s, i, j));
    }

    private com.google.android.gms.drive.metadata.internal..zza zzpn()
    {
        if (zzadu == null)
        {
            zzadu = new com.google.android.gms.drive.metadata.internal..zza();
        }
        return zzadu;
    }

    public MetadataChangeSet build()
    {
        if (zzadu != null)
        {
            zzadt.zzb(zzlo.zzagM, zzadu.zzpU());
        }
        return new MetadataChangeSet(zzadt);
    }

    public  deleteCustomProperty(CustomPropertyKey custompropertykey)
    {
        zzu.zzb(custompropertykey, "key");
        zzpn().zza(custompropertykey, null);
        return this;
    }

    public  setCustomProperty(CustomPropertyKey custompropertykey, String s)
    {
        zzu.zzb(custompropertykey, "key");
        zzu.zzb(s, "value");
        zzk("The total size of key string and value string of a custom property", 124, zzcu(custompropertykey.getKey()) + zzcu(s));
        zzpn().zza(custompropertykey, s);
        return this;
    }

    public  setDescription(String s)
    {
        zzadt.zzb(zzlo.zzagN, s);
        return this;
    }

    public Bundle.zzb setIndexableText(String s)
    {
        zzk("Indexable text size", 0x20000, zzcu(s));
        zzadt.zzb(zzlo.zzagT, s);
        return this;
    }

    public Bundle.zzb setLastViewedByMeDate(Date date)
    {
        zzadt.zzb(zzlq.zzahz, date);
        return this;
    }

    public Bundle.zzb setMimeType(String s)
    {
        zzadt.zzb(zzlo.zzahg, s);
        return this;
    }

    public Bundle.zzb setPinned(boolean flag)
    {
        zzadt.zzb(zzlo.zzagY, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.zzb setStarred(boolean flag)
    {
        zzadt.zzb(zzlo.zzahn, Boolean.valueOf(flag));
        return this;
    }

    public Bundle.zzb setTitle(String s)
    {
        zzadt.zzb(zzlo.zzahp, s);
        return this;
    }

    public Bundle.zzb setViewed(boolean flag)
    {
        zzadt.zzb(zzlo.zzahf, Boolean.valueOf(flag));
        return this;
    }

    public ()
    {
    }
}
