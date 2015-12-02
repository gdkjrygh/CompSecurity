// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ubercab.ui.EditText;
import hpb;

public class ClearableEditText extends EditText
    implements android.view.View.OnFocusChangeListener, android.view.View.OnTouchListener
{

    private Drawable a;

    public ClearableEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public ClearableEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a();
        c();
    }

    private void a()
    {
        a = getCompoundDrawables()[2];
        if (a == null)
        {
            return;
        } else
        {
            a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
            a(false);
            return;
        }
    }

    private void c()
    {
        setOnTouchListener(this);
        setOnFocusChangeListener(this);
        addTextChangedListener(new hpb() {

            final ClearableEditText a;

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                if (a.hasFocus())
                {
                    ClearableEditText clearableedittext = a;
                    boolean flag;
                    if (!TextUtils.isEmpty(charsequence))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    clearableedittext.a(flag);
                }
            }

            
            {
                a = ClearableEditText.this;
                super();
            }
        });
    }

    protected final void a(boolean flag)
    {
        Drawable drawable;
        Drawable adrawable[];
        if (flag)
        {
            drawable = a;
        } else
        {
            drawable = null;
        }
        adrawable = getCompoundDrawables();
        setCompoundDrawables(adrawable[0], adrawable[1], drawable, adrawable[3]);
    }

    public void onFocusChange(View view, boolean flag)
    {
        boolean flag1 = false;
        if (flag)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(getText()))
            {
                flag = true;
            }
            a(flag);
            return;
        } else
        {
            a(false);
            return;
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (a != null)
        {
            boolean flag;
            if (motionevent.getX() > (float)(getWidth() - getPaddingRight() - a.getIntrinsicWidth() - getCompoundDrawablePadding()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && motionevent.getAction() == 1)
            {
                setText("");
            }
        }
        return false;
    }
}
