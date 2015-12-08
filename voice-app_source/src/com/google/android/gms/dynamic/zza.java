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
import com.google.android.gms.common.internal.zzf;
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


    private LifecycleDelegate zzajh;
    private Bundle zzaji;
    private LinkedList zzajj;
    private final com.google.android.gms.dynamic.zzf zzajk = new com.google.android.gms.dynamic.zzf() {

        final com.google.android.gms.dynamic.zza zzajl;

        public void zza(LifecycleDelegate lifecycledelegate)
        {
            com.google.android.gms.dynamic.zza.zza(zzajl, lifecycledelegate);
            for (lifecycledelegate = com.google.android.gms.dynamic.zza.zza(zzajl).iterator(); lifecycledelegate.hasNext(); ((zza)lifecycledelegate.next()).zzb(com.google.android.gms.dynamic.zza.zzb(zzajl))) { }
            com.google.android.gms.dynamic.zza.zza(zzajl).clear();
            com.google.android.gms.dynamic.zza.zza(zzajl, null);
        }

            
            {
                zzajl = com.google.android.gms.dynamic.zza.this;
                super();
            }
    };

    public com.google.android.gms.dynamic.zza()
    {
    }

    static Bundle zza(com.google.android.gms.dynamic.zza zza1, Bundle bundle)
    {
        zza1.zzaji = bundle;
        return bundle;
    }

    static LifecycleDelegate zza(com.google.android.gms.dynamic.zza zza1, LifecycleDelegate lifecycledelegate)
    {
        zza1.zzajh = lifecycledelegate;
        return lifecycledelegate;
    }

    static LinkedList zza(com.google.android.gms.dynamic.zza zza1)
    {
        return zza1.zzajj;
    }

    private void zza(Bundle bundle, zza zza1)
    {
        if (zzajh != null)
        {
            zza1.zzb(zzajh);
            return;
        }
        if (zzajj == null)
        {
            zzajj = new LinkedList();
        }
        zzajj.add(zza1);
        if (bundle != null)
        {
            if (zzaji == null)
            {
                zzaji = (Bundle)bundle.clone();
            } else
            {
                zzaji.putAll(bundle);
            }
        }
        zza(zzajk);
    }

    static LifecycleDelegate zzb(com.google.android.gms.dynamic.zza zza1)
    {
        return zza1.zzajh;
    }

    public static void zzb(FrameLayout framelayout)
    {
        Context context = framelayout.getContext();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        String s1 = zzf.zzb(context, i, GooglePlayServicesUtil.zzad(context));
        String s = zzf.zzh(context, i);
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

                final int zzajs;
                final Context zzqV;

                public void onClick(View view)
                {
                    zzqV.startActivity(GooglePlayServicesUtil.zzaT(zzajs));
                }

            
            {
                zzqV = context;
                zzajs = i;
                super();
            }
            });
        }
    }

    private void zzdY(int i)
    {
        for (; !zzajj.isEmpty() && ((zza)zzajj.getLast()).getState() >= i; zzajj.removeLast()) { }
    }

    public void onCreate(Bundle bundle)
    {
        zza(bundle, new zza(bundle) {

            final com.google.android.gms.dynamic.zza zzajl;
            final Bundle zzajo;

            public int getState()
            {
                return 1;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzajl).onCreate(zzajo);
            }

            
            {
                zzajl = com.google.android.gms.dynamic.zza.this;
                zzajo = bundle;
                super();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        FrameLayout framelayout = new FrameLayout(layoutinflater.getContext());
        zza(bundle, new zza(framelayout, layoutinflater, viewgroup, bundle) {

            final com.google.android.gms.dynamic.zza zzajl;
            final Bundle zzajo;
            final FrameLayout zzajp;
            final LayoutInflater zzajq;
            final ViewGroup zzajr;

            public int getState()
            {
                return 2;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                zzajp.removeAllViews();
                zzajp.addView(com.google.android.gms.dynamic.zza.zzb(zzajl).onCreateView(zzajq, zzajr, zzajo));
            }

            
            {
                zzajl = com.google.android.gms.dynamic.zza.this;
                zzajp = framelayout;
                zzajq = layoutinflater;
                zzajr = viewgroup;
                zzajo = bundle;
                super();
            }
        });
        if (zzajh == null)
        {
            zza(framelayout);
        }
        return framelayout;
    }

    public void onDestroy()
    {
        if (zzajh != null)
        {
            zzajh.onDestroy();
            return;
        } else
        {
            zzdY(1);
            return;
        }
    }

    public void onDestroyView()
    {
        if (zzajh != null)
        {
            zzajh.onDestroyView();
            return;
        } else
        {
            zzdY(2);
            return;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle1)
    {
        zza(bundle1, new zza(activity, bundle, bundle1) {

            final com.google.android.gms.dynamic.zza zzajl;
            final Activity zzajm;
            final Bundle zzajn;
            final Bundle zzajo;

            public int getState()
            {
                return 0;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzajl).onInflate(zzajm, zzajn, zzajo);
            }

            
            {
                zzajl = com.google.android.gms.dynamic.zza.this;
                zzajm = activity;
                zzajn = bundle;
                zzajo = bundle1;
                super();
            }
        });
    }

    public void onLowMemory()
    {
        if (zzajh != null)
        {
            zzajh.onLowMemory();
        }
    }

    public void onPause()
    {
        if (zzajh != null)
        {
            zzajh.onPause();
            return;
        } else
        {
            zzdY(5);
            return;
        }
    }

    public void onResume()
    {
        zza(((Bundle) (null)), new zza() {

            final com.google.android.gms.dynamic.zza zzajl;

            public int getState()
            {
                return 5;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzajl).onResume();
            }

            
            {
                zzajl = com.google.android.gms.dynamic.zza.this;
                super();
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (zzajh != null)
        {
            zzajh.onSaveInstanceState(bundle);
        } else
        if (zzaji != null)
        {
            bundle.putAll(zzaji);
            return;
        }
    }

    public void onStart()
    {
        zza(((Bundle) (null)), new zza() {

            final com.google.android.gms.dynamic.zza zzajl;

            public int getState()
            {
                return 4;
            }

            public void zzb(LifecycleDelegate lifecycledelegate)
            {
                com.google.android.gms.dynamic.zza.zzb(zzajl).onStart();
            }

            
            {
                zzajl = com.google.android.gms.dynamic.zza.this;
                super();
            }
        });
    }

    public void onStop()
    {
        if (zzajh != null)
        {
            zzajh.onStop();
            return;
        } else
        {
            zzdY(4);
            return;
        }
    }

    protected void zza(FrameLayout framelayout)
    {
        zzb(framelayout);
    }

    protected abstract void zza(com.google.android.gms.dynamic.zzf zzf1);

    public LifecycleDelegate zzqj()
    {
        return zzajh;
    }
}
