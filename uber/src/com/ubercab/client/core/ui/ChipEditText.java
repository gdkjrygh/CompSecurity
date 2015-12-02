// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import drw;
import drx;
import drz;
import dsa;
import dsb;
import dsc;
import dsd;
import dse;
import dsf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChipEditText extends AutoCompleteTextView
{

    private static final Set a = new HashSet(Arrays.asList(new String[] {
        ",", "\n", " "
    }));
    private final int b;
    private int c;
    private drw d;
    private dse e;
    private Handler f;
    private Handler g;
    private Collection h;

    public ChipEditText(Context context)
    {
        this(context, null);
    }

    public ChipEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006b);
    }

    public ChipEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = -1;
        f = new dsf(this, (byte)0);
        b = (int)getResources().getDimension(0x7f08006d);
        setGravity(19);
        setFilters(new InputFilter[] {
            new dsa(this, (byte)0)
        });
    }

    public static int a(ChipEditText chipedittext)
    {
        return chipedittext.c;
    }

    public static void a(ChipEditText chipedittext, Chip chip)
    {
        chipedittext.b(chip);
    }

    private boolean a(String s, dsd dsd1)
    {
        if (TextUtils.isEmpty(s) || c != -1 && b().size() >= c)
        {
            if (dsd1 != null)
            {
                dsd1.a();
            }
            return false;
        }
        if (g == null)
        {
            HandlerThread handlerthread = new HandlerThread("chip_creator", 10);
            handlerthread.start();
            g = new drz(handlerthread.getLooper(), this, (byte)0);
        }
        Message message = g.obtainMessage();
        message.obj = new drx(s, dsd1);
        message.sendToTarget();
        return true;
    }

    public static int b(ChipEditText chipedittext)
    {
        return chipedittext.f();
    }

    private void b(Chip chip)
    {
        int i = 0;
        if (chip == null)
        {
            return;
        }
        dsc dsc1 = new dsc((byte)0);
        dsb adsb[] = (dsb[])getText().getSpans(0, getText().length(), dsb);
        for (int j = adsb.length; i < j; i++)
        {
            dsc1.a(adsb[i]);
        }

        if (c(chip.a()) == null)
        {
            dsc1.a(c(chip));
        }
        setText(dsc1);
        setSelection(getText().length());
    }

    private Chip c(String s)
    {
        if (s == null)
        {
            return null;
        }
        for (Iterator iterator = b().iterator(); iterator.hasNext();)
        {
            Chip chip = (Chip)iterator.next();
            if (chip.a().equals(s))
            {
                return chip;
            }
        }

        return null;
    }

    public static drw c(ChipEditText chipedittext)
    {
        return chipedittext.d;
    }

    private dsb c(Chip chip)
    {
        if (d == null)
        {
            throw new IllegalStateException("Adapter is required to draw a chip");
        }
        Bitmap bitmap = d.a(chip, b);
        if (bitmap == null)
        {
            return null;
        } else
        {
            BitmapDrawable bitmapdrawable = new BitmapDrawable(getResources(), bitmap);
            bitmapdrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            return new dsb(chip, bitmapdrawable);
        }
    }

    public static Handler d(ChipEditText chipedittext)
    {
        return chipedittext.f;
    }

    public static Set e()
    {
        return a;
    }

    private int f()
    {
        Editable editable = getText();
        dsb adsb[] = (dsb[])editable.getSpans(0, editable.length(), dsb);
        if (adsb.length == 0)
        {
            return 0;
        } else
        {
            return editable.getSpanEnd(adsb[adsb.length - 1]);
        }
    }

    public final void a(int i)
    {
        c = i;
    }

    public final void a(Chip chip)
    {
        int i;
        for (i = 0; chip == null || !b().contains(chip);)
        {
            return;
        }

        dsc dsc1 = new dsc((byte)0);
        dsb adsb[] = (dsb[])getText().getSpans(0, getText().length(), dsb);
        for (int j = adsb.length; i < j; i++)
        {
            dsb dsb1 = adsb[i];
            if (dsb1.a() != chip)
            {
                dsc1.a(dsb1);
            }
        }

        setText(dsc1);
        setSelection(getText().length());
    }

    public final void a(drw drw1)
    {
        d = drw1;
    }

    public final void a(dse dse1)
    {
        e = dse1;
    }

    public final boolean a()
    {
        return a(((dsd) (null)));
    }

    public final boolean a(dsd dsd1)
    {
        return a(c(), dsd1);
    }

    public final boolean a(String s)
    {
        return a(s, ((dsd) (null)));
    }

    public final Chip b(String s)
    {
        if (s == null)
        {
            return null;
        }
        for (Iterator iterator = b().iterator(); iterator.hasNext();)
        {
            Chip chip = (Chip)iterator.next();
            if (chip.c().equals(s))
            {
                return chip;
            }
        }

        return null;
    }

    public final Collection b()
    {
        int i = 0;
        if (h == null)
        {
            ArrayList arraylist = new ArrayList();
            dsb adsb[] = (dsb[])getText().getSpans(0, getText().length(), dsb);
            for (int j = adsb.length; i < j; i++)
            {
                arraylist.add(adsb[i].a());
            }

            h = arraylist;
        }
        return h;
    }

    public final String c()
    {
        return getText().toString().substring(f());
    }

    public final int d()
    {
        return c;
    }

    public boolean enoughToFilter()
    {
        return c().length() >= getThreshold();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (g != null)
        {
            g.getLooper().quit();
            g = null;
        }
    }

    public void onEditorAction(int i)
    {
        super.onEditorAction(i);
        if (i == 6)
        {
            a();
        }
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (!flag)
        {
            a();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        int i = 0;
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        dsc dsc1 = new dsc((byte)0);
        Chip achip[] = SavedState.a(parcelable);
        for (int j = achip.length; i < j; i++)
        {
            dsc1.a(c(achip[i]));
        }

        dsc1.append(SavedState.b(parcelable));
        setText(dsc1);
        setSelection(getText().length());
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        Collection collection = b();
        SavedState.a(savedstate, (Chip[])collection.toArray(new Chip[collection.size()]));
        SavedState.a(savedstate, c());
        return savedstate;
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        h = null;
        if (e != null)
        {
            e.a(b());
        }
        super.onTextChanged(charsequence, i, j, k);
    }

    protected void performFiltering(CharSequence charsequence, int i)
    {
        super.performFiltering(c(), i);
    }

    protected void replaceText(CharSequence charsequence)
    {
        super.clearComposingText();
        if (charsequence == null)
        {
            return;
        } else
        {
            a(charsequence.toString());
            return;
        }
    }


    private class Chip
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static Chip a(Parcel parcel)
            {
                return new Chip(parcel.readString(), parcel.readBundle(), parcel.readString());
            }

            private static Chip[] a(int i)
            {
                return new Chip[i];
            }

            public final Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public final Object[] newArray(int i)
            {
                return a(i);
            }

        };
        private Bundle a;
        private String b;
        private String c;

        public final String a()
        {
            return c;
        }

        public final Bundle b()
        {
            return a;
        }

        public final String c()
        {
            return b;
        }

        public int describeContents()
        {
            return 0;
        }

        public String toString()
        {
            return c();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(b);
            parcel.writeBundle(a);
            parcel.writeString(c);
        }


        public Chip(String s, Bundle bundle, String s1)
        {
            a = bundle;
            b = s;
            c = s1;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            private static SavedState[] a(int i)
            {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public final Object[] newArray(int i)
            {
                return a(i);
            }

        };
        private Chip a[];
        private String b;

        static String a(SavedState savedstate, String s)
        {
            savedstate.b = s;
            return s;
        }

        static Chip[] a(SavedState savedstate)
        {
            return savedstate.a;
        }

        static Chip[] a(SavedState savedstate, Chip achip[])
        {
            savedstate.a = achip;
            return achip;
        }

        static String b(SavedState savedstate)
        {
            return savedstate.b;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeParcelableArray(a, 0);
            parcel.writeString(b);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            Parcelable aparcelable[] = parcel.readParcelableArray(com/ubercab/client/core/ui/ChipEditText$Chip.getClassLoader());
            a = (Chip[])Arrays.copyOf(aparcelable, aparcelable.length, [Lcom/ubercab/client/core/ui/ChipEditText$Chip;);
            b = parcel.readString();
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
