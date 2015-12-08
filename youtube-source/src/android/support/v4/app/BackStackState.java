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
//            d, b, c, Fragment, 
//            m

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
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

    public BackStackState(m m1, b b1)
    {
        m1 = b1.b;
        int i;
        int j;
        for (i = 0; m1 != null; i = j)
        {
            j = i;
            if (((c) (m1)).i != null)
            {
                j = i + ((c) (m1)).i.size();
            }
            m1 = ((c) (m1)).a;
        }

        mOps = new int[i + b1.d * 7];
        if (!b1.k)
        {
            throw new IllegalStateException("Not on back stack");
        }
        m1 = b1.b;
        i = 0;
        while (m1 != null) 
        {
            int ai[] = mOps;
            int k = i + 1;
            ai[i] = ((c) (m1)).c;
            ai = mOps;
            int l = k + 1;
            if (((c) (m1)).d != null)
            {
                i = ((c) (m1)).d.o;
            } else
            {
                i = -1;
            }
            ai[k] = i;
            ai = mOps;
            i = l + 1;
            ai[l] = ((c) (m1)).e;
            ai = mOps;
            k = i + 1;
            ai[i] = ((c) (m1)).f;
            ai = mOps;
            i = k + 1;
            ai[k] = ((c) (m1)).g;
            ai = mOps;
            k = i + 1;
            ai[i] = ((c) (m1)).h;
            if (((c) (m1)).i != null)
            {
                int i1 = ((c) (m1)).i.size();
                int ai1[] = mOps;
                i = k + 1;
                ai1[k] = i1;
                for (k = 0; k < i1;)
                {
                    mOps[i] = ((Fragment)((c) (m1)).i.get(k)).o;
                    k++;
                    i++;
                }

            } else
            {
                int ai2[] = mOps;
                i = k + 1;
                ai2[k] = 0;
            }
            m1 = ((c) (m1)).a;
        }
        mTransition = b1.i;
        mTransitionStyle = b1.j;
        mName = b1.m;
        mIndex = b1.o;
        mBreadCrumbTitleRes = b1.p;
        mBreadCrumbTitleText = b1.q;
        mBreadCrumbShortTitleRes = b1.r;
        mBreadCrumbShortTitleText = b1.s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final b instantiate(m m1)
    {
        b b1 = new b(m1);
        int k = 0;
        for (int i = 0; i < mOps.length;)
        {
            c c1 = new c();
            int ai[] = mOps;
            int j = i + 1;
            c1.c = ai[i];
            if (m.a)
            {
                Log.v("FragmentManager", (new StringBuilder("Instantiate ")).append(b1).append(" op #").append(k).append(" base fragment #").append(mOps[j]).toString());
            }
            ai = mOps;
            i = j + 1;
            j = ai[j];
            int i1;
            if (j >= 0)
            {
                c1.d = (Fragment)m1.f.get(j);
            } else
            {
                c1.d = null;
            }
            ai = mOps;
            j = i + 1;
            c1.e = ai[i];
            ai = mOps;
            i = j + 1;
            c1.f = ai[j];
            ai = mOps;
            j = i + 1;
            c1.g = ai[i];
            ai = mOps;
            i = j + 1;
            c1.h = ai[j];
            ai = mOps;
            j = i + 1;
            i1 = ai[i];
            i = j;
            if (i1 > 0)
            {
                c1.i = new ArrayList(i1);
                int l = 0;
                do
                {
                    i = j;
                    if (l >= i1)
                    {
                        break;
                    }
                    if (m.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("Instantiate ")).append(b1).append(" set remove fragment #").append(mOps[j]).toString());
                    }
                    Fragment fragment = (Fragment)m1.f.get(mOps[j]);
                    c1.i.add(fragment);
                    l++;
                    j++;
                } while (true);
            }
            b1.a(c1);
            k++;
        }

        b1.i = mTransition;
        b1.j = mTransitionStyle;
        b1.m = mName;
        b1.o = mIndex;
        b1.k = true;
        b1.p = mBreadCrumbTitleRes;
        b1.q = mBreadCrumbTitleText;
        b1.r = mBreadCrumbShortTitleRes;
        b1.s = mBreadCrumbShortTitleText;
        b1.b(1);
        return b1;
    }

    public final void writeToParcel(Parcel parcel, int i)
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
