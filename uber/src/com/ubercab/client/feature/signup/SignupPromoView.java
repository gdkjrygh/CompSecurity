// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import cgh;
import cgt;
import chc;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.ui.TextView;
import dfp;
import gel;

public class SignupPromoView extends LinearLayout
{

    public cgh a;
    private SignupData.PromoCode b;
    private final chc c;
    ImageView mImageViewPromoPicture;
    TextView mTextViewPromo1;
    TextView mTextViewPromo2;

    public SignupPromoView(Context context)
    {
        this(context, null);
    }

    public SignupPromoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SignupPromoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new gel(getResources(), 0x7f0d0089);
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
    }

    public final SignupData.PromoCode a()
    {
        return b;
    }

    public final void a(SignupData.PromoCode promocode)
    {
        b = promocode;
        if (promocode == null)
        {
            setVisibility(8);
            return;
        }
        mImageViewPromoPicture.setImageDrawable(null);
        if (!TextUtils.isEmpty(promocode.d()))
        {
            mImageViewPromoPicture.setVisibility(0);
            a.a(promocode.d()).a().a(c).a(mImageViewPromoPicture);
        } else
        {
            mImageViewPromoPicture.setVisibility(8);
        }
        if (!TextUtils.isEmpty(promocode.c()))
        {
            String s = getContext().getString(0x7f070388, new Object[] {
                promocode.c()
            });
            mTextViewPromo1.setText(s);
        } else
        {
            mTextViewPromo1.setText(promocode.a());
        }
        mTextViewPromo2.setText(promocode.b());
        setVisibility(0);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
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
            a(SavedState.a(parcelable));
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        SavedState.a(savedstate, b);
        return savedstate;
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
        private SignupData.PromoCode a;

        static SignupData.PromoCode a(SavedState savedstate)
        {
            return savedstate.a;
        }

        static SignupData.PromoCode a(SavedState savedstate, SignupData.PromoCode promocode)
        {
            savedstate.a = promocode;
            return promocode;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(a, i);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = (SignupData.PromoCode)parcel.readParcelable(com/ubercab/client/feature/signup/SignupData$PromoCode.getClassLoader());
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
