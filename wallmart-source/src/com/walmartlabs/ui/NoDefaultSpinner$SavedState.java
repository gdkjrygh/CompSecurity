// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.walmartlabs.ui:
//            NoDefaultSpinner

private static class <init> extends android.view.State
{

    public static final android.os.edState.itemSelected CREATOR = new android.os.Parcelable.Creator() {

        public NoDefaultSpinner.SavedState createFromParcel(Parcel parcel)
        {
            return new NoDefaultSpinner.SavedState(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public NoDefaultSpinner.SavedState[] newArray(int i)
        {
            return new NoDefaultSpinner.SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    boolean itemSelected;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.arcel(parcel, i);
        if (itemSelected)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    private _cls1(Parcel parcel)
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

    itemSelected(Parcel parcel, itemSelected itemselected)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
