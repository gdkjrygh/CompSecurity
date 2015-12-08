// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.volley;

import com.android.volley.VolleyError;
import com.android.volley.j;

public abstract class DisplayMessageError extends VolleyError
{

    String mDisplayErrorHtml;

    public DisplayMessageError()
    {
    }

    public DisplayMessageError(j j)
    {
        super(j);
    }

    public DisplayMessageError(String s)
    {
        mDisplayErrorHtml = s;
    }

    public String getDisplayErrorHtml()
    {
        return mDisplayErrorHtml;
    }

    public String toString()
    {
        return (new StringBuilder("DisplayErrorMessage[")).append(mDisplayErrorHtml).append("]").toString();
    }
}
