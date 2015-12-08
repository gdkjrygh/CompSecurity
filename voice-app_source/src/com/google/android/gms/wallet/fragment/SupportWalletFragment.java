// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.dynamic.zzh;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqy;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class SupportWalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {

        public abstract void onStateChanged(SupportWalletFragment supportwalletfragment, int i, int j, Bundle bundle);
    }

    static class zza extends com.google.android.gms.internal.zzqr.zza
    {

        private OnStateChangedListener zzaRX;
        private final SupportWalletFragment zzaRY;

        public void zza(int i, int j, Bundle bundle)
        {
            if (zzaRX != null)
            {
                zzaRX.onStateChanged(zzaRY, i, j, bundle);
            }
        }

        public void zza(OnStateChangedListener onstatechangedlistener)
        {
            zzaRX = onstatechangedlistener;
        }

        zza(SupportWalletFragment supportwalletfragment)
        {
            zzaRY = supportwalletfragment;
        }
    }

    private static class zzb
        implements LifecycleDelegate
    {

        private final zzqq zzaRZ;

        private int getState()
        {
            int i;
            try
            {
                i = zzaRZ.getState();
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
            return i;
        }

        private void initialize(WalletFragmentInitParams walletfragmentinitparams)
        {
            try
            {
                zzaRZ.initialize(walletfragmentinitparams);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WalletFragmentInitParams walletfragmentinitparams)
            {
                throw new RuntimeException(walletfragmentinitparams);
            }
        }

        private void onActivityResult(int i, int j, Intent intent)
        {
            try
            {
                zzaRZ.onActivityResult(i, j, intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw new RuntimeException(intent);
            }
        }

        private void setEnabled(boolean flag)
        {
            try
            {
                zzaRZ.setEnabled(flag);
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        private void updateMaskedWallet(MaskedWallet maskedwallet)
        {
            try
            {
                zzaRZ.updateMaskedWallet(maskedwallet);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MaskedWallet maskedwallet)
            {
                throw new RuntimeException(maskedwallet);
            }
        }

        private void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            try
            {
                zzaRZ.updateMaskedWalletRequest(maskedwalletrequest);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (MaskedWalletRequest maskedwalletrequest)
            {
                throw new RuntimeException(maskedwalletrequest);
            }
        }

        static int zza(zzb zzb1)
        {
            return zzb1.getState();
        }

        static void zza(zzb zzb1, int i, int j, Intent intent)
        {
            zzb1.onActivityResult(i, j, intent);
        }

        static void zza(zzb zzb1, MaskedWallet maskedwallet)
        {
            zzb1.updateMaskedWallet(maskedwallet);
        }

        static void zza(zzb zzb1, MaskedWalletRequest maskedwalletrequest)
        {
            zzb1.updateMaskedWalletRequest(maskedwalletrequest);
        }

        static void zza(zzb zzb1, WalletFragmentInitParams walletfragmentinitparams)
        {
            zzb1.initialize(walletfragmentinitparams);
        }

        static void zza(zzb zzb1, boolean flag)
        {
            zzb1.setEnabled(flag);
        }

        public void onCreate(Bundle bundle)
        {
            try
            {
                zzaRZ.onCreate(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeException(bundle);
            }
        }

        public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            try
            {
                layoutinflater = (View)com.google.android.gms.dynamic.zze.zzn(zzaRZ.onCreateView(com.google.android.gms.dynamic.zze.zzw(layoutinflater), com.google.android.gms.dynamic.zze.zzw(viewgroup), bundle));
            }
            // Misplaced declaration of an exception variable
            catch (LayoutInflater layoutinflater)
            {
                throw new RuntimeException(layoutinflater);
            }
            return layoutinflater;
        }

        public void onDestroy()
        {
        }

        public void onDestroyView()
        {
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
        {
            bundle = (WalletFragmentOptions)bundle.getParcelable("extraWalletFragmentOptions");
            try
            {
                zzaRZ.zza(com.google.android.gms.dynamic.zze.zzw(activity), bundle, bundle1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                throw new RuntimeException(activity);
            }
        }

        public void onLowMemory()
        {
        }

        public void onPause()
        {
            try
            {
                zzaRZ.onPause();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void onResume()
        {
            try
            {
                zzaRZ.onResume();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void onSaveInstanceState(Bundle bundle)
        {
            try
            {
                zzaRZ.onSaveInstanceState(bundle);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw new RuntimeException(bundle);
            }
        }

        public void onStart()
        {
            try
            {
                zzaRZ.onStart();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        public void onStop()
        {
            try
            {
                zzaRZ.onStop();
                return;
            }
            catch (RemoteException remoteexception)
            {
                throw new RuntimeException(remoteexception);
            }
        }

        private zzb(zzqq zzqq1)
        {
            zzaRZ = zzqq1;
        }

    }

    private class zzc extends com.google.android.gms.dynamic.zza
        implements android.view.View.OnClickListener
    {

        final SupportWalletFragment zzaSa;

        public void onClick(View view)
        {
            view = SupportWalletFragment.zza(zzaSa).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        protected void zza(FrameLayout framelayout)
        {
            Button button = new Button(SupportWalletFragment.zza(zzaSa).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int j = byte1;
            int i = byte0;
            if (com.google.android.gms.wallet.fragment.SupportWalletFragment.zze(zzaSa) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.SupportWalletFragment.zze(zzaSa).getFragmentStyle();
                j = byte1;
                i = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = SupportWalletFragment.zza(zzaSa).getResources().getDisplayMetrics();
                    i = walletfragmentstyle.zza("buyButtonWidth", displaymetrics, -1);
                    j = walletfragmentstyle.zza("buyButtonHeight", displaymetrics, -2);
                }
            }
            button.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, j));
            button.setOnClickListener(this);
            framelayout.addView(button);
        }

        protected void zza(zzf zzf1)
        {
            Object obj = SupportWalletFragment.zza(zzaSa).getActivity();
            if (SupportWalletFragment.zzb(zzaSa) == null && SupportWalletFragment.zzc(zzaSa) && obj != null)
            {
                try
                {
                    obj = zzqy.zza(((Activity) (obj)), SupportWalletFragment.zzd(zzaSa), com.google.android.gms.wallet.fragment.SupportWalletFragment.zze(zzaSa), com.google.android.gms.wallet.fragment.SupportWalletFragment.zzf(zzaSa));
                    SupportWalletFragment.zza(zzaSa, new zzb(((zzqq) (obj))));
                    SupportWalletFragment.zza(zzaSa, null);
                }
                // Misplaced declaration of an exception variable
                catch (zzf zzf1)
                {
                    return;
                }
                zzf1.zza(SupportWalletFragment.zzb(zzaSa));
                if (SupportWalletFragment.zzg(zzaSa) != null)
                {
                    zzb.zza(SupportWalletFragment.zzb(zzaSa), SupportWalletFragment.zzg(zzaSa));
                    SupportWalletFragment.zza(zzaSa, null);
                }
                if (com.google.android.gms.wallet.fragment.SupportWalletFragment.zzh(zzaSa) != null)
                {
                    zzb.zza(SupportWalletFragment.zzb(zzaSa), com.google.android.gms.wallet.fragment.SupportWalletFragment.zzh(zzaSa));
                    SupportWalletFragment.zza(zzaSa, null);
                }
                if (SupportWalletFragment.zzi(zzaSa) != null)
                {
                    zzb.zza(SupportWalletFragment.zzb(zzaSa), SupportWalletFragment.zzi(zzaSa));
                    SupportWalletFragment.zza(zzaSa, null);
                }
                if (SupportWalletFragment.zzj(zzaSa) != null)
                {
                    zzb.zza(SupportWalletFragment.zzb(zzaSa), SupportWalletFragment.zzj(zzaSa).booleanValue());
                    SupportWalletFragment.zza(zzaSa, null);
                }
            }
        }

        private zzc()
        {
            zzaSa = SupportWalletFragment.this;
            super();
        }

    }


    private boolean mCreated;
    private final Fragment zzZX = this;
    private zzb zzaRO;
    private final zzh zzaRP = com.google.android.gms.dynamic.zzh.zza(this);
    private final zzc zzaRQ = new zzc();
    private zza zzaRR;
    private WalletFragmentOptions zzaRS;
    private WalletFragmentInitParams zzaRT;
    private MaskedWalletRequest zzaRU;
    private MaskedWallet zzaRV;
    private Boolean zzaRW;

    public SupportWalletFragment()
    {
        mCreated = false;
        zzaRR = new zza(this);
    }

    public static SupportWalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        SupportWalletFragment supportwalletfragment = new SupportWalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        supportwalletfragment.zzZX.setArguments(bundle);
        return supportwalletfragment;
    }

    static Fragment zza(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzZX;
    }

    static MaskedWallet zza(SupportWalletFragment supportwalletfragment, MaskedWallet maskedwallet)
    {
        supportwalletfragment.zzaRV = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest zza(SupportWalletFragment supportwalletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        supportwalletfragment.zzaRU = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static zzb zza(SupportWalletFragment supportwalletfragment, zzb zzb1)
    {
        supportwalletfragment.zzaRO = zzb1;
        return zzb1;
    }

    static WalletFragmentInitParams zza(SupportWalletFragment supportwalletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        supportwalletfragment.zzaRT = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions zza(SupportWalletFragment supportwalletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        supportwalletfragment.zzaRS = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean zza(SupportWalletFragment supportwalletfragment, Boolean boolean1)
    {
        supportwalletfragment.zzaRW = boolean1;
        return boolean1;
    }

    static zzb zzb(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaRO;
    }

    static boolean zzc(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.mCreated;
    }

    static zzh zzd(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaRP;
    }

    static WalletFragmentOptions zze(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaRS;
    }

    static zza zzf(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaRR;
    }

    static WalletFragmentInitParams zzg(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaRT;
    }

    static MaskedWalletRequest zzh(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaRU;
    }

    static MaskedWallet zzi(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaRV;
    }

    static Boolean zzj(SupportWalletFragment supportwalletfragment)
    {
        return supportwalletfragment.zzaRW;
    }

    public int getState()
    {
        if (zzaRO != null)
        {
            return zzb.zza(zzaRO);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (zzaRO != null)
        {
            zzb.zza(zzaRO, walletfragmentinitparams);
            zzaRT = null;
        } else
        if (zzaRT == null)
        {
            zzaRT = walletfragmentinitparams;
            if (zzaRU != null)
            {
                Log.w("SupportWalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (zzaRV != null)
            {
                Log.w("SupportWalletFragment", "updateMaskedWallet() was called before initialize()");
                return;
            }
        } else
        {
            Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (zzaRO != null)
        {
            zzb.zza(zzaRO, i, j, intent);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        WalletFragmentInitParams walletfragmentinitparams = (WalletFragmentInitParams)bundle.getParcelable("walletFragmentInitParams");
        if (walletfragmentinitparams != null)
        {
            if (zzaRT != null)
            {
                Log.w("SupportWalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
            }
            zzaRT = walletfragmentinitparams;
        }
        if (zzaRU == null)
        {
            zzaRU = (MaskedWalletRequest)bundle.getParcelable("maskedWalletRequest");
        }
        if (zzaRV == null)
        {
            zzaRV = (MaskedWallet)bundle.getParcelable("maskedWallet");
        }
        if (bundle.containsKey("walletFragmentOptions"))
        {
            zzaRS = (WalletFragmentOptions)bundle.getParcelable("walletFragmentOptions");
        }
        if (bundle.containsKey("enabled"))
        {
            zzaRW = Boolean.valueOf(bundle.getBoolean("enabled"));
        }
_L4:
        mCreated = true;
        zzaRQ.onCreate(bundle);
        return;
_L2:
        if (zzZX.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)zzZX.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.zzaL(zzZX.getActivity());
                zzaRS = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzaRQ.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        mCreated = false;
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        if (zzaRS == null)
        {
            zzaRS = WalletFragmentOptions.zza(activity, attributeset);
        }
        attributeset = new Bundle();
        attributeset.putParcelable("attrKeyWalletFragmentOptions", zzaRS);
        zzaRQ.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        zzaRQ.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaRQ.onResume();
        FragmentManager fragmentmanager = zzZX.getActivity().getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(zzZX.getActivity()), zzZX.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        zzaRQ.onSaveInstanceState(bundle);
        if (zzaRT != null)
        {
            bundle.putParcelable("walletFragmentInitParams", zzaRT);
            zzaRT = null;
        }
        if (zzaRU != null)
        {
            bundle.putParcelable("maskedWalletRequest", zzaRU);
            zzaRU = null;
        }
        if (zzaRV != null)
        {
            bundle.putParcelable("maskedWallet", zzaRV);
            zzaRV = null;
        }
        if (zzaRS != null)
        {
            bundle.putParcelable("walletFragmentOptions", zzaRS);
            zzaRS = null;
        }
        if (zzaRW != null)
        {
            bundle.putBoolean("enabled", zzaRW.booleanValue());
            zzaRW = null;
        }
    }

    public void onStart()
    {
        super.onStart();
        zzaRQ.onStart();
    }

    public void onStop()
    {
        super.onStop();
        zzaRQ.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (zzaRO != null)
        {
            zzb.zza(zzaRO, flag);
            zzaRW = null;
            return;
        } else
        {
            zzaRW = Boolean.valueOf(flag);
            return;
        }
    }

    public void setOnStateChangedListener(OnStateChangedListener onstatechangedlistener)
    {
        zzaRR.zza(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if (zzaRO != null)
        {
            zzb.zza(zzaRO, maskedwallet);
            zzaRV = null;
            return;
        } else
        {
            zzaRV = maskedwallet;
            return;
        }
    }

    public void updateMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        if (zzaRO != null)
        {
            zzb.zza(zzaRO, maskedwalletrequest);
            zzaRU = null;
            return;
        } else
        {
            zzaRU = maskedwalletrequest;
            return;
        }
    }
}
