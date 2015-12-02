// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.widget.TextView;

class PagerTitleStripIcs
{

    public static void setSingleLineAllCaps(TextView textview)
    {
        textview.setTransformationMethod(new SingleLineAllCapsTransform(textview.getContext()));
    }

    private class SingleLineAllCapsTransform extends SingleLineTransformationMethod
    {

        private Locale mLocale;

        public CharSequence getTransformation(CharSequence charsequence, View view)
        {
            boolean flag = android.support.v4.app.NotificationCompatApi21.Builder.a;
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
                if (android.support.v4.app.RemoteInputCompatBase.RemoteInput.a)
                {
                    flag1 = false;
                } else
                {
                    flag1 = true;
                }
                android.support.v4.app.RemoteInputCompatBase.RemoteInput.a = flag1;
            }
            return charsequence;
        }

        public SingleLineAllCapsTransform(Context context)
        {
            boolean flag = android.support.v4.app.NotificationCompatApi21.Builder.a;
            super();
            mLocale = context.getResources().getConfiguration().locale;
            if (android.support.v4.app.RemoteInputCompatBase.RemoteInput.a)
            {
                if (flag)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                android.support.v4.app.NotificationCompatApi21.Builder.a = flag;
            }
        }
    }

}
