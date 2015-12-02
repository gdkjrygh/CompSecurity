// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.model;

import android.text.TextUtils;
import gjw;

// Referenced classes of package com.ubercab.payment.internal.model:
//            Shape_ApiError

public abstract class ApiError
{

    public ApiError()
    {
    }

    public static ApiError create()
    {
        return new Shape_ApiError();
    }

    public static ApiError create(String s)
    {
        return create().setTitle(s);
    }

    abstract String getError();

    public String getErrorMessage()
    {
        if (!TextUtils.isEmpty(getError()))
        {
            return getError();
        }
        if (!TextUtils.isEmpty(getTitle()) && !TextUtils.isEmpty(getSubhead()))
        {
            return gjw.a("\n\n").a(getTitle(), getSubhead(), new Object[0]).trim();
        }
        if (!TextUtils.isEmpty(getTitle()))
        {
            return getTitle();
        } else
        {
            return getSubhead();
        }
    }

    abstract String getSubhead();

    abstract String getTitle();

    abstract ApiError setError(String s);

    abstract ApiError setSubhead(String s);

    abstract ApiError setTitle(String s);
}
