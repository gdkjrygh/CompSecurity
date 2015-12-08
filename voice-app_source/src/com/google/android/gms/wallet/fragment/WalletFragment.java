// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.dynamic.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqy;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentInitParams, WalletFragmentStyle

public final class WalletFragment extends Fragment
{
    public static interface OnStateChangedListener
    {

        public abstract void onStateChanged(WalletFragment walletfragment, int i, int j, Bundle bundle);
    }

    static class zza extends com.google.android.gms.internal.zzqr.zza
    {

        private OnStateChangedListener zzaSf;
        private final WalletFragment zzaSg;

        public void zza(int i, int j, Bundle bundle)
        {
            if (zzaSf != null)
            {
                zzaSf.onStateChanged(zzaSg, i, j, bundle);
            }
        }

        public void zza(OnStateChangedListener onstatechangedlistener)
        {
            zzaSf = onstatechangedlistener;
        }

        zza(WalletFragment walletfragment)
        {
            zzaSg = walletfragment;
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

        final WalletFragment zzaSh;

        public void onClick(View view)
        {
            view = WalletFragment.zza(zzaSh).getActivity();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(view), view, -1);
        }

        protected void zza(FrameLayout framelayout)
        {
            Button button = new Button(WalletFragment.zza(zzaSh).getActivity());
            button.setText(com.google.android.gms.R.string.wallet_buy_button_place_holder);
            byte byte0 = -1;
            byte byte1 = -2;
            int j = byte1;
            int i = byte0;
            if (com.google.android.gms.wallet.fragment.WalletFragment.zze(zzaSh) != null)
            {
                WalletFragmentStyle walletfragmentstyle = com.google.android.gms.wallet.fragment.WalletFragment.zze(zzaSh).getFragmentStyle();
                j = byte1;
                i = byte0;
                if (walletfragmentstyle != null)
                {
                    android.util.DisplayMetrics displaymetrics = WalletFragment.zza(zzaSh).getResources().getDisplayMetrics();
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
            Object obj = WalletFragment.zza(zzaSh).getActivity();
            if (com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaSh) == null && WalletFragment.zzc(zzaSh) && obj != null)
            {
                try
                {
                    obj = zzqy.zza(((Activity) (obj)), WalletFragment.zzd(zzaSh), com.google.android.gms.wallet.fragment.WalletFragment.zze(zzaSh), com.google.android.gms.wallet.fragment.WalletFragment.zzf(zzaSh));
                    WalletFragment.zza(zzaSh, new zzb(((zzqq) (obj))));
                    WalletFragment.zza(zzaSh, null);
                }
                // Misplaced declaration of an exception variable
                catch (zzf zzf1)
                {
                    return;
                }
                zzf1.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaSh));
                if (WalletFragment.zzg(zzaSh) != null)
                {
                    zzb.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaSh), WalletFragment.zzg(zzaSh));
                    WalletFragment.zza(zzaSh, null);
                }
                if (WalletFragment.zzh(zzaSh) != null)
                {
                    zzb.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaSh), WalletFragment.zzh(zzaSh));
                    WalletFragment.zza(zzaSh, null);
                }
                if (WalletFragment.zzi(zzaSh) != null)
                {
                    zzb.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaSh), WalletFragment.zzi(zzaSh));
                    WalletFragment.zza(zzaSh, null);
                }
                if (WalletFragment.zzj(zzaSh) != null)
                {
                    zzb.zza(com.google.android.gms.wallet.fragment.WalletFragment.zzb(zzaSh), WalletFragment.zzj(zzaSh).booleanValue());
                    WalletFragment.zza(zzaSh, null);
                }
            }
        }

        private zzc()
        {
            zzaSh = WalletFragment.this;
            super();
        }

    }


    private boolean mCreated;
    private WalletFragmentOptions zzaRS;
    private WalletFragmentInitParams zzaRT;
    private MaskedWalletRequest zzaRU;
    private MaskedWallet zzaRV;
    private Boolean zzaRW;
    private zzb zzaSb;
    private final com.google.android.gms.dynamic.zzb zzaSc = com.google.android.gms.dynamic.zzb.zza(this);
    private final zzc zzaSd = new zzc();
    private zza zzaSe;
    private final Fragment zzajt = this;

    public WalletFragment()
    {
        mCreated = false;
        zzaSe = new zza(this);
    }

    public static WalletFragment newInstance(WalletFragmentOptions walletfragmentoptions)
    {
        WalletFragment walletfragment = new WalletFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extraWalletFragmentOptions", walletfragmentoptions);
        walletfragment.zzajt.setArguments(bundle);
        return walletfragment;
    }

    static Fragment zza(WalletFragment walletfragment)
    {
        return walletfragment.zzajt;
    }

    static MaskedWallet zza(WalletFragment walletfragment, MaskedWallet maskedwallet)
    {
        walletfragment.zzaRV = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest zza(WalletFragment walletfragment, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragment.zzaRU = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static zzb zza(WalletFragment walletfragment, zzb zzb1)
    {
        walletfragment.zzaSb = zzb1;
        return zzb1;
    }

    static WalletFragmentInitParams zza(WalletFragment walletfragment, WalletFragmentInitParams walletfragmentinitparams)
    {
        walletfragment.zzaRT = walletfragmentinitparams;
        return walletfragmentinitparams;
    }

    static WalletFragmentOptions zza(WalletFragment walletfragment, WalletFragmentOptions walletfragmentoptions)
    {
        walletfragment.zzaRS = walletfragmentoptions;
        return walletfragmentoptions;
    }

    static Boolean zza(WalletFragment walletfragment, Boolean boolean1)
    {
        walletfragment.zzaRW = boolean1;
        return boolean1;
    }

    static zzb zzb(WalletFragment walletfragment)
    {
        return walletfragment.zzaSb;
    }

    static boolean zzc(WalletFragment walletfragment)
    {
        return walletfragment.mCreated;
    }

    static com.google.android.gms.dynamic.zzb zzd(WalletFragment walletfragment)
    {
        return walletfragment.zzaSc;
    }

    static WalletFragmentOptions zze(WalletFragment walletfragment)
    {
        return walletfragment.zzaRS;
    }

    static zza zzf(WalletFragment walletfragment)
    {
        return walletfragment.zzaSe;
    }

    static WalletFragmentInitParams zzg(WalletFragment walletfragment)
    {
        return walletfragment.zzaRT;
    }

    static MaskedWalletRequest zzh(WalletFragment walletfragment)
    {
        return walletfragment.zzaRU;
    }

    static MaskedWallet zzi(WalletFragment walletfragment)
    {
        return walletfragment.zzaRV;
    }

    static Boolean zzj(WalletFragment walletfragment)
    {
        return walletfragment.zzaRW;
    }

    public int getState()
    {
        if (zzaSb != null)
        {
            return zzb.zza(zzaSb);
        } else
        {
            return 0;
        }
    }

    public void initialize(WalletFragmentInitParams walletfragmentinitparams)
    {
        if (zzaSb != null)
        {
            zzb.zza(zzaSb, walletfragmentinitparams);
            zzaRT = null;
        } else
        if (zzaRT == null)
        {
            zzaRT = walletfragmentinitparams;
            if (zzaRU != null)
            {
                Log.w("WalletFragment", "updateMaskedWalletRequest() was called before initialize()");
            }
            if (zzaRV != null)
            {
                Log.w("WalletFragment", "updateMaskedWallet() was called before initialize()");
                return;
            }
        } else
        {
            Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once. Ignoring.");
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (zzaSb != null)
        {
            zzb.zza(zzaSb, i, j, intent);
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
                Log.w("WalletFragment", "initialize(WalletFragmentInitParams) was called more than once.Ignoring.");
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
        zzaSd.onCreate(bundle);
        return;
_L2:
        if (zzajt.getArguments() != null)
        {
            WalletFragmentOptions walletfragmentoptions = (WalletFragmentOptions)zzajt.getArguments().getParcelable("extraWalletFragmentOptions");
            if (walletfragmentoptions != null)
            {
                walletfragmentoptions.zzaL(zzajt.getActivity());
                zzaRS = walletfragmentoptions;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return zzaSd.onCreateView(layoutinflater, viewgroup, bundle);
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
        zzaSd.onInflate(activity, attributeset, bundle);
    }

    public void onPause()
    {
        super.onPause();
        zzaSd.onPause();
    }

    public void onResume()
    {
        super.onResume();
        zzaSd.onResume();
        FragmentManager fragmentmanager = zzajt.getActivity().getFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("GooglePlayServicesErrorDialog");
        if (fragment != null)
        {
            fragmentmanager.beginTransaction().remove(fragment).commit();
            GooglePlayServicesUtil.showErrorDialogFragment(GooglePlayServicesUtil.isGooglePlayServicesAvailable(zzajt.getActivity()), zzajt.getActivity(), -1);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.setClassLoader(com/google/android/gms/wallet/fragment/WalletFragmentOptions.getClassLoader());
        zzaSd.onSaveInstanceState(bundle);
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
        zzaSd.onStart();
    }

    public void onStop()
    {
        super.onStop();
        zzaSd.onStop();
    }

    public void setEnabled(boolean flag)
    {
        if (zzaSb != null)
        {
            zzb.zza(zzaSb, flag);
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
        zzaSe.zza(onstatechangedlistener);
    }

    public void updateMaskedWallet(MaskedWallet maskedwallet)
    {
        if (zzaSb != null)
        {
            zzb.zza(zzaSb, maskedwallet);
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
        if (zzaSb != null)
        {
            zzb.zza(zzaSb, maskedwalletrequest);
            zzaRU = null;
            return;
        } else
        {
            zzaRU = maskedwalletrequest;
            return;
        }
    }
}
