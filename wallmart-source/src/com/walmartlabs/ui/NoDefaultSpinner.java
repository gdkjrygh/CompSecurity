// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class NoDefaultSpinner extends AppCompatSpinner
{
    public static class Adapter extends ArrayAdapter
    {

        private String mDefaultString;
        private boolean mSelectionMade;

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            view = super.getView(i, view, viewgroup);
            viewgroup = (TextView)view.findViewById(0x1020014);
            if (i == 0 && !mSelectionMade)
            {
                viewgroup.setHint(mDefaultString);
                viewgroup.setText(null);
            }
            return view;
        }

        public void setSelectionMade(boolean flag)
        {
            mSelectionMade = flag;
            notifyDataSetChanged();
        }

        public Adapter(Context context, int i, int j)
        {
            this(context, context.getString(i), context.getResources().getStringArray(j));
        }

        public Adapter(Context context, String s, String as[])
        {
            super(context, com.walmart.lib.R.layout.simple_spinner_item);
            setDropDownViewResource(0x1090009);
            mDefaultString = s;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                add(as[i]);
            }

        }
    }

    private static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        boolean itemSelected;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            if (itemSelected)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            itemSelected = flag;
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private boolean mIsMeasuring;
    private boolean mItemSelected;

    public NoDefaultSpinner(Context context)
    {
        super(context);
    }

    public NoDefaultSpinner(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NoDefaultSpinner(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void clearSelection()
    {
        mItemSelected = false;
        super.setSelection(0);
        android.widget.SpinnerAdapter spinneradapter = getAdapter();
        if (spinneradapter instanceof Adapter)
        {
            ((Adapter)spinneradapter).setSelectionMade(false);
        }
    }

    public int getSelectedItemPosition()
    {
        int i = super.getSelectedItemPosition();
        if (mIsMeasuring || mItemSelected || i != 0)
        {
            return i;
        } else
        {
            return -1;
        }
    }

    protected void onMeasure(int i, int j)
    {
        mIsMeasuring = true;
        super.onMeasure(i, j);
        mIsMeasuring = false;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            mItemSelected = ((SavedState) (parcelable)).itemSelected;
            parcelable = getAdapter();
            if (parcelable instanceof Adapter)
            {
                ((Adapter)parcelable).setSelectionMade(mItemSelected);
            }
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.itemSelected = mItemSelected;
        return savedstate;
    }

    public void setSelection(int i)
    {
        super.setSelection(i);
        android.widget.SpinnerAdapter spinneradapter = getAdapter();
        if (spinneradapter instanceof Adapter)
        {
            ((Adapter)spinneradapter).setSelectionMade(true);
            if (!mItemSelected && i == 0)
            {
                android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener = getOnItemSelectedListener();
                if (onitemselectedlistener != null)
                {
                    onitemselectedlistener.onItemSelected(this, getSelectedView(), i, getSelectedItemId());
                }
            }
        }
        mItemSelected = true;
    }
}
