// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//            Fragment, FragmentActivity, FragmentManagerImpl

final class FragmentState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR;
    private static final String z[];
    final Bundle mArguments;
    final String mClassName;
    final int mContainerId;
    final boolean mDetached;
    final int mFragmentId;
    final boolean mFromLayout;
    final int mIndex;
    Fragment mInstance;
    final boolean mRetainInstance;
    Bundle mSavedFragmentState;
    final String mTag;

    public FragmentState(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        mClassName = parcel.readString();
        mIndex = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mFromLayout = flag;
        mFragmentId = parcel.readInt();
        mContainerId = parcel.readInt();
        mTag = parcel.readString();
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mRetainInstance = flag;
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mDetached = flag;
        mArguments = parcel.readBundle();
        mSavedFragmentState = parcel.readBundle();
    }

    public FragmentState(Fragment fragment)
    {
        mClassName = fragment.getClass().getName();
        mIndex = fragment.mIndex;
        mFromLayout = fragment.mFromLayout;
        mFragmentId = fragment.mFragmentId;
        mContainerId = fragment.mContainerId;
        mTag = fragment.mTag;
        mRetainInstance = fragment.mRetainInstance;
        mDetached = fragment.mDetached;
        mArguments = fragment.mArguments;
    }

    public int describeContents()
    {
        return 0;
    }

    public Fragment instantiate(FragmentActivity fragmentactivity, Fragment fragment)
    {
        if (mInstance != null)
        {
            return mInstance;
        }
        if (mArguments != null)
        {
            mArguments.setClassLoader(fragmentactivity.getClassLoader());
        }
        mInstance = Fragment.instantiate(fragmentactivity, mClassName, mArguments);
        if (mSavedFragmentState != null)
        {
            mSavedFragmentState.setClassLoader(fragmentactivity.getClassLoader());
            mInstance.mSavedFragmentState = mSavedFragmentState;
        }
        mInstance.setIndex(mIndex, fragment);
        mInstance.mFromLayout = mFromLayout;
        mInstance.mRestored = true;
        mInstance.mFragmentId = mFragmentId;
        mInstance.mContainerId = mContainerId;
        mInstance.mTag = mTag;
        mInstance.mRetainInstance = mRetainInstance;
        mInstance.mDetached = mDetached;
        mInstance.mFragmentManager = fragmentactivity.mFragments;
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v(z[0], (new StringBuilder()).append(z[1]).append(mInstance).toString());
        }
        return mInstance;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(mClassName);
        parcel.writeInt(mIndex);
        if (mFromLayout)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(mFragmentId);
        parcel.writeInt(mContainerId);
        parcel.writeString(mTag);
        if (mRetainInstance)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (mDetached)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeBundle(mArguments);
        parcel.writeBundle(mSavedFragmentState);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "m52p>N)'Z2E&4r!";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "b) c2E3:v'N#sq!J >r=_g";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                CREATOR = new _cls1();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 144
    //                   0 165
    //                   1 171
    //                   2 177
    //                   3 183;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_183;
_L3:
        byte byte0 = 83;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 43;
          goto _L9
_L5:
        byte0 = 71;
          goto _L9
_L6:
        byte0 = 83;
          goto _L9
        byte0 = 23;
          goto _L9
    }

    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public FragmentState createFromParcel(Parcel parcel)
        {
            return new FragmentState(parcel);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public FragmentState[] newArray(int i)
        {
            return new FragmentState[i];
        }

        public Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
