// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

// Referenced classes of package android.support.v4.app:
//            Fragment, FragmentActivity

public class ListFragment extends Fragment
{

    private static final String z[];
    ListAdapter mAdapter;
    CharSequence mEmptyText;
    View mEmptyView;
    private final Handler mHandler = new Handler();
    ListView mList;
    View mListContainer;
    boolean mListShown;
    private final android.widget.AdapterView.OnItemClickListener mOnClickListener = new _cls2();
    View mProgressContainer;
    private final Runnable mRequestFocus = new _cls1();
    TextView mStandardEmptyView;

    public ListFragment()
    {
    }

    private void ensureList()
    {
        Object obj;
        int i;
        i = FragmentActivity.a;
        try
        {
            obj = mList;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (obj != null)
        {
            return;
        }
        illegalstateexception = getView();
        if (illegalstateexception == null)
        {
            try
            {
                throw new IllegalStateException(z[3]);
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
        }
        boolean flag = illegalstateexception instanceof ListView;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        mList = (ListView)illegalstateexception;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        TextView textview;
        mStandardEmptyView = (TextView)illegalstateexception.findViewById(0xff0001);
        textview = mStandardEmptyView;
        if (textview == null)
        {
            boolean flag1;
            try
            {
                mEmptyView = illegalstateexception.findViewById(0x1020004);
            }
            // Misplaced declaration of an exception variable
            catch (IllegalStateException illegalstateexception)
            {
                throw illegalstateexception;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_110;
            }
        }
        mStandardEmptyView.setVisibility(8);
        mProgressContainer = illegalstateexception.findViewById(0xff0002);
        mListContainer = illegalstateexception.findViewById(0xff0003);
        illegalstateexception = illegalstateexception.findViewById(0x102000a);
        flag1 = illegalstateexception instanceof ListView;
        if (!flag1)
        {
            if (illegalstateexception == null)
            {
                try
                {
                    throw new RuntimeException(z[2]);
                }
                // Misplaced declaration of an exception variable
                catch (IllegalStateException illegalstateexception)
                {
                    throw illegalstateexception;
                }
            } else
            {
                throw new RuntimeException(z[1]);
            }
        }
        break MISSING_BLOCK_LABEL_196;
        illegalstateexception;
        try
        {
            throw illegalstateexception;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception) { }
        try
        {
            throw illegalstateexception;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception) { }
        throw illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        mList = (ListView)illegalstateexception;
        illegalstateexception = mEmptyView;
        if (illegalstateexception == null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        mList.setEmptyView(mEmptyView);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        IllegalStateException illegalstateexception1;
        try
        {
            if (mEmptyText != null)
            {
                mStandardEmptyView.setText(mEmptyText);
                mList.setEmptyView(mStandardEmptyView);
            }
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        mListShown = true;
        mList.setOnItemClickListener(mOnClickListener);
        if (mAdapter == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        illegalstateexception = mAdapter;
        mAdapter = null;
        setListAdapter(illegalstateexception);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        try
        {
            if (mProgressContainer != null)
            {
                setListShown(false, false);
            }
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        mHandler.post(mRequestFocus);
        return;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
        illegalstateexception1;
        throw illegalstateexception1;
    }

    private void setListShown(boolean flag, boolean flag1)
    {
        int i;
        i = FragmentActivity.a;
        try
        {
            ensureList();
            if (mProgressContainer == null)
            {
                throw new IllegalStateException(z[0]);
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        boolean flag2;
        try
        {
            flag2 = mListShown;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        if (flag2 != flag) goto _L2; else goto _L1
_L1:
        return;
_L2:
        mListShown = flag;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag1)
        {
            IllegalStateException illegalstateexception2;
            try
            {
                mProgressContainer.startAnimation(AnimationUtils.loadAnimation(getActivity(), 0x10a0001));
                mListContainer.startAnimation(AnimationUtils.loadAnimation(getActivity(), 0x10a0000));
            }
            catch (IllegalStateException illegalstateexception3)
            {
                throw illegalstateexception3;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_112;
            }
        }
        mProgressContainer.clearAnimation();
        mListContainer.clearAnimation();
        mProgressContainer.setVisibility(8);
        mListContainer.setVisibility(0);
        if (i == 0) goto _L1; else goto _L3
_L3:
        if (flag1)
        {
            IllegalStateException illegalstateexception4;
            try
            {
                mProgressContainer.startAnimation(AnimationUtils.loadAnimation(getActivity(), 0x10a0000));
                mListContainer.startAnimation(AnimationUtils.loadAnimation(getActivity(), 0x10a0001));
            }
            catch (IllegalStateException illegalstateexception5)
            {
                throw illegalstateexception5;
            }
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_189;
            }
        }
        mProgressContainer.clearAnimation();
        mListContainer.clearAnimation();
        mProgressContainer.setVisibility(0);
        mListContainer.setVisibility(8);
        return;
        illegalstateexception2;
        throw illegalstateexception2;
        illegalstateexception2;
        throw illegalstateexception2;
        illegalstateexception4;
        throw illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
    }

    public ListView getListView()
    {
        ensureList();
        return mList;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i = FragmentActivity.a;
        viewgroup = getActivity();
        layoutinflater = new FrameLayout(viewgroup);
        bundle = new LinearLayout(viewgroup);
        bundle.setId(0xff0002);
        bundle.setOrientation(1);
        bundle.setVisibility(8);
        bundle.setGravity(17);
        bundle.addView(new ProgressBar(viewgroup, null, 0x101007a), new android.widget.FrameLayout.LayoutParams(-2, -2));
        layoutinflater.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
        viewgroup = new FrameLayout(viewgroup);
        viewgroup.setId(0xff0003);
        bundle = new TextView(getActivity());
        bundle.setId(0xff0001);
        bundle.setGravity(17);
        viewgroup.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
        bundle = new ListView(getActivity());
        try
        {
            bundle.setId(0x102000a);
            bundle.setDrawSelectorOnTop(false);
            viewgroup.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
            layoutinflater.addView(viewgroup, new android.widget.FrameLayout.LayoutParams(-1, -1));
            layoutinflater.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            if (Fragment.a != 0)
            {
                FragmentActivity.a = i + 1;
            }
        }
        // Misplaced declaration of an exception variable
        catch (LayoutInflater layoutinflater)
        {
            throw layoutinflater;
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        mHandler.removeCallbacks(mRequestFocus);
        mList = null;
        mListShown = false;
        mListContainer = null;
        mProgressContainer = null;
        mEmptyView = null;
        mStandardEmptyView = null;
        super.onDestroyView();
    }

    public void onListItemClick(ListView listview, View view, int i, long l)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ensureList();
    }

    public void setListAdapter(ListAdapter listadapter)
    {
        boolean flag1 = false;
        Object obj;
        boolean flag;
        boolean flag2;
        try
        {
            obj = mAdapter;
        }
        // Misplaced declaration of an exception variable
        catch (ListAdapter listadapter)
        {
            throw listadapter;
        }
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mAdapter = listadapter;
        obj = mList;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        mList.setAdapter(listadapter);
        flag2 = mListShown;
        if (!flag2 && !flag)
        {
            try
            {
                listadapter = getView().getWindowToken();
            }
            // Misplaced declaration of an exception variable
            catch (ListAdapter listadapter)
            {
                throw listadapter;
            }
            if (listadapter != null)
            {
                flag1 = true;
            }
            setListShown(true, flag1);
        }
        return;
        listadapter;
        try
        {
            throw listadapter;
        }
        // Misplaced declaration of an exception variable
        catch (ListAdapter listadapter) { }
        try
        {
            throw listadapter;
        }
        // Misplaced declaration of an exception variable
        catch (ListAdapter listadapter) { }
        throw listadapter;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "g3y!\004\0040r&\005W7s&\007M&\177&\021\0041bu\004K?7e\037J&rh\004\004$~c\007";
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
                obj = "g=yr\025J&7n\021Wrao\025Sr`o\004Lr~bPE&ct\031F'ccP\0033yb\002K;s(\"\n;s(\034M!c!PP:vrPM!7h\037Prv&<M!cP\031A%7e\034E!d";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "}=btPG=yr\025J&7k\005W&7n\021R77gPh;dr&M7`&\007L=dcPM67g\004P ~d\005P77o\003\004uvh\024V=~b^v|~b^H;drW";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "g=yr\025J&7p\031A%7h\037Prnc\004\0041ec\021P7s";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 112;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 36;
          goto _L9
_L5:
        byte0 = 82;
          goto _L9
_L6:
        byte0 = 23;
          goto _L9
        byte0 = 6;
          goto _L9
    }

    private class _cls1
        implements Runnable
    {

        final ListFragment this$0;

        public void run()
        {
            mList.focusableViewAvailable(mList);
        }

        _cls1()
        {
            this$0 = ListFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemClickListener
    {

        final ListFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            onListItemClick((ListView)adapterview, view, i, l);
        }

        _cls2()
        {
            this$0 = ListFragment.this;
            super();
        }
    }

}
