// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportImageUploadResponse

public abstract class SupportImageUploadResponse
    implements Parcelable
{

    public SupportImageUploadResponse()
    {
    }

    public static SupportImageUploadResponse create()
    {
        return new Shape_SupportImageUploadResponse();
    }

    public abstract String getToken();

    public abstract SupportImageUploadResponse setToken(String s);
}
