// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//            Fragment, FragmentActivity, FragmentManager, FragmentTransaction

public class DialogFragment extends Fragment
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{

    private static final String z[];
    int mBackStackId;
    boolean mCancelable;
    Dialog mDialog;
    boolean mDismissed;
    boolean mShownByMe;
    boolean mShowsDialog;
    int mStyle;
    int mTheme;
    boolean mViewDestroyed;

    public DialogFragment()
    {
        mStyle = 0;
        mTheme = 0;
        mCancelable = true;
        mShowsDialog = true;
        mBackStackId = -1;
    }

    public void dismiss()
    {
        dismissInternal(false);
    }

    void dismissInternal(boolean flag)
    {
        int i;
        i = FragmentActivity.a;
        boolean flag1;
        try
        {
            flag1 = mDismissed;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        FragmentTransaction fragmenttransaction;
        IllegalStateException illegalstateexception1;
        try
        {
            mDismissed = true;
            mShownByMe = false;
            if (mDialog != null)
            {
                mDialog.dismiss();
                mDialog = null;
            }
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        try
        {
            mViewDestroyed = true;
            if (mBackStackId < 0)
            {
                break; /* Loop/switch isn't completed */
            }
            getFragmentManager().popBackStack(mBackStackId, 1);
            mBackStackId = -1;
        }
        catch (IllegalStateException illegalstateexception3)
        {
            throw illegalstateexception3;
        }
        if (i == 0) goto _L1; else goto _L3
_L3:
        fragmenttransaction = getFragmentManager().beginTransaction();
        fragmenttransaction.remove(this);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            fragmenttransaction.commitAllowingStateLoss();
        }
        // Misplaced declaration of an exception variable
        catch (IllegalStateException illegalstateexception1)
        {
            throw illegalstateexception1;
        }
        if (i == 0) goto _L1; else goto _L4
_L4:
        fragmenttransaction.commit();
        return;
        IllegalStateException illegalstateexception4;
        illegalstateexception4;
        throw illegalstateexception4;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
label0:
        {
            try
            {
                if (mShowsDialog)
                {
                    break label0;
                }
                bundle = super.getLayoutInflater(bundle);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            return bundle;
        }
        int i;
        try
        {
            mDialog = onCreateDialog(bundle);
            i = mStyle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        i;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 100
    //                   2 100
    //                   3 88;
           goto _L1 _L2 _L2 _L3
_L1:
        try
        {
            if (mDialog == null)
            {
                break; /* Loop/switch isn't completed */
            }
            bundle = (LayoutInflater)mDialog.getContext().getSystemService(z[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        return bundle;
_L3:
        mDialog.getWindow().addFlags(24);
_L2:
        mDialog.requestWindowFeature(1);
        if (true) goto _L1; else goto _L4
_L4:
        return (LayoutInflater)mActivity.getSystemService(z[1]);
    }

    public int getTheme()
    {
        return mTheme;
    }

    public void onActivityCreated(Bundle bundle)
    {
        boolean flag;
        try
        {
            super.onActivityCreated(bundle);
            flag = mShowsDialog;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (flag)
        {
            View view = getView();
            if (view != null)
            {
                try
                {
                    if (view.getParent() != null)
                    {
                        throw new IllegalStateException(z[2]);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw bundle;
                }
                mDialog.setContentView(view);
            }
            mDialog.setOwnerActivity(getActivity());
            mDialog.setCancelable(mCancelable);
            mDialog.setOnCancelListener(this);
            mDialog.setOnDismissListener(this);
            if (bundle != null)
            {
                bundle = bundle.getBundle(z[3]);
                if (bundle != null)
                {
                    try
                    {
                        mDialog.onRestoreInstanceState(bundle);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bundle bundle)
                    {
                        throw bundle;
                    }
                }
            }
        }
    }

    public void onAttach(Activity activity)
    {
        try
        {
            super.onAttach(activity);
            if (!mShownByMe)
            {
                mDismissed = false;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            throw activity;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag = true;
        int i;
        try
        {
            super.onCreate(bundle);
            i = mContainerId;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (i != 0)
        {
            flag = false;
        }
        try
        {
            mShowsDialog = flag;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        mStyle = bundle.getInt(z[12], 0);
        mTheme = bundle.getInt(z[10], 0);
        mCancelable = bundle.getBoolean(z[14], true);
        mShowsDialog = bundle.getBoolean(z[13], mShowsDialog);
        mBackStackId = bundle.getInt(z[11], -1);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return new Dialog(getActivity(), getTheme());
    }

    public void onDestroyView()
    {
        try
        {
            super.onDestroyView();
            if (mDialog != null)
            {
                mViewDestroyed = true;
                mDialog.dismiss();
                mDialog = null;
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void onDetach()
    {
        boolean flag;
        super.onDetach();
        flag = mShownByMe;
        IllegalStateException illegalstateexception;
        if (!flag)
        {
            try
            {
                if (!mDismissed)
                {
                    mDismissed = true;
                    return;
                }
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
        break MISSING_BLOCK_LABEL_32;
        illegalstateexception;
        throw illegalstateexception;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        try
        {
            if (!mViewDestroyed)
            {
                dismissInternal(true);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            throw dialoginterface;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (mDialog != null)
        {
            Bundle bundle1 = mDialog.onSaveInstanceState();
            if (bundle1 != null)
            {
                try
                {
                    bundle.putBundle(z[5], bundle1);
                }
                // Misplaced declaration of an exception variable
                catch (Bundle bundle)
                {
                    throw bundle;
                }
            }
        }
        try
        {
            if (mStyle != 0)
            {
                bundle.putInt(z[9], mStyle);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (mTheme != 0)
            {
                bundle.putInt(z[7], mTheme);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (!mCancelable)
            {
                bundle.putBoolean(z[6], mCancelable);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (!mShowsDialog)
            {
                bundle.putBoolean(z[4], mShowsDialog);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        try
        {
            if (mBackStackId != -1)
            {
                bundle.putInt(z[8], mBackStackId);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
    }

    public void onStart()
    {
        try
        {
            super.onStart();
            if (mDialog != null)
            {
                mViewDestroyed = false;
                mDialog.show();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void onStop()
    {
        try
        {
            super.onStop();
            if (mDialog != null)
            {
                mDialog.hide();
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void setCancelable(boolean flag)
    {
        try
        {
            mCancelable = flag;
            if (mDialog != null)
            {
                mDialog.setCancelable(flag);
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void setShowsDialog(boolean flag)
    {
        mShowsDialog = flag;
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
        mDismissed = false;
        mShownByMe = true;
        fragmentmanager = fragmentmanager.beginTransaction();
        fragmentmanager.add(this, s);
        fragmentmanager.commit();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[15];
        obj = "\n\036\"Z\177\022 2[l\n\036/Px";
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
                obj = "\n\036\"Z\177\022 2[l\n\036/Px";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\"\026:Ye\0019)Tm\013\0325A*\005\0365\025d\t\013{WoF\036/Ak\005\027>Q*\022\020{T*\005\0205Ak\017\021>G*\020\026>B";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\007\021?Ge\017\033aFk\020\032?qc\007\0234RY\022\036/P";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "\007\021?Ge\017\033aFb\t\b(qc\007\0234R";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\007\021?Ge\017\033aFk\020\032?qc\007\0234RY\022\036/P";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\007\021?Ge\017\033aVk\b\034>Yk\004\023>";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\007\021?Ge\017\033aAb\003\022>";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\007\021?Ge\017\033aWk\005\024\bAk\005\024\022Q";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\007\021?Ge\017\033aF~\037\023>";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                obj = "\007\021?Ge\017\033aAb\003\022>";
                byte0 = 9;
                i = 10;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\007\021?Ge\017\033aWk\005\024\bAk\005\024\022Q";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\007\021?Ge\017\033aF~\037\023>";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\007\021?Ge\017\033aFb\t\b(qc\007\0234R";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\007\021?Ge\017\033aVk\b\034>Yk\004\023>";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_456;
_L3:
        byte byte1 = 10;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 102;
          goto _L9
_L5:
        byte1 = 127;
          goto _L9
_L6:
        byte1 = 91;
          goto _L9
        byte1 = 53;
          goto _L9
    }
}
