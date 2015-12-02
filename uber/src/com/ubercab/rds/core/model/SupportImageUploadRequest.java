// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportImageUploadRequest

public abstract class SupportImageUploadRequest
    implements Parcelable
{

    public SupportImageUploadRequest()
    {
    }

    public static SupportImageUploadRequest create()
    {
        return new Shape_SupportImageUploadRequest();
    }

    public abstract String getFile();

    public abstract String getLabel();

    public abstract String getRequesterId();

    public abstract SupportImageUploadRequest setFile(String s);

    public abstract SupportImageUploadRequest setLabel(String s);

    public abstract SupportImageUploadRequest setRequesterId(String s);
}
