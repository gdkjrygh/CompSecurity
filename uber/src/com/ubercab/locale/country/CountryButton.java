// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.locale.country;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bmr;
import com.ubercab.ui.TextView;
import gjz;
import goi;
import gok;
import gon;
import goo;
import gop;
import goq;
import gor;
import got;
import hrv;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CountryButton extends LinearLayout
    implements got, hrv
{

    private final Set a;
    private final android.view.View.OnClickListener b;
    private int c;
    private AlertDialog d;
    private android.view.View.OnClickListener e;
    private goo f;
    private gop g;
    private goq h;
    private String i;

    public CountryButton(Context context)
    {
        this(context, null);
    }

    public CountryButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CountryButton(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = new CopyOnWriteArraySet();
        b = new android.view.View.OnClickListener() {

            final CountryButton a;

            public final void onClick(View view)
            {
                for (Iterator iterator = CountryButton.a(a).iterator(); iterator.hasNext(); ((android.view.View.OnClickListener)iterator.next()).onClick(view)) { }
            }

            
            {
                a = CountryButton.this;
                super();
            }
        };
        c = 0;
        setOrientation(0);
        LayoutInflater.from(context).inflate(gok.ub__locale_country_button, this, true);
        setBackgroundResource(goi.ub__spinner_background);
        setFocusableInTouchMode(false);
        d().setEllipsize(android.text.TextUtils.TruncateAt.END);
        d().setSingleLine();
        super.setOnClickListener(new android.view.View.OnClickListener(new android.content.DialogInterface.OnClickListener() {

            final CountryButton a;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                a.a(CountryButton.b(a).a(k));
            }

            
            {
                a = CountryButton.this;
                super();
            }
        }) {

            final android.content.DialogInterface.OnClickListener a;
            final CountryButton b;

            public final void onClick(View view)
            {
                if (CountryButton.c(b) != null)
                {
                    CountryButton.c(b).onClick(view);
                }
                if (CountryButton.b(b) == null)
                {
                    CountryButton.a(b, new gop(b.getContext(), CountryButton.d(b)));
                }
                CountryButton.a(b, (new android.app.AlertDialog.Builder(b.getContext())).setAdapter(CountryButton.b(b), a).setNegativeButton(0x1040000, null).show());
            }

            
            {
                b = CountryButton.this;
                a = onclicklistener;
                super();
            }
        });
        a(goi.ub__locale_icon_flag_blank);
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        attributeset = context.obtainStyledAttributes(attributeset, gon.CountryButton);
        c = attributeset.getInt(gon.CountryButton_label, 0);
        attributeset.recycle();
        if (!isInEditMode())
        {
            f = new goo(context);
            a(Locale.getDefault().getCountry());
        }
        g();
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    static AlertDialog a(CountryButton countrybutton, AlertDialog alertdialog)
    {
        countrybutton.d = alertdialog;
        return alertdialog;
    }

    static gop a(CountryButton countrybutton, gop gop)
    {
        countrybutton.g = gop;
        return gop;
    }

    static Set a(CountryButton countrybutton)
    {
        return countrybutton.a;
    }

    private void a(int j)
    {
        f().setImageResource(j);
    }

    private void a(Drawable drawable)
    {
        f().setImageDrawable(drawable);
    }

    private void a(CharSequence charsequence)
    {
        d().setText(charsequence);
        d().requestLayout();
    }

    static gop b(CountryButton countrybutton)
    {
        return countrybutton.g;
    }

    static android.view.View.OnClickListener c(CountryButton countrybutton)
    {
        return countrybutton.e;
    }

    static goo d(CountryButton countrybutton)
    {
        return countrybutton.f;
    }

    private ImageView f()
    {
        return (ImageView)getChildAt(0);
    }

    private void g()
    {
        if (!a.isEmpty())
        {
            super.setOnClickListener(b);
        }
    }

    public final String a()
    {
        return i;
    }

    public final void a(Drawable drawable, String s)
    {
        gjz.a(i);
        gjz.a(s);
        if (i.equalsIgnoreCase(s))
        {
            a(drawable);
        }
    }

    public final void a(goq goq1)
    {
        h = goq1;
    }

    public final void a(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        if (!s.toUpperCase().equals(i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = s.toUpperCase(Locale.US);
        c;
        JVM INSTR tableswitch 0 2: default 64
    //                   0 103
    //                   1 121
    //                   2 132;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_132;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L8:
        if (flag)
        {
            gor.a(getContext(), AsyncTask.THREAD_POOL_EXECUTOR, s, this);
            if (h != null)
            {
                h.a(s);
                return;
            }
        }
        if (true) goto _L1; else goto _L7
_L7:
        a(((CharSequence) (f.a(i))));
          goto _L8
_L5:
        a(((CharSequence) (b())));
          goto _L8
        a(((CharSequence) (null)));
          goto _L8
    }

    public final String b()
    {
        int j = bmr.a().d(i);
        if (j > 0)
        {
            return String.format("+%s", new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            return null;
        }
    }

    public final void c()
    {
        c = 1;
        a(i);
    }

    final TextView d()
    {
        return (TextView)getChildAt(1);
    }

    public final CharSequence e()
    {
        return a();
    }

    protected void onDetachedFromWindow()
    {
        if (d != null)
        {
            try
            {
                d.dismiss();
                d = null;
            }
            catch (Exception exception) { }
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            a(parcelable.a());
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), i);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        d().setEnabled(flag);
        ImageView imageview = f();
        float f1;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.5F;
        }
        imageview.setAlpha(f1);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        e = onclicklistener;
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            private static SavedState[] a(int j)
            {
                return new SavedState[j];
            }

            public final Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public final Object[] newArray(int j)
            {
                return a(j);
            }

        };
        private final String a;

        public final String a()
        {
            return a;
        }

        public void writeToParcel(Parcel parcel, int j)
        {
            super.writeToParcel(parcel, j);
            parcel.writeString(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
        }

        public SavedState(Parcelable parcelable, String s)
        {
            super(parcelable);
            a = s;
        }
    }

}
