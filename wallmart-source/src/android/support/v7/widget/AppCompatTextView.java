// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.internal.text.AllCapsTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

public class AppCompatTextView extends TextView
{

    public AppCompatTextView(Context context)
    {
        this(context, null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010084);
    }

    public AppCompatTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView, i, 0);
        int j = typedarray.getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextView_android_textAppearance, -1);
        typedarray.recycle();
        if (j != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(j, android.support.v7.appcompat.R.styleable.TextAppearance);
            if (typedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
            {
                setAllCaps(typedarray1.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
            }
            typedarray1.recycle();
        }
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView, i, 0);
        if (context.hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextView_textAllCaps))
        {
            setAllCaps(context.getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTextView_textAllCaps, false));
        }
        context.recycle();
    }

    public void setAllCaps(boolean flag)
    {
        AllCapsTransformationMethod allcapstransformationmethod;
        if (flag)
        {
            allcapstransformationmethod = new AllCapsTransformationMethod(getContext());
        } else
        {
            allcapstransformationmethod = null;
        }
        setTransformationMethod(allcapstransformationmethod);
    }

    public void setTextAppearance(Context context, int i)
    {
        super.setTextAppearance(context, i);
        context = context.obtainStyledAttributes(i, android.support.v7.appcompat.R.styleable.TextAppearance);
        if (context.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
        {
            setAllCaps(context.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
        }
        context.recycle();
    }
}
