// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

class mLocale extends SingleLineTransformationMethod
{

    private Locale mLocale;

    public CharSequence getTransformation(CharSequence charsequence, View view)
    {
        boolean flag = android.support.v4.app.;
        charsequence = super.getTransformation(charsequence, view);
        if (charsequence != null)
        {
            charsequence = charsequence.toString().toUpperCase(mLocale);
        } else
        {
            charsequence = null;
        }
        if (flag)
        {
            boolean flag1;
            if (android.support.v4.app..mLocale)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
            android.support.v4.app..mLocale = flag1;
        }
        return charsequence;
    }

    public (Context context)
    {
        boolean flag = android.support.v4.app.;
        super();
        mLocale = context.getResources().getConfiguration().locale;
        if (android.support.v4.app..mLocale)
        {
            if (flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            android.support.v4.app..mLocale = flag;
        }
    }
}
