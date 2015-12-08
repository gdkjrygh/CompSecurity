// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.zzrb;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable:
//            DataItem, DataMap, DataItemAsset, Asset

public class DataMapItem
{

    private final Uri mUri;
    private final DataMap zzaSV;

    private DataMapItem(DataItem dataitem)
    {
        mUri = dataitem.getUri();
        zzaSV = zza((DataItem)dataitem.freeze());
    }

    public static DataMapItem fromDataItem(DataItem dataitem)
    {
        if (dataitem == null)
        {
            throw new IllegalStateException("provided dataItem is null");
        } else
        {
            return new DataMapItem(dataitem);
        }
    }

    private DataMap zza(DataItem dataitem)
    {
        if (dataitem.getData() == null && dataitem.getAssets().size() > 0)
        {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (dataitem.getData() == null)
        {
            return new DataMap();
        }
        Object obj;
        int j;
        obj = new ArrayList();
        j = dataitem.getAssets().size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        DataItemAsset dataitemasset = (DataItemAsset)dataitem.getAssets().get(Integer.toString(i));
        if (dataitemasset == null)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder()).append("Cannot find DataItemAsset referenced in data at ").append(i).append(" for ").append(dataitem).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            Log.w("DataItem", (new StringBuilder()).append("Unable to parse datamap from dataItem. uri=").append(dataitem.getUri()).append(", data=").append(Base64.encodeToString(dataitem.getData(), 0)).toString());
            throw new IllegalStateException((new StringBuilder()).append("Unable to parse datamap from dataItem.  uri=").append(dataitem.getUri()).toString(), ((Throwable) (obj)));
        }
        ((List) (obj)).add(Asset.createFromRef(dataitemasset.getId()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj = zzrb.zza(new com.google.android.gms.internal.zzrb.zza(zzrc.zzw(dataitem.getData()), ((List) (obj))));
        return ((DataMap) (obj));
    }

    public DataMap getDataMap()
    {
        return zzaSV;
    }

    public Uri getUri()
    {
        return mUri;
    }
}
