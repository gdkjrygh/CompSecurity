// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity, FragmentManager, FragmentTransaction, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private static final String z[];
    private boolean mAttached;
    private int mContainerId;
    private Context mContext;
    private FragmentManager mFragmentManager;
    private TabInfo mLastTab;
    private android.widget.TabHost.OnTabChangeListener mOnTabChangeListener;
    private final ArrayList mTabs;

    public FragmentTabHost(Context context)
    {
        super(context, null);
        mTabs = new ArrayList();
        initFragmentTabHost(context, null);
    }

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mTabs = new ArrayList();
        initFragmentTabHost(context, attributeset);
    }

    private FragmentTransaction doTabChanged(String s, FragmentTransaction fragmenttransaction)
    {
        TabInfo tabinfo;
        int i;
        int j;
        j = FragmentActivity.a;
        tabinfo = null;
        i = 0;
_L2:
        TabInfo tabinfo1 = tabinfo;
        if (i < mTabs.size())
        {
            tabinfo1 = (TabInfo)mTabs.get(i);
            if (tabinfo1.tag.equals(s))
            {
                tabinfo = tabinfo1;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_256;
            }
            tabinfo1 = tabinfo;
        }
        if (tabinfo1 == null)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder()).append(z[1]).append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        try
        {
            tabinfo = mLastTab;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s = fragmenttransaction;
        if (tabinfo == tabinfo1)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        s = fragmenttransaction;
        if (fragmenttransaction == null)
        {
            s = mFragmentManager.beginTransaction();
        }
        fragmenttransaction = mLastTab;
        if (fragmenttransaction != null)
        {
            try
            {
                if (mLastTab.fragment != null)
                {
                    s.detach(mLastTab.fragment);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (tabinfo1 == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        fragmenttransaction = tabinfo1.fragment;
        if (fragmenttransaction == null)
        {
            try
            {
                tabinfo1.fragment = Fragment.instantiate(mContext, tabinfo1.clss.getName(), tabinfo1.args);
                s.add(mContainerId, tabinfo1.fragment, tabinfo1.tag);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_233;
            }
        }
        s.attach(tabinfo1.fragment);
        mLastTab = tabinfo1;
        return s;
        s;
        throw s;
        s;
        throw s;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void initFragmentTabHost(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        mContainerId = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener(this);
    }

    protected void onAttachedToWindow()
    {
        Object obj;
        String s;
        int i;
        int j;
        j = FragmentActivity.a;
        super.onAttachedToWindow();
        s = getCurrentTabTag();
        obj = null;
        i = 0;
_L2:
        Object obj1;
        TabInfo tabinfo;
        obj1 = obj;
        if (i >= mTabs.size())
        {
            break MISSING_BLOCK_LABEL_154;
        }
        tabinfo = (TabInfo)mTabs.get(i);
        Fragment fragment;
        tabinfo.fragment = mFragmentManager.findFragmentByTag(tabinfo.tag);
        fragment = tabinfo.fragment;
        obj1 = obj;
        if (fragment == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        boolean flag = tabinfo.fragment.isDetached();
        obj1 = obj;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        flag = tabinfo.tag.equals(s);
        if (flag)
        {
            try
            {
                mLastTab = tabinfo;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            obj1 = obj;
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_149;
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = mFragmentManager.beginTransaction();
        }
        ((FragmentTransaction) (obj1)).detach(tabinfo.fragment);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        mAttached = true;
        obj = doTabChanged(s, ((FragmentTransaction) (obj1)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        ((FragmentTransaction) (obj)).commit();
        mFragmentManager.executePendingTransactions();
        return;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        throw obj;
        i++;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mAttached = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setCurrentTabByTag(((SavedState) (parcelable)).curTab);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.curTab = getCurrentTabTag();
        return savedstate;
    }

    public void onTabChanged(String s)
    {
        if (mAttached)
        {
            FragmentTransaction fragmenttransaction = doTabChanged(s, null);
            if (fragmenttransaction != null)
            {
                try
                {
                    fragmenttransaction.commit();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
            }
        }
        try
        {
            if (mOnTabChangeListener != null)
            {
                mOnTabChangeListener.onTabChanged(s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        mOnTabChangeListener = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException(z[0]);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "l#9i\bB7&q\bR3>hX\t\177ji@@\"jiIJ39=I\001\025%s\\D.>=IO2j[Z@1'xFU\033+sIF38";
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
                obj = "o9jiICv!sGV8j{GSv>|O\001";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 40;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 33;
          goto _L9
_L5:
        byte0 = 86;
          goto _L9
_L6:
        byte0 = 74;
          goto _L9
        byte0 = 29;
          goto _L9
    }

    private class TabInfo
    {

        private final Bundle args;
        private final Class clss;
        private Fragment fragment;
        private final String tag;



/*
        static Fragment access$102(TabInfo tabinfo, Fragment fragment1)
        {
            tabinfo.fragment = fragment1;
            return fragment1;
        }

*/



    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR;
        private static final String z[];
        String curTab;

        public String toString()
        {
            return (new StringBuilder()).append(z[0]).append(Integer.toHexString(System.identityHashCode(this))).append(z[1]).append(curTab).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(curTab);
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[2];
            obj = "K\001%#\023h\0350\020\037o;+7\n# %2\033i 0%\nh\b";
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
                    obj = "-\02016*l\021y";
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    z = as;
                    class _cls1
                        implements android.os.Parcelable.Creator
                    {

                        public SavedState createFromParcel(Parcel parcel)
                        {
                            return new SavedState(parcel, null);
                        }

                        public Object createFromParcel(Parcel parcel)
                        {
                            return createFromParcel(parcel);
                        }

                        public SavedState[] newArray(int l)
                        {
                            return new SavedState[l];
                        }

                        public Object[] newArray(int l)
                        {
                            return newArray(l);
                        }

                _cls1()
                {
                }
                    }

                    CREATOR = new _cls1();
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 144
        //                       0 165
        //                       1 171
        //                       2 177
        //                       3 183;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_183;
_L3:
            byte byte0 = 126;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 13;
              goto _L9
_L5:
            byte0 = 115;
              goto _L9
_L6:
            byte0 = 68;
              goto _L9
            byte0 = 68;
              goto _L9
        }

        private SavedState(Parcel parcel)
        {
            super(parcel);
            curTab = parcel.readString();
        }

        SavedState(Parcel parcel, _cls1 _pcls1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
