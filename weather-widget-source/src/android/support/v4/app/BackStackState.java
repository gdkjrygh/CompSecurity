// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            BackStackRecord, Fragment, FragmentManagerImpl

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public BackStackState createFromParcel(Parcel parcel)
        {
            return new BackStackState(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public BackStackState[] newArray(int i)
        {
            return new BackStackState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int mOps[];
    final int mTransition;
    final int mTransitionStyle;

    public BackStackState(Parcel parcel)
    {
        mOps = parcel.createIntArray();
        mTransition = parcel.readInt();
        mTransitionStyle = parcel.readInt();
        mName = parcel.readString();
        mIndex = parcel.readInt();
        mBreadCrumbTitleRes = parcel.readInt();
        mBreadCrumbTitleText = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        mBreadCrumbShortTitleRes = parcel.readInt();
        mBreadCrumbShortTitleText = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public BackStackState(FragmentManagerImpl fragmentmanagerimpl, BackStackRecord backstackrecord)
    {
        int i;
        i = 0;
        fragmentmanagerimpl = backstackrecord.mHead;
        do
        {
            if (fragmentmanagerimpl == null)
            {
                mOps = new int[backstackrecord.mNumOp * 7 + i];
                if (!backstackrecord.mAddToBackStack)
                {
                    throw new IllegalStateException("Not on back stack");
                }
                break;
            }
            int j = i;
            if (((BackStackRecord.Op) (fragmentmanagerimpl)).removed != null)
            {
                j = i + ((BackStackRecord.Op) (fragmentmanagerimpl)).removed.size();
            }
            fragmentmanagerimpl = ((BackStackRecord.Op) (fragmentmanagerimpl)).next;
            i = j;
        } while (true);
        fragmentmanagerimpl = backstackrecord.mHead;
        i = 0;
_L3:
        int k;
        int i1;
        if (fragmentmanagerimpl == null)
        {
            mTransition = backstackrecord.mTransition;
            mTransitionStyle = backstackrecord.mTransitionStyle;
            mName = backstackrecord.mName;
            mIndex = backstackrecord.mIndex;
            mBreadCrumbTitleRes = backstackrecord.mBreadCrumbTitleRes;
            mBreadCrumbTitleText = backstackrecord.mBreadCrumbTitleText;
            mBreadCrumbShortTitleRes = backstackrecord.mBreadCrumbShortTitleRes;
            mBreadCrumbShortTitleText = backstackrecord.mBreadCrumbShortTitleText;
            return;
        }
        int ai[] = mOps;
        k = i + 1;
        ai[i] = ((BackStackRecord.Op) (fragmentmanagerimpl)).cmd;
        ai = mOps;
        int l = k + 1;
        if (((BackStackRecord.Op) (fragmentmanagerimpl)).fragment != null)
        {
            i = ((BackStackRecord.Op) (fragmentmanagerimpl)).fragment.mIndex;
        } else
        {
            i = -1;
        }
        ai[k] = i;
        ai = mOps;
        i = l + 1;
        ai[l] = ((BackStackRecord.Op) (fragmentmanagerimpl)).enterAnim;
        ai = mOps;
        k = i + 1;
        ai[i] = ((BackStackRecord.Op) (fragmentmanagerimpl)).exitAnim;
        ai = mOps;
        i = k + 1;
        ai[k] = ((BackStackRecord.Op) (fragmentmanagerimpl)).popEnterAnim;
        ai = mOps;
        i1 = i + 1;
        ai[i] = ((BackStackRecord.Op) (fragmentmanagerimpl)).popExitAnim;
        if (((BackStackRecord.Op) (fragmentmanagerimpl)).removed == null)
        {
            break MISSING_BLOCK_LABEL_381;
        }
        l = ((BackStackRecord.Op) (fragmentmanagerimpl)).removed.size();
        mOps[i1] = l;
        k = 0;
        i = i1 + 1;
_L4:
        if (k < l) goto _L2; else goto _L1
_L1:
        fragmentmanagerimpl = ((BackStackRecord.Op) (fragmentmanagerimpl)).next;
          goto _L3
_L2:
        mOps[i] = ((Fragment)((BackStackRecord.Op) (fragmentmanagerimpl)).removed.get(k)).mIndex;
        k++;
        i++;
          goto _L4
        int ai1[] = mOps;
        i = i1 + 1;
        ai1[i1] = 0;
          goto _L1
    }

    public int describeContents()
    {
        return 0;
    }

    public BackStackRecord instantiate(FragmentManagerImpl fragmentmanagerimpl)
    {
        BackStackRecord backstackrecord;
        int i;
        int j;
        backstackrecord = new BackStackRecord(fragmentmanagerimpl);
        i = 0;
        j = 0;
_L3:
        BackStackRecord.Op op;
        int k;
        if (i >= mOps.length)
        {
            backstackrecord.mTransition = mTransition;
            backstackrecord.mTransitionStyle = mTransitionStyle;
            backstackrecord.mName = mName;
            backstackrecord.mIndex = mIndex;
            backstackrecord.mAddToBackStack = true;
            backstackrecord.mBreadCrumbTitleRes = mBreadCrumbTitleRes;
            backstackrecord.mBreadCrumbTitleText = mBreadCrumbTitleText;
            backstackrecord.mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
            backstackrecord.mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
            backstackrecord.bumpBackStackNesting(1);
            return backstackrecord;
        }
        op = new BackStackRecord.Op();
        int ai[] = mOps;
        k = i + 1;
        op.cmd = ai[i];
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Instantiate ")).append(backstackrecord).append(" op #").append(j).append(" base fragment #").append(mOps[k]).toString());
        }
        ai = mOps;
        i = k + 1;
        k = ai[k];
        boolean flag;
        int l;
        if (k >= 0)
        {
            op.fragment = (Fragment)fragmentmanagerimpl.mActive.get(k);
        } else
        {
            op.fragment = null;
        }
        ai = mOps;
        k = i + 1;
        op.enterAnim = ai[i];
        ai = mOps;
        i = k + 1;
        op.exitAnim = ai[k];
        ai = mOps;
        k = i + 1;
        op.popEnterAnim = ai[i];
        ai = mOps;
        i = k + 1;
        op.popExitAnim = ai[k];
        ai = mOps;
        k = i + 1;
        l = ai[i];
        i = k;
        if (l <= 0) goto _L2; else goto _L1
_L1:
        op.removed = new ArrayList(l);
        flag = false;
        i = k;
        k = ((flag) ? 1 : 0);
_L4:
        if (k < l)
        {
            break MISSING_BLOCK_LABEL_388;
        }
_L2:
        backstackrecord.addOp(op);
        j++;
          goto _L3
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v("FragmentManager", (new StringBuilder("Instantiate ")).append(backstackrecord).append(" set remove fragment #").append(mOps[i]).toString());
        }
        Fragment fragment = (Fragment)fragmentmanagerimpl.mActive.get(mOps[i]);
        op.removed.add(fragment);
        k++;
        i++;
          goto _L4
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeIntArray(mOps);
        parcel.writeInt(mTransition);
        parcel.writeInt(mTransitionStyle);
        parcel.writeString(mName);
        parcel.writeInt(mIndex);
        parcel.writeInt(mBreadCrumbTitleRes);
        TextUtils.writeToParcel(mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(mBreadCrumbShortTitleText, parcel, 0);
    }

}
