// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlq;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public final class MetadataChangeSet
{
    public static class Builder
    {

        private final MetadataBundle zzadt = MetadataBundle.zzpX();
        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zzadu;

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

        private com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza zzpn()
        {
            if (zzadu == null)
            {
                zzadu = new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza();
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

        public Builder deleteCustomProperty(CustomPropertyKey custompropertykey)
        {
            zzu.zzb(custompropertykey, "key");
            zzpn().zza(custompropertykey, null);
            return this;
        }

        public Builder setCustomProperty(CustomPropertyKey custompropertykey, String s)
        {
            zzu.zzb(custompropertykey, "key");
            zzu.zzb(s, "value");
            zzk("The total size of key string and value string of a custom property", 124, zzcu(custompropertykey.getKey()) + zzcu(s));
            zzpn().zza(custompropertykey, s);
            return this;
        }

        public Builder setDescription(String s)
        {
            zzadt.zzb(zzlo.zzagN, s);
            return this;
        }

        public Builder setIndexableText(String s)
        {
            zzk("Indexable text size", 0x20000, zzcu(s));
            zzadt.zzb(zzlo.zzagT, s);
            return this;
        }

        public Builder setLastViewedByMeDate(Date date)
        {
            zzadt.zzb(zzlq.zzahz, date);
            return this;
        }

        public Builder setMimeType(String s)
        {
            zzadt.zzb(zzlo.zzahg, s);
            return this;
        }

        public Builder setPinned(boolean flag)
        {
            zzadt.zzb(zzlo.zzagY, Boolean.valueOf(flag));
            return this;
        }

        public Builder setStarred(boolean flag)
        {
            zzadt.zzb(zzlo.zzahn, Boolean.valueOf(flag));
            return this;
        }

        public Builder setTitle(String s)
        {
            zzadt.zzb(zzlo.zzahp, s);
            return this;
        }

        public Builder setViewed(boolean flag)
        {
            zzadt.zzb(zzlo.zzahf, Boolean.valueOf(flag));
            return this;
        }

        public Builder()
        {
        }
    }


    public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
    public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 0x20000;
    public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
    public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
    public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;
    public static final MetadataChangeSet zzads = new MetadataChangeSet(MetadataBundle.zzpX());
    private final MetadataBundle zzadt;

    public MetadataChangeSet(MetadataBundle metadatabundle)
    {
        zzadt = MetadataBundle.zza(metadatabundle);
    }

    public Map getCustomPropertyChangeMap()
    {
        AppVisibleCustomProperties appvisiblecustomproperties = (AppVisibleCustomProperties)zzadt.zza(zzlo.zzagM);
        if (appvisiblecustomproperties == null)
        {
            return Collections.emptyMap();
        } else
        {
            return appvisiblecustomproperties.zzpT();
        }
    }

    public String getDescription()
    {
        return (String)zzadt.zza(zzlo.zzagN);
    }

    public String getIndexableText()
    {
        return (String)zzadt.zza(zzlo.zzagT);
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)zzadt.zza(zzlq.zzahz);
    }

    public String getMimeType()
    {
        return (String)zzadt.zza(zzlo.zzahg);
    }

    public String getTitle()
    {
        return (String)zzadt.zza(zzlo.zzahp);
    }

    public Boolean isPinned()
    {
        return (Boolean)zzadt.zza(zzlo.zzagY);
    }

    public Boolean isStarred()
    {
        return (Boolean)zzadt.zza(zzlo.zzahn);
    }

    public Boolean isViewed()
    {
        return (Boolean)zzadt.zza(zzlo.zzahf);
    }

    public MetadataBundle zzpm()
    {
        return zzadt;
    }

}
