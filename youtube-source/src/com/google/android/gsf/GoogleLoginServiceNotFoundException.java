// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.util.AndroidException;

// Referenced classes of package com.google.android.gsf:
//            b

public class GoogleLoginServiceNotFoundException extends AndroidException
{

    private int mErrorCode;

    public GoogleLoginServiceNotFoundException(int i)
    {
        super(b.a(i));
        mErrorCode = i;
    }

    int getErrorCode()
    {
        return mErrorCode;
    }
}
