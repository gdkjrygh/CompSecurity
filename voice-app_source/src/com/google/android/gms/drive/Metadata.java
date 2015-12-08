// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.zzlo;
import com.google.android.gms.internal.zzlq;
import com.google.android.gms.internal.zzls;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive:
//            DriveId

public abstract class Metadata
    implements Freezable
{

    public static final int CONTENT_AVAILABLE_LOCALLY = 1;
    public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;

    public Metadata()
    {
    }

    public String getAlternateLink()
    {
        return (String)zza(zzlo.zzagL);
    }

    public int getContentAvailability()
    {
        Integer integer = (Integer)zza(zzls.zzahE);
        if (integer == null)
        {
            return 0;
        } else
        {
            return integer.intValue();
        }
    }

    public Date getCreatedDate()
    {
        return (Date)zza(zzlq.zzahy);
    }

    public Map getCustomProperties()
    {
        AppVisibleCustomProperties appvisiblecustomproperties = (AppVisibleCustomProperties)zza(zzlo.zzagM);
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
        return (String)zza(zzlo.zzagN);
    }

    public DriveId getDriveId()
    {
        return (DriveId)zza(zzlo.zzagK);
    }

    public String getEmbedLink()
    {
        return (String)zza(zzlo.zzagO);
    }

    public String getFileExtension()
    {
        return (String)zza(zzlo.zzagP);
    }

    public long getFileSize()
    {
        return ((Long)zza(zzlo.zzagQ)).longValue();
    }

    public Date getLastViewedByMeDate()
    {
        return (Date)zza(zzlq.zzahz);
    }

    public String getMimeType()
    {
        return (String)zza(zzlo.zzahg);
    }

    public Date getModifiedByMeDate()
    {
        return (Date)zza(zzlq.zzahB);
    }

    public Date getModifiedDate()
    {
        return (Date)zza(zzlq.zzahA);
    }

    public String getOriginalFilename()
    {
        return (String)zza(zzlo.zzahh);
    }

    public long getQuotaBytesUsed()
    {
        return ((Long)zza(zzlo.zzahm)).longValue();
    }

    public Date getSharedWithMeDate()
    {
        return (Date)zza(zzlq.zzahC);
    }

    public String getTitle()
    {
        return (String)zza(zzlo.zzahp);
    }

    public String getWebContentLink()
    {
        return (String)zza(zzlo.zzahr);
    }

    public String getWebViewLink()
    {
        return (String)zza(zzlo.zzahs);
    }

    public boolean isEditable()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzagW);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isExplicitlyTrashed()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzagX);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isFolder()
    {
        return "application/vnd.google-apps.folder".equals(getMimeType());
    }

    public boolean isInAppFolder()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzagU);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isPinnable()
    {
        Boolean boolean1 = (Boolean)zza(zzls.zzahF);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isPinned()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzagY);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isRestricted()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzaha);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isShared()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzahb);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isStarred()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzahn);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isTrashable()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzahe);
        if (boolean1 == null)
        {
            return true;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isTrashed()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzahq);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public boolean isViewed()
    {
        Boolean boolean1 = (Boolean)zza(zzlo.zzahf);
        if (boolean1 == null)
        {
            return false;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public abstract Object zza(MetadataField metadatafield);
}
