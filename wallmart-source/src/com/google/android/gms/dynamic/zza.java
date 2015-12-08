// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzg;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.dynamic:
//            LifecycleDelegate, zzf

public abstract class com.google.android.gms.dynamic.zza
{
    private static interface zza
    {

        public abstract int getState();

        public abstract void zzb(LifecycleDelegate lifecycledelegate);
    }


    private LifecycleDelegate zzamN;
    private Bundle zzamO;
    private LinkedList zzamP;
    private final zzf zzamQ = new zzf() {

        final com.google.android.gms.dynamic.zza zzamR;

        public void zza(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.zza.zza(zzamR, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.zza.zza(zzamR).iterator(); lifecycledelegate.hasNext(); ((zza)lifecycledelegate.next()).zzb(com.google.android.gms.dynamic.zza.zzb(zzamR))) { }
            com.google.android.gms.dynamic.zza.zza(zzamR).clear();
            com.google.android.gms.dynamic.zza.zza(zzamR, null);
        }

            
            {
                zzamR = com.google.android.gms.dynamic.zza.this;
                super();
            }
    };

    public com.google.android.gms.dynamic.zza()
    {
    }

    static Bundle zza(com.google.android.gms.dynamic.zza zza1, Bundle bundle)
    {
        zza1.zzamO = bundle;
        return bundle;
    }

    static LifecycleDelegate zza(com.google.android.gms.dynamic.zza zza1, LifecycleDelegate lifecycledelegate)
    {
        zza1.zzamN = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList zza(com.google.android.gms.dynamic.zza zza1)
    {
        return zza1.zzamP;
    }

    private void zza(Bundle bundle, zza zza1)
    {
        if (zzamN != null)
        {
            zza1.zzb(zzamN);
            return;
        }
        if (zzamP == null)
        {
            zzamP = new LinkedList();
        }
        zzamP.add(zza1);
        if (bundle != null)
        {
            if (zzamO == null)
            {
                zzamO = (Bundle)bundle.clone();
            } else
            {
                zzamO.putAll(bundle);
            }
        }
        zza(zzamQ);
    }

    static LifecycleDelegate zzb(com.google.android.gms.dynamic.zza zza1)
    {
        return zza1.zzamN;
    }

    public static void zzb(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String s1 = zzg.zzb(context, i, GooglePlayServicesUtil.zzaf(context));
        String s = zzg.zzh(context, i);
        LinearLayout linearlayout = new LinearLayout(framelayout.getContext());
        linearlayout.setOrientation(1);
        linearlayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        framelayout.addView(linearlayout);
        framelayout = new TextView(framelayout.getContext());
        framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        framelayout.setText(s1);
        linearlayout.addView(framelayout);
        if (s != null)
        {
            framelayout = new Button(context);
            framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
            framelayout.setText(s);
            linearlayout.addView(framelayout);
            framelayout.setOnClickListener(new android.view.View.OnClickListener(context, i) {

                final int zzamY;
                final Context zzrn;

                public void onClick(View view)
                {
                    zzrn.startActivity(GooglePlayServicesUtil.zzbc(zzamY));
                }

            
            {
                zzrn = context;
                zzamY = i;
                super();
            }
            });
        }
    }

    private void zzei(int i)
    {
        for (; !zzamP.isEmpty() && ((zza)zzamP.getLast()).getState() >= i; zzamP.removeLast()) { }
    }

    public void onCreate(Bundle bundle)
    {
        zza(bundle, new zza(bundle) {

            final com.google.android.gms.dynamic.zza zzamR;
            final Bundle zzamU;

            public int getState()
            {
                return 1;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzamR).onCreate(zzamU);
            }

            
            {
                zzamR = com.google.android.gms.dynamic.zza.this;
                zzamU = bundle;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        zza(bundle, new zza(framelayout, layoutinflater, viewgroup, bundle) {

            final com.google.android.gms.dynamic.zza zzamR;
            final Bundle zzamU;
            final FrameLayout zzamV;
            final LayoutInflater zzamW;
            final ViewGroup zzamX;

            public int getState()
            {
                return 2;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                zzamV.removeAllViews();
                zzamV.addView(com.google.android.gms.dynamic.zza.zzb(zzamR).onCreateView(zzamW, zzamX, zzamU));
            }

            
            {
                zzamR = com.google.android.gms.dynamic.zza.this;
                zzamV = framelayout;
                zzamW = layoutinflater;
                zzamX = viewgroup;
                zzamU = bundle;
                super();
            }
        });
        if (zzamN == null)
        {
            zza(framelayout);
        }
        return framelayout;
    }

    public void onDestroy()
    {
        if (zzamN != null)
        {
            zzamN.onDestroy();
            return;
        } else
        {
            zzei(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if (zzamN != null)
        {
            zzamN.onDestroyView();
            return;
        } else
        {
            zzei(2);
            return;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        zza(bundle1, new zza(activity, bundle, bundle1) {

            final com.google.android.gms.dynamic.zza zzamR;
            final Activity zzamS;
            final Bundle zzamT;
            final Bundle zzamU;

            public int getState()
            {
                return 0;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzamR).onInflate(zzamS, zzamT, zzamU);
            }

            
            {
                zzamR = com.google.android.gms.dynamic.zza.this;
                zzamS = activity;
                zzamT = bundle;
                zzamU = bundle1;
                super();
            }
        });
    }

    public void onLowMemory()
    {
        if (zzamN != null)
        {
            zzamN.onLowMemory();
        }
    }

    public void onPause()
    {
        if (zzamN != null)
        {
            zzamN.onPause();
            return;
        } else
        {
            zzei(5);
            return;
        }
    }

    public void onResume()
    {
        zza(((Bundle) (null)), new zza() {

            final com.google.android.gms.dynamic.zza zzamR;

            public int getState()
            {
                return 5;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzamR).onResume();
            }

            
            {
                zzamR = com.google.android.gms.dynamic.zza.this;
                super();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (zzamN != null)
        {
            zzamN.onSaveInstanceState(bundle);
        } else
        if (zzamO != null)
        {
            bundle.putAll(zzamO);
            return;
        }
    }

    public void onStart()
    {
        zza(((Bundle) (null)), new zza() {

            final com.google.android.gms.dynamic.zza zzamR;

            public int getState()
            {
                return 4;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzamR).onStart();
            }

            
            {
                zzamR = com.google.android.gms.dynamic.zza.this;
                super();
            }
        });
    }

    public void onStop()
    {
        if (zzamN != null)
        {
            zzamN.onStop();
            return;
        } else
        {
            zzei(4);
            return;
        }
    }

    protected void zza(FrameLayout framelayout)
    {
        zzb(framelayout);
    }

    protected abstract void zza(zzf zzf);

    public LifecycleDelegate zzrn()
    {
        return zzamN;
    }
}
