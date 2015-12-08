// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;

import android.os.Parcelable;

// Referenced classes of package com.weather.commons.video2:
//            QueryRange

public interface RangedQuery
    extends Parcelable
{

    public abstract QueryRange getQueryRange();

    public abstract boolean isBaseline();

    public abstract RangedQuery next();

    public abstract RangedQuery next(int i);
}
