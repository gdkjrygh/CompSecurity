// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.content.Intent;

// Referenced classes of package com.android.volley:
//            VolleyError, j

public class AuthFailureError extends VolleyError
{

    private Intent mResolutionIntent;

    public AuthFailureError()
    {
    }

    public AuthFailureError(Intent intent)
    {
        mResolutionIntent = intent;
    }

    public AuthFailureError(j j)
    {
        super(j);
    }

    public AuthFailureError(String s)
    {
        super(s);
    }

    public AuthFailureError(String s, Exception exception)
    {
        super(s, exception);
    }

    public String getMessage()
    {
        if (mResolutionIntent != null)
        {
            return "User needs to (re)enter credentials.";
        } else
        {
            return super.getMessage();
        }
    }

    public Intent getResolutionIntent()
    {
        return mResolutionIntent;
    }
}
