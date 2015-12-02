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
//            FragmentActivity, BackStackRecord, Fragment, FragmentManagerImpl

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR;
    private static final String z[];
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int mOps[];
    final ArrayList mSharedElementSourceNames;
    final ArrayList mSharedElementTargetNames;
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
        mSharedElementSourceNames = parcel.createStringArrayList();
        mSharedElementTargetNames = parcel.createStringArrayList();
    }

    public BackStackState(FragmentManagerImpl fragmentmanagerimpl, BackStackRecord backstackrecord)
    {
        int k;
        int i1;
        i1 = FragmentActivity.a;
        super();
        fragmentmanagerimpl = backstackrecord.mHead;
        int i = 0;
        do
        {
            k = i;
            if (fragmentmanagerimpl == null)
            {
                break;
            }
            k = i;
            if (((BackStackRecord.Op) (fragmentmanagerimpl)).removed != null)
            {
                k = i + ((BackStackRecord.Op) (fragmentmanagerimpl)).removed.size();
            }
            fragmentmanagerimpl = ((BackStackRecord.Op) (fragmentmanagerimpl)).next;
            i = k;
        } while (i1 == 0);
        try
        {
            mOps = new int[k + backstackrecord.mNumOp * 7];
            if (!backstackrecord.mAddToBackStack)
            {
                throw new IllegalStateException(z[7]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (FragmentManagerImpl fragmentmanagerimpl)
        {
            throw fragmentmanagerimpl;
        }
        fragmentmanagerimpl = backstackrecord.mHead;
        k = 0;
_L7:
        int j;
        int l;
        if (fragmentmanagerimpl == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int ai[];
        int j1;
        try
        {
            ai = mOps;
        }
        // Misplaced declaration of an exception variable
        catch (FragmentManagerImpl fragmentmanagerimpl)
        {
            throw fragmentmanagerimpl;
        }
        l = k + 1;
        ai[k] = ((BackStackRecord.Op) (fragmentmanagerimpl)).cmd;
        ai = mOps;
        k = l + 1;
        if (((BackStackRecord.Op) (fragmentmanagerimpl)).fragment == null) goto _L2; else goto _L1
_L1:
        j = ((BackStackRecord.Op) (fragmentmanagerimpl)).fragment.mIndex;
_L8:
        ai[l] = j;
        ai = mOps;
        j = k + 1;
        ai[k] = ((BackStackRecord.Op) (fragmentmanagerimpl)).enterAnim;
        ai = mOps;
        k = j + 1;
        ai[j] = ((BackStackRecord.Op) (fragmentmanagerimpl)).exitAnim;
        ai = mOps;
        j = k + 1;
        ai[k] = ((BackStackRecord.Op) (fragmentmanagerimpl)).popEnterAnim;
        ai = mOps;
        k = j + 1;
        ai[j] = ((BackStackRecord.Op) (fragmentmanagerimpl)).popExitAnim;
        j = k;
        if (((BackStackRecord.Op) (fragmentmanagerimpl)).removed == null) goto _L4; else goto _L3
_L3:
        j1 = ((BackStackRecord.Op) (fragmentmanagerimpl)).removed.size();
        ai = mOps;
        j = k + 1;
        ai[k] = j1;
        k = 0;
_L9:
        if (k < j1)
        {
            ai = mOps;
            l = j + 1;
            ai[j] = ((Fragment)((BackStackRecord.Op) (fragmentmanagerimpl)).removed.get(k)).mIndex;
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_459;
            }
            j = l;
        }
        k = j;
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        try
        {
            ai = mOps;
        }
        // Misplaced declaration of an exception variable
        catch (FragmentManagerImpl fragmentmanagerimpl)
        {
            throw fragmentmanagerimpl;
        }
        k = j + 1;
        ai[j] = 0;
_L5:
        fragmentmanagerimpl = ((BackStackRecord.Op) (fragmentmanagerimpl)).next;
        if (i1 == 0) goto _L7; else goto _L6
_L6:
        mTransition = backstackrecord.mTransition;
        mTransitionStyle = backstackrecord.mTransitionStyle;
        mName = backstackrecord.mName;
        mIndex = backstackrecord.mIndex;
        mBreadCrumbTitleRes = backstackrecord.mBreadCrumbTitleRes;
        mBreadCrumbTitleText = backstackrecord.mBreadCrumbTitleText;
        mBreadCrumbShortTitleRes = backstackrecord.mBreadCrumbShortTitleRes;
        mBreadCrumbShortTitleText = backstackrecord.mBreadCrumbShortTitleText;
        mSharedElementSourceNames = backstackrecord.mSharedElementSourceNames;
        mSharedElementTargetNames = backstackrecord.mSharedElementTargetNames;
        return;
_L2:
        j = -1;
          goto _L8
        k++;
        j = l;
          goto _L9
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
        int i1;
        i1 = FragmentActivity.a;
        backstackrecord = new BackStackRecord(fragmentmanagerimpl);
        j = 0;
        i = 0;
_L6:
        if (i >= mOps.length) goto _L2; else goto _L1
_L1:
        int k;
        int l;
        BackStackRecord.Op op = new BackStackRecord.Op();
        int ai[];
        Object obj;
        int ai1[];
        int j1;
        try
        {
            ai = mOps;
        }
        // Misplaced declaration of an exception variable
        catch (FragmentManagerImpl fragmentmanagerimpl)
        {
            throw fragmentmanagerimpl;
        }
        k = i + 1;
        op.cmd = ai[i];
        if (FragmentManagerImpl.DEBUG)
        {
            Log.v(z[1], (new StringBuilder()).append(z[3]).append(backstackrecord).append(z[5]).append(j).append(z[0]).append(mOps[k]).toString());
        }
        ai = mOps;
        i = k + 1;
        k = ai[k];
        if (k >= 0)
        {
            obj = (Fragment)fragmentmanagerimpl.mActive.get(k);
            try
            {
                op.fragment = ((Fragment) (obj));
            }
            // Misplaced declaration of an exception variable
            catch (FragmentManagerImpl fragmentmanagerimpl)
            {
                throw fragmentmanagerimpl;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_181;
            }
        }
        op.fragment = null;
        obj = mOps;
        k = i + 1;
        op.enterAnim = obj[i];
        obj = mOps;
        i = k + 1;
        op.exitAnim = obj[k];
        obj = mOps;
        k = i + 1;
        op.popEnterAnim = obj[i];
        obj = mOps;
        i = k + 1;
        op.popExitAnim = obj[k];
        obj = mOps;
        k = i + 1;
        j1 = obj[i];
        i = k;
        if (j1 <= 0) goto _L4; else goto _L3
_L3:
        op.removed = new ArrayList(j1);
        l = 0;
        i = k;
        k = l;
_L7:
        if (k < j1)
        {
            try
            {
                if (FragmentManagerImpl.DEBUG)
                {
                    Log.v(z[6], (new StringBuilder()).append(z[4]).append(backstackrecord).append(z[2]).append(mOps[i]).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (FragmentManagerImpl fragmentmanagerimpl)
            {
                throw fragmentmanagerimpl;
            }
            obj = fragmentmanagerimpl.mActive;
            ai1 = mOps;
            l = i + 1;
            obj = (Fragment)((ArrayList) (obj)).get(ai1[i]);
            op.removed.add(obj);
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_552;
            }
            i = l;
        }
_L4:
        backstackrecord.addOp(op);
        if (i1 == 0) goto _L5; else goto _L2
_L2:
        backstackrecord.mTransition = mTransition;
        backstackrecord.mTransitionStyle = mTransitionStyle;
        backstackrecord.mName = mName;
        backstackrecord.mIndex = mIndex;
        backstackrecord.mAddToBackStack = true;
        backstackrecord.mBreadCrumbTitleRes = mBreadCrumbTitleRes;
        backstackrecord.mBreadCrumbTitleText = mBreadCrumbTitleText;
        backstackrecord.mBreadCrumbShortTitleRes = mBreadCrumbShortTitleRes;
        backstackrecord.mBreadCrumbShortTitleText = mBreadCrumbShortTitleText;
        backstackrecord.mSharedElementSourceNames = mSharedElementSourceNames;
        backstackrecord.mSharedElementTargetNames = mSharedElementTargetNames;
        backstackrecord.bumpBackStackNesting(1);
        return backstackrecord;
_L5:
        j++;
          goto _L6
        k++;
        i = l;
          goto _L7
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
        parcel.writeStringList(mSharedElementSourceNames);
        parcel.writeStringList(mSharedElementTargetNames);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "Z/\bg\nZ+\033u\b\027(\007`OY";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "<?\bs\002\037#\035Y\016\024,\016q\035";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "Z>\f`O\b(\004{\031\037m\017f\016\035 \fz\033Zn";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "3#\032`\016\0249\000u\033\037m";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "3#\032`\016\0249\000u\033\037m";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Z\"\0314L";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "<?\bs\002\037#\035Y\016\024,\016q\035";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "4\"\0354\000\024m\013u\f\021m\032`\016\031&";
                byte0 = 6;
                break;

            case 6: // '\006'
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
        JVM INSTR tableswitch 0 3: default 268
    //                   0 291
    //                   1 298
    //                   2 305
    //                   3 312;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_312;
_L3:
        byte byte1 = 111;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 122;
          goto _L9
_L5:
        byte1 = 77;
          goto _L9
_L6:
        byte1 = 105;
          goto _L9
        byte1 = 20;
          goto _L9
    }

    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public BackStackState createFromParcel(Parcel parcel)
        {
            return new BackStackState(parcel);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public BackStackState[] newArray(int i)
        {
            return new BackStackState[i];
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
