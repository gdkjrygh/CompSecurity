// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;

class scrollPosition extends android.view.w.SavedState
{

    public static final android.os.iew.SavedState._cls1 CREATOR = new _cls1();
    public int scrollPosition;

    public String toString()
    {
        return (new StringBuilder()).append("HorizontalScrollView.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" scrollPosition=").append(scrollPosition).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.arcel(parcel, i);
        parcel.writeInt(scrollPosition);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        scrollPosition = parcel.readInt();
    }

    scrollPosition(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public NestedScrollView.SavedState createFromParcel(Parcel parcel)
        {
            return new NestedScrollView.SavedState(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public NestedScrollView.SavedState[] newArray(int i)
        {
            return new NestedScrollView.SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}
