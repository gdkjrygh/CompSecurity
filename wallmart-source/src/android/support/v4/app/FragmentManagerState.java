// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//            FragmentState, BackStackState

final class FragmentManagerState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    FragmentState mActive[];
    int mAdded[];
    BackStackState mBackStack[];

    public FragmentManagerState()
    {
    }

    public FragmentManagerState(Parcel parcel)
    {
        mActive = (FragmentState[])parcel.createTypedArray(FragmentState.CREATOR);
        mAdded = parcel.createIntArray();
        mBackStack = (BackStackState[])parcel.createTypedArray(BackStackState.CREATOR);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedArray(mActive, i);
        parcel.writeIntArray(mAdded);
        parcel.writeTypedArray(mBackStack, i);
    }


    /* member class not found */
    class _cls1 {}

}
