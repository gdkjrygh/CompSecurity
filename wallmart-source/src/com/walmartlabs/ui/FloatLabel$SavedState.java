// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.walmartlabs.ui:
//            FloatLabel

private static class mShouldShow extends android.view.State
{

    public static final android.os.edState.mShouldShow CREATOR = new android.os.Parcelable.Creator() {

        public FloatLabel.SavedState createFromParcel(Parcel parcel)
        {
            return new FloatLabel.SavedState(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public FloatLabel.SavedState[] newArray(int i)
        {
            return new FloatLabel.SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    boolean mShouldShow;
    int mState;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.iteToParcel(parcel, i);
        parcel.writeInt(mState);
        if (mShouldShow)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    _cls1(Parcel parcel)
    {
        super(parcel);
        mState = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mShouldShow = flag;
    }

    mShouldShow(Parcelable parcelable, int i, boolean flag)
    {
        super(parcelable);
        mState = i;
        mShouldShow = flag;
    }
}
