// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable:
//            DataApi

public static interface A
    extends Releasable, Result
{

    public abstract ParcelFileDescriptor getFd();

    public abstract InputStream getInputStream();
}
